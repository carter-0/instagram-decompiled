package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NOL extends C232222tE {
    public AnonymousClass7SF A00;
    public final AnonymousClass9HC A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67976My0(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_shhmode_thread_title, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C71397Ojw ojw;
        AnonymousClass7O8 r52 = (AnonymousClass7O8) r5;
        C67976My0 my0 = (C67976My0) r6;
        AnonymousClass7TG.A1N(r52, my0);
        0nA.A0c(JTO.A0F(my0), DbS.A02(JTQ.A06(my0), 12));
        my0.A01.setText(r52.A05);
        TextView textView = my0.A00;
        textView.setText(r52.A04);
        textView.setTextColor(r52.A01);
        View A0F = JTO.A0F(my0);
        int i = r52.A00;
        0nA.A0h(A0F, i, i);
        if (r52.A06) {
            ojw = new C71397Ojw(this, 51);
        } else {
            ojw = null;
        }
        AnonymousClass0fU.A00(ojw, textView);
        my0.A02.setVisibility(8);
    }

    public final Class modelClass() {
        return AnonymousClass7O8.class;
    }

    public NOL(AnonymousClass7SF r1, AnonymousClass9HC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
