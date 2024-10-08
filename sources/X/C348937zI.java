package X;

import android.content.Context;
import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;

/* renamed from: X.7zI  reason: invalid class name and case insensitive filesystem */
public final class C348937zI {
    public boolean A00;
    public final AnonymousClass9QJ A01;
    public final AnonymousClass9QK A02;
    public final C234482xw A03;
    public final AnonymousClass9QI A04 = new AnonymousClass9QI(new AnonymousClass9QL(this));
    public final AnonymousClass4MM A05;
    public final UserSession A06;

    public final void A00(int i) {
        C234482xw r4 = this.A03;
        r4.A06(false);
        if (!this.A00) {
            AnonymousClass9QI r3 = this.A04;
            if (r3.A00 != null) {
                r3.A00();
            }
            r3.A00 = new C380199Xa(r3, i, (long) i);
            r3.A02.A00(0.0f);
            CountDownTimer countDownTimer = r3.A00;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
            AnonymousClass9QK r1 = this.A02;
            r1.A01 = true;
            r1.A03.clear();
            AnonymousClass82X r0 = r1.A00;
            if (r0 != null) {
                r0.A05(r1);
            }
            this.A05.start();
            r4.A01();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public C348937zI(Context context, UserSession userSession, AnonymousClass9QJ r5, C234482xw r6) {
        this.A06 = userSession;
        this.A03 = r6;
        this.A01 = r5;
        AnonymousClass4MM r1 = new AnonymousClass4MM(context, userSession, "recording_backing");
        this.A05 = r1;
        AnonymousClass9QK r0 = new AnonymousClass9QK(r5, r6, r1);
        this.A02 = r0;
        r1.A0M = r0;
        r1.Eqq(1.0f);
    }
}
