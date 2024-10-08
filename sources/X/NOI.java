package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NOI extends C232222tE {
    public final 0sP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67983MyB(DbU.A09(layoutInflater, viewGroup, R.layout.layout_call_survey_option, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C68191N5g n5g = (C68191N5g) r3;
        C67983MyB myB = (C67983MyB) r4;
        AnonymousClass7TG.A1N(n5g, myB);
        myB.A00 = n5g;
        myB.A01.setText(n5g.A01);
    }

    public final Class modelClass() {
        return C68191N5g.class;
    }

    public NOI(0sP r1) {
        this.A00 = r1;
    }
}
