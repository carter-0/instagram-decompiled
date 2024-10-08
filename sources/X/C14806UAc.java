package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.UAc  reason: case insensitive filesystem */
public final class C14806UAc extends AnonymousClass3B3 {
    public final int A00;
    public final Drawable A01;

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r12) {
        2Rw r0 = recyclerView.A0A;
        r0.getClass();
        int itemCount = r0.getItemCount();
        int i = this.A00;
        int i2 = itemCount / i;
        int paddingLeft = recyclerView.getPaddingLeft();
        int A0G = C13989Tnp.A0G(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (RecyclerView.A03(childAt) / i != i2 - 1) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                Drawable drawable = this.A01;
                drawable.setBounds(paddingLeft, bottom, A0G, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }

    public C14806UAc(Context context, int i) {
        this.A01 = context.getDrawable(2Yu.A0H(context, R.attr.horizontalDivider1px));
        this.A00 = i;
    }
}
