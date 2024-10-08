package X;

/* renamed from: X.MIz  reason: case insensitive filesystem */
public final class C66218MIz extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66218MIz(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        r3.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r3.A07(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        if (X.LQF.A00(r7, r6) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
        if (r0 == null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fb, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0202, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0213, code lost:
        r4 = X.C54909HXr.A00(r1, r0);
        r1 = r5.mParentFragment;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021b, code lost:
        if ((r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021d, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021f, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0221, code lost:
        r3 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0223, code lost:
        if (r3 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0225, code lost:
        r2 = X.DbX.A0f(r2);
        X.DbZ.A0z(r5.requireContext(), r2, 2131956901);
        X.0qQ.A0C(r4, X.AnonymousClass000.A00(7));
        r2.A0T = r4;
        r3.A0F(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0248, code lost:
        if (r0 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x024a, code lost:
        r5 = "params";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x024d, code lost:
        X.LIV.A01(r4, r2, r3.A01, r0.A01);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0031;
                case 2: goto L_0x02b5;
                case 3: goto L_0x0041;
                case 4: goto L_0x0055;
                case 5: goto L_0x02b2;
                case 6: goto L_0x02d0;
                case 7: goto L_0x02d7;
                case 8: goto L_0x02b2;
                case 9: goto L_0x02d0;
                case 10: goto L_0x02d7;
                case 11: goto L_0x02de;
                case 12: goto L_0x000f;
                case 13: goto L_0x02ef;
                case 14: goto L_0x0305;
                case 15: goto L_0x006b;
                case 16: goto L_0x0085;
                case 17: goto L_0x030c;
                case 18: goto L_0x031d;
                case 19: goto L_0x00bd;
                case 20: goto L_0x0305;
                case 21: goto L_0x033f;
                case 22: goto L_0x00c6;
                case 23: goto L_0x0007;
                case 24: goto L_0x00d5;
                case 25: goto L_0x0203;
                case 26: goto L_0x01d5;
                case 27: goto L_0x01e2;
                case 28: goto L_0x01eb;
                case 29: goto L_0x01e2;
                case 30: goto L_0x01eb;
                case 31: goto L_0x0346;
                case 32: goto L_0x01e2;
                case 33: goto L_0x035e;
                case 34: goto L_0x0369;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0256;
                case 39: goto L_0x0007;
                case 40: goto L_0x0374;
                case 41: goto L_0x0385;
                case 42: goto L_0x038e;
                case 43: goto L_0x0268;
                case 44: goto L_0x0293;
                case 45: goto L_0x02d0;
                case 46: goto L_0x02d7;
                case 47: goto L_0x02d0;
                case 48: goto L_0x02d7;
                case 49: goto L_0x038e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
        L_0x000c:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x000f:
            java.lang.Object r3 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r3 = (com.instagram.creation.fragment.AlbumEditFragment) r3
            X.0eM r0 = r3.A0d
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.82p r1 = r3.A0G
            if (r1 != 0) goto L_0x02a6
            java.lang.String r5 = "cameraSession"
            goto L_0x01fb
        L_0x0021:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r3 = r0.getValue()
            X.JjS r3 = (X.C60323JjS) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1
            goto L_0x0067
        L_0x0031:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r3 = r0.getValue()
            X.JjS r3 = (X.C60323JjS) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 0
            goto L_0x0067
        L_0x0041:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r3 = r0.getValue()
            X.JjS r3 = (X.C60323JjS) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1
            X.KJf r0 = r3.A02
            r3.A01 = r0
            goto L_0x0064
        L_0x0055:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r3 = r0.getValue()
            X.JjS r3 = (X.C60323JjS) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 0
        L_0x0064:
            r0 = 0
            r3.A02 = r0
        L_0x0067:
            r3.A07(r2, r1)
            goto L_0x000c
        L_0x006b:
            java.lang.Object r2 = r1.A01
            X.Loa r2 = (X.C65171Loa) r2
            com.instagram.common.session.UserSession r0 = r2.A07
            boolean r0 = X.LTP.A09(r0)
            if (r0 != 0) goto L_0x000c
            X.JeZ r1 = r2.A04
            if (r1 == 0) goto L_0x000c
            X.KNl r0 = r2.A08
            X.3Q2 r0 = X.LP2.A01(r0)
            r1.A06(r0)
            goto L_0x000c
        L_0x0085:
            java.lang.Object r2 = r1.A01
            X.KNl r2 = (X.C61822KNl) r2
            X.LeQ r3 = r2.A04
            if (r3 == 0) goto L_0x00b9
            r4 = 0
            X.KNr r0 = X.LP2.A00(r2)
            X.KOb r0 = r0.A08
            java.util.List r7 = r0.A04
            X.Jfi r0 = r2.A04()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel"
            X.0qQ.A0C(r0, r1)
            X.KNr r0 = (X.C61828KNr) r0
            X.KOb r0 = r0.A08
            java.util.ArrayList r6 = r0.A00
            X.Jfi r0 = r2.A04()
            X.0qQ.A0C(r0, r1)
            X.KNr r0 = (X.C61828KNr) r0
            X.KOb r0 = r0.A08
            boolean r8 = r0.A01
            java.lang.String r5 = "tag_people_row"
            r3.A00(r4, r5, r6, r7, r8)
            goto L_0x000c
        L_0x00b9:
            java.lang.String r5 = "tagProductsRowNavigator"
            goto L_0x01fb
        L_0x00bd:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0G(r0)
            goto L_0x000c
        L_0x00c6:
            java.lang.Object r2 = r1.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 18
            X.C51971G9r.A1Q(r2, r1, r0)
            goto L_0x000c
        L_0x00d5:
            java.lang.Object r3 = r1.A01
            X.K7h r3 = (X.C61432K7h) r3
            X.MUn r1 = r3.A01
            if (r1 == 0) goto L_0x00e1
            r0 = 0
            r1.Cky(r0)
        L_0x00e1:
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r3.A00
            if (r0 == 0) goto L_0x024a
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0198
            r0 = 1
            if (r1 == r0) goto L_0x00fc
            r0 = 0
            if (r1 == r0) goto L_0x0198
            r0 = 2
            if (r1 == r0) goto L_0x000c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00fc:
            X.0eM r1 = r3.A02
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.JZd r6 = X.C59809JZd.IMAGINE
            r2 = 0
            X.0qQ.A0B(r7, r2)
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0127
            X.0Tu r0 = X.0Tu.A05
            r4 = 36327258591738132(0x810f7300063914, double:3.0368428393198885E-306)
            boolean r0 = X.182.A06(r0, r7, r4)
            if (r0 == 0) goto L_0x0127
            boolean r4 = X.LQF.A00(r7, r6)
            r0 = 1
            if (r4 != 0) goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            java.lang.String r5 = "params"
            r9 = 0
            if (r0 != 0) goto L_0x013d
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x000c
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r3.A00
            if (r0 != 0) goto L_0x024d
            goto L_0x01fb
        L_0x013d:
            X.8aL r4 = X.C358088aL.A0S
            X.28D r7 = X.28D.A3D
            X.27r r6 = X.C51971G9r.A0g(r1)
            android.content.Context r0 = r3.requireContext()
            int r13 = X.AnonymousClass4x3.A00(r0)
            X.JVj r8 = X.C59725JVj.IMAGINE_CREATE
            r14 = -1
            java.util.List r12 = X.AnonymousClass7TE.A1I(r4)
            r10 = r9
            r11 = r9
            r6.A18(r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.0xx r17 = X.DbW.A0E(r3)
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r3.A00
            if (r0 == 0) goto L_0x01fb
            java.lang.String r5 = r0.A02
            X.0lg r4 = X.DbT.A0X(r1)
            X.0Tu r3 = X.DbS.A0J(r4, r2)
            r0 = 36327258594359606(0x810f73002e3936, double:3.036842840977719E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r12 = r9
            if (r0 == 0) goto L_0x0180
            r12 = r5
        L_0x0180:
            X.Kgo r8 = X.C62498Kgo.LAUNCHED_FROM_STORY_VIEWER
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r11 = X.C51972G9s.A0n()
            X.MKD r14 = X.MKD.A00
            X.MKE r15 = X.MKE.A00
            X.MKF r16 = X.MKF.A00
            r13 = r9
            r18 = r2
            r19 = r2
            X.LI3.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x000c
        L_0x0198:
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x000c
            X.0eM r7 = r3.A02
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r7)
            X.JZd r5 = X.C59809JZd.IMAGINE_ME
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0242
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327258591738132(0x810f7300063914, double:3.0368428393198885E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0242
            boolean r0 = X.LQF.A00(r6, r5)
            if (r0 == 0) goto L_0x0242
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.Kgo r1 = X.C62498Kgo.LAUNCHED_FROM_STORY_VIEWER
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.LI3.A01(r4, r2, r1, r0)
            goto L_0x000c
        L_0x01d5:
            java.lang.Object r0 = r1.A01
            X.K7h r0 = (X.C61432K7h) r0
            X.MUn r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            r0.Ckx()
            goto L_0x000c
        L_0x01e2:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A17(r0)
            goto L_0x000c
        L_0x01eb:
            java.lang.Object r5 = r1.A01
            X.K7S r5 = (X.K7S) r5
            X.0eM r2 = r5.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0213
            java.lang.String r5 = "mediaId"
        L_0x01fb:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0203:
            java.lang.Object r5 = r1.A01
            X.K7h r5 = (X.C61432K7h) r5
            X.0eM r2 = r5.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r5.A00
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = r0.A01
        L_0x0213:
            X.H1m r4 = X.C54909HXr.A00(r1, r0)
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x000c
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x000c
            X.7Pu r3 = r1.A02
            if (r3 == 0) goto L_0x000c
            X.7Pr r2 = X.DbX.A0f(r2)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131956901(0x7f1314a5, float:1.955037E38)
            X.DbZ.A0z(r1, r2, r0)
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            r2.A0T = r4
            r3.A0F(r4, r2)
            goto L_0x000c
        L_0x0242:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams r0 = r3.A00
            if (r0 != 0) goto L_0x024d
        L_0x024a:
            java.lang.String r5 = "params"
            goto L_0x01fb
        L_0x024d:
            java.lang.String r1 = r0.A01
            X.MUn r0 = r3.A01
            X.LIV.A01(r4, r2, r0, r1)
            goto L_0x000c
        L_0x0256:
            java.lang.Object r4 = r1.A01
            X.0sP r4 = (X.0sP) r4
            java.lang.String r3 = ""
            long r1 = X.C285965Tk.A01
            X.5Tl r0 = new X.5Tl
            r0.<init>(r3, r1)
            r4.invoke(r0)
            goto L_0x000c
        L_0x0268:
            java.lang.Object r3 = r1.A01
            X.H0n r3 = (X.C54143H0n) r3
            X.0eM r0 = r3.A02
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel r0 = (com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel) r0
            X.Hpx r2 = r0.A00
            X.0Ud r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jvo r0 = (X.C61050Jvo) r0
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0290
            java.lang.String r1 = "AI_CONTEXTUAL_BACKGROUND_PRE_GEN_CANCEL"
        L_0x0286:
            r0 = 0
            r2.A00(r1, r0)
            r0 = 0
            X.C54143H0n.A00(r3, r0)
            goto L_0x000c
        L_0x0290:
            java.lang.String r1 = "IMAGINE_POST_GEN_CANCEL"
            goto L_0x0286
        L_0x0293:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3 = 2131972173(0x7f13504d, float:1.9581346E38)
            android.content.Context r2 = r0.getContext()
            r1 = 1
            java.lang.String r0 = "imagine_toast"
            X.C59689JTv.A01(r2, r0, r3, r1)
            goto L_0x000c
        L_0x02a6:
            X.0eM r0 = r3.A0e
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            X.KDO r4 = new X.KDO
            r4.<init>(r2, r1, r0)
            return r4
        L_0x02b2:
            java.lang.Object r4 = r1.A01
            return r4
        L_0x02b5:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r0 = r0.getValue()
            X.JjS r0 = (X.C60323JjS) r0
            X.KJf r0 = r0.A01
            if (r0 == 0) goto L_0x02ce
            X.L7l r0 = r0.A00
            int r0 = r0.A00
        L_0x02c9:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x02ce:
            r0 = 0
            goto L_0x02c9
        L_0x02d0:
            java.lang.Object r0 = r1.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x02d7:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x02de:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "standalone_mode"
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x02ef:
            java.lang.Object r0 = r1.A01
            X.4mT r0 = (X.C273374mT) r0
            android.app.Application r2 = X.DbY.A05(r0)
            com.instagram.common.session.UserSession r1 = r0.getSession()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.JWa r4 = new X.JWa
            r4.<init>(r2, r1)
            return r4
        L_0x0305:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x030c:
            java.lang.Object r0 = r1.A01
            X.LP2 r0 = (X.LP2) r0
            X.KNr r0 = X.LP2.A00(r0)
            boolean r0 = r0.A0G()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x031d:
            java.lang.Object r1 = r1.A01
            X.KNl r1 = (X.C61822KNl) r1
            com.instagram.common.session.UserSession r3 = r1.A0I
            X.27r r0 = X.27p.A01(r3)
            X.283 r0 = r0.A04
            X.28D r0 = r0.A09
            X.0qQ.A07(r0)
            X.JVg r2 = X.C63094KrN.A00(r0)
            X.0iw r1 = r1.A0H
            X.LPH r0 = new X.LPH
            r0.<init>(r2, r1, r3)
            X.Lob r4 = new X.Lob
            r4.<init>(r0, r3)
            return r4
        L_0x033f:
            java.lang.Object r0 = r1.A01
            X.2YM r4 = X.JTR.A0b(r0)
            return r4
        L_0x0346:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "prompt_sticker_model"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = (com.instagram.api.schemas.StoryPromptTappableDataIntf) r0
            if (r0 == 0) goto L_0x035c
            com.instagram.reels.prompt.model.PromptStickerModel r4 = new com.instagram.reels.prompt.model.PromptStickerModel
            r4.<init>(r0)
            return r4
        L_0x035c:
            r4 = 0
            return r4
        L_0x035e:
            java.lang.Object r0 = r1.A01
            X.HmE r0 = (X.C55717HmE) r0
            androidx.compose.foundation.lazy.LazyListState r0 = r0.A00
            X.6Gl r4 = r0.A02()
            return r4
        L_0x0369:
            java.lang.Object r0 = r1.A01
            X.HmE r0 = (X.C55717HmE) r0
            X.5Oz r0 = r0.A01
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x0374:
            java.lang.Object r0 = r1.A01
            X.5Tl r0 = (X.C285975Tl) r0
            X.5Tq r0 = r0.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.C51966G9m.A1X(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0385:
            java.lang.Object r0 = r1.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x038e:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r4 = r0.requireParentFragment()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66218MIz.invoke():java.lang.Object");
    }
}
