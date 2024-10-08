package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NNo  reason: case insensitive filesystem */
public final class C68567NNo extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C67926MxC(C66582MXn.A0E(DbX.A0E(viewGroup), viewGroup, R.layout.product_feed_section_empty_state_text, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61157Jy9 jy9 = (C61157Jy9) r4;
        C67926MxC mxC = (C67926MxC) r5;
        AnonymousClass7TG.A1N(jy9, mxC);
        TextView textView = mxC.A00;
        textView.setText(C56259HvT.A00(C66580MXl.A0B(textView), jy9.A00));
    }

    public final Class modelClass() {
        return C61157Jy9.class;
    }
}
