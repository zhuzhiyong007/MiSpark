<script type="text/javascript">
$(function(){
	var ctxMenu = $('#ctxMenu1');
	var tree = $('#tree1');
	tree.mac('dtree', {
		treeConfig: {
			title: 'All Regions',
			rootVisible: true
		},
		ctxMenu: ctxMenu,
		menuOffset: { x: 0, y: 0 },
		doInsert: function(dt, callback){
			var d = dt.data;
			d.level = d.level?d.level:0;
			var p = { level: 1, path: '/', parent: 'root' };
			if(d.level>0){
				p.parent = d.key;
				p.level = d.level + 1;
				if(d.level==1){
					p.path = '/'+ d.key + '/';
				}else{
					p.path = d.path + d.key + '/';
				}
				p.value = d.value;
			}
			App.open({
				action: 'editRegion',
				title: 'Add Region',
				modal: true,
				params: p
			}, function(dd){
				callback(dd);
				//dt.deactivate();
				//dt.activate();
			});
		},
		doUpdate: function(dt, callback){
			var d = dt.data;
			App.open({
				action: 'editRegion',
				title: 'Edit Region',
				modal: true,
				params: d
			}, function(dd){
				callback(dd);
			});
		},
		doDelete: function(dt, callback){
			App.confirm('Are you sure you want to delete?', function(){
				App.alert('Delete is not allowed in this demo.')
//				var p = { id: dt.data.key, level: dt.data.level };
//				$.post('delete.php', p, function(data){
//					var ro = App.eval(data);
//					if(ro.success){
//						App.alert(Msg.info.success, [ Msg.del ]);
//						callback();
//						var tx = tree.getNode(dt.data.parent);
//						tx.activate();
//					}else{
//						App.alert(ro.data, ro.params);
//					}
//				});
			});
		},
		loader: {
			url: '/javascript/dtree/list.php',
			params: { key: 'root' },
			autoLoad: true
		},
		onCtxMenu: function(el){
			var d = el.prop('dtnode').data;
			ctxMenu.enableContextMenuItems();
			if(!d.level){
				ctxMenu.disableContextMenuItems('update,delete');
			}
		}
	});
	$('.demoSource').val($('#demo').html());
	App.setLanguage();
});
</script>