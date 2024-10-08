package com.instagram.rtc.interactor.participants;

import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C69137NfI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1", f = "RtcCallParticipantsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallParticipantsInteractor$setup$flow$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C69137NfI A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsInteractor$setup$flow$1(C69137NfI nfI, AnonymousClass4D7 r3, boolean z) {
        super(6, r3);
        this.A05 = nfI;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        RtcCallParticipantsInteractor$setup$flow$1 rtcCallParticipantsInteractor$setup$flow$1 = new RtcCallParticipantsInteractor$setup$flow$1(this.A05, (AnonymousClass4D7) obj6, this.A06);
        rtcCallParticipantsInteractor$setup$flow$1.A00 = obj;
        rtcCallParticipantsInteractor$setup$flow$1.A01 = obj2;
        rtcCallParticipantsInteractor$setup$flow$1.A04 = A1a;
        rtcCallParticipantsInteractor$setup$flow$1.A02 = obj4;
        rtcCallParticipantsInteractor$setup$flow$1.A03 = obj5;
        return rtcCallParticipantsInteractor$setup$flow$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0263, code lost:
        if (r2.selfParticipant.audioEnabled == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0267, code lost:
        if (r3 != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0269, code lost:
        r45 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026f, code lost:
        if (r2.selfParticipant.videoEnabled != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0271, code lost:
        r45 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027f, code lost:
        if (X.0qQ.A0K(java.lang.String.valueOf(r19.BST()), r7) != false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        r46 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028b, code lost:
        if (X.0qQ.A0K(r2.selfParticipant.userId, r7) == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028d, code lost:
        r46 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028f, code lost:
        r9 = r6.A03;
        r7 = r0.A03;
        r6 = r0.A01;
        r0 = r0.A00;
        X.AnonymousClass7TG.A1T(r5, r7, r6);
        X.0qQ.A0B(r0, 5);
        r39 = new X.N9E(r0, r5, r7, r6, r44, r45, r46, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r2.inCallState != 5) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ed, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A08.A00, 36323324401364049L) != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f6, code lost:
        if (r21 != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (X.C51971G9r.A1b(r1.A0C) != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r8 != X.AnonymousClass05K.A01) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r5 == X.AnonymousClass05K.A0C) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r2.e2eeMandated != true) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016e, code lost:
        if (X.0qQ.A0K(r9.userId, r7) != false) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            r48 = this;
            X.0eS.A00(r49)
            r2 = r48
            java.lang.Object r3 = r2.A00
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r10 = r2.A01
            X.L2O r10 = (X.L2O) r10
            boolean r0 = r2.A04
            r34 = r0
            java.lang.Object r6 = r2.A02
            X.N9B r6 = (X.N9B) r6
            java.lang.Object r8 = r2.A03
            X.N93 r8 = (X.N93) r8
            X.NfI r1 = r2.A05
            boolean r0 = r2.A06
            r21 = r0
            java.lang.Object r4 = r3.A00
            com.instagram.rtc.rsys.models.EngineModel r4 = (com.instagram.rtc.rsys.models.EngineModel) r4
            if (r4 != 0) goto L_0x002a
            X.N9H r22 = X.C69137NfI.A03(r1)
            return r22
        L_0x002a:
            com.instagram.rtc.rsys.models.IgCallModel r2 = r4.callModel
            r11 = 1
            if (r2 == 0) goto L_0x0035
            boolean r0 = r2.e2eeMandated
            r32 = 1
            if (r0 == r11) goto L_0x0037
        L_0x0035:
            r32 = 0
        L_0x0037:
            java.lang.Object r0 = r3.A02
            X.N9J r0 = (X.N9J) r0
            boolean r3 = r0.A00()
            if (r2 == 0) goto L_0x0048
            int r2 = r2.inCallState
            r0 = 5
            r20 = 1
            if (r2 == r0) goto L_0x004a
        L_0x0048:
            r20 = 0
        L_0x004a:
            com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel r0 = r4.dominantSpeakerModel
            if (r0 == 0) goto L_0x00fe
            java.lang.String r7 = r0.dominantSpeakerUserId
        L_0x0050:
            if (r3 == 0) goto L_0x005b
            X.0sa r0 = r1.A0C
            boolean r0 = X.C51971G9r.A1b(r0)
            r5 = 1
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r1.A06
            r25 = r0
            com.instagram.user.model.User r19 = r2.A01(r0)
            X.N9E r0 = X.C69137NfI.A01(r1, r3, r5)
            com.instagram.rtc.rsys.models.IgCallModel r2 = r4.callModel
            r29 = 0
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = r2.instagramVideoCallId
            if (r2 == 0) goto L_0x0080
            int r2 = r2.hashCode()
            int r5 = r2 % 100
            r2 = 50
            if (r5 >= r2) goto L_0x0080
            r29 = 1
        L_0x0080:
            X.N36 r9 = r8.A00
            if (r9 == 0) goto L_0x00fc
            X.Put r5 = r9.A00
        L_0x0086:
            boolean r2 = r5 instanceof X.N54
            if (r2 == 0) goto L_0x0093
            X.N54 r5 = (X.N54) r5
            java.lang.Integer r8 = r5.A04
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r5 = 1
            if (r8 == r2) goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            X.0eM r2 = r1.A0B
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 == 0) goto L_0x00a8
            if (r5 == 0) goto L_0x00a8
            if (r9 == 0) goto L_0x00fa
            java.lang.Integer r5 = r9.A01
        L_0x00a2:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r38 = 1
            if (r5 != r2) goto L_0x00aa
        L_0x00a8:
            r38 = 0
        L_0x00aa:
            com.instagram.rtc.rsys.models.IgCallModel r2 = r4.callModel
            if (r2 == 0) goto L_0x0372
            java.util.HashMap r18 = X.AnonymousClass7TE.A1E()
            java.lang.String r14 = "RtcCallParticipantsInteractor"
            com.facebook.rsys.grid.gen.GridModel r5 = r4.gridModel
            if (r5 == 0) goto L_0x00bc
            java.util.ArrayList r8 = r5.peerIdsOrdered
            if (r8 != 0) goto L_0x00be
        L_0x00bc:
            X.0sn r8 = X.0sn.A00
        L_0x00be:
            boolean r5 = X.AnonymousClass7TE.A1b(r8)
            if (r5 == 0) goto L_0x0101
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r15 = r8.iterator()
        L_0x00cc:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x0106
            java.lang.Object r12 = r15.next()
            java.util.ArrayList r8 = r2.participants
            X.0qQ.A07(r8)
            java.util.Iterator r13 = r8.iterator()
        L_0x00df:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x00f8
            java.lang.Object r9 = r13.next()
            r8 = r9
            com.instagram.rtc.rsys.models.ParticipantModel r8 = (com.instagram.rtc.rsys.models.ParticipantModel) r8
            java.lang.String r8 = r8.userId
            boolean r8 = X.0qQ.A0K(r8, r12)
            if (r8 == 0) goto L_0x00df
        L_0x00f4:
            r5.add(r9)
            goto L_0x00cc
        L_0x00f8:
            r9 = 0
            goto L_0x00f4
        L_0x00fa:
            r5 = 0
            goto L_0x00a2
        L_0x00fc:
            r5 = 0
            goto L_0x0086
        L_0x00fe:
            r7 = 0
            goto L_0x0050
        L_0x0101:
            java.util.ArrayList r5 = r2.participants
            X.0qQ.A07(r5)
        L_0x0106:
            java.util.Set r13 = r6.A02
            boolean r17 = X.C66580MXl.A1b(r13)
            java.util.Iterator r16 = r5.iterator()
        L_0x0110:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x01a8
            com.instagram.rtc.rsys.models.ParticipantModel r9 = X.C66580MXl.A0n(r16)
            java.util.Map r12 = r10.A00
            java.lang.String r5 = r9.userId
            boolean r5 = r12.containsKey(r5)
            if (r5 == 0) goto L_0x0196
            int r8 = r9.state
            r5 = 6
            if (r8 == r5) goto L_0x0130
            r5 = 7
            if (r8 == r5) goto L_0x0130
            r5 = 8
            if (r8 != r5) goto L_0x0110
        L_0x0130:
            r18.size()
            java.lang.String r5 = r9.userId
            java.lang.Object r5 = r12.get(r5)
            if (r5 == 0) goto L_0x01a3
            X.JvY r5 = (X.C61034JvY) r5
            java.lang.String r8 = r9.userId
            boolean r47 = r13.contains(r8)
            java.lang.String r12 = r9.userId
            X.0qQ.A07(r12)
            java.lang.String r8 = r5.A06
            r24 = r8
            java.lang.String r8 = r5.A04
            r23 = r8
            boolean r8 = r9.audioEnabled
            r22 = r8
            boolean r15 = r9.videoEnabled
            java.lang.Object r8 = r5.A03
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            java.lang.Object r5 = r5.A02
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = X.0qQ.A0K(r5, r7)
            if (r5 != 0) goto L_0x0170
            java.lang.String r5 = r9.userId
            boolean r5 = X.0qQ.A0K(r5, r7)
            r46 = 0
            if (r5 == 0) goto L_0x0172
        L_0x0170:
            r46 = 1
        L_0x0172:
            X.N9E r5 = new X.N9E
            r39 = r5
            r40 = r8
            r41 = r12
            r42 = r24
            r43 = r23
            r44 = r22
            r45 = r15
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            java.lang.String r9 = r9.rendererId
            X.0qQ.A07(r9)
            X.JwE r8 = new X.JwE
            r8.<init>((X.N9E) r5, (java.lang.String) r9)
            r5 = r18
            r5.put(r12, r8)
            goto L_0x0110
        L_0x0196:
            java.lang.String r5 = "Participant not found: "
            java.lang.String r8 = r9.userId
            java.lang.String r5 = X.002.A0R(r5, r8)
            X.0KC.A0E(r14, r5)
            goto L_0x0110
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01a8:
            com.instagram.rtc.rsys.models.ParticipantModel r5 = r2.selfParticipant
            java.lang.String r5 = r5.userId
            X.0qQ.A07(r5)
            if (r20 == 0) goto L_0x025b
            java.lang.String r9 = r0.A03
            java.lang.String r8 = r0.A01
            boolean r7 = r0.A04
            boolean r6 = r0.A07
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            r46 = 0
            X.AnonymousClass7TG.A1T(r5, r9, r8)
            r10 = 5
            X.0qQ.A0B(r0, r10)
            X.N9E r23 = new X.N9E
            r39 = r23
            r40 = r0
            r41 = r5
            r42 = r9
            r43 = r8
            r44 = r7
            r45 = r6
            r47 = r46
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
        L_0x01d9:
            com.facebook.rsys.mosaicgrid.gen.MosaicGridModel r0 = r4.mosaicGridModel
            if (r0 == 0) goto L_0x01e1
            java.util.Map r5 = r0.gridParticipants
            if (r5 != 0) goto L_0x01e5
        L_0x01e1:
            X.0sm r5 = X.0Yt.A0E()
        L_0x01e5:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0225
            X.0sm r6 = X.0Yt.A0E()
        L_0x01ef:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r4.callModel
            if (r0 == 0) goto L_0x02b1
            long r4 = r0.numberOfRejoinAttempts
            java.util.Map r0 = r0.userCapabilities
            java.util.ArrayList r8 = X.DbV.A15(r0)
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r0)
        L_0x01ff:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02b4
            java.util.Map$Entry r9 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r7 = r9.getValue()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = "floating_self_view"
            java.lang.Object r0 = r7.get(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r11)
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r9.getKey()
            if (r0 == 0) goto L_0x01ff
            r8.add(r0)
            goto L_0x01ff
        L_0x0225:
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r5)
        L_0x022d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r0 = r7.getValue()
            com.facebook.rsys.mosaicgrid.gen.GridParticipantMediaInfo r0 = (com.facebook.rsys.mosaicgrid.gen.GridParticipantMediaInfo) r0
            com.facebook.rsys.mosaicgrid.gen.FrameSize r5 = r0.videoSize
            java.lang.Object r0 = r7.getKey()
            X.0qQ.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r9 = X.DbV.A0q(r0)
            int r8 = r5.width
            int r7 = r5.height
            r5 = 20
            X.Gms r0 = new X.Gms
            r0.<init>(r8, r7, r5)
            r6.put(r9, r0)
            goto L_0x022d
        L_0x025b:
            if (r3 == 0) goto L_0x0265
            com.instagram.rtc.rsys.models.ParticipantModel r8 = r2.selfParticipant
            boolean r8 = r8.audioEnabled
            r44 = 1
            if (r8 != 0) goto L_0x0269
        L_0x0265:
            r44 = 0
            if (r3 == 0) goto L_0x0271
        L_0x0269:
            com.instagram.rtc.rsys.models.ParticipantModel r8 = r2.selfParticipant
            boolean r8 = r8.videoEnabled
            r45 = 1
            if (r8 != 0) goto L_0x0273
        L_0x0271:
            r45 = 0
        L_0x0273:
            java.lang.Long r8 = r19.BST()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r8 = X.0qQ.A0K(r8, r7)
            if (r8 != 0) goto L_0x028d
            com.instagram.rtc.rsys.models.ParticipantModel r8 = r2.selfParticipant
            java.lang.String r8 = r8.userId
            boolean r7 = X.0qQ.A0K(r8, r7)
            r46 = 0
            if (r7 == 0) goto L_0x028f
        L_0x028d:
            r46 = 1
        L_0x028f:
            boolean r9 = r6.A03
            java.lang.String r7 = r0.A03
            java.lang.String r6 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            X.AnonymousClass7TG.A1T(r5, r7, r6)
            r8 = 5
            X.0qQ.A0B(r0, r8)
            X.N9E r23 = new X.N9E
            r39 = r23
            r40 = r0
            r41 = r5
            r42 = r7
            r43 = r6
            r47 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x01d9
        L_0x02b1:
            r4 = 0
            r8 = 0
        L_0x02b4:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x036f
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r18)
        L_0x02be:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x036f
            java.util.Map$Entry r10 = X.AnonymousClass7TE.A1J(r12)
            if (r8 == 0) goto L_0x02d4
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0355
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0355
        L_0x02d4:
            r7 = 0
        L_0x02d5:
            int r0 = r18.size()
            if (r0 <= 0) goto L_0x02ef
            if (r7 == 0) goto L_0x02ef
            X.O9L r0 = r1.A08
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323324401364049(0x810bdf00012c51, double:3.0343548414856054E-306)
            boolean r1 = X.182.A06(r7, r8, r0)
            r0 = 1
            if (r1 != 0) goto L_0x02f0
        L_0x02ef:
            r0 = 0
        L_0x02f0:
            if (r17 != 0) goto L_0x02f8
            if (r0 != 0) goto L_0x02f8
            r28 = 0
            if (r21 == 0) goto L_0x02fa
        L_0x02f8:
            r28 = 1
        L_0x02fa:
            X.17i r1 = X.17h.A00(r25)
            java.util.ArrayList r7 = r2.participants
            r30 = 0
            com.instagram.rtc.rsys.models.ParticipantModel r0 = r2.selfParticipant
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.List[] r0 = new java.util.List[]{r7, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r2 = X.0Yv.A1F(r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0336
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0336
        L_0x031e:
            r37 = 0
        L_0x0320:
            X.N9H r22 = new X.N9H
            r24 = r18
            r25 = r6
            r26 = r4
            r31 = r11
            r33 = r30
            r35 = r3
            r36 = r11
            r39 = r21
            r22.<init>(r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r22
        L_0x0336:
            java.util.Iterator r2 = r2.iterator()
        L_0x033a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031e
            com.instagram.rtc.rsys.models.ParticipantModel r0 = X.C66580MXl.A0n(r2)
            java.lang.String r0 = r0.userId
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x033a
            boolean r0 = r0.isVerified()
            if (r0 != r11) goto L_0x033a
            r37 = 1
            goto L_0x0320
        L_0x0355:
            java.util.Iterator r9 = r8.iterator()
        L_0x0359:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r7 = r9.next()
            java.lang.Object r0 = r10.getKey()
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0359
            goto L_0x02be
        L_0x036f:
            r7 = 1
            goto L_0x02d5
        L_0x0372:
            X.0sm r24 = X.0Yt.A0E()
            r28 = 0
            r26 = 0
            X.0sm r25 = X.0Yt.A0E()
            X.N9H r22 = new X.N9H
            r23 = r0
            r30 = r28
            r31 = r11
            r33 = r28
            r35 = r3
            r36 = r28
            r37 = r28
            r38 = r28
            r39 = r28
            r22.<init>(r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
