package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Fv  reason: invalid class name and case insensitive filesystem */
public final class C352988Fv implements AnonymousClass8FP {
    public boolean A00;
    public final /* synthetic */ C352888Fl A01;

    public final void DZE() {
        C342827pE r0;
        this.A00 = true;
        C352888Fl r2 = this.A01;
        C340297l2 r1 = r2.A06;
        r1.getClass();
        r1.A0H(r2.A0l);
        UserSession userSession = r2.A0f;
        C360908fL.A03(userSession, "first_frame_rendered", true);
        if (!182.A06(0Tu.A05, userSession, 36315683657027049L)) {
            AnonymousClass9PJ.A00(userSession).A05(02m.A0p.currentMonotonicTimestampNanos());
        }
        if (r2.A1P) {
            r2.A0Y.A06(0.0d);
        }
        boolean z = 1Jk.A07;
        if (AnonymousClass1Jr.A05) {
            AnonymousClass1Jr.A01(new 1Jp(AnonymousClass1Jr.A04, "camera", AnonymousClass1Jr.A00().A01, SystemClock.uptimeMillis()));
        }
        if (1Jk.A07) {
            1Jk.A05(new 1Jp(1Jk.A01(), "camera", 1Jk.A00().A01, SystemClock.uptimeMillis()));
        }
        if (r2.A0I && (r0 = r2.A0j) != null) {
            r0.onFirstFrameRendered();
            if (r2.A0g.A08.A00 instanceof C363138jC) {
                C59847JaN A002 = JW1.A00(userSession);
                A002.A01 = A002.A0B.A02(288435480, A002.A01);
            }
        }
    }

    public C352988Fv(C352888Fl r1) {
        this.A01 = r1;
    }
}
