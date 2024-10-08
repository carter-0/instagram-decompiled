package com.instagram.creation.capture.quickcapture.sundial;

import X.0eP;
import X.27p;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass4DH;
import X.AnonymousClass6KJ;
import X.AnonymousClass80U;
import X.AnonymousClass80V;
import X.AnonymousClass861;
import X.AnonymousClass88W;
import X.AnonymousClass89Y;
import X.AnonymousClass89Z;
import X.AnonymousClass8IJ;
import X.AnonymousClass8IK;
import X.AnonymousClass8d1;
import X.C19140WMw;
import X.C227242it;
import X.C252243on;
import X.C314446iH;
import X.C3499982t;
import X.C3506485o;
import X.C3506685r;
import X.C3507185x;
import X.C3514789a;
import X.C3514889b;
import X.C3515289f;
import X.C3515589i;
import X.C3515789k;
import X.C59725JVj;
import X.C71662eb;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

public final class ClipsAudioMixingDrawerController implements C252243on, C227242it, AnonymousClass89Y {
    public float A00;
    public FrameLayout A01;
    public C314446iH A02;
    public C19140WMw A03;
    public C19140WMw A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C3515789k A0B;
    public C3515289f A0C;
    public final Context A0D;
    public final AnonymousClass4DH A0E;
    public final UserSession A0F;
    public final TargetViewSizeProvider A0G;
    public final C3506485o A0H;
    public final C3514789a A0I;
    public final C3507185x A0J;
    public final ClipsCreationViewModel A0K;
    public final AnonymousClass0eM A0L;
    public final C3506685r A0M;
    public final C3514889b A0N;
    public final AnonymousClass861 A0O;
    public C71662eb audioMixingDrawerContainerViewStubHolder;
    public C3499982t musicBrowseSessionProvider;
    public View postCaptureVideoContainer;
    public AnonymousClass80U quickCaptureState;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClipsAudioMixingDrawerController(android.view.View r25, X.AnonymousClass4DH r26, com.instagram.common.session.UserSession r27, X.C71662eb r28, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r29, X.C3506485o r30, X.C3506685r r31, X.AnonymousClass80U r32, X.C3499982t r33) {
        /*
            r24 = this;
            r0 = 1
            r7 = r27
            X.0qQ.A0B(r7, r0)
            r0 = 5
            r2 = r31
            X.0qQ.A0B(r2, r0)
            r0 = 6
            r6 = r26
            X.0qQ.A0B(r6, r0)
            r0 = r24
            r0.<init>()
            r0.A0F = r7
            r1 = r32
            r0.quickCaptureState = r1
            r1 = r28
            r0.audioMixingDrawerContainerViewStubHolder = r1
            r1 = r25
            r0.postCaptureVideoContainer = r1
            r0.A0M = r2
            r0.A0E = r6
            r1 = r33
            r0.musicBrowseSessionProvider = r1
            r1 = r30
            r0.A0H = r1
            r1 = r29
            r0.A0G = r1
            android.content.Context r1 = r6.getContext()
            r0.A0D = r1
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.2YN r3 = new X.2YN
            r3.<init>(r1)
            java.lang.Class<X.860> r1 = X.AnonymousClass860.class
            X.2YL r3 = r3.A00(r1)
            X.860 r3 = (X.AnonymousClass860) r3
            java.lang.String r1 = "post_capture"
            X.861 r4 = r3.A00(r1)
            r0.A0O = r4
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.85w r1 = new X.85w
            r1.<init>(r7, r3)
            X.2YN r3 = new X.2YN
            r3.<init>(r1, r5)
            java.lang.Class<X.85x> r1 = X.C3507185x.class
            X.2YL r1 = r3.A00(r1)
            X.85x r1 = (X.C3507185x) r1
            r0.A0J = r1
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.82v r1 = new X.82v
            r1.<init>(r7, r3)
            X.2YN r3 = new X.2YN
            r3.<init>(r1, r5)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r1 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r1 = r3.A00(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r1
            r0.A0K = r1
            r1 = 19
            X.9LJ r8 = new X.9LJ
            r8.<init>(r0, r1)
            java.lang.Class<X.89Z> r1 = X.AnonymousClass89Z.class
            X.0Yh r7 = new X.0Yh
            r7.<init>(r1)
            r1 = 20
            X.9LJ r5 = new X.9LJ
            r5.<init>(r6, r1)
            r12 = 0
            r1 = 16
            X.9Lu r3 = new X.9Lu
            r3.<init>(r1, r12, r6)
            X.2kA r1 = new X.2kA
            r1.<init>(r5, r8, r3, r7)
            r0.A0L = r1
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.2YN r3 = new X.2YN
            r3.<init>(r1)
            java.lang.Class<X.89a> r1 = X.C3514789a.class
            X.2YL r1 = r3.A00(r1)
            X.89a r1 = (X.C3514789a) r1
            r0.A0I = r1
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.2YN r3 = new X.2YN
            r3.<init>(r1)
            java.lang.Class<X.89b> r1 = X.C3514889b.class
            X.2YL r1 = r3.A00(r1)
            X.89b r1 = (X.C3514889b) r1
            r0.A0N = r1
            X.2Fj r5 = r4.A0A
            r3 = 24
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.89d r3 = new X.89d
            r3.<init>(r4)
            r5.A06(r6, r3)
            X.89e r14 = new X.89e
            r14.<init>(r0)
            r0.A0C = r14
            X.4DH r8 = r0.A0E
            android.content.Context r4 = r8.requireContext()
            com.instagram.common.session.UserSession r9 = r0.A0F
            X.80X r17 = X.AnonymousClass80X.POST_CAPTURE
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r6)
            X.89g r13 = new X.89g
            r13.<init>(r0)
            boolean r21 = A02(r0)
            X.85o r11 = r0.A0H
            X.89i r5 = X.C3515589i.TIMELINE_AUDIO_GHOST_TRACK
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r10 = r0.A0G
            r19 = 1
            r20 = 0
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            X.89j r16 = X.C3515689j.UNKNOWN
            X.89k r3 = new X.89k
            r15 = r12
            r18 = r12
            r22 = r20
            r23 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A0B = r3
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.<init>(android.view.View, X.4DH, com.instagram.common.session.UserSession, X.2eb, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.85r, X.80U, X.82t):void");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void DAU() {
    }

    public final /* synthetic */ void DAW() {
    }

    public final /* synthetic */ void DAu() {
    }

    public final /* synthetic */ void Dfn() {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final C19140WMw A00(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        AnonymousClass80U r2;
        if (clipsAudioMixingDrawerController.A04 == null || (!A02(clipsAudioMixingDrawerController) && ((r2 = clipsAudioMixingDrawerController.quickCaptureState) == null || !r2.CQ0(AnonymousClass80V.MUSIC_OVERLAY_IN_STACKED_TIMELINE)))) {
            return clipsAudioMixingDrawerController.A03;
        }
        return clipsAudioMixingDrawerController.A04;
    }

    public static final boolean A02(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        AnonymousClass80U r1 = clipsAudioMixingDrawerController.quickCaptureState;
        if (r1 != null && r1.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
            return true;
        }
        AnonymousClass80U r12 = clipsAudioMixingDrawerController.quickCaptureState;
        if (r12 != null && r12.CQ0(AnonymousClass80V.MUSIC_OVERLAY_IN_STACKED_TIMELINE)) {
            return true;
        }
        AnonymousClass80U r13 = clipsAudioMixingDrawerController.quickCaptureState;
        if (r13 == null || !r13.CQ0(AnonymousClass80V.MEDIA_EDIT) || !AnonymousClass8IK.A01(clipsAudioMixingDrawerController.A0F)) {
            return false;
        }
        return true;
    }

    public final void A03(C3515589i r10, AudioOverlayTrack audioOverlayTrack, String str, 0eP r13, boolean z, boolean z2, boolean z3, boolean z4) {
        0eP r0;
        this.A0J.A00.A0B(new AnonymousClass88W(true));
        if (!A02(this)) {
            AnonymousClass80U r1 = this.quickCaptureState;
            if (r1 != null) {
                r1.E3H(new Object());
            }
            C314446iH r02 = this.A02;
            if (r02 != null) {
                r02.DV9(this);
            }
        }
        if (!z) {
            27p.A01(this.A0F).A1Q(C59725JVj.POST_CAPTURE, "AUDIO_CONTROLS_ADD_MUSIC");
        }
        C3514789a r2 = this.A0I;
        r2.A00 = r10;
        if (audioOverlayTrack != null) {
            C3515789k r3 = this.A0B;
            r3.A02 = audioOverlayTrack;
            r3.A07 = new 0eP(Integer.valueOf(audioOverlayTrack.A04), Integer.valueOf(audioOverlayTrack.A01));
            C3515789k.A08(r3, audioOverlayTrack, true, true, z4);
            return;
        }
        MusicOverlaySearchTab musicOverlaySearchTab = null;
        if (z3) {
            C3515789k r5 = this.A0B;
            AudioOverlayTrack A032 = this.A0K.A0K.A03(str);
            if (A032 == null) {
                A032 = ((AnonymousClass89Z) this.A0L.getValue()).A01();
            }
            r5.A02 = A032;
            if (A032 != null) {
                r0 = new 0eP(Integer.valueOf(A032.A04), Integer.valueOf(A032.A01));
            } else {
                r0 = null;
            }
            r5.A07 = r0;
            if (A032 != null) {
                C3515789k.A08(r5, A032, true, true, false);
                return;
            }
            return;
        }
        ClipsAudioStore clipsAudioStore = this.A0K.A0K;
        AudioOverlayTrack A033 = clipsAudioStore.A03(str);
        if (z2 || (A033 != null && A033.A01())) {
            musicOverlaySearchTab = MusicOverlaySearchTab.A07;
        } else if (r2.A01) {
            musicOverlaySearchTab = MusicOverlaySearchTab.A04;
        }
        C3515789k r22 = this.A0B;
        if (r22 != null) {
            r22.A09(((AnonymousClass89Z) this.A0L.getValue()).A01(), clipsAudioStore.A03(str), musicOverlaySearchTab, r13, true, false);
        }
    }

    public final void A04(AnonymousClass8d1 r20) {
        0eP r0;
        float f;
        C3515789k r7 = this.A0B;
        AnonymousClass8d1 r4 = r20;
        MusicAssetModel musicAssetModel = r4.A02;
        int i = r4.A01;
        AnonymousClass6KJ r10 = r4.A03;
        int i2 = r4.A00;
        AudioOverlayTrack A032 = this.A0K.A0K.A03(r4.A04);
        r7.A02 = A032;
        AnonymousClass8IJ r8 = null;
        if (A032 != null) {
            r0 = new 0eP(Integer.valueOf(A032.A04), Integer.valueOf(A032.A01));
        } else {
            r0 = null;
        }
        r7.A07 = r0;
        Integer valueOf = Integer.valueOf(i);
        if (A032 != null) {
            r8 = A032.A05;
        }
        if (A032 != null) {
            f = A032.A00;
        } else {
            f = 1.0f;
        }
        C3515789k.A07(r7, r8, musicAssetModel, r10, valueOf, (String) null, f, i2, true, true, true, false);
        this.A06 = !r4.A05;
    }

    public final /* synthetic */ boolean ABA() {
        return true;
    }

    public final /* synthetic */ boolean CV1() {
        return false;
    }

    public final void DAt() {
        if (this.A07) {
            this.A07 = false;
        } else {
            A01(this);
        }
    }

    public final /* synthetic */ boolean Es5() {
        return false;
    }

    public final /* synthetic */ boolean Esq() {
        return true;
    }

    public static final void A01(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        if (!A02(clipsAudioMixingDrawerController)) {
            AnonymousClass80U r1 = clipsAudioMixingDrawerController.quickCaptureState;
            if (r1 != null) {
                r1.E3H(new Object());
            }
            C314446iH r0 = clipsAudioMixingDrawerController.A02;
            if (r0 != null) {
                r0.D48(clipsAudioMixingDrawerController);
            }
        }
        ((AnonymousClass89Z) clipsAudioMixingDrawerController.A0L.getValue()).A06(AnonymousClass05K.A00);
    }

    public final boolean onBackPressed() {
        C19140WMw A002 = A00(this);
        if (A002 != null) {
            return A002.A06(true);
        }
        return false;
    }

    public final void onDestroyView() {
        ClipsAudioMixingDrawerControllerLifecycleUtil.cleanupReferences(this);
    }

    public final /* synthetic */ boolean Dkv(MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean EsU(MotionEvent motionEvent) {
        return false;
    }

    public final void DAw(C19140WMw wMw, float f, float f2, float f3) {
    }
}
