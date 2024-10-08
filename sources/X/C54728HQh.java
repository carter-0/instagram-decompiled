package X;

import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HQh  reason: case insensitive filesystem */
public abstract class C54728HQh {
    public final void A00(AnonymousClass9IE r3) {
        if (this instanceof C54363HAd) {
            C56802ICz.A01(((C54363HAd) this).A01, 1, r3);
        }
    }

    public final void A01(AnonymousClass9IE r5, C257873y6 r6) {
        IgdsButton igdsButton;
        IgdsButton igdsButton2;
        Integer A05;
        Integer A052;
        if (this instanceof C54363HAd) {
            C54363HAd hAd = (C54363HAd) this;
            igdsButton = hAd.A02;
            igdsButton2 = hAd.A03;
        } else {
            C54362HAc hAc = (C54362HAc) this;
            igdsButton = hAc.A00;
            igdsButton2 = hAc.A01;
        }
        AnonymousClass7TG.A1N(igdsButton, igdsButton2);
        String BVi = r6.BVi();
        if (!(BVi == null || (A052 = C14091Tpi.A05(BVi)) == null)) {
            igdsButton.A02(C273084lx.START, A052.intValue());
            igdsButton.setIconPadding(DbU.A05(igdsButton).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton.setText(r6.BVj());
        C56800ICx.A00(igdsButton, 70, r5);
        String Bdx = r6.Bdx();
        if (!(Bdx == null || (A05 = C14091Tpi.A05(Bdx)) == null)) {
            igdsButton2.A02(C273084lx.START, A05.intValue());
            igdsButton2.setIconPadding(DbU.A05(igdsButton2).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton2.setText(r6.Bdy());
        C56802ICz.A01(igdsButton2, 0, r5);
    }

    public final void A02(C257873y6 r3) {
        if (this instanceof C54363HAd) {
            ((C54363HAd) this).A00.setText(r3.getText());
        }
    }
}
