package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

public final class K7J extends AnonymousClass4DH implements C268594df, C273494mf, C66495MTy {
    public static final String __redex_internal_original_name = "WallMusicTrackEditorFragment";
    public C55540HjM A00;
    public C357918a4 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58704IwD(this, 37));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C58704IwD(this, 38));

    public final int AqL() {
        return -2;
    }

    public final int C8P() {
        return 0;
    }

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
        return __redex_internal_original_name;
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        2dY.A01(new LY3((Object) this, 19), DbX.A0I(requireView(), R.id.music_editor_action_bar_container)).A0X(new C64464LcR(this, 9));
        AnonymousClass0eM r1 = this.A03;
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) r1.getValue();
        this.A04.getValue();
        MusicAssetModel musicAssetModel = ((AudioOverlayTrack) r1.getValue()).A08;
        if (musicAssetModel != null) {
            int i = musicAssetModel.A00;
            int i2 = 30000;
            if (30000 > i) {
                i2 = i;
            }
            audioOverlayTrack.A02 = i2;
            Context requireContext = requireContext();
            AnonymousClass0eM r3 = this.A02;
            AnonymousClass85s r15 = new AnonymousClass85s(requireContext, AnonymousClass7TE.A0l(r3), (AnonymousClass4DU) null, JTR.A0p(requireContext(), r3), new C65506LuU(this, 7));
            C357918a4 r6 = new C357918a4((ViewStub) AnonymousClass7TF.A0G(view2, R.id.music_editor_stub), new AnonymousClass9I6(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), this, AnonymousClass7TE.A0l(r3), (TargetViewSizeProvider) null, new C65500LuO(this, 5), C3515689j.UNKNOWN, 0, false, false, false, true, false, false);
            this.A01 = r6;
            r6.A0b = r15;
            MusicAssetModel musicAssetModel2 = ((AudioOverlayTrack) r1.getValue()).A08;
            if (musicAssetModel2 != null) {
                r6.A0L(musicAssetModel2, false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A00(AudioOverlayTrack audioOverlayTrack, K7J k7j) {
        String str;
        C357918a4 r0 = k7j.A01;
        AudioOverlayTrack audioOverlayTrack2 = null;
        if (r0 == null) {
            str = "musicOverlayEditController";
        } else {
            r0.A0G();
            C55540HjM hjM = k7j.A00;
            if (hjM == null) {
                str = "delegate";
            } else {
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel != null) {
                        audioOverlayTrack2 = new AudioOverlayTrack(musicAssetModel, audioOverlayTrack.A03, audioOverlayTrack.A02);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                hjM.A00.invoke(audioOverlayTrack2);
                DbT.A1J(k7j);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void DT9() {
        C357918a4 r0 = this.A01;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0H();
        }
    }

    public final void DTA() {
        C357918a4 r0 = this.A01;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0G();
        }
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
        return DbS.A0T(this.A02);
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

    public final void onBottomSheetClosed() {
        C357918a4 r0 = this.A01;
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-224582252);
        0qQ.A0B(layoutInflater, 0);
        if (!AnonymousClass1GD.A03()) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.fragment_profile_music_editor, false);
        AnonymousClass0fD.A09(1806223958, A022);
        return A0A;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1434744202);
        K7J.super.onPause();
        C357918a4 r0 = this.A01;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0I();
        AnonymousClass0fD.A09(-857461027, A022);
    }
}
