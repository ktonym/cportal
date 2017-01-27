/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.store.PolicyBenefitStore',{
    extend: 'Ext.data.Store',
    alias: 'store.policy-benefit',
    requires: ['ClientPortal.model.PolicyBenefit'],
    model: 'ClientPortal.model.PolicyBenefit',
    proxy: {
        type: 'ajax',
        url: '/policybenefit/findByCorp',
        reader: {
            type: 'json',
            rootProperty: 'data'
        }
    },
    doFindByCorp: function(corp_id){
        this.load({
            params: {
                corp_id: corp_id
            }
        });
    },
    doFindByCorpAndAnniv: function(corp_id,anniv){
        this.getProxy().setUrl('/policybenefit/findByCorpAndAnniv');
        this.load({
           params: {
               corp_id: corp_id,
               anniv: anniv
           }
        });
    }
});