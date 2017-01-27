Ext.define('ClientPortal.view.main.MainModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.main',
    requires: ['ClientPortal.model.PolicyDtl','ClientPortal.store.PolicyPeriodStore',
        'ClientPortal.store.PolicyBenefitStore','ClientPortal.store.MemberDtlStore'],
    data: {
        name: 'Madison Client Portal',
        current: {
            policyDtl: null,
            policyPeriod: null
        },

        loremIpsum: 'Lorem Ipsum.'
    },

    stores: {
        policyDtls: {
            model: 'PolicyDtl',
            autoLoad: true
        },
        policyPeriods: {
            type: 'policy-period'
        },
        policyBenefits: {
            type: 'policy-benefit'
        },
        memberDtls: {
            type: 'member-dtl'
        }
    }
    
});
