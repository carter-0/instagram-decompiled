package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.06s  reason: invalid class name and case insensitive filesystem */
public final class C587506s extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ 0hn A01;

    public C587506s(Rect rect, 0hn r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.A00;
    }
}
