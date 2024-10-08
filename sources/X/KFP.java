package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFP extends C232222tE {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60627Joa(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_iglive_earnings_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C64784Li0 li0 = (C64784Li0) r6;
        C60627Joa joa = (C60627Joa) r7;
        AnonymousClass7TF.A1H(li0, joa);
        LY5.A01(joa.A00, 27, this);
        String str = li0.A00;
        boolean A1Q = AnonymousClass7TF.A1Q(str.length());
        TextView textView = joa.A01;
        if (A1Q) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        String str2 = li0.A01;
        if (str2 == null || str2.length() == 0) {
            joa.A02.setVisibility(8);
            return;
        }
        TextView textView2 = joa.A02;
        textView2.setText(str2);
        textView2.setVisibility(0);
    }

    public final Class modelClass() {
        return C64784Li0.class;
    }

    public KFP(C62320sa r1) {
        this.A00 = r1;
    }
}
