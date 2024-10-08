package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvS  reason: case insensitive filesystem */
public final class C67824MvS extends AnonymousClass3B3 {
    public final int A00;

    public C67824MvS(Context context, int i) {
        this.A00 = i + (DbY.A01(context) * 2);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        int i;
        boolean A1b = C51973G9u.A1b(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        int measuredWidth = view.getMeasuredWidth();
        Integer valueOf = Integer.valueOf(measuredWidth);
        int i2 = 0;
        if (measuredWidth <= 0 || valueOf == null) {
            measuredWidth = this.A00;
        }
        int measuredWidth2 = recyclerView.getMeasuredWidth();
        if (measuredWidth2 > 0) {
            i = (measuredWidth2 - measuredWidth) / 2;
        } else {
            i = 0;
        }
        int i3 = 0;
        if (A03 == 0) {
            i3 = i;
        }
        rect.left = i3;
        2Rw r0 = recyclerView.A0A;
        if (r0 != null && A03 == r0.getItemCount() - (A1b ? 1 : 0)) {
            i2 = i;
        }
        rect.right = i2;
    }
}
