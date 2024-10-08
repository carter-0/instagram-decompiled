package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3V6  reason: invalid class name */
public final class AnonymousClass3V6 {
    public double A00 = 3.3d;
    public final RecyclerView A01;
    public final UserSession A02;

    public AnonymousClass3V6(ViewStub viewStub, UserSession userSession) {
        0qQ.A0B(viewStub, 1);
        this.A02 = userSession;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) inflate;
        this.A01 = recyclerView;
        int A002 = A00(this);
        double d = this.A00;
        Context context = this.A01.getContext();
        0qQ.A07(context);
        0nA.A0V(recyclerView, (int) ((((((double) AnonymousClass0nB.A01(context)) - ((Math.floor(d) + 1.0d) * ((double) A002))) / d) / 1.0d) + ((double) (A002 * 2))));
        0nA.A0i(recyclerView, A002, A002);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.A11(new AnonymousClass3V7(A002, A002));
    }

    public static final int A00(AnonymousClass3V6 r6) {
        Context context = r6.A01.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (!182.A06(0Tu.A05, r6.A02, 36323105358228321L)) {
            return dimensionPixelSize;
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        r6.A00 = 3.4d;
        return dimensionPixelSize2;
    }
}
