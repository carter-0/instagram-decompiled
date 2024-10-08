package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DmT  reason: case insensitive filesystem */
public final class C46851DmT extends AnonymousClass3B3 {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int i;
        0qQ.A0B(rect, 0);
        DbZ.A0t(1, view, recyclerView, r8);
        super.getItemOffsets(rect, view, recyclerView, r8);
        try {
            i = DbY.A01(view.getContext());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A03 = RecyclerView.A03(view);
        rect.right = i;
        if (A03 == 0) {
            rect.left = i * 2;
            return;
        }
        2Rw r0 = recyclerView.A0A;
        if (r0 != null && A03 == r0.getItemCount() - 1) {
            rect.right = i * 2;
        }
    }
}
