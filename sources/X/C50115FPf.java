package X;

import android.view.ViewTreeObserver;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.FPf  reason: case insensitive filesystem */
public final class C50115FPf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public C50115FPf(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    public final void onGlobalLayout() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        igdsInlineSearchBox.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (igdsInlineSearchBox.isAttachedToWindow()) {
            igdsInlineSearchBox.A04();
        }
    }
}
