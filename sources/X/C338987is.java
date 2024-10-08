package X;

import android.content.res.Resources;
import android.os.Build;
import android.os.StatFs;
import android.util.DisplayMetrics;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7is  reason: invalid class name and case insensitive filesystem */
public final class C338987is {
    public static final C338987is A00 = new Object();
    public static final Map A01 = new LinkedHashMap();

    public final double[] A00() {
        long j;
        Map map = A01;
        if (map.isEmpty()) {
            0JN A012 = 0JN.A01();
            A012.A07();
            0JN.A03(A012);
            0JN.A04(A012);
            StatFs statFs = A012.A03;
            if (statFs != null) {
                j = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            } else {
                j = -1;
            }
            map.put("device_total_space", Double.valueOf((double) j));
            0JN A013 = 0JN.A01();
            A013.A07();
            map.put("device_free_space", Double.valueOf((double) A013.A05()));
            map.put("os_sdk", Double.valueOf((double) Build.VERSION.SDK_INT));
            Resources resources = C60960kU.A00.getResources();
            0qQ.A07(resources);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            0qQ.A07(displayMetrics);
            map.put("screen_resolution", Double.valueOf(((double) displayMetrics.widthPixels) * ((double) displayMetrics.heightPixels)));
            map.put("reliable_core_count", Double.valueOf((double) 0qg.A01().A06()));
            0qg A014 = 0qg.A01();
            if (A014.A00 == 0) {
                0qg.A03(A014);
            }
            map.put("cpu_max_freq", Double.valueOf((double) A014.A00));
            Resources resources2 = C60960kU.A00.getResources();
            0qQ.A07(resources2);
            DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
            0qQ.A07(displayMetrics2);
            map.put("density_dpi", Double.valueOf((double) displayMetrics2.densityDpi));
            0qg A015 = 0qg.A01();
            if (A015.A00 == 0) {
                0qg.A03(A015);
            }
            map.put("low_power_cpu_max_freq", Double.valueOf((double) A015.A01));
        }
        Collection<Number> values = map.values();
        0qQ.A0B(values, 0);
        double[] dArr = new double[values.size()];
        int i = 0;
        for (Number doubleValue : values) {
            dArr[i] = doubleValue.doubleValue();
            i++;
        }
        return dArr;
    }
}
