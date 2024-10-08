package X;

import android.graphics.Shader;
import android.os.Build;

/* renamed from: X.GRu  reason: case insensitive filesystem */
public abstract class C52417GRu {
    public static final Shader.TileMode A00(int i) {
        if (i != 0) {
            if (i == 1) {
                return Shader.TileMode.REPEAT;
            }
            if (i == 2) {
                return Shader.TileMode.MIRROR;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                return HRN.A00();
            }
        }
        return Shader.TileMode.CLAMP;
    }
}
