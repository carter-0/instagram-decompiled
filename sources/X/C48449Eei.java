package X;

/* renamed from: X.Eei  reason: case insensitive filesystem */
public abstract class C48449Eei {
    /* JADX WARNING: type inference failed for: r2v3, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r18, X.AnonymousClass6Tm r19) {
        /*
            r13 = 0
            r0 = r19
            X.4tV r1 = X.DbY.A0P(r0, r13)
            java.lang.String r12 = ""
            java.lang.String r0 = r1.A0J()
            if (r0 == 0) goto L_0x0010
            r12 = r0
        L_0x0010:
            r0 = 44
            java.lang.String r11 = r1.A0K(r0)
            r0 = 45
            java.lang.String r14 = r1.A0K(r0)
            java.lang.String r10 = r1.A0F()
            X.4uI r9 = r1.A09()
            java.lang.String r17 = r1.A0I()
            java.lang.String r8 = r1.A0E()
            r0 = 38
            r2 = 0
            long r4 = r1.A04(r0, r2)
            r0 = 42
            int r7 = r1.A03(r0, r13)
            r0 = 46
            boolean r6 = r1.A0R(r0, r13)
            r0 = 48
            boolean r16 = r1.A0R(r0, r13)
            X.6ap r1 = X.DbS.A0a()
            if (r14 == 0) goto L_0x012a
            int r15 = r14.hashCode()
            r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r15 == r0) goto L_0x011e
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r15 != r0) goto L_0x012a
            java.lang.String r0 = "error"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x012a
            X.6aq r0 = X.C310346aq.ERROR
        L_0x0064:
            r1.A0D = r12
            r1.A0I = r11
            r1.A0C = r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            int r0 = (int) r4
            r1.A01 = r0
        L_0x0071:
            r3 = r18
            if (r10 == 0) goto L_0x0088
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0088
            r0 = 1
            r1.A0L = r0
            r1.A0G = r10
            X.FdJ r0 = new X.FdJ
            r0.<init>((X.C307896Rx) r3, (X.C277014uI) r9, (int) r13)
            r1.A0A(r0)
        L_0x0088:
            X.6ar r2 = X.C310356ar.SQUARE
            if (r8 == 0) goto L_0x0096
            java.lang.String r0 = "circle"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0096
            X.6ar r2 = X.C310356ar.CIRCULAR
        L_0x0096:
            if (r17 == 0) goto L_0x00ab
            int r0 = r17.length()
            if (r0 == 0) goto L_0x00ab
            r1.A0B = r2
            android.net.Uri r2 = X.DbT.A09(r17)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r2, r0, r0)
            r1.A09 = r0
        L_0x00ab:
            r1.A02 = r7
            r1.A0R = r6
            X.2nI r4 = X.C308206Td.A06(r3)
            X.Dc2 r5 = r1.A00()
            X.0rm r2 = new X.0rm
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r3)
            boolean r0 = r1 instanceof X.C249463jp
            r6 = 0
            if (r0 == 0) goto L_0x011c
            X.3jp r1 = (X.C249463jp) r1
        L_0x00c7:
            r2.A00 = r1
            if (r16 == 0) goto L_0x00ea
            X.6Rm r1 = X.C308206Td.A09(r3)
            r0 = 2131428735(0x7f0b057f, float:1.8479123E38)
            java.lang.Object r0 = r1.A00(r0)
            X.6Rk r0 = (X.C307776Rk) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x011a
            java.lang.Object r1 = r0.get()
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x00e2:
            boolean r0 = r1 instanceof X.C249463jp
            if (r0 == 0) goto L_0x0118
            X.3jp r1 = (X.C249463jp) r1
        L_0x00e8:
            r2.A00 = r1
        L_0x00ea:
            if (r1 == 0) goto L_0x00f5
            X.3M8 r0 = r1.Bx5()
            if (r0 == 0) goto L_0x00f5
            r0.A0A(r5)
        L_0x00f5:
            java.lang.Object r0 = r2.A00
            X.3jp r0 = (X.C249463jp) r0
            if (r0 == 0) goto L_0x0117
            X.3M8 r0 = r0.Bx5()
            if (r0 == 0) goto L_0x0117
            int r1 = r5.A00
            if (r1 != 0) goto L_0x010b
            X.0eM r0 = X.Dc2.A0T
            int r1 = X.DbX.A07(r0)
        L_0x010b:
            r0 = -1
            if (r1 != r0) goto L_0x0117
            r1 = 1
            X.EED r0 = new X.EED
            r0.<init>(r1, r5, r4, r2)
            X.C308206Td.A0K(r3, r0)
        L_0x0117:
            return r6
        L_0x0118:
            r1 = r6
            goto L_0x00e8
        L_0x011a:
            r1 = 0
            goto L_0x00e2
        L_0x011c:
            r1 = r6
            goto L_0x00c7
        L_0x011e:
            java.lang.String r0 = "success"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x012a
            X.6aq r0 = X.C310346aq.SUCCESS
            goto L_0x0064
        L_0x012a:
            X.6aq r0 = X.C310346aq.DEFAULT
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48449Eei.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
