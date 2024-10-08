package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.SSm  reason: case insensitive filesystem */
public final class C11414SSm {
    public static DisplayMetrics A00;
    public static DisplayMetrics A01;

    public static final void A03(Context context) {
        0qQ.A0B(context, 0);
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        A01 = A0E;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(A0E);
        Object systemService = context.getSystemService("window");
        0qQ.A0C(systemService, AnonymousClass000.A00(14));
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        A00 = displayMetrics;
    }

    public static final void A04(Context context) {
        0qQ.A0B(context, 0);
        if (A00 == null) {
            A03(context);
        }
    }

    public static final DisplayMetrics A00() {
        DisplayMetrics displayMetrics = A01;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final WritableNativeMap A01(double d) {
        if (A01 == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        } else if (A00 != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            DisplayMetrics displayMetrics = A01;
            0qQ.A0C(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
            writableNativeMap.putMap("windowPhysicalPixels", A02(displayMetrics, d));
            DisplayMetrics displayMetrics2 = A00;
            0qQ.A0C(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
            writableNativeMap.putMap("screenPhysicalPixels", A02(displayMetrics2, d));
            return writableNativeMap;
        } else {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
    }

    public static final WritableNativeMap A02(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(IgReactMediaPickerNativeModule.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(IgReactMediaPickerNativeModule.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", (double) displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", (double) displayMetrics.densityDpi);
        return writableNativeMap;
    }
}
