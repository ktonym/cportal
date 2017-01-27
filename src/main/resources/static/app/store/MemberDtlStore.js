/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
Ext.define('ClientPortal.store.MemberDtlStore',{
    extend: 'Ext.data.Store',
    alias: 'store.member-dtl',
    requires: ['ClientPortal.model.MemberDtl'],
    model: 'ClientPortal.model.MemberDtl',
    proxy: {
        type: 'ajax',
        url: '/memberdtl/findByMemberNo',
        reader: {
            type: 'json',
            rootProperty: 'data'
        }
    },
    doFindByMemberNo: function(memberNo){
        this.load({
            params: {
                member_no : memberNo
            }
        });
    },
    doFindByEmpNo: function(empNo){
        this.getProxy().setUrl('/memberdtl/findByEmpNo');
        this.load({
            params: {
                emp_no : memberNo
            }
        });
    },
    doFindByCorpAndAnniv: function(corp_id,anniv){
        this.getProxy().setUrl('/memberdtl/findByCorpAndAnniv');
        this.load({
            params: {
                corp_id: corp_id,
                anniv: anniv
            }
        });
    },
    doPrincipalsByCorpAndAnniv: function(corp_id,anniv){
        this.getProxy().setUrl('/memberdtl/findPrincipalsByCorpAndAnniv');
        this.load({
            params: {
                corp_id: corp_id,
                anniv: anniv
            }
        });
    },
    doFindDependants: function(corp_id,anniv,familyNo){
        this.getProxy().setUrl('/memberdtl/findDependants');
        this.load({
            params: {
                corp_id: corp_id,
                anniv: anniv,
                familyNo: familyNo
            }
        });
    }
});