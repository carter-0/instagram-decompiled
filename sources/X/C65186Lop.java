package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Lop  reason: case insensitive filesystem */
public final class C65186Lop implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final C66576MXh A02;
    public final KOK A03;
    public final C62674Kka A04 = C62674Kka.A0H;
    public final AnonymousClass80P A05 = AnonymousClass80P.RENAME_AUDIO;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A01.requireContext(), LYD.A01(this, 28), Integer.valueOf(R.drawable.instagram_audio_page_pano_outline_24), 2131955707);
        this.A00 = A002;
        return A002;
    }

    public final C62674Kka B1s() {
        return this.A04;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        String str = ((C61046Jvk) this.A03.A04.getValue()).A00;
        C60076JfA jfA = this.A00;
        if (jfA == null) {
            0qQ.A0F("renameOriginalAudioRow");
            throw AnonymousClass00P.createAndThrow();
        }
        if (str == null) {
            str = DbU.A0m(this.A01, 2131955706);
        }
        jfA.setInlineSubtitle(str);
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65186Lop(AnonymousClass4DH r2, C66576MXh mXh, KOK kok) {
        AnonymousClass7TG.A1U(r2, mXh, kok);
        this.A01 = r2;
        this.A02 = mXh;
        this.A03 = kok;
    }
}
