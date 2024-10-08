package X;

import java.util.Arrays;

/* renamed from: X.6Dc  reason: invalid class name and case insensitive filesystem */
public abstract class C304346Dc {
    public static final String A00(C286575Wy r2, int i) {
        if (0fL.A02()) {
            0fL.A01(2099468597, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = C304356Dd.A00(r2).getString(i);
        if (0fL.A02()) {
            0fL.A00(-1941716134);
        }
        return string;
    }

    public static final String A01(C286575Wy r2, Object[] objArr, int i) {
        if (0fL.A02()) {
            0fL.A01(261738968, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = C304356Dd.A00(r2).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (0fL.A02()) {
            0fL.A00(1247112439);
        }
        return string;
    }

    public static final String A02(C286575Wy r2, Object[] objArr, int i, int i2) {
        if (0fL.A02()) {
            0fL.A01(1599018698, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = C304356Dd.A00(r2).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (0fL.A02()) {
            0fL.A00(-1439606766);
        }
        return quantityString;
    }
}
