package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9i6  reason: invalid class name and case insensitive filesystem */
public final class C384919i6 extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "ClipsMusicEditorFragment";
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public C3515589i A03;
    public MusicProduct A04 = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
    public C3516289p A05;
    public AnonymousClass8IJ A06;
    public ClipsCreationViewModel A07;
    public MusicAssetModel A08;
    public MusicOverlayStickerModel A09;
    public C357918a4 A0A;
    public C3506785t A0B;
    public AnonymousClass6KJ A0C = AnonymousClass6KJ.HIDDEN;
    public AnonymousClass80X A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public View A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public final AnonymousClass0eM A0O = new C227862kA(new MMR(this, 12), new MMR(this, 11), new C66291MMa(20, (Object) null, this), new 0Yh(AnonymousClass89Z.class));
    public final AnonymousClass0eM A0P = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(2805);
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0191, code lost:
        if (r4 != X.C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x020f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r1 = 0
            r5 = r24
            X.0qQ.A0B(r5, r1)
            r11 = r23
            r0 = r25
            super.onViewCreated(r5, r0)
            android.content.Context r9 = r11.getContext()
            if (r9 == 0) goto L_0x0304
            androidx.fragment.app.FragmentActivity r3 = r11.requireActivity()
            X.0eM r0 = r11.A0O
            java.lang.Object r2 = r0.getValue()
            X.89Z r2 = (X.AnonymousClass89Z) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A06(r0)
            X.0eM r4 = r11.A0P
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.82v r0 = new X.82v
            r0.<init>(r2, r3)
            X.2YN r2 = new X.2YN
            r2.<init>(r0, r3)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r0 = r2.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r11.A07 = r0
            r0 = 2131955512(0x7f130f38, float:1.9547554E38)
            java.lang.String r0 = r9.getString(r0)
            r11.A0E = r0
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            X.2YN r2 = new X.2YN
            r2.<init>(r0)
            java.lang.Class<X.89b> r0 = X.C3514889b.class
            X.2YL r7 = r2.A00(r0)
            X.89b r7 = (X.C3514889b) r7
            android.os.Bundle r0 = r11.requireArguments()
            java.lang.String r2 = "args_should_sync_video_and_music"
            boolean r2 = r0.getBoolean(r2)
            r11.A0N = r2
            java.lang.String r2 = "args_capture_state"
            java.io.Serializable r3 = r0.getSerializable(r2)
            r2 = 335(0x14f, float:4.7E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            X.80X r3 = (X.AnonymousClass80X) r3
            r11.A0D = r3
            java.lang.String r2 = "args_is_album_art_enabled"
            boolean r2 = r0.getBoolean(r2)
            r11.A0L = r2
            java.lang.String r2 = "ARGS_CAMERA_MUSIC_BROWSER_ENTRY_POINT"
            java.io.Serializable r3 = r0.getSerializable(r2)
            boolean r2 = r3 instanceof X.C3515589i
            r6 = 0
            if (r2 == 0) goto L_0x00db
            X.89i r3 = (X.C3515589i) r3
        L_0x008c:
            r11.A03 = r3
            java.lang.String r2 = "ARGS_CURRENTLY_ATTACHED_TRACKS_COUNT"
            int r2 = r0.getInt(r2)
            r11.A00 = r2
            java.lang.String r2 = "ARGS_HAS_MIX_ATTACHED"
            boolean r2 = r0.getBoolean(r2)
            r11.A0G = r2
            X.85r r3 = r7.A00
            boolean r2 = r11.A0N
            if (r2 == 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            X.85t r8 = r3.A02()
        L_0x00aa:
            r11.A0B = r8
            if (r8 == 0) goto L_0x00b5
            X.89p r2 = r11.A05
            if (r2 == 0) goto L_0x00b5
            r2.DTB(r8)
        L_0x00b5:
            X.80X r3 = r11.A0D
            if (r3 != 0) goto L_0x00dd
            java.lang.String r0 = "captureState"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c3:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.2xu r12 = new X.2xu
            r12.<init>(r9, r2)
            X.LuU r13 = new X.LuU
            r13.<init>(r11, r1)
            X.85s r8 = new X.85s
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00aa
        L_0x00db:
            r3 = r6
            goto L_0x008c
        L_0x00dd:
            X.80X r2 = X.AnonymousClass80X.POST_CAPTURE
            if (r3 != r2) goto L_0x0231
            X.0lg r8 = X.AnonymousClass7TF.A0L(r4, r1)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36320382349091196(0x8109320006217c, double:3.0324942757815595E-306)
            boolean r2 = X.182.A06(r7, r8, r2)
            if (r2 == 0) goto L_0x0231
            X.85t r2 = r11.A0B
            if (r2 == 0) goto L_0x00f9
            r2.Cot()
        L_0x00f9:
            java.lang.String r2 = "args_music_asset"
            android.os.Parcelable r2 = r0.getParcelable(r2)
            com.instagram.music.common.model.MusicAssetModel r2 = (com.instagram.music.common.model.MusicAssetModel) r2
            r11.A08 = r2
            java.lang.String r2 = "ARGS_TARGET_VIEW_SIZE_PROVIDER"
            android.os.Parcelable r13 = r0.getParcelable(r2)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r13 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r13
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r4)
            r2 = 2131430136(0x7f0b0af8, float:1.8481964E38)
            android.view.View r9 = X.AnonymousClass7TE.A0b(r5, r2)
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            boolean r2 = r11.A0L
            r17 = 6
            r5 = 1
            X.9I6 r10 = new X.9I6
            r14 = r10
            r15 = r1
            r16 = r1
            r18 = r5
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            X.AeL r14 = new X.AeL
            r14.<init>(r11)
            com.instagram.music.common.model.MusicAssetModel r2 = r11.A08
            r18 = 0
            if (r2 == 0) goto L_0x022e
            boolean r3 = r2.A0Q
        L_0x0137:
            boolean r2 = A01(r11)
            if (r2 == 0) goto L_0x020f
            if (r3 == 0) goto L_0x014b
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.AnonymousClass8IK.A02(r2)
        L_0x0147:
            if (r2 == 0) goto L_0x014b
            r18 = 1
        L_0x014b:
            boolean r2 = r11.A0G
            r19 = 0
            if (r2 != 0) goto L_0x017b
            X.89i r3 = r11.A03
            X.89i r2 = X.C3515589i.POST_CAPTURE_AUDIO_BUTTON
            if (r3 != r2) goto L_0x017b
            int r2 = r11.A00
            if (r2 <= 0) goto L_0x017b
            r19 = 1
            if (r2 != r5) goto L_0x017b
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r7, r1)
            boolean r2 = X.AnonymousClass8IK.A07(r7)
            if (r2 == 0) goto L_0x0179
            X.0Tu r4 = X.0Tu.A05
            r2 = 36321395961570633(0x810a1e00092549, double:3.0331352883950453E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 != 0) goto L_0x017b
        L_0x0179:
            r19 = 0
        L_0x017b:
            int r2 = r11.A00
            boolean r3 = A01(r11)
            r20 = r3 ^ 1
            X.89i r4 = r11.A03
            X.89i r3 = X.C3515589i.TIMELINE_AUDIO_GHOST_TRACK
            if (r4 == r3) goto L_0x0193
            X.89i r3 = X.C3515589i.TIMELINE_AUDIO_REPLACE
            if (r4 == r3) goto L_0x0193
            X.89i r3 = X.C3515589i.TIMELINE_TOOLBAR_AUDIO_OPTION
            r21 = 0
            if (r4 != r3) goto L_0x0195
        L_0x0193:
            r21 = 1
        L_0x0195:
            X.89j r15 = X.C3515689j.UNKNOWN
            X.8a4 r8 = new X.8a4
            r22 = r1
            r17 = r5
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11.A0A = r8
            X.85t r2 = r11.A0B
            r8.A0b = r2
            java.lang.String r2 = "args_should_support_edit_controls"
            boolean r2 = r0.getBoolean(r2)
            r11.A0J = r2
            java.lang.String r2 = "args_is_existing_track"
            boolean r2 = r0.getBoolean(r2, r1)
            r11.A0H = r2
            java.lang.String r2 = "args_music_sticker_color"
            r4 = -1
            int r2 = r0.getInt(r2, r4)
            r11.A01 = r2
            r2 = 324(0x144, float:4.54E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.io.Serializable r3 = r0.getSerializable(r2)
            r2 = 718(0x2ce, float:1.006E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            com.instagram.api.schemas.MusicProduct r3 = (com.instagram.api.schemas.MusicProduct) r3
            r11.A04 = r3
            java.lang.String r2 = "args_should_remove_audio_track_on_back"
            boolean r2 = r0.getBoolean(r2, r1)
            r11.A0I = r2
            java.lang.String r2 = "args_music_sticker_type"
            int r3 = r0.getInt(r2, r4)
            if (r3 < 0) goto L_0x020c
            X.6KJ[] r2 = X.AnonymousClass6KJ.values()
            r2 = r2[r3]
        L_0x01ee:
            r11.A0C = r2
            java.lang.String r2 = "args_existing_start_time_in_ms"
            int r2 = r0.getInt(r2, r1)
            r11.A02 = r2
            com.instagram.music.common.model.MusicAssetModel r4 = r11.A08
            if (r4 == 0) goto L_0x0254
            com.instagram.api.schemas.MusicProduct r3 = r11.A04
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r11.A07
            if (r2 != 0) goto L_0x0240
            java.lang.String r0 = "clipsCreationViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020c:
            X.6KJ r2 = X.AnonymousClass6KJ.HIDDEN
            goto L_0x01ee
        L_0x020f:
            if (r3 == 0) goto L_0x014b
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.AnonymousClass8IK.A02(r2)
            if (r2 == 0) goto L_0x014b
            java.lang.Object r8 = r4.getValue()
            X.0lg r8 = (X.0lg) r8
            X.0Tu r7 = X.0Tu.A05
            r2 = 36320382348763514(0x8109320001217a, double:3.032494275574332E-306)
            boolean r2 = X.182.A06(r7, r8, r2)
            goto L_0x0147
        L_0x022e:
            r3 = 0
            goto L_0x0137
        L_0x0231:
            X.85t r3 = r11.A0B
            if (r3 == 0) goto L_0x00f9
            java.lang.String r2 = "ARGS_PRESET_PLAYBACK_VOLUME"
            float r2 = r0.getFloat(r2)
            r3.Eqq(r2)
            goto L_0x00f9
        L_0x0240:
            X.83H r2 = r2.A0L
            X.82t r2 = r2.A01
            if (r2 == 0) goto L_0x024c
            java.lang.String r2 = r2.BUn()
            if (r2 != 0) goto L_0x024e
        L_0x024c:
            java.lang.String r2 = ""
        L_0x024e:
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.C59670JTa.A04(r3, r4, r6, r2)
            r11.A09 = r2
        L_0x0254:
            int r8 = r11.A01
            java.lang.String r7 = "Required value was null."
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r2) goto L_0x028b
            X.6KJ r4 = r11.A0C
            X.6KJ r2 = X.AnonymousClass6KJ.HIDDEN
            if (r4 == r2) goto L_0x028b
            X.8a4 r3 = r11.A0A
            if (r3 == 0) goto L_0x0282
            com.instagram.music.common.model.MusicAssetModel r12 = r11.A08
            if (r12 == 0) goto L_0x02f5
            int r2 = r11.A02
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r13 = r3
            r14 = r4
            r17 = r1
            r18 = r5
            r19 = r5
            r20 = r1
            X.C357918a4.A03(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0282:
            java.lang.String r1 = "ARGS_PRE_SELECTED_AUDIO_FILTER"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0304
            goto L_0x02ab
        L_0x028b:
            boolean r1 = r11.A0H
            X.8a4 r4 = r11.A0A
            if (r1 == 0) goto L_0x029f
            if (r4 == 0) goto L_0x0282
            com.instagram.music.common.model.MusicAssetModel r3 = r11.A08
            if (r3 == 0) goto L_0x02fa
            int r2 = r11.A02
            boolean r1 = r3.A0O
            r4.A0K(r3, r2, r1)
            goto L_0x0282
        L_0x029f:
            if (r4 == 0) goto L_0x0282
            com.instagram.music.common.model.MusicAssetModel r2 = r11.A08
            if (r2 == 0) goto L_0x02ff
            boolean r1 = r2.A0O
            r4.A0L(r2, r1)
            goto L_0x0282
        L_0x02ab:
            X.8IJ r4 = X.AnonymousClass8IJ.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0304 }
            if (r4 == 0) goto L_0x0304
            X.8a4 r3 = r11.A0A
            if (r3 == 0) goto L_0x0304
            X.8II r2 = X.C357918a4.A00(r3)
            if (r2 == 0) goto L_0x02cc
            com.instagram.music.common.model.MusicAssetModel r1 = r3.A0P
            if (r1 == 0) goto L_0x02f0
            com.instagram.music.common.model.TrackSnippet r0 = r3.A0Q
            if (r0 == 0) goto L_0x02eb
            int r0 = r0.A01
            r2.A07 = r1
            r2.A01 = r0
            X.AnonymousClass8II.A01(r2, r4)
        L_0x02cc:
            X.8II r7 = X.C357918a4.A00(r3)
            if (r7 == 0) goto L_0x02e6
            X.4DH r0 = r3.A0u
            android.content.Context r8 = r0.requireContext()
            r1 = 18
            X.GaB r0 = new X.GaB
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            r9 = r6
            r10 = r6
            r11 = r4
            r12 = r0
            r7.A0G(r8, r9, r10, r11, r12)
        L_0x02e6:
            r3.A0L = r4
            r3.A0M = r4
            return
        L_0x02eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x02f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x02f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x02fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x02ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384919i6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final boolean A01(C384919i6 r1) {
        AnonymousClass80X r12 = r1.A0D;
        if (r12 != null) {
            return AnonymousClass7TF.A1W(r12, AnonymousClass80X.POST_CAPTURE);
        }
        0qQ.A0F("captureState");
        throw AnonymousClass00P.createAndThrow();
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0P.getValue();
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

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final boolean onBackPressed() {
        if (this.A0I) {
            AnonymousClass0eM r0 = this.A0O;
            ((AnonymousClass89Z) r0.getValue()).A05(((AnonymousClass89Z) r0.getValue()).A01(), "pill_back", true);
        }
        C357918a4 r02 = this.A0A;
        if (r02 != null) {
            return r02.A0M();
        }
        return false;
    }

    public final void onBottomSheetClosed() {
        C3506785t r0;
        C3516289p r1 = this.A05;
        if (r1 != null) {
            r1.DSs(this.A0F);
        }
        if (!this.A0F) {
            if (this.A07 == null) {
                0qQ.A0F("clipsCreationViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (this.A08 != null) {
            C394779yg.A00(AnonymousClass7TE.A0l(this.A0P)).A01(C390939s5.SELECTED_AUDIO_FOR_REEL);
        }
        if (this.A06 != null) {
            AnonymousClass0eM r12 = this.A0P;
            if (AnonymousClass8IK.A04(AnonymousClass7TE.A0l(r12)) && !AnonymousClass8IK.A0A(AnonymousClass7TE.A0l(r12)) && (r0 = this.A0B) != null) {
                r0.FIf();
            }
        }
        this.A0F = false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final boolean A00(C384919i6 r2) {
        MusicAssetModel musicAssetModel;
        if (!A01(r2) || (musicAssetModel = r2.A08) == null || !musicAssetModel.A0O || !C394269xo.A00(AnonymousClass7TE.A0l(r2.A0P))) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1356341730);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_clips_music_editor, viewGroup, false);
        this.A0K = inflate;
        if (inflate == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-2008298671, A022);
        return inflate;
    }

    public final void onPause() {
        AnonymousClass8II A002;
        int A022 = AnonymousClass0fD.A02(-1608900045);
        C384919i6.super.onPause();
        if (this.A0B instanceof AnonymousClass85s) {
            C3516289p r0 = this.A05;
            if (r0 != null) {
                r0.D3y();
            }
            C3506785t r02 = this.A0B;
            if (r02 != null) {
                r02.onPause();
            }
        }
        C357918a4 r03 = this.A0A;
        if (!(r03 == null || (A002 = C357918a4.A00(r03)) == null)) {
            A002.A0C = true;
        }
        AnonymousClass0fD.A09(2022757937, A022);
    }

    public final void onResume() {
        AnonymousClass8II A002;
        int A022 = AnonymousClass0fD.A02(-250935704);
        super.onResume();
        if (this.A0B instanceof AnonymousClass85s) {
            if (!this.A0M) {
                27p.A01(AnonymousClass7TE.A0l(this.A0P)).A03.A02();
            }
            C3516289p r0 = this.A05;
            if (r0 != null) {
                r0.D3z();
            }
            C3506785t r02 = this.A0B;
            if (r02 != null) {
                r02.onResume();
            }
        }
        C357918a4 r03 = this.A0A;
        if (!(r03 == null || (A002 = C357918a4.A00(r03)) == null)) {
            A002.A0C = false;
        }
        this.A0M = false;
        AnonymousClass0fD.A09(251856680, A022);
    }
}
