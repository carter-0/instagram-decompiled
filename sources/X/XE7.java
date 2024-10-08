package X;

import android.content.Context;
import android.widget.EdgeEffect;

public final class XE7 extends EdgeEffect {
    public float A00;
    public final float A01;

    public final void onAbsorb(int i) {
        this.A00 = 0.0f;
        super.onAbsorb(i);
    }

    public final void onPull(float f) {
        this.A00 = 0.0f;
        super.onPull(f);
    }

    public final void onRelease() {
        this.A00 = 0.0f;
        super.onRelease();
    }

    public XE7(Context context) {
        super(context);
        this.A01 = 1.0f * AnonymousClass5QG.A00(context).AwL();
    }

    public final void onPull(float f, float f2) {
        this.A00 = 0.0f;
        super.onPull(f, f2);
    }
}
