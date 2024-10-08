package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EFv  reason: case insensitive filesystem */
public final class C47761EFv extends C232222tE {
    public final 0sP A00;

    public C47761EFv(0sP r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46996Doo(DbU.A09(layoutInflater, viewGroup, R.layout.layout_cowatch_closed_caption_option, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        FYG fyg = (FYG) r4;
        C46996Doo doo = (C46996Doo) r5;
        boolean A1Z = AnonymousClass7TG.A1Z(fyg, doo);
        doo.A00 = fyg;
        doo.A01.setText(fyg.A02);
        if (fyg.A00 == fyg.A01) {
            doo.A02.setChecked(A1Z);
        }
    }

    public final Class modelClass() {
        return FYG.class;
    }
}
