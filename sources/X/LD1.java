package X;

import android.view.View;
import java.lang.ref.WeakReference;

public abstract class LD1 {
    public WeakReference A00;
    public final float A01;
    public final float A02;

    public LD1(View view, float f, float f2) {
        0qQ.A0B(view, 1);
        this.A01 = f;
        this.A02 = f2;
        this.A00 = C51965G9l.A0v(view);
    }

    public final synchronized WeakReference A00() {
        return this.A00;
    }
}
