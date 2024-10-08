package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.DmX  reason: case insensitive filesystem */
public final class C46855DmX extends AnonymousClass3B3 {
    public final int A00;

    public C46855DmX(Context context) {
        this.A00 = I7E.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        int i2 = this.A00;
        int i3 = i2;
        if (A03 != 0) {
            i2 /= 2;
        }
        rect.left = i2;
        int A032 = RecyclerView.A03(view);
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            i = r0.getItemCount();
        } else {
            i = 0;
        }
        if (A032 != i - 1) {
            i3 /= 2;
        }
        rect.right = i3;
    }
}
