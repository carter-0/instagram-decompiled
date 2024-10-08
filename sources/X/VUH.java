package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class VUH {
    public int A00;
    public final ColorStateList A01;
    public final Shader A02;

    public VUH(ColorStateList colorStateList, Shader shader, int i) {
        this.A02 = shader;
        this.A01 = colorStateList;
        this.A00 = i;
    }
}
