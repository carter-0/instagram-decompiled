package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KEn  reason: case insensitive filesystem */
public final class C61611KEn extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60603JoC(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_monthly_earnings, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61159JyB jyB = (C61159JyB) r4;
        C60603JoC joC = (C60603JoC) r5;
        AnonymousClass7TF.A1H(jyB, joC);
        joC.A00.setText(jyB.A00);
        joC.A01.setText(jyB.A01);
        joC.A02.A0K(jyB.A02, false);
    }

    public final Class modelClass() {
        return C61159JyB.class;
    }
}
