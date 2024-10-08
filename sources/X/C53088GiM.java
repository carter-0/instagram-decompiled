package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GiM  reason: case insensitive filesystem */
public final class C53088GiM extends AnonymousClass3B3 {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        int i;
        C51974G9v.A1O(rect, view, recyclerView, r6);
        super.getItemOffsets(rect, view, recyclerView, r6);
        try {
            i = DbY.A01(view.getContext());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A03 = RecyclerView.A03(view);
        rect.right = i;
        if (A03 == 0) {
            rect.left = i * 2;
        }
    }
}
