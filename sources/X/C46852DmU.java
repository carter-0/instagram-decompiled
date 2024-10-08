package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.DmU  reason: case insensitive filesystem */
public final class C46852DmU extends AnonymousClass3B3 {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1U(view, recyclerView, r6);
        super.getItemOffsets(rect, view, recyclerView, r6);
        rect.right = view.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }
}
