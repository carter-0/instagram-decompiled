package X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Djp  reason: case insensitive filesystem */
public final class C46718Djp extends FrameLayout {
    public 2dZ A00;
    public SearchEditText A01;

    public final ImageView getBackButton() {
        2dZ r0 = this.A00;
        if (r0 != null) {
            return r0.A0Q();
        }
        0qQ.A0F("actionBarService");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SearchEditText getEditText() {
        SearchEditText searchEditText = this.A01;
        if (searchEditText != null) {
            return searchEditText;
        }
        0qQ.A0F("_editText");
        throw AnonymousClass00P.createAndThrow();
    }
}
