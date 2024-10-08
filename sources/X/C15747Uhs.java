package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uhs  reason: case insensitive filesystem */
public final class C15747Uhs extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        WS8 ws8 = (WS8) r3;
        UCL ucl = (UCL) r4;
        AnonymousClass7TG.A1N(ws8, ucl);
        ucl.A00.setText(ws8.A00.A00);
    }

    public final Class modelClass() {
        return WS8.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UCL(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_title, false));
    }
}
