package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2oP  reason: invalid class name and case insensitive filesystem */
public final class C229832oP implements C229842oQ, AnonymousClass0lh {
    public final AnonymousClass2oZ A00;
    public final UserSession A01;
    public final C229852oR A02;
    public final C229872oT A03 = new Object();

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.2oS] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2oT] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.2oY] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.2oV] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2oT] */
    public C229832oP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new C229852oR(userSession);
        ? obj = new Object();
        ? obj2 = new Object();
        AnonymousClass2oU r4 = new AnonymousClass2oU(new WeakReference(userSession));
        this.A00 = new AnonymousClass2oZ(new Object(), new Object(), obj, r4, obj2);
    }

    public final C254243sA B3I(String str) {
        AnonymousClass2oZ r0;
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, this.A01, 36313437388998655L)) {
            r0 = this.A00;
        } else {
            r0 = this.A02.A02;
        }
        C254233s9 r1 = (C254233s9) r0.A06.get(str);
        if (r1 == null || (r1 instanceof C254243sA)) {
            return (C254243sA) r1;
        }
        return null;
    }

    public final C254353sL EAj(AnonymousClass4DU r10, C254263sC r11, String str, boolean z) {
        C254353sL A022;
        String str2 = str;
        0qQ.A0B(str, 1);
        UserSession userSession = this.A01;
        AnonymousClass4DU r4 = r10;
        boolean z2 = z;
        if (182.A06(0Tu.A05, userSession, 36313437388998655L)) {
            return this.A00.A02(r11, new C56937IIg(userSession, r4, this.A03, r11.A01, str2, z2));
        }
        C229852oR r5 = this.A02;
        synchronized (r5) {
            A022 = r5.A02.A02(r11, new C254283sE(r4, r5, r11.A01, str2, z2));
        }
        return A022;
    }

    public final void CoC(C254263sC r6) {
        AnonymousClass2oZ r4;
        if (182.A06(0Tu.A05, this.A01, 36313437388998655L)) {
            r4 = this.A00;
        } else {
            r4 = this.A02.A02;
        }
        synchronized (r4) {
            String BJR = r6.BJR();
            r4.A08.put(BJR, C254313sH.A00.A04(r6, r4.A03(BJR)));
        }
    }

    public final void onSessionWillEnd() {
        AnonymousClass2oZ r0;
        if (182.A06(0Tu.A05, this.A01, 36313437388998655L)) {
            r0 = this.A00;
        } else {
            r0 = this.A02.A02;
        }
        synchronized (r0) {
        }
    }
}
