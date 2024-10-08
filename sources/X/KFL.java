package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFL extends C232222tE {
    public final C63646L1i A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        C60618JoR joR = new C60618JoR(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_series_no_header_container, false));
        View view = joR.A00;
        LY6.A01(view, 25, this);
        int A0B = AnonymousClass7TE.A0B(view.getResources());
        view.setPadding(A0B, 0, A0B, 0);
        return joR;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64782Lhy lhy = (C64782Lhy) r4;
        C60618JoR joR = (C60618JoR) r5;
        AnonymousClass7TF.A1H(lhy, joR);
        joR.A02.setText(lhy.A01);
        String str = lhy.A00;
        if (str == null) {
            joR.A01.setVisibility(8);
            return;
        }
        TextView textView = joR.A01;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final Class modelClass() {
        return C64782Lhy.class;
    }

    public KFL(C63646L1i l1i) {
        this.A00 = l1i;
    }
}
