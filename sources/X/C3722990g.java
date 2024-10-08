package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.90g  reason: invalid class name and case insensitive filesystem */
public final class C3722990g {
    public static final long A03 = TimeUnit.HOURS.toSeconds(12);
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LI(this, 27));

    public final 1OC A01(UserSession userSession, String str) {
        C3723790p r5 = new C3723790p(userSession);
        r5.A08 = C3723090h.A00(AnonymousClass05K.A0Y).A06;
        r5.A0A = str;
        r5.A0I = true;
        r5.A0H = true;
        r5.A0K = true;
        long j = A03;
        if (j != -1) {
            j *= 1000;
        }
        r5.A00 = j;
        r5.A01 = this.A00;
        return r5.A01();
    }

    public final 1OC A00(UserSession userSession) {
        C3723790p r1 = new C3723790p(userSession);
        r1.A08 = C3723090h.A00(AnonymousClass05K.A0u).A06;
        r1.A01 = this.A00;
        return r1.A02();
    }

    public final void A02(C3723890q r4) {
        11Z.A02(new AnonymousClass5r1(this, C296885qo.A06(this.A01, (C295795ov) null, r4.A03)));
    }

    public C3722990g(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
