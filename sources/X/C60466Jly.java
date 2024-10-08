package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jly  reason: case insensitive filesystem */
public final class C60466Jly extends AnonymousClass3B3 {
    public static final C63897LBb A01 = new Object();
    public final int A00;

    public C60466Jly(Context context, Integer num) {
        this.A00 = context.getResources().getDimensionPixelOffset(num == AnonymousClass05K.A01 ? R.dimen.abc_button_padding_horizontal_material : R.dimen.account_discovery_bottom_gap);
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
