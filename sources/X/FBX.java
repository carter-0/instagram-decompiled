package X;

import com.instagram.common.session.UserSession;

public final class FBX {
    public final 02m A00 = 02m.A0p;
    public final UserSession A01;

    public FBX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static void A00(FBX fbx) {
        fbx.A00.markerEnd(857809457, 3);
    }

    public final void A01(int i, String str) {
        02m r1 = this.A00;
        r1.markerStart(i);
        r1.markerAnnotate(i, "node_identifier", str);
    }

    public final void A02(String str, String str2) {
        String A002 = C66579MXk.A00(362);
        02m r2 = this.A00;
        r2.markerStart(857809457);
        r2.markerAnnotate(857809457, "node_identifier", str);
        r2.markerAnnotate(857809457, A002, str2);
    }
}
