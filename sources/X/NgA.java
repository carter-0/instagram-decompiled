package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NgA extends C15732Uhd {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.text_section, false);
        A09.setTag(new C67928MxE(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.text.TextSectionViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void A00(C232262tL r3, C249703kE r4) {
        C68204N5t n5t = (C68204N5t) r3;
        C67928MxE mxE = (C67928MxE) r4;
        AnonymousClass7TG.A1N(n5t, mxE);
        TextView textView = mxE.A00;
        textView.setText(n5t.A02);
        Integer num = n5t.A00;
        if (num != null) {
            textView.setTextAlignment(num.intValue());
        }
    }

    public final Class modelClass() {
        return C68204N5t.class;
    }
}
