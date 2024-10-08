package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LnR  reason: case insensitive filesystem */
public final class C65104LnR implements C3515289f {
    public C331157Pu A00;
    public AudioOverlayTrack A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final C3515789k A06;
    public final ClipsCreationViewModel A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0iw A09;
    public final C3515289f A0A;
    public final C3499982t A0B;
    public final C52963GgG A0C;
    public final String A0D;

    public C65104LnR(AnonymousClass4DH r25, AnonymousClass0iw r26, UserSession userSession, C3515289f r28, ClipsCreationViewModel clipsCreationViewModel, C3499982t r30) {
        C3515289f r2 = r28;
        0qQ.A0B(r2, 4);
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        AnonymousClass4DH r8 = r25;
        this.A04 = r8;
        C3499982t r0 = r30;
        this.A0B = r0;
        this.A0A = r2;
        this.A07 = clipsCreationViewModel;
        this.A09 = r26;
        this.A0D = r0.BUn();
        this.A08 = DbS.A0I(new MMR(r8, 16), new MMR(this, 15), C66291MMa.A00((Object) null, r8, 22), DbS.A0z(AnonymousClass89Z.class));
        FragmentActivity requireActivity = r8.requireActivity();
        Application application = r8.requireActivity().getApplication();
        0qQ.A0B(application, 1);
        C52963GgG A002 = JTO.A0L(new C54293H6k(application, (TrackOrOriginalSoundSchema) null, userSession2, (HM8) null, "galleryTrendingAudio", (String) null), requireActivity).A00(C52963GgG.class);
        0qQ.A07(A002);
        this.A0C = A002;
        Context requireContext = r8.requireContext();
        AnonymousClass80X r17 = AnonymousClass80X.PRE_CAPTURE;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A06 = new C3515789k(requireContext, (C3515589i) null, of, MusicProduct.CLIPS_CAMERA_FORMAT_V2, r8, userSession2, (TargetViewSizeProvider) null, (C3506485o) null, (C3502083s) null, new C65100LnN(0), this, (MusicAttributionConfig) null, C3515689j.GALLERY, r17, (String) null, false, true, false, false, false);
    }

    public static final void A00(C65104LnR lnR, AudioOverlayTrack audioOverlayTrack, boolean z) {
        lnR.A03 = false;
        UserSession userSession = lnR.A05;
        K6x A002 = C63170Ksd.A00(userSession, new C65099LnM(lnR), audioOverlayTrack, z);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0T = A002;
        C65745Lyz.A00(A0W, lnR, 5);
        AnonymousClass4DH r2 = lnR.A04;
        A0W.A06 = r2.requireContext().getColor(R.color.barcelona_story_share_dark_mode);
        C331157Pu A003 = A0W.A00();
        lnR.A00 = A003;
        DbU.A1I(r2, A002, A003);
    }

    public final /* synthetic */ void DT3(boolean z) {
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        0qQ.A0B(audioOverlayTrack, 0);
        if (this.A03) {
            this.A01 = audioOverlayTrack;
        } else {
            this.A0A.Dt2(audioOverlayTrack);
        }
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }

    public final void A01() {
        AnonymousClass0eM r1 = this.A08;
        if (((AnonymousClass89Z) r1.getValue()).A01() == null || this.A02) {
            this.A03 = true;
            this.A02 = false;
            this.A01 = null;
            C3515689j r2 = C3515689j.GALLERY;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("referrer_audio_id", "galleryTrendingAudio");
            A0a.putSerializable(AnonymousClass000.A00(1608), r2);
            UserSession userSession = this.A05;
            Fragment h1j = new H1J();
            h1j.setArguments(A0a);
            JTS.A11(h1j, MGV.A01(this, (AnonymousClass4D7) null, 35), this.A0C.A0B);
            C331127Pr A0e = DbX.A0e(userSession, true);
            A0e.A03 = 1.0f;
            AnonymousClass4DH r22 = this.A04;
            A0e.A06 = r22.requireContext().getColor(R.color.barcelona_story_share_dark_mode);
            A0e.A0T = h1j;
            C65745Lyz.A00(A0e, this, 4);
            C331157Pu A002 = A0e.A00();
            this.A00 = A002;
            DbU.A1I(r22, h1j, A002);
            C52086GEg.A0P(C54689HOu.GALLERY_DESTINATION_BAR, this.A09, userSession, (String) null, (String) null, (String) null, 1);
            27p.A01(userSession).A1Q(C59725JVj.PRE_CAPTURE, "DESTINATION_TOOLBAR_TRENDING_AUDIO");
            return;
        }
        AudioOverlayTrack A012 = ((AnonymousClass89Z) r1.getValue()).A01();
        if (A012 != null) {
            A00(this, A012, true);
        }
    }

    public final String BUn() {
        return this.A0D;
    }

    public final void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((AnonymousClass89Z) this.A08.getValue()).A05(audioOverlayTrack, "trending", z);
    }
}
