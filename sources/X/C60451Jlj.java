package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Jlj  reason: case insensitive filesystem */
public final class C60451Jlj extends AnonymousClass3B3 {
    public final List A00;

    public C60451Jlj(List list) {
        this.A00 = list;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        L40 l40;
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        if (A03 != -1) {
            List list = this.A00;
            if (A03 < list.size()) {
                l40 = (L40) list.get(A03);
            } else {
                l40 = null;
            }
            if (l40 instanceof KMF) {
                KMF kmf = (KMF) l40;
                rect.left = kmf.A02;
                rect.right = kmf.A03;
            }
        }
    }
}
