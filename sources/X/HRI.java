package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerElement;

public abstract class HRI {
    public static final Modifier A00(Modifier modifier, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            return modifier;
        }
        long j = C285605Ry.A01;
        AnonymousClass5S2 r1 = AnonymousClass5S0.A00;
        long j2 = AnonymousClass5RV.A00;
        return modifier.Ezh(new GraphicsLayerElement(r1, f3, f4, 1.0f, 0.0f, j, j2, j2, false));
    }
}
