package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.ImO  reason: case insensitive filesystem */
public final class C58102ImO extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.ImO, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.lang.Object r2, X.C58102ImO r3, X.C61770pa r4, int r5) {
        /*
            r1 = 1
            X.IkU r0 = new X.IkU
            r0.<init>(r2, r5)
            r3.A00 = r1
            java.lang.Object r0 = r4.collect(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58102ImO.A01(java.lang.Object, X.ImO, X.0pa, int):java.lang.Object");
    }

    public static void A02(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new C58102ImO(obj, (AnonymousClass4D7) null, i), r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58102ImO(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.ImO, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case Seq.NULL_REFNUM:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            case 46:
                i = 46;
                break;
            case 47:
                i = 47;
                break;
            case 48:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new C58102ImO(obj2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ImO, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0542, code lost:
        if (X.AnonymousClass7TE.A0M(r9) == 1) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0544, code lost:
        r8 = (X.C333317Ym) r0.A02;
        r0 = r8.A01;
        r4 = X.AnonymousClass7PF.PER_CREATOR_BETA_DISCLOSURE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0550, code lost:
        if (r0.contains(r4) != false) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0552, code lost:
        r5 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0554, code lost:
        if (r5 == null) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0556, code lost:
        r1 = r8.A05.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0567, code lost:
        if ((!r1.getBoolean(X.002.A0R("has_seen_per_creator_ai_beta_disclosure/", r5), false)) != r3) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0569, code lost:
        r2 = X.AnonymousClass30K.A03(X.AnonymousClass30J.HOURS, r3 ? 1 : 0);
        r0 = X.DbW.A06(r1, X.AnonymousClass000.A00(1541));
        r7 = X.AnonymousClass30J.MILLISECONDS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x058f, code lost:
        if (X.AnonymousClass30M.A02(X.AnonymousClass30M.A04(X.AnonymousClass30K.A04(r7, java.lang.System.currentTimeMillis()), X.AnonymousClass30K.A04(r7, r0)), r2) < 0) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0591, code lost:
        A02(r8, X.C318116oQ.A00(r8), 22);
        r3 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x059c, code lost:
        r2 = r3.getValue();
        r1 = (X.AnonymousClass7PG) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05a9, code lost:
        if (X.C51975G9x.A1W(r1.A00, r4, r1, r2, r3) == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05be, code lost:
        r4 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05c0, code lost:
        r3 = r4.getValue();
        r2 = (X.AnonymousClass7PG) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05cf, code lost:
        if (X.C51975G9x.A1W(r2.A00, X.AnonymousClass7PF.NONE, r2, r3, r4) == false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r2 != 2) goto L_0x1047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06f9, code lost:
        if (r9 != r1) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06fb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06fc, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06ff, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0e14, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0e2f, code lost:
        r2 = (X.C53034GhQ) r0.A02;
        r4 = r2.A03;
        r6 = java.lang.String.valueOf(r2.A00);
        r0.A00 = 2;
        r5 = X.C41845B3m.A04();
        r3 = X.C41845B3m.A04();
        r5.A04("challenge_id", r6);
        r9 = X.1vm.A01(r4.A00).A04(new com.facebook.pando.PandoGraphQLRequest(X.C41845B3m.A05(), "IgCreatorsChallengesEndChallengeMutation", r5.getParamsCopy(), r3.getParamsCopy(), X.C42559Bee.class, true, (com.facebook.pando.PandoRealtimeInfoJNI) null, 0, (java.lang.String) null, "xdt_creators_challenges_end_challenge", X.AnonymousClass7TE.A1C()), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0e74, code lost:
        if (r9 != r1) goto L_0x0e7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0e76, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0e7a, code lost:
        r9 = (X.C239803Ii) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0e7e, code lost:
        if ((r9 instanceof X.C239793Ih) == false) goto L_0x0fad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0e80, code lost:
        r5 = X.C41846B3n.A0R(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0e84, code lost:
        if (r5 == null) goto L_0x0fe6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0e86, code lost:
        r6 = r5.A05(X.C42558Bed.class, X.AnonymousClass000.A00(4231), -1669860190);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0e95, code lost:
        if (r6 == null) goto L_0x0fe6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0e97, code lost:
        r4 = r6.getRequiredTreeField(1, X.AnonymousClass000.A00(3063), X.C42557Bec.class, 742396800);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0ea7, code lost:
        if (r4 == null) goto L_0x0fe6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0ea9, code lost:
        r3 = r4.A01(X.UQD.class, -980305192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0eb2, code lost:
        if (r3 == null) goto L_0x0fe6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0eb4, code lost:
        r4 = (X.C53034GhQ) r0.A02;
        X.1E4.A00(r4.A02);
        r2 = r3.reinterpret(com.instagram.api.schemas.ImmutablePandoChallenge.class);
        r13 = r2.A0i(-1402832798);
        r14 = r2.A0i(2050282037);
        r3 = com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo.class;
        r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r2.A05(-351576964, r3);
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0edf, code lost:
        if (r5 == null) goto L_0x0faa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0ee1, code lost:
        r6 = r5.F1I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0ee5, code lost:
        r15 = r2.A0i(1658624281);
        r16 = r2.A0i(-460463584);
        r27 = r2.A03(112359031);
        r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r2.A05(-1809911957, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0f03, code lost:
        if (r5 == null) goto L_0x0fa7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0f05, code lost:
        r7 = r5.F1I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0f09, code lost:
        r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r2.A05(-1291468615, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0f12, code lost:
        if (r5 == null) goto L_0x0fa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0f14, code lost:
        r8 = r5.F1I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0f18, code lost:
        r17 = r2.A0i(1747774625);
        r29 = r2.getBooleanValueByHashCode(1256037341);
        r18 = r2.A0i(394289750);
        r3 = (com.instagram.api.schemas.ChallengeButtonInfo) r2.A05(1580530549, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0f36, code lost:
        if (r3 == null) goto L_0x0f3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0f38, code lost:
        r9 = r3.F1I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0f3c, code lost:
        r19 = r2.A0i(-522690089);
        r20 = r2.A0h(1418939442);
        r21 = r2.A0i(1042451834);
        r22 = r2.A0h(-877823861);
        r5 = new com.instagram.api.schemas.Challenge(r6, r7, r8, r9, (com.instagram.api.schemas.ChallengeName) r2.A0M(3373707, X.J02.A00), (com.instagram.api.schemas.ChallengeState) r2.A0M(109757585, X.J03.A00), r2.getOptionalIntValueByHashCode(10974452), r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r2.A0i(-1838429974), r2.A0S(), r2.getIntValueByHashCode(-1001078227), r2.getIntValueByHashCode(110549828), r27, r29);
        r4 = r4.A05;
        r3 = new X.C54355H9b(r5);
        r0.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0fa1, code lost:
        if (r4.emit(r3, r0) != r1) goto L_0x0fe6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0fa3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0fa4, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0fa7, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0faa, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0faf, code lost:
        if ((r9 instanceof X.C297815sO) == false) goto L_0x0ff2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0fb1, code lost:
        r3 = ((X.C297815sO) r9).A00.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0fbd, code lost:
        if (r3.length() != 0) goto L_0x0fc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0fbf, code lost:
        r3 = "end challenge api error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0fc1, code lost:
        r2 = (X.C53034GhQ) r0.A02;
        X.C53034GhQ.A01(r2, r3);
        r4 = r2.A05;
        r3 = X.H9W.A00;
        r0.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0fd3, code lost:
        if (r4.emit(r3, r0) != r1) goto L_0x0fd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0fd5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0fd9, code lost:
        r5 = ((X.C53034GhQ) r0.A02).A05;
        r4 = X.C54354H9a.A00;
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0fe6, code lost:
        r5 = ((X.C53034GhQ) r0.A02).A05;
        r4 = X.H9W.A00;
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0fef, code lost:
        r0.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0ff6, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x100f, code lost:
        r0.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x1011, code lost:
        r0 = r5.emit(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x1015, code lost:
        if (r0 != r1) goto L_0x1047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x1017, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0238, code lost:
        if (r6.collect(new X.C58037IkV(r5, r3), r0) == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023a, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x09bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0c4d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r9 = r31
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0017;
                case 1: goto L_0x00c7;
                case 2: goto L_0x0120;
                case 3: goto L_0x013a;
                case 4: goto L_0x0169;
                case 5: goto L_0x0183;
                case 6: goto L_0x019d;
                case 7: goto L_0x01cd;
                case 8: goto L_0x0009;
                case 9: goto L_0x023e;
                case 10: goto L_0x0009;
                case 11: goto L_0x0266;
                case 12: goto L_0x0280;
                case 13: goto L_0x02ae;
                case 14: goto L_0x02c8;
                case 15: goto L_0x02e2;
                case 16: goto L_0x02fc;
                case 17: goto L_0x0e0c;
                case 18: goto L_0x0316;
                case 19: goto L_0x004d;
                case 20: goto L_0x035c;
                case 21: goto L_0x03da;
                case 22: goto L_0x044b;
                case 23: goto L_0x0532;
                case 24: goto L_0x04b3;
                case 25: goto L_0x05dd;
                case 26: goto L_0x060b;
                case 27: goto L_0x062b;
                case 28: goto L_0x0675;
                case 29: goto L_0x069d;
                case 30: goto L_0x06b8;
                case 31: goto L_0x06d3;
                case 32: goto L_0x0700;
                case 33: goto L_0x0757;
                case 34: goto L_0x080a;
                case 35: goto L_0x089c;
                case 36: goto L_0x0912;
                case 37: goto L_0x0954;
                case 38: goto L_0x0a08;
                case 39: goto L_0x0a26;
                case 40: goto L_0x0a51;
                case 41: goto L_0x0a77;
                case 42: goto L_0x0aa6;
                case 43: goto L_0x0ad5;
                case 44: goto L_0x0bd7;
                case 45: goto L_0x0c53;
                case 46: goto L_0x0d1c;
                case 47: goto L_0x1018;
                case 48: goto L_0x0de2;
                case 49: goto L_0x0dfe;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x1005
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0025
            if (r2 == r6) goto L_0x0045
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0025:
            java.lang.Object r5 = A00(r9, r0)
            X.H1f r5 = (X.C54161H1f) r5
            X.0eM r2 = r5.A09
            java.lang.Object r2 = r2.getValue()
            X.GhZ r2 = (X.C53041GhZ) r2
            X.0pa r4 = r2.A06
            r3 = 19
            X.IkV r2 = new X.IkV
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0048
            return r1
        L_0x0045:
            X.0eS.A00(r9)
        L_0x0048:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x004d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0066
            if (r2 != r6) goto L_0x00c2
            X.0eS.A00(r9)
        L_0x0059:
            int r2 = X.AnonymousClass7TE.A0M(r9)
            if (r2 == 0) goto L_0x009c
            if (r2 == r6) goto L_0x0077
            r1 = 2
            if (r2 == r1) goto L_0x009c
            goto L_0x1047
        L_0x0066:
            java.lang.Object r2 = A00(r9, r0)
            X.Dku r2 = (X.C46767Dku) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A00
            r0.A00 = r6
            java.lang.Object r9 = r2.A00(r0)
            if (r9 != r1) goto L_0x0059
            return r1
        L_0x0077:
            java.lang.Object r0 = r0.A02
            X.Dku r0 = (X.C46767Dku) r0
            X.05G r4 = r0.A02
        L_0x007d:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JV5 r0 = (X.JV5) r0
            java.lang.Object r2 = r0.A03
            X.HLa r2 = (X.C54617HLa) r2
            java.lang.Object r1 = r0.A00
            X.Drf r1 = (X.C47164Drf) r1
            X.0qQ.A0B(r2, r6)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.C47164Drf) r1, (X.C54617HLa) r2, (boolean) r6)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x007d
            goto L_0x1047
        L_0x009c:
            java.lang.Object r0 = r0.A02
            X.Dku r0 = (X.C46767Dku) r0
            X.05G r5 = r0.A02
        L_0x00a2:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JV5 r0 = (X.JV5) r0
            java.lang.Object r3 = r0.A03
            X.HLa r3 = (X.C54617HLa) r3
            java.lang.Object r2 = r0.A00
            X.Drf r2 = (X.C47164Drf) r2
            r1 = 0
            X.0qQ.A0B(r3, r6)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.C47164Drf) r2, (X.C54617HLa) r3, (boolean) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x00a2
            goto L_0x1047
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c7:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x00d5
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d5:
            java.lang.Object r2 = A00(r9, r0)
            X.GgY r2 = (X.C52981GgY) r2
            X.HrB r5 = r2.A00
            r0.A00 = r3
            X.HrU r2 = r5.A01
            com.instagram.common.session.UserSession r2 = r2.A00
            r6 = 0
            X.1NY r9 = X.DbU.A0M(r2)
            java.lang.String r8 = "api/"
            java.lang.String r7 = "v1/"
            java.lang.String r4 = "creators/"
            java.lang.String r3 = "achievements/"
            java.lang.String r2 = "about_achievements/"
            r9.A05()
            r9.A02()
            java.lang.String r2 = X.002.A11(r8, r7, r4, r3, r2)
            X.0qQ.A07(r2)
            r9.A0E = r2
            java.lang.Class<X.CEe> r3 = X.C43812CEe.class
            java.lang.Class<X.Cyd> r2 = X.C45565Cyd.class
            X.1OC r4 = X.DbU.A0S(r9, r3, r2)
            r3 = 1525447983(0x5aec7d2f, float:3.32828677E16)
            r2 = 3
            X.032 r4 = r4.A04(r3, r2)
            r3 = 2
            X.MFz r2 = new X.MFz
            r2.<init>(r3, r6)
            X.7qX r6 = new X.7qX
            r6.<init>(r2, r4)
            r3 = 20
            goto L_0x022f
        L_0x0120:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x012e
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x012e:
            java.lang.Object r2 = A00(r9, r0)
            X.GgY r2 = (X.C52981GgY) r2
            X.0V2 r5 = r2.A01
            X.H9H r4 = X.H9H.A00
            goto L_0x100f
        L_0x013a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0148
            if (r2 == r6) goto L_0x0161
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0148:
            java.lang.Object r5 = A00(r9, r0)
            X.GgY r5 = (X.C52981GgY) r5
            X.HrB r2 = r5.A00
            X.0pa r4 = r2.A06
            r3 = 0
            X.DIJ r2 = new X.DIJ
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x0164
            return r1
        L_0x0161:
            X.0eS.A00(r9)
        L_0x0164:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0169:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0177
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0177:
            java.lang.Object r2 = A00(r9, r0)
            X.GhM r2 = (X.C53031GhM) r2
            X.0V2 r5 = r2.A04
            X.KPs r4 = X.C61879KPs.A00
            goto L_0x100f
        L_0x0183:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0191
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0191:
            java.lang.Object r2 = A00(r9, r0)
            X.GhM r2 = (X.C53031GhM) r2
            X.0V2 r5 = r2.A05
            X.H9K r4 = X.H9K.A00
            goto L_0x100f
        L_0x019d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x01ab
            if (r2 == r6) goto L_0x01c5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ab:
            java.lang.Object r5 = A00(r9, r0)
            X.GhM r5 = (X.C53031GhM) r5
            X.HrB r2 = r5.A01
            X.0pa r4 = r2.A08
            r3 = 24
            X.IkV r2 = new X.IkV
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x01c8
            return r1
        L_0x01c5:
            X.0eS.A00(r9)
        L_0x01c8:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x01cd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x01db
            if (r2 == r4) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01db:
            java.lang.Object r2 = A00(r9, r0)
            X.GhU r2 = (X.C53038GhU) r2
            X.HrB r5 = r2.A02
            java.lang.String r3 = r2.A03
            r0.A00 = r4
            X.HrU r2 = r5.A01
            com.instagram.common.session.UserSession r2 = r2.A00
            r6 = 0
            X.1NY r4 = X.DbU.A0M(r2)
            java.lang.String r7 = "api/"
            java.lang.String r8 = "v1/"
            java.lang.String r9 = "creators/"
            java.lang.String r10 = "achievements/"
            java.lang.String r11 = "achievements_hub/"
            java.lang.String r12 = "get_achievements/"
            if (r3 == 0) goto L_0x0203
            java.lang.String r2 = "entry_point"
            r4.A9m(r2, r3)
        L_0x0203:
            r4.A05()
            r4.A02()
            java.lang.String r2 = X.002.A13(r7, r8, r9, r10, r11, r12)
            X.0qQ.A07(r2)
            r4.A0E = r2
            java.lang.Class<X.Gyb> r3 = X.C54052Gyb.class
            java.lang.Class<X.Huc> r2 = X.C56209Huc.class
            X.1OC r4 = X.DbU.A0S(r4, r3, r2)
            r3 = 1525447983(0x5aec7d2f, float:3.32828677E16)
            r2 = 3
            X.032 r4 = r4.A04(r3, r2)
            r3 = 5
            X.MFz r2 = new X.MFz
            r2.<init>(r3, r6)
            X.7qX r6 = new X.7qX
            r6.<init>(r2, r4)
            r3 = 23
        L_0x022f:
            X.IkV r2 = new X.IkV
            r2.<init>(r5, r3)
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 == r1) goto L_0x1049
            X.0gF r0 = X.C60340gF.A00
            goto L_0x1015
        L_0x023e:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x024c
            if (r3 == r2) goto L_0x025e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024c:
            java.lang.Object r4 = A00(r9, r0)
            X.GhU r4 = (X.C53038GhU) r4
            X.HrB r2 = r4.A02
            X.0pa r3 = r2.A07
            r2 = 0
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0261
            return r1
        L_0x025e:
            X.0eS.A00(r9)
        L_0x0261:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0266:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0274
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0274:
            java.lang.Object r2 = A00(r9, r0)
            X.GhZ r2 = (X.C53041GhZ) r2
            X.0V2 r5 = r2.A05
            X.H9U r4 = X.H9U.A00
            goto L_0x100f
        L_0x0280:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x028e
            if (r2 == r5) goto L_0x02a6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x028e:
            java.lang.Object r4 = A00(r9, r0)
            X.GhZ r4 = (X.C53041GhZ) r4
            X.HrB r2 = r4.A03
            X.0pa r3 = r2.A09
            X.IkU r2 = new X.IkU
            r2.<init>(r4, r5)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x02a9
            return r1
        L_0x02a6:
            X.0eS.A00(r9)
        L_0x02a9:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x02ae:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x02bc
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02bc:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9Z r4 = X.H9Z.A00
            goto L_0x100f
        L_0x02c8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x02d6
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02d6:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9X r4 = X.H9X.A00
            goto L_0x100f
        L_0x02e2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x02f0
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02f0:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9Y r4 = X.H9Y.A00
            goto L_0x100f
        L_0x02fc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x030a
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x030a:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9W r4 = X.H9W.A00
            goto L_0x100f
        L_0x0316:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0327
            if (r2 == r5) goto L_0x0343
            if (r2 == r6) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0327:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r4 = r2.A05
            r2 = 3355(0xd1b, float:4.701E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            X.H9V r2 = new X.H9V
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r2 = r4.emit(r2, r0)
            if (r2 != r1) goto L_0x0346
            return r1
        L_0x0343:
            X.0eS.A00(r9)
        L_0x0346:
            java.lang.Object r4 = r0.A02
            X.GhQ r4 = (X.C53034GhQ) r4
            com.instagram.api.schemas.ChallengeState r3 = r4.A01
            com.instagram.api.schemas.ChallengeState r2 = com.instagram.api.schemas.ChallengeState.STARTED
            if (r3 != r2) goto L_0x1047
            X.0V2 r5 = r4.A05
            r2 = 0
            X.H9b r4 = new X.H9b
            r4.<init>(r2)
            r0.A00 = r6
            goto L_0x1011
        L_0x035c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0396
            if (r2 != r6) goto L_0x03d5
            X.0eS.A00(r9)
        L_0x0368:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x03a7
            java.lang.Object r0 = r0.A02
            X.Dku r0 = (X.C46767Dku) r0
            X.05G r5 = r0.A02
        L_0x0374:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.JV5 r1 = (X.JV5) r1
            X.HLa r3 = X.C54617HLa.SUCCESS
            r0 = r9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r2 = r0.A00
            X.Drf r2 = (X.C47164Drf) r2
            boolean r1 = r1.A01
            X.0qQ.A0B(r3, r6)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.C47164Drf) r2, (X.C54617HLa) r3, (boolean) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0374
            goto L_0x1047
        L_0x0396:
            java.lang.Object r2 = A00(r9, r0)
            X.Dku r2 = (X.C46767Dku) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A00
            r0.A00 = r6
            java.lang.Object r9 = r2.A04(r0)
            if (r9 != r1) goto L_0x0368
            return r1
        L_0x03a7:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x03d0
            java.lang.Object r0 = r0.A02
            X.Dku r0 = (X.C46767Dku) r0
            X.05G r5 = r0.A02
        L_0x03b1:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JV5 r0 = (X.JV5) r0
            X.HLa r3 = X.C54617HLa.ERROR
            boolean r2 = r0.A01
            java.lang.Object r1 = r0.A00
            X.Drf r1 = (X.C47164Drf) r1
            X.0qQ.A0B(r3, r6)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.C47164Drf) r1, (X.C54617HLa) r3, (boolean) r2)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x03b1
            goto L_0x1047
        L_0x03d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03da:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x040c
            if (r2 != r3) goto L_0x0446
            X.0eS.A00(r9)
        L_0x03e6:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x041d
            java.lang.Object r0 = r0.A02
            X.GgZ r0 = (X.C52982GgZ) r0
            X.05G r4 = r0.A01
        L_0x03f2:
            java.lang.Object r3 = r4.getValue()
            X.HLa r2 = X.C54617HLa.SUCCESS
            r0 = r9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r1 = r0.A00
            X.QP8 r1 = (X.QP8) r1
            X.JVf r0 = new X.JVf
            r0.<init>((X.QP8) r1, (X.C54617HLa) r2)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x03f2
            goto L_0x1047
        L_0x040c:
            java.lang.Object r2 = A00(r9, r0)
            X.GgZ r2 = (X.C52982GgZ) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A00
            r0.A00 = r3
            java.lang.Object r9 = r2.A03(r0)
            if (r9 != r1) goto L_0x03e6
            return r1
        L_0x041d:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0441
            java.lang.Object r0 = r0.A02
            X.GgZ r0 = (X.C52982GgZ) r0
            X.05G r4 = r0.A01
        L_0x0427:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVf r0 = (X.C59721JVf) r0
            X.HLa r2 = X.C54617HLa.ERROR
            java.lang.Object r1 = r0.A01
            X.QP8 r1 = (X.QP8) r1
            X.JVf r0 = new X.JVf
            r0.<init>((X.QP8) r1, (X.C54617HLa) r2)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0427
            goto L_0x1047
        L_0x0441:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0446:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x044b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x047b
            if (r2 != r3) goto L_0x04ae
            X.0eS.A00(r9)
        L_0x0457:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x048c
            java.lang.Object r0 = r0.A02
            X.7Ym r0 = (X.C333317Ym) r0
            X.05G r4 = r0.A06
        L_0x0463:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.7PG r2 = (X.AnonymousClass7PG) r2
            r0 = r9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r1 = r0.A00
            X.N49 r1 = (X.N49) r1
            X.7PF r0 = r2.A01
            boolean r0 = X.C51975G9x.A1W(r1, r0, r2, r3, r4)
            if (r0 == 0) goto L_0x0463
            goto L_0x1047
        L_0x047b:
            java.lang.Object r2 = A00(r9, r0)
            X.7Ym r2 = (X.C333317Ym) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A03
            r0.A00 = r3
            java.lang.Object r9 = r2.A02(r0)
            if (r9 != r1) goto L_0x0457
            return r1
        L_0x048c:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x04a9
            java.lang.Object r0 = r0.A02
            X.7Ym r0 = (X.C333317Ym) r0
            X.05G r4 = r0.A06
        L_0x0496:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.7PG r2 = (X.AnonymousClass7PG) r2
            X.7PF r1 = X.AnonymousClass7PF.NONE
            X.N49 r0 = r2.A00
            boolean r0 = X.C51975G9x.A1W(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x0496
            goto L_0x1047
        L_0x04a9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04b3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0521
            if (r2 != r3) goto L_0x05d8
            X.0eS.A00(r9)
        L_0x04bf:
            int r2 = X.AnonymousClass7TE.A0M(r9)
            if (r2 == r3) goto L_0x0544
            r1 = 2
            if (r2 != r1) goto L_0x1047
            java.lang.Object r7 = r0.A02
            X.7Ym r7 = (X.C333317Ym) r7
            java.lang.String r6 = r7.A00
            java.util.Set r0 = r7.A01
            X.7PF r5 = X.AnonymousClass7PF.TERMS_NUX
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x1047
            if (r6 == 0) goto L_0x1047
            X.7Yq r0 = r7.A05
            X.0xa r3 = r0.A01
            r0 = 3494(0xda6, float:4.896E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r6)
            r1 = 0
            long r8 = r3.getLong(r0, r1)
            r3 = -1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x1047
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0506
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r3 = r0.now()
            long r3 = r3 - r8
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x1047
        L_0x0506:
            X.05G r4 = r7.A06
        L_0x0508:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.7PG r0 = (X.AnonymousClass7PG) r0
            X.N49 r2 = r0.A00
            java.lang.Boolean r1 = r0.A02
            boolean r0 = r0.A04
            X.7PG r0 = X.AnonymousClass7PG.A00(r2, r5, r1, r6, r0)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0508
            goto L_0x1047
        L_0x0521:
            java.lang.Object r2 = A00(r9, r0)
            X.7Ym r2 = (X.C333317Ym) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A03
            r0.A00 = r3
            java.lang.Object r9 = r2.A00(r0)
            if (r9 != r1) goto L_0x04bf
            return r1
        L_0x0532:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x05ad
            if (r2 != r3) goto L_0x05d3
            X.0eS.A00(r9)
        L_0x053e:
            int r1 = X.AnonymousClass7TE.A0M(r9)
            if (r1 != r3) goto L_0x1047
        L_0x0544:
            java.lang.Object r8 = r0.A02
            X.7Ym r8 = (X.C333317Ym) r8
            java.util.Set r0 = r8.A01
            X.7PF r4 = X.AnonymousClass7PF.PER_CREATOR_BETA_DISCLOSURE
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x05be
            java.lang.String r5 = r8.A00
            if (r5 == 0) goto L_0x05be
            X.7Yq r0 = r8.A05
            r2 = 0
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_per_creator_ai_beta_disclosure/"
            java.lang.String r0 = X.002.A0R(r0, r5)
            boolean r0 = r1.getBoolean(r0, r2)
            r0 = r0 ^ 1
            if (r0 != r3) goto L_0x05be
            X.30J r0 = X.AnonymousClass30J.HOURS
            long r2 = X.AnonymousClass30K.A03(r0, r3)
            r0 = 1541(0x605, float:2.16E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r0 = X.DbW.A06(r1, r0)
            X.30J r7 = X.AnonymousClass30J.MILLISECONDS
            long r5 = X.AnonymousClass30K.A04(r7, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass30K.A04(r7, r0)
            long r0 = X.AnonymousClass30M.A04(r0, r5)
            int r0 = X.AnonymousClass30M.A02(r0, r2)
            if (r0 < 0) goto L_0x05be
            X.6oS r1 = X.C318116oQ.A00(r8)
            r0 = 22
            A02(r8, r1, r0)
            X.05G r3 = r8.A06
        L_0x059c:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.7PG r1 = (X.AnonymousClass7PG) r1
            X.N49 r0 = r1.A00
            boolean r0 = X.C51975G9x.A1W(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x059c
            goto L_0x1047
        L_0x05ad:
            java.lang.Object r2 = A00(r9, r0)
            X.7Ym r2 = (X.C333317Ym) r2
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r2 = r2.A03
            r0.A00 = r3
            java.lang.Object r9 = r2.A00(r0)
            if (r9 != r1) goto L_0x053e
            return r1
        L_0x05be:
            X.05G r4 = r8.A06
        L_0x05c0:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.7PG r2 = (X.AnonymousClass7PG) r2
            X.7PF r1 = X.AnonymousClass7PF.NONE
            X.N49 r0 = r2.A00
            boolean r0 = X.C51975G9x.A1W(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x05c0
            goto L_0x1047
        L_0x05d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05dd:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x05eb
            if (r3 == r2) goto L_0x0603
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05eb:
            java.lang.Object r4 = A00(r9, r0)
            X.H0M r4 = (X.H0M) r4
            X.0eM r2 = r4.A01
            java.lang.Object r2 = r2.getValue()
            X.H2a r2 = (X.C54180H2a) r2
            X.0Ud r3 = r2.A05
            r2 = 2
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0606
            return r1
        L_0x0603:
            X.0eS.A00(r9)
        L_0x0606:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x060b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0619
            if (r2 == r4) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0619:
            java.lang.Object r2 = A00(r9, r0)
            X.H2a r2 = (X.C54180H2a) r2
            com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository r3 = r2.A01
            r0.A00 = r4
            java.lang.String r2 = "IMPORT_PROGRESS_BAR_COMPLETE"
            java.lang.Object r0 = r3.A00(r2, r0)
            goto L_0x1015
        L_0x062b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0648
            if (r2 != r4) goto L_0x0670
            X.0eS.A00(r9)
        L_0x0637:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.A02
            X.H2a r0 = (X.C54180H2a) r0
            if (r9 == 0) goto L_0x065b
            X.05G r2 = r0.A03
            X.Gq2 r0 = new X.Gq2
            r0.<init>(r9)
            goto L_0x0cf0
        L_0x0648:
            java.lang.Object r2 = A00(r9, r0)
            X.H2a r2 = (X.C54180H2a) r2
            com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository r3 = r2.A01
            r0.A00 = r4
            java.lang.String r2 = "CREATION_DIRECT_TO_SANDBOX"
            java.lang.Object r9 = r3.A00(r2, r0)
            if (r9 != r1) goto L_0x0637
            return r1
        L_0x065b:
            X.05G r4 = r0.A04
        L_0x065d:
            java.lang.Object r3 = r4.getValue()
            r2 = 0
            r1 = 7
            X.JTb r0 = new X.JTb
            r0.<init>(r2, r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x065d
            goto L_0x1047
        L_0x0670:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0675:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0683
            if (r3 == r2) goto L_0x0695
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0683:
            java.lang.Object r4 = A00(r9, r0)
            X.H2Y r4 = (X.H2Y) r4
            com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository r2 = r4.A00
            X.0Ud r3 = r2.A06
            r2 = 5
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0698
            return r1
        L_0x0695:
            X.0eS.A00(r9)
        L_0x0698:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x069d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x06ab
            if (r2 == r3) goto L_0x06fc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06ab:
            java.lang.Object r2 = A00(r9, r0)
            com.instagram.creator.agent.settings.audience.AudienceUseCase r2 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r2
            r0.A00 = r3
            java.lang.Object r9 = com.instagram.creator.agent.settings.audience.AudienceUseCase.A00(r2, r0)
            goto L_0x06f9
        L_0x06b8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x06c6
            if (r2 == r3) goto L_0x06fc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c6:
            java.lang.Object r2 = A00(r9, r0)
            com.instagram.creator.agent.settings.audience.AudienceUseCase r2 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r2
            r0.A00 = r3
            java.lang.Object r9 = com.instagram.creator.agent.settings.audience.AudienceUseCase.A01(r2, r0)
            goto L_0x06f9
        L_0x06d3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x06e1
            if (r2 == r5) goto L_0x06fc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06e1:
            java.lang.Object r2 = A00(r9, r0)
            com.instagram.creator.agent.settings.audience.AudienceUseCase r2 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r2
            com.instagram.creator.agent.settings.audience.AudienceRepository r4 = r2.A01
            java.lang.String r3 = r2.A03
            X.05G r2 = r2.A09
            java.lang.Object r2 = r2.getValue()
            X.HNK r2 = (X.HNK) r2
            r0.A00 = r5
            java.lang.Object r9 = r4.A01(r2, r3, r0)
        L_0x06f9:
            if (r9 != r1) goto L_0x06ff
            return r1
        L_0x06fc:
            X.0eS.A00(r9)
        L_0x06ff:
            return r9
        L_0x0700:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0730
            if (r2 != r3) goto L_0x0752
            X.0eS.A00(r9)
        L_0x070c:
            X.0eP r9 = (X.0eP) r9
            if (r9 == 0) goto L_0x0741
            java.lang.Object r4 = r9.A00
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r3 = r9.A01
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r2 = r0.A02
            X.H2P r2 = (X.H2P) r2
            X.05G r1 = r2.A0A
            r0 = 5
            java.util.List r0 = X.00k.A0d(r4, r0)
            java.util.ArrayList r0 = X.00k.A0S(r3, r0)
            r1.Epw(r0)
            X.05G r2 = r2.A0B
            X.HLa r0 = X.C54617HLa.SUCCESS
            goto L_0x0cf0
        L_0x0730:
            java.lang.Object r2 = A00(r9, r0)
            X.H2P r2 = (X.H2P) r2
            com.instagram.creator.agent.settings.audience.AudienceRepository r2 = r2.A02
            r0.A00 = r3
            java.lang.Object r9 = r2.A04(r0)
            if (r9 != r1) goto L_0x070c
            return r1
        L_0x0741:
            java.lang.Object r2 = r0.A02
            X.H2P r2 = (X.H2P) r2
            X.05G r1 = r2.A0B
            X.HLa r0 = X.C54617HLa.ERROR
            r1.Epw(r0)
            X.05G r2 = r2.A05
            X.I1D r0 = X.I1D.A00
            goto L_0x0cf0
        L_0x0752:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0757:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x078a
            if (r2 != r4) goto L_0x0805
            X.0eS.A00(r9)
        L_0x0763:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x07b1
            java.lang.Object r0 = r0.A02
            X.GhJ r0 = (X.C53028GhJ) r0
            X.05G r2 = r0.A09
        L_0x076f:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.GnW r5 = (X.C53399GnW) r5
            X.HLa r7 = X.C54617HLa.ERROR
            r3 = 0
            r9 = 62
            r4 = r3
            r6 = r3
            r8 = r3
            X.GnW r0 = X.C53399GnW.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x076f
            goto L_0x1047
        L_0x078a:
            java.lang.Object r7 = A00(r9, r0)
            X.GhJ r7 = (X.C53028GhJ) r7
            com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository r6 = r7.A08
            X.0Ud r2 = r7.A0A
            java.lang.Object r2 = r2.getValue()
            X.GnW r2 = (X.C53399GnW) r2
            java.lang.Object r2 = r2.A04
            X.Jvk r2 = (X.C61046Jvk) r2
            java.lang.String r5 = r2.A00
            java.lang.String r2 = r7.A01
            java.lang.String r3 = X.DbV.A12(r2)
            java.util.List r2 = r7.A03
            r0.A00 = r4
            java.lang.Object r9 = r6.A01(r5, r3, r2, r0)
            if (r9 != r1) goto L_0x0763
            return r1
        L_0x07b1:
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x1047
            java.lang.Object r2 = r0.A02
            X.GhJ r2 = (X.C53028GhJ) r2
            X.0Ud r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            X.GnW r0 = (X.C53399GnW) r0
            java.lang.Object r0 = r0.A04
            X.Jvk r0 = (X.C61046Jvk) r0
            java.lang.String r1 = r0.A00
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r6 = r9.A00
            X.JV7 r6 = (X.JV7) r6
            java.lang.String r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x1047
            X.05G r5 = r2.A09
        L_0x07d7:
            java.lang.Object r3 = r5.getValue()
            r9 = r3
            X.GnW r9 = (X.C53399GnW) r9
            X.HLa r11 = X.C54617HLa.SUCCESS
            r7 = 0
            java.lang.Object r0 = r9.A02
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r2 = r6.A00
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r0.A01
            X.0qQ.A0B(r2, r4)
            r0 = 19
            X.JwK r8 = new X.JwK
            r8.<init>((boolean) r1, (java.util.List) r2, (int) r0)
            r13 = 46
            r10 = r7
            r12 = r7
            X.GnW r0 = X.C53399GnW.A00(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r5.AIY(r3, r0)
            if (r0 == 0) goto L_0x07d7
            goto L_0x1047
        L_0x0805:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x080a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x083b
            if (r2 != r8) goto L_0x0897
            X.0eS.A00(r9)
        L_0x0816:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0865
            java.lang.Object r0 = r0.A02
            X.GhJ r0 = (X.C53028GhJ) r0
            X.05G r2 = r0.A09
        L_0x0820:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.GnW r5 = (X.C53399GnW) r5
            r3 = 0
            X.HLa r8 = X.C54617HLa.ERROR
            r9 = 61
            r4 = r3
            r6 = r3
            r7 = r3
            X.GnW r0 = X.C53399GnW.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0820
            goto L_0x1047
        L_0x083b:
            java.lang.Object r7 = A00(r9, r0)
            X.GhJ r7 = (X.C53028GhJ) r7
            com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository r6 = r7.A08
            X.0Ud r2 = r7.A0A
            java.lang.Object r2 = r2.getValue()
            X.GnW r2 = (X.C53399GnW) r2
            java.lang.Object r2 = r2.A04
            X.Jvk r2 = (X.C61046Jvk) r2
            java.lang.String r5 = r2.A00
            java.lang.String r4 = r7.A01
            java.lang.String r3 = r7.A02
            X.Jvb r2 = r7.A00
            r0.A00 = r8
            r7 = r2
            r8 = r5
            r9 = r4
            r10 = r3
            r11 = r0
            java.lang.Object r9 = r6.A00(r7, r8, r9, r10, r11)
            if (r9 != r1) goto L_0x0816
            return r1
        L_0x0865:
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x1047
            java.lang.Object r0 = r0.A02
            X.GhJ r0 = (X.C53028GhJ) r0
            X.05G r4 = r0.A09
        L_0x086f:
            java.lang.Object r3 = r4.getValue()
            r7 = r3
            X.GnW r7 = (X.C53399GnW) r7
            r6 = 0
            X.HLa r10 = X.C54617HLa.SUCCESS
            r2 = 0
            java.lang.Object r0 = r7.A01
            X.Jvg r0 = (X.C61042Jvg) r0
            boolean r1 = r0.A01
            r0 = 11
            X.Jvg r5 = new X.Jvg
            r5.<init>((boolean) r1, (boolean) r2, (int) r0)
            r11 = 29
            r8 = r6
            r9 = r6
            X.GnW r0 = X.C53399GnW.A00(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x086f
            goto L_0x1047
        L_0x0897:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x089c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x08d3
            if (r2 != r3) goto L_0x090d
            X.0eS.A00(r9)
        L_0x08a8:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x08e4
            java.lang.Object r0 = r0.A02
            X.Gga r0 = (X.C52983Gga) r0
            X.05G r5 = r0.A01
        L_0x08b4:
            java.lang.Object r4 = r5.getValue()
            X.HLa r3 = X.C54617HLa.SUCCESS
            r0 = r9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            X.AnonymousClass7TG.A1N(r2, r3)
            r1 = 46
            X.JVf r0 = new X.JVf
            r0.<init>((X.C54617HLa) r3, (java.util.List) r2, (int) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x08b4
            goto L_0x1047
        L_0x08d3:
            java.lang.Object r2 = A00(r9, r0)
            X.Gga r2 = (X.C52983Gga) r2
            com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository r2 = r2.A00
            r0.A00 = r3
            java.lang.Object r9 = r2.A02(r0)
            if (r9 != r1) goto L_0x08a8
            return r1
        L_0x08e4:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x1047
            java.lang.Object r0 = r0.A02
            X.Gga r0 = (X.C52983Gga) r0
            X.05G r5 = r0.A01
        L_0x08ee:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JVf r0 = (X.C59721JVf) r0
            X.HLa r3 = X.C54617HLa.ERROR
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            X.AnonymousClass7TG.A1N(r2, r3)
            r1 = 46
            X.JVf r0 = new X.JVf
            r0.<init>((X.C54617HLa) r3, (java.util.List) r2, (int) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x08ee
            goto L_0x1047
        L_0x090d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0912:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x093e
            if (r2 != r5) goto L_0x094f
            X.0eS.A00(r9)
        L_0x091e:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r0.A02
            X.H2f r0 = (X.C54185H2f) r0
            X.05G r4 = r0.A02
        L_0x0926:
            java.lang.Object r3 = r4.getValue()
            X.HLa r2 = X.C54617HLa.SUCCESS
            X.Dba.A0j(r5, r9, r2)
            r1 = 47
            X.JVf r0 = new X.JVf
            r0.<init>((X.C54617HLa) r2, (java.util.List) r9, (int) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0926
            goto L_0x1047
        L_0x093e:
            java.lang.Object r2 = A00(r9, r0)
            X.H2f r2 = (X.C54185H2f) r2
            com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository r2 = r2.A00
            r0.A00 = r5
            java.lang.Object r9 = r2.A01(r0)
            if (r9 != r1) goto L_0x091e
            return r1
        L_0x094f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0954:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0962
            if (r3 == r2) goto L_0x0a00
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0962:
            java.lang.Object r5 = A00(r9, r0)
            X.H0U r5 = (X.H0U) r5
            X.0eM r2 = r5.A01
            java.lang.Object r4 = r2.getValue()
            X.GPq r4 = (X.C52369GPq) r4
            X.0eM r2 = r5.A05
            java.lang.String r3 = X.DbS.A0t(r2)
            X.0eM r2 = r5.A04
            java.lang.Object r2 = r2.getValue()
            boolean r7 = X.AnonymousClass7TF.A1V(r2)
            r2 = 0
            X.0qQ.A0B(r3, r2)
            int r6 = r3.hashCode()
            r2 = -1249886828(0xffffffffb5803d94, float:-9.554665E-7)
            if (r7 == 0) goto L_0x09d3
            if (r6 == r2) goto L_0x09c8
            r2 = 791971135(0x2f34853f, float:1.6418243E-10)
            if (r6 == r2) goto L_0x09bd
            r2 = 2104228359(0x7d6bfa07, float:1.9604175E37)
            if (r6 != r2) goto L_0x09a8
            java.lang.String r2 = "AFFILIATE_LINKS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0o
        L_0x09a3:
            java.lang.String r2 = r4.A00
            X.C52369GPq.A02(r3, r4, r2)
        L_0x09a8:
            X.0eM r2 = r5.A09
            java.lang.Object r2 = r2.getValue()
            X.H2d r2 = (X.C54183H2d) r2
            X.H2V r2 = r2.A00
            X.0Ud r3 = r2.A06
            r2 = 11
            java.lang.Object r0 = A01(r5, r0, r3, r2)
            if (r0 != r1) goto L_0x0a03
            return r1
        L_0x09bd:
            java.lang.String r2 = "QUESTION_AND_ANSWER"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0q
            goto L_0x09a3
        L_0x09c8:
            java.lang.String r2 = "SINGULAR_FACT"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0t
            goto L_0x09a3
        L_0x09d3:
            if (r6 == r2) goto L_0x09f5
            r2 = 791971135(0x2f34853f, float:1.6418243E-10)
            if (r6 == r2) goto L_0x09ea
            r2 = 2104228359(0x7d6bfa07, float:1.9604175E37)
            if (r6 != r2) goto L_0x09a8
            java.lang.String r2 = "AFFILIATE_LINKS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0n
            goto L_0x09a3
        L_0x09ea:
            java.lang.String r2 = "QUESTION_AND_ANSWER"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0p
            goto L_0x09a3
        L_0x09f5:
            java.lang.String r2 = "SINGULAR_FACT"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x09a8
            X.HOt r3 = X.C54688HOt.A0s
            goto L_0x09a3
        L_0x0a00:
            X.0eS.A00(r9)
        L_0x0a03:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0a08:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0a16
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a16:
            java.lang.Object r2 = A00(r9, r0)
            X.H2T r2 = (X.H2T) r2
            com.instagram.repository.common.FeedPagedData r2 = r2.A01
            r0.A00 = r3
            java.lang.Object r0 = com.instagram.repository.common.FeedPagedData.A00(r2, r0)
            goto L_0x1015
        L_0x0a26:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0a34
            if (r2 == r6) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a34:
            java.lang.Object r5 = A00(r9, r0)
            r2 = 22
            X.IwF r2 = X.C58706IwF.A01(r5, r2)
            X.05E r4 = X.C3025664b.A02(r2)
            r3 = 13
            X.IkU r2 = new X.IkU
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x1015
        L_0x0a51:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0a66
            if (r3 != r2) goto L_0x0a72
            X.0eS.A00(r9)
        L_0x0a5d:
            java.lang.Object r0 = r0.A02
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            goto L_0x1047
        L_0x0a66:
            X.0eS.A00(r9)
            r0.A00 = r2
            java.lang.Object r2 = X.AnonymousClass131.A00(r0)
            if (r2 != r1) goto L_0x0a5d
            return r1
        L_0x0a72:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a77:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0a85
            if (r3 == r2) goto L_0x0a9e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a85:
            java.lang.Object r4 = A00(r9, r0)
            X.Gzn r4 = (X.C54118Gzn) r4
            X.0eM r2 = r4.A05
            java.lang.Object r2 = r2.getValue()
            X.H2e r2 = (X.C54184H2e) r2
            X.0Ud r3 = r2.A09
            r2 = 14
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0aa1
            return r1
        L_0x0a9e:
            X.0eS.A00(r9)
        L_0x0aa1:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0aa6:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0ab4
            if (r3 == r2) goto L_0x0acd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ab4:
            java.lang.Object r4 = A00(r9, r0)
            X.GzX r4 = (X.C54102GzX) r4
            X.0eM r2 = r4.A04
            java.lang.Object r2 = r2.getValue()
            X.H2g r2 = (X.C54186H2g) r2
            X.0Ud r3 = r2.A07
            r2 = 15
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0ad0
            return r1
        L_0x0acd:
            X.0eS.A00(r9)
        L_0x0ad0:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0ad5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0b16
            if (r2 != r3) goto L_0x0bd2
            X.0eS.A00(r9)
        L_0x0ae1:
            X.JVf r9 = (X.C59721JVf) r9
            java.lang.Object r5 = r0.A02
            X.H2g r5 = (X.C54186H2g) r5
            if (r9 != 0) goto L_0x0b2b
            X.05G r2 = r5.A06
        L_0x0aeb:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.GnW r0 = (X.C53399GnW) r0
            X.HLa r4 = X.C54617HLa.ERROR
            java.lang.Object r7 = r0.A05
            X.62P r7 = (X.AnonymousClass62P) r7
            java.lang.Object r8 = r0.A03
            X.62P r8 = (X.AnonymousClass62P) r8
            java.lang.Object r5 = r0.A01
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r0.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r9 = r0.A06
            X.AnonymousClass7TG.A1T(r7, r8, r4)
            X.GnW r3 = new X.GnW
            r3.<init>((X.C54617HLa) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (X.AnonymousClass62P) r7, (X.AnonymousClass62P) r8, (boolean) r9)
            boolean r0 = r2.AIY(r1, r3)
            if (r0 == 0) goto L_0x0aeb
            goto L_0x1047
        L_0x0b16:
            java.lang.Object r2 = A00(r9, r0)
            X.H2g r2 = (X.C54186H2g) r2
            com.instagram.creator.agent.settings.keyword.KeywordRepository r5 = r2.A04
            java.lang.String r4 = r2.A00
            java.lang.String r2 = r2.A01
            r0.A00 = r3
            java.lang.Object r9 = r5.A04(r4, r2, r0)
            if (r9 != r1) goto L_0x0ae1
            return r1
        L_0x0b2b:
            java.lang.Object r4 = r9.A00
            X.McY r4 = (X.C66787McY) r4
            boolean r0 = r4.A04
            r5.A03 = r0
            java.lang.String r0 = r4.A03
            r5.A00 = r0
            java.lang.Object r6 = r9.A01
            X.McY r6 = (X.C66787McY) r6
            boolean r0 = r6.A04
            r5.A02 = r0
            java.lang.String r0 = r6.A03
            r5.A01 = r0
            X.05G r2 = r5.A06
        L_0x0b45:
            java.lang.Object r7 = r2.getValue()
            r10 = r7
            X.GnW r10 = (X.C53399GnW) r10
            java.lang.Object r1 = r4.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r10.A05
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            java.util.HashSet r11 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0b64:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.QP8 r0 = (X.QP8) r0
            java.lang.String r0 = r0.A02
            X.C51971G9r.A1O(r0, r1, r11, r9)
            goto L_0x0b64
        L_0x0b77:
            X.62P r12 = X.AnonymousClass62Q.A00(r9)
            int r8 = r4.A01
            java.lang.Object r1 = r6.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r10.A03
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            java.util.HashSet r11 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x0b95:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0ba8
            java.lang.Object r1 = r9.next()
            r0 = r1
            X.QP8 r0 = (X.QP8) r0
            java.lang.String r0 = r0.A02
            X.C51971G9r.A1O(r0, r1, r11, r10)
            goto L_0x0b95
        L_0x0ba8:
            X.62P r13 = X.AnonymousClass62Q.A00(r10)
            int r1 = r6.A01
            boolean r0 = r5.A03
            r14 = r0 ^ 1
            X.HLa r9 = X.C54617HLa.SUCCESS
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r8)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r1)
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.AnonymousClass7TF.A1B(r13, r3, r9)
            X.GnW r8 = new X.GnW
            r8.<init>((X.C54617HLa) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (X.AnonymousClass62P) r12, (X.AnonymousClass62P) r13, (boolean) r14)
            boolean r0 = r2.AIY(r7, r8)
            if (r0 == 0) goto L_0x0b45
            goto L_0x1047
        L_0x0bd2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bd7:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 2
            r2 = 1
            if (r3 == 0) goto L_0x0c16
            if (r3 == r2) goto L_0x0c22
            if (r3 != r7) goto L_0x0c4e
            X.0eS.A00(r9)
        L_0x0be6:
            X.Gq1 r9 = (X.C53531Gq1) r9
            java.lang.Object r0 = r0.A02
            X.H2e r0 = (X.C54184H2e) r0
            X.05G r2 = r0.A08
        L_0x0bee:
            java.lang.Object r1 = r2.getValue()
            r14 = r1
            X.GnP r14 = (X.C53392GnP) r14
            r10 = 0
            r20 = 0
            if (r9 != 0) goto L_0x0c13
            X.HLa r11 = X.C54617HLa.ERROR
        L_0x0bfc:
            r19 = 5119(0x13ff, float:7.173E-42)
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            X.GnP r0 = X.C53392GnP.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0bee
            goto L_0x1047
        L_0x0c13:
            X.HLa r11 = X.C54617HLa.SUCCESS
            goto L_0x0bfc
        L_0x0c16:
            X.0eS.A00(r9)
            r0.A00 = r2
            java.lang.Object r2 = X.C241603Pv.A00(r0)
            if (r2 != r1) goto L_0x0c25
            return r1
        L_0x0c22:
            X.0eS.A00(r9)
        L_0x0c25:
            java.lang.Object r2 = r0.A02
            X.H2e r2 = (X.C54184H2e) r2
            com.instagram.creator.agent.settings.keyword.KeywordRepository r6 = r2.A03
            X.0Ud r5 = r2.A0A
            java.lang.Object r2 = r5.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r4 = r2.A08
            java.lang.Object r2 = r5.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r3 = r2.A07
            java.lang.Object r2 = r5.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r2 = r2.A09
            r0.A00 = r7
            java.lang.Object r9 = r6.A03(r2, r3, r4, r0)
            if (r9 != r1) goto L_0x0be6
            return r1
        L_0x0c4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c53:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0c64
            if (r2 == r5) goto L_0x0cde
            if (r2 == r10) goto L_0x0cde
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c64:
            java.lang.Object r11 = A00(r9, r0)
            X.H2e r11 = (X.C54184H2e) r11
            java.lang.String r6 = r11.A06
            int r2 = r6.length()
            boolean r3 = X.AnonymousClass7TF.A1R(r2)
            r7 = 0
            com.instagram.creator.agent.settings.keyword.KeywordRepository r8 = r11.A03
            X.0Ud r9 = r11.A0A
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            if (r3 == 0) goto L_0x0cab
            java.lang.String r4 = r2.A09
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r3 = r2.A07
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            boolean r2 = r2.A0B
            if (r2 == 0) goto L_0x0c9d
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.Long r7 = r2.A06
        L_0x0c9d:
            r0.A00 = r5
            r9 = r7
            r10 = r6
            r11 = r4
            r12 = r3
            r13 = r0
            java.lang.Object r9 = r8.A02(r9, r10, r11, r12, r13)
        L_0x0ca8:
            if (r9 != r1) goto L_0x0ce1
            return r1
        L_0x0cab:
            java.lang.String r6 = r2.A08
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r5 = r2.A09
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.String r4 = r2.A07
            java.lang.String r3 = r11.A04
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            boolean r2 = r2.A0B
            if (r2 == 0) goto L_0x0cd1
            java.lang.Object r2 = r9.getValue()
            X.GnP r2 = (X.C53392GnP) r2
            java.lang.Long r7 = r2.A06
        L_0x0cd1:
            r0.A00 = r10
            r9 = r7
            r10 = r6
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r0
            java.lang.Object r9 = r8.A01(r9, r10, r11, r12, r13, r14)
            goto L_0x0ca8
        L_0x0cde:
            X.0eS.A00(r9)
        L_0x0ce1:
            X.QP8 r9 = (X.QP8) r9
            java.lang.Object r1 = r0.A02
            X.H2e r1 = (X.C54184H2e) r1
            X.05G r2 = r1.A07
            if (r9 == 0) goto L_0x0cf5
            X.Gq6 r0 = new X.Gq6
            r0.<init>(r9)
        L_0x0cf0:
            r2.Epw(r0)
            goto L_0x1047
        L_0x0cf5:
            X.IQl r0 = X.C57147IQl.A00
            r2.Epw(r0)
            X.05G r2 = r1.A08
        L_0x0cfc:
            java.lang.Object r1 = r2.getValue()
            r8 = r1
            X.GnP r8 = (X.C53392GnP) r8
            r3 = 0
            X.HLa r4 = X.C54617HLa.SUCCESS
            r14 = 0
            r13 = 8187(0x1ffb, float:1.1472E-41)
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            X.GnP r0 = X.C53392GnP.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0cfc
            goto L_0x1047
        L_0x0d1c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0d66
            if (r2 != r6) goto L_0x0ddd
            X.0eS.A00(r9)
        L_0x0d28:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r1 = r9 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0d96
            java.lang.Object r5 = r0.A02
            X.Ggl r5 = (X.C52994Ggl) r5
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r10 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            r5.A00 = r10
            X.05G r6 = r5.A03
        L_0x0d3c:
            java.lang.Object r4 = r6.getValue()
            r7 = r4
            X.GnF r7 = (X.C53383GnF) r7
            r13 = 0
            X.HLa r8 = X.C54617HLa.SUCCESS
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322993689995996(0x810b9200122adc, double:3.034145698284781E-306)
            boolean r15 = X.182.A06(r2, r3, r0)
            r9 = 0
            r12 = 234(0xea, float:3.28E-43)
            r11 = r9
            r14 = r13
            r16 = r13
            X.GnF r0 = X.C53383GnF.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r6.AIY(r4, r0)
            if (r0 == 0) goto L_0x0d3c
            goto L_0x1047
        L_0x0d66:
            java.lang.Object r5 = A00(r9, r0)
            X.Ggl r5 = (X.C52994Ggl) r5
            X.05G r4 = r5.A03
        L_0x0d6e:
            java.lang.Object r3 = r4.getValue()
            r7 = r3
            X.GnF r7 = (X.C53383GnF) r7
            r9 = 0
            r13 = 0
            X.HLa r8 = X.C54617HLa.LOADING
            r12 = 251(0xfb, float:3.52E-43)
            r10 = r9
            r11 = r9
            r14 = r13
            r15 = r13
            r16 = r13
            X.GnF r2 = X.C53383GnF.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r4.AIY(r3, r2)
            if (r2 == 0) goto L_0x0d6e
            com.instagram.creator.agent.settings.summary.BioSummaryRepository r2 = r5.A02
            r0.A00 = r6
            java.lang.Object r9 = r2.A01(r0)
            if (r9 != r1) goto L_0x0d28
            return r1
        L_0x0d96:
            boolean r1 = r9 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0dd8
            java.lang.Object r0 = r0.A02
            X.Ggl r0 = (X.C52994Ggl) r0
            X.05G r5 = r0.A03
        L_0x0da0:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.GnF r3 = (X.C53383GnF) r3
            X.HLa r11 = X.C54617HLa.ERROR
            r0 = 2131974095(0x7f1357cf, float:1.9585244E38)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r0)
            r0 = r9
            X.5sO r0 = (X.C297815sO) r0
            java.lang.Object r14 = r0.A00
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r13 = r3.A03
            boolean r15 = r3.A07
            boolean r2 = r3.A06
            boolean r1 = r3.A08
            boolean r0 = r3.A05
            X.DbY.A1S(r13, r11)
            X.GnF r10 = new X.GnF
            r18 = r0
            r16 = r2
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r5.AIY(r4, r10)
            if (r0 == 0) goto L_0x0da0
            goto L_0x1047
        L_0x0dd8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0ddd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0de2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0df0
            if (r2 == r3) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0df0:
            java.lang.Object r2 = A00(r9, r0)
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r2 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r2
            r0.A00 = r3
            java.lang.Object r0 = com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A00(r2, r0)
            goto L_0x1015
        L_0x0dfe:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0ff7
            if (r3 == r2) goto L_0x0e14
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e0c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            switch(r2) {
                case 0: goto L_0x0e19;
                case 1: goto L_0x0e2c;
                case 2: goto L_0x0e77;
                case 3: goto L_0x0fe3;
                case 4: goto L_0x0e14;
                case 5: goto L_0x0fd6;
                default: goto L_0x0e14;
            }
        L_0x0e14:
            X.0eS.A00(r9)
            goto L_0x1047
        L_0x0e19:
            java.lang.Object r2 = A00(r9, r0)
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r3 = r2.A06
            X.H9d r2 = X.H9d.A00
            r0.A00 = r4
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x0e2f
            return r1
        L_0x0e2c:
            X.0eS.A00(r9)
        L_0x0e2f:
            java.lang.Object r2 = r0.A02
            X.GhQ r2 = (X.C53034GhQ) r2
            X.HrB r4 = r2.A03
            long r2 = r2.A00
            java.lang.String r6 = java.lang.String.valueOf(r2)
            r2 = 2
            r0.A00 = r2
            r13 = 0
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r2 = "challenge_id"
            r5.A04(r2, r6)
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r3.getParamsCopy()
            java.lang.Class<X.Bee> r10 = X.C42559Bee.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IgCreatorsChallengesEndChallengeMutation"
            r11 = 1
            java.lang.String r15 = "xdt_creators_challenges_end_challenge"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r2 = r4.A00
            X.1vn r2 = X.1vm.A01(r2)
            java.lang.Object r9 = r2.A04(r5, r0)
            if (r9 != r1) goto L_0x0e7a
            return r1
        L_0x0e77:
            X.0eS.A00(r9)
        L_0x0e7a:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r2 = r9 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0fad
            X.3lr r5 = X.C41846B3n.A0R(r9)
            if (r5 == 0) goto L_0x0fe6
            java.lang.Class<X.Bed> r4 = X.C42558Bed.class
            r2 = 4231(0x1087, float:5.929E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -1669860190(0xffffffff9c77f4a2, float:-8.2041625E-22)
            X.3lr r6 = r5.A05(r4, r3, r2)
            if (r6 == 0) goto L_0x0fe6
            java.lang.Class<X.Bec> r5 = X.C42557Bec.class
            r4 = 1
            r2 = 3063(0xbf7, float:4.292E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = 742396800(0x2c401380, float:2.7295666E-12)
            X.3lr r4 = r6.getRequiredTreeField(r4, r3, r5, r2)
            if (r4 == 0) goto L_0x0fe6
            java.lang.Class<X.UQD> r3 = X.UQD.class
            r2 = -980305192(0xffffffffc591bad8, float:-4663.3555)
            X.3lr r3 = r4.A01(r3, r2)
            if (r3 == 0) goto L_0x0fe6
            java.lang.Object r4 = r0.A02
            X.GhQ r4 = (X.C53034GhQ) r4
            com.instagram.common.session.UserSession r2 = r4.A02
            X.1E4.A00(r2)
            java.lang.Class<com.instagram.api.schemas.ImmutablePandoChallenge> r2 = com.instagram.api.schemas.ImmutablePandoChallenge.class
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r2)
            X.17P r2 = (X.17P) r2
            r3 = -1402832798(0xffffffffac627862, float:-3.2183358E-12)
            java.lang.String r13 = r2.A0i(r3)
            r3 = 2050282037(0x7a34d235, float:2.3471923E35)
            java.lang.String r14 = r2.A0i(r3)
            java.lang.Class<com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo> r3 = com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo.class
            r5 = -351576964(0xffffffffeb0b5c7c, float:-1.6847743E26)
            com.facebook.pando.TreeJNI r5 = r2.A05(r5, r3)
            com.instagram.api.schemas.ChallengeButtonInfo r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r5
            r9 = 0
            if (r5 == 0) goto L_0x0faa
            com.instagram.api.schemas.ChallengeButtonInfoImpl r6 = r5.F1I()
        L_0x0ee5:
            r5 = 1658624281(0x62dc9919, float:2.0346578E21)
            java.lang.String r15 = r2.A0i(r5)
            r5 = -460463584(0xffffffffe48de220, float:-2.093828E22)
            java.lang.String r16 = r2.A0i(r5)
            r5 = 112359031(0x6b27677, float:6.7130227E-35)
            long r27 = r2.A03(r5)
            r5 = -1809911957(0xffffffff941eef6b, float:-8.024178E-27)
            com.facebook.pando.TreeJNI r5 = r2.A05(r5, r3)
            com.instagram.api.schemas.ChallengeButtonInfo r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r5
            if (r5 == 0) goto L_0x0fa7
            com.instagram.api.schemas.ChallengeButtonInfoImpl r7 = r5.F1I()
        L_0x0f09:
            r5 = -1291468615(0xffffffffb305c0b9, float:-3.1141756E-8)
            com.facebook.pando.TreeJNI r5 = r2.A05(r5, r3)
            com.instagram.api.schemas.ChallengeButtonInfo r5 = (com.instagram.api.schemas.ChallengeButtonInfo) r5
            if (r5 == 0) goto L_0x0fa4
            com.instagram.api.schemas.ChallengeButtonInfoImpl r8 = r5.F1I()
        L_0x0f18:
            r5 = 1747774625(0x682ceca1, float:3.2664483E24)
            java.lang.String r17 = r2.A0i(r5)
            r5 = 1256037341(0x4add9bdd, float:7261678.5)
            boolean r29 = r2.getBooleanValueByHashCode(r5)
            r5 = 394289750(0x17806256, float:8.29663E-25)
            java.lang.String r18 = r2.A0i(r5)
            r5 = 1580530549(0x5e34fb75, float:3.26028645E18)
            com.facebook.pando.TreeJNI r3 = r2.A05(r5, r3)
            com.instagram.api.schemas.ChallengeButtonInfo r3 = (com.instagram.api.schemas.ChallengeButtonInfo) r3
            if (r3 == 0) goto L_0x0f3c
            com.instagram.api.schemas.ChallengeButtonInfoImpl r9 = r3.F1I()
        L_0x0f3c:
            r3 = -522690089(0xffffffffe0d861d7, float:-1.2473584E20)
            java.lang.String r19 = r2.A0i(r3)
            r3 = 1418939442(0x54934c32, float:5.0611083E12)
            java.lang.String r20 = r2.A0h(r3)
            r3 = 1042451834(0x3e228d7a, float:0.15874282)
            java.lang.String r21 = r2.A0i(r3)
            r3 = -877823861(0xffffffffcbad788b, float:-2.2737174E7)
            java.lang.String r22 = r2.A0h(r3)
            r3 = 10974452(0xa774f4, float:1.5378483E-38)
            java.lang.Integer r12 = r2.getOptionalIntValueByHashCode(r3)
            X.J02 r5 = X.J02.A00
            r3 = 3373707(0x337a8b, float:4.72757E-39)
            java.lang.Object r10 = r2.A0M(r3, r5)
            com.instagram.api.schemas.ChallengeName r10 = (com.instagram.api.schemas.ChallengeName) r10
            r3 = -1001078227(0xffffffffc454c22d, float:-851.034)
            int r25 = r2.getIntValueByHashCode(r3)
            r3 = -1838429974(0xffffffff926bc8ea, float:-7.440057E-28)
            java.lang.String r23 = r2.A0i(r3)
            X.J03 r5 = X.J03.A00
            r3 = 109757585(0x68ac491, float:5.219866E-35)
            java.lang.Object r11 = r2.A0M(r3, r5)
            com.instagram.api.schemas.ChallengeState r11 = (com.instagram.api.schemas.ChallengeState) r11
            java.lang.String r24 = r2.A0S()
            r3 = 110549828(0x696db44, float:5.674591E-35)
            int r26 = r2.getIntValueByHashCode(r3)
            com.instagram.api.schemas.Challenge r5 = new com.instagram.api.schemas.Challenge
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            X.0V2 r4 = r4.A05
            X.H9b r3 = new X.H9b
            r3.<init>(r5)
            r2 = 3
            r0.A00 = r2
            java.lang.Object r2 = r4.emit(r3, r0)
            if (r2 != r1) goto L_0x0fe6
            return r1
        L_0x0fa4:
            r8 = r9
            goto L_0x0f18
        L_0x0fa7:
            r7 = r9
            goto L_0x0f09
        L_0x0faa:
            r6 = r9
            goto L_0x0ee5
        L_0x0fad:
            boolean r2 = r9 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0ff2
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r2 = r9.A00
            java.lang.String r3 = r2.toString()
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0fc1
            java.lang.String r3 = "end challenge api error"
        L_0x0fc1:
            java.lang.Object r2 = r0.A02
            X.GhQ r2 = (X.C53034GhQ) r2
            X.C53034GhQ.A01(r2, r3)
            X.0V2 r4 = r2.A05
            X.H9W r3 = X.H9W.A00
            r2 = 5
            r0.A00 = r2
            java.lang.Object r2 = r4.emit(r3, r0)
            if (r2 != r1) goto L_0x0fd9
            return r1
        L_0x0fd6:
            X.0eS.A00(r9)
        L_0x0fd9:
            java.lang.Object r2 = r0.A02
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9a r4 = X.C54354H9a.A00
            r2 = 6
            goto L_0x0fef
        L_0x0fe3:
            X.0eS.A00(r9)
        L_0x0fe6:
            java.lang.Object r2 = r0.A02
            X.GhQ r2 = (X.C53034GhQ) r2
            X.0V2 r5 = r2.A05
            X.H9W r4 = X.H9W.A00
            r2 = 4
        L_0x0fef:
            r0.A00 = r2
            goto L_0x1011
        L_0x0ff2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0ff7:
            java.lang.Object r3 = A00(r9, r0)
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r3 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r3
            r0.A00 = r2
            r2 = 0
            java.lang.Object r0 = com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A01(r3, r0, r2)
            goto L_0x1015
        L_0x1005:
            java.lang.Object r2 = A00(r9, r0)
            X.GhU r2 = (X.C53038GhU) r2
            X.0V2 r5 = r2.A05
            X.H9N r4 = X.H9N.A00
        L_0x100f:
            r0.A00 = r3
        L_0x1011:
            java.lang.Object r0 = r5.emit(r4, r0)
        L_0x1015:
            if (r0 != r1) goto L_0x1047
            return r1
        L_0x1018:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r13 = 1
            if (r2 == 0) goto L_0x107b
            if (r2 != r13) goto L_0x10b0
            X.0eS.A00(r9)
        L_0x1024:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.A02
            X.Ggl r2 = (X.C52994Ggl) r2
            X.05G r0 = r2.A03
            if (r9 == 0) goto L_0x104a
        L_0x102e:
            java.lang.Object r2 = r0.getValue()
            r6 = r2
            X.GnF r6 = (X.C53383GnF) r6
            r12 = 0
            r7 = 0
            r11 = 214(0xd6, float:3.0E-43)
            r8 = r7
            r10 = r7
            r14 = r12
            r15 = r12
            X.GnF r1 = X.C53383GnF.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r0.AIY(r2, r1)
            if (r1 == 0) goto L_0x102e
        L_0x1047:
            X.0gF r1 = X.C60340gF.A00
        L_0x1049:
            return r1
        L_0x104a:
            java.lang.Object r4 = r0.getValue()
            r3 = r4
            X.GnF r3 = (X.C53383GnF) r3
            java.lang.String r8 = r3.A03
            java.lang.String r1 = r2.A00
            boolean r11 = X.C51966G9m.A1a(r8, r1)
            r1 = 2131974095(0x7f1357cf, float:1.9585244E38)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            java.lang.String r9 = "bio_regen_error"
            boolean r10 = r3.A07
            java.lang.Object r6 = r3.A01
            X.HLa r6 = (X.C54617HLa) r6
            boolean r12 = r3.A08
            r13 = 0
            X.AnonymousClass7TF.A1B(r8, r13, r6)
            X.GnF r5 = new X.GnF
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r0.AIY(r4, r5)
            if (r1 == 0) goto L_0x104a
            goto L_0x1047
        L_0x107b:
            java.lang.Object r5 = A00(r9, r0)
            X.Ggl r5 = (X.C52994Ggl) r5
            X.05G r4 = r5.A03
        L_0x1083:
            java.lang.Object r3 = r4.getValue()
            r14 = r3
            X.GnF r14 = (X.C53383GnF) r14
            r15 = 0
            r20 = 0
            r19 = 215(0xd7, float:3.01E-43)
            r16 = r15
            r17 = r15
            r18 = r15
            r21 = r20
            r22 = r20
            r23 = r13
            X.GnF r2 = X.C53383GnF.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r2 = r4.AIY(r3, r2)
            if (r2 == 0) goto L_0x1083
            com.instagram.creator.agent.settings.summary.BioSummaryRepository r2 = r5.A02
            r0.A00 = r13
            java.lang.Object r9 = r2.A02(r0)
            if (r9 != r1) goto L_0x1024
            return r1
        L_0x10b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58102ImO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C58102ImO imO) {
        0eS.A00(obj);
        return imO.A02;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58102ImO) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
