package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jlo  reason: case insensitive filesystem */
public final class C60456Jlo extends AnonymousClass3B3 {
    public final /* synthetic */ float A00;
    public final /* synthetic */ LE4 A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r11) {
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1U(view, recyclerView, r11);
        super.getItemOffsets(rect, view, recyclerView, r11);
        int A03 = RecyclerView.A03(view);
        if (A03 == -1) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            int itemCount = r0.getItemCount();
            float f = this.A00;
            LE4 le4 = this.A01;
            Context context = le4.A04.getContext();
            int width = (le4.A02.getWidth() - AnonymousClass7TE.A05(f, context.getResources().getDimension(R.dimen.media_thumbnail_preview_item_height))) / 2;
            int A032 = DbS.A03(context.getResources(), R.dimen.abc_action_bar_elevation_material);
            if (A03 == 0) {
                rect.left = width;
                return;
            }
            rect.left = A032;
            if (A03 == itemCount - 1) {
                rect.right = width;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C60456Jlo(LE4 le4, float f) {
        this.A00 = f;
        this.A01 = le4;
    }
}
