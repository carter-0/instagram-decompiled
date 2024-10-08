package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAf  reason: case insensitive filesystem */
public final class C14809UAf extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        int i2 = 0;
        C51973G9u.A1E(rect, view, recyclerView);
        int A032 = RecyclerView.A03(view);
        rect.top = 0;
        rect.bottom = 0;
        boolean z = this.A03;
        if (A032 == 0) {
            i2 = this.A02;
        }
        if (z) {
            rect.right = i2;
        } else {
            rect.left = i2;
        }
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            if (A032 == r0.getItemCount() - 1) {
                i = this.A01;
            } else {
                i = this.A00;
            }
            if (z) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }

    public C14809UAf(Context context, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = 0mk.A02(context);
        this.A01 = i + i3;
    }
}
