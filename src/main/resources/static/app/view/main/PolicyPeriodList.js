/**
 * Created by anthony.kipkoech on 1/15/2017.
 */
Ext.define('ClientPortal.view.main.PolicyPeriodList',{
    extend: 'Ext.grid.Panel',
    alias: 'widget.policy-period-list',
    reference: 'policyPeriodList',
    listeners: {
        itemdblclick: 'onPolicyPeriodDblClick'
    },
    bind: {
        store: '{policyPeriods}',
        selection: '{current.policyPeriod}'
    },
    columns: [
        {
            text: 'Anniv',
            dataIndex: 'anniv',
            flex: 1
        },
        {
            text: 'Inception',
            dataIndex: 'start_date',
            dateFormat: 'dmY',
            flex: 1
        },
        {
            text: 'Expiry',
            dataIndex: 'end_date',
            dateFormat: 'dmY',
            flex: 1
        },
        {
            text: 'Renewal',
            dataIndex: 'renewal_date',
            dateFormat: 'dmY',
            flex: 1
        },
        {
            text: 'Intermediary',
            dataIndex: 'agent_name',
            flex: 1
        },
        {
            xtype: 'actioncolumn',
            text: 'Actions',
            flex: 1,
            items: [
                {
                    xtype: 'button',
                    text: 'Members',
                    iconCls: 'fa-play',
                    handler: 'onMemberDtlsClick'
                }
            ]
        }
    ]
});