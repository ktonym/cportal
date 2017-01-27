Ext.define('ClientPortal.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',


    onPolicyPeriodDblClick: function (view , record , item , index , e , eOpts ) {
        var me = this,
            vw = me.getView(),
            vm = me.getViewModel(),
            corp_id = vm.get('current.policyDtl.corp_id'),
            benefitStore = vm.getStore('policyBenefits'),
            policyBenefitList;

        benefitStore.doFindByCorpAndAnniv(corp_id,record.get('anniv'));
        policyBenefitList = vw.down('policy-benefit-list');
        if(!policyBenefitList){
            policyBenefitList = Ext.create('ClientPortal.view.main.PolicyBenefitList',{
                title: 'Benefits',
                iconCls: 'x-fa fa-gift'
            });
            vw.add(policyBenefitList);
        }

        vw.getLayout().setActiveItem(policyBenefitList);

    },

    onPolicyDtlDblClick: function ( view , record , item , index , e , eOpts ) {
        var me = this,
            vm = me.getViewModel(),
            vw = me.getView(),
            periodStore = vm.getStore('policyPeriods'),
            policyPeriodList;

        vm.set('current.policyDtl',record);
        periodStore.doFindByCorporate(record.get('corp_id'));

        policyPeriodList = vw.down('policy-period-list');
        //debugger;
        if(!policyPeriodList){
            policyPeriodList = Ext.create('ClientPortal.view.main.PolicyPeriodList',{
                title: 'Terms',
                iconCls: 'x-fa fa-umbrella',
            });
            vw.add(policyPeriodList);
        }

        vw.getLayout().setActiveItem(policyPeriodList);
    },

    onMemberDtlsClick: function(grid,rowIndex, colIndex){
        var me = this,
            vw = me.getView(),
            vm = me.getViewModel(),
            memberStore = vm.getStore('memberDtls'),
            rec = grid.getStore().getAt(rowIndex),
            memberList = vw.down('member-list');

        memberStore.doFindByCorpAndAnniv(rec.get('corp_id'),rec.get('anniv'));

        if(!memberList){
            memberList = Ext.create('ClientPortal.view.main.MemberList',{
                title: 'Members',
                iconCls: 'x-fa fa-users'
            });
            vw.add(memberList);
        }

        vw.getLayout().setActiveItem(memberList);

    },

    onPolicySelected: function (sender, record) {
        //Ext.Msg.confirm('Confirm', 'Are you sure?', 'onConfirm', this);
    }
});
