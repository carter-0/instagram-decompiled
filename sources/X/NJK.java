package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.DirectThreadKey;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

public final class NJK extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectBroadcastChatRepliesDiscoveryBottomsheetFragment";
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009c, code lost:
        if (X.0qQ.A0K(r6.A08, X.AnonymousClass6BI.A0D) == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r110, android.os.Bundle r111) {
        /*
            r109 = this;
            r5 = 0
            r2 = r110
            X.0qQ.A0B(r2, r5)
            r0 = r109
            r1 = r111
            super.onViewCreated(r2, r1)
            X.0eM r11 = r0.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r11)
            X.2Dm r7 = X.1bJ.A00(r1)
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r1 = "DirectFragment.ENTRY_POINT"
            java.lang.String r1 = r3.getString(r1)
            r0.A04 = r1
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.Class<com.instagram.model.direct.DirectThreadKey> r3 = com.instagram.model.direct.DirectThreadKey.class
            java.lang.String r1 = "channel_thread_key"
            android.os.Parcelable r1 = X.C320236s2.A00(r4, r3, r1)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            X.0qQ.A0B(r1, r5)
            r0.A03 = r1
            X.3U9 r3 = r7.B33(r1)
            java.lang.String r8 = "Required value was null."
            if (r3 == 0) goto L_0x02f4
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r6 = "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES"
            if (r4 < r1) goto L_0x0057
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.Class<com.instagram.direct.capabilities.Capabilities> r1 = com.instagram.direct.capabilities.Capabilities.class
            java.lang.Object r1 = r4.getParcelable(r6, r1)
            if (r1 != 0) goto L_0x0061
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0057:
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.Class<com.instagram.direct.capabilities.Capabilities> r1 = com.instagram.direct.capabilities.Capabilities.class
            android.os.Parcelable r1 = X.C320236s2.A00(r4, r1, r6)
        L_0x0061:
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.0qQ.A0B(r1, r5)
            r0.A00 = r1
            X.9HD r6 = X.AnonymousClass9HC.A1b
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r11)
            com.instagram.direct.capabilities.Capabilities r1 = r0.A00
            if (r1 == 0) goto L_0x02a6
            X.9HC r10 = r6.A00(r4, r1)
            android.content.Context r8 = r0.requireContext()
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            com.instagram.direct.model.DirectThreadThemeInfo r4 = r3.C5v()
            r14 = 0
            X.7Kt r1 = X.C329927Kt.A00
            X.7L2 r6 = r1.A01(r8, r10, r4, r6)
            android.content.Context r1 = r0.requireContext()
            boolean r1 = X.AnonymousClass3HA.A00(r1)
            r9 = 1
            if (r1 != 0) goto L_0x009e
            com.instagram.direct.model.DirectThreadThemeInfo r4 = r6.A08
            com.instagram.direct.model.DirectThreadThemeInfo r1 = X.AnonymousClass6BI.A0D
            boolean r1 = X.0qQ.A0K(r4, r1)
            r97 = 0
            if (r1 != 0) goto L_0x00a0
        L_0x009e:
            r97 = 1
        L_0x00a0:
            r1 = 2131431795(0x7f0b1173, float:1.848533E38)
            android.view.ViewStub r4 = X.JTR.A0X(r2, r1)
            r1 = 2131625131(0x7f0e04ab, float:1.8877461E38)
            android.view.View r1 = X.JTP.A0H(r4, r1)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r0.requireContext()
            X.C66580MXl.A1F(r1, r4)
            r4 = 3
            r1.setMaxLines(r4)
            if (r97 == 0) goto L_0x00d5
            android.content.res.Resources r8 = X.DbV.A05(r0)
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            float r4 = r8.getDimension(r4)
            r1.setElevation(r4)
            android.view.ViewOutlineProvider r4 = android.view.ViewOutlineProvider.PADDED_BOUNDS
            r1.setOutlineProvider(r4)
        L_0x00d5:
            r4 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.view.View r8 = r2.requireViewById(r4)
            r4 = 14
            X.C71405Ok4.A01(r8, r4, r3, r0)
            r4 = 2131440852(0x7f0b34d4, float:1.85037E38)
            android.view.View r8 = r2.requireViewById(r4)
            r4 = 15
            X.C71405Ok4.A01(r8, r4, r3, r0)
            com.instagram.model.direct.DirectThreadKey r4 = r0.A03
            if (r4 == 0) goto L_0x02a3
            java.util.ArrayList r12 = r7.Aax(r4, r9)
            int r7 = r12.size()
            int r7 = r7 - r9
        L_0x00fa:
            r4 = -1
            if (r4 >= r7) goto L_0x0290
            java.lang.Object r8 = r12.get(r7)
            X.3su r8 = (X.C254703su) r8
            X.2FW r13 = r8.A10
            X.2FW r4 = X.2FW.A1g
            if (r13 != r4) goto L_0x028c
            java.lang.String r13 = r8.A1u
            java.lang.String r4 = X.DbU.A0u(r11)
            boolean r4 = X.0qQ.A0K(r13, r4)
            if (r4 == 0) goto L_0x028c
            r7 = 62
            java.lang.String r4 = r8.A1q
            if (r4 != 0) goto L_0x011d
            java.lang.String r4 = ""
        L_0x011d:
            com.google.common.collect.ImmutableList r87 = r8.A0J()
            com.instagram.direct.model.comments.DirectMessageComments r8 = r8.A0q
            if (r8 == 0) goto L_0x0127
            int r7 = r8.A00
        L_0x0127:
            if (r87 == 0) goto L_0x012f
            boolean r8 = r87.isEmpty()
            if (r8 == 0) goto L_0x0133
        L_0x012f:
            com.google.common.collect.ImmutableList r87 = A00()
        L_0x0133:
            X.2FW r76 = X.2FW.A1g
            X.Pic r8 = X.C73715Pic.A00
            X.0t0 r102 = X.AnonymousClass0eN.A01(r8)
            X.7FE r98 = new X.7FE
            r99 = r10
            r100 = r6
            r101 = r76
            r103 = r5
            r104 = r5
            r105 = r5
            r106 = r5
            r107 = r5
            r108 = r5
            r98.<init>(r99, r100, r101, r102, r103, r104, r105, r106, r107, r108)
            java.lang.String r8 = "fakeMessageId"
            com.instagram.model.direct.messageid.MessageIdentifier r77 = X.C66580MXl.A0i(r8, r14)
            long r80 = java.lang.System.currentTimeMillis()
            java.lang.String r16 = ""
            X.7FR r13 = new X.7FR
            r15 = r14
            r17 = r16
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r5
            r36 = r5
            r37 = r5
            r38 = r5
            r39 = r5
            r40 = r5
            r41 = r5
            r42 = r5
            r43 = r5
            r44 = r5
            r45 = r5
            r46 = r5
            r47 = r5
            r48 = r5
            r49 = r5
            r50 = r5
            r51 = r5
            r52 = r5
            r53 = r5
            r54 = r5
            r55 = r5
            r56 = r5
            r57 = r5
            r58 = r5
            r59 = r5
            r60 = r5
            r61 = r5
            r62 = r5
            r63 = r5
            r64 = r5
            r65 = r5
            r66 = r5
            r67 = r5
            r68 = r5
            r69 = r5
            r70 = r5
            r71 = r5
            r72 = r5
            r73 = r5
            r74 = r5
            r75 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            X.7Bo r75 = X.C327627Bo.NUX_TYPE_NONE
            X.7FT r72 = new X.7FT
            r73 = r14
            r74 = r13
            r78 = r14
            r79 = r14
            r82 = r5
            r83 = r5
            r84 = r5
            r85 = r9
            r86 = r5
            r72.<init>(r73, r74, r75, r76, r77, r78, r79, r80, r82, r83, r84, r85, r86)
            X.5FV r16 = X.AnonymousClass5FV.None
            X.79c r8 = new X.79c
            r15 = r8
            r17 = r72
            r18 = r98
            r19 = r4
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.graphics.drawable.Drawable r4 = X.C328037De.A00()
            X.C3271479o.A00(r4, r1, r14, r8)
            r1 = 2131431719(0x7f0b1127, float:1.8485175E38)
            X.2eb r8 = X.DbY.A0T(r2, r1)
            java.lang.String r1 = "broadcast_channel_replies_discovery"
            X.0xG r1 = X.DbS.A0O(r1)
            X.Nbf r4 = new X.Nbf
            r4.<init>(r8)
            com.instagram.common.session.UserSession r88 = X.AnonymousClass7TE.A0l(r11)
            android.content.res.Resources r86 = X.JTR.A0R(r0)
            java.lang.String r94 = X.DbU.A0u(r11)
            X.7Kx r6 = r6.A04
            r89 = r10
            r90 = r6
            r91 = r76
            r92 = r14
            r93 = r14
            r95 = r5
            r96 = r5
            r98 = r5
            r99 = r5
            X.79G r5 = X.C66850Mdj.A02(r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99)
            r4.A03(r1, r5)
            r1 = 2131431557(0x7f0b1085, float:1.8484847E38)
            X.2eb r1 = X.DbY.A0T(r2, r1)
            X.7EG r5 = new X.7EG
            r5.<init>(r1, r14)
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r11)
            X.7AA r1 = new X.7AA
            r15 = r1
            r17 = r10
            r18 = r6
            r19 = r14
            r21 = r14
            r22 = r7
            r23 = r9
            r24 = r97
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.A00(r1)
            android.os.Handler r7 = X.AnonymousClass7TF.A0D()
            X.Fq4 r6 = new X.Fq4
            r6.<init>(r5)
            r1 = 950(0x3b6, double:4.694E-321)
            r7.postDelayed(r6, r1)
            X.6gx r6 = r0.A01
            if (r6 != 0) goto L_0x02a9
            java.lang.String r0 = "logger"
        L_0x0284:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x028c:
            int r7 = r7 + -1
            goto L_0x00fa
        L_0x0290:
            android.content.Context r7 = r0.requireContext()
            r4 = 2131958695(0x7f131ba7, float:1.955401E38)
            java.lang.String r4 = r7.getString(r4)
            com.google.common.collect.ImmutableList r87 = A00()
            r7 = 62
            goto L_0x0133
        L_0x02a3:
            java.lang.String r0 = "directThreadKey"
            goto L_0x0284
        L_0x02a6:
            java.lang.String r0 = "capabilities"
            goto L_0x0284
        L_0x02a9:
            X.3S9 r1 = r3.A01
            X.3Te r1 = r1.A0s
            if (r1 == 0) goto L_0x02b5
            int r1 = r1.A00
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
        L_0x02b5:
            java.lang.String r2 = r3.C6C()
            java.lang.String r1 = r3.C6k()
            r6.A0Q(r2, r14, r1)
            if (r97 == 0) goto L_0x02f3
            android.view.View r2 = r4.BJd()
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r1 = r1.getDimension(r3)
            r2.setElevation(r1)
            android.view.View r1 = r4.BJd()
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.PADDED_BOUNDS
            r1.setOutlineProvider(r2)
            android.view.View r1 = r5.BJd()
            android.content.res.Resources r0 = X.DbV.A05(r0)
            float r0 = r0.getDimension(r3)
            r1.setElevation(r0)
            android.view.View r0 = r5.BJd()
            r0.setOutlineProvider(r2)
        L_0x02f3:
            return
        L_0x02f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJK.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImmutableList A00() {
        ImmutableList of = ImmutableList.of(new DirectCountBasedReaction("❤️️", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, false), new DirectCountBasedReaction("🖤", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false), new DirectCountBasedReaction("🔥️", 51, false));
        0qQ.A07(of);
        return of;
    }

    private final void A01(boolean z) {
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
        int A022 = AnonymousClass0fD.A02(323111409);
        NJK.super.onCreate(bundle);
        this.A01 = C66583MXo.A0P(this.A06);
        AnonymousClass0fD.A09(1410713157, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(121627357);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.broadcast_channel_replies_discovery_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(-1993245969, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-358675746);
        if (this.A05) {
            A01(false);
            AnonymousClass4k9.A00(AnonymousClass7TE.A0l(this.A06)).A07(false);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-876327496, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-145310033);
        A01(true);
        NJK.super.onPause();
        AnonymousClass0fD.A09(-1414519983, A022);
    }
}
