package X;

/* renamed from: X.IxD  reason: case insensitive filesystem */
public final class C58766IxD extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58766IxD(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A04 = z;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0523, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0535, code lost:
        if (r4 == null) goto L_0x0537;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0556;
                case 1: goto L_0x0584;
                case 2: goto L_0x052d;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x04ec;
                case 8: goto L_0x0457;
                case 9: goto L_0x0392;
                case 10: goto L_0x0376;
                case 11: goto L_0x0306;
                case 12: goto L_0x02dc;
                case 13: goto L_0x02dc;
                case 14: goto L_0x05ea;
                case 15: goto L_0x02c9;
                case 16: goto L_0x01ca;
                case 17: goto L_0x01a1;
                case 18: goto L_0x0188;
                case 19: goto L_0x0150;
                case 20: goto L_0x0136;
                case 21: goto L_0x00e5;
                case 22: goto L_0x0065;
                case 23: goto L_0x0036;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r1 = (X.1Ln) r1
            X.GkM r5 = new X.GkM
            r5.<init>()
            java.lang.Object r4 = r0.A03
            com.facebookpay.logging.LoggingContext r4 = (com.facebookpay.logging.LoggingContext) r4
            X.C51971G9r.A1B(r5, r4)
            boolean r2 = r0.A04
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = "perform_validation"
            r5.A03(r2, r3)
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.String r2 = "account_mutation_data_list"
            X.G9t.A1L(r5, r4, r2, r3)
            java.lang.String r2 = "event_payload"
            r1.A0N(r5, r2)
            java.lang.Object r0 = r0.A02
            X.C51969G9p.A1G(r1, r0)
            return r1
        L_0x0036:
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A03
            X.JPn r3 = (X.C59593JPn) r3
            java.lang.Object r5 = r0.A01
            X.4bN r5 = (X.C267324bN) r5
            java.lang.Object r6 = r0.A02
            X.GDe r6 = (X.C52058GDe) r6
            X.HLF r7 = X.HLF.BRAND
            boolean r0 = r0.A04
            r4 = 0
            java.lang.String r15 = "name"
            r8 = r1
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r2
            r20 = r0
            r3.Da6(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x05e7
        L_0x0065:
            X.JPA r1 = (X.JPA) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x0079
            X.Hz6 r5 = X.C56474Hz6.A00
            r4 = 0
            X.0sK r3 = X.C55399Hh5.A00
            java.lang.String r2 = "wall_ptr"
            r1.Cf6(r5, r2, r4, r3)
        L_0x0079:
            java.lang.Object r9 = r0.A03
            com.instagram.wonderwall.model.WallInfo r9 = (com.instagram.wonderwall.model.WallInfo) r9
            boolean r2 = r9.A02
            if (r2 == 0) goto L_0x0099
            X.Hz6 r7 = X.C56474Hz6.A00
            r6 = 0
            r5 = -1302776257(0xffffffffb259363f, float:-1.26433966E-8)
            java.lang.Object r4 = r0.A01
            r3 = 26
            X.JJS r2 = new X.JJS
            r2.<init>(r3, r9, r4)
            X.5PJ r3 = X.AnonymousClass5PI.A03(r2, r5)
            java.lang.String r2 = "feed_add_to_wall_card"
            r1.Cf6(r7, r6, r2, r3)
        L_0x0099:
            java.lang.Object r8 = r0.A02
            X.4gU r8 = (X.C270284gU) r8
            java.lang.Object r2 = r8.getValue()
            X.Gn9 r2 = (X.C53379Gn9) r2
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            X.J4n r2 = X.C59054J4n.A00
            java.lang.Object r6 = r0.A01
            int r14 = r7.size()
            r0 = 26
            X.J6T r5 = new X.J6T
            r5.<init>((int) r0, (java.util.List) r7, (X.0sP) r2)
            r0 = 6
            X.J6g r11 = X.C59098J6g.A01(r7, r0)
            r4 = 0
            r3 = -886456479(0xffffffffcb29bf61, float:-1.1124577E7)
            r2 = 12
            X.JK1 r0 = new X.JK1
            r0.<init>((int) r2, (java.lang.Object) r9, (java.lang.Object) r6, (java.lang.Object) r7)
            X.5PJ r13 = X.AnonymousClass5PI.A03(r0, r3)
            r9 = r1
            r10 = r5
            r12 = r4
            r9.CfD(r10, r11, r12, r13, r14)
            java.lang.Object r0 = r8.getValue()
            X.Gn9 r0 = (X.C53379Gn9) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x05e7
            X.Hz6 r3 = X.C56474Hz6.A00
            X.0sK r2 = X.C55399Hh5.A01
            java.lang.String r0 = "end_loading"
            r1.Cf6(r3, r4, r0, r2)
            goto L_0x05e7
        L_0x00e5:
            int r4 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r1 = r0.A03
            com.instagram.wonderwall.model.WallPostItem r1 = (com.instagram.wonderwall.model.WallPostItem) r1
            com.instagram.wonderwall.model.WallPostInfo r1 = r1.BeB()
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x05e7
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x05e7
            java.lang.Object r3 = r0.A01
            X.5Tq r3 = (X.C286025Tq) r3
            java.lang.Object r1 = r0.A02
            r0 = 48
            X.MPC r2 = new X.MPC
            r2.<init>(r1, r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.List r0 = r3.A03(r4, r4)
            java.lang.Object r3 = X.00k.A0J(r0)
            X.62b r3 = (X.C3022062b) r3
            if (r3 == 0) goto L_0x05e7
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "wall_user_mention"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x05e7
            java.lang.Object r3 = r3.A02
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            r0 = 1
            if (r1 <= r0) goto L_0x05e7
            java.lang.String r0 = r3.substring(r0)
            X.0qQ.A07(r0)
            goto L_0x0523
        L_0x0136:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A03
            r2.invoke(r0, r1)
            goto L_0x05e7
        L_0x0149:
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            goto L_0x05e7
        L_0x0150:
            X.7vz r1 = (X.C346927vz) r1
            r3 = 0
            int r2 = X.DbU.A02(r1, r3)
            r1 = 1
            if (r2 == r1) goto L_0x0179
            r1 = 2
            if (r2 == r1) goto L_0x0164
            if (r2 == r3) goto L_0x05e7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0164:
            java.lang.Object r3 = r0.A03
            X.SJD r3 = (X.SJD) r3
            X.OKx r2 = r3.A04
            java.lang.Object r0 = r0.A01
            X.Th6 r0 = (X.C13791Th6) r0
            int r1 = r0.Bbj()
            X.RBD r0 = r3.A03
            r2.A00(r0, r1)
            goto L_0x05e7
        L_0x0179:
            java.lang.Object r2 = r0.A03
            X.SJD r2 = (X.SJD) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r0.A04
            X.SJD.A00(r2, r1, r0)
            goto L_0x05e7
        L_0x0188:
            java.lang.Object r1 = r0.A02
            X.6Zo r1 = (X.C309776Zo) r1
            java.lang.Object r4 = r0.A03
            X.3mM r4 = (X.C250973mM) r4
            java.lang.Object r3 = r0.A01
            X.3uh r3 = (X.C255773uh) r3
            r1.Ch5(r3, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            boolean r6 = r0.A04
            r2 = 0
            r1.DcP(r2, r3, r4, r5, r6)
            goto L_0x05e7
        L_0x01a1:
            X.6Gb r1 = (X.C305006Gb) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r7 = r0.A03
            X.Gmi r7 = (X.C53358Gmi) r7
            java.util.List r6 = r7.A05
            boolean r10 = r0.A04
            java.lang.Object r8 = r0.A02
            java.lang.Object r9 = r0.A01
            X.J3b r4 = X.C59016J3b.A00
            int r3 = r6.size()
            r2 = 15
            X.MPB r0 = new X.MPB
            r0.<init>((int) r2, (java.util.List) r6, (X.0sP) r4)
            X.JJh r4 = new X.JJh
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C51971G9r.A10(r1, r4, r0, r3)
            goto L_0x05e7
        L_0x01ca:
            X.N8r r1 = (X.C68280N8r) r1
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.lang.Object r12 = r0.A02
            X.NdH r12 = (X.NdH) r12
            X.N4t r2 = r12.A02
            java.lang.Object r11 = r0.A01
            com.facebook.android.maps.model.LatLng r11 = (com.facebook.android.maps.model.LatLng) r11
            if (r11 != 0) goto L_0x01de
            com.facebook.android.maps.model.LatLng r11 = r2.A04
        L_0x01de:
            boolean r10 = r0.A04
            r30 = r10 ^ 1
            java.lang.String r9 = r2.A0B
            X.4AB r3 = r2.A05
            r36 = r3
            com.instagram.user.model.User r8 = r2.A06
            long r3 = r2.A02
            java.lang.String r5 = r2.A0A
            r20 = r5
            boolean r5 = r2.A0H
            r26 = r5
            boolean r5 = r2.A0I
            r27 = r5
            boolean r5 = r2.A0J
            r19 = r5
            java.lang.String r5 = r2.A09
            r21 = r5
            boolean r5 = r2.A0C
            r18 = r5
            int r5 = r2.A01
            r23 = r5
            boolean r5 = r2.A0G
            r17 = r5
            boolean r5 = r2.A0F
            r16 = r5
            boolean r15 = r2.A0K
            boolean r7 = r2.A00
            boolean r6 = r2.A0D
            java.lang.String r5 = r2.A08
            java.lang.Integer r2 = r2.A07
            X.0qQ.A0B(r9, r13)
            X.AnonymousClass7TG.A1P(r11, r8)
            r14 = 19
            X.0qQ.A0B(r2, r14)
            X.N4t r14 = new X.N4t
            r28 = r19
            r29 = r18
            r31 = r17
            r32 = r16
            r33 = r15
            r34 = r7
            r35 = r6
            r17 = r8
            r18 = r2
            r19 = r9
            r22 = r5
            r24 = r3
            r15 = r11
            r16 = r36
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r7 = r12.A06
            int r6 = r12.A00
            X.GnT r5 = r12.A01
            boolean r3 = r12.A04
            java.lang.String r2 = r12.A03
            X.NdH r4 = new X.NdH
            r15 = r4
            r16 = r5
            r17 = r14
            r18 = r2
            r19 = r6
            r20 = r7
            r21 = r13
            r22 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = r0.A03
            X.MYL r0 = (X.MYL) r0
            X.JM9 r0 = r0.A0O()
            X.N8r r0 = (X.C68280N8r) r0
            X.Gmr r3 = r0.A01
            boolean r0 = r3.A08
            r30 = r0
            boolean r0 = r3.A09
            r29 = r0
            boolean r0 = r3.A0E
            r16 = r0
            boolean r0 = r3.A0H
            r17 = r0
            boolean r0 = r3.A0F
            r18 = r0
            boolean r14 = r3.A0D
            int r13 = r3.A00
            boolean r12 = r3.A07
            boolean r11 = r3.A0A
            boolean r9 = r3.A0G
            boolean r8 = r3.A04
            boolean r7 = r3.A06
            boolean r6 = r3.A05
            boolean r5 = r3.A03
            com.instagram.direct.inbox.notes.models.NoteAudience r2 = r3.A01
            boolean r0 = r3.A0B
            X.N2q r15 = r3.A02
            r3 = 15
            X.0qQ.A0B(r2, r3)
            X.Gmr r3 = new X.Gmr
            r22 = r10
            r23 = r9
            r24 = r8
            r25 = r7
            r26 = r6
            r27 = r5
            r28 = r0
            r19 = r14
            r20 = r12
            r21 = r11
            r10 = r3
            r11 = r2
            r12 = r15
            r14 = r30
            r15 = r29
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.util.Set r2 = r1.A03
            java.util.List r0 = r1.A02
            X.N8r r1 = X.C68280N8r.A00(r4, r3, r0, r2)
            return r1
        L_0x02c9:
            java.lang.Object r3 = r0.A01
            X.3Wa r3 = (X.C242813Wa) r3
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            boolean r0 = r0.A04
            r3.D3D(r2, r1, r0)
            goto L_0x05e7
        L_0x02dc:
            X.3t2 r1 = (X.C254783t2) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0303
            r0 = 795(0x31b, float:1.114E-42)
        L_0x02f4:
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.1pE r0 = X.1pE.A01(r3, r2, r4, r0)
            r0.A0B = r1
            r0.A06()
            goto L_0x05e7
        L_0x0303:
            r0 = 907(0x38b, float:1.271E-42)
            goto L_0x02f4
        L_0x0306:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x035c
            java.lang.Object r10 = r0.A03
            X.P2b r10 = (X.C72336P2b) r10
            java.lang.Object r11 = r0.A01
            X.6ST r11 = (X.AnonymousClass6ST) r11
            java.lang.Object r8 = r0.A02
            X.02m r8 = (X.02m) r8
            X.0qQ.A0A(r8)
            boolean r12 = r0.A04
            X.N4P r0 = r10.A04
            java.util.List r0 = r0.A09()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x032b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0341
            java.lang.Object r0 = r1.next()
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r0 = r0.getId()
            r5.add(r0)
            goto L_0x032b
        L_0x0341:
            com.instagram.common.session.UserSession r1 = r10.A03
            java.lang.String r3 = X.DbV.A0s()
            r2 = 0
            r6 = 0
            r7 = 1
            r4 = r2
            X.1OC r0 = com.instagram.direct.request.DirectThreadApi.A04(r1, r2, r3, r4, r5, r6, r7)
            X.Gz4 r7 = new X.Gz4
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00 = r7
            X.1ES.A03(r0)
            goto L_0x05e7
        L_0x035c:
            java.lang.Object r1 = r0.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.dismiss()
            java.lang.Object r5 = r0.A03
            X.P2b r5 = (X.C72336P2b) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A03
            X.N4P r2 = r5.A04
            boolean r1 = r0.A04
            X.0iw r0 = r5.A02
            X.OPN.A00(r4, r0, r3, r2, r1)
            goto L_0x05e7
        L_0x0376:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x038b
            java.lang.Object r3 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r3
            java.lang.Object r2 = r0.A02
            X.5kq r2 = (X.C293505kq) r2
            X.50r r2 = r2.A0H
            r3.A0E(r2)
        L_0x038b:
            java.lang.Object r0 = r0.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x05e7
        L_0x0392:
            X.Q3m r1 = (X.C7310Q3m) r1
            r15 = 0
            X.0qQ.A0B(r1, r15)
            boolean r2 = r1 instanceof X.Q4B
            if (r2 == 0) goto L_0x040b
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x05e7
            X.Q4B r1 = (X.Q4B) r1
            X.T9F r1 = r1.A00
            if (r1 == 0) goto L_0x05e7
            java.lang.Object r6 = r0.A03
            X.6RB r6 = (X.AnonymousClass6RB) r6
            java.lang.Object r2 = r0.A02
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x05e7
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x05e7
            java.util.List r0 = r1.A00
            X.0qQ.A06(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x03c1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05e7
            java.lang.Object r4 = r5.next()
            X.If1 r4 = (X.C57698If1) r4
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.Map r0 = r4.A02
            if (r0 == 0) goto L_0x03f3
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x03d9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03f3
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r2.get(r0)
            r10.put(r1, r0)
            goto L_0x03d9
        L_0x03f3:
            java.lang.String r9 = r4.A01
            X.0qQ.A06(r9)
            java.util.Set r11 = r4.A03
            java.lang.Long r0 = r4.A00
            X.0qQ.A06(r0)
            long r12 = r0.longValue()
            r14 = 1
            X.Q3K r7 = X.Q3K.PARALLEL_FETCH
            r8 = 0
            r6.A03(r7, r8, r9, r10, r11, r12, r14, r15)
            goto L_0x03c1
        L_0x040b:
            boolean r2 = r1 instanceof X.C7312Q3o
            if (r2 == 0) goto L_0x0434
            java.lang.Object r2 = r0.A03
            X.6RB r2 = (X.AnonymousClass6RB) r2
            X.AnonymousClass6RB.A01(r2, r1)
            java.lang.Object r0 = r0.A01
            X.JPG r0 = (X.JPG) r0
            if (r0 == 0) goto L_0x05e7
            X.IfK r2 = new X.IfK
            r2.<init>(r0)
        L_0x0421:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x044b
            r2.run()
            goto L_0x05e7
        L_0x0434:
            boolean r2 = r1 instanceof X.R9Q
            if (r2 == 0) goto L_0x0452
            java.lang.Object r2 = r0.A03
            X.6RB r2 = (X.AnonymousClass6RB) r2
            X.AnonymousClass6RB.A01(r2, r1)
            java.lang.Object r0 = r0.A01
            X.JPG r0 = (X.JPG) r0
            if (r0 == 0) goto L_0x05e7
            X.Igv r2 = new X.Igv
            r2.<init>(r1, r0)
            goto L_0x0421
        L_0x044b:
            android.os.Handler r0 = X.AnonymousClass6RB.A0E
            r0.post(r2)
            goto L_0x05e7
        L_0x0452:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0457:
            X.7aH r1 = (X.C333867aH) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r7 = r0.A03
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r0.A02
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r3 = r0.A01
            boolean r2 = r0.A04
            r0 = 7
            X.Iwj r8 = new X.Iwj
            r8.<init>(r0, r3, r2)
            X.AnonymousClass7TG.A1O(r7, r6)
            java.util.List r0 = r1.A06
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x047c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04e5
            java.lang.Object r3 = r11.next()
            X.9IV r3 = (X.AnonymousClass9IV) r3
            java.lang.Object r9 = r3.A01
            X.7dj r9 = (X.C335907dj) r9
            java.lang.String r2 = r9.A0K
            boolean r0 = r7.contains(r2)
            if (r0 == 0) goto L_0x049a
            java.lang.Object r9 = r8.invoke(r9)
            X.7dj r9 = (X.C335907dj) r9
        L_0x049a:
            boolean r0 = r6.contains(r2)
            java.lang.Object r10 = r3.A00
            X.9Ib r10 = (X.C376459Ib) r10
            if (r0 == 0) goto L_0x04dd
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x04b0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04cc
            java.lang.Object r2 = r3.next()
            X.7dj r2 = (X.C335907dj) r2
            java.lang.String r0 = r2.A0K
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x04c8
            java.lang.Object r2 = r8.invoke(r2)
        L_0x04c8:
            r4.add(r2)
            goto L_0x04b0
        L_0x04cc:
            java.lang.Object r2 = r10.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r10.A00
            X.7dk r0 = (X.C335917dk) r0
            X.9Ib r0 = X.C376459Ib.A00(r0, r4, r2)
            X.9IV r0 = X.AnonymousClass9IV.A00(r0, r9)
            goto L_0x04e1
        L_0x04dd:
            X.9IV r0 = X.AnonymousClass9IV.A00(r10, r9)
        L_0x04e1:
            r5.add(r0)
            goto L_0x047c
        L_0x04e5:
            r0 = 8190(0x1ffe, float:1.1477E-41)
            X.7aH r1 = X.C333867aH.A00((X.C61081JwJ) null, (X.C333847aF) null, (X.C333817aC) null, r1, r5, (java.util.List) null, 0, r0, false, false)
            return r1
        L_0x04ec:
            float r2 = X.AnonymousClass7TE.A04(r1)
            java.lang.Object r4 = r0.A01
            X.5Oz r4 = (X.C284945Oz) r4
            float r1 = X.C51971G9r.A02(r4)
            float r1 = r1 + r2
            X.C51967G9n.A14(r4, r1)
            java.lang.Object r3 = r0.A02
            X.5Oz r3 = (X.C284945Oz) r3
            float r2 = X.C51971G9r.A02(r3)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x05e7
            boolean r1 = r0.A04
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            if (r1 == 0) goto L_0x0528
            float r1 = X.C51971G9r.A02(r3)
            float r0 = X.C51971G9r.A02(r4)
            float r1 = r1 - r0
        L_0x051a:
            float r0 = X.C51971G9r.A02(r3)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L_0x0523:
            r2.invoke(r0)
            goto L_0x05e7
        L_0x0528:
            float r1 = X.C51971G9r.A02(r4)
            goto L_0x051a
        L_0x052d:
            X.LFx r1 = (X.C63970LFx) r1
            if (r1 == 0) goto L_0x0553
            X.LP3 r5 = r1.A04
            X.LP3 r4 = r1.A03
            if (r4 != 0) goto L_0x0539
        L_0x0537:
            X.LP3 r4 = X.LP3.A03
        L_0x0539:
            boolean r3 = r0.A04
            java.lang.Object r2 = r0.A02
            X.Kfy r2 = (X.C62448Kfy) r2
            java.lang.Object r0 = r0.A01
            X.KzI r0 = (X.C63569KzI) r0
            if (r3 == 0) goto L_0x054e
            X.LP3 r4 = r4.A00(r0, r2)
        L_0x0549:
            X.LFx r1 = X.LQS.A00(r1, r5, r4)
            return r1
        L_0x054e:
            X.LP3 r5 = r5.A00(r0, r2)
            goto L_0x0549
        L_0x0553:
            X.LP3 r5 = X.LP3.A03
            goto L_0x0537
        L_0x0556:
            X.4cl r1 = (X.C268104cl) r1
            java.lang.Object r7 = r0.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.A01
            X.6JK r6 = (X.AnonymousClass6JK) r6
            boolean r5 = r0.A04
            int r4 = r7.size()
            r3 = 0
        L_0x0567:
            if (r3 >= r4) goto L_0x0577
            java.lang.Object r2 = r7.get(r3)
            X.6JK r2 = (X.AnonymousClass6JK) r2
            if (r2 == r6) goto L_0x0574
            r2.A01(r1, r5)
        L_0x0574:
            int r3 = r3 + 1
            goto L_0x0567
        L_0x0577:
            if (r6 == 0) goto L_0x057c
            r6.A01(r1, r5)
        L_0x057c:
            java.lang.Object r0 = r0.A02
            X.5Oz r0 = (X.C284945Oz) r0
            r0.getValue()
            goto L_0x05e7
        L_0x0584:
            X.5Q4 r1 = (X.AnonymousClass5Q4) r1
            r1.AQW()
            java.lang.Object r2 = r0.A03
            X.0sa r2 = (X.C62320sa) r2
            boolean r2 = X.C51971G9r.A1b(r2)
            if (r2 == 0) goto L_0x05e7
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x05ce
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r8 = r0.A02
            X.60f r8 = (X.C3018260f) r8
            java.lang.Object r10 = r0.A01
            X.5bW r10 = (X.C288195bW) r10
            long r5 = r1.AmQ()
            X.5QD r7 = r1.Ayw()
            r11 = r7
            X.5QC r11 = (X.AnonymousClass5QC) r11
            X.5Q5 r0 = r11.A02
            X.5QB r4 = r0.A02
            long r2 = X.C51967G9n.A05(r4)
            X.5QF r0 = r11.A01     // Catch:{ all -> 0x05c9 }
            r0.EKJ(r5, r12, r9)     // Catch:{ all -> 0x05c9 }
            r17 = 0
            X.5dw r14 = X.C289635dw.A00     // Catch:{ all -> 0x05c9 }
            r16 = 3
            r11 = r1
            r12 = r10
            r13 = r8
            r15 = r9
            r11.AQd(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x05c9 }
            goto L_0x05e4
        L_0x05c9:
            r0 = move-exception
            X.C51968G9o.A1G(r4, r7, r2)
            throw r0
        L_0x05ce:
            java.lang.Object r2 = r0.A02
            X.60f r2 = (X.C3018260f) r2
            java.lang.Object r0 = r0.A01
            X.5bW r0 = (X.C288195bW) r0
            r9 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            X.5dw r6 = X.C289635dw.A00
            r8 = 3
            r3 = r1
            r4 = r0
            r5 = r2
            r3.AQd(r4, r5, r6, r7, r8, r9)
            goto L_0x05e7
        L_0x05e4:
            X.C51968G9o.A1G(r4, r7, r2)
        L_0x05e7:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x05ea:
            java.lang.String r0 = "feedCommentRowDelegate"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58766IxD.invoke(java.lang.Object):java.lang.Object");
    }
}
