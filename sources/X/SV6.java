package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public final class SV6 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public SV6(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = obj3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (2 - this.A00 != 0) {
            0qQ.A0A(dialogInterface);
            String str = this.A04;
            C13622Tdo tdo = (C13622Tdo) this.A02;
            C13621Tdn tdn = (C13621Tdn) this.A01;
            int ordinal = ((C8937RGf) this.A03).ordinal();
            if (ordinal == 4 || ordinal == 1) {
                if (str != null && tdn != null) {
                    tdn.DTe(str);
                }
            } else if (ordinal == 3 || ordinal == 2) {
                dialogInterface.dismiss();
                if (tdo != null) {
                    tdo.DYU();
                }
            }
        } else {
            UserSession userSession = (UserSession) this.A01;
            Context context = (Context) this.A02;
            String str2 = this.A04;
            S3Q s3q = (S3Q) this.A03;
            dialogInterface.getClass();
            dialogInterface.dismiss();
            TPL tpl = new TPL(context, userSession, s3q, str2, 0);
            TPJ tpj = new TPJ(19, context, s3q);
            1vn A012 = 1vm.A01(userSession);
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
            2IS A042 = C41845B3m.A04();
            C12090Smk.A00(new C45926DFg(tpl, 17), new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "data"), "DeleteAll", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43227Bup.class, true, (PandoRealtimeInfoJNI) null, 12, "data", "xig_delete_all_from_user_id_iab_link_history_ig", AnonymousClass7TE.A1C()), A012, tpj, 11);
        }
    }
}
