package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.ArrayList;
import java.util.Iterator;

public final class K6R extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "ClipsSFXEditorFragment";
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public RecyclerView A04;
    public ShimmerFrameLayout A05;
    public C60399Jks A06;
    public L6M A07;
    public SfxSeekBarView A08;
    public AnonymousClass861 A09;
    public C3507185x A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = MMR.A00(this, 26);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "clips_sound_effects_editor";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AnonymousClass89Z) this.A0D.getValue()).A06(AnonymousClass05K.A0j);
        AnonymousClass0eM r7 = this.A0F;
        C60290Jin jin = (C60290Jin) r7.getValue();
        LR9.A00(jin.A00).autoResume();
        C60290Jin.A00(jin, new C61800KMo(AnonymousClass05K.A01));
        L6M l6m = new L6M();
        this.A07 = l6m;
        l6m.A01 = this;
        View requireViewById = view.requireViewById(R.id.clips_sfx_done_button);
        0qQ.A0A(requireViewById);
        A00(requireViewById, MP5.A00(this, 38));
        ImageView A0F2 = DbU.A0F(view, R.id.clips_sfx_play_pause_button);
        this.A00 = A0F2;
        if (A0F2 == null) {
            str = "buttonPlayPause";
        } else {
            A00(A0F2, MP5.A00(this, 39));
            ImageView A0F3 = DbU.A0F(view, R.id.clips_sfx_button_undo);
            this.A01 = A0F3;
            str = "buttonUndo";
            if (A0F3 != null) {
                A0F3.setEnabled(false);
                ImageView imageView = this.A01;
                if (imageView != null) {
                    A00(imageView, MP5.A00(this, 40));
                    this.A03 = DbU.A0G(view, R.id.clips_sfx_video_start_time_label);
                    this.A02 = DbU.A0G(view, R.id.clips_sfx_video_end_time_label);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.requireViewById(R.id.shimmer_layout);
                    this.A05 = shimmerFrameLayout;
                    if (shimmerFrameLayout == null) {
                        str = "shimmerEffectLayout";
                    } else {
                        shimmerFrameLayout.A02();
                        this.A04 = DbT.A0I(view, R.id.clips_sfx_recycler_view);
                        C60399Jks jks = new C60399Jks(requireContext(), this, this, 0sn.A00);
                        this.A06 = jks;
                        RecyclerView recyclerView = this.A04;
                        if (recyclerView == null) {
                            str = "effectsGrid";
                        } else {
                            recyclerView.setAdapter(jks);
                            recyclerView.A11(new C361648gZ(28, false));
                            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 0, false));
                            this.A08 = (SfxSeekBarView) view.requireViewById(R.id.clips_sfx_seek_bar_view);
                            2YL A0H = DbS.A0H(r7);
                            AnonymousClass7TF.A1K(A0H, C318116oQ.A00(A0H), 44);
                            C60290Jin jin2 = (C60290Jin) r7.getValue();
                            C3507185x r0 = this.A0A;
                            if (r0 == null) {
                                str = "clipsAudioVolumeViewModel";
                            } else {
                                if (JTR.A03(r0.A01.A0g) <= 0.0f) {
                                    C60290Jin.A00(jin2, C61804KMs.A00);
                                }
                                AnonymousClass861 r02 = this.A09;
                                if (r02 != null) {
                                    Dba.A15(getViewLifecycleOwner(), r02.A0A, MP5.A00(this, 36), 3);
                                    AnonymousClass861 r03 = this.A09;
                                    if (r03 != null) {
                                        Dba.A15(getViewLifecycleOwner(), r03.A0G, MP5.A00(this, 37), 3);
                                        DbZ.A1C(this, MGV.A01(this, (AnonymousClass4D7) null, 36), ((C60290Jin) r7.getValue()).A06);
                                        DbZ.A1C(this, MGV.A01(this, (AnonymousClass4D7) null, 37), ((C60290Jin) r7.getValue()).A05);
                                        return;
                                    }
                                }
                                0qQ.A0F("videoPlaybackViewModel");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
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
        C51971G9r.A0g(this.A0E).A1Q(C59725JVj.POST_CAPTURE, "SOUND_EFFECTS_SOUNDBOARD_DONE");
        C60290Jin jin = (C60290Jin) this.A0F.getValue();
        ClipsAudioStore clipsAudioStore = jin.A02;
        01W r0 = jin.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            int A0B2 = C51970G9q.A0B(A1A);
            C61079JwH jwH = (C61079JwH) A1A.A01;
            A0r.add(new C381669c8((C381809cM) jwH.A00, jwH.A02, 1.0f, (long) A0B2));
        }
        clipsAudioStore.A09.A02.Epw(A0r);
        AnonymousClass861 r02 = this.A09;
        if (r02 == null) {
            0qQ.A0F("videoPlaybackViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        r02.A01();
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K6R() {
        MMR mmr = new MMR(this, 28);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMR(new MMR(this, 30), 31));
        this.A0F = DbS.A0I(new MMR(A002, 32), mmr, C66291MMa.A00((Object) null, A002, 26), DbS.A0z(C60290Jin.class));
        this.A0D = DbS.A0I(new MMR(this, 29), new MMR(this, 27), C66291MMa.A00((Object) null, this, 25), DbS.A0z(AnonymousClass89Z.class));
        this.A0B = MMR.A00(this, 25);
        this.A0E = C227642jf.A02(this);
    }

    public static final void A00(View view, 0sP r3) {
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A04 = new NQy(r3, 0);
        A0m.A02 = 0.9f;
        A0m.A00();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(442660082);
        K6R.super.onCreate(bundle);
        setModuleNameV2("clips_sound_effects_editor");
        this.A09 = DbW.A0F(this).A00(new AnonymousClass860().getClass()).A00("post_capture");
        this.A0A = JTO.A0L(JTS.A0M(this, this.A0E), requireActivity()).A00(C3507185x.class);
        AnonymousClass0fD.A09(1971071336, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-725284413);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_post_capture_sound_effects_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-905093120, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-841645775);
        super.onDestroyView();
        if (this.A07 == null) {
            0qQ.A0F("playlistSelectorPopupMenu");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass0fD.A09(325575307, A022);
        }
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1966938949);
        K6R.super.onPause();
        ((C60290Jin) this.A0F.getValue()).A00.A01();
        AnonymousClass0fD.A09(319792274, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1009745507);
        super.onResume();
        ((C60290Jin) this.A0F.getValue()).A01();
        AnonymousClass0fD.A09(1375612176, A022);
    }
}
