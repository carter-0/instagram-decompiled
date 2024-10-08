package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.HwN  reason: case insensitive filesystem */
public abstract class C56310HwN {
    public static final void A00(C53157GjT gjT) {
        View view = gjT.A07;
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        int A03 = AnonymousClass7TF.A03(view.getContext(), R.attr.igdsHighlightBackground);
        view.setBackgroundColor(A03);
        View view2 = gjT.A00;
        if (view2 != null) {
            view2.setBackgroundColor(A03);
        }
        gjT.A0B.setBackgroundColor(A03);
    }

    public static final void A01(C53157GjT gjT, int i) {
        gjT.A09.setVisibility(i);
        gjT.A0G.setVisibility(i);
    }
}
