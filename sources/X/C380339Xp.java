package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.9Xp  reason: invalid class name and case insensitive filesystem */
public final class C380339Xp extends OrientationEventListener {
    public final /* synthetic */ C380369Xs A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380339Xp(Context context, C380369Xs r2) {
        super(context);
        this.A00 = r2;
    }

    public final void onOrientationChanged(int i) {
        this.A00.A0U.DVY(i);
    }
}
