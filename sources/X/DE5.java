package X;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.creator.originality.graphql.IGSundialOriginalityRemoveLabelMutationQueryResponseImpl;

public final class DE5 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DE5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                1Xj r3 = (1Xj) this.A02;
                UserSession userSession = (UserSession) this.A03;
                MP9 mp9 = new MP9(this.A01, 44);
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, r3.A30(), "media_id");
                2IS A04 = C41845B3m.A04();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A04, AnonymousClass000.A00(1466)), "IGSundialOriginalityRemoveLabelMutationQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), IGSundialOriginalityRemoveLabelMutationQueryResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_remove_originality_label_from_media", AnonymousClass7TE.A1C());
                C67231sQ clipsMetadata = r3.A0C.getClipsMetadata();
                if (clipsMetadata != null) {
                    C295345o0 r0 = new C295345o0(clipsMetadata);
                    r0.A0A = null;
                    r3.A3v(r0.A00());
                    r3.AE7(userSession);
                    1vm.A01(userSession).ATL(new C19031WHi(0, clipsMetadata, userSession, r3, mp9), new C45926DFg(mp9, 7), pandoGraphQLRequest);
                    return;
                }
                return;
            case 1:
                DialogInterface dialogInterface2 = dialogInterface;
                0qQ.A0B(dialogInterface2, 0);
                C69668Npq npq = (C69668Npq) this.A01;
                DQP dqp = DQP.A00;
                PA3.A00((View) null, (AnonymousClass7FU) null, (PA3) this.A02, npq, (C254743sy) this.A03, (C62320sa) null, DNZ.A00, C46198DPz.A00, dqp, false);
                dialogInterface2.dismiss();
                return;
            default:
                PA3 pa3 = (PA3) this.A02;
                C69668Npq npq2 = (C69668Npq) this.A01;
                C73576PgA pgA = new C73576PgA(pa3, 2);
                PA3.A00((View) null, (AnonymousClass7FU) null, pa3, npq2, (C254743sy) this.A03, (C62320sa) null, C46121DNa.A00, new C73607Pgi(pa3, 5), pgA, true);
                return;
        }
    }
}
