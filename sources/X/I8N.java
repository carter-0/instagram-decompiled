package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class I8N implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ Long A04;

    public I8N(Context context, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, Long l) {
        this.A04 = l;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Long l = this.A04;
        if (l != null) {
            UserSession userSession = this.A01;
            AnonymousClass4DU r6 = this.A03;
            1Xj r3 = this.A02;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "coauthor_invite_accept");
            A0e.A9F("media_id", l);
            A0e.AAE(C263944Ny.A00(C51973G9u.A0j(userSession, r3)), "media_owner_id");
            A0e.AAE(C263944Ny.A00(userSession.A06), "actor_id");
            G9t.A1H(A0e, r3);
            C51969G9p.A1A(A0e, r6);
            A0e.AAJ("source_of_action", r6.getModuleName());
            A0e.Cgf();
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_coauthor_invite_accept_tap");
            if (A0e2.isSampled()) {
                A0e2.A9F("media_id", l);
                A0e2.AAJ("entrypoint", "accept_flow_entrypoint_other");
                DbS.A1M(A0e2, "accept_flow_review_surface_dialog");
                A0e2.Cgf();
            }
        }
        AnonymousClass3YV.A01(this.A00, this.A01, this.A02);
    }
}
