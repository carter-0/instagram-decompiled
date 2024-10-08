package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ApI  reason: case insensitive filesystem */
public final class C41158ApI implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C338677iL A01;
    public final /* synthetic */ boolean A02;

    public C41158ApI(View view, C338677iL r2, boolean z) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = z;
    }

    public final void run() {
        C226262fy r0;
        C338677iL r6 = this.A01;
        if (!r6.A03) {
            UserSession userSession = r6.A08;
            if (AnonymousClass9US.A00()) {
                View view = this.A00;
                AnonymousClass5Gt r2 = new AnonymousClass5Gt(AnonymousClass7TE.A0S(view), C3019160o.A01(view), new C315476jx(2131975096));
                r2.A03(r6.A09.getView());
                if (this.A02) {
                    r0 = C226262fy.ABOVE_ANCHOR;
                } else {
                    r0 = C226262fy.BELOW_ANCHOR;
                }
                r2.A05 = r0;
                r2.A00 = 5000;
                r2.A04 = new C389309pE(r6, 0);
                r2.A00().A07(userSession);
            }
        }
    }
}
