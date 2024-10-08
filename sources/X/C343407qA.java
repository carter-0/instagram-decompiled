package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.7qA  reason: invalid class name and case insensitive filesystem */
public final class C343407qA extends OrientationEventListener {
    public final /* synthetic */ C340547lR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C343407qA(Context context, C340547lR r2) {
        super(context);
        this.A00 = r2;
    }

    public final void onOrientationChanged(int i) {
        this.A00.A0N.DVY(i);
    }
}
