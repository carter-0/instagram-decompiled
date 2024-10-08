package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;

/* renamed from: X.71I  reason: invalid class name */
public abstract class AnonymousClass71I {
    public static final void A00(Context context, AnonymousClass71H r5, Integer num) {
        NestableRecyclerView nestableRecyclerView = r5.A09;
        nestableRecyclerView.setPassThroughEdge(2);
        if (r5.A00 != num) {
            r5.A00 = num;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            nestableRecyclerView.setLayoutManager(linearLayoutManager);
            linearLayoutManager.A0v(true);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            while (nestableRecyclerView.A12.size() > 0) {
                nestableRecyclerView.A0n(0);
            }
            if (num == AnonymousClass05K.A0C) {
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                0nA.A0Z(nestableRecyclerView, dimensionPixelOffset);
                0nA.A0b(nestableRecyclerView, dimensionPixelOffset);
                nestableRecyclerView.setClipToPadding(false);
                nestableRecyclerView.setClipChildren(false);
            } else {
                0nA.A0Z(nestableRecyclerView, 0);
                0nA.A0b(nestableRecyclerView, 0);
                nestableRecyclerView.A11(new AnonymousClass71J(dimensionPixelSize));
            }
            nestableRecyclerView.A0i();
        }
    }
}
