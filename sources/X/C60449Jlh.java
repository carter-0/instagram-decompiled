package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jlh  reason: case insensitive filesystem */
public final class C60449Jlh extends AnonymousClass3B3 {
    public final int A00;

    public C60449Jlh(int i) {
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        int i;
        Resources resources;
        int i2;
        switch (this.A00) {
            case 0:
                C51974G9v.A1O(rect, view, recyclerView, r7);
                super.getItemOffsets(rect, view, recyclerView, r7);
                int height = recyclerView.getHeight() / 2;
                int A03 = RecyclerView.A03(view);
                if (A03 == 0) {
                    rect.top = height;
                    return;
                } else if (A03 == r7.A00() - 1) {
                    rect.bottom = height;
                    return;
                } else {
                    return;
                }
            case 1:
                i = 0;
                0qQ.A0B(rect, 0);
                AnonymousClass7TG.A1U(view, recyclerView, r7);
                super.getItemOffsets(rect, view, recyclerView, r7);
                int A02 = DbS.A02(AnonymousClass7TE.A0S(recyclerView), 4);
                rect.left = A02;
                rect.right = A02;
                int A032 = RecyclerView.A03(view);
                if (A032 == 0) {
                    rect.left = 0;
                    return;
                } else if (A032 != r7.A00() - 1) {
                    return;
                }
                break;
            case 2:
                AnonymousClass7TG.A1N(rect, view);
                resources = view.getResources();
                i2 = R.dimen.afi_margin_top;
                break;
            case 3:
                C51974G9v.A1O(rect, view, recyclerView, r7);
                super.getItemOffsets(rect, view, recyclerView, r7);
                resources = view.getResources();
                i2 = R.dimen.abc_button_padding_horizontal_material;
                break;
            default:
                super.getItemOffsets(rect, view, recyclerView, r7);
                return;
        }
        i = resources.getDimensionPixelSize(i2);
        rect.right = i;
    }
}
