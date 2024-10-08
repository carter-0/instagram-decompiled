package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.KEo  reason: case insensitive filesystem */
public final class C61612KEo extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60520Jmr(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_funding_balance, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        KGJ kgj = (KGJ) r3;
        C60520Jmr jmr = (C60520Jmr) r4;
        AnonymousClass7TG.A1N(kgj, jmr);
        IgTextView igTextView = jmr.A00;
        igTextView.setText(kgj.A00);
        igTextView.setContentDescription(kgj.A01);
    }

    public final Class modelClass() {
        return KGJ.class;
    }
}
