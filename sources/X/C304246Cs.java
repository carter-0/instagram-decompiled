package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationModifierElement;

/* renamed from: X.6Cs  reason: invalid class name and case insensitive filesystem */
public abstract class C304246Cs {
    public static final Modifier A00(Modifier modifier, Integer num, boolean z, boolean z2) {
        0qQ.A0B(modifier, 0);
        0qQ.A0B(num, 1);
        if (!z) {
            return modifier;
        }
        if (num != AnonymousClass05K.A00) {
            modifier = modifier.Ezh(new ThreadDecorationModifierElement(num));
        }
        if (!z2 || num == AnonymousClass05K.A0Y) {
            return modifier;
        }
        return modifier.Ezh(C287195Zj.A0B(Modifier.A00, 60.0f - 12.0f, 0.0f, 0.0f, 0.0f));
    }
}
