package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Oli  reason: case insensitive filesystem */
public final class C71493Oli implements AnonymousClass03Q {
    public static final C71493Oli A00 = new C71493Oli();

    public final 04k Cvn(View view, 04k r5) {
        AnonymousClass7TG.A1N(view, r5);
        02M A05 = r5.A00.A05(7);
        0qQ.A07(A05);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = A05.A03;
            marginLayoutParams.bottomMargin = A05.A00;
            view.setLayoutParams(marginLayoutParams);
            return 04k.A01;
        }
        throw AnonymousClass7TE.A11(AnonymousClass000.A00(18));
    }
}
