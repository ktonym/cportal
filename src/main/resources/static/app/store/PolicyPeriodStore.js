/**
 * Created by anthony.kipkoech on 1/22/2017.
 */
Ext.define('ClientPortal.store.PolicyPeriodStore',{
    extend: 'Ext.data.Store',
    alias: 'store.policy-period',
    requires: ['ClientPortal.model.PolicyPeriod'],
    model: 'ClientPortal.model.PolicyPeriod',
    proxy: {
        type: 'ajax',
        url: '/policyperiod/findByCorporate',
        reader: {
            type: 'json',
            rootProperty: 'data'
        }
    },
    doFindByCorporate: function(corpId){
        this.load({
            params: {
                id: corpId
            }
        });
    }
});