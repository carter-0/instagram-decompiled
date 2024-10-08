package X;

import android.graphics.Path;
import android.graphics.RectF;

public final class VXC {
    public final float A00;
    public final Path A01;
    public final RectF A02;

    public VXC(float f) {
        Path path;
        this.A00 = f;
        if (f > 0.0f) {
            path = new Path();
        } else {
            path = null;
        }
        this.A01 = path;
        this.A02 = new RectF();
    }
}
