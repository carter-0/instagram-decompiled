package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NO5 extends C232222tE {
    public final AnonymousClass7XY A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67998MyQ(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_shhmode_intro_qp, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        AnonymousClass7OB r32 = (AnonymousClass7OB) r3;
        C67998MyQ myQ = (C67998MyQ) r4;
        AnonymousClass7TG.A1N(r32, myQ);
        myQ.A02.setText(r32.A04);
        TextView textView = myQ.A01;
        textView.setText(r32.A03);
        textView.setTextColor(r32.A00);
        C71397Ojw.A00(myQ.A00, 50, this);
    }

    public final Class modelClass() {
        return AnonymousClass7OB.class;
    }

    public NO5(AnonymousClass7XY r1) {
        this.A00 = r1;
    }
}
