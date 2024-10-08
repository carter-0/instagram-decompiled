package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.OcY  reason: case insensitive filesystem */
public abstract class C71098OcY {
    public static final AnonymousClass0K0 A00 = AnonymousClass0K0.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r3.charAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0018
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0018
            char r1 = r3.charAt(r2)
            r0 = 95
            if (r1 == r0) goto L_0x0018
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71098OcY.A03(java.lang.String):boolean");
    }

    public static String A01(C60400gq r3, List list, boolean z) {
        C71614Onp onp = new C71614Onp(r3);
        try {
            0Df A02 = A00.A02();
            A02(A02.A0B("configs"), onp, list, z);
            return A00(A02);
        } catch (IOException e) {
            0KC.A0F("MobileConfigDebugUtil", "Failed to generate consistency logging JSON", e);
            return null;
        }
    }

    public static String A00(0Df r3) {
        StringWriter A0v = JTO.A0v();
        0Dd A002 = 0Dd.A00();
        0Sd.A01(A002, "encoder cannot be null!");
        r3.A02 = A002;
        0Sd.A01(A002, "No encoder set, please call setEncoder() first!");
        r3.A02.A04(r3, A0v);
        r3.A02();
        return A0v.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r5 >= 16384) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if ((r7 instanceof X.AnonymousClass1AG) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.0Df r21, X.C74294PsO r22, java.util.Collection r23, boolean r24) {
        /*
            X.0Tu r0 = X.C66581MXm.A0G()
            r14 = 1
            r0.A03 = r14
            X.0Tu r13 = X.0Tu.A00(r0)
            r13.A02 = r14
            java.util.Iterator r20 = r23.iterator()
            java.lang.String r15 = ""
            r2 = r15
            r9 = 0
            r8 = 0
        L_0x0016:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r12 = r20.next()
            X.5I0 r12 = (X.AnonymousClass5I0) r12
            if (r24 != 0) goto L_0x0029
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            int r1 = r12.A03
            java.lang.String r11 = r12.A00
            if (r1 <= 0) goto L_0x0142
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 >= r0) goto L_0x0142
            java.lang.String r10 = java.lang.String.valueOf(r1)
        L_0x0037:
            if (r9 == 0) goto L_0x012f
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L_0x012f
            r10 = r2
        L_0x0040:
            r0 = r22
            X.0gq r7 = r0.Aqr(r12)
            if (r7 == 0) goto L_0x00d4
            long r3 = r12.A00()
            X.0K0 r0 = r8.A01
            X.0Df r6 = r0.A02()
            r8.A0B(r6)
            int r5 = r12.A04
            r0 = -1
            if (r5 == r0) goto L_0x005f
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = 0
            if (r5 < r1) goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            java.lang.String r2 = "k"
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "pname"
            X.0Df.A00(r6, r1, r0)
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.0Df.A00(r6, r0, r2)
            int r1 = r12.A06
            java.lang.String r2 = "src"
            if (r1 != r14) goto L_0x00dc
            boolean r0 = r7.Ah0(r13, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "bln"
        L_0x0082:
            X.0Df.A00(r6, r1, r0)
        L_0x0085:
            X.0U0 r0 = r13.A00
            com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = r0.A00
            int r0 = r0.getSource()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.0Df.A00(r6, r0, r2)
        L_0x0094:
            boolean r0 = r7 instanceof X.1AA
            if (r0 == 0) goto L_0x00d7
            r1 = r7
            X.1AA r1 = (X.1AA) r1
            if (r1 == 0) goto L_0x00d7
            int r0 = r12.A02
            X.0gq r7 = r1.A09(r0)
        L_0x00a3:
            X.1AG r7 = (X.AnonymousClass1AG) r7
            if (r7 == 0) goto L_0x00d4
            int r0 = r7.C9b()
            if (r0 == 0) goto L_0x00b6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "tt"
            X.0Df.A00(r6, r1, r0)
        L_0x00b6:
            java.lang.String r2 = r7.BOC(r3)
            int r1 = r7.BOH(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00d4
            if (r1 == 0) goto L_0x00d4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "lm"
            X.0Df.A00(r6, r1, r0)
            java.lang.String r0 = "li"
            X.0Df.A00(r6, r2, r0)
        L_0x00d4:
            r2 = r10
            goto L_0x0016
        L_0x00d7:
            boolean r0 = r7 instanceof X.AnonymousClass1AG
            if (r0 == 0) goto L_0x00d4
            goto L_0x00a3
        L_0x00dc:
            r0 = 2
            if (r1 != r0) goto L_0x00ea
            long r0 = r7.BOa(r13, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "i64"
            goto L_0x0082
        L_0x00ea:
            r0 = 3
            if (r1 != r0) goto L_0x010d
            r0 = 60
            long r18 = r3 >>> r0
            r16 = 1
            long r18 = r18 & r16
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r1 = "str"
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r7.C1w(r13, r15, r3)
        L_0x0103:
            X.0Df.A00(r6, r0, r1)
            goto L_0x0085
        L_0x0108:
            java.lang.String r0 = r7.C1v(r13, r3)
            goto L_0x0103
        L_0x010d:
            r0 = 4
            if (r1 != r0) goto L_0x011c
            double r0 = r7.Aym(r13, r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "dbl"
            goto L_0x0082
        L_0x011c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = r12.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r11, r0}
            java.lang.String r1 = "MobileConfigDebugUtil"
            java.lang.String r0 = "Caught unsupported type %d for config %s, param %s in api consistency logging"
            X.0KC.A0Q(r1, r0, r2)
            goto L_0x0094
        L_0x012f:
            r0 = r21
            X.0Df r9 = r0.A0B(r10)
            java.lang.String r1 = "fields"
            X.0K0 r0 = r9.A01
            X.0Dv r8 = r0.A01()
            r9.A0E(r8, r1)
            goto L_0x0040
        L_0x0142:
            r10 = r11
            goto L_0x0037
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71098OcY.A02(X.0Df, X.PsO, java.util.Collection, boolean):void");
    }
}
