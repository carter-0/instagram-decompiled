package X;

/* renamed from: X.IkP  reason: case insensitive filesystem */
public final class C58032IkP implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C58032IkP(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0244, code lost:
        if (r6 != false) goto L_0x023f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r3 = r20
            r1 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01c1;
                case 2: goto L_0x0196;
                case 3: goto L_0x014c;
                case 4: goto L_0x0115;
                default: goto L_0x0009;
            }
        L_0x0009:
            r6 = 39
            r7 = r22
            boolean r0 = X.MEA.A03(r6, r7)
            if (r0 == 0) goto L_0x010e
            r2 = r7
            X.MEA r2 = (X.MEA) r2
            int r5 = r2.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r4
            if (r0 == 0) goto L_0x010e
            int r5 = r5 - r4
            r2.A00 = r5
        L_0x0021:
            java.lang.Object r4 = r2.A02
            X.1Hj r8 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r7) goto L_0x0274
            X.0eS.A00(r4)
        L_0x002f:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0032:
            X.0eS.A00(r4)
            java.lang.Object r5 = r3.A02
            X.02o r5 = (X.02o) r5
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r0 = r1.A02
            X.N9J r0 = (X.N9J) r0
            java.lang.Integer r0 = r0.A01
            int r0 = r0.intValue()
            if (r0 != r7) goto L_0x00f7
            java.lang.Object r0 = r1.A00
            com.instagram.rtc.rsys.models.EngineModel r0 = (com.instagram.rtc.rsys.models.EngineModel) r0
            r11 = 0
            if (r0 == 0) goto L_0x00f3
            com.instagram.rtc.rsys.models.IgCallModel r1 = r0.callModel
            if (r1 == 0) goto L_0x00f4
            com.instagram.rtc.rsys.models.RingNotification r6 = r1.ringNotification
        L_0x0054:
            java.lang.Object r0 = r3.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            X.N3a r0 = (X.C68160N3a) r0
            if (r0 != 0) goto L_0x007e
            if (r1 == 0) goto L_0x00f0
            java.lang.String r14 = r1.localCallId
        L_0x0062:
            java.lang.String r9 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "ring_notification"
            java.util.Map r17 = X.AnonymousClass7TF.A0w(r4, r9)
            java.lang.Object r4 = r3.A03
            X.0lg r4 = (X.0lg) r4
            com.instagram.foa.session.IgMetaSessionImpl r12 = X.C56316HwT.A01(r4)
            java.lang.String r13 = "ig_incoming_params_missing"
            X.0sn r16 = X.0sn.A00
            r15 = r11
            r18 = r7
            X.OX3.A02(r12, r13, r14, r15, r16, r17, r18)
        L_0x007e:
            if (r6 == 0) goto L_0x00c0
            java.lang.Object r10 = r3.A03
            X.0lg r10 = (X.0lg) r10
            X.0Tu r9 = X.0Tu.A05
            r3 = 36328083225066421(0x81103300003bb5, double:3.0373643407572304E-306)
            boolean r3 = X.182.A06(r9, r10, r3)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = r6.avatarUrl
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r3)
            java.lang.String r13 = r6.displayName
            X.0qQ.A06(r13)
            java.lang.String r14 = r6.groupCallerName
            java.lang.String r15 = r6.igThreadId
            boolean r3 = r1.inviteRequestedVideo
            r18 = r3 ^ 1
            if (r0 == 0) goto L_0x00a8
            X.PxB r11 = r0.A01
        L_0x00a8:
            boolean r3 = r1.e2eeMandated
            java.lang.String r0 = r1.localCallId
            X.N9F r10 = new X.N9F
            r17 = r7
            r19 = r3
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00b7:
            r2.A00 = r7
            java.lang.Object r0 = r5.emit(r10, r2)
            if (r0 != r8) goto L_0x002f
            return r8
        L_0x00c0:
            if (r0 == 0) goto L_0x00f7
            java.lang.String r3 = r0.A05
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r3)
            java.lang.String r13 = r0.A06
            java.lang.String r14 = r0.A04
            java.lang.String r15 = r0.A08
            boolean r3 = r0.A09
            X.PxB r11 = r0.A01
            X.Nid r6 = r0.A02
            X.Nid r4 = X.C69277Nid.NO_E2EE
            boolean r19 = X.C51969G9p.A1a(r6, r4)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = r1.localCallId
            if (r1 != 0) goto L_0x00e4
        L_0x00e0:
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r0 = r0.A03
            java.lang.String r1 = r0.A0H
        L_0x00e4:
            X.N9F r10 = new X.N9F
            r17 = r7
            r18 = r3
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00b7
        L_0x00f0:
            r14 = r11
            goto L_0x0062
        L_0x00f3:
            r1 = r11
        L_0x00f4:
            r6 = r11
            goto L_0x0054
        L_0x00f7:
            java.lang.String r13 = ""
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r13)
            r11 = 0
            r17 = 0
            X.N9F r10 = new X.N9F
            r14 = r11
            r15 = r11
            r16 = r11
            r18 = r17
            r19 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00b7
        L_0x010e:
            X.MEA r2 = new X.MEA
            r2.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r7, (int) r6)
            goto L_0x0021
        L_0x0115:
            boolean r0 = r1 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x002f
            r7 = 1
            boolean r0 = X.C59678JTj.A01(r7, r1)
            if (r0 != 0) goto L_0x002f
            r6 = 0
            boolean r0 = X.C59678JTj.A01(r6, r1)
            if (r0 == 0) goto L_0x027e
            java.lang.Object r5 = r3.A04
            com.instagram.nido.impl.explore.NidoExploreViewModel r5 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r5
            java.lang.Object r4 = r3.A02
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r4
            java.lang.Object r2 = r3.A01
            X.WW4 r2 = (X.WW4) r2
            java.lang.Object r1 = r3.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 == r6) goto L_0x0149
            if (r0 != r7) goto L_0x0279
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0141:
            com.instagram.nido.impl.explore.NidoExploreViewModel.A01(r4, r5, r0, r1)
            r2.A0K(r4)
            goto L_0x002f
        L_0x0149:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0141
        L_0x014c:
            boolean r0 = r1 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x002f
            r7 = 0
            boolean r0 = X.C59678JTj.A01(r7, r1)
            if (r0 == 0) goto L_0x0184
            java.lang.Object r6 = r3.A04
            com.instagram.nido.impl.explore.NidoExploreViewModel r6 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r6
            java.lang.Object r5 = r3.A02
            com.instagram.explore.topiccluster.ExploreTopicCluster r5 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r5
            java.lang.Object r4 = r3.A01
            X.WW4 r4 = (X.WW4) r4
            java.lang.Object r2 = r3.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 1
            int r0 = r2.intValue()
            if (r0 == r7) goto L_0x0181
            if (r0 != r1) goto L_0x0283
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0172:
            com.instagram.nido.impl.explore.NidoExploreViewModel.A01(r5, r6, r0, r2)
            r4.A0K(r5)
            java.util.Set r1 = r6.A02
        L_0x017a:
            java.lang.String r0 = r5.A06
            r1.remove(r0)
            goto L_0x002f
        L_0x0181:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0172
        L_0x0184:
            r0 = 1
            boolean r0 = X.C59678JTj.A01(r0, r1)
            if (r0 == 0) goto L_0x0288
            java.lang.Object r0 = r3.A04
            com.instagram.nido.impl.explore.NidoExploreViewModel r0 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r0
            java.util.Set r1 = r0.A02
            java.lang.Object r5 = r3.A02
            com.instagram.explore.topiccluster.ExploreTopicCluster r5 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r5
            goto L_0x017a
        L_0x0196:
            boolean r0 = r1 instanceof X.LLL
            if (r0 == 0) goto L_0x01af
            java.lang.Object r2 = r3.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r3.A04
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.Gn8 r0 = (X.C53378Gn8) r0
            java.lang.String r1 = r0.A07
            X.8hK r0 = X.C56446Hye.A00
            r2.invoke(r1, r0)
            goto L_0x002f
        L_0x01af:
            boolean r0 = r1 instanceof X.LLM
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r3.A02
        L_0x01b5:
            X.DbS.A1U(r0)
            goto L_0x002f
        L_0x01ba:
            boolean r0 = r1 instanceof X.LLK
            if (r0 == 0) goto L_0x028d
            java.lang.Object r0 = r3.A01
            goto L_0x01b5
        L_0x01c1:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r6 = r3.A03
            X.Gc7 r6 = (X.C52754Gc7) r6
            X.5Oz r0 = r6.A0A
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r5 = r3.A04
            X.5Ui r5 = (X.C286205Ui) r5
            java.lang.Object r1 = r3.A02
            X.Gb5 r1 = (X.C52693Gb5) r1
            X.5Oz r0 = r1.A0K
            X.5Tl r4 = X.C51966G9m.A0i(r0)
            java.lang.Object r2 = r3.A01
            X.5Uc r2 = (X.C286145Uc) r2
            X.JS3 r1 = r1.A08
            X.Hpp r0 = r6.A0M
            X.C52754Gc7.A01(r6, r2, r4, r5, r0)
            X.C52694Gb6.A02(r6, r1, r4)
            goto L_0x002f
        L_0x01f1:
            java.lang.Object r0 = r3.A03
            X.Gc7 r0 = (X.C52754Gc7) r0
            X.C52694Gb6.A01(r0)
            goto L_0x002f
        L_0x01fa:
            boolean r0 = r1 instanceof X.C56843IEq
            if (r0 == 0) goto L_0x0247
            java.lang.Object r1 = r3.A03
        L_0x0200:
            X.0rk r1 = (X.0rk) r1
            int r0 = r1.A00
            int r0 = r0 + 1
        L_0x0206:
            r1.A00 = r0
        L_0x0208:
            java.lang.Object r0 = r3.A03
            X.0rk r0 = (X.0rk) r0
            int r0 = r0.A00
            r6 = 0
            boolean r5 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Object r0 = r3.A02
            X.0rk r0 = (X.0rk) r0
            int r0 = r0.A00
            boolean r4 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Object r0 = r3.A01
            X.0rk r0 = (X.0rk) r0
            int r0 = r0.A00
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            java.lang.Object r1 = r3.A04
            X.GeZ r1 = (X.C52899GeZ) r1
            boolean r0 = r1.A02
            if (r0 == r5) goto L_0x0232
            r1.A02 = r5
            r6 = 1
        L_0x0232:
            boolean r0 = r1.A01
            if (r0 == r4) goto L_0x0239
            r1.A01 = r4
            r6 = 1
        L_0x0239:
            boolean r0 = r1.A00
            if (r0 == r2) goto L_0x0244
            r1.A00 = r2
        L_0x023f:
            X.C288785cT.A00(r1)
            goto L_0x002f
        L_0x0244:
            if (r6 == 0) goto L_0x002f
            goto L_0x023f
        L_0x0247:
            boolean r0 = r1 instanceof X.GPY
            if (r0 != 0) goto L_0x0256
            boolean r0 = r1 instanceof X.C56846IEt
            if (r0 != 0) goto L_0x0256
            boolean r0 = r1 instanceof X.C56842IEp
            if (r0 == 0) goto L_0x0259
            java.lang.Object r1 = r3.A02
            goto L_0x0200
        L_0x0256:
            java.lang.Object r1 = r3.A03
            goto L_0x025f
        L_0x0259:
            boolean r0 = r1 instanceof X.C56845IEs
            if (r0 == 0) goto L_0x0266
            java.lang.Object r1 = r3.A02
        L_0x025f:
            X.0rk r1 = (X.0rk) r1
            int r0 = r1.A00
            int r0 = r0 + -1
            goto L_0x0206
        L_0x0266:
            boolean r0 = r1 instanceof X.C56841IEo
            if (r0 == 0) goto L_0x026d
            java.lang.Object r1 = r3.A01
            goto L_0x0200
        L_0x026d:
            boolean r0 = r1 instanceof X.C56844IEr
            if (r0 == 0) goto L_0x0208
            java.lang.Object r1 = r3.A01
            goto L_0x025f
        L_0x0274:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0279:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x027e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0283:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0288:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x028d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58032IkP.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
