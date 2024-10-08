package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uhq  reason: case insensitive filesystem */
public final class C15745Uhq extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        WS5 ws5 = (WS5) r4;
        C14862UCq uCq = (C14862UCq) r5;
        AnonymousClass7TG.A1N(ws5, uCq);
        TextView textView = uCq.A01;
        UOE uoe = (UOE) ws5.A00;
        textView.setText(uoe.A01);
        uCq.A00.setText(uoe.A00);
    }

    public final Class modelClass() {
        return WS5.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14862UCq(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_null_state_shops, false));
    }
}
