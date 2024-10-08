package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlr  reason: case insensitive filesystem */
public final class C60459Jlr extends AnonymousClass3B3 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C60459Jlr(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                if (RecyclerView.A03(view) == 0) {
                    rect.set(this.A01, 0, 0, 0);
                    return;
                } else {
                    rect.set(0, 0, 0, 0);
                    return;
                }
            case 1:
                AnonymousClass7TG.A1N(rect, view);
                AnonymousClass7TF.A1C(recyclerView, 2, r8);
                super.getItemOffsets(rect, view, recyclerView, r8);
                int A03 = RecyclerView.A03(view);
                C66519MUx mUx = (C66519MUx) this.A02;
                if (mUx.By6(A03, 2) != 2 && mUx.Ap7(A03, 2) != 0) {
                    rect.left = this.A01;
                    return;
                }
                return;
            default:
                int A032 = RecyclerView.A03(view);
                if (A032 < 3) {
                    i = 0;
                } else {
                    i = this.A01;
                }
                if (A032 % 3 == 0) {
                    i2 = 0;
                } else {
                    i2 = this.A01;
                }
                rect.set(i2, i, 0, 0);
                return;
        }
    }
}
