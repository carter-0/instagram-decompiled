package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.6z9  reason: invalid class name and case insensitive filesystem */
public final class C324356z9 {
    public final Handler A00;
    public final UserSession A01;
    public final AnonymousClass4D6 A02;
    public final C324366zA A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C324356z9(Context context, AnonymousClass07i r8, UserSession userSession) {
        this(context, r8, userSession, (String) null, false);
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r8, 3);
    }

    public final Integer A01(C324596za r9, String str, long j, boolean z) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C324366zA r2 = this.A03;
        if (r2.A03 == AnonymousClass05K.A00) {
            return AnonymousClass05K.A0C;
        }
        return 1P1.A00(this.A01).A05(new C319936rT((AnonymousClass11X) null, (C54252H4v) null, r9, r2), this.A02, str2, j, z, false);
    }

    public final Integer A02(C324596za r13, String str, long j, boolean z, boolean z2) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C324366zA r2 = this.A03;
        if (r2.A03 != AnonymousClass05K.A00) {
            return 1GZ.A00(this.A01).A05(new C318446ox((AnonymousClass11X) null, r13, r2), this.A02, str2, j, z, z2, false);
        }
        return AnonymousClass05K.A0C;
    }

    public final void A03(1OC r4, C324596za r5) {
        0qQ.A0B(r4, 0);
        C324366zA r2 = this.A03;
        if (r2.A03 != AnonymousClass05K.A00) {
            r4.A00 = new C319936rT(r4, (C54252H4v) null, r5, r2);
            this.A02.schedule(r4);
        }
    }

    public final void A04(1GP r4, C324596za r5) {
        0qQ.A0B(r4, 0);
        C324366zA r2 = this.A03;
        if (r2.A03 != AnonymousClass05K.A00) {
            r4.A02(new C318446ox(r4, r5, r2));
            this.A02.schedule(r4);
        }
    }

    public final boolean A06() {
        return A07(0, 0, true, false);
    }

    public final C324356z9 A00(String str) {
        UserSession userSession = this.A01;
        AnonymousClass4D6 r3 = this.A02;
        Handler handler = this.A00;
        C324366zA r0 = this.A03;
        return new C324356z9(handler, userSession, r3, str, r0.A05, r0.A0A);
    }

    public final boolean A05() {
        C324366zA r1 = this.A03;
        if (!0mp.A0B(r1.A07) || !0mp.A0B(r1.A09)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if ((java.lang.System.currentTimeMillis() - r1.longValue()) > java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r8)) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r1 != X.AnonymousClass05K.A01) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(int r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            if (r10 != 0) goto L_0x0056
            com.instagram.common.session.UserSession r3 = r6.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323371645938802(0x810bea00002c72, double:3.034384719144918E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0056
            X.6zA r5 = r6.A03
            java.lang.Integer r2 = r5.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x003d
            if (r7 <= 0) goto L_0x0054
            if (r8 <= 0) goto L_0x0054
            java.lang.Long r1 = r5.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0054
            int r0 = r5.A00
            if (r0 >= r7) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r1.longValue()
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r8
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
        L_0x003d:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x004f
            if (r9 != 0) goto L_0x0054
            java.lang.String r0 = r5.A06
            boolean r0 = X.0mp.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0054
        L_0x004f:
            boolean r1 = r5.A0A
            r0 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            return r0
        L_0x0056:
            X.6zA r5 = r6.A03
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0054
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324356z9.A07(int, int, boolean, boolean):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C324356z9(android.content.Context r7, X.AnonymousClass07i r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            r6 = this;
            r0 = 1
            r1 = r7
            X.0qQ.A0B(r7, r0)
            r0 = 2
            r3 = r9
            X.0qQ.A0B(r9, r0)
            r0 = 3
            r2 = r8
            X.0qQ.A0B(r8, r0)
            r5 = 0
            r4 = r10
            if (r10 == 0) goto L_0x0014
            r5 = 1
        L_0x0014:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324356z9.<init>(android.content.Context, X.07i, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6zA] */
    public C324356z9(Handler handler, UserSession userSession, AnonymousClass4D6 r5, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r5;
        this.A00 = handler;
        ? obj = new Object();
        this.A03 = obj;
        obj.A0A = z;
        obj.A07 = str;
        obj.A05 = str2;
        if (str != null) {
            obj.A03 = AnonymousClass05K.A0C;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C324356z9(android.content.Context r8, X.AnonymousClass07i r9, com.instagram.common.session.UserSession r10, java.lang.String r11, boolean r12) {
        /*
            r7 = this;
            r0 = 2
            r2 = r10
            X.0qQ.A0B(r10, r0)
            r5 = 0
            X.2lw r3 = new X.2lw
            r3.<init>(r8, r9, r5)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            r0 = r7
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324356z9.<init>(android.content.Context, X.07i, com.instagram.common.session.UserSession, java.lang.String, boolean):void");
    }
}
