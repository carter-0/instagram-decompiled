package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.ApX  reason: case insensitive filesystem */
public final class C41173ApX implements Runnable {
    public final /* synthetic */ AnonymousClass7N7 A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;

    public C41173ApX(AnonymousClass7N7 r1, 1Xj r2, AnonymousClass3Q2 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass7N7 r4 = this.A00;
        r4.A05.FJv(C295375o3.A02(this.A01));
        AnonymousClass3Q2 r3 = this.A02;
        if (r3.A0l != null) {
            Context context = r4.A01;
            C243473Yx.A08(r4.A04, r4.A06);
            C59689JTv.A07(context, 2131973611);
            return;
        }
        UserSession userSession = r4.A04;
        if (182.A06(0Tu.A05, userSession, 36314859021601612L)) {
            Context context2 = r4.A01;
            Fragment fragment = r4.A02;
            AnonymousClass4DU r8 = r4.A06;
            if (r8 != null) {
                C231822sS r42 = C243473Yx.A03;
                if (r42 == null) {
                    r42 = new C231822sS(context2, fragment, userSession, r8, AnonymousClass05K.A00);
                    C243473Yx.A03 = r42;
                }
                r42.A01(r3);
            }
        }
    }
}
