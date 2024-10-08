package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EH1 extends C232232tF {
    public final AnonymousClass0iw A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46970DoO(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_reaction_item, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        FYC fyc = (FYC) r4;
        C46970DoO doO = (C46970DoO) r5;
        AnonymousClass7TG.A1N(fyc, doO);
        doO.A02.setUrl(fyc.A00.Bh3(), doO.A00);
        doO.A01.setText(fyc.A01);
    }

    public final Class modelClass() {
        return FYC.class;
    }

    public EH1(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
