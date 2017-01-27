/**
 * Created by anthony.kipkoech on 1/15/2017.
 */
Ext.define('ClientPortal.model.PolicyPeriod',{
    extend: 'ClientPortal.model.Base',
    idProperty: 'anniv',
    fields: [
        { name: 'start_date',   type: 'date', dateFormat: 'Y-m-d'},
        { name: 'end_date',     type: 'date', dateFormat: 'Y-m-d'},
        { name: 'renewal_date', type: 'date', dateFormat: 'Y-m-d'},
        { name: 'agent_name',   type: 'string'},
        { name: 'anniv',        type: 'int', useNull: true},
        { name: 'corp_id',      type: 'int'}
    ]
});