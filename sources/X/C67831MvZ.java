package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvZ  reason: case insensitive filesystem */
public final class C67831MvZ extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public C67831MvZ(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        int i;
        C51974G9v.A1O(rect, view, recyclerView, r6);
        if (RecyclerView.A03(view) == 0) {
            rect.left = this.A02;
            rect.right = this.A01;
            return;
        }
        if (RecyclerView.A03(view) == r6.A00() - 1) {
            rect.right = this.A00;
            i = this.A01;
        } else {
            i = this.A01;
            rect.right = i;
        }
        rect.left = i;
    }
}
