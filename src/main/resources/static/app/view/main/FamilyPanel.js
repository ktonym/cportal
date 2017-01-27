/**
 * Created by anthony.kipkoech on 1/27/2017.
 */
Ext.define('ClientPortal.view.main.FamilyPanel',{
    extend: 'Ext.tab.Panel',
    alias: 'widget.family-panel',
    //requires: ['ClientPortal.view.main.MemberList'],
    bind: {
        title: '{current.principal.fullName}'
    },

    items: [
        {
            xtype: 'member-list',
            title: 'Beneficiaries',
            iconCls: 'x-fa fa-users'
        }
    ]
});