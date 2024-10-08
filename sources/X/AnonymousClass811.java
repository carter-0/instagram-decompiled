package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.811  reason: invalid class name */
public final class AnonymousClass811 implements AnonymousClass2eo {
    public final /* synthetic */ AnonymousClass810 A00;

    public AnonymousClass811(AnonymousClass810 r1) {
        this.A00 = r1;
    }

    public final void Ann(Rect rect) {
        AnonymousClass0eM r1 = this.A00.A04;
        if (((View) r1.getValue()).isShown()) {
            ((View) r1.getValue()).getGlobalVisibleRect(rect);
        } else {
            rect.setEmpty();
        }
    }
}
