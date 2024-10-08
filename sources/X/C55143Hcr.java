package X;

/* renamed from: X.Hcr  reason: case insensitive filesystem */
public abstract class C55143Hcr {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: X.IoA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: X.IoA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r30, X.JOX r31, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r32, X.C53558GqU r33, X.0sP r34, int r35) {
        /*
            r2 = 0
            r8 = r31
            r4 = r33
            r7 = r34
            X.C51973G9u.A1E(r4, r8, r7)
            r17 = 3
            r5 = r32
            r0 = r17
            X.0qQ.A0B(r5, r0)
            r0 = 1129358592(0x4350a500, float:208.64453)
            r6 = r30
            r6.ExV(r0)
            r3 = r35
            r0 = r35 & 6
            if (r0 != 0) goto L_0x01bc
            int r1 = X.C41848B3p.A01(r6, r4)
            r1 = r1 | r35
        L_0x0027:
            r0 = r35 & 48
            if (r0 != 0) goto L_0x0034
            boolean r0 = X.G9t.A1U(r6, r8, r3)
            int r0 = X.C51970G9q.A06(r0)
            r1 = r1 | r0
        L_0x0034:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003d
            int r0 = X.G9t.A0G(r6, r7)
            r1 = r1 | r0
        L_0x003d:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0046
            int r0 = X.G9t.A0H(r6, r5)
            r1 = r1 | r0
        L_0x0046:
            r9 = r1 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r9 != r0) goto L_0x006b
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x006b
            r6.Evl()
        L_0x0055:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x006a
            r15 = 25
            X.JG7 r0 = new X.JG7
            r9 = r0
            r10 = r4
            r11 = r5
            r12 = r8
            r13 = r7
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x006a:
            return
        L_0x006b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0079
            r9 = -587121989(0xffffffffdd013abb, float:-5.8199755E17)
            java.lang.String r0 = "com.instagram.settings2.core.view.SingleSelectionEnumSetting (SingleSelectEnumSettingElement.kt:22)"
            X.0fL.A01(r9, r0)
        L_0x0079:
            X.JwL r9 = r4.A00
            r0 = 679155438(0x287b16ee, float:1.3938271E-14)
            r6.ExS(r0)
            r15 = 0
            if (r9 != 0) goto L_0x00ca
            r23 = r15
        L_0x0086:
            X.5Wx r0 = X.C51965G9l.A0H(r6, r2)
            X.JwL r9 = r4.A01
            java.lang.String r22 = X.C51968G9o.A12(r6, r9)
            X.HL9 r21 = X.HL9.Mini
            r24 = 2147483647(0x7fffffff, float:NaN)
            r25 = 196992(0x30180, float:2.76045E-40)
            r14 = 32
            r26 = 18
            r20 = r15
            r18 = r6
            r19 = r15
            X.C52747Gbz.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = 679164780(0x287b3b6c, float:1.3946184E-14)
            r6.ExS(r9)
            java.util.List r9 = r4.A05
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r9.iterator()
        L_0x00b5:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x00cf
            java.lang.Object r10 = r12.next()
            r9 = r10
            X.N47 r9 = (X.N47) r9
            boolean r9 = r9.A05
            if (r9 == 0) goto L_0x00b5
            r11.add(r10)
            goto L_0x00b5
        L_0x00ca:
            java.lang.String r23 = X.C51968G9o.A12(r6, r9)
            goto L_0x0086
        L_0x00cf:
            java.util.Iterator r16 = r11.iterator()
        L_0x00d3:
            boolean r9 = r16.hasNext()
            r12 = 1
            if (r9 == 0) goto L_0x0184
            java.lang.Object r11 = r16.next()
            X.N47 r11 = (X.N47) r11
            java.lang.Object r10 = r11.A01
            X.JwL r10 = (X.C61083JwL) r10
            r9 = 679166898(0x287b43b2, float:1.3947978E-14)
            r6.ExS(r9)
            if (r10 == 0) goto L_0x0180
            java.lang.String r29 = X.C51968G9o.A12(r6, r10)
        L_0x00f0:
            X.C286565Wx.A0L(r0, r2)
            java.lang.Object r10 = r11.A03
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String r9 = r11.A04
            java.util.ArrayList r10 = X.00k.A0T(r9, r10)
            boolean r9 = r10 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0168
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x0168
        L_0x0107:
            r10 = 0
        L_0x0108:
            java.lang.Object r9 = r11.A02
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.String r28 = X.C51968G9o.A12(r6, r9)
            boolean r9 = r4.A06
            r18 = r9
            r9 = -388594097(0xffffffffe8d6864f, float:-8.104512E24)
            boolean r13 = X.C51967G9n.A1W(r6, r9, r10)
            r9 = r1 & 112(0x70, float:1.57E-43)
            if (r9 == r14) goto L_0x0129
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0166
            boolean r9 = r6.AGw(r8)
            if (r9 == 0) goto L_0x0166
        L_0x0129:
            boolean r12 = X.C51973G9u.A1T(r6, r4, r11, r13, r12)
            java.lang.Object r9 = r6.ECw()
            if (r12 != 0) goto L_0x0137
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r9 != r12) goto L_0x0149
        L_0x0137:
            X.IoA r9 = new X.IoA
            r30 = r9
            r31 = r17
            r32 = r8
            r34 = r11
            r35 = r10
            r30.<init>(r31, r32, r33, r34, r35)
            r6.FLL(r9)
        L_0x0149:
            X.0sa r11 = X.C51965G9l.A0y(r0, r9, r2)
            X.IPm r9 = new X.IPm
            r9.<init>(r10, r11)
            r31 = 130794(0x1feea, float:1.83281E-40)
            r24 = r6
            r25 = r15
            r26 = r15
            r27 = r9
            r30 = r2
            r32 = r18
            X.C52636GaA.A08(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00d3
        L_0x0166:
            r12 = 0
            goto L_0x0129
        L_0x0168:
            java.util.Iterator r13 = r10.iterator()
        L_0x016c:
            boolean r9 = r13.hasNext()
            if (r9 == 0) goto L_0x0107
            java.lang.Object r10 = r13.next()
            java.lang.String r9 = r4.A03
            boolean r9 = X.0qQ.A0K(r10, r9)
            if (r9 == 0) goto L_0x016c
            r10 = 1
            goto L_0x0108
        L_0x0180:
            r29 = 0
            goto L_0x00f0
        L_0x0184:
            X.C286565Wx.A0L(r0, r2)
            java.util.List r2 = r4.A04
            if (r23 != 0) goto L_0x018c
            r12 = 0
        L_0x018c:
            r1 = r1 & 896(0x380, float:1.256E-42)
            X.C52744Gbw.A06(r6, r2, r7, r1, r12)
            X.MXa r9 = r4.A02
            r1 = 679197545(0x287bbb69, float:1.3973937E-14)
            boolean r2 = X.C51973G9u.A1S(r6, r5, r4, r1)
            java.lang.Object r1 = r6.ECw()
            if (r2 != 0) goto L_0x01a4
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x01ae
        L_0x01a4:
            r2 = 8
            X.MGx r1 = new X.MGx
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.AnonymousClass4D7) r15, (int) r2)
            r6.FLL(r1)
        L_0x01ae:
            boolean r0 = X.C51972G9s.A1S(r6, r0, r1, r9)
            if (r0 == 0) goto L_0x0055
            r0 = -1955596901(0xffffffff8b6ff59b, float:-4.62145E-32)
            X.0fL.A00(r0)
            goto L_0x0055
        L_0x01bc:
            r1 = r3
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55143Hcr.A00(X.5Wy, X.JOX, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.GqU, X.0sP, int):void");
    }
}
