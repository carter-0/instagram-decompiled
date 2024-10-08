package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

public final class K6x extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C268594df, C273494mf {
    public static final String __redex_internal_original_name = "ClipsMusicMiniEditorFragment";
    public C3516289p A00;
    public AudioOverlayTrack A01;
    public C357918a4 A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final int A05 = -2;
    public final boolean A06 = true;

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "clips_music_mini_editor";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r4 = this.A04;
        AnonymousClass85s r13 = new AnonymousClass85s(requireContext, AnonymousClass7TE.A0l(r4), this, JTR.A0p(requireContext(), r4), new C65506LuU(this, 1));
        C65500LuO luO = new C65500LuO(this, 0);
        C357918a4 r42 = new C357918a4(JTR.A0X(view2, R.id.clips_music_editor_stub), new AnonymousClass9I6(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 3, 1, false), this, AnonymousClass7TE.A0l(r4), (TargetViewSizeProvider) null, luO, C3515689j.GALLERY, 0, false, false, false, true, false, false);
        this.A02 = r42;
        r42.A0b = r13;
        if (this.A03) {
            AudioOverlayTrack audioOverlayTrack = this.A01;
            if (audioOverlayTrack != null) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    r42.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            0qQ.A0F("currentAudioOverlayTrack");
            throw AnonymousClass00P.createAndThrow();
        }
        AudioOverlayTrack audioOverlayTrack2 = this.A01;
        if (audioOverlayTrack2 != null) {
            MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
            if (musicAssetModel2 != null) {
                r42.A0L(musicAssetModel2, false);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        0qQ.A0F("currentAudioOverlayTrack");
        throw AnonymousClass00P.createAndThrow();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        DbT.A1B(DbV.A05(this), layoutParams, R.dimen.album_preview_view_width);
        view2.setLayoutParams(layoutParams);
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int AqL() {
        return this.A05;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
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
        return DbS.A0T(this.A04);
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

    public final boolean isScrolledToTop() {
        return this.A06;
    }

    public final boolean onBackPressed() {
        C357918a4 r0 = this.A02;
        if (r0 != null) {
            return r0.A0M();
        }
        JTT.A0x();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetClosed() {
        C357918a4 r0 = this.A02;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0G();
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        AudioOverlayTrack audioOverlayTrack;
        int A022 = AnonymousClass0fD.A02(1939575303);
        K6x.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_existing_track");
        } else {
            z = false;
        }
        this.A03 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (audioOverlayTrack = (AudioOverlayTrack) bundle3.getParcelable("selected_audio_track")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(823140698, A022);
            throw A0y;
        }
        this.A01 = audioOverlayTrack;
        AnonymousClass0fD.A09(386308483, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1118940333);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_clips_music_editor, false);
        AnonymousClass0fD.A09(1348974704, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1638953267);
        K6x.super.onPause();
        C357918a4 r0 = this.A02;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0I();
        AnonymousClass0fD.A09(1051460641, A022);
    }
}
