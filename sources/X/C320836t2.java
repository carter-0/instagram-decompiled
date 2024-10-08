package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6t2  reason: invalid class name and case insensitive filesystem */
public final class C320836t2 extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r10) {
        int i;
        GridLayoutManager gridLayoutManager;
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        int A03 = RecyclerView.A03(view) - this.A01;
        if (A03 >= 0) {
            C252553pI r1 = recyclerView.A0D;
            if (!(r1 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) r1) == null) {
                i = 1;
            } else {
                i = gridLayoutManager.A00;
            }
            int i2 = A03 % i;
            int i3 = this.A00;
            int i4 = i3 / i;
            rect.left = i2 * i4;
            rect.right = i4 - ((i2 + 1) * i4);
            if (this.A02 || A03 >= i) {
                rect.top = i3;
            }
        }
    }

    public C320836t2(int i, boolean z, int i2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = i2;
    }
}
