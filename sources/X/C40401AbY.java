package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

/* renamed from: X.AbY  reason: case insensitive filesystem */
public final class C40401AbY implements C3515289f {
    public C331157Pu A00;
    public AudioOverlayTrack A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final C3515789k A06;
    public final AnonymousClass0eM A07;
    public final C3515289f A08;
    public final C3499982t A09;
    public final String A0A;

    public C40401AbY(AnonymousClass4DH r25, UserSession userSession, C3515289f r27, C3499982t r28) {
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        AnonymousClass4DH r8 = r25;
        this.A04 = r8;
        C3499982t r0 = r28;
        this.A09 = r0;
        this.A08 = r27;
        this.A0A = r0.BUn();
        this.A07 = new C227862kA(new MMR(r8, 14), new MMR(this, 13), new C66291MMa(21, (Object) null, r8), new 0Yh(AnonymousClass89Z.class));
        Context requireContext = r8.requireContext();
        AnonymousClass80X r17 = AnonymousClass80X.PRE_CAPTURE;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A06 = new C3515789k(requireContext, C3515589i.GALLERY_DESTINATION_BAR, of, MusicProduct.CLIPS_CAMERA_FORMAT_V2, r8, userSession2, (TargetViewSizeProvider) null, (C3506485o) null, (C3502083s) null, new C65101LnO(this, 1), this, (MusicAttributionConfig) null, C3515689j.GALLERY, r17, (String) null, false, true, false, false, false);
    }

    public static final void A00(C40401AbY abY, AudioOverlayTrack audioOverlayTrack, boolean z) {
        abY.A02 = false;
        UserSession userSession = abY.A05;
        K6x A002 = C63170Ksd.A00(userSession, new C40400AbX(abY, audioOverlayTrack), audioOverlayTrack, z);
        C331127Pr r3 = new C331127Pr(userSession);
        r3.A0T = A002;
        r3.A0U = new C40647AgN(abY, 2);
        AnonymousClass4DH r2 = abY.A04;
        r3.A06 = r2.requireContext().getColor(R.color.grey_10);
        C331157Pu A003 = r3.A00();
        abY.A00 = A003;
        A003.A02(r2.requireActivity(), A002);
    }

    public final /* synthetic */ void DT3(boolean z) {
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        0qQ.A0B(audioOverlayTrack, 0);
        if (this.A02) {
            this.A01 = audioOverlayTrack;
        } else {
            this.A08.Dt2(audioOverlayTrack);
        }
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }

    public final void A01() {
        AnonymousClass0eM r2 = this.A07;
        if (((AnonymousClass89Z) r2.getValue()).A01() == null || this.A03) {
            this.A02 = true;
            this.A03 = false;
            this.A01 = null;
            this.A06.A0A((AudioOverlayTrack) null, (MusicOverlaySearchTab) null, false, false);
            return;
        }
        AudioOverlayTrack A012 = ((AnonymousClass89Z) r2.getValue()).A01();
        if (A012 != null) {
            A00(this, A012, true);
        }
    }

    public final String BUn() {
        return this.A0A;
    }

    public final void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
        ((AnonymousClass89Z) this.A07.getValue()).A05((AudioOverlayTrack) null, "gallery", z);
    }
}
