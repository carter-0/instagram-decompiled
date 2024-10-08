package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class A64 {
    public final View A00;
    public final LithoView A01;
    public final RoundedCornerFrameLayout A02;

    public A64(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = AnonymousClass7TE.A0b(view, R.id.comment_row_view);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.comment_row_view_container);
        this.A02 = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setElevation(30.0f);
        Context A0S = AnonymousClass7TE.A0S(view);
        int A04 = (int) 0nA.A04(A0S, 6);
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(A04, 0, A04, 0);
        roundedCornerFrameLayout.setLayoutParams(marginLayoutParams);
        roundedCornerFrameLayout.setBackgroundColor(AnonymousClass7TF.A03(A0S, R.attr.elevatedBackgroundColor));
    }
}
