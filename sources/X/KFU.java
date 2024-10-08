package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFU extends C232222tE {
    public final Context A00;
    public final C59744JWd A01;

    public KFU(Context context, C59744JWd jWd) {
        0qQ.A0B(jWd, 2);
        this.A00 = context;
        this.A01 = jWd;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60609JoI(DbU.A09(layoutInflater, viewGroup, R.layout.folder_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        JX4 jx4 = (JX4) r4;
        C60609JoI joI = (C60609JoI) r5;
        AnonymousClass7TG.A1N(jx4, joI);
        joI.A02.setText(jx4.A00.getName());
        int i = 0;
        TextView textView = joI.A01;
        textView.setVisibility(8);
        textView.setText((CharSequence) null);
        View view = joI.A00;
        LYA.A01(view, jx4, joI, this, 10);
        if (jx4.equals(00k.A0L(JTS.A0q(this.A01.A00.A01)))) {
            i = AnonymousClass7TH.A01(this.A00);
        }
        0nA.A0T(view, i);
    }

    public final Class modelClass() {
        return JX4.class;
    }
}
