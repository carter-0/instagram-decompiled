package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPj  reason: case insensitive filesystem */
public final class C68613NPj extends C232232tF {
    public final O6R A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67965Mxp(DbT.A0D(layoutInflater, viewGroup, R.layout.prompts_suggestion, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        N5Q n5q = (N5Q) r3;
        C67965Mxp mxp = (C67965Mxp) r4;
        boolean A1Z = AnonymousClass7TG.A1Z(n5q, mxp);
        O6R o6r = this.A00;
        0qQ.A0B(o6r, A1Z ? 1 : 0);
        mxp.A01 = n5q;
        mxp.A00 = o6r;
        mxp.A02.setText(n5q.A00);
    }

    public final Class modelClass() {
        return N5Q.class;
    }

    public C68613NPj(O6R o6r) {
        this.A00 = o6r;
    }
}
