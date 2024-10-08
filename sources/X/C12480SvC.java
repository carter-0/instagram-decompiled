package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.SvC  reason: case insensitive filesystem */
public final class C12480SvC implements C13614Tdg {
    public final int A00;
    public final C13615Tdh A01;

    public C12480SvC(C13615Tdh tdh, int i) {
        this.A00 = i;
        this.A01 = tdh;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QEs, X.3kE] */
    public final C249703kE D72(ViewGroup viewGroup) {
        View A0C = DbT.A0C(Pxi.A0F(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_item_row);
        ? r2 = new C249703kE(A0C);
        r2.A01 = DbU.A0F(A0C, R.id.icon);
        r2.A04 = Dba.A06(A0C);
        r2.A03 = Dba.A05(A0C);
        r2.A02 = DbU.A0G(A0C, R.id.description);
        ViewStub viewStub = (ViewStub) A0C.requireViewById(R.id.rightView);
        r2.A00 = viewStub;
        r2.A05 = this.A01.D76(viewStub);
        return r2;
    }
}
