package X;

import android.view.View;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.UjS  reason: case insensitive filesystem */
public final class C15842UjS extends AnonymousClass3NK {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (!view.isEnabled()) {
            return false;
        }
        view.performHapticFeedback(3);
        this.A00.A01();
        return true;
    }

    public C15842UjS(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }
}
