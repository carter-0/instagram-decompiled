package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HpH  reason: case insensitive filesystem */
public final class C55896HpH {
    public int A00;
    public JRG A01;
    public final JRH A02;
    public final PostViewStateRepository A03;
    public final H8S A04;
    public final I0E A05;
    public final C54439HDr A06;
    public final C55601HkL A07;
    public final C55705Hm2 A08;
    public final C53491GpN A09;
    public final UserSession A0A;
    public final C232852uY A0B;
    public final AnonymousClass4DU A0C;
    public final User A0D;
    public final String A0E;
    public final C262224Cq A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final AnonymousClass0Ud A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        if (r6.CZr() != true) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        if (r4.CTT() == true) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C55896HpH(X.JRH r63, com.instagram.barcelona.feed.post.data.PostViewStateRepository r64, X.C54439HDr r65, X.C55705Hm2 r66, com.instagram.common.session.UserSession r67, X.AnonymousClass4DU r68, com.instagram.user.model.User r69, java.lang.String r70, java.lang.String r71, X.C262224Cq r72) {
        /*
            r62 = this;
            r7 = 0
            java.lang.String r27 = ""
            r3 = 1
            r8 = 0
            r1 = r67
            X.1E8 r2 = X.1E7.A00(r1)
            r6 = 25
            X.IwG r4 = new X.IwG
            r4.<init>((java.lang.Object) r1, (int) r6)
            java.lang.Class<X.HkL> r0 = X.C55601HkL.class
            java.lang.Object r5 = r1.A01(r0, r4)
            X.HkL r5 = (X.C55601HkL) r5
            r13 = 4
            r11 = 6
            r0 = 21
            X.0qQ.A0B(r2, r0)
            X.0qQ.A0B(r5, r6)
            r0 = r62
            r0.<init>()
            r6 = r69
            r0.A0D = r6
            r0.A0A = r1
            r10 = r70
            r0.A0E = r10
            r12 = r65
            r0.A06 = r12
            r14 = r72
            r0.A0F = r14
            r4 = r64
            r0.A03 = r4
            r4 = r66
            r0.A08 = r4
            r61 = r68
            r4 = r61
            r0.A0C = r4
            r4 = r63
            r0.A02 = r4
            r0.A07 = r5
            X.1Xj r9 = r2.A02(r10)
            if (r9 == 0) goto L_0x01be
            X.GpN r4 = new X.GpN
            r4.<init>(r9)
        L_0x005a:
            r0.A01 = r4
            r15 = r71
            X.1Xj r9 = r2.A02(r15)
            if (r9 == 0) goto L_0x01bb
            X.GpN r4 = new X.GpN
            r4.<init>(r9)
        L_0x0069:
            r0.A09 = r4
            java.lang.String r23 = r6.getId()
            X.JRG r9 = r0.A01
            if (r9 == 0) goto L_0x01b7
            com.instagram.user.model.User r9 = r9.CCe(r1)
            if (r9 == 0) goto L_0x01b7
            java.lang.String r24 = X.AnonymousClass3ZA.A00(r9)
        L_0x007d:
            X.JRG r9 = r0.A01
            if (r9 == 0) goto L_0x01b3
            com.instagram.user.model.User r9 = r9.CCe(r1)
            if (r9 == 0) goto L_0x01b3
            com.instagram.common.typedurl.ImageUrl r19 = r9.Bh3()
        L_0x008b:
            X.GzC r9 = new X.GzC
            r9.<init>(r10)
            com.instagram.common.typedurl.ImageUrl r18 = r6.Bh3()
            java.lang.Integer r10 = r6.A0N()
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            boolean r38 = X.AnonymousClass7TF.A1W(r10, r6)
            X.JRG r6 = r0.A01
            if (r6 == 0) goto L_0x01af
            java.lang.Boolean r6 = r6.AkR()
            boolean r6 = X.AnonymousClass7TF.A1Y(r6, r3)
            if (r6 == 0) goto L_0x01af
            X.JRG r6 = r0.A01
            if (r6 == 0) goto L_0x01af
            com.instagram.user.model.User r6 = r6.CCe(r1)
            if (r6 == 0) goto L_0x01af
            java.lang.String r30 = r6.getUsername()
        L_0x00ba:
            if (r4 == 0) goto L_0x01ab
            java.lang.Integer r4 = r4.AxC()
            int r37 = r4.intValue()
        L_0x00c4:
            X.JRG r6 = r0.A01
            if (r6 == 0) goto L_0x00d0
            boolean r4 = r6.CZr()
            r54 = 1
            if (r4 == r3) goto L_0x01a5
        L_0x00d0:
            r54 = 0
            if (r6 != 0) goto L_0x01a5
            r31 = 0
        L_0x00d6:
            X.0xa r4 = r5.A00
            java.lang.String r5 = "inline_composer_has_tapped__tap_to_expand_nux"
            r57 = 0
            boolean r5 = r4.getBoolean(r5, r7)
            if (r5 != 0) goto L_0x00ed
            java.lang.String r5 = "inline_composer_tap_to_expand_nux_impression_count"
            int r5 = r4.getInt(r5, r7)
            r4 = 3
            if (r5 >= r4) goto L_0x00ed
            r57 = 1
        L_0x00ed:
            X.4Cl r4 = X.DbX.A0m(r1)
            java.lang.Boolean r4 = r4.C5P()
            if (r4 == 0) goto L_0x0109
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0109
            X.JRG r4 = r0.A01
            if (r4 == 0) goto L_0x0109
            boolean r4 = r4.CTT()
            r58 = 1
            if (r4 == r3) goto L_0x010b
        L_0x0109:
            r58 = 0
        L_0x010b:
            X.62M r33 = X.AnonymousClass62M.A01
            X.0sn r32 = X.0sn.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.GmK r16 = new X.GmK
            r21 = r4
            r25 = r8
            r26 = r15
            r28 = r8
            r29 = r8
            r34 = r33
            r35 = r33
            r36 = r7
            r39 = r7
            r40 = r7
            r41 = r7
            r42 = r7
            r43 = r7
            r44 = r7
            r45 = r7
            r46 = r7
            r47 = r7
            r48 = r7
            r49 = r7
            r50 = r7
            r51 = r7
            r52 = r7
            r53 = r3
            r55 = r7
            r56 = r7
            r59 = r3
            r60 = r7
            r17 = r9
            r20 = r4
            r22 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.02z r5 = X.DbS.A10(r16)
            r0.A0G = r5
            X.05F r5 = X.10b.A03(r5)
            r0.A0I = r5
            X.2uY r6 = new X.2uY
            r6.<init>(r1, r8)
            r0.A0B = r6
            java.lang.String r9 = r61.getModuleName()
            X.JG1 r7 = new X.JG1
            r7.<init>(r11, r2, r0)
            X.0qQ.A0B(r9, r3)
            X.1Bk r2 = X.C51972G9s.A0b(r1)
            X.H8S r5 = new X.H8S
            r5.<init>(r2, r9, r7)
            r0.A04 = r5
            X.1L1 r3 = r12.A03
            android.content.Context r16 = X.C60960kU.A00
            X.I0E r2 = new X.I0E
            r17 = r5
            r18 = r1
            r19 = r6
            r20 = r61
            r21 = r3
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.A05 = r2
            X.0sl r1 = X.0sl.A00
            X.02z r1 = X.106.A01(r1)
            r0.A0H = r1
            X.MH8 r1 = new X.MH8
            r1.<init>((java.lang.Object) r0, (X.AnonymousClass4D7) r8, (int) r13)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r4, r0, r1, r14)
            return
        L_0x01a5:
            java.lang.String r31 = r6.Bfq()
            goto L_0x00d6
        L_0x01ab:
            r37 = 0
            goto L_0x00c4
        L_0x01af:
            r30 = 0
            goto L_0x00ba
        L_0x01b3:
            r19 = 0
            goto L_0x008b
        L_0x01b7:
            r24 = 0
            goto L_0x007d
        L_0x01bb:
            r4 = 0
            goto L_0x0069
        L_0x01be:
            r4 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55896HpH.<init>(X.JRH, com.instagram.barcelona.feed.post.data.PostViewStateRepository, X.HDr, X.Hm2, com.instagram.common.session.UserSession, X.4DU, com.instagram.user.model.User, java.lang.String, java.lang.String, X.4Cq):void");
    }
}
