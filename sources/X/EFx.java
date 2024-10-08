package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EFx extends C232222tE {
    public final View.OnClickListener A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C47763EGa eGa = (C47763EGa) r3;
        C46975DoT doT = (C46975DoT) r4;
        AnonymousClass0fU.A00(this.A00, doT.A00);
        doT.A02.setText(eGa.A01);
        doT.A01.setText(eGa.A00);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46975DoT(DbT.A0C(layoutInflater, viewGroup, R.layout.suggested_blocks_entry_point));
    }

    public final Class modelClass() {
        return C47763EGa.class;
    }

    public EFx(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
