/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.model.PolicyBenefit',{
    extend: 'ClientPortal.model.Base',
    idProperty: function(v){
      return v.category + '_' + v.benefit;
    },
    fields: [
        /*{ name: 'id', type: 'string',
            convert: function(v,record){
                var cat = record.data.category,
                    ben = record.data.benefit;
                return cat + '_' + ben;
            }
        },*/
        { name: 'anniv', type: 'int'},
        { name: 'category', type: 'string'},
        { name: 'benefit', type: 'string'},
        { name: 'parent_benefit', type: 'string'},
        { name: 'sharing', type: 'string' },
        { name: 'limit', type: 'int'},
        { name: 'waiting_period', type: 'int'}
    ]
});