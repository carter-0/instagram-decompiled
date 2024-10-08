package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3pt  reason: invalid class name and case insensitive filesystem */
public final class C252903pt {
    public final UserSession A00;
    public final C227072ib A01;

    public final int A00(UserSession userSession, 1Xj r9) {
        int i;
        0qQ.A0B(r9, 0);
        0qQ.A0B(userSession, 1);
        Integer valueOf = Integer.valueOf(r9.A0r());
        C272034jz A002 = AnonymousClass3YY.A00(r9);
        if (A002 != null) {
            float f = 0.0f;
            for (int i2 : C297825sP.A03(userSession, A002, true)) {
                f += (float) i2;
            }
            i = (int) f;
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{valueOf, Integer.valueOf(i), false});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36327563534154246L) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r14.A3E != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C376499If A01(android.content.Context r19, X.AnonymousClass5DR r20, X.1Xj r21, X.AnonymousClass4DU r22, X.AnonymousClass3W1 r23) {
        /*
            r18 = this;
            r12 = 0
            r2 = r21
            X.0qQ.A0B(r2, r12)
            r0 = 1
            r14 = r23
            X.0qQ.A0B(r14, r0)
            r0 = 2
            r7 = r19
            X.0qQ.A0B(r7, r0)
            r4 = 4
            r6 = r22
            X.0qQ.A0B(r6, r4)
            r3 = r18
            com.instagram.common.session.UserSession r8 = r3.A00
            boolean r0 = r2.A5n()
            if (r0 != 0) goto L_0x0037
            boolean r0 = r2.A5e()
            if (r0 != 0) goto L_0x0037
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327563534154246(0x810fba00023a06, double:3.0370356861317436E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            r17 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0037:
            r17 = 0
        L_0x0039:
            if (r17 == 0) goto L_0x0041
            boolean r0 = r14.A3E
            r16 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0041:
            r16 = 1
        L_0x0043:
            r6.getModuleName()
            boolean r0 = X.AnonymousClass3YY.A04(r8, r2)
            if (r0 == 0) goto L_0x007b
            X.4jz r9 = X.AnonymousClass3YY.A00(r2)
            r13 = 1
            r0 = 45
            X.9M5 r11 = new X.9M5
            r11.<init>(r0, r3, r2)
            r0 = 5
            X.9ME r10 = new X.9ME
            r10.<init>(r0, r2, r3, r14)
            java.lang.CharSequence r15 = X.AnonymousClass3YY.A01(r7, r8, r9, r10, r11, r12, r13)
        L_0x0062:
            X.9ME r5 = new X.9ME
            r5.<init>(r4, r2, r3, r14)
            r0 = 23
            X.9Ld r1 = new X.9Ld
            r1.<init>(r14, r0)
            X.4LL r0 = X.AnonymousClass4LL.A00
            X.9Ib r13 = new X.9Ib
            r13.<init>((X.C62320sa) r5, (X.0sP) r1, (X.0sP) r0)
            X.9If r12 = new X.9If
            r12.<init>((X.C376459Ib) r13, (X.AnonymousClass3W1) r14, (java.lang.CharSequence) r15, (boolean) r16, (boolean) r17)
            return r12
        L_0x007b:
            X.4LK r0 = X.AnonymousClass4LK.A00
            boolean r0 = r0.A05(r8, r2)
            if (r0 == 0) goto L_0x009a
            com.instagram.api.schemas.CommentPrompt r1 = X.AnonymousClass4LK.A00(r2)
            java.lang.String r15 = ""
            if (r1 == 0) goto L_0x0062
            android.content.res.Resources r0 = r7.getResources()
            X.0qQ.A07(r0)
            java.lang.String r0 = X.AnonymousClass4LK.A02(r0, r1, r8, r12)
            if (r0 == 0) goto L_0x0062
            r15 = r0
            goto L_0x0062
        L_0x009a:
            X.2ib r0 = r3.A01
            boolean r0 = r0.A02(r2)
            r6 = r20
            if (r0 == 0) goto L_0x00b1
            r1 = 2131976609(0x7f1361a1, float:1.9590343E38)
        L_0x00a7:
            android.content.Context r0 = r6.A00
            java.lang.String r15 = r0.getString(r1)
        L_0x00ad:
            X.0qQ.A07(r15)
            goto L_0x0062
        L_0x00b1:
            int r1 = r2.A0r()
            r0 = 1
            if (r1 != r0) goto L_0x00bc
            r1 = 2131976605(0x7f13619d, float:1.9590335E38)
            goto L_0x00a7
        L_0x00bc:
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r5 = java.text.NumberFormat.getInstance(r0)
            long r0 = (long) r1
            java.lang.String r0 = r5.format(r0)
            X.0qQ.A07(r0)
            r5 = 2131976610(0x7f1361a2, float:1.9590345E38)
            android.content.Context r1 = r6.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r15 = r1.getString(r5, r0)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252903pt.A01(android.content.Context, X.5DR, X.1Xj, X.4DU, X.3W1):X.9If");
    }

    public C252903pt(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new C227072ib(userSession);
    }
}
