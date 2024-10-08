package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

public final class NJI extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectBroadcastChatRepliesWithMultiReactDiscoveryBottomsheetFragment";
    public Capabilities A00;
    public C313756gx A01;
    public C74310Psm A02;
    public DirectThreadKey A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "broadcast_channel_replies_discovery_bottomsheet";
    }

    public final boolean onBackPressed() {
        this.A05 = true;
        DbX.A1I(this);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        if (X.0qQ.A0K(r11.A08, X.AnonymousClass6BI.A0D) == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r100, android.os.Bundle r101) {
        /*
            r99 = this;
            r2 = 0
            r4 = r100
            X.0qQ.A0B(r4, r2)
            r0 = r99
            r1 = r101
            super.onViewCreated(r4, r1)
            X.0eM r1 = r0.A06
            r98 = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r98)
            X.2Dm r8 = X.1bJ.A00(r1)
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r1 = "DirectFragment.ENTRY_POINT"
            java.lang.String r1 = r3.getString(r1)
            r0.A04 = r1
            android.os.Bundle r5 = r0.requireArguments()
            java.lang.Class<com.instagram.model.direct.DirectThreadKey> r3 = com.instagram.model.direct.DirectThreadKey.class
            java.lang.String r1 = "channel_thread_key"
            android.os.Parcelable r1 = X.C320236s2.A00(r5, r3, r1)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            X.0qQ.A0B(r1, r2)
            r0.A03 = r1
            X.3U9 r10 = r8.B33(r1)
            java.lang.String r6 = "Required value was null."
            if (r10 == 0) goto L_0x0375
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r5 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            if (r3 < r1) goto L_0x0059
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.Class<com.instagram.direct.capabilities.Capabilities> r1 = com.instagram.direct.capabilities.Capabilities.class
            java.lang.Object r1 = r3.getParcelable(r5, r1)
            if (r1 != 0) goto L_0x0063
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0059:
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.Class<com.instagram.direct.capabilities.Capabilities> r1 = com.instagram.direct.capabilities.Capabilities.class
            android.os.Parcelable r1 = X.C320236s2.A00(r3, r1, r5)
        L_0x0063:
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.0qQ.A0B(r1, r2)
            r0.A00 = r1
            X.9HD r5 = X.AnonymousClass9HC.A1b
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r98)
            com.instagram.direct.capabilities.Capabilities r1 = r0.A00
            if (r1 == 0) goto L_0x031d
            X.9HC r12 = r5.A00(r3, r1)
            android.content.Context r7 = r0.requireContext()
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            com.instagram.direct.model.DirectThreadThemeInfo r3 = r10.C5v()
            r5 = 0
            X.7Kt r1 = X.C329927Kt.A00
            X.7L2 r11 = r1.A01(r7, r12, r3, r6)
            android.content.Context r1 = r0.requireContext()
            boolean r1 = X.AnonymousClass3HA.A00(r1)
            r9 = 1
            if (r1 != 0) goto L_0x009f
            com.instagram.direct.model.DirectThreadThemeInfo r3 = r11.A08
            com.instagram.direct.model.DirectThreadThemeInfo r1 = X.AnonymousClass6BI.A0D
            boolean r1 = X.0qQ.A0K(r3, r1)
            r6 = 0
            if (r1 != 0) goto L_0x00a0
        L_0x009f:
            r6 = 1
        L_0x00a0:
            r1 = 2131431795(0x7f0b1173, float:1.848533E38)
            android.view.ViewStub r3 = X.JTR.A0X(r4, r1)
            r1 = 2131625131(0x7f0e04ab, float:1.8877461E38)
            android.view.View r3 = X.JTP.A0H(r3, r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r1 = r0.requireContext()
            X.C66580MXl.A1F(r3, r1)
            r1 = 3
            r3.setMaxLines(r1)
            if (r6 == 0) goto L_0x00d5
            android.content.res.Resources r7 = X.DbV.A05(r0)
            r6 = 2131165218(0x7f070022, float:1.7944647E38)
            float r6 = r7.getDimension(r6)
            r3.setElevation(r6)
            android.view.ViewOutlineProvider r6 = android.view.ViewOutlineProvider.PADDED_BOUNDS
            r3.setOutlineProvider(r6)
        L_0x00d5:
            r6 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.view.View r7 = r4.requireViewById(r6)
            r6 = 16
            X.C71405Ok4.A01(r7, r6, r10, r0)
            r6 = 2131440852(0x7f0b34d4, float:1.85037E38)
            android.view.View r7 = r4.requireViewById(r6)
            r6 = 17
            X.C71405Ok4.A01(r7, r6, r10, r0)
            com.instagram.model.direct.DirectThreadKey r6 = r0.A03
            if (r6 == 0) goto L_0x031a
            java.util.ArrayList r14 = r8.Aax(r6, r9)
            int r8 = r14.size()
            int r8 = r8 - r9
        L_0x00fa:
            r6 = -1
            if (r6 >= r8) goto L_0x02f2
            java.lang.Object r13 = r14.get(r8)
            X.3su r13 = (X.C254703su) r13
            X.2FW r7 = r13.A10
            X.2FW r6 = X.2FW.A1g
            if (r7 != r6) goto L_0x02ee
            java.lang.String r7 = r13.A1u
            java.lang.String r6 = X.DbU.A0u(r98)
            boolean r6 = X.0qQ.A0K(r7, r6)
            if (r6 == 0) goto L_0x02ee
            r6 = 62
            java.lang.String r7 = r13.A1q
            if (r7 != 0) goto L_0x011d
            java.lang.String r7 = ""
        L_0x011d:
            com.google.common.collect.ImmutableList r8 = r13.A0J()
            com.instagram.direct.model.comments.DirectMessageComments r13 = r13.A0q
            if (r13 == 0) goto L_0x0127
            int r6 = r13.A00
        L_0x0127:
            if (r8 == 0) goto L_0x012f
            boolean r13 = r8.isEmpty()
            if (r13 == 0) goto L_0x0148
        L_0x012f:
            java.lang.String r13 = "❤️️"
            r8 = 24510(0x5fbe, float:3.4346E-41)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r15 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r15.<init>(r13, r8, r2)
            java.lang.String r14 = "🔥️"
            r13 = 51
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r8 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r8.<init>(r14, r13, r2)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r15, r8)
            X.0qQ.A07(r8)
        L_0x0148:
            X.2FW r76 = X.2FW.A1g
            X.Pid r13 = X.C73716Pid.A00
            X.0t0 r91 = X.AnonymousClass0eN.A01(r13)
            X.7FE r87 = new X.7FE
            r88 = r12
            r89 = r11
            r90 = r76
            r92 = r2
            r93 = r2
            r94 = r2
            r95 = r2
            r96 = r2
            r97 = r2
            r87.<init>(r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)
            java.lang.String r13 = "fakeMessageId"
            com.instagram.model.direct.messageid.MessageIdentifier r77 = X.C66580MXl.A0i(r13, r5)
            long r80 = java.lang.System.currentTimeMillis()
            java.lang.String r16 = ""
            X.7FR r13 = new X.7FR
            r15 = r5
            r17 = r16
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r45 = r2
            r46 = r2
            r47 = r2
            r48 = r2
            r49 = r2
            r50 = r2
            r51 = r2
            r52 = r2
            r53 = r2
            r54 = r2
            r55 = r2
            r56 = r2
            r57 = r2
            r58 = r2
            r59 = r2
            r60 = r2
            r61 = r2
            r62 = r2
            r63 = r2
            r64 = r2
            r65 = r2
            r66 = r2
            r67 = r2
            r68 = r2
            r69 = r2
            r70 = r2
            r71 = r2
            r72 = r2
            r73 = r2
            r74 = r2
            r75 = r2
            r14 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            X.7Bo r75 = X.C327627Bo.NUX_TYPE_NONE
            X.7FT r72 = new X.7FT
            r73 = r5
            r74 = r13
            r78 = r5
            r79 = r5
            r82 = r2
            r83 = r2
            r84 = r2
            r85 = r9
            r86 = r2
            r72.<init>(r73, r74, r75, r76, r77, r78, r79, r80, r82, r83, r84, r85, r86)
            X.5FV r14 = X.AnonymousClass5FV.None
            X.79c r9 = new X.79c
            r13 = r9
            r15 = r72
            r16 = r87
            r17 = r7
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            android.graphics.drawable.Drawable r7 = X.C328037De.A00()
            X.C3271479o.A00(r7, r3, r5, r9)
            java.lang.String r3 = "broadcast_channel_replies_discovery"
            X.0xG r9 = X.DbS.A0O(r3)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r98)
            X.7D4 r3 = new X.7D4
            r3.<init>(r9, r7, r5, r12)
            X.7Dz r4 = r3.A00(r4)
            android.content.Context r3 = r0.requireContext()
            X.7Kx r7 = r11.A04
            java.lang.String r9 = "fake id"
            if (r6 <= 0) goto L_0x02eb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.content.res.Resources r3 = X.AnonymousClass7TF.A0A(r3)
            java.lang.String r6 = X.C253673rC.A03(r3, r6)
            X.7E9 r3 = new X.7E9
            r3.<init>(r7, r5, r9, r6)
        L_0x0254:
            android.content.Context r11 = r0.requireContext()
            int r6 = r8.size()
            if (r6 == 0) goto L_0x02e8
            if (r6 <= r1) goto L_0x02e8
            r9 = 2131959224(0x7f131db8, float:1.9555082E38)
            int r6 = r6 - r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r21 = X.DbY.A0c(r11, r6, r9)
            X.7E6 r17 = new X.7E6
            r18 = r7
            r19 = r5
            r20 = r5
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x0277:
            long r23 = java.lang.System.currentTimeMillis()
            int r6 = r8.size()
            if (r6 == 0) goto L_0x02e5
            if (r6 > r1) goto L_0x02e5
            X.7E8 r16 = new X.7E8
            r18 = r16
            r19 = r7
            r20 = r76
            r21 = r5
            r22 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r25)
        L_0x0294:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = X.C66581MXm.A10(r8, r1)
        L_0x029c:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0320
            java.lang.Object r9 = r14.next()
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r9 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r9
            com.instagram.common.session.UserSession r71 = X.AnonymousClass7TE.A0l(r98)
            java.lang.String r13 = r9.A01
            int r1 = r9.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            android.content.res.Resources r1 = X.JTR.A0R(r0)
            java.lang.String r79 = X.C253673rC.A03(r1, r11)
            int r9 = r9.A00
            java.lang.String r81 = X.DbU.A0u(r98)
            long r83 = java.lang.System.currentTimeMillis()
            X.7E5 r1 = new X.7E5
            r72 = r5
            r74 = r5
            r75 = r7
            r77 = r5
            r78 = r13
            r80 = r5
            r82 = r9
            r85 = r2
            r87 = r2
            r70 = r1
            r73 = r12
            r70.<init>(r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r85, r86, r87)
            r6.add(r1)
            goto L_0x029c
        L_0x02e5:
            r16 = 0
            goto L_0x0294
        L_0x02e8:
            r17 = 0
            goto L_0x0277
        L_0x02eb:
            r3 = 0
            goto L_0x0254
        L_0x02ee:
            int r8 = r8 + -1
            goto L_0x00fa
        L_0x02f2:
            android.content.Context r7 = r0.requireContext()
            r6 = 2131958695(0x7f131ba7, float:1.955401E38)
            java.lang.String r7 = r7.getString(r6)
            java.lang.String r8 = "❤️️"
            r6 = 24510(0x5fbe, float:3.4346E-41)
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r14 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r14.<init>(r8, r6, r2)
            java.lang.String r13 = "🔥️"
            r8 = 51
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r6 = new com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction
            r6.<init>(r13, r8, r2)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r14, r6)
            X.0qQ.A07(r8)
            r6 = 62
            goto L_0x0148
        L_0x031a:
            java.lang.String r0 = "directThreadKey"
            goto L_0x0355
        L_0x031d:
            java.lang.String r0 = "capabilities"
            goto L_0x0355
        L_0x0320:
            int r24 = r8.size()
            java.util.HashSet r22 = X.AnonymousClass7TE.A1F()
            X.7A9 r1 = new X.7A9
            r13 = r1
            r14 = r12
            r15 = r7
            r18 = r3
            r19 = r5
            r20 = r5
            r21 = r5
            r23 = r6
            r25 = r2
            r26 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A01(r1)
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            X.Fq5 r3 = new X.Fq5
            r3.<init>(r4)
            r1 = 950(0x3b6, double:4.694E-321)
            r6.postDelayed(r3, r1)
            X.6gx r2 = r0.A01
            if (r2 != 0) goto L_0x035d
            java.lang.String r0 = "logger"
        L_0x0355:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x035d:
            X.3S9 r0 = r10.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0369
            int r0 = r0.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0369:
            java.lang.String r1 = r10.C6C()
            java.lang.String r0 = r10.C6k()
            r2.A0Q(r1, r5, r0)
            return
        L_0x0375:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(boolean z) {
        if (!0qQ.A0K(this.A04, "direct_broadcast_channel_conversation_starters")) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A06);
            DirectThreadKey directThreadKey = this.A03;
            if (directThreadKey != null) {
                C371178xk.A00(A0l, directThreadKey, z);
            } else {
                0qQ.A0F("directThreadKey");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-88959792);
        NJI.super.onCreate(bundle);
        this.A01 = C66583MXo.A0P(this.A06);
        AnonymousClass0fD.A09(-1413868207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-918566643);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.broadcast_channel_replies_with_multi_react_discovery_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(1109935181, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-141114017);
        if (this.A05) {
            A00(false);
            AnonymousClass4k9.A00(AnonymousClass7TE.A0l(this.A06)).A07(false);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(2140228066, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-208889066);
        A00(true);
        NJI.super.onPause();
        AnonymousClass0fD.A09(-938340319, A022);
    }
}
