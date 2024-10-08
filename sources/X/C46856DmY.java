package X;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.DmY  reason: case insensitive filesystem */
public final class C46856DmY extends AnonymousClass3B3 {
    public final int A00;
    public final Object A01;

    public C46856DmY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                if (RecyclerView.A03(view) != 0) {
                    rect.left = DbY.A01(((C49706F2r) this.A01).A01.getContext());
                    return;
                }
                return;
            case 1:
                AnonymousClass7TG.A1T(rect, view, recyclerView);
                A03 = RecyclerView.A03(view);
                2Rw r0 = recyclerView.A0A;
                if (r0 != null) {
                    i = r0.getItemCount();
                } else {
                    i = 0;
                }
                if (A03 == 0) {
                    rect.top = DbV.A05((Fragment) this.A01).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                    return;
                }
                break;
            default:
                AnonymousClass7TG.A1T(rect, view, recyclerView);
                A03 = RecyclerView.A03(view);
                2Rw r02 = recyclerView.A0A;
                if (r02 == null) {
                    i = 0;
                    break;
                } else {
                    i = r02.getItemCount();
                    break;
                }
        }
        if (A03 == i - 1) {
            rect.bottom = DbZ.A02((Fragment) this.A01);
        }
    }
}
