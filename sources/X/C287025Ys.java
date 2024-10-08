package X;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5Ys  reason: invalid class name and case insensitive filesystem */
public abstract class C287025Ys {
    public static final boolean A00(C286575Wy r2) {
        if (0fL.A02()) {
            0fL.A01(1744036670, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:40)");
        }
        if (0fL.A02()) {
            0fL.A01(1154605270, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = false;
        if ((((Configuration) C286615Xc.A01(AndroidCompositionLocals_androidKt.A00, C286565Wx.A04((C286565Wx) r2))).uiMode & 48) == 32) {
            z = true;
        }
        if (0fL.A02()) {
            0fL.A00(-2082198669);
        }
        if (0fL.A02()) {
            0fL.A00(751574677);
        }
        return z;
    }
}
