package X;

import android.graphics.Color;
import java.nio.FloatBuffer;

/* renamed from: X.Tsi  reason: case insensitive filesystem */
public final class C14260Tsi extends UmH {
    public final FloatBuffer A00 = FloatBuffer.allocate(4);

    public final void A00(float f, float f2, float f3, float f4) {
        FloatBuffer floatBuffer = this.A00;
        floatBuffer.put(0, f);
        floatBuffer.put(1, f2);
        floatBuffer.put(2, f3);
        floatBuffer.put(3, f4);
        this.A00 = true;
    }

    public C14260Tsi(int i) {
        super(i, 35666);
    }

    public final void A01(int i, float f) {
        A00((((float) Color.red(i)) * f) / 255.0f, (((float) Color.green(i)) * f) / 255.0f, (((float) Color.blue(i)) * f) / 255.0f, f);
    }
}
