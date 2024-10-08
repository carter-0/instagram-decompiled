package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class H76 extends C232222tE {
    public final C55478HiM A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C53139GjB gjB = (C53139GjB) r8;
        0qQ.A0B(gjB, 1);
        C55478HiM hiM = this.A00;
        0qQ.A0B(hiM, 1);
        IgTextView igTextView = gjB.A03;
        igTextView.setVisibility(0);
        gjB.A04.setVisibility(8);
        IgTextView igTextView2 = gjB.A02;
        igTextView2.setVisibility(0);
        gjB.A01.setVisibility(8);
        Context context = igTextView2.getContext();
        0qQ.A0A(context);
        DbT.A17(context, igTextView2, 1QE.A01(context));
        C56800ICx.A00(igTextView2, 48, hiM);
        int dimensionPixelSize = gjB.A00.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        0nA.A0i(igTextView, dimensionPixelSize, dimensionPixelSize);
        0nA.A0i(igTextView2, dimensionPixelSize, dimensionPixelSize);
    }

    public final Class modelClass() {
        return ION.class;
    }

    public H76(C55478HiM hiM) {
        this.A00 = hiM;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53139GjB(DbT.A0D(layoutInflater, viewGroup, R.layout.save_to_collection_fragment_title_bar, false));
    }
}
