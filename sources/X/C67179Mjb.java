package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Mjb  reason: case insensitive filesystem */
public final class C67179Mjb extends C232222tE {
    public final int A00 = R.layout.title_row;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.3kE, X.MwA] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(this.A00, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setTypeface(AnonymousClass0qo.A00(AnonymousClass7TE.A0S(viewGroup)).A02(0qm.A13));
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(inflate, A1U ? 1 : 0);
        ? r0 = new C249703kE(inflate);
        r0.A00 = textView;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C67019Mgs mgs = (C67019Mgs) r3;
        C67866MwA mwA = (C67866MwA) r4;
        AnonymousClass7TG.A1N(mgs, mwA);
        mwA.A00.setText(mgs.A01);
    }

    public final Class modelClass() {
        return C67019Mgs.class;
    }
}
