package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.71J  reason: invalid class name */
public final class AnonymousClass71J extends AnonymousClass3B3 {
    public final /* synthetic */ int A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        if (RecyclerView.A03(view) == 0) {
            rect.set(this.A00, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public AnonymousClass71J(int i) {
        this.A00 = i;
    }
}
