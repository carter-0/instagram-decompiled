package X;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* renamed from: X.9O0  reason: invalid class name */
public final class AnonymousClass9O0 extends ComposeShader implements AnonymousClass7OE {
    public final Shader A00;
    public final Shader A01;

    public final void Eov(int i) {
        Shader shader = this.A00;
        if (shader instanceof AnonymousClass7OE) {
            ((AnonymousClass7OE) shader).Eov(i);
        }
        Shader shader2 = this.A01;
        if (shader2 instanceof AnonymousClass7OE) {
            ((AnonymousClass7OE) shader2).Eov(i);
        }
    }

    public AnonymousClass9O0(Shader shader, Shader shader2, PorterDuff.Mode mode) {
        super(shader, shader2, mode);
        this.A00 = shader;
        this.A01 = shader2;
    }
}
