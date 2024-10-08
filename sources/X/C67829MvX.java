package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvX  reason: case insensitive filesystem */
public final class C67829MvX extends AnonymousClass3B3 {
    public int A00;
    public int A01 = 0;
    public final int A02;

    public C67829MvX(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        C51973G9u.A1E(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A03 == 0) {
            i = this.A00;
        } else {
            i = this.A02;
        }
        rect.left = i;
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            if (A03 == r0.getItemCount() - 1) {
                rect.right = this.A01;
            } else {
                rect.right = 0;
            }
        }
        if (0mk.A02(view.getContext())) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
    }
}
