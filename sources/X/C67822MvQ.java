package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.MvQ  reason: case insensitive filesystem */
public final class C67822MvQ extends AnonymousClass3B3 {
    public final /* synthetic */ C72286Ozv A00;

    public C67822MvQ(C72286Ozv ozv) {
        this.A00 = ozv;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        int itemCount = this.A00.A0C.getItemCount();
        if (A03 == 0) {
            rect.left = DbU.A05(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        } else if (A03 == itemCount - 1) {
            rect.right = DbU.A05(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        }
    }
}
