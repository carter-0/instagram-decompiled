package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlq  reason: case insensitive filesystem */
public final class C60458Jlq extends AnonymousClass3B3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        C51973G9u.A1E(rect, view, recyclerView);
        if (recyclerView.A0A != null) {
            int A03 = RecyclerView.A03(view);
            if (A03 == 0) {
                int i = this.A00;
                int i2 = this.A01;
                rect.set(i, i2, 0, i2);
                return;
            }
            2Rw r0 = recyclerView.A0A;
            0qQ.A0A(r0);
            int itemCount = r0.getItemCount() - 1;
            int i3 = this.A01;
            if (A03 == itemCount) {
                rect.set(0, i3, this.A00, i3);
            } else {
                rect.set(0, i3, 0, i3);
            }
        }
    }

    public C60458Jlq(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
