package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MvW  reason: case insensitive filesystem */
public final class C67828MvW extends AnonymousClass3B3 {
    public final int A00;
    public final Context A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r10) {
        int i;
        boolean A1b = C51973G9u.A1b(rect, view, recyclerView);
        Resources resources = this.A01.getResources();
        float applyDimension = TypedValue.applyDimension(A1b ? 1 : 0, (float) this.A00, resources.getDisplayMetrics());
        C252553pI r1 = recyclerView.A0D;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i2 = ((GridLayoutManager) r1).A00;
        float f = (float) i2;
        if (applyDimension > f) {
            i = AnonymousClass1GB.A01(applyDimension / f);
        } else {
            i = 1;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(9));
        int bindingAdapterPosition = ((AnonymousClass3MX) layoutParams).mViewHolder.getBindingAdapterPosition();
        int i3 = i * i2;
        if (bindingAdapterPosition < i2) {
            i3 = 0;
        }
        rect.top = i3;
        rect.bottom = 0;
        int i4 = bindingAdapterPosition % i2;
        rect.left = i4 * i;
        rect.right = ((i2 - i4) - A1b) * i;
    }

    public C67828MvW(Context context, int i) {
        this.A01 = context;
        this.A00 = i;
    }
}
