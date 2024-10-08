package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cof  reason: case insensitive filesystem */
public abstract class C45002Cof {
    public static final 1OC A00(UserSession userSession, C45419Cvz cvz) {
        boolean A1Z = AnonymousClass7TG.A1Z(cvz, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        StringBuilder sb = new StringBuilder();
        sb.append("media/");
        sb.append(cvz.A03);
        sb.append('/');
        sb.append(cvz.A05);
        sb.append("/story_slider_vote/");
        A0a.A0A(sb.toString());
        C42139BIu bIu = cvz.A01;
        if (bIu != null) {
            A0a.A9m("vote", String.valueOf(bIu.A01));
            A0a.A9m("container_module", cvz.A04);
            A0a.A9m(AnonymousClass000.A00(76), cvz.A02);
            A0a.A9m("tray_session_id", cvz.A06);
            A0a.A0C("tray_position", cvz.A00);
            A0a.A9m("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A0a.A0Q(CDS.class, C45645Czv.class);
            A0a.A0R = A1Z;
            return A0a.A0M();
        }
        throw AnonymousClass7TE.A0y();
    }
}
