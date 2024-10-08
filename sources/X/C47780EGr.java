package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EGr  reason: case insensitive filesystem */
public final class C47780EGr extends C232232tF {
    public final 0sP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46984Doc(DbU.A09(layoutInflater, viewGroup, R.layout.layout_ai_agent_category_pill, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        AnonymousClass0eM r0;
        C47237DtO dtO = (C47237DtO) r4;
        C46984Doc doc = (C46984Doc) r5;
        AnonymousClass7TG.A1N(dtO, doc);
        TextView textView = doc.A00;
        textView.setText(C66909Mes.A00(AnonymousClass7TE.A0S(doc.itemView), dtO.A00));
        boolean z = dtO.A02;
        textView.setSelected(z);
        if (z) {
            r0 = doc.A02;
        } else {
            r0 = doc.A01;
        }
        textView.setTextColor(DbX.A07(r0));
        FPE.A01(textView, 40, dtO, doc);
    }

    public final Class modelClass() {
        return C47237DtO.class;
    }

    public C47780EGr(0sP r1) {
        this.A00 = r1;
    }
}
