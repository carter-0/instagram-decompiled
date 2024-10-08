package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

public final class K6I extends AnonymousClass4DH implements AnonymousClass4DR, C3499982t, C273494mf, MU0, MVD {
    public static final String __redex_internal_original_name = "MusicBrowserFragment";
    public MusicProduct A00 = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
    public C252063oV A01;
    public C3516089n A02;
    public C3515989m A03;
    public JZ0 A04;
    public C231002qi A05;
    public C47018DpA A06;
    public Map A07;
    public C62642Kk4 A08;
    public C3515589i A09;
    public C371088xY A0A;
    public ImmutableList A0B;
    public ImmutableList A0C;
    public C64161LRc A0D;
    public C3514789a A0E;
    public MusicAttributionConfig A0F;
    public C234462xu A0G;
    public MusicOverlaySearchTab A0H;
    public AnonymousClass80X A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final String A0Q = "music_browser_fragment";
    public final AnonymousClass0eM A0R = DbS.A0I(MMS.A00(this, 31), MMS.A00(this, 30), MMW.A00((Object) null, this, 43), DbS.A0z(AnonymousClass89Z.class));
    public final AnonymousClass0eM A0S = C227642jf.A02(this);

    public final int B7t(C62487Kgc kgc) {
        int A022 = DbU.A02(kgc, 0);
        if (A022 == 1) {
            return R.id.music_search_clips_search_results_container;
        }
        if (A022 == 0) {
            return R.id.music_search_clips_landing_page_container;
        }
        if (A022 == 2) {
            return R.id.music_search_clips_saved_container;
        }
        throw AnonymousClass7TE.A0w("Unsupported MusicSearchMode");
    }

    public final void DSz() {
    }

    public final void DT0() {
    }

    public final void DT1() {
    }

    public final void DTF(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A0P = true;
        C3515989m r0 = this.A03;
        if (r0 != null) {
            r0.DSm(mWx, musicBrowseCategory, str, str2);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            r39 = this;
            r7 = 0
            r8 = r40
            X.0qQ.A0B(r8, r7)
            r9 = r39
            r0 = r41
            super.onViewCreated(r8, r0)
            X.0eM r6 = r9.A0S
            X.29H r10 = X.JTS.A0K(r6)
            X.89i r0 = r9.A09
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r5, r7)
            long r0 = r10.A02
            r3 = 17641988(0x10d3204, double:8.7163E-317)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x002c
            X.29E r3 = r10.A0E
            java.lang.String r2 = "music_browser_fragment_view_entry_point : "
            X.JTP.A1L(r3, r2, r5, r0)
        L_0x002c:
            X.0eM r0 = r9.A0R
            java.lang.Object r1 = r0.getValue()
            X.89Z r1 = (X.AnonymousClass89Z) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A06(r0)
            X.2YN r1 = X.DbW.A0F(r9)
            java.lang.Class<X.89a> r0 = X.C3514789a.class
            X.2YL r0 = r1.A00(r0)
            X.89a r0 = (X.C3514789a) r0
            r9.A0E = r0
            java.lang.String r17 = "musicBrowserViewModel"
            if (r0 == 0) goto L_0x006a
            X.2Fk r2 = r0.A03
            X.07Z r1 = r9.getViewLifecycleOwner()
            r0 = 20
            X.C64317LZr.A00(r1, r2, r9, r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r8)
            X.2xu r0 = X.JTR.A0p(r0, r6)
            r9.A0G = r0
            com.instagram.api.schemas.MusicProduct r0 = r9.A00
            r18 = r0
            com.google.common.collect.ImmutableList r12 = r9.A0C
            if (r12 != 0) goto L_0x0072
            java.lang.String r17 = "audioTrackTypesToExclude"
        L_0x006a:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            X.0hq r20 = r9.getChildFragmentManager()
            X.0qQ.A07(r20)
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r6)
            X.2xu r11 = r9.A0G
            java.lang.String r16 = "Required value was null."
            if (r11 == 0) goto L_0x0200
            X.80X r10 = r9.A0I
            if (r10 != 0) goto L_0x008a
            java.lang.String r17 = "captureState"
            goto L_0x006a
        L_0x008a:
            X.89i r15 = r9.A09
            com.google.common.collect.ImmutableList r14 = r9.A0B
            r27 = 0
            boolean r13 = r9.A0O
            java.lang.String r5 = r9.A0J
            boolean r4 = r9.A0M
            java.lang.String r3 = r9.A0K
            boolean r2 = r9.A0N
            java.util.Map r1 = r9.A07
            X.JZ0 r0 = new X.JZ0
            r28 = r11
            r29 = r9
            r30 = r9
            r31 = r10
            r32 = r5
            r33 = r3
            r34 = r1
            r35 = r7
            r36 = r13
            r37 = r4
            r38 = r2
            r22 = r12
            r23 = r14
            r24 = r18
            r26 = r9
            r18 = r0
            r19 = r8
            r21 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r9.A04 = r0
            java.lang.String r1 = r9.A0K
            if (r1 != 0) goto L_0x00d2
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r2 = r9.A0H
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0.A07(r2, r1)
        L_0x00d2:
            X.LRc r10 = r9.A0D
            if (r10 != 0) goto L_0x00d9
            java.lang.String r17 = "musicLogger"
            goto L_0x006a
        L_0x00d9:
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r5 = r9.A0Q
            android.os.Bundle r1 = r9.requireArguments()
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r26 = X.C320236s2.A01(r1, r0)
            com.instagram.api.schemas.MusicProduct r4 = r9.A00
            X.JZ0 r2 = r9.A04
            if (r2 == 0) goto L_0x01fb
            X.80X r0 = r2.A0Q
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x015c
            r0 = 3
            if (r1 == r0) goto L_0x015c
            r0 = 2
            if (r1 == r0) goto L_0x0152
            X.JVj r22 = X.C59725JVj.NO_CAMERA_SESSION
        L_0x0104:
            X.89i r3 = r9.A09
            java.lang.String r2 = r9.A0J
            X.8xY r1 = r9.A0A
            X.Kk4 r0 = r9.A08
            r18 = r10
            r19 = r0
            r20 = r3
            r21 = r1
            r23 = r4
            r25 = r5
            r27 = r2
            r18.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 2131438901(0x7f0b2d35, float:1.8499742E38)
            X.3oV r0 = X.DbV.A0T(r8, r0, r7)
            r9.A01 = r0
            com.instagram.api.schemas.MusicProduct r0 = r9.A00
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x014f
            r0 = 18
            if (r1 == r0) goto L_0x014c
            r0 = 9
            if (r1 == r0) goto L_0x014c
            r0 = 13
            if (r1 == r0) goto L_0x0149
            r0 = 14
            if (r1 != r0) goto L_0x0166
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A10
        L_0x0141:
            X.2qi r1 = r9.A05
            if (r1 != 0) goto L_0x015f
            java.lang.String r17 = "quickPromotionDelegate"
            goto L_0x006a
        L_0x0149:
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0z
            goto L_0x0141
        L_0x014c:
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1E
            goto L_0x0141
        L_0x014f:
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A15
            goto L_0x0141
        L_0x0152:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0159
            X.JVj r22 = X.C59725JVj.SHARE_SHEET
            goto L_0x0104
        L_0x0159:
            X.JVj r22 = X.C59725JVj.POST_CAPTURE
            goto L_0x0104
        L_0x015c:
            X.JVj r22 = X.C59725JVj.PRE_CAPTURE
            goto L_0x0104
        L_0x015f:
            java.util.Set r0 = X.JTP.A0y(r0)
            r1.AVg(r0)
        L_0x0166:
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x01e7
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.89a r0 = r9.A0E
            if (r0 == 0) goto L_0x006a
            X.L9t r4 = new X.L9t
            r4.<init>(r2, r8, r1, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A02
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            java.lang.Boolean r0 = r0.CcO()
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e8
            X.0eM r6 = r4.A05
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r6)
            r0 = 2131428145(0x7f0b0331, float:1.8477926E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 17
            X.C64273LXz.A00(r1, r0, r4)
            android.app.Activity r5 = r4.A00
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131973471(0x7f13555f, float:1.9583979E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131973465(0x7f135559, float:1.9583967E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r2)
            r0 = 32
            java.lang.String r0 = X.002.A0D(r3, r0)
            android.text.SpannableStringBuilder r2 = r1.append(r0)
            X.0qQ.A0A(r2)
            int r1 = X.DbV.A02(r5)
            X.Kaz r0 = new X.Kaz
            r0.<init>((X.C63864L9t) r4, (int) r1)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r6)
            r0 = 2131441211(0x7f0b363b, float:1.8504427E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            X.DbT.A1H(r0)
            r0.setText(r2)
        L_0x01e7:
            return
        L_0x01e8:
            X.0eM r0 = r4.A04
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r0)
            r0 = 2131435496(0x7f0b1fe8, float:1.8492836E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 16
            X.C64273LXz.A00(r1, r0, r4)
            return
        L_0x01fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0200:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6I.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0Q;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0S);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final boolean isScrolledToBottom() {
        JZ0 jz0 = this.A04;
        if (jz0 == null) {
            return true;
        }
        MU3 A012 = JZ0.A01(jz0);
        if (A012 instanceof MU3) {
            return A012.isScrolledToBottom();
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        JZ0 jz0 = this.A04;
        if (jz0 == null) {
            return true;
        }
        MU3 A012 = JZ0.A01(jz0);
        if (A012 instanceof MU3) {
            return A012.isScrolledToTop();
        }
        if (A012 instanceof C273494mf) {
            return ((C273494mf) A012).isScrolledToTop();
        }
        return true;
    }

    public final boolean onBackPressed() {
        JZ0 jz0 = this.A04;
        if (jz0 == null || !jz0.A0A()) {
            return false;
        }
        return true;
    }

    public final void onBottomSheetClosed() {
        C234462xu r0 = this.A0G;
        if (r0 != null) {
            r0.A00();
        }
        C3515989m r02 = this.A03;
        if (r02 != null) {
            r02.DSk();
        }
        C3514789a r03 = this.A0E;
        if (r03 != null) {
            r03.A01 = false;
        }
        MusicProduct musicProduct = this.A00;
        if (!(musicProduct == MusicProduct.MUSIC_IN_FEED || musicProduct == MusicProduct.MUSIC_NOTES) || !this.A0P) {
            JTS.A0K(this.A0S).A01();
        }
        if (!this.A0P) {
            C63141Ks9.A00(AnonymousClass7TE.A0l(this.A0S));
        }
        this.A0P = false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final String Aef(C62487Kgc kgc) {
        return AnonymousClass7TG.A0m(kgc, __redex_internal_original_name, C51975G9x.A0l(kgc));
    }

    public final String BUn() {
        String string = requireArguments().getString(AnonymousClass000.A00(172), "");
        0qQ.A07(string);
        return string;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3515989m r0 = this.A03;
        if (r0 != null) {
            r0.CI8(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1371870209(0xffffffffae3aebff, float:-4.250111E-11)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r8 = r13
            X.K6I.super.onCreate(r14)
            android.os.Bundle r3 = r13.requireArguments()
            android.content.Context r0 = r13.requireContext()
            android.content.res.Resources$Theme r4 = r0.getTheme()
            r1 = 2132017189(0x7f140025, float:1.967265E38)
            r0 = 1
            r4.applyStyle(r1, r0)
            java.lang.String r0 = "capture_state"
            java.io.Serializable r0 = r3.getSerializable(r0)
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x013c
            X.80X r0 = (X.AnonymousClass80X) r0
            r13.A0I = r0
            com.google.common.collect.ImmutableList$Builder r4 = new com.google.common.collect.ImmutableList$Builder
            r4.<init>()
            java.lang.Class<com.instagram.music.common.constants.AudioTrackType> r1 = com.instagram.music.common.constants.AudioTrackType.class
            java.lang.String r0 = "audio_track_type_to_exclude"
            java.util.ArrayList r0 = X.C320236s2.A02(r3, r1, r0)
            r4.addAll(r0)
            com.google.common.collect.ImmutableList r0 = r4.build()
            r13.A0C = r0
            java.lang.String r0 = "preload_music_attribution_config"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            com.instagram.music.common.config.MusicAttributionConfig r0 = (com.instagram.music.common.config.MusicAttributionConfig) r0
            r13.A0F = r0
            java.lang.String r0 = "music_product"
            java.io.Serializable r0 = r3.getSerializable(r0)
            if (r0 == 0) goto L_0x0134
            com.instagram.api.schemas.MusicProduct r0 = (com.instagram.api.schemas.MusicProduct) r0
            r13.A00 = r0
            java.lang.String r1 = "default_focused_tab"
            boolean r0 = r3.containsKey(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0131
            android.os.Parcelable r0 = r3.getParcelable(r1)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = (com.instagram.music.search.tabloader.MusicOverlaySearchTab) r0
        L_0x0067:
            r13.A0H = r0
            java.lang.String r0 = "music_browser_entry_point"
            java.io.Serializable r0 = r3.getSerializable(r0)
            X.89i r0 = (X.C3515589i) r0
            r13.A09 = r0
            java.lang.String r0 = "is_from_share_sheet"
            r1 = 0
            boolean r0 = r3.getBoolean(r0, r1)
            r13.A0M = r0
            java.lang.String r0 = "attached_tracks"
            java.io.Serializable r4 = r3.getSerializable(r0)
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableList
            if (r0 == 0) goto L_0x0089
            r5 = r4
            com.google.common.collect.ImmutableList r5 = (com.google.common.collect.ImmutableList) r5
        L_0x0089:
            r13.A0B = r5
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r3.getString(r0)
            r13.A0J = r0
            java.lang.String r0 = "args_pre_filled_search_term"
            java.lang.String r0 = r3.getString(r0)
            r13.A0K = r0
            java.lang.String r0 = "surface_element"
            java.io.Serializable r0 = r3.getSerializable(r0)
            X.8xY r0 = (X.C371088xY) r0
            r13.A0A = r0
            java.lang.String r0 = "audio_editor_entry_point"
            java.io.Serializable r0 = r3.getSerializable(r0)
            X.Kk4 r0 = (X.C62642Kk4) r0
            r13.A08 = r0
            java.lang.String r0 = "should_use_light_mode"
            boolean r0 = r3.getBoolean(r0, r1)
            r13.A0N = r0
            java.lang.String r0 = "visual_features"
            java.io.Serializable r0 = r3.getSerializable(r0)
            java.util.Map r0 = (java.util.Map) r0
            r13.A07 = r0
            java.lang.String r0 = "enable_share_from_spotify"
            boolean r0 = r3.getBoolean(r0, r1)
            r13.A0L = r0
            X.LRc r0 = new X.LRc
            r0.<init>()
            r13.A0D = r0
            X.0eM r6 = r13.A0S
            X.29H r3 = X.JTS.A0K(r6)
            X.89i r0 = r13.A09
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.0qQ.A0B(r5, r1)
            X.29E r1 = r3.A0E
            long r3 = r3.A02
            java.lang.String r0 = "music_browser_fragment_entry_point : "
            X.JTP.A1L(r1, r0, r5, r3)
            X.1YN r7 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.api.schemas.MusicProduct r0 = r13.A00
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x012e
            r0 = 18
            if (r1 == r0) goto L_0x012b
            r0 = 9
            if (r1 == r0) goto L_0x012b
            r0 = 13
            if (r1 == r0) goto L_0x0128
            r0 = 14
            if (r1 != r0) goto L_0x012e
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0i
        L_0x010b:
            X.AnonymousClass2bO.A00()
            r0 = 4
            X.Fha r1 = new X.Fha
            r1.<init>(r13, r0)
            X.LvZ r0 = X.LvZ.A00
            X.2bW r11 = X.2bV.A05(r1, r0)
            r9 = r13
            X.2qi r0 = r7.A01(r8, r9, r10, r11, r12)
            r13.A05 = r0
            r0 = 481717152(0x1cb66ba0, float:1.207157E-21)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0128:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0h
            goto L_0x010b
        L_0x012b:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A14
            goto L_0x010b
        L_0x012e:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0p
            goto L_0x010b
        L_0x0131:
            r0 = r5
            goto L_0x0067
        L_0x0134:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = -1197633182(0xffffffffb89d9162, float:-7.513423E-5)
            goto L_0x0143
        L_0x013c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = 1157379353(0x44fc3519, float:2017.6593)
        L_0x0143:
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6I.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1955952072);
        0qQ.A0B(layoutInflater, 0);
        if (this.A0N) {
            layoutInflater = JTS.A09(requireContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.layout_music_search_clips, viewGroup, false);
        AnonymousClass0fD.A09(-1878148938, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1756930753);
        super.onDestroyView();
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            jz0.A09(AnonymousClass05K.A00);
        }
        this.A0P = false;
        AnonymousClass0fD.A09(-1188385792, A022);
    }

    public final void onPause() {
        C3502083s r0;
        int A022 = AnonymousClass0fD.A02(-1871290341);
        K6I.super.onPause();
        C3516089n r02 = this.A02;
        if (!(r02 == null || (r0 = r02.A00.A0F) == null)) {
            r0.EvX();
        }
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            this.A0O = AnonymousClass7TF.A1W(JZ0.A03(jz0), C62487Kgc.SEARCH);
            AnonymousClass0fD.A09(-1504892426, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1394772335, A022);
        throw A0y;
    }

    public final void onResume() {
        C3502083s r0;
        int A022 = AnonymousClass0fD.A02(-1699302314);
        super.onResume();
        C3516089n r02 = this.A02;
        if (!(r02 == null || (r0 = r02.A00.A0F) == null)) {
            r0.EuL();
        }
        AnonymousClass0fD.A09(-2005814424, A022);
    }
}
