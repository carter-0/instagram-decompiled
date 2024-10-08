package X;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.6A9  reason: invalid class name */
public final class AnonymousClass6A9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final /* synthetic */ SearchEditText A01;

    public AnonymousClass6A9(SearchEditText searchEditText) {
        this.A01 = searchEditText;
    }

    public final void onGlobalLayout() {
        RecyclerView recyclerView;
        SearchEditText searchEditText = this.A01;
        int height = searchEditText.getHeight();
        Resources resources = searchEditText.getResources();
        int dimensionPixelSize = height - resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        if (this.A00 != dimensionPixelSize) {
            C20861X1n x1n = searchEditText.A0A;
            if (!(x1n == null || (recyclerView = ((C19770WfB) x1n).A00.A0F().A00) == null)) {
                0nA.A0e(recyclerView, dimensionPixelSize);
            }
            this.A00 = dimensionPixelSize;
        }
        int lineCount = searchEditText.getLineCount();
        int i = R.dimen.accent_edge_thickness;
        if (lineCount > 1) {
            i = R.dimen.account_discovery_bottom_gap;
        }
        0nA.A0i(searchEditText, resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i));
    }
}
