package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3V7  reason: invalid class name */
public final class AnonymousClass3V7 extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        int A03 = RecyclerView.A03(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A03 == 0) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        rect.left = i;
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            if (A03 == r0.getItemCount() - 1) {
                rect.right = this.A02;
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

    public AnonymousClass3V7(int i, int i2) {
        this.A01 = i;
        this.A02 = i;
        this.A00 = i2;
    }
}
