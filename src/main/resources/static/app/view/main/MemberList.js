/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.view.main.MemberList',{
    extend: 'Ext.grid.Panel',
    alias: 'widget.member-list',
    reference: 'memberList',
    bind: {
        store: '{memberDtls}',
        selection: '{current.member}'
    },
    listeners: {
        itemdblclick: 'onPrincipleDblClick'
    },
    columns: [
        {
            dataIndex: 'member_no',
            text: 'Member No',
            flex: 1
        },
        {
            dataIndex: 'fullName',
            text: 'Name',
            flex: 3
        },
        {
            xtype: 'datecolumn',
            dataIndex: 'dob',
            text: 'D.O.B',
            dateFormat: 'd-m-Y',
            flex: 1
        },
        {
            dataIndex: 'gender',
            text: 'Gender',
            flex: 1
        }
    ]
});