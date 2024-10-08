package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlp  reason: case insensitive filesystem */
public final class C60457Jlp extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;

    public C60457Jlp(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        int i2 = this.A00;
        if (A03 != 0) {
            i2 /= 2;
        }
        rect.left = i2;
        int A032 = RecyclerView.A03(view);
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            i = r0.getItemCount();
        } else {
            i = 0;
        }
        int i3 = i - 1;
        int i4 = this.A01;
        if (A032 != i3) {
            i4 /= 2;
        }
        rect.right = i4;
    }
}
