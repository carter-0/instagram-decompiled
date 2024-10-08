package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public final class K6O extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "VoiceEffectsTabFragment";
    public int A00 = 2131953285;
    public ImageView A01;
    public ClipsCreationViewModel A02;
    public C60426JlJ A03;
    public AnonymousClass861 A04;
    public String A05;
    public final String A06 = "postcap_voice_effects_tab";
    public final AnonymousClass0eM A07 = DbS.A0I(new MMR(this, 48), new MMR(this, 45), C66291MMa.A00((Object) null, this, 31), DbS.A0z(AnonymousClass89Z.class));
    public final AnonymousClass0eM A08 = DbS.A0I(new MMR(this, 47), new MMR(this, 46), C66291MMa.A00((Object) null, this, 30), DbS.A0z(C3507185x.class));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        K6O.super.onAttach(context);
        Bundle requireArguments = requireArguments();
        this.A05 = requireArguments.getString("args_camera_session_id", "");
        this.A00 = requireArguments.getInt(AnonymousClass000.A00(2632), -1);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AnonymousClass89Z) this.A07.getValue()).A06(AnonymousClass05K.A0u);
        RecyclerView A0I = DbT.A0I(view, R.id.voice_effects_grid_recyclerview);
        JTR.A19(requireContext(), A0I);
        C60426JlJ jlJ = this.A03;
        if (jlJ == null) {
            str = "voiceEffectsGridAdapter";
        } else {
            A0I.setAdapter(jlJ);
            LY4.A01(view.requireViewById(R.id.vfx_done_button), 69, this);
            View A0b = AnonymousClass7TE.A0b(view, R.id.voice_effects_tab_description);
            Dba.A15(getViewLifecycleOwner(), DbT.A0G(((C3507185x) this.A08.getValue()).A01.A0k), new C66312MMv(48, A0b, this), 5);
            ImageView A0F = DbU.A0F(view, R.id.vfx_play_pause_button);
            this.A01 = A0F;
            if (A0F == null) {
                str = "buttonPlayPause";
            } else {
                LY4.A01(A0F, 70, this);
                AnonymousClass861 r0 = this.A04;
                if (r0 == null) {
                    str = "videoPlaybackViewModel";
                } else {
                    Dba.A15(getViewLifecycleOwner(), r0.A0A, MP5.A00(this, 47), 5);
                    return;
                }
            }
        }
        0qQ.A0F(str);
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

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
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
        AnonymousClass861 r0 = this.A04;
        if (r0 == null) {
            0qQ.A0F("videoPlaybackViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A03();
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A022 = AnonymousClass0fD.A02(1156550913);
        K6O.super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r1 = this.A09;
        this.A02 = JTS.A0E(this, requireActivity, AnonymousClass7TE.A0l(r1));
        C357588Yu[] values = C357588Yu.values();
        ClipsCreationViewModel clipsCreationViewModel = this.A02;
        if (clipsCreationViewModel == null) {
            str = "clipsCreationViewModel";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            0xG A0O = DbS.A0O(this.A06);
            String str2 = this.A05;
            if (str2 == null) {
                str = "cameraSessionId";
            } else {
                int i = this.A00;
                if (i == 2131953282) {
                    num = AnonymousClass05K.A00;
                } else if (i == 2131953283) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                this.A03 = new C60426JlJ(A0O, A0l, clipsCreationViewModel, num, str2, values);
                this.A04 = JTS.A0N(this).A00("post_capture");
                AnonymousClass0fD.A09(668090893, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2076522277);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_voice_effects_tab_fragment, false);
        AnonymousClass0fD.A09(-2028485866, A022);
        return A0D;
    }
}
