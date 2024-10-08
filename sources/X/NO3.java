package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NO3 extends C232222tE {
    public final AnonymousClass7XQ A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68049MzG(C66582MXn.A0E(layoutInflater, viewGroup, R.layout.collapsable_message, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        N88 n88 = (N88) r4;
        C68049MzG mzG = (C68049MzG) r5;
        AnonymousClass7TG.A1N(n88, mzG);
        TextView textView = mzG.A00;
        textView.setText(n88.A04);
        textView.setTextColor(n88.A01);
        textView.setBackgroundColor(n88.A00);
        int i = 33;
        if (n88.A06) {
            i = 32;
        }
        C71408Ok7.A00(textView, i, this, n88);
    }

    public final Class modelClass() {
        return N88.class;
    }

    public NO3(AnonymousClass7XQ r1) {
        this.A00 = r1;
    }
}
