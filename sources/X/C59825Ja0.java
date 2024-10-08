package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Ja0  reason: case insensitive filesystem */
public final class C59825Ja0 extends AnonymousClass3B3 {
    public final float A00;

    public C59825Ja0(float f) {
        this.A00 = f;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        C51974G9v.A1O(rect, view, recyclerView, r6);
        super.getItemOffsets(rect, view, recyclerView, r6);
        if (RecyclerView.A03(view) == 0) {
            rect.left = (int) this.A00;
        } else if (RecyclerView.A03(view) == r6.A00() - 1) {
            rect.right = (int) this.A00;
        }
    }
}
