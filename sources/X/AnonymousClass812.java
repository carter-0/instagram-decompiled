package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.812  reason: invalid class name */
public final class AnonymousClass812 implements AnonymousClass2eo {
    public final /* synthetic */ AnonymousClass810 A00;

    public AnonymousClass812(AnonymousClass810 r1) {
        this.A00 = r1;
    }

    public final void Ann(Rect rect) {
        AnonymousClass0eM r1 = this.A00.A05;
        if (((View) r1.getValue()).isShown()) {
            ((View) r1.getValue()).getGlobalVisibleRect(rect);
        } else {
            rect.setEmpty();
        }
    }
}
