package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jll  reason: case insensitive filesystem */
public final class C60453Jll extends AnonymousClass3B3 {
    public final int A00;

    public C60453Jll(Context context) {
        this.A00 = (int) (((((double) 0nA.A09(context)) - (((double) context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height)) * 4.5d)) - ((double) (JTR.A05(context) * 2))) / Math.ceil(4.5d));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r5) {
        C51974G9v.A1O(rect, view, recyclerView, r5);
        super.getItemOffsets(rect, view, recyclerView, r5);
        if (RecyclerView.A03(view) == 0) {
            rect.left = this.A00;
        }
        rect.right = this.A00;
    }
}
