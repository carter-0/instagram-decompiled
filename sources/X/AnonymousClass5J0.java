package X;

import androidx.window.extensions.WindowExtensionsProvider;
import java.util.Map;

/* renamed from: X.5J0  reason: invalid class name */
public final class AnonymousClass5J0 {
    public static final int A00() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }

    static {
        Map map = 0Yh.A03;
        0q1.A01(AnonymousClass5J0.class);
    }
}
