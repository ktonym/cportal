/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.model.MemberDtl',{
    extend: 'ClientPortal.model.Base',
    idProperty: 'member_no',
    fields: [
        { name: 'member_no', type: 'string' },
        { name: 'family_no', type: 'string' },
        { name: 'corp_id', type: 'string' },
        { name: 'surname', type: 'string' },
        { name: 'first_name',  type: 'string' },
        { name: 'other_names', type: 'string' },
        { name: 'dob', type: 'date', dateFormat: 'Y-m-d' },
        { name: 'gender', type: 'string' },
        { name: 'user_id', type: 'string' },
        { name: 'date_entered', type: 'date', dateFormat: 'Y-m-d' },
        { name: 'relation_to_principal', type: 'string' },
        { name: 'family_size', type: 'string' },
        { name: 'employment_no', type: 'string' },
        { name: 'family_title;', type: 'string' },
        { name: 'photo_n_form;', type: 'string' },
        { name: 'app_form_date', type: 'string' },
        { name: 'fullName', type: 'string', persist: false,
            convert: function(v,record){
                var data = record.getData();
                return (data.first_name ? data.first_name + ' ' : '') + (data.surname ? data.surname + ' ' : '') +
                    (data.other_names ? data.other_names : '')
            }
        }
    ]
});