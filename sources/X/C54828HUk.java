package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HUk  reason: case insensitive filesystem */
public abstract class C54828HUk {
    public static final C55798Hne A00(C286575Wy r9, C55932Hpu hpu) {
        C55932Hpu hpu2 = hpu;
        0qQ.A0B(hpu, 0);
        if (C51967G9n.A1U(r9, -2075738238)) {
            0fL.A01(-271997941, "com.instagram.barcelona.feed.post.toast.rememberPostToastHelper (PostToastHelper.kt:23)");
        }
        Object ECw = r9.ECw();
        Object obj = AnonymousClass5XT.A00;
        C262224Cq r8 = ((AnonymousClass6FV) C51974G9v.A0Y(r9, ECw, obj)).A00;
        Context A0N = C51970G9q.A0N(r9);
        UserSession A0f = C51970G9q.A0f(r9);
        AnonymousClass0iw r6 = (AnonymousClass0iw) r9.AJO(C286915Yh.A00);
        Object A0m = C51967G9n.A0m(r9, -444053679);
        if (A0m == obj) {
            A0m = new C55798Hne(A0N, hpu2, r6, A0f, r8);
            r9.FLL(A0m);
        }
        C55798Hne hne = (C55798Hne) A0m;
        C286565Wx r92 = (C286565Wx) r9;
        if (C51967G9n.A1b(r92, false)) {
            0fL.A00(899504914);
        }
        C286565Wx.A0L(r92, false);
        return hne;
    }
}
