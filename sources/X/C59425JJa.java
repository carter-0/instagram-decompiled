package X;

import java.util.List;

/* renamed from: X.JJa  reason: case insensitive filesystem */
public final class C59425JJa extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59425JJa(String str, List list, 0sP r4, int i) {
        super(4);
        this.A00 = i;
        this.A01 = list;
        this.A03 = str;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        if ((r6 & 48) == 32) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ae, code lost:
        if (r0 != r3) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c9, code lost:
        r8.Evl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r8 = r18
            int r1 = r15.A00
            int r3 = X.AnonymousClass7TE.A0M(r17)
            X.5Wy r8 = (X.C286575Wy) r8
            int r4 = X.AnonymousClass7TE.A0M(r19)
            r0 = r4 & 6
            r2 = r16
            switch(r1) {
                case 0: goto L_0x0165;
                case 1: goto L_0x00cf;
                default: goto L_0x0015;
            }
        L_0x0015:
            if (r0 != 0) goto L_0x00cc
            int r0 = X.G9t.A0O(r8, r2)
            r1 = r4 | r0
        L_0x001d:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A06(r8, r3)
            r1 = r1 | r0
        L_0x0026:
            r1 = r1 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0032
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x01c9
        L_0x0032:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003e
            r0 = 403561764(0x180ddd24, float:1.833547E-24)
            X.C51965G9l.A17(r0)
        L_0x003e:
            java.lang.Object r0 = r15.A01
            java.lang.Object r5 = X.C51966G9m.A19(r0, r3)
            com.instagram.schools.management.data.SchoolInfo r5 = (com.instagram.schools.management.data.SchoolInfo) r5
            r0 = 37173988(0x2373ae4, float:1.3461617E-37)
            r8.ExS(r0)
            com.instagram.schools.management.data.SchoolAddress r6 = r5.A00
            java.lang.String r4 = r6.A02
            int r0 = r4.length()
            r2 = 0
            if (r0 != 0) goto L_0x00ba
            r0 = 37215837(0x237de5d, float:1.3508532E-37)
            r8.ExS(r0)
            r3 = 2131972707(0x7f135263, float:1.958243E38)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = r6.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
        L_0x0068:
            java.lang.String r13 = X.C288035bG.A01(r8, r0, r3)
            X.5Wx r4 = X.C51965G9l.A0H(r8, r2)
            java.lang.String r12 = r5.A02
            r9 = 0
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r15.A03
            boolean r6 = X.0qQ.A0K(r1, r0)
            r0 = -1938444109(0xffffffff8c75b0b3, float:-1.8927287E-31)
            r8.ExS(r0)
            java.lang.Object r3 = r15.A02
            boolean r1 = X.C51971G9r.A1T(r8, r3, r5)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0091
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x009b
        L_0x0091:
            r1 = 27
            X.PqS r0 = new X.PqS
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3)
            r8.FLL(r0)
        L_0x009b:
            X.0sP r0 = X.C51965G9l.A0z(r4, r0)
            X.IPl r11 = new X.IPl
            r11.<init>(r0, r6)
            r14 = 130798(0x1feee, float:1.83287E-40)
            r10 = r9
            X.C52636GaA.A07(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = X.C51967G9n.A1b(r4, r2)
            if (r0 == 0) goto L_0x00b7
            r0 = 1523222920(0x5aca8988, float:2.85045813E16)
        L_0x00b4:
            X.0fL.A00(r0)
        L_0x00b7:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ba:
            r0 = 37334939(0x239af9b, float:1.364205E-37)
            r8.ExS(r0)
            r3 = 2131972708(0x7f135264, float:1.9582431E38)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = r6.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r4}
            goto L_0x0068
        L_0x00cc:
            r1 = r4
            goto L_0x001d
        L_0x00cf:
            if (r0 != 0) goto L_0x0162
            int r0 = X.G9t.A0O(r8, r2)
            r2 = r4 | r0
        L_0x00d7:
            r0 = r4 & 48
            r7 = 32
            if (r0 != 0) goto L_0x00e2
            int r0 = X.G9t.A06(r8, r3)
            r2 = r2 | r0
        L_0x00e2:
            r1 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x00ee
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x01c9
        L_0x00ee:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00fa
            r0 = 1271076087(0x4bc314f7, float:2.5569774E7)
            X.C51965G9l.A17(r0)
        L_0x00fa:
            java.lang.Object r0 = r15.A01
            java.lang.Object r4 = X.C51966G9m.A19(r0, r3)
            r6 = r2 & 14
            java.lang.String r4 = (java.lang.String) r4
            r0 = -1334607617(0xffffffffb07380ff, float:-8.85862E-10)
            r8.ExS(r0)
            java.lang.String r0 = r15.A03
            boolean r5 = X.0qQ.A0K(r4, r0)
            r0 = -1428519912(0xffffffffaada8418, float:-3.8816238E-13)
            r8.ExS(r0)
            java.lang.Object r3 = r15.A02
            boolean r2 = r8.AGu(r3)
            r0 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r7) goto L_0x0128
            boolean r0 = r8.AGu(r4)
            if (r0 != 0) goto L_0x012d
        L_0x0128:
            r0 = r6 & 48
            r1 = 0
            if (r0 != r7) goto L_0x012e
        L_0x012d:
            r1 = 1
        L_0x012e:
            r1 = r1 | r2
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0139
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0142
        L_0x0139:
            r1 = 1
            X.Iwl r0 = new X.Iwl
            r0.<init>(r4, r3, r1)
            r8.FLL(r0)
        L_0x0142:
            X.0sP r0 = (X.0sP) r0
            r3 = r8
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            X.IPl r1 = new X.IPl
            r1.<init>(r0, r5)
            int r0 = r6 >> 3
            r0 = r0 & 14
            X.C52636GaA.A0Q(r8, r1, r4, r0)
            boolean r0 = X.C51967G9n.A1b(r3, r2)
            if (r0 == 0) goto L_0x00b7
            r0 = -480126426(0xffffffffe361da26, float:-4.1662367E21)
            goto L_0x00b4
        L_0x0162:
            r2 = r4
            goto L_0x00d7
        L_0x0165:
            if (r0 != 0) goto L_0x01c7
            int r2 = X.G9t.A0O(r8, r2)
            r2 = r2 | r4
        L_0x016c:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0175
            int r0 = X.G9t.A06(r8, r3)
            r2 = r2 | r0
        L_0x0175:
            r1 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0181
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x01c9
        L_0x0181:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x018d
            r0 = 1313511069(0x4e4a969d, float:8.4971706E8)
            X.C51965G9l.A17(r0)
        L_0x018d:
            java.lang.Object r0 = r15.A01
            java.lang.Object r5 = X.C51966G9m.A19(r0, r3)
            r4 = r2 & 14
            X.JLr r5 = (X.C59493JLr) r5
            r0 = -125132948(0xfffffffff88a9f6c, float:-2.2492826E34)
            r8.ExS(r0)
            java.lang.String r3 = r15.A03
            if (r3 == 0) goto L_0x01b0
            boolean r1 = r5 instanceof X.IQK
            r0 = 0
            if (r1 == 0) goto L_0x01ad
            r1 = r5
            X.IQK r1 = (X.IQK) r1
            if (r1 == 0) goto L_0x01ad
            java.lang.String r0 = r1.A02
        L_0x01ad:
            r2 = 1
            if (r0 == r3) goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            java.lang.Object r1 = r15.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r4 >> 3
            r0 = r0 & 14
            X.C56272Hvg.A00(r8, r5, r1, r0, r2)
            boolean r0 = X.C51970G9q.A1Z(r8)
            if (r0 == 0) goto L_0x00b7
            r0 = 251686805(0xf006f95, float:6.332377E-30)
            goto L_0x00b4
        L_0x01c7:
            r2 = r4
            goto L_0x016c
        L_0x01c9:
            r8.Evl()
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59425JJa.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
