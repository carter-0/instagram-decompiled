package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Mno  reason: case insensitive filesystem */
public final class C67433Mno extends C249703kE {
    public final int A00;

    public C67433Mno(View view) {
        super(view);
        if ((view.getTag() instanceof C67431Mnm) || (view.getTag() instanceof PJR)) {
            Resources resources = view.getResources();
            this.A00 = resources.getDimensionPixelSize(R.dimen.action_button_min_width);
            resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
            return;
        }
        throw DbT.A0m();
    }
}
