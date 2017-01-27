/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
Ext.define('ClientPortal.view.main.PolicyList',{
    extend: 'Ext.grid.Panel',
    alias: 'widget.policy-list',
    viewModel: 'main',
    bind: {
        store: '{policyDtls}',
        selection: '{current.policyDtl}'
    },
    listeners: {
        itemdblclick: 'onPolicyDtlDblClick',
        select: 'onPolicySelected'
    },
    columns:[
        {
            text: 'Policy No',
            dataIndex: 'policy_no',
            flex: 1
        },
        {
            text: 'Name',
            dataIndex: 'corporate',
            flex: 2
        },
        {
            text: 'Town',
            dataIndex: 'town',
            width: 120
        }
    ]
});