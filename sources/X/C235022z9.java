package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2z9  reason: invalid class name and case insensitive filesystem */
public final class C235022z9 extends C234532y8 {
    public C235052zC A00;
    public final UserSession A01;
    public final C235032zA A02;
    public final boolean A03;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.2oN, java.lang.Object] */
    public C235022z9(Context context, UserSession userSession, AnonymousClass4DU r14, C249763kK r15) {
        UserSession userSession2 = userSession;
        this.A01 = userSession;
        int integer = context.getResources().getInteger(17694721);
        AnonymousClass4DU r8 = r14;
        C234072ww r6 = new C234072ww(userSession, r14, r15);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36313437386835939L);
        boolean z = true;
        boolean z2 = !182.A06(r2, userSession, 36313437386770402L);
        if (!A06 && !z2) {
            z = false;
        }
        this.A03 = z;
        this.A02 = new C235032zA(r6, AnonymousClass0kN.A01(r14, userSession), (long) integer);
        if (182.A06(0Tu.A06, this.A01, 36313437386770402L)) {
            this.A00 = new C235052zC(r6, userSession2, r8, AnonymousClass2oO.A00(userSession), new Object());
        }
    }
}
