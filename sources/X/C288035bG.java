package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5bG  reason: invalid class name and case insensitive filesystem */
public abstract class C288035bG {
    public static final String A01(C286575Wy r3, Object[] objArr, int i) {
        0qQ.A0B(objArr, 1);
        if (0fL.A02()) {
            0fL.A01(1653749159, "com.instagram.compose.resources.igStringResource (IgStringResource.kt:30)");
        }
        C286565Wx r32 = (C286565Wx) r3;
        String Eye = ((C287005Yq) C286615Xc.A01(C286975Yn.A00, C286565Wx.A04(r32))).Eye((Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04(r32)), i);
        Locale A02 = AnonymousClass1Q2.A02();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(A02, Eye, Arrays.copyOf(copyOf, copyOf.length));
        0qQ.A07(format);
        if (0fL.A02()) {
            0fL.A00(-1174987572);
        }
        return format;
    }

    public static final String A00(C286575Wy r2, int i) {
        if (0fL.A02()) {
            0fL.A01(-1178697836, "com.instagram.compose.resources.igStringResource (IgStringResource.kt:19)");
        }
        String A00 = C288045bH.A00(r2, i);
        if (0fL.A02()) {
            0fL.A00(-1987842008);
        }
        return A00;
    }

    public static final String A02(C286575Wy r2, Object[] objArr, int i, int i2) {
        if (0fL.A02()) {
            0fL.A01(1074553615, "com.instagram.compose.resources.igPluralStringResource (IgStringResource.kt:39)");
        }
        String quantityString = ((Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04((C286565Wx) r2))).getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, 1));
        0qQ.A07(quantityString);
        if (0fL.A02()) {
            0fL.A00(207469930);
        }
        return quantityString;
    }
}
