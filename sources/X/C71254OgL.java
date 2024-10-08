package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.OgL  reason: case insensitive filesystem */
public final class C71254OgL implements Drawable.Callback {
    public final /* synthetic */ C68449NIn A00;

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C71254OgL(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void invalidateDrawable(Drawable drawable) {
        IgEditText igEditText = this.A00.A0H;
        if (igEditText == null) {
            0qQ.A0F("noteEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igEditText.invalidate();
        }
    }
}
