package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KGY extends C232232tF {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60696Jph(DbU.A09(layoutInflater, viewGroup, R.layout.immersive_catch_up_filtered_item, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61166JyI jyI = (C61166JyI) r4;
        C60696Jph jph = (C60696Jph) r5;
        AnonymousClass7TG.A1N(jyI, jph);
        jph.A04.setUrl(jyI.A00, jph);
        jph.A02.setUrl(jyI.A01, jph);
        jph.A01.setText(jyI.A03);
        Integer num = jyI.A02;
        if (num != null) {
            int intValue = num.intValue();
            DbU.A13(jph.A00, jph.A03, intValue);
        }
    }

    public final Class modelClass() {
        return C61166JyI.class;
    }

    public KGY(Context context) {
        this.A00 = context;
    }
}
