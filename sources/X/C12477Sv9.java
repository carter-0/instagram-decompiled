package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Sv9  reason: case insensitive filesystem */
public final class C12477Sv9 implements C13614Tdg {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.QEq, X.3kE] */
    public final C249703kE D72(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AnonymousClass2E0.A0E();
        View A0C = DbT.A0C(Pxi.A0F(context, R.style.Ig4aFbPay), viewGroup, R.layout.hub_text_item_row);
        ? r1 = new C249703kE(A0C);
        r1.A03 = Dba.A06(A0C);
        r1.A02 = Dba.A05(A0C);
        r1.A01 = DbU.A0G(A0C, R.id.additional_info);
        r1.A00 = DbU.A0F(A0C, R.id.icon);
        return r1;
    }
}
