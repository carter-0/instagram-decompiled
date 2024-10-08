package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

public final class K73 extends AnonymousClass4DH implements AnonymousClass4DU, C268594df, C273494mf, C66495MTy {
    public static final String __redex_internal_original_name = "MusicOnProfileMusicEditorFragment";
    public AudioOverlayTrack A00;
    public C357918a4 A01;
    public Context A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = DbS.A0I(MMS.A00(this, 25), MMS.A00(this, 24), MMW.A00((Object) null, this, 41), DbS.A0z(C322296vZ.class));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "music_on_profile_music_editor_sheet";
    public final boolean A07 = true;

    public final int AqL() {
        return -2;
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

    public final boolean isOrganicEligible() {
        return false;
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
        2dY.A01(new C64273LXz(this, 2), DbX.A0I(requireView(), R.id.music_editor_action_bar_container)).A0X(new C64464LcR(this, 6));
        AudioOverlayTrack audioOverlayTrack = this.A00;
        if (audioOverlayTrack != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                int i = musicAssetModel.A00;
                int i2 = 30000;
                if (30000 > i) {
                    i2 = i;
                }
                audioOverlayTrack.A02 = i2;
                Context context = this.A02;
                if (context != null) {
                    AnonymousClass0eM r1 = this.A05;
                    UserSession A0l = AnonymousClass7TE.A0l(r1);
                    Context context2 = this.A02;
                    if (context2 != null) {
                        AnonymousClass85s r16 = new AnonymousClass85s(context, A0l, (AnonymousClass4DU) null, JTR.A0p(context2, r1), new C65506LuU(this, 6));
                        UserSession A0l2 = AnonymousClass7TE.A0l(r1);
                        C357918a4 r10 = new C357918a4((ViewStub) AnonymousClass7TF.A0G(view2, R.id.music_editor_stub), new AnonymousClass9I6(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), this, A0l2, (TargetViewSizeProvider) null, new C65500LuO(this, 4), C3515689j.UNKNOWN, 0, false, false, false, true, false, false);
                        this.A01 = r10;
                        r10.A0b = r16;
                        if (this.A03) {
                            AudioOverlayTrack audioOverlayTrack2 = this.A00;
                            if (audioOverlayTrack2 != null) {
                                MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
                                if (musicAssetModel2 != null) {
                                    r10.A0K(musicAssetModel2, audioOverlayTrack2.A03, false);
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            AudioOverlayTrack audioOverlayTrack3 = this.A00;
                            if (audioOverlayTrack3 != null) {
                                MusicAssetModel musicAssetModel3 = audioOverlayTrack3.A08;
                                if (musicAssetModel3 != null) {
                                    r10.A0L(musicAssetModel3, false);
                                    return;
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                }
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        0qQ.A0F("currentAudioOverlayTrack");
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

    public final int C8P() {
        return 0;
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

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
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
        return this.A07;
    }

    public final void onBottomSheetClosed() {
        C357918a4 r0 = this.A01;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0G();
        C63141Ks9.A00(AnonymousClass7TE.A0l(this.A05));
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
        int A022 = AnonymousClass0fD.A02(-267003067);
        K73.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireContext();
        this.A03 = requireArguments.getBoolean("is_existing_track");
        this.A00 = (AudioOverlayTrack) C320236s2.A00(requireArguments, AudioOverlayTrack.class, "selected_audio_track");
        AnonymousClass0fD.A09(1145919330, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1637810603);
        0qQ.A0B(layoutInflater, 0);
        if (!AnonymousClass1GD.A03()) {
            Context context = this.A02;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            layoutInflater = JTS.A09(context, layoutInflater);
        }
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.fragment_profile_music_editor, false);
        AnonymousClass0fD.A09(412887394, A022);
        return A0A;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-882691741);
        K73.super.onPause();
        C357918a4 r0 = this.A01;
        if (r0 == null) {
            JTT.A0x();
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0I();
        AnonymousClass0fD.A09(1891218031, A022);
    }
}
