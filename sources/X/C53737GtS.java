package X;

import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.GtS  reason: case insensitive filesystem */
public final class C53737GtS extends C251343mx {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C53737GtS(FoaUserSession foaUserSession, String str, String str2, List list) {
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r40) {
        /*
            r39 = this;
            r9 = 0
            r11 = r40
            X.0qQ.A0B(r11, r9)
            X.2V1 r10 = r11.A05
            java.lang.Class<X.F3q> r0 = X.C49726F3q.class
            java.lang.Object r2 = r10.A06(r0)
            if (r2 == 0) goto L_0x00fc
            r1 = 8
            X.JG0 r0 = new X.JG0
            r12 = r39
            r0.<init>(r1, r2, r12)
            X.0sL r8 = X.AnonymousClass3j0.A02(r11, r0)
            r0 = 39
            X.Ivv r0 = X.C58686Ivv.A00(r12, r0)
            X.0sa r2 = X.AnonymousClass3j0.A00(r11, r0)
            r1 = 28
            X.TTN r0 = new X.TTN
            r0.<init>(r2, r1)
            X.2Wa r0 = X.C243643Zq.A00(r11, r0)
            java.lang.Object r3 = r0.A03
            X.Spj r3 = (X.C12229Spj) r3
            java.util.List r0 = r12.A03
            r17 = r0
            java.util.Iterator r2 = r17.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r7 = r2.next()
            com.meta.foa.accountswitcher.UserAccountInfo r7 = (com.meta.foa.accountswitcher.UserAccountInfo) r7
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "CURRENT"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "CURRENT_AP"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
        L_0x005c:
            X.HKy r0 = X.C54615HKy.A02
            X.HPu r6 = X.I3H.A01(r11, r0)
            r14 = 1
            X.3XV r0 = X.2WX.A02
            r0 = -4602678819172646912(0xc020000000000000, double:-8.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A08
            r5 = 0
            X.2WX r13 = X.AnonymousClass9JR.A00(r5, r2, r9, r0)
            r4 = 2
            X.0qQ.A0B(r3, r4)
            X.0gF r2 = X.C60340gF.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.3ar r0 = new X.3ar
            r0.<init>(r3, r2)
            X.2WX r20 = X.C51971G9r.A0Y(r13, r1, r0, r4)
            long r2 = X.C51969G9p.A0D()
            X.3AS r16 = X.C336767f9.A00
            X.3X5 r0 = r10.A02
            X.2Sa r0 = r0.A01
            X.3X7 r13 = r0.A02
            boolean r4 = r0.A0W
            X.7en r1 = new X.7en
            r1.<init>(r10)
            com.meta.foa.session.FoaUserSession r12 = r12.A00
            java.lang.String r15 = r7.A08
            X.J51 r7 = X.J51.A00
            X.0qQ.A0B(r12, r14)
            r0 = 4
            X.C51973G9u.A0u(r0, r8, r7, r6)
            X.Iy1 r0 = new X.Iy1
            r23 = r17
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r8
            r28 = r12
            r29 = r15
            r30 = r14
            r21 = r0
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.I3H.A02(r1, r6, r0)
            int r0 = X.G9t.A0i(r11, r2)
            X.7f1 r22 = X.C336677f0.A00(r10, r13, r0, r4)
            X.7eo r0 = r1.A01
            X.7f3 r15 = new X.7f3
            r18 = r5
            r19 = r5
            r21 = r5
            r23 = r0
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r5
            r36 = r5
            r37 = r14
            r38 = r9
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r15
        L_0x00f1:
            r0 = 3
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53737GtS.A0X(X.3Y5):X.3mp");
    }
}
