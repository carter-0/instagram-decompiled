package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Coa  reason: case insensitive filesystem */
public abstract class C44997Coa {
    public static 1OC A00(UserSession userSession, C45418Cvy cvy) {
        1NY r2 = new 1NY(userSession);
        r2.A04();
        r2.A0A(0mp.A06("media/%s/%s/story_quiz_answer/", new Object[]{cvy.A03, cvy.A04}));
        r2.A9m("answer", String.valueOf(cvy.A00));
        r2.A9m("container_module", cvy.A05);
        r2.A9m(AnonymousClass000.A00(76), cvy.A02);
        r2.A9m("tray_session_id", cvy.A06);
        r2.A9m("nav_chain", AnonymousClass1QI.A00.A02.A00);
        r2.A0R(CFX.class, D2G.class);
        return r2.A0M();
    }
}
