package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GTk  reason: case insensitive filesystem */
public final class C52458GTk extends C251343mx {
    public final GEG A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final S6e A06;
    public final JTB A07;
    public final JTE A08;
    public final C52680Gas A09;
    public final C52046GCs A0A;
    public final boolean A0B;
    public final boolean A0C;

    public /* synthetic */ C52458GTk(GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r7, S6e s6e, JTB jtb, JTE jte, C52680Gas gas, C52046GCs gCs, boolean z, boolean z2) {
        0qQ.A0B(gas, 1);
        C51974G9v.A1S(jte, r4, userSession, clipsViewerConfig, r7);
        C51973G9u.A0t(7, gDe, geg, jtb);
        this.A09 = gas;
        this.A08 = jte;
        this.A02 = r4;
        this.A04 = userSession;
        this.A01 = clipsViewerConfig;
        this.A05 = r7;
        this.A03 = gDe;
        this.A00 = geg;
        this.A07 = jtb;
        this.A0C = z;
        this.A0B = z2;
        this.A06 = s6e;
        this.A0A = gCs;
    }

    private final GLT A05(C70832Wc r8, int i) {
        int i2 = i;
        if (i < 1) {
            return null;
        }
        C59511JMj jMj = this.A09.A04;
        if (jMj instanceof GLQ) {
            return new GLT(A04(r8, "trans_key_overflow_pill_fade"), this.A04, this.A08, (GLQ) jMj, i2);
        } else if (jMj instanceof GKF) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.GvC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.Gup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.GvC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.Gtl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: X.GvN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.Gup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v10, resolved type: X.GvO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: X.GvC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.GvC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: X.GvO} */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.GIk] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r11v4, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v27, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r25v9, types: [X.GTo] */
    /* JADX WARNING: type inference failed for: r25v12, types: [X.GvB] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0391, code lost:
        if (r25 != null) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        if (r15.A0N != true) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x017c, code lost:
        if (r5 == false) goto L_0x017e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x036a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r56) {
        /*
            r55 = this;
            r4 = 0
            r3 = r56
            X.0qQ.A0B(r3, r4)
            X.GIk r11 = new X.GIk
            r11.<init>()
            android.content.Context r12 = X.C243803a8.A00(r3)
            r0 = r55
            com.instagram.common.session.UserSession r1 = r0.A04
            X.4bN r2 = r0.A02
            X.Gas r10 = r0.A09
            X.1Xj r5 = r10.A00
            r54 = r5
            X.3W1 r8 = r10.A01
            boolean r5 = r8.A1q
            r14 = r1
            r15 = r54
            r16 = r5
            r13 = r2
            java.util.List r24 = r11.A02(r12, r13, r14, r15, r16)
            X.GJ2 r6 = X.GJ2.RAY_BAN_STORIES
            r5 = r24
            boolean r7 = r5.contains(r6)
            java.lang.String r6 = r54.getId()
            X.JSO r5 = X.C51966G9m.A0l(r54)
            if (r5 == 0) goto L_0x040d
            com.instagram.api.schemas.WearablesAppAttributionType r5 = r5.AdB()
        L_0x003f:
            if (r7 == 0) goto L_0x0409
            if (r6 == 0) goto L_0x0409
            if (r5 != 0) goto L_0x0047
            com.instagram.api.schemas.WearablesAppAttributionType r5 = com.instagram.api.schemas.WearablesAppAttributionType.UNRECOGNIZED
        L_0x0047:
            X.Ie5 r7 = new X.Ie5
            r7.<init>(r5, r6)
        L_0x004c:
            X.JMk r7 = (X.C59512JMk) r7
            java.lang.Object r11 = X.00k.A0J(r24)
            X.GJ2 r11 = (X.GJ2) r11
            if (r11 == 0) goto L_0x0405
            X.GJ2 r6 = X.GJ2.STICKER_RESULT
            r5 = r24
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0061
            r11 = r6
        L_0x0061:
            X.GK4 r9 = new X.GK4
            r9.<init>(r15, r8, r11)
            X.0Tu r11 = X.0Tu.A05
            r5 = 36326129014945295(0x810e6c0000360f, double:3.036128490407658E-306)
            boolean r5 = X.182.A06(r11, r1, r5)
            if (r5 == 0) goto L_0x03f6
            X.JTE r11 = r0.A08
        L_0x0075:
            X.JTF r11 = (X.JTF) r11
            java.lang.String r5 = "trans_key_secondary_pill_fade"
            X.2WX r48 = r0.A04(r3, r5)
            X.Gup r47 = new X.Gup
            r49 = r2
            r50 = r1
            r51 = r9
            r52 = r11
            r53 = r7
            r47.<init>(r48, r49, r50, r51, r52, r53)
        L_0x008c:
            java.lang.String r23 = "trans_key_music_pill_fade"
            r5 = r23
            X.2WX r26 = r0.A04(r3, r5)
            X.JTB r5 = r0.A07
            r43 = r5
            boolean r5 = r0.A0C
            r22 = r5
            com.instagram.clips.intf.ClipsViewerConfig r5 = r0.A01
            r42 = r5
            com.instagram.clips.intf.ClipsWatchAndBrowseData r15 = r5.A0K
            r7 = 1
            if (r15 == 0) goto L_0x00ab
            boolean r5 = r15.A0N
            r32 = 1
            if (r5 == r7) goto L_0x00ad
        L_0x00ab:
            r32 = 0
        L_0x00ad:
            X.GTn r21 = new X.GTn
            r25 = r21
            r27 = r2
            r28 = r1
            r29 = r8
            r30 = r43
            r31 = r22
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            boolean r5 = X.1KU.A07(r1)
            if (r5 == 0) goto L_0x03f2
            X.0Tu r8 = X.DbS.A0J(r1, r4)
            r5 = 36321254227256522(0x8109fd000324ca, double:3.033045655044083E-306)
            boolean r5 = X.182.A06(r8, r1, r5)
            if (r5 == 0) goto L_0x03f2
            android.content.Context r5 = X.C243803a8.A00(r3)
            android.content.res.Resources r6 = X.AnonymousClass7TF.A0A(r5)
            r5 = 2131165218(0x7f070022, float:1.7944647E38)
            int r45 = r6.getDimensionPixelSize(r5)
            r5 = 2131165255(0x7f070047, float:1.7944722E38)
            int r8 = r6.getDimensionPixelSize(r5)
            r5 = 2131165190(0x7f070006, float:1.794459E38)
            int r6 = r6.getDimensionPixelSize(r5)
            int r5 = r8 * 2
            int r45 = r45 + r5
            int r45 = r45 + r6
        L_0x00f6:
            X.3Zd r6 = X.C243533Zd.LOCAL
            java.lang.String r5 = "trans_key_attribution_hub_fade"
            X.4Ey r6 = X.2Vi.A00(r6, r5)
            r5 = 300(0x12c, float:4.2E-43)
            X.C51966G9m.A1M(r6, r5)
            X.3du r5 = X.C246033ds.A00
            float r5 = X.C51970G9q.A03(r6, r5)
            r6.A02(r5)
            X.AnonymousClass4F7.A00(r3, r6)
            X.2V1 r5 = r3.A05
            android.content.Context r5 = r5.A0C
            android.content.res.Resources r5 = X.AnonymousClass7TF.A0A(r5)
            int r8 = X.AnonymousClass3ZC.A00(r5)
            X.0Tu r20 = X.0Tu.A05
            r5 = 36328413937614164(0x81108000013d54, double:3.0375734847040956E-306)
            r9 = r20
            boolean r5 = X.182.A06(r9, r1, r5)
            java.lang.String r9 = "trans_key_secondary_pill_fade"
            r36 = 0
            if (r5 == 0) goto L_0x03d1
            X.JMl r6 = r10.A05
            boolean r5 = r6 instanceof X.C52679Gar
            if (r5 == 0) goto L_0x03cd
            X.Gar r6 = (X.C52679Gar) r6
            X.JTE r13 = r0.A08
            X.GDe r12 = r0.A03
            X.2WX r26 = r0.A04(r3, r9)
            X.4DU r11 = r0.A05
            X.S6e r5 = r0.A06
            X.GvB r17 = new X.GvB
            r25 = r17
            r27 = r42
            r28 = r2
            r29 = r12
            r30 = r1
            r31 = r11
            r32 = r5
            r33 = r13
            r34 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0159:
            X.2T3 r11 = new X.2T3
            r11.<init>()
            if (r17 == 0) goto L_0x0169
            X.2V1 r6 = r3.Aqq()
            r5 = r17
            r5.A0L(r6, r11, r4, r4)
        L_0x0169:
            int r5 = r11.A01
            int r45 = r45 + r5
            X.GEG r5 = r0.A00
            boolean r5 = r5.A0E
            X.0qQ.A0B(r2, r4)
            boolean r6 = r2.CcK()
            if (r6 == 0) goto L_0x017e
            r19 = 1
            if (r5 != 0) goto L_0x0180
        L_0x017e:
            r19 = 0
        L_0x0180:
            boolean r5 = X.GEK.A04(r2, r1)
            if (r5 != 0) goto L_0x03c9
            boolean r5 = X.GEK.A03(r2, r1)
            if (r5 != 0) goto L_0x03c9
            X.0qQ.A0B(r1, r4)
            boolean r5 = r2.CcK()
            if (r5 == 0) goto L_0x0394
            X.1Xj r5 = r2.A02
            if (r5 == 0) goto L_0x0394
            X.1Xy r5 = r5.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r5 = r5.AcH()
            if (r5 == 0) goto L_0x0394
            java.lang.String r5 = r5.BXF()
            if (r5 == 0) goto L_0x0394
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x01a9:
            r18 = 1048576000(0x3e800000, float:0.25)
            r12 = 2
            boolean[] r11 = new boolean[r12]
            r11[r4] = r19
            boolean r6 = X.AnonymousClass7TF.A1V(r5)
            r11[r7] = r6
            r6 = 0
            r14 = 0
        L_0x01b8:
            boolean r13 = r11[r6]
            if (r13 == 0) goto L_0x01be
            int r14 = r14 + 1
        L_0x01be:
            int r6 = r6 + 1
            if (r6 < r12) goto L_0x01b8
            int r16 = r14 + -1
            int r6 = r8 - r45
            if (r6 > 0) goto L_0x01d8
            r4 = r0
            r5 = r21
            r6 = r17
            r7 = r36
            r8 = r7
        L_0x01d0:
            r9 = r3
            r10 = r54
            X.2Tp r5 = r4.A00(r5, r6, r7, r8, r9, r10)
            return r5
        L_0x01d8:
            float r13 = (float) r6
            float r11 = (float) r8
            float r11 = r11 * r18
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x01ef
            int r1 = r16 + 1
            X.GLT r11 = r0.A05(r3, r1)
            r2 = 0
        L_0x01e7:
            r4 = r0
            r5 = r21
            r6 = r17
            r7 = r2
            r8 = r11
            goto L_0x01d0
        L_0x01ef:
            if (r19 == 0) goto L_0x0366
            if (r5 == 0) goto L_0x0366
            r6 = r16
            X.GLT r11 = r0.A05(r3, r6)
            X.2T3 r6 = new X.2T3
            r6.<init>()
            if (r11 == 0) goto L_0x0207
            X.2V1 r13 = r3.Aqq()
            r11.A0L(r13, r6, r4, r4)
        L_0x0207:
            int r6 = r6.A01
            int r45 = r45 + r6
            int r6 = r8 - r45
        L_0x020d:
            boolean r8 = X.GEK.A04(r2, r1)
            if (r8 != 0) goto L_0x030f
            boolean r8 = X.GEK.A03(r2, r1)
            if (r8 != 0) goto L_0x030f
            r13 = 36328413937679701(0x81108000023d55, double:3.0375734847455415E-306)
            r8 = r20
            boolean r8 = X.DbY.A1Z(r8, r1, r13)
            if (r8 == 0) goto L_0x030f
            X.JMh r8 = r10.A02
            X.HKH r12 = X.HKH.A00
            boolean r12 = X.0qQ.A0K(r8, r12)
            if (r12 != 0) goto L_0x02e6
            X.HKG r12 = X.HKG.A00
            boolean r12 = X.0qQ.A0K(r8, r12)
            if (r12 != 0) goto L_0x02e6
            X.Ie0 r12 = X.C57635Ie0.A00
            boolean r12 = X.0qQ.A0K(r8, r12)
            if (r12 != 0) goto L_0x02e6
            X.Ie1 r12 = X.C57636Ie1.A00
            boolean r12 = X.0qQ.A0K(r8, r12)
            if (r12 != 0) goto L_0x02e6
            X.Ie2 r6 = X.C57637Ie2.A00
            boolean r6 = X.0qQ.A0K(r8, r6)
            if (r6 == 0) goto L_0x0415
            r25 = 0
        L_0x0252:
            boolean r6 = X.GEK.A04(r2, r1)
            if (r6 != 0) goto L_0x0279
            boolean r2 = X.GEK.A03(r2, r1)
            if (r2 != 0) goto L_0x0279
            X.JMi r6 = r10.A03
            boolean r2 = r6 instanceof X.C52201GIs
            if (r2 == 0) goto L_0x02a4
            X.0wj r8 = X.0wj.A01
            r6 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r2 = "SponsoredAttributionComponent"
            X.0f9 r8 = r8.AEf(r2, r6)
            java.lang.String r6 = "message"
            java.lang.String r2 = "Organic music attribution not supported in SponsoredAttributionComponent"
            r8.ABQ(r6, r2)
            r8.report()
        L_0x0279:
            r2 = r36
        L_0x027b:
            if (r22 == 0) goto L_0x036a
            if (r15 == 0) goto L_0x02a1
            boolean r0 = r15.A0N
            if (r0 != r7) goto L_0x02a1
            X.3Zi r8 = X.C243583Zi.FLEX_END
        L_0x0285:
            X.2V1 r0 = r3.Aqq()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.0qQ.A0B(r0, r7)
            r0 = r21
            r1.add(r0)
            X.2Tp r5 = new X.2Tp
            r6 = r36
            r7 = r6
            r9 = r6
            r10 = r1
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x02a1:
            r8 = r36
            goto L_0x0285
        L_0x02a4:
            boolean r2 = r6 instanceof X.C52283GLz
            if (r2 != 0) goto L_0x0279
            boolean r2 = r6 instanceof X.C53578Gqt
            if (r2 == 0) goto L_0x02bc
            X.Gqt r6 = (X.C53578Gqt) r6
            r2 = r23
            X.2WX r9 = r0.A04(r3, r2)
            X.Gtl r2 = new X.Gtl
            r8 = r43
            r2.<init>(r9, r1, r8, r6)
            goto L_0x027b
        L_0x02bc:
            boolean r2 = r6 instanceof X.C53579Gqu
            if (r2 == 0) goto L_0x0410
            X.Gqu r6 = (X.C53579Gqu) r6
            r2 = r23
            X.2WX r38 = r0.A04(r3, r2)
            X.JTE r8 = r0.A08
            boolean r2 = X.AnonymousClass7TE.A1b(r24)
            java.lang.Boolean r44 = java.lang.Boolean.valueOf(r2)
            X.GvC r2 = new X.GvC
            r37 = r2
            r39 = r42
            r40 = r1
            r41 = r43
            r42 = r8
            r43 = r6
            r46 = r16
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x027b
        L_0x02e6:
            X.JTE r12 = r0.A08
            r18 = r12
            X.GDe r14 = r0.A03
            X.2WX r26 = r0.A04(r3, r9)
            boolean r13 = r0.A0B
            X.GCs r12 = r0.A0A
            X.4DU r9 = r0.A05
            X.GvN r25 = new X.GvN
            r27 = r2
            r28 = r14
            r29 = r1
            r30 = r9
            r31 = r18
            r32 = r8
            r33 = r12
            r34 = r6
            r35 = r13
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0252
        L_0x030f:
            if (r5 == 0) goto L_0x031e
            int r8 = r5.intValue()
            if (r8 == r4) goto L_0x0347
            if (r8 == r7) goto L_0x0347
            if (r8 == r12) goto L_0x0322
            r12 = 3
            if (r8 == r12) goto L_0x0322
        L_0x031e:
            r25 = 0
            goto L_0x0252
        L_0x0322:
            X.GvO r25 = new X.GvO
            X.GDe r13 = r0.A03
            X.2WX r26 = r0.A04(r3, r9)
            boolean r12 = r0.A0B
            X.GCs r9 = r0.A0A
            X.4DU r8 = r0.A05
            r28 = r13
            r29 = r1
            r30 = r8
            r31 = r43
            r32 = r9
            r33 = r5
            r34 = r6
            r35 = r12
            r27 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0252
        L_0x0347:
            X.GvO r25 = new X.GvO
            X.GDe r8 = r0.A03
            X.2WX r32 = r0.A04(r3, r9)
            r34 = r8
            r35 = r1
            r37 = r43
            r38 = r36
            r39 = r5
            r40 = r6
            r41 = r4
            r31 = r25
            r33 = r2
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0252
        L_0x0366:
            r11 = r36
            goto L_0x020d
        L_0x036a:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r5 == r6) goto L_0x0389
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            if (r5 == r6) goto L_0x0389
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r5 == r6) goto L_0x037a
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            if (r5 != r6) goto L_0x038d
        L_0x037a:
            X.0Tu r6 = X.C51965G9l.A0Z(r1, r4)
            r4 = 36326171964749382(0x810e7600023646, double:3.0361556520367074E-306)
            boolean r1 = X.182.A06(r6, r1, r4)
            if (r1 != 0) goto L_0x038d
        L_0x0389:
            r2 = r25
            goto L_0x01e7
        L_0x038d:
            if (r2 != 0) goto L_0x01e7
            r2 = r47
            if (r25 == 0) goto L_0x01e7
            goto L_0x0389
        L_0x0394:
            boolean r5 = r2.CcK()
            if (r5 == 0) goto L_0x03b0
            X.1Xj r5 = r2.A02
            if (r5 == 0) goto L_0x03b0
            X.1Xy r5 = r5.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r5 = r5.AcH()
            if (r5 == 0) goto L_0x03b0
            java.lang.String r5 = r5.BHr()
            if (r5 == 0) goto L_0x03b0
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x01a9
        L_0x03b0:
            X.1Xj r5 = r2.A02
            boolean r5 = X.GEJ.A01(r1, r5)
            if (r5 == 0) goto L_0x03bc
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x01a9
        L_0x03bc:
            boolean r5 = X.GEJ.A00(r2, r1)
            if (r5 == 0) goto L_0x03c6
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x01a9
        L_0x03c6:
            r5 = 0
            goto L_0x01a9
        L_0x03c9:
            r5 = r36
            goto L_0x01a9
        L_0x03cd:
            r17 = r36
            goto L_0x0159
        L_0x03d1:
            X.GDe r11 = r0.A03
            X.2WX r26 = r0.A04(r3, r9)
            X.4DU r6 = r0.A05
            X.S6e r5 = r0.A06
            X.GTo r17 = new X.GTo
            r25 = r17
            r27 = r42
            r28 = r2
            r29 = r11
            r30 = r1
            r31 = r6
            r32 = r5
            r33 = r43
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0159
        L_0x03f2:
            r45 = 0
            goto L_0x00f6
        L_0x03f6:
            X.JTB r6 = r0.A07
            X.4DU r5 = r0.A05
            java.lang.String r5 = r5.getModuleName()
            X.Ie3 r11 = new X.Ie3
            r11.<init>(r1, r6, r5)
            goto L_0x0075
        L_0x0405:
            r47 = 0
            goto L_0x008c
        L_0x0409:
            X.GKR r7 = X.GKR.A00
            goto L_0x004c
        L_0x040d:
            r5 = 0
            goto L_0x003f
        L_0x0410:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0415:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52458GTk.A0X(X.3Y5):X.3mp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r13.A5l() != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.2Tp A00(X.C251263mp r8, X.C251263mp r9, X.C251263mp r10, X.C251263mp r11, X.C70832Wc r12, X.1Xj r13) {
        /*
            r7 = this;
            X.3XV r0 = X.2WX.A02
            X.9JQ r0 = X.G9t.A14()
            r4 = 0
            X.2WX r3 = X.C51965G9l.A0X(r4, r0)
            boolean r0 = r13.A4z()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r13.A5l()
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            com.instagram.common.session.UserSession r5 = r7.A04
            boolean r0 = r13.CcK()
            boolean r0 = X.C52114GFi.A05(r5, r0, r1)
            r2 = 0
            if (r0 != 0) goto L_0x0078
            X.4bN r6 = r7.A02
            boolean r0 = X.GEK.A07(r6, r5)
            if (r0 != 0) goto L_0x0078
            X.JTB r1 = r7.A07
            boolean r0 = r1.CRr(r6)
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1.CRs(r6)
            if (r0 == 0) goto L_0x0048
        L_0x003c:
            X.2V1 r2 = r12.Aqq()
            X.3Zd r1 = X.C243533Zd.GLOBAL
            java.lang.String r0 = "trans_key_autoscroll_attribution_hub"
        L_0x0044:
            X.2WX r2 = X.C51971G9r.A0V(r2, r4, r1, r0)
        L_0x0048:
            X.2WX r4 = r3.A00(r2)
            r0 = 0
            X.2Wb r3 = X.C51973G9u.A0M(r12)
            X.0Tu r2 = X.C51965G9l.A0Z(r5, r0)
            r0 = 36321254227453133(0x8109fd000624cd, double:3.033045655168421E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x006e
            r3.A00(r9)
            r3.A00(r10)
            r3.A00(r8)
        L_0x0069:
            X.2Tp r0 = X.C51967G9n.A0Q(r11, r3, r12, r4)
            return r0
        L_0x006e:
            r3.A00(r8)
            r3.A00(r9)
            r3.A00(r10)
            goto L_0x0069
        L_0x0078:
            X.2V1 r2 = r12.Aqq()
            X.3Zd r1 = X.C243533Zd.LOCAL
            java.lang.String r0 = "trans_key_attribution_hub_fade"
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52458GTk.A00(X.3mp, X.3mp, X.3mp, X.3mp, X.2Wc, X.1Xj):X.2Tp");
    }

    private final 2WX A04(C70832Wc r5, String str) {
        2WX r3 = null;
        if (C262624Fg.A00(this.A04)) {
            AnonymousClass3XV r0 = 2WX.A02;
            r3 = C51971G9r.A0V(r5.Aqq(), (2WX) null, C243533Zd.LOCAL, str);
        }
        return C52195GIm.A00.A00(C51969G9p.A0K(r5), this.A09.A06).A00(r3);
    }
}
