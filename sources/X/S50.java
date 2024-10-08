package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class S50 {
    public int A00 = 0;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public C10976S3k A03 = C10976S3k.A00;
    public ImmutableList A04 = ImmutableList.of();
    public ImmutableList A05 = ImmutableList.of();
    public ImmutableList A06 = ImmutableList.of();
    public ImmutableList A07 = ImmutableList.of();
    public HashMap A08 = AnonymousClass7TE.A1E();
    public HashSet A09 = AnonymousClass7TE.A1F();

    public S50 A01(Context context, boolean z) {
        Display display;
        Point point;
        String str;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            display = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && Util.A0C(context)) {
            try {
                Class<?> cls = Class.forName(AnonymousClass000.A00(2602));
                str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"vendor.display-size"});
            } catch (Exception e) {
                STH.A04("Util", 002.A0R("Failed to read system property ", "vendor.display-size"), e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] A1b = Pxh.A1b(str.trim(), "x");
                    if (A1b.length == 2) {
                        int parseInt = Integer.parseInt(A1b[0]);
                        int parseInt2 = Integer.parseInt(A1b[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            int i = point.x;
                            int i2 = point.y;
                            this.A02 = i;
                            this.A01 = i2;
                            return this;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                STH.A02("Util", 002.A0R("Invalid display size: ", str));
            }
            if ("Sony".equals(Util.A04) && Util.A05.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                int i3 = point.x;
                int i22 = point.y;
                this.A02 = i3;
                this.A01 = i22;
                return this;
            }
        }
        point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        int i32 = point.x;
        int i222 = point.y;
        this.A02 = i32;
        this.A01 = i222;
        return this;
    }

    public S50 A00(Context context) {
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            this.A00 = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.A06 = ImmutableList.of(locale.toLanguageTag());
            }
        }
        return this;
    }
}
