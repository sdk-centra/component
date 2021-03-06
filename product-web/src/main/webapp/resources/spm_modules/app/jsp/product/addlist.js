define('app/jsp/product/addlist', function (require, exports, module) {
    'use strict';
    var $=require('jquery'),
	    Widget = require('arale-widget/1.2.0/widget'),
	    Dialog = require("optDialog/src/dialog"),
//	    Paging = require('paging/0.0.1/paging-debug'),
	    AjaxController = require('opt-ajax/1.0.0/index');
    require("jsviews/jsrender.min");
    require("jsviews/jsviews.min");
    require("my97DatePicker/WdatePicker");
    require("bootstrap-paginator/bootstrap-paginator.min");
    require("app/util/jsviews-ext");
    require("opt-paging/aiopt.pagination");

    var SendMessageUtil = require("app/util/sendMessage");
    
    //实例化AJAX控制处理对象
    var ajaxController = new AjaxController();
//    var clickId = "";
    //定义页面组件类
    var addlistPager = Widget.extend({
    	
    	Implements:SendMessageUtil,
    	//属性，使用时由类的构造函数传入
    	attrs: {
    		clickId:""
    	},
    	Statics: {
    		DEFAULT_PAGE_SIZE: 10
    	},
    	//事件代理
    	events: {
    		"click #refuseReasonCloseImg":"_closeEditDiv",
    		"click #refuseReasonBtn":"_closeEditDiv",
    		//查询
            "click #selectProductList":"_selectProductList"
            },
    	//重写父类
    	setup: function () {
			addlistPager.superclass.setup.call(this);
    		this._selectProductList();
    	},
    	
    	// 改变商品类目
    	_selectChange:function(osel){
    		var prodCatId = osel.options[osel.selectedIndex].value;
    		var clickId = $(osel).parent().attr('id');
    		//获取当前ID的最后数字
    		var index = Number(clickId.substring(10))+1;
    		//获取下拉菜单的总个数
    		var prodCat = document.getElementById("data1ProdCat");
    		var length = prodCat.getElementsByTagName("select").length;
    		//从当前元素开始移除后面的下拉菜单
    		for(var i=index;i<length;i++){
    			$("#productCat"+i).remove();
    		}
    		
    		//若为全部,则不查询.
			if (prodCatId === '')
				return;
			
    		ajaxController.ajax({
				type: "post",
				processing: false,
				// message: "加载中，请等待...",
				url: _base+"/cat/query/child",
				data:{"prodCatId":prodCatId},
				success: function(data){
					if(data != null && data !== 'undefined' && data.data.length>0){
	            		var template = $.templates("#prodCatTemple");
	            	    var htmlOutput = template.render(data.data);
	            	    $("#"+clickId).after(htmlOutput);
	            	}else {
	            		var d = Dialog({
							content:"获取类目信息出错",
							icon:'fail',
							okValue: '确 定',
							title: '提示',
							ok:function(){
								this.close();
							}
						});
						d.show();
	            	}
				}
			});
    	},
    	
    	
    	//查询商品列表
    	_selectProductList:function(){
    		var _this = this;
//    		var div = document.getElementById("data1ProdCat");
    		var length = document.getElementsByTagName("select").length-3;
    		var productCatId = $("#productCat"+length+" option:selected").val();
    		var productType = $("#productType").val().trim();
    		var standedProdId = $("#standedProdId").val().trim();
    		var productName = $("#productName").val().trim();
    		var state = $("#state").val().trim();
    		
    		$("#pagination-ul").runnerPagination({
	 			url: _base+"/prodquery/getProductList",
	 			method: "POST",
	 			dataType: "json",
	 			renderId:"searchNormProductData",
	 			messageId:"showMessageDiv",
	 			data: {"productCatId":productCatId,"productType":productType,"standedProdId":standedProdId,"productName":productName,
		 			"state":state},
	 			
	           	pageSize: addlistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	            render: function (data) {
	            	if(data != null && data !== 'undefined' && data.length>0){
	            		var template = $.templates("#searchNormProductTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchNormProductData").html(htmlOutput);
	            	}
	            	_this._returnTop();
	            }
    		});
    	},
    	
    	//弹出原因框
    	_showReason:function(prodId){
//    		var _this = this;
			//后台获取数据,
			ajaxController.ajax({
				type: "get",
				processing: true,
				message: "数据获取中,请等待...",
				url: _base+"/prodquery/toViewReason/"+prodId,
				success: function(data){
					//获取数据成功
					if("1"===data.statusCode){
						var reason= data.data.refuseDes;
						var reasonHtml="<textarea id=\"refuseDes\" name=\"refuseDes\" " +
								"style=\"width:270px;height:160px;overflow:hidden; resize:none;\" readOnly=\"true\">";
						reasonHtml += reason+"</textarea>";
						new Dialog({
							content:reasonHtml,
							okValue: '确 定',
							title:'商品拒绝原因',
							ok:function(){
								this.close();
							}
						}).show();
						
						//this._showSuccessMsg(jkjkj);
						/*var reason= data.data;
						$("#refuseDes").val(reason.refuseDes);

						$('#eject-mask').fadeIn(100);
						$('#refuseReason-samll').slideDown(200);*/
					}
				}
			});

		},
		
		//关闭编辑页面弹出
		_closeEditDiv:function(){
			$('#eject-mask').fadeOut(100);
			$('#refuseReason-samll').slideUp(150);
			//清空数据
			$("#refuseDes").val("");
		},
		 //显示信息
        _showSuccessMsg:function(msg){
            var d = Dialog({
                content:msg,
                okValue: '确 定',
                title: '提示',
                ok:function(){
                    this.close();
                }
            });
            d.show();
        },
    	//滚动到顶部
    	_returnTop:function(){
    		var container = $('.wrapper-right');
    		container.scrollTop(0);//滚动到div 顶部
    	},
    	
    });
    
    module.exports = addlistPager;
});
