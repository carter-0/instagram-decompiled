package X;

import android.content.Intent;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;

/* renamed from: X.Kcu  reason: case insensitive filesystem */
public final class C62260Kcu extends IgLiveExploreLiveBaseFragment implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "IgLivePostLiveBroadcasterFragment";
    public IgdsBottomButtonLayout A00;
    public C331157Pu A01;
    public AnonymousClass3NV A02;
    public M0Z A03;
    public LDJ A04;
    public ExistingStandaloneFundraiserForFeedModel A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new C66302MMl(this, 35));
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E;

    public final String getModuleName() {
        return "live_broadcast_ending";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r0 = 0
            r4 = r11
            X.0qQ.A0B(r11, r0)
            r7 = r10
            super.onViewCreated(r11, r12)
            X.07U r6 = X.07U.A05
            X.07Z r5 = r10.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r5)
            r8 = 0
            r9 = 39
            X.MHL r3 = new X.MHL
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r3, r0)
            X.0eM r0 = r10.A0E
            java.lang.Object r0 = r0.getValue()
            X.Jhd r0 = (X.C60220Jhd) r0
            X.0r6 r1 = r0.A09
            r0 = 8
            X.MHB r0 = X.MHB.A01(r10, r8, r0)
            X.DbZ.A1C(r10, r0, r1)
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0094
            android.content.Context r1 = r10.requireContext()
            r0 = 2131969643(0x7f13466b, float:1.9576215E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            X.3NV r1 = r10.A02
            java.lang.String r0 = "liveVisibilityMode"
            r2 = 0
            if (r1 != 0) goto L_0x004f
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004f:
            X.3NV r0 = X.AnonymousClass3NV.A0A
            if (r1 != r0) goto L_0x0095
            X.0eM r0 = r10.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.AnonymousClass2o2.A00(r0)
            r1 = 2131969645(0x7f13466d, float:1.9576219E38)
            if (r0 == 0) goto L_0x0065
            r1 = 2131969646(0x7f13466e, float:1.957622E38)
        L_0x0065:
            android.content.Context r0 = r10.requireContext()
            java.lang.String r2 = r0.getString(r1)
        L_0x006d:
            r0 = 2131428899(0x7f0b0623, float:1.8479456E38)
            android.view.View r1 = X.JTT.A0E(r11, r0)
            r0 = 2131428897(0x7f0b0621, float:1.8479451E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            r1.setPrimaryActionText(r3)
            r0 = 1
            r1.setPrimaryButtonEnabled(r0)
            if (r2 == 0) goto L_0x0089
            r1.A05(r2, r0)
        L_0x0089:
            r10.A00 = r1
            r0 = 54
            X.LY5 r0 = X.LY5.A00(r10, r0)
            r1.setPrimaryActionOnClickListener(r0)
        L_0x0094:
            return
        L_0x0095:
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r1 == r0) goto L_0x009d
            X.3NV r0 = X.AnonymousClass3NV.A05
            if (r1 != r0) goto L_0x006d
        L_0x009d:
            r1 = 2131969644(0x7f13466c, float:1.9576217E38)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62260Kcu.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean onBackPressed() {
        2YL A0H = DbS.A0H(this.A0E);
        MGU.A02(A0H, C318116oQ.A00(A0H), 18);
        return true;
    }

    public C62260Kcu() {
        C66302MMl mMl = new C66302MMl(this, 39);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(this, 36), 0eO.A02, 37);
        this.A0E = DbS.A0I(new C66302MMl(A012, 38), mMl, C66304MMn.A01(A012, (Object) null, 47), DbS.A0z(C60220Jhd.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            M0Z m0z = this.A03;
            if (m0z != null) {
                m0z.A06 = true;
                M0Z.A04(m0z);
            }
            C59689JTv.A07(requireContext(), 2131969632);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a2, code lost:
        if (r3 == X.AnonymousClass3NV.A07) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bf, code lost:
        if (r4.A05(r3) != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = 797793653(0x2f8d5d75, float:2.5714156E-10)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r8 = r22
            r0 = r23
            X.C62260Kcu.super.onCreate(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "ARG_SOURCE_MEDIA_ID"
            java.lang.String r0 = r1.getString(r0)
            r8.A07 = r0
            java.lang.String r0 = "ARG_SOURCE_THREAD_ID"
            java.lang.String r0 = r1.getString(r0)
            r8.A09 = r0
            java.lang.String r0 = "ARG_LIVE_DURATION_MS"
            r1.getLong(r0)
            java.lang.String r0 = "ARG_LIVE_TITLE"
            java.lang.String r0 = r1.getString(r0)
            r8.A08 = r0
            java.lang.String r0 = "ARG_LIVE_CREATION_DATE"
            long r3 = r1.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8.A06 = r0
            java.lang.String r0 = "ARG_IS_MODERATED_SESSION"
            boolean r3 = r1.getBoolean(r0)
            r8.A0A = r3
            X.M0Z r0 = r8.A03
            if (r0 == 0) goto L_0x004c
            r0.A05 = r3
            X.M0Z.A04(r0)
        L_0x004c:
            java.lang.String r0 = "ARG_FUNDRAISER_INFO"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = (com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel) r0
            r8.A05 = r0
            java.lang.String r0 = "live_broadcast_ending"
            r8.setModuleNameV2(r0)
            java.lang.String r0 = "ARG_SOURCE_BROADCAST_ID"
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r0 = "ARG_DID_BROADCAST_TO_FACEBOOK"
            boolean r15 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_IS_POLICY_VIOLATION"
            boolean r16 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_IS_CONTNET_MONETIZATION_POLICY_VIOLATION"
            boolean r17 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_HAS_BRAND_PARTNERS"
            boolean r18 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_IS_SSI_CHECKPOINTED"
            boolean r19 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_IS_LIVE_BLOCKED"
            boolean r20 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_ARE_GLASSES_IN_USE"
            boolean r6 = r1.getBoolean(r0)
            java.lang.String r0 = "ARG_LIVE_VISIBILITY_MODE"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00da
            X.3NV r3 = X.C278154wM.A01(r0)
        L_0x0097:
            r8.A02 = r3
            java.lang.String r5 = "liveVisibilityMode"
            if (r16 != 0) goto L_0x00a4
            if (r20 != 0) goto L_0x00a4
            X.3NV r1 = X.AnonymousClass3NV.A07
            r0 = 1
            if (r3 != r1) goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            r8.A0B = r0
            X.0eM r1 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.monetization.repository.MonetizationRepository r4 = X.AnonymousClass2o3.A00(r0)
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            boolean r0 = r4.A07(r3)
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r4.A05(r3)
            r21 = 1
            if (r0 == 0) goto L_0x00c3
        L_0x00c1:
            r21 = 0
        L_0x00c3:
            android.content.Context r7 = r8.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r1)
            r0 = 0
            boolean r14 = r8.A0A
            X.3NV r10 = r8.A02
            if (r10 != 0) goto L_0x00dd
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00da:
            X.3NV r3 = X.AnonymousClass3NV.A08
            goto L_0x0097
        L_0x00dd:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            X.M0Z r6 = new X.M0Z
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.A03 = r6
            if (r13 == 0) goto L_0x010e
            X.0lg r0 = X.AnonymousClass7TF.A0L(r1, r0)
            r6 = 1
            r5 = 0
            X.1NY r4 = X.AnonymousClass7TG.A0b(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r13}
            java.lang.String r0 = "live/%s/get_final_viewer_list/"
            r4.A0K(r0, r3)
            java.lang.Class<X.7ax> r3 = X.C334247ax.class
            java.lang.Class<X.7ay> r0 = X.C334257ay.class
            X.1OC r3 = X.DbT.A0R(r5, r4, r3, r0, r6)
            r0 = 42
            X.C61500KAf.A00(r3, r8, r0)
            r8.schedule(r3)
        L_0x010e:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.1OC r1 = X.LTC.A01(r0)
            r0 = 41
            X.C61500KAf.A00(r1, r8, r0)
            r8.schedule(r1)
            r0 = 934447738(0x37b28a7a, float:2.1283737E-5)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62260Kcu.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(237250092);
        super.onResume();
        AnonymousClass0fD.A09(-668354338, A022);
    }
}
