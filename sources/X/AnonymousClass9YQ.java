package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9YQ  reason: invalid class name */
public final class AnonymousClass9YQ extends AnonymousClass3B3 {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int i;
        boolean A1Z = AnonymousClass7TG.A1Z(rect, view);
        AnonymousClass7TG.A1Q(recyclerView, r8);
        super.getItemOffsets(rect, view, recyclerView, r8);
        try {
            i = AnonymousClass7TG.A03(view.getContext());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A03 = RecyclerView.A03(view);
        if (A03 == 0) {
            rect.left = AnonymousClass7TG.A02(view.getContext());
        } else {
            2Rw r0 = recyclerView.A0A;
            if (r0 != null && A03 == r0.getItemCount() - (A1Z ? 1 : 0)) {
                i = AnonymousClass7TG.A02(view.getContext());
            }
        }
        rect.right = i;
    }
}
