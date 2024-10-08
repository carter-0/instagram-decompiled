package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GwN  reason: case insensitive filesystem */
public final class C53917GwN extends C251343mx {
    public static final C284945Oz A0E;
    public static final C284945Oz A0F;
    public final float A00;
    public final float A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass3W1 A06;
    public final JTB A07;
    public final HK1 A08;
    public final GEG A09;
    public final ClipsViewerConfig A0A;
    public final C52046GCs A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C53917GwN(GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r7, AnonymousClass3W1 r8, JTB jtb, HK1 hk1, C52046GCs gCs, float f, float f2, boolean z, boolean z2) {
        AnonymousClass7TF.A1F(jtb, 6, hk1);
        0qQ.A0B(gCs, 10);
        this.A04 = userSession;
        this.A02 = r4;
        this.A09 = geg;
        this.A03 = gDe;
        this.A06 = r8;
        this.A07 = jtb;
        this.A05 = r7;
        this.A08 = hk1;
        this.A0A = clipsViewerConfig;
        this.A0B = gCs;
        this.A0D = z;
        this.A01 = f;
        this.A00 = f2;
        this.A0C = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r14 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012f, code lost:
        if (r13 != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016b, code lost:
        if (X.182.A06(r7, r10, 36321761033987782L) != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ad, code lost:
        r9 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x034d, code lost:
        if (r1 > X.0nA.A00(r9, r11)) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r69) {
        /*
            r68 = this;
            r2 = 0
            r67 = r69
            r0 = r67
            X.0qQ.A0B(r0, r2)
            r4 = r68
            X.HK1 r3 = r4.A08
            float r1 = r3.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            float r12 = r4.A01
            float r6 = r4.A00
            android.content.Context r9 = r3.A06
            android.app.Activity r5 = X.C61270mF.A00(r9)
            int r0 = X.0nA.A05(r9)
            float r11 = (float) r0
            int r1 = X.2db.A01(r5)
            int r0 = X.0Pn.A00(r5)
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 + r6
            float r11 = r11 - r0
            com.instagram.common.session.UserSession r8 = r3.A0H
            boolean r15 = X.C56375HxT.A01(r8)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321761033791171(0x810a73000926c3, double:3.0333661615373414E-306)
            boolean r13 = X.182.A06(r7, r8, r0)
            r5 = 36321761033529023(0x810a73000526bf, double:3.033366161371558E-306)
            boolean r14 = X.182.A06(r7, r8, r5)
            r1 = 1121452032(0x42d80000, float:108.0)
            if (r15 == 0) goto L_0x004e
            r1 = 1118437376(0x42aa0000, float:85.0)
        L_0x004e:
            int r10 = r3.A0F()
            boolean r0 = X.C56375HxT.A00(r8)
            if (r0 == 0) goto L_0x005d
            float r0 = X.0nA.A00(r9, r1)
            float r11 = r11 - r0
        L_0x005d:
            boolean r0 = X.C56375HxT.A00(r8)
            if (r0 == 0) goto L_0x006c
            boolean r0 = X.C56375HxT.A01(r8)
            if (r0 != 0) goto L_0x006c
            r0 = 1110441984(0x42300000, float:44.0)
            float r11 = r11 - r0
        L_0x006c:
            if (r15 == 0) goto L_0x006f
            float r11 = r11 - r12
        L_0x006f:
            r0 = 24
            float r1 = X.0nA.A04(r9, r0)
            if (r13 != 0) goto L_0x007a
            r0 = 1109393408(0x42200000, float:40.0)
            float r11 = r11 - r0
        L_0x007a:
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r1
            float r11 = r11 - r0
            float r10 = (float) r10
            float r11 = r11 / r10
            r3.A00 = r11
            float r0 = r3.A00
            float r11 = X.HK1.A00(r3, r0)
            r0 = 37166185964437925(0x840a73001101a5, double:3.5673838879046225E-306)
            double r12 = X.182.A00(r7, r8, r0)
            r15 = 0
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x030b
            if (r14 == 0) goto L_0x009f
        L_0x0099:
            float r0 = r3.A00
            float r11 = X.0nA.A01(r9, r0)
        L_0x009f:
            r3.A00 = r11
            float r1 = r11 * r10
            r0 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 + r0
            r3.A01 = r1
            X.5Oz r0 = A0E
            X.C51967G9n.A14(r0, r11)
            X.5Oz r1 = A0F
            float r0 = r3.A01
            X.C51967G9n.A14(r1, r0)
        L_0x00b4:
            r0 = 12
            X.J6N r34 = X.J6N.A00(r4, r0)
            r0 = r67
            X.2V1 r14 = r0.A05
            java.util.List r0 = r3.A0G()
            X.1Xj r0 = X.DbZ.A0T(r0, r2)
            android.content.Context r6 = X.C51965G9l.A0B(r14)
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r0.A1n(r6)
            com.instagram.common.session.UserSession r10 = r4.A04
            X.0Tu r7 = X.DbS.A0J(r10, r2)
            r0 = 36321761033463486(0x810a73000426be, double:3.033366161330112E-306)
            boolean r0 = X.182.A06(r7, r10, r0)
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r0 == 0) goto L_0x0308
            if (r5 == 0) goto L_0x0308
            X.4DU r1 = r4.A05
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.O1D.A00(r5)
            X.Gtf r9 = new X.Gtf
            r9.<init>(r0, r1)
        L_0x00ee:
            X.3XV r0 = X.2WX.A02
            r0 = 13
            X.J6N r1 = X.J6N.A00(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.9JS r0 = X.C51968G9o.A0e(r0, r1)
            r5 = 0
            X.2WX r33 = X.C51965G9l.A0X(r5, r0)
            r0 = 36321761033922245(0x810a73000b26c5, double:3.033366161620233E-306)
            boolean r32 = X.182.A06(r7, r10, r0)
            r0 = 36321761033856708(0x810a73000a26c4, double:3.033366161578787E-306)
            boolean r13 = X.182.A06(r7, r10, r0)
            r0 = 36321761033791171(0x810a73000926c3, double:3.0333661615373414E-306)
            boolean r31 = X.182.A06(r7, r10, r0)
            r0 = 37166185964437925(0x840a73001101a5, double:3.5673838879046225E-306)
            double r11 = X.182.A00(r7, r10, r0)
            r18 = 0
            r57 = 1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0131
            r62 = -1
            if (r13 == 0) goto L_0x0133
        L_0x0131:
            r62 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0133:
            X.Iuq r1 = X.C58619Iuq.A00
            r0 = r67
            X.3Zt r13 = X.C243633Zp.A00(r0, r1)
            java.lang.Object[] r12 = X.C51966G9m.A1b()
            r11 = 29
            X.GL3 r1 = new X.GL3
            r0 = r31
            r1.<init>(r11, r13, r4, r0)
            r0 = r67
            X.C243773a4.A00(r0, r1, r12)
            int r0 = r3.A02()
            float r0 = (float) r0
            r51 = r0
            r0 = 37166185964568999(0x840a73001301a7, double:3.567383887987514E-306)
            double r11 = X.182.A00(r7, r10, r0)
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x016d
            r0 = 36321761033987782(0x810a73000c26c6, double:3.033366161661679E-306)
            boolean r0 = X.182.A06(r7, r10, r0)
            r11 = 1
            if (r0 == 0) goto L_0x016e
        L_0x016d:
            r11 = 0
        L_0x016e:
            boolean r0 = X.C56375HxT.A00(r10)
            if (r0 == 0) goto L_0x02fc
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
        L_0x0176:
            long r16 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r30 = X.AnonymousClass05K.A01
            r0 = r30
            X.2WX r0 = X.C51971G9r.A0X(r5, r0, r8, r2)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.2WX r1 = X.C51971G9r.A0X(r0, r6, r8, r2)
            X.3b9 r0 = X.C244413b9.ABSOLUTE
            java.lang.Integer r15 = X.AnonymousClass05K.A0Y
            r5 = 3
            X.2WX r1 = X.C51971G9r.A0Y(r1, r15, r0, r5)
            r0 = r33
            X.2WX r29 = r1.A00(r0)
            X.3Zh r28 = X.C243573Zh.CENTER
            if (r11 == 0) goto L_0x02f8
            X.3Zi r27 = X.C243583Zi.CENTER
        L_0x019d:
            r8 = 0
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r14)
            if (r9 == 0) goto L_0x01a7
            r14.A00(r9)
        L_0x01a7:
            boolean r0 = X.C56375HxT.A00(r10)
            if (r0 == 0) goto L_0x01f5
            X.4bN r9 = r4.A02
            com.instagram.user.model.User r44 = r9.A08(r10)
            if (r44 == 0) goto L_0x01f5
            X.GEG r0 = r4.A09
            r24 = r0
            X.4DU r0 = r4.A05
            r23 = r0
            X.GDe r0 = r4.A03
            r22 = r0
            X.JTB r0 = r4.A07
            r21 = r0
            com.instagram.clips.intf.ClipsViewerConfig r0 = r4.A0A
            r20 = r0
            X.GCs r13 = r4.A0B
            boolean r12 = r4.A0D
            boolean r11 = r4.A0C
            float r1 = r4.A00
            X.GwT r0 = new X.GwT
            r35 = r0
            r36 = r33
            r37 = r24
            r38 = r20
            r39 = r9
            r40 = r22
            r41 = r23
            r42 = r10
            r43 = r23
            r45 = r21
            r46 = r13
            r47 = r1
            r48 = r12
            r49 = r11
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r14.A00(r0)
        L_0x01f5:
            r0 = r28
            X.2WX r1 = X.C51971G9r.A0Y(r8, r6, r0, r5)
            X.3b9 r26 = X.C244413b9.RELATIVE
            r0 = r26
            X.2WX r9 = X.C51971G9r.A0Y(r1, r15, r0, r5)
            long r11 = X.C51970G9q.A0K()
            long r24 = java.lang.Double.doubleToRawLongBits(r18)
            r0 = r24
            X.2WX r13 = X.C51972G9s.A0S(r9, r2, r0)
            java.lang.Integer r23 = X.AnonymousClass05K.A08
            r9 = r23
            r0 = r16
            X.2WX r1 = X.AnonymousClass9JR.A00(r13, r9, r2, r0)
            java.lang.Integer r22 = X.AnonymousClass05K.A0A
            r0 = r22
            X.2WX r21 = X.AnonymousClass9JR.A00(r1, r0, r2, r11)
            X.2V1 r0 = r14.A00
            r66 = r0
            X.2Wb r11 = X.AnonymousClass7TG.A0S(r66)
            int r64 = r3.A0F()
            X.3B3 r0 = r3.A03
            r37 = r0
            X.0eM r0 = r3.A06
            java.lang.Object r20 = r0.getValue()
            r0 = r20
            X.7cD r0 = (X.C334997cD) r0
            r20 = r0
            X.5Oz r0 = A0F
            float r0 = X.C51971G9r.A02(r0)
            double r0 = (double) r0
            r9 = r30
            X.2WX r12 = X.C51973G9u.A0X(r8, r9, r0, r2)
            com.instagram.common.session.UserSession r9 = r3.A0H
            r0 = 37166185964503462(0x840a73001201a6, double:3.5673838879460683E-306)
            double r18 = X.182.A00(r7, r9, r0)
            float r0 = r3.A00
            double r0 = (double) r0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r16
            double r0 = r0 - r18
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            X.9JR r1 = X.C51965G9l.A0c(r6, r2, r0)
            r0 = r26
            X.2WX r9 = X.C51973G9u.A0T(r12, r1, r15, r0, r5)
            r7 = 35
            X.Iwj r1 = new X.Iwj
            r0 = r32
            r1.<init>(r7, r4, r0)
            X.2WX r9 = X.C51971G9r.A0Z(r9, r6, r1, r8)
            r7 = 36
            X.Iwj r1 = new X.Iwj
            r1.<init>(r7, r4, r0)
            r0 = r30
            X.2WX r40 = X.C51971G9r.A0Z(r9, r0, r1, r8)
            java.lang.Boolean r50 = java.lang.Boolean.valueOf(r57)
            java.lang.Integer r53 = java.lang.Integer.valueOf(r2)
            X.3AS r36 = X.C336767f9.A00
            X.2V1 r0 = r11.A00
            r59 = r0
            X.3X5 r0 = r0.A02
            X.2Sa r1 = r0.A01
            X.3X7 r0 = r1.A02
            r35 = r0
            boolean r0 = r1.A0W
            r32 = r0
            X.IIS r7 = new X.IIS
            r0 = r59
            r7.<init>(r0)
            java.util.List r0 = r3.A0G()
            java.util.Iterator r19 = r0.iterator()
            r46 = 0
        L_0x02b3:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r19.next()
            int r18 = r46 + 1
            if (r46 >= 0) goto L_0x02c9
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02c9:
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r17 = r0.getId()
            java.lang.Object[] r16 = X.C51969G9p.A1b(r0)
            X.IxV r1 = new X.IxV
            r41 = r1
            r42 = r4
            r43 = r0
            r44 = r33
            r45 = r51
            r47 = r57
            r41.<init>(r42, r43, r44, r45, r46, r47)
            X.7eo r13 = r7.A01
            r0 = 7
            X.TTP r9 = new X.TTP
            r9.<init>(r0, r1, r7)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r17
            r0 = r16
            r13.A01(r1, r9, r0, r12)
            r46 = r18
            goto L_0x02b3
        L_0x02f8:
            X.3Zi r27 = X.C243583Zi.FLEX_START
            goto L_0x019d
        L_0x02fc:
            float r1 = r4.A00
            r0 = 1094713344(0x41400000, float:12.0)
            float r1 = r1 + r0
            float r0 = X.0nA.A01(r6, r1)
            double r0 = (double) r0
            goto L_0x0176
        L_0x0308:
            r9 = 0
            goto L_0x00ee
        L_0x030b:
            r0 = 37166185964372388(0x840a73001001a4, double:3.5673838878631766E-306)
            double r13 = X.182.A00(r7, r8, r0)
            int r12 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0332
            double r0 = X.182.A00(r7, r8, r0)
            r5 = 37166185964503462(0x840a73001201a6, double:3.5673838879460683E-306)
            double r7 = X.182.A00(r7, r8, r5)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = r7 * r5
            double r0 = r0 + r7
            r5 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r0 = r0 + r5
            float r5 = (float) r0
            float r11 = r3.A00
            float r11 = r11 - r5
            goto L_0x009f
        L_0x0332:
            r0 = 37166185964568999(0x840a73001301a7, double:3.567383887987514E-306)
            double r12 = X.182.A00(r7, r8, r0)
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x009f
            float r1 = r3.A00
            boolean r0 = X.182.A06(r7, r8, r5)
            if (r0 != 0) goto L_0x0099
            float r0 = X.0nA.A00(r9, r11)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            goto L_0x009f
        L_0x0351:
            r0 = r24
            int r63 = X.G9t.A0i(r11, r0)
            X.Gxu r42 = new X.Gxu
            r58 = r42
            r60 = r35
            r61 = r2
            r65 = r32
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            X.7eo r1 = r7.A01
            X.7f3 r0 = new X.7f3
            r35 = r0
            r38 = r8
            r39 = r8
            r41 = r8
            r43 = r1
            r44 = r20
            r45 = r8
            r46 = r8
            r47 = r8
            r48 = r8
            r49 = r8
            r51 = r50
            r52 = r8
            r54 = r8
            r55 = r8
            r56 = r8
            r58 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r11.A00(r0)
            if (r31 != 0) goto L_0x03b2
            r0 = r28
            X.9JS r1 = X.C51965G9l.A0d(r6, r0, r5)
            r0 = r26
            X.2WX r7 = X.C51973G9u.A0T(r8, r1, r15, r0, r5)
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            r4 = r22
            X.2WX r4 = X.C51973G9u.A0X(r7, r4, r0, r2)
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r59)
            X.GG5 r0 = new X.GG5
            r0.<init>(r3)
            X.C51971G9r.A1C(r0, r1, r11, r4)
        L_0x03b2:
            r0 = r21
            X.C51967G9n.A1F(r11, r14, r0)
            boolean r0 = X.C56375HxT.A00(r10)
            if (r0 == 0) goto L_0x0444
            boolean r0 = X.C56375HxT.A01(r10)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0444
            X.3Zh r0 = X.C243573Zh.FLEX_END
            X.9JS r1 = X.C51965G9l.A0d(r6, r0, r5)
            r0 = r26
            X.2WX r7 = X.C51973G9u.A0T(r8, r1, r15, r0, r5)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r66)
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            r3 = r23
            X.2WX r3 = X.C51973G9u.A0X(r8, r3, r0, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            java.lang.String r0 = "clips_ufi_more_button_component"
            r9 = 4
            X.2WX r3 = X.C51971G9r.A0Y(r3, r1, r0, r9)
            r0 = 4629981891913580544(0x4041000000000000, double:34.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            X.2WX r10 = X.AnonymousClass9JR.A00(r3, r6, r2, r0)
            r3 = r30
            X.2WX r3 = X.AnonymousClass9JR.A00(r10, r3, r2, r0)
            r0 = 2131966723(0x7f133b03, float:1.9570292E38)
            X.9JS r1 = X.C51972G9s.A0W(r4, r0, r2)
            r0 = r28
            X.2WX r3 = X.C51973G9u.A0T(r3, r1, r6, r0, r5)
            java.lang.String r1 = "more_button"
            r0 = r23
            X.2WX r1 = X.C51971G9r.A0Y(r3, r0, r1, r9)
            r0 = r34
            X.2WX r1 = X.C51972G9s.A0V(r1, r0)
            r0 = r30
            X.2WX r3 = X.C51972G9s.A0U(r1, r0, r2)
            r0 = 2131430287(0x7f0b0b8f, float:1.848227E38)
            java.lang.Integer r1 = X.AnonymousClass05K.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2WX r19 = X.C51971G9r.A0Y(r3, r1, r0, r9)
            r0 = 2131238566(0x7f081ea6, float:1.8093414E38)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r4, r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.C51973G9u.A0x(r1, r4, r0)
            android.widget.ImageView$ScaleType r17 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.3bS r0 = new X.3bS
            r15 = r0
            r16 = r1
            r18 = r8
            r20 = r2
            r21 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.C51971G9r.A1C(r0, r4, r14, r7)
        L_0x0444:
            r2 = r29
            r1 = r27
            r0 = r67
            X.2Tl r0 = X.C243563Zg.A08(r14, r0, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53917GwN.A0X(X.3Y5):X.3mp");
    }

    static {
        Float A0g = C51967G9n.A0g();
        A0E = C51970G9q.A0S(A0g);
        A0F = C51969G9p.A0S(A0g);
    }
}
