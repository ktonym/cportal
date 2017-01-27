/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
Ext.define('ClientPortal.model.PolicyDtl',{
    extend: 'ClientPortal.model.Base',
    idProperty: 'corp_id',
    fields: [
        { name: 'corp_id'   , type: 'int', useNull: true},
        { name: 'policy_no' , type: 'string'},
        { name: 'corporate'	, type: 'string'},
        { name: 'tel_no'	, type: 'string'},
        { name: 'fax_no'	, type: 'string'},
        { name: 'postal_add', type: 'string'},
        { name: 'corp_pin'	, type: 'string'},
        { name: 'town'		, type: 'string'}

    ]/*,

    proxy: {
        type: 'rest',
        url : '/policydetails'
    }
*/
});