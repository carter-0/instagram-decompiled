package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NOE extends C232222tE {
    public final C70491O8q A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new Mx2(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_load_more_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        NP0 np0 = (NP0) r5;
        Mx2 mx2 = (Mx2) r6;
        AnonymousClass7TG.A1N(np0, mx2);
        TextView textView = mx2.A00;
        Context context = textView.getContext();
        int i = 2131960352;
        if (np0.A00) {
            i = 2131960353;
        }
        DbT.A18(context, textView, i);
        C71402Ok1.A00(textView, 39, this);
    }

    public final Class modelClass() {
        return NP0.class;
    }

    public NOE(C70491O8q o8q) {
        this.A00 = o8q;
    }
}
