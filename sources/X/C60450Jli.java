package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jli  reason: case insensitive filesystem */
public final class C60450Jli extends AnonymousClass3B3 {
    public final int A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        0qQ.A0B(rect, 0);
        DbZ.A0t(1, view, recyclerView, r9);
        super.getItemOffsets(rect, view, recyclerView, r9);
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) / 2;
        int measuredWidth = (recyclerView.getMeasuredWidth() - this.A00) / 2;
        int A03 = RecyclerView.A03(view);
        if (A03 <= 0) {
            rect.left = measuredWidth;
        } else {
            2Rw r0 = recyclerView.A0A;
            if (r0 == null || A03 != r0.getItemCount() - 1) {
                rect.left = dimensionPixelOffset;
            } else {
                rect.left = dimensionPixelOffset;
                rect.right = measuredWidth;
                return;
            }
        }
        rect.right = dimensionPixelOffset;
    }

    public C60450Jli(int i) {
        this.A00 = i;
    }
}
