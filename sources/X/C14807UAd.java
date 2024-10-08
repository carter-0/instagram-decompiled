package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAd  reason: case insensitive filesystem */
public final class C14807UAd extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;

    public C14807UAd(Context context, int i) {
        this.A00 = DbY.A01(context);
        this.A01 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        int A03 = RecyclerView.A03(view);
        int i = this.A01;
        int i2 = A03 % i;
        rect.setEmpty();
        if (i2 < i - 1) {
            rect.right = this.A00;
        }
    }
}
