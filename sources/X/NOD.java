package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NOD extends C232222tE {
    public final C70490O8p A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new Mx1(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_load_more_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C68603NOz nOz = (C68603NOz) r5;
        Mx1 mx1 = (Mx1) r6;
        AnonymousClass7TG.A1N(nOz, mx1);
        TextView textView = mx1.A00;
        Context context = textView.getContext();
        int i = 2131959943;
        if (nOz.A00) {
            i = 2131959944;
        }
        DbT.A18(context, textView, i);
        C71402Ok1.A00(textView, 38, this);
    }

    public final Class modelClass() {
        return C68603NOz.class;
    }

    public NOD(C70490O8p o8p) {
        this.A00 = o8p;
    }
}
