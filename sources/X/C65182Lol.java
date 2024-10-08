package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Lol  reason: case insensitive filesystem */
public final class C65182Lol implements MVS {
    public C60076JfA A00;
    public final AnonymousClass4DH A01;
    public final C66576MXh A02;
    public final KOZ A03;
    public final AnonymousClass80P A04 = AnonymousClass80P.DEAL_SELECTOR;
    public final 0sP A05;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A01.requireContext(), LYD.A01(this, 18), Integer.valueOf(R.drawable.instagram_money_pano_outline_24), 2131955324);
        this.A00 = A002;
        return A002;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A04;
    }

    public final void CsQ() {
        0sP r1 = this.A05;
        C60076JfA jfA = this.A00;
        if (jfA == null) {
            0qQ.A0F("dealSelectorRow");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.invoke(jfA.A0A);
        AnonymousClass4DH r0 = this.A01;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65182Lol(AnonymousClass4DH r2, C66576MXh mXh, KOZ koz, 0sP r5) {
        AnonymousClass7TG.A1U(r2, mXh, koz);
        this.A01 = r2;
        this.A02 = mXh;
        this.A03 = koz;
        this.A05 = r5;
    }
}
