package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvP  reason: case insensitive filesystem */
public final class C67821MvP extends AnonymousClass3B3 {
    public final int A00;

    public C67821MvP(int i) {
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        C51974G9v.A1O(rect, view, recyclerView, r8);
        super.getItemOffsets(rect, view, recyclerView, r8);
        if (recyclerView.A0A != null) {
            int A03 = RecyclerView.A03(view);
            int i = this.A00;
            int i2 = i;
            if (A03 == 0) {
                i *= 2;
            }
            rect.left = i;
            int i3 = 0;
            if (A03 == r8.A00() - 1) {
                i3 = i2 * 2;
            }
            rect.right = i3;
        }
    }
}
