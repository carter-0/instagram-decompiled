package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Sv6  reason: case insensitive filesystem */
public final class C12474Sv6 implements C13614Tdg {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, X.QEl] */
    public final C249703kE D72(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AnonymousClass2E0.A0E();
        View A0C = DbT.A0C(Pxi.A0F(context, R.style.Ig4aFbPay), viewGroup, R.layout.hub_disclaimer_item_row);
        ? r1 = new C249703kE(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.disclaimer);
        r1.A00 = A0G;
        DbT.A1H(A0G);
        return r1;
    }
}
