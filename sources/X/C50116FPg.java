package X;

import android.view.ViewTreeObserver;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.FPg  reason: case insensitive filesystem */
public final class C50116FPg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SearchEditText A00;

    public C50116FPg(SearchEditText searchEditText) {
        this.A00 = searchEditText;
    }

    public final void onGlobalLayout() {
        SearchEditText searchEditText = this.A00;
        searchEditText.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (searchEditText.isAttachedToWindow()) {
            searchEditText.A06();
        }
    }
}
