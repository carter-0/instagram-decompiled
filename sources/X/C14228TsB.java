package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TsB  reason: case insensitive filesystem */
public final class C14228TsB {
    public int A00;
    public final UserSession A01;
    public final C229132mt A02;
    public final C20952X6f A03;
    public final C234312xe A04;
    public final Integer A05;
    public final boolean A06;

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0103 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C14228TsB r10, int r11, int r12, int r13) {
        /*
            X.2xe r1 = r10.A04
            int r0 = r1.A00
            if (r0 <= r11) goto L_0x002d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0008:
            r1.A01 = r0
        L_0x000a:
            r1.A00 = r11
            if (r13 <= 0) goto L_0x0103
            if (r12 <= 0) goto L_0x0103
            boolean r0 = r10.A06
            if (r0 != 0) goto L_0x0016
            if (r13 <= r12) goto L_0x0103
        L_0x0016:
            java.lang.Integer r0 = r1.A01
            java.lang.Integer r2 = r1.A02
            if (r0 != r2) goto L_0x0103
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x0032
            r1 = 407161133(0x1844c92d, float:2.5433974E-24)
            java.lang.String r0 = "LookingAheadScrollingPolicy.isInLoadMoreRange"
            X.0fS.A01(r0, r1)
            goto L_0x0032
        L_0x002d:
            if (r0 >= r11) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0008
        L_0x0032:
            int r1 = r2.intValue()     // Catch:{ all -> 0x00e5 }
            r3 = 0
            r0 = 1
            if (r1 == r3) goto L_0x0098
            int r11 = r11 + r12
            r5 = 0
        L_0x003c:
            X.X6f r7 = r10.A03     // Catch:{ all -> 0x00e5 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x00e5 }
            if (r11 >= r0) goto L_0x0089
            int r0 = r10.A00     // Catch:{ all -> 0x00e5 }
            if (r5 > r0) goto L_0x0089
            if (r11 < 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r6 = 0
            goto L_0x0057
        L_0x004d:
            int r0 = r7.getCount()     // Catch:{ all -> 0x00e5 }
            if (r11 >= r0) goto L_0x004b
            java.lang.Object r6 = r7.getItem(r11)     // Catch:{ all -> 0x00e5 }
        L_0x0057:
            boolean r0 = r6 instanceof X.C262434Ec     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r4 = r10.A01     // Catch:{ all -> 0x00e5 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x00e5 }
            r0 = 36331171306554305(0x811302000043c1, double:3.039317255924874E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x006b
            goto L_0x0086
        L_0x006b:
            int r1 = r11 + -1
            if (r1 < 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r0 = 0
            goto L_0x007c
        L_0x0072:
            int r0 = r7.getCount()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r0) goto L_0x0070
            java.lang.Object r0 = r7.getItem(r1)     // Catch:{ all -> 0x00e5 }
        L_0x007c:
            boolean r0 = X.C14229TsC.A00(r6, r0)     // Catch:{ all -> 0x00e5 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0086
            int r5 = r5 + 1
        L_0x0086:
            int r11 = r11 + 1
            goto L_0x003c
        L_0x0089:
            int r0 = r10.A00     // Catch:{ all -> 0x00e5 }
            if (r5 > r0) goto L_0x008e
            r3 = 1
        L_0x008e:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x0100
            r0 = 639809825(0x2622b921, float:5.6455937E-16)
            goto L_0x00fd
        L_0x0098:
            int r11 = r11 - r0
            r5 = 0
        L_0x009a:
            if (r11 < 0) goto L_0x00e0
            int r0 = r10.A00     // Catch:{ all -> 0x00e5 }
            if (r5 > r0) goto L_0x00e0
            X.X6f r7 = r10.A03     // Catch:{ all -> 0x00e5 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x00e5 }
            if (r11 >= r0) goto L_0x00c0
            java.lang.Object r6 = r7.getItem(r11)     // Catch:{ all -> 0x00e5 }
        L_0x00ac:
            boolean r0 = r6 instanceof X.C262434Ec     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r4 = r10.A01     // Catch:{ all -> 0x00e5 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x00e5 }
            r0 = 36331171306554305(0x811302000043c1, double:3.039317255924874E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00c2
            goto L_0x00dd
        L_0x00c0:
            r6 = 0
            goto L_0x00ac
        L_0x00c2:
            int r1 = r11 + 1
            if (r1 < 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r0 = 0
            goto L_0x00d3
        L_0x00c9:
            int r0 = r7.getCount()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r0) goto L_0x00c7
            java.lang.Object r0 = r7.getItem(r1)     // Catch:{ all -> 0x00e5 }
        L_0x00d3:
            boolean r0 = X.C14229TsC.A00(r6, r0)     // Catch:{ all -> 0x00e5 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00dd
            int r5 = r5 + 1
        L_0x00dd:
            int r11 = r11 + -1
            goto L_0x009a
        L_0x00e0:
            int r0 = r10.A00     // Catch:{ all -> 0x00e5 }
            if (r5 > r0) goto L_0x00f4
            goto L_0x00f3
        L_0x00e5:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00f2
            r0 = 2092836559(0x7cbe26cf, float:7.898588E36)
            X.0fS.A00(r0)
        L_0x00f2:
            throw r1
        L_0x00f3:
            r3 = 1
        L_0x00f4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x0100
            r0 = 1928235170(0x72ee88a2, float:9.449294E30)
        L_0x00fd:
            X.0fS.A00(r0)
        L_0x0100:
            r0 = 1
            if (r3 != 0) goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14228TsB.A00(X.TsB, int, int, int):boolean");
    }

    public C14228TsB(UserSession userSession, C229132mt r3, C20952X6f x6f, Integer num, Integer num2, int i, boolean z) {
        this.A01 = userSession;
        this.A03 = x6f;
        this.A02 = r3;
        this.A05 = num;
        this.A00 = i;
        this.A06 = z;
        this.A04 = new C234312xe(num2);
    }
}
