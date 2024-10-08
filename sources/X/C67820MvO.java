package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvO  reason: case insensitive filesystem */
public final class C67820MvO extends AnonymousClass3B3 {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r5) {
        C51974G9v.A1O(rect, view, recyclerView, r5);
        super.getItemOffsets(rect, view, recyclerView, r5);
        rect.right = AnonymousClass7TE.A0D(view.getResources());
    }
}
