package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.GiN  reason: case insensitive filesystem */
public final class C53089GiN extends AnonymousClass3B3 {
    public final int A00;
    public final int A01 = 3;

    public C53089GiN(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int i;
        0qQ.A0B(rect, 0);
        DbZ.A0t(1, view, recyclerView, r8);
        super.getItemOffsets(rect, view, recyclerView, r8);
        int A03 = RecyclerView.A03(view);
        C252553pI r0 = recyclerView.A0D;
        if (r0 != null) {
            i = r0.A0U();
        } else {
            i = 1;
        }
        int i2 = this.A01;
        if (A03 / i2 < (i - 1) / i2) {
            rect.bottom = this.A00;
        }
    }
}
