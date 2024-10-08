package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class EG4 extends C232222tE {
    public final String A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46959DoD(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_order_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        FY3 fy3 = (FY3) r5;
        C46959DoD doD = (C46959DoD) r6;
        AnonymousClass7TG.A1N(fy3, doD);
        Context A0S = AnonymousClass7TE.A0S(doD.itemView);
        IgTextView igTextView = doD.A01;
        C49539Exa exa = fy3.A00;
        igTextView.setText(exa.A01);
        doD.A02.setText(exa.A02);
        doD.A00.setText(exa.A00);
        FPH.A00(doD.itemView, A0S, this, fy3, 24);
    }

    public final Class modelClass() {
        return FY3.class;
    }

    public EG4(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
