/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.view.main.PolicyBenefitList',{
    extend: 'Ext.grid.Panel',
    alias: 'widget.policy-benefit-list',
    reference: 'policyBenefitList',
    bind: {
        store: '{policyBenefits}',
        selection: '{current.policyBenefit}'
    },
    columns: [
        {
            dataIndex: 'benefit',
            text: 'Benefit',
            flex: 2
        },
        {
            dataIndex: 'parent_benefit',
            text: 'Parent Benefit',
            flex: 2
        },
        {
            dataIndex: 'limit',
            text: 'Limit',
            flex: 1
        },
        {
            dataIndex: 'sharing',
            text: 'Sharing',
            flex: 1
        },
        {
            dataIndex: 'category',
            text: 'Category',
            flex: 2
        }
    ]
});