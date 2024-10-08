package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.avatars.graphql.AvatarMutationRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

public final class DdZ extends 2YL implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AvatarProfileViewModel";
    public final 2Fk A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final C317946o6 A03;
    public final C317936o5 A04;
    public final AvatarCustomizationOptionsRepository A05;
    public final AvatarMutationRepository A06;
    public final AvatarStore A07;
    public final AnonymousClass0kM A08;
    public final UserSession A09;
    public final JVC A0A;
    public final String A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;

    public final void A02(String str, Boolean bool) {
        C318136oS A002;
        MGN mgn;
        UserSession userSession = this.A09;
        String str2 = "COIN_FLIP_ANIMATED_FRAME_POP";
        if (182.A06(0Tu.A05, userSession, 36315937058131658L)) {
            str2 = "COIN_FLIP_STATIC";
        } else if (DcE.A04(userSession)) {
            str2 = "COIN_FLIP_ANIMATED_CUSTOMIZATION";
        } else if (DcE.A02(userSession)) {
            str2 = "COIN_FLIP_ANIMATED_FRAME_POP_V2";
        } else {
            DcE.A01(userSession);
        }
        String str3 = str;
        if (str == null) {
            A002 = C318116oQ.A00(this);
            mgn = new MGN(this, bool, str3, str2, (AnonymousClass4D7) null, 16);
        } else if (DcE.A06(userSession, false)) {
            A002 = C318116oQ.A00(this);
            mgn = new MGN((Object) this, str3, str2, (AnonymousClass4D7) null, 17);
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(mgn, A002);
    }

    public final void A04(boolean z, String str, String str2, String str3) {
        AnonymousClass7TE.A1Z(new MEl(this, str, str2, str3, (AnonymousClass4D7) null, 0, z), C318116oQ.A00(this));
    }

    public static final AvatarCoinFlipSticker A00(C320936tD r6) {
        C320926tC r62 = (C320926tC) r6;
        return new AvatarCoinFlipSticker(r62.A05, DbX.A01(r62.A04), DbX.A01(r62.A01), AnonymousClass7TG.A0A(r62.A02), DbX.A01(r62.A03), r62.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.avatars.coinflip.AvatarCoinFlipConfig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r0.A08 == true) goto L_0x0028;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r4 = r16
            X.05G r3 = r4.A0E
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C319296qM
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C319296qM
            r2 = 1
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r3.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived"
            X.0qQ.A0C(r1, r0)
            X.6qM r1 = (X.C319296qM) r1
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r1.A00
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.A08
            if (r0 != r2) goto L_0x0086
        L_0x0028:
            r11 = r17
            if (r2 == r11) goto L_0x0046
            if (r17 == 0) goto L_0x0046
            X.JVC r1 = r4.A0A
            com.instagram.common.session.UserSession r0 = r4.A09
            java.lang.String r5 = r0.A06
            r2 = 0
            X.26t r0 = r1.A00
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            r0 = 2339(0x923, float:3.278E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbX.A1T(r1, r0, r5, r2)
        L_0x0046:
            com.instagram.common.session.UserSession r0 = r4.A09
            boolean r0 = X.DcE.A03(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r3.getValue()
            boolean r0 = r2 instanceof X.C319296qM
            if (r0 == 0) goto L_0x0084
            X.6qM r2 = (X.C319296qM) r2
        L_0x0058:
            r1 = 0
            if (r2 == 0) goto L_0x0064
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r2.A00
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.A08
            if (r0 != r11) goto L_0x0064
            r1 = 1
        L_0x0064:
            r8 = r1 ^ 1
            java.lang.Object r3 = r3.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived"
            X.0qQ.A0C(r3, r0)
            X.6qM r3 = (X.C319296qM) r3
            X.6oS r0 = X.C318116oQ.A00(r4)
            r7 = 0
            com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1 r2 = new com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1
            r5 = r18
            r6 = r19
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x0083:
            return
        L_0x0084:
            r2 = 0
            goto L_0x0058
        L_0x0086:
            r2 = 0
            goto L_0x0028
        L_0x0088:
            java.lang.Object r1 = r3.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.avatars.AvatarProfileViewModel.SelfAvatarUiState.AvatarProfileConfigReceived"
            X.0qQ.A0C(r1, r0)
            X.6qM r1 = (X.C319296qM) r1
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r1.A00
            r5 = 0
            if (r0 == 0) goto L_0x00b6
            if (r17 == 0) goto L_0x009c
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r5 = r0.A04
        L_0x009c:
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r6 = r0.A05
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r7 = r0.A06
            java.lang.String r10 = r0.A07
            boolean r12 = r0.A09
            X.6tJ r8 = r0.A00
            boolean r14 = r0.A03
            com.instagram.avatars.common.AvatarInfo r9 = r0.A01
            boolean r15 = r0.A02
            X.AnonymousClass7TG.A1N(r6, r7)
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r4 = new com.instagram.avatars.coinflip.AvatarCoinFlipConfig
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = r4
        L_0x00b6:
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r1.A02
            boolean r1 = r1.A03
            X.DbY.A1S(r4, r2)
            X.6qM r0 = new X.6qM
            r0.<init>(r5, r4, r2, r1)
            r3.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DdZ.A03(boolean, java.lang.String, java.lang.String):void");
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public /* synthetic */ DdZ(AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository, UserSession userSession, String str) {
        JVC jvc = new JVC(userSession, 26G.A00(userSession));
        AvatarStore A002 = 25x.A00(userSession);
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        C317946o6 r3 = new C317946o6(26G.A00(userSession));
        C317936o5 r2 = new C317936o5(r3, A002, userSession);
        AvatarMutationRepository avatarMutationRepository = new AvatarMutationRepository(25x.A00(userSession), userSession);
        AnonymousClass7TG.A1O(userSession, str);
        AnonymousClass7TG.A1R(A002, A0M);
        this.A09 = userSession;
        this.A0B = str;
        this.A0A = jvc;
        this.A07 = A002;
        this.A08 = A0M;
        this.A03 = r3;
        this.A04 = r2;
        this.A05 = avatarCustomizationOptionsRepository;
        this.A06 = avatarMutationRepository;
        A0M.A00 = this;
        02z A012 = 106.A01(C46547Dgo.A00);
        this.A0E = A012;
        this.A0H = A012;
        19B r1 = 19B.A00;
        this.A02 = C226292g8.A00(r1, A012);
        02z A013 = 106.A01(C46546Dgn.A00);
        this.A0D = A013;
        this.A0G = A013;
        this.A01 = C226292g8.A00(r1, A013);
        02z A014 = 106.A01(C46545Dgm.A00);
        this.A0C = A014;
        this.A0F = A014;
        this.A00 = C226292g8.A00(r1, A014);
    }

    public final void A01() {
        C51647Fy6.A02(this, C318116oQ.A00(this), 44);
    }
}
