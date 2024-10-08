package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DmV  reason: case insensitive filesystem */
public final class C46853DmV extends AnonymousClass3B3 {
    public final int A00;

    public C46853DmV(int i) {
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                0qQ.A0B(rect, 0);
                AnonymousClass7TF.A1B(view, 1, recyclerView);
                int A03 = RecyclerView.A03(view);
                rect.left = 20;
                rect.right = 20;
                if (A03 == 1) {
                    i = 32;
                    break;
                } else {
                    return;
                }
            case 1:
                0qQ.A0B(rect, 0);
                AnonymousClass7TG.A1U(view, recyclerView, r7);
                super.getItemOffsets(rect, view, recyclerView, r7);
                try {
                    i2 = AnonymousClass7TG.A02(view.getContext());
                } catch (Resources.NotFoundException unused) {
                    i2 = 0;
                }
                rect.bottom = i2;
                return;
            default:
                0qQ.A0B(rect, 0);
                AnonymousClass7TG.A1U(view, recyclerView, r7);
                super.getItemOffsets(rect, view, recyclerView, r7);
                try {
                    i3 = DbY.A01(view.getContext());
                } catch (Resources.NotFoundException unused2) {
                    i3 = 0;
                }
                int A032 = RecyclerView.A03(view);
                rect.right = i3;
                if (A032 == 0) {
                    i = AnonymousClass7TG.A02(view.getContext());
                    break;
                } else {
                    return;
                }
        }
        rect.left = i;
    }
}
