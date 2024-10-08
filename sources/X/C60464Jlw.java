package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlw  reason: case insensitive filesystem */
public final class C60464Jlw extends AnonymousClass3B3 {
    public final C320806sz A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C60464Jlw(C320806sz r2, int i) {
        this.A00 = r2;
        this.A02 = i;
        int i2 = i / 3;
        this.A03 = i2;
        this.A01 = i2 * 2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r11) {
        int i;
        AnonymousClass7TG.A1N(rect, view);
        0qQ.A0B(recyclerView, 2);
        int A032 = RecyclerView.A03(view);
        C320806sz r4 = this.A00;
        if (r4.A00(A032) != 3) {
            int i2 = 0;
            for (int i3 = 0; i3 < A032; i3++) {
                if (r4.A00(i3) == 3) {
                    i2++;
                }
            }
            int i4 = (A032 - i2) % 3;
            int i5 = 0;
            if (i4 == 0) {
                i = 0;
            } else if (i4 != 2) {
                i = this.A03;
            } else {
                i = this.A01;
            }
            rect.left = i;
            if (i4 == 0) {
                i5 = this.A01;
            } else if (i4 != 2) {
                i5 = this.A03;
            }
            rect.right = i5;
        }
        rect.bottom = this.A02;
    }
}
