package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EFe  reason: case insensitive filesystem */
public final class C47744EFe extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46901DnH(DbT.A0D(layoutInflater, viewGroup, R.layout.onboarding_check_list_header_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        TextView textView;
        String str;
        C50319FXz fXz = (C50319FXz) r3;
        C46901DnH dnH = (C46901DnH) r4;
        if (dnH != null && (textView = dnH.A00) != null) {
            if (fXz != null) {
                str = fXz.A00;
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    public final Class modelClass() {
        return C50319FXz.class;
    }
}
