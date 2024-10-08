package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EFr  reason: case insensitive filesystem */
public final class C47757EFr extends C232222tE {
    public final C60106Jfm A00;

    public C47757EFr(C60106Jfm jfm) {
        0qQ.A0B(jfm, 1);
        this.A00 = jfm;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46910DnQ(DbT.A0D(layoutInflater, viewGroup, R.layout.customized_benefit_selection_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61165JyH jyH = (C61165JyH) r4;
        C46910DnQ dnQ = (C46910DnQ) r5;
        AnonymousClass7TG.A1N(jyH, dnQ);
        IgdsListCell igdsListCell = dnQ.A00;
        igdsListCell.A0G(C69349Njo.TYPE_CHECKBOX, jyH.A00);
        igdsListCell.A06(jyH.A03);
        igdsListCell.setChecked(jyH.A01);
        igdsListCell.setEnabled(jyH.A00);
        igdsListCell.A0D(new FQP(6, (Object) igdsListCell, (Object) jyH, (Object) this));
    }

    public final Class modelClass() {
        return C61165JyH.class;
    }
}
