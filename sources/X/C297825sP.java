package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5sP  reason: invalid class name and case insensitive filesystem */
public abstract class C297825sP {
    public static final C272024jy A00(C249693kD r3) {
        List Bkd;
        0qQ.A0B(r3, 0);
        if (!r3.CWu() || (Bkd = r3.Bkd(AnonymousClass3WT.POLLING)) == null || Bkd.isEmpty()) {
            return null;
        }
        return ((C255783ui) Bkd.get(0)).A0E();
    }

    public static final void A01(Context context, UserSession userSession, C272034jz r6, Integer num, Integer num2, String str, String str2, String str3, String str4, int i, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str2, 6);
        0qQ.A0B(str4, 8);
        String A09 = C61970qY.A09(context);
        String A00 = AnonymousClass9OX.A00(r6);
        1OS r1 = new 1OS();
        r1.A04 = str;
        r1.A05 = A00;
        r1.A02 = num2;
        r1.A01 = num;
        r1.A06 = A09;
        r1.A07 = str2;
        r1.A03 = str3;
        r1.A08 = str4;
        r1.A00 = i;
        r1.A09 = false;
        r1.A0A = z;
        1Ou.A01(userSession).A0A(r1);
    }

    public static final int[] A02(UserSession userSession, C249693kD r3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        C272024jy A00 = A00(r3);
        if (A00 != null) {
            return A03(userSession, A00, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int[] A04(UserSession userSession, C272034jz r8, boolean z) {
        int round;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r8, 1);
        int[] A03 = A03(userSession, r8, z);
        float f = 0.0f;
        for (int i : A03) {
            f += (float) i;
        }
        int[] iArr = new int[r7];
        if (f == 0.0f) {
            return A03;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < r7; i3++) {
            if (i3 == r7 - 1) {
                round = 100 - i2;
                if (round < 0) {
                    round = 0;
                }
            } else {
                round = Math.round((((float) A03[i3]) / f) * 100.0f);
                i2 += round;
            }
            iArr[i3] = round;
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fe A[LOOP:1: B:50:0x00fc->B:51:0x00fe, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] A03(com.instagram.common.session.UserSession r8, X.C272034jz r9, boolean r10) {
        /*
            if (r10 == 0) goto L_0x00f1
            X.Mf0 r0 = X.C52319GNl.A00(r8)
            X.Mez r6 = r0.A00
            java.lang.String r8 = X.AnonymousClass9OX.A00(r9)
            java.lang.String r3 = X.AnonymousClass9OX.A00(r9)
            java.lang.Integer r1 = r9.CFI()
            r2 = 0
            r5 = 45
            X.N4R r0 = new X.N4R
            r0.<init>((java.lang.Integer) r2, (java.lang.Integer) r1, (int) r5)
            java.lang.Object r0 = r6.A00(r3, r0)
            X.N4R r0 = (X.N4R) r0
            if (r0 == 0) goto L_0x0028
            java.lang.Object r2 = r0.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0028:
            java.lang.Integer r0 = r9.CFI()
            X.N4R r1 = new X.N4R
            r1.<init>((java.lang.Integer) r2, (java.lang.Integer) r0, (int) r5)
            java.util.Map r7 = r6.A01
            monitor-enter(r7)
            java.lang.Object r2 = r7.get(r8)     // Catch:{ all -> 0x00ee }
            X.OGz r2 = (X.C70704OGz) r2     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x005c
            boolean r0 = r2.A01     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r2.A03     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0059
            boolean r0 = r2.A01     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x005c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ee }
            long r0 = r2.A00     // Catch:{ all -> 0x00ee }
            long r3 = r3 - r0
            long r1 = r2.A02     // Catch:{ all -> 0x00ee }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
        L_0x0059:
            r7.remove(r8)     // Catch:{ all -> 0x00ee }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = X.AnonymousClass9OX.A00(r9)
            r0 = 0
            X.N4R r1 = new X.N4R
            r1.<init>((java.lang.Integer) r0, (java.lang.Integer) r0, (int) r5)
            java.lang.Object r6 = r6.A00(r2, r1)
            X.N4R r6 = (X.N4R) r6
            if (r6 == 0) goto L_0x00ec
            java.lang.Object r1 = r6.A00
        L_0x0071:
            r7 = 1
            if (r1 != 0) goto L_0x00ea
            if (r6 == 0) goto L_0x007a
            java.lang.Object r1 = r6.A02
            if (r1 != 0) goto L_0x00ea
        L_0x007a:
            r2 = 1
        L_0x007b:
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r1 = r6.A00
            java.lang.Object r0 = r6.A02
        L_0x0081:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r2 != 0) goto L_0x00f1
            if (r0 != 0) goto L_0x00f1
            java.util.List r0 = X.AnonymousClass9OX.A01(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            if (r6 == 0) goto L_0x00f5
            java.lang.Object r0 = r6.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00be
            int r4 = r0.intValue()
            java.lang.Object r1 = r5.get(r4)
            X.4jx r1 = (X.C272014jx) r1
            int r0 = X.C18687Vwl.A01(r1)
            int r0 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Float r2 = r1.B79()
            java.lang.String r1 = r1.getText()
            X.4jw r0 = new X.4jw
            r0.<init>(r2, r3, r1)
            r5.set(r4, r0)
        L_0x00be:
            java.lang.Object r0 = r6.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00f5
            int r4 = r0.intValue()
            java.lang.Object r1 = r5.get(r4)
            X.4jx r1 = (X.C272014jx) r1
            int r0 = X.C18687Vwl.A01(r1)
            int r0 = r0 - r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Float r2 = r1.B79()
            java.lang.String r1 = r1.getText()
            X.4jw r0 = new X.4jw
            r0.<init>(r2, r3, r1)
            r5.set(r4, r0)
            goto L_0x00f5
        L_0x00e8:
            r1 = r0
            goto L_0x0081
        L_0x00ea:
            r2 = 0
            goto L_0x007b
        L_0x00ec:
            r1 = r0
            goto L_0x0071
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ee }
            throw r0
        L_0x00f1:
            java.util.List r5 = X.AnonymousClass9OX.A01(r9)
        L_0x00f5:
            int r3 = r5.size()
            int[] r2 = new int[r3]
            r1 = 0
        L_0x00fc:
            if (r1 >= r3) goto L_0x0114
            java.lang.Object r0 = r5.get(r1)
            X.4jx r0 = (X.C272014jx) r0
            java.lang.Integer r0 = r0.Arb()
            X.0qQ.A0A(r0)
            int r0 = r0.intValue()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297825sP.A03(com.instagram.common.session.UserSession, X.4jz, boolean):int[]");
    }
}
