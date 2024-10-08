package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4Ab  reason: invalid class name and case insensitive filesystem */
public abstract class C261564Ab {
    public static final void A00(ViewGroup viewGroup, View view, int i) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(view, 2);
        View findViewById = viewGroup.findViewById(i);
        viewGroup.addView(view, viewGroup.indexOfChild(findViewById));
        int i2 = view.getLayoutParams().height;
        C377089Km r1 = new C377089Km(findViewById, 47);
        if (!(i2 == -1 || i2 == -2)) {
            r1.invoke(Integer.valueOf(i2));
        }
        int i3 = view.getLayoutParams().width;
        C377089Km r12 = new C377089Km(findViewById, 48);
        if (!(i3 == -1 || i3 == -2)) {
            r12.invoke(Integer.valueOf(i3));
        }
        view.setId(findViewById.getId());
        view.setLayoutParams(findViewById.getLayoutParams());
        viewGroup.removeView(findViewById);
    }
}
