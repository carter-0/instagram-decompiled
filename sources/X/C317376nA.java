package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nA  reason: invalid class name and case insensitive filesystem */
public final class C317376nA {
    public final C310016aI A00;
    public final C273384mU A01;
    public final 2el A02;
    public final C314536iQ A03;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2oN, java.lang.Object] */
    public C317376nA(C234072ww r7, UserSession userSession, 2el r9, AnonymousClass4DU r10, C310016aI r11, C273384mU r12) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r10, 2);
        0qQ.A0B(r9, 4);
        this.A01 = r12;
        this.A02 = r9;
        this.A00 = r11;
        C234072ww r1 = r7;
        this.A03 = new C314536iQ(r1, userSession, r10, AnonymousClass2oO.A00(userSession), new Object());
    }

    public final void A00(View view, C247733gp r6) {
        String A04 = 002.A04(0, "::", r6.A0G);
        C17206VMk vMk = new C17206VMk();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r2 = new C2354830a(r6, vMk, A04);
        r2.A00(this.A03);
        this.A02.A05(view, r2.A01());
    }
}
