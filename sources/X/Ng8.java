package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class Ng8 extends C15732Uhd {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.link_section_secondary_cta, false);
        A09.setTag(new C67927MxD(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.link.LinkSectionSecondaryCtaViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void A00(C232262tL r4, C249703kE r5) {
        C71977Ou2 ou2 = (C71977Ou2) r4;
        C67927MxD mxD = (C67927MxD) r5;
        AnonymousClass7TG.A1N(ou2, mxD);
        TextView textView = mxD.A00;
        textView.setVisibility(0);
        C53380GnA gnA = ou2.A00;
        textView.setText(gnA.A02);
        String str = gnA.A01;
        if (str != null) {
            textView.setContentDescription(str);
        }
        C71396Ojv.A00(textView, 62, ou2);
        0nA.A0T(textView, gnA.A00);
    }

    public final Class modelClass() {
        return C71977Ou2.class;
    }
}
