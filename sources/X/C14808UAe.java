package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAe  reason: case insensitive filesystem */
public final class C14808UAe extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C14808UAe(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        int i;
        int i2;
        if (3 - this.A00 != 0) {
            super.getItemOffsets(rect, view, recyclerView, r9);
            i = this.A01;
            i2 = this.A02;
        } else {
            super.getItemOffsets(rect, view, recyclerView, r9);
            if (((C17836Vgp) this.A03).A01.getItemViewType(RecyclerView.A03(view)) != 3) {
                i = this.A02;
                i2 = this.A01;
            } else {
                return;
            }
        }
        boolean A1Z = AnonymousClass7TG.A1Z(rect, view);
        0qQ.A0B(recyclerView, 2);
        int A032 = RecyclerView.A03(view) % 2;
        int i3 = i / 2;
        int i4 = i3;
        if (A032 == 0) {
            i4 = i2;
        }
        rect.left = i4;
        if (A032 == A1Z) {
            i3 = i2;
        }
        rect.right = i3;
        rect.bottom = i2;
    }
}
