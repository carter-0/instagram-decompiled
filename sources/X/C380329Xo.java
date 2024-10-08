package X;

import android.content.Context;
import android.view.OrientationEventListener;
import java.lang.ref.WeakReference;

/* renamed from: X.9Xo  reason: invalid class name and case insensitive filesystem */
public final class C380329Xo extends OrientationEventListener {
    public final WeakReference A00;

    public final void onOrientationChanged(int i) {
        C345867uD r3 = (C345867uD) this.A00.get();
        if (r3 != null) {
            int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
            int i3 = r3.A01;
            if (!r3.A07) {
                i3 = C345867uD.A00(r3);
            }
            if (r3.A00 != i2 || r3.A01 != i3) {
                r3.A00 = i2;
                r3.A01 = i3;
                C345867uD.A01(r3);
            }
        }
    }

    public C380329Xo(Context context, WeakReference weakReference) {
        super(context);
        this.A00 = weakReference;
    }
}
