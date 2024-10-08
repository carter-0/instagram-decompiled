package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EqR  reason: case insensitive filesystem */
public abstract class C49160EqR {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.Dn8, X.3kE, java.lang.Object] */
    public static C46892Dn8 A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_badge_item);
        ? r1 = new C249703kE(A0C);
        r1.A03 = Dba.A06(A0C);
        r1.A01 = DbU.A0G(A0C, R.id.badge);
        r1.A02 = DbU.A0G(A0C, R.id.badge_lowpri);
        r1.A00 = A0C.requireViewById(R.id.row_divider);
        A0C.setTag(r1);
        return r1;
    }
}
