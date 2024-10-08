package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EH2 extends C232232tF {
    public final Integer A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46953Do7(DbT.A0D(layoutInflater, viewGroup, R.layout.creator_inspiration_hub_pill, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C47236DtN dtN = (C47236DtN) r3;
        C46953Do7 do7 = (C46953Do7) r4;
        AnonymousClass7TG.A1N(dtN, do7);
        if (do7.A01 != AnonymousClass05K.A00) {
            do7.A00.getLayoutParams().width = -2;
        }
        TextView textView = do7.A00;
        textView.setText(dtN.A01);
        textView.setSelected(dtN.A02);
        FPE.A01(textView, 33, dtN, do7);
    }

    public final Class modelClass() {
        return C47236DtN.class;
    }

    public EH2(Integer num, 0sP r2) {
        this.A00 = num;
        this.A01 = r2;
    }
}
