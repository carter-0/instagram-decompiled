package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFM extends C232222tE {
    public final Activity A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60639Jom(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_tagging_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64798LiI liI = (C64798LiI) r5;
        C60639Jom jom = (C60639Jom) r6;
        AnonymousClass7TF.A1H(liI, jom);
        jom.A03.setText(liI.A03);
        String str = liI.A02;
        TextView textView = jom.A02;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
            jom.A01.setVisibility(8);
        } else {
            textView.setVisibility(8);
            jom.A01.setVisibility(0);
        }
        LY6.A01(jom.A00, 26, liI);
    }

    public final Class modelClass() {
        return C64798LiI.class;
    }

    public KFM(Activity activity) {
        this.A00 = activity;
    }
}
