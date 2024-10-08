package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GGE extends C251343mx {
    public final ClipsViewerConfig A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final JRO A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final C310256ag A06;
    public final JTB A07;
    public final C52325GNs A08;
    public final GGC A09;
    public final GGD A0A;
    public final GGB A0B;
    public final JP2 A0C;
    public final JQX A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;

    public GGE(ClipsViewerConfig clipsViewerConfig, C267324bN r5, C52058GDe gDe, JRO jro, UserSession userSession, AnonymousClass4DU r9, C310256ag r10, JTB jtb, C52325GNs gNs, GGC ggc, GGD ggd, GGB ggb, JP2 jp2, JQX jqx, String str, List list, boolean z) {
        0qQ.A0B(jro, 5);
        String str2 = str;
        JQX jqx2 = jqx;
        C51973G9u.A0u(7, jtb, str2, jqx2);
        0qQ.A0B(r10, 11);
        this.A01 = r5;
        this.A04 = userSession;
        this.A05 = r9;
        this.A02 = gDe;
        this.A03 = jro;
        this.A00 = clipsViewerConfig;
        this.A07 = jtb;
        this.A0F = list;
        this.A0E = str2;
        this.A0D = jqx2;
        this.A06 = r10;
        this.A0C = jp2;
        this.A0B = ggb;
        this.A0G = z;
        this.A09 = ggc;
        this.A0A = ggd;
        this.A08 = gNs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r39) {
        /*
            r38 = this;
            r9 = 0
            r37 = r39
            r0 = r37
            X.0qQ.A0B(r0, r9)
            r11 = r38
            X.GDe r10 = r11.A02
            X.3W1 r8 = r10.A0E
            r7 = 0
            if (r8 == 0) goto L_0x01ed
            X.4bN r1 = r11.A01
            X.1Xj r0 = r1.A02
            r17 = r0
            if (r0 == 0) goto L_0x01ed
            r0 = 31
            X.IwO r2 = X.C58715IwO.A01(r8, r0)
            r0 = r37
            X.2Wa r16 = X.C243643Zq.A00(r0, r2)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            r6 = 1120403456(0x42c80000, float:100.0)
            r0 = r22
            X.2WX r2 = X.C51971G9r.A0X(r7, r0, r6, r9)
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            r0 = r21
            X.2WX r0 = X.C51971G9r.A0X(r2, r0, r6, r9)
            X.3b9 r5 = X.C244413b9.ABSOLUTE
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            r3 = 3
            X.2WX r20 = X.C51971G9r.A0Y(r0, r4, r5, r3)
            X.3Zi r19 = X.C243583Zi.SPACE_BETWEEN
            r0 = r37
            X.2V1 r0 = r0.A05
            r36 = r0
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r36)
            boolean r0 = r10.A0d
            r18 = 1
            if (r0 == 0) goto L_0x01c2
            X.JTB r13 = r11.A07
            boolean r0 = r13.CZm(r1)
            if (r0 == 0) goto L_0x01c2
            X.Grf r0 = new X.Grf
            r0.<init>()
            r2.A00(r0)
            com.instagram.common.session.UserSession r0 = r11.A04
            X.Gt4 r12 = new X.Gt4
            r12.<init>(r0, r13)
            r2.A00(r12)
        L_0x006e:
            X.GGH r15 = X.GGH.A00
            r12 = r22
            r0 = r21
            X.2WX r0 = X.C51974G9v.A0O(r7, r12, r0, r6, r9)
            X.2WX r0 = X.C51971G9r.A0Y(r0, r4, r5, r3)
            X.JP2 r14 = r11.A0C
            com.instagram.common.session.UserSession r13 = r11.A04
            r12 = r0
            X.2WX r15 = X.C51973G9u.A0O(r2, r12, r13, r14, r15)
            X.2V1 r0 = r2.A00
            r35 = r0
            X.2Wb r12 = X.AnonymousClass7TG.A0S(r35)
            X.JTB r0 = r11.A07
            r34 = r0
            X.4DU r0 = r11.A05
            r33 = r0
            java.lang.String r29 = r33.getModuleName()
            java.lang.String r0 = r11.A0E
            r30 = r0
            java.util.List r0 = r11.A0F
            r31 = r0
            X.6ag r0 = r11.A06
            r27 = r0
            boolean r0 = r11.A0G
            X.GGx r14 = new X.GGx
            r23 = r14
            r24 = r1
            r25 = r13
            r26 = r17
            r28 = r34
            r32 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.C51971G9r.A1C(r14, r12, r2, r15)
            X.GGy r0 = new X.GGy
            r0.<init>(r13, r8)
            r2.A00(r0)
            boolean r0 = X.C51969G9p.A1V(r16)
            if (r0 != 0) goto L_0x00ce
            X.GGB r0 = r11.A0B
            r2.A00(r0)
        L_0x00ce:
            X.JRO r0 = r11.A03
            r12 = r0
            com.instagram.clips.intf.ClipsViewerConfig r0 = r11.A00
            r31 = r0
            X.GGz r0 = new X.GGz
            r23 = r0
            r24 = r31
            r25 = r1
            r26 = r10
            r27 = r12
            r28 = r33
            r29 = r13
            r30 = r34
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r2.A00(r0)
            X.GH0 r0 = new X.GH0
            r0.<init>(r1)
            r2.A00(r0)
            boolean r0 = X.1CI.A00(r13)
            if (r0 == 0) goto L_0x014a
            X.0xi r17 = X.0tS.A4E
            X.0tS r16 = r17.A00()
            r0 = r16
            X.0s0 r0 = r0.A0I
            r12 = r0
            X.0YZ[] r14 = X.0tS.A4G
            r0 = 172(0xac, float:2.41E-43)
            r15 = r12
            r12 = r0
            r0 = r16
            boolean r0 = X.AnonymousClass7TG.A1a(r0, r15, r14, r12)
            if (r0 == 0) goto L_0x012d
            X.JQX r0 = r11.A0D
            r12 = r0
            X.GuZ r0 = new X.GuZ
            r23 = r0
            r24 = r1
            r25 = r13
            r26 = r33
            r27 = r8
            r28 = r34
            r29 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r2.A00(r0)
        L_0x012d:
            X.0tS r16 = r17.A00()
            r0 = r16
            X.0s0 r0 = r0.A0M
            r12 = r0
            r0 = 173(0xad, float:2.42E-43)
            r15 = r12
            r12 = r0
            r0 = r16
            boolean r0 = X.AnonymousClass7TG.A1a(r0, r15, r14, r12)
            if (r0 == 0) goto L_0x014a
            X.GtE r0 = new X.GtE
            r0.<init>(r1, r13, r8)
            r2.A00(r0)
        L_0x014a:
            X.GGn r12 = X.GJD.A00
            r0 = r31
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            r15 = r0
            boolean r0 = r12.A00(r0, r1, r10, r13)
            if (r0 == 0) goto L_0x0180
            r12 = r22
            r0 = r21
            X.2WX r0 = X.C51974G9v.A0O(r7, r12, r0, r6, r9)
            X.2WX r14 = X.C51971G9r.A0Y(r0, r4, r5, r3)
            X.2Wb r12 = X.AnonymousClass7TG.A0S(r35)
            X.Gua r0 = new X.Gua
            r23 = r0
            r24 = r15
            r25 = r1
            r26 = r10
            r27 = r33
            r28 = r13
            r29 = r34
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r12.A00(r0)
            X.C51967G9n.A1C(r12, r2, r14)
        L_0x0180:
            X.GGC r0 = r11.A09
            r2.A00(r0)
            X.GGD r0 = r11.A0A
            r2.A00(r0)
            X.GNs r0 = r11.A08
            r2.A00(r0)
            boolean r1 = r8.A1q
            r0 = r18
            if (r1 != r0) goto L_0x01b7
            r1 = r22
            r0 = r21
            X.2WX r0 = X.C51974G9v.A0O(r7, r0, r1, r6, r9)
            X.2WX r3 = X.C51971G9r.A0Y(r0, r4, r5, r3)
            android.content.Context r1 = X.C243803a8.A00(r37)
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r1 = X.2Yu.A0H(r1, r0)
            r0 = r37
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r0, r1)
            r0 = r36
            X.C51974G9v.A0h(r1, r0, r2, r3)
        L_0x01b7:
            r3 = r20
            r1 = r19
            r0 = r37
            X.2Tp r0 = X.C243563Zg.A0J(r2, r0, r3, r1)
            return r0
        L_0x01c2:
            boolean r0 = r10.A0f
            if (r0 == 0) goto L_0x006e
            com.instagram.common.session.UserSession r0 = r11.A04
            r15 = r0
            android.content.Context r24 = X.C243803a8.A00(r2)
            X.JTB r0 = r11.A07
            r14 = r0
            boolean r0 = r10.A0U
            r13 = r0
            boolean r12 = r10.A0T
            X.GwA r0 = new X.GwA
            r23 = r0
            r25 = r1
            r26 = r10
            r27 = r15
            r28 = r14
            r29 = r13
            r30 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r2.A00(r0)
            goto L_0x006e
        L_0x01ed:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGE.A0X(X.3Y5):X.3mp");
    }
}
