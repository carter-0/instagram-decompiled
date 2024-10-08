package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Kaq  reason: case insensitive filesystem */
public final class C62137Kaq extends C361648gZ {
    public final int A00;
    public final Resources A01;

    public C62137Kaq(Resources resources, int i, int i2, int i3, int i4, int i5) {
        super(false, i2, i3, i4, i5);
        this.A01 = resources;
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        0qQ.A0B(r9, 3);
        if (this.A00 != 3) {
            Resources resources = this.A01;
            int A0C = AnonymousClass7TE.A0C(resources);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            rect.bottom = resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(A0C, dimensionPixelSize2, A0C, dimensionPixelSize);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, r9);
    }
}
