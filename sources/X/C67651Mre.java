package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.Mre  reason: case insensitive filesystem */
public final class C67651Mre extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int[] A00;

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.A00, C70385O4m.A00, Shader.TileMode.REPEAT);
    }

    public C67651Mre(int[] iArr) {
        this.A00 = iArr;
    }
}
