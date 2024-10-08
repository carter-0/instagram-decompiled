package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* renamed from: X.Emt  reason: case insensitive filesystem */
public abstract class C48955Emt {
    public static final View A00(Context context, HorizontalFlowLayout horizontalFlowLayout, int i) {
        View A0C = DbT.A0C(LayoutInflater.from(context), horizontalFlowLayout, R.layout.subinterest_pill_shimmer);
        0qQ.A0A(A0C);
        0nA.A0f(A0C, AnonymousClass7TF.A02(context, i));
        return A0C;
    }
}
