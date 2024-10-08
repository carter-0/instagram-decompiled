package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEo  reason: case insensitive filesystem */
public final class C52094GEo extends C247303g7 {
    public final UserSession A00;
    public final H2C A01;
    public final GEH A02;
    public final C52092GEm A03;
    public final C52081GEb A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2.isVerified() != true) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (X.C243353Yk.A00(r6, r10) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r1.A0J() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36316916310872779L) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.GFK A05(com.instagram.clips.intf.ClipsViewerConfig r36, X.C267324bN r37, X.C52058GDe r38, int r39) {
        /*
            r35 = this;
            r14 = 0
            r0 = 1
            r5 = r38
            X.0qQ.A0B(r5, r0)
            r1 = r37
            X.1Xj r2 = r1.A02
            r7 = 1
            r4 = r35
            r8 = r36
            if (r2 == 0) goto L_0x00e3
            boolean r2 = r2.A5I()
            if (r2 != r0) goto L_0x00e3
            com.instagram.common.session.UserSession r6 = r4.A00
            X.1Xj r10 = r1.A02
            X.4gy r2 = r1.A0H
            if (r2 == 0) goto L_0x00d3
            boolean r2 = r2.AxN()
            if (r2 != r0) goto L_0x00d3
        L_0x0026:
            r13 = 0
        L_0x0027:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x0038
            com.instagram.user.model.User r2 = r2.A2A(r6)
            if (r2 == 0) goto L_0x0038
            boolean r2 = r2.isVerified()
            r15 = 1
            if (r2 == r0) goto L_0x0039
        L_0x0038:
            r15 = 0
        L_0x0039:
            if (r10 == 0) goto L_0x0043
            boolean r2 = X.C243353Yk.A00(r6, r10)
            r22 = 1
            if (r2 == 0) goto L_0x0045
        L_0x0043:
            r22 = 0
        L_0x0045:
            boolean r2 = X.GEF.A02(r1, r6)
            if (r2 == 0) goto L_0x00d0
            X.GJ5 r12 = X.GJ5.FAN_CLUB
        L_0x004d:
            X.GEG r11 = new X.GEG
            r16 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r0
            r30 = r14
            r31 = r0
            r32 = r14
            r33 = r14
            r34 = r14
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0076:
            r3 = 21
            X.JTb r2 = new X.JTb
            r2.<init>(r14, r3)
            X.GEH r9 = r4.A02
            boolean r3 = r8.A00()
            if (r3 == 0) goto L_0x008d
            boolean r3 = r1.A0J()
            r21 = 1
            if (r3 != 0) goto L_0x008f
        L_0x008d:
            r21 = 0
        L_0x008f:
            X.3W1 r3 = r5.A0E
            if (r3 == 0) goto L_0x00ce
            boolean r10 = r3.A1q
            if (r10 != r0) goto L_0x00ce
        L_0x0097:
            boolean r22 = X.AnonymousClass3ZC.A0O(r1, r6, r7)
            r19 = 0
            r6 = r39
            r15 = r11
            r16 = r8
            r17 = r1
            r18 = r5
            r20 = r6
            r23 = r14
            r14 = r9
            X.GKJ r9 = r14.A05(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.GEb r7 = r4.A04
            r10 = r7
            r12 = r8
            r13 = r1
            r14 = r5
            r15 = r6
            r16 = r0
            X.GEl r14 = r10.A05(r11, r12, r13, r14, r15, r16)
            X.GEm r4 = r4.A03
            X.GEn r13 = r4.A05(r1, r3, r6)
            r15 = 128(0x80, float:1.794E-43)
            X.GFK r7 = new X.GFK
            r8 = r2
            r10 = r11
            r11 = r1
            r12 = r5
            r7.<init>((X.C59671JTb) r8, (X.GKJ) r9, (X.GEG) r10, (X.C267324bN) r11, (X.C52058GDe) r12, (X.C52093GEn) r13, (X.C52091GEl) r14, (int) r15, (int) r16)
            return r7
        L_0x00ce:
            r7 = 0
            goto L_0x0097
        L_0x00d0:
            r12 = 0
            goto L_0x004d
        L_0x00d3:
            X.0Tu r9 = X.0Tu.A05
            r2 = 36316916310872779(0x81060b000c12cb, double:3.030302339255617E-306)
            boolean r2 = X.182.A06(r9, r6, r2)
            r13 = 1
            if (r2 == 0) goto L_0x0027
            goto L_0x0026
        L_0x00e3:
            com.instagram.common.session.UserSession r6 = r4.A00
            X.GEG r11 = X.GEF.A00(r8, r1, r6)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52094GEo.A05(com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe, int):X.GFK");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.JQ0] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.JP4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.JMv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.JPv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.JMx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, X.JMy] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.IeP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.GNc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.JPx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.33C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r20v1, types: [X.JPz, java.lang.Object] */
    public final GF9 A06() {
        GEH geh = this.A02;
        GGT ggt = geh.A01;
        GGM ggm = ggt.A05;
        AnonymousClass4DU r10 = ggm.A02;
        C52095GEp gEp = new C52095GEp(ggm.A01, r10, ggm.A03, ggm, ggm.A08, ggm.A09, ggm.A0A);
        GGK ggk = ggt.A03;
        C52099GEt gEt = new C52099GEt(ggk.A00, ggk, new Object(), ggk.A01);
        GGL ggl = ggt.A04;
        C52100GEu gEu = new C52100GEu(ggl.A00, ggl.A01);
        GGR ggr = ggt.A06;
        C52101GEv gEv = new C52101GEv(ggr.A00, ggr.A01);
        GGS ggs = ggt.A02;
        UserSession userSession = ggs.A00;
        C52103GEx gEx = new C52103GEx((C59597JPr) ggt.A01.A01.getValue(), new C52102GEw(userSession, ggs, ggs.A01, AnonymousClass93S.A00(userSession)), gEt, gEu, gEp, gEv);
        GEL gel = geh.A02;
        GGU ggu = gel.A03;
        UserSession userSession2 = ggu.A01;
        AnonymousClass0iw r14 = ggu.A00;
        C55684Hlh hlh = ggu.A05;
        AnonymousClass93U r4 = ggu.A03;
        C52104GEy gEy = new C52104GEy(r14, userSession2, ggu.A02, r4, ggu.A04, hlh);
        GFD gfd = new GFD(gel.A02);
        UserSession userSession3 = gel.A07.A00;
        C52105GEz gEz = new C52105GEz(userSession3, C272994ll.A00(userSession3));
        GGY ggy = gel.A04;
        GF0 gf0 = new GF0(ggy.A00, ggy.A01, ggy.A02);
        GF1 gf1 = new GF1(gel.A05.A00);
        ? obj = new Object();
        ? obj2 = new Object();
        GL5 gl5 = gel.A06;
        UserSession userSession4 = gl5.A02;
        C55684Hlh hlh2 = gl5.A04;
        C52103GEx gEx2 = gEx;
        GFA gfa = new GFA(gEx2, new GF3(obj, gfd, gEy, gf0, gf1, new GFI(gl5.A00, gl5.A01, userSession4, gl5.A03, hlh2), gEz, obj2), new Object(), new Object(), new Object());
        C52092GEm gEm = this.A03;
        GF4 gf4 = new GF4(gEm.A00, gEm.A01);
        ? obj3 = new Object();
        C52081GEb gEb = this.A04;
        UserSession userSession5 = gEb.A01;
        C51979GAc gAc = gEb.A0C;
        ClipsViewerSource clipsViewerSource = gEb.A00;
        GF5 gf5 = new GF5(gEb.A05.A01);
        GF6 gf6 = new GF6(gEb.A0A.A00);
        GDG gdg = gEb.A07;
        GF7 gf7 = new GF7(gdg.A02, gdg.A03, gdg.A05, gdg, gdg.A09);
        ? obj4 = new Object();
        C52134GGc gGc = gEb.A08;
        GF8 gf8 = new GF8(gGc.A00, gGc.A01);
        return new GF9(gfa, gf4, new GFC(clipsViewerSource, userSession5, new Object(), gf5, new Object(), gf7, gf8, obj4, gf6, new Object(), gAc, gEb.A0D), obj3);
    }

    public C52094GEo(UserSession userSession, H2C h2c, GEH geh, C52092GEm gEm, C52081GEb gEb) {
        C51974G9v.A1M(h2c, geh, gEb);
        0qQ.A0B(gEm, 5);
        this.A00 = userSession;
        this.A01 = h2c;
        this.A02 = geh;
        this.A04 = gEb;
        this.A03 = gEm;
    }
}
