package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EpV  reason: case insensitive filesystem */
public abstract class C49106EpV {
    public static final void A00(View view, StringBuilder sb, int i) {
        sb.append(00p.A0f("  ", i));
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("|- ");
        A1A.append(view);
        A1A.append(10);
        sb.append(A1A.toString());
        if (view instanceof ViewGroup) {
            0kx r2 = new 0kx((ViewGroup) view);
            while (r2.hasNext()) {
                A00((View) r2.next(), sb, i + 1);
            }
        }
    }
}
