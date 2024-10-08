package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.9XP  reason: invalid class name */
public final class AnonymousClass9XP extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8QZ A01;

    public AnonymousClass9XP(AnonymousClass8QZ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Shader resize(int i, int i2) {
        float f;
        int i3;
        AnonymousClass8QZ r1 = this.A01;
        if (r1.A0Z) {
            f = (float) i;
            i3 = i - r1.A0E;
        } else {
            f = 0.0f;
            i3 = r1.A0E;
        }
        return new LinearGradient(f, 0.0f, (float) i3, 0.0f, new int[]{0, this.A00}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
