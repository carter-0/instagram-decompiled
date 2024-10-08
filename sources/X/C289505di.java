package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5di  reason: invalid class name and case insensitive filesystem */
public abstract class C289505di {
    public static final long A00(C286575Wy r2, int i) {
        if (0fL.A02()) {
            0fL.A01(615015746, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context = (Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04((C286565Wx) r2));
        long color = ((long) context.getResources().getColor(i, context.getTheme())) << 32;
        long j = AnonymousClass5RW.A01;
        if (0fL.A02()) {
            0fL.A00(-299158786);
        }
        return color;
    }
}
