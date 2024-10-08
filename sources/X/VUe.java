package X;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public final class VUe {
    public LightweightQuickPerformanceLogger A00;
    public String A01;
    public double[] A02;

    public VUe(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str) {
        Display defaultDisplay;
        this.A00 = lightweightQuickPerformanceLogger;
        this.A01 = str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && defaultDisplay.getSupportedRefreshRates() != null) {
            float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
            int length = supportedRefreshRates.length;
            double[] dArr = new double[length];
            for (int i = 0; i < length; i++) {
                dArr[i] = (double) supportedRefreshRates[i];
            }
            this.A02 = dArr;
        }
    }
}
