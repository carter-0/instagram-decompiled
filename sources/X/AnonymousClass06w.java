package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.06w  reason: invalid class name */
public final class AnonymousClass06w extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ 0hn A01;

    public AnonymousClass06w(Rect rect, 0hn r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.A00;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
