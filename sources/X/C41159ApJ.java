package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ApJ  reason: case insensitive filesystem */
public final class C41159ApJ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C349057zW A02;

    public C41159ApJ(View view, View view2, C349057zW r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
    }

    public final void run() {
        C349057zW r6 = this.A02;
        if (!r6.A02) {
            UserSession userSession = r6.A05;
            if (AnonymousClass9US.A00()) {
                View view = this.A01;
                AnonymousClass5Gt r2 = new AnonymousClass5Gt(AnonymousClass7TE.A0S(view), C3019160o.A01(view), new C315476jx(2131975096));
                r2.A03(this.A00);
                r2.A02();
                r2.A00 = 5000;
                r2.A04 = new C389309pE(r6, 1);
                r2.A00().A07(userSession);
            }
        }
    }
}
