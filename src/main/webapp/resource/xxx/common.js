
var common_table;
//var baseUrl = $("#baseUrl").val();
function searchCommonTable() {
	if (common_table == null) {
		searchWholesaleOrderTable();
	} else {
		common_table.fnPageChange(0);
	}
}
function searchWholesaleOrderTable() {
	common_table = $("#dtbs-ex").dataTable({
		"bFilter" : false,
		"bSort" : false,
		"bProcessing" : false,
		"sAjaxSource" : '/common/list',
		"fnServerParams" : function(aoData) {
			aoData.push( );
		},
		"sServerMethod" : "POST",
		"bServerSide" : true,
		"fnServerData" : function(sSource, aoData, fnCallback) {
			$.ajax({
				"dataType" : 'json',
				"type" : "POST",
				"url" : sSource,
				"data" : aoData,
				"success" : fnCallback,
				"timeout" : 20000, // 连接超时时间
				"error" : function handleAjaxError(xhr, textStatus, error) {
//					if (textStatus === "timeout") {
//						$.dopErr("连接超时!请稍后再试!!!");
//					} else if (textStatus == "error") {
//						$.dopErr("系统繁忙!!!,请稍后再试!!!", null);
//					}
//					$('#wholesale_order_table').dataTable().fnProcessingIndicator(false);
					// 这里是把"正在查询几个子去掉，(换成自己的id)
				},
				beforeSend: function(){
//					$("#btnSearch").attr("disabled","disabled");
//					$("#btnSearch").removeClass("blue");
//					$("#btnSearch").addClass("gray");
//					$("#btnSearch").html("<i class='icon-search'></i> 查询中");
				},
				complete: function(){
//					$("#btnSearch").removeAttr("disabled");
//					$("#btnSearch").removeClass("gray");
//					$("#btnSearch").addClass("blue");
//					$("#btnSearch").html("<i class='icon-search'></i> 查询");
				}
			});
		},
		"aoColumns" : [
		{
			"mData" : "id", // id编号
			"bSortable" : false,
			"sClass" : "text-center",
			"mRender" : function(data, type, full) {// 格式化数据
				return '<input type="radio"  value="' + data + '" />';
			}
		}, {
			"mData" : "userName",
			"bSortable" : false
		}, {
			"mData" : "passWord",
			"bSortable" : false
		}, {
			"mData" : "createTime",
			"bSortable" : false
		} ],
		"aoColumnDefs" : [{
			sDefaultContent : '',
			aTargets : ['_all']
		}],
		"aaSorting" : [[4, 'desc']],
		"oLanguage" : {
			"sLengthMenu" : "每页显示 _MENU_ 条记录",
			"sZeroRecords" : "抱歉， 没有找到",
			"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
			"sInfoEmpty" : "",
			"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
			"oPaginate" : {
				"sFirst" : "首页",
				"sPrevious" : "前一页",
				"sNext" : "后一页",
				"sLast" : "尾页"
			}
		},
		"aLengthMenu" : [// 页面显示条数的设置
		[  10, 20], // 这里传到后台的值。
		[ 10, 20] // 这里在前台显示的值。
		],
		"iDisplayLength" : 10, // 这里是默认显示条数。
//		"sPaginationType" : "bootstrap" // 分页导行栏的显示风格。
	});
};


$(function() {
	searchCommonTable();
});
