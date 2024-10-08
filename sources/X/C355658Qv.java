package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.8Qv  reason: invalid class name and case insensitive filesystem */
public final class C355658Qv extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        int i = this.A01 - (this.A00 * 2);
        rect.right = i;
        if (RecyclerView.A03(view) == 0) {
            rect.left = i;
        }
    }

    public C355658Qv(Resources resources, int i) {
        this.A00 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A01 = resources.getDimensionPixelSize(i);
    }
}
