package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNw  reason: case insensitive filesystem */
public final class C68575NNw extends C232222tE {
    public final C70430O6h A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_poll_sticker_tray_item, false);
        C67894Mwc mwc = new C67894Mwc(A09);
        mwc.A00.setTypeface(AnonymousClass0qo.A00(AnonymousClass7TE.A0S(A09)).A02(0qm.A0V));
        NQx.A01(AnonymousClass7TE.A0m(A09), this, 3);
        return mwc;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C67894Mwc mwc = (C67894Mwc) r4;
        0qQ.A0B(mwc, 1);
        AnonymousClass7L0 r1 = this.A00.A00.A03.A0A;
        if (r1 != null) {
            C66583MXo.A0x(mwc.A00, r1);
        }
    }

    public final Class modelClass() {
        return NPP.class;
    }

    public C68575NNw(C70430O6h o6h) {
        this.A00 = o6h;
    }
}
