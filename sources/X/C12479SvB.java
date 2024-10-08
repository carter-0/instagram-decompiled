package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.SvB  reason: case insensitive filesystem */
public final class C12479SvB implements C13614Tdg {
    public final int A00;

    public C12479SvB(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3kE, X.QEo] */
    public final C249703kE D72(ViewGroup viewGroup) {
        View A0C = DbT.A0C(Pxi.A0F(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_header_view);
        ? r2 = new C249703kE(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.hub_header);
        r2.A01 = A0G;
        A0G.setFocusable(true);
        r2.A00 = DbU.A0G(A0C, R.id.cta_button);
        03v.A0I(r2.A01, true);
        2eS.A01(r2.A00);
        return r2;
    }
}
