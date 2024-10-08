package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.SvD  reason: case insensitive filesystem */
public final class C12481SvD implements C13614Tdg {
    public final int A00;

    public C12481SvD(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, X.QEm] */
    public final C249703kE D72(ViewGroup viewGroup) {
        View A0C = DbT.A0C(Pxi.A0F(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_link_item_row);
        ? r1 = new C249703kE(A0C);
        TextView A06 = Dba.A06(A0C);
        r1.A00 = A06;
        2eS.A01(A06);
        return r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12481SvD() {
        this(R.style.Ig4aFbPay);
        AnonymousClass2E0.A0E();
    }
}
