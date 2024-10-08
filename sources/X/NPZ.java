package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NPZ extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67890MwY(DbT.A0D(layoutInflater, viewGroup, R.layout.encrypted_backups_fishfooding_screens_text, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        N5Y n5y = (N5Y) r4;
        C67890MwY mwY = (C67890MwY) r5;
        boolean A1Z = AnonymousClass7TG.A1Z(n5y, mwY);
        TextView textView = mwY.A00;
        textView.setText(n5y.A00.A00);
        C71407Ok6.A00(textView, A1Z ? 1 : 0, n5y);
    }

    public final Class modelClass() {
        return N5Y.class;
    }
}
