package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvR  reason: case insensitive filesystem */
public final class C67823MvR extends AnonymousClass3B3 {
    public final Context A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r11) {
        boolean A1b = C51973G9u.A1b(rect, view, recyclerView);
        Context context = this.A00;
        int A03 = AnonymousClass7TG.A03(context);
        int A06 = 0nA.A06(context) / 2;
        int A01 = A06 - (C66582MXn.A01(context) / 2);
        int A032 = RecyclerView.A03(view);
        2Rw r0 = recyclerView.A0A;
        if (r0 != null && r0.getItemCount() == A1b) {
            rect.set(A01, 0, A01, 0);
        } else if (A032 == 0) {
            rect.set(A06, 0, A03, 0);
        } else {
            2Rw r02 = recyclerView.A0A;
            if (r02 == null || A032 != r02.getItemCount() - (A1b ? 1 : 0)) {
                rect.set(A03, 0, A03, 0);
            } else {
                rect.set(A03, 0, A01, 0);
            }
        }
    }

    public C67823MvR(Context context) {
        this.A00 = context;
    }
}
