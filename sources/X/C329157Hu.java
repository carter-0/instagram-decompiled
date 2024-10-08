package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Hu  reason: invalid class name and case insensitive filesystem */
public final class C329157Hu implements View.OnFocusChangeListener {
    public final /* synthetic */ C329067Hl A00;

    public C329157Hu(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C329067Hl r5 = this.A00;
            if (r5.A0S != null && r5.A28) {
                UserSession userSession = r5.A1Z;
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A06, userSession, 36329779737149767L)) {
                    r5.A0S.A01();
                }
            }
            AnonymousClass7IR r1 = r5.A1d;
            boolean A0x = C329067Hl.A0x(r5);
            C254783t2 r3 = r5.A1z;
            0qQ.A0B(r3, 1);
            0wc r2 = r1.A00;
            0Aj A002 = r2.A00(r2.A00, "direct_composer_tap_text_field");
            if (A002.isSampled()) {
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.A7p("is_reply_flow", Boolean.valueOf(A0x));
                A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r3));
                A002.AAJ("occamadillo_thread_id", String.valueOf(AnonymousClass4KK.A01(r3)));
                A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r3)));
                A002.Cgf();
            }
        }
    }
}
