package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;

public final class LRG {
    public static final LRG A00 = new Object();

    public static final Uri A00(File file, String str) {
        FileOutputStream A0t;
        try {
            A0t = JTO.A0t(file);
            PrintWriter printWriter = new PrintWriter(A0t);
            if (str == null) {
                str = "";
            }
            printWriter.print(str);
            printWriter.flush();
            Uri fromFile = Uri.fromFile(file);
            Closeables.A00(A0t, false);
            return fromFile;
        } catch (IOException e) {
            0KC.A0F("FlyTrapUtil", "Unable to saveLogFile", e);
            return null;
        } catch (Throwable th) {
            Closeables.A00(A0t, false);
            throw th;
        }
    }

    public final Object A01(Activity activity, 0lg r14) {
        View rootView;
        Bitmap bitmap;
        int i;
        0qQ.A0B(activity, 1);
        if (activity.isChild()) {
            activity = activity.getParent();
        }
        Handler handler = new Handler();
        if (activity == null || (rootView = activity.getWindow().getDecorView().getRootView()) == null) {
            return JTU.A0c(AnonymousClass7TE.A15("Could not get root view for screenshot"));
        }
        double A002 = 182.A00(0Tu.A05, r14, 37168896087687653L);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        int i2 = (int) (((double) height) * A002);
        try {
            i = height;
            Bitmap createBitmap = Bitmap.createBitmap((int) (((double) width) * A002), i2, Bitmap.Config.ARGB_8888);
            i = createBitmap;
            bitmap = createBitmap;
        } catch (OutOfMemoryError e) {
            0KC.A0F("FlyTrapUtil", "Create bitmap OutOfMemoryError", e);
            float f = rootView.getResources().getDisplayMetrics().density;
            if (f >= 2.0f) {
                float f2 = (float) i;
                if (f2 >= f) {
                    float f3 = (float) width;
                    if (f3 >= f) {
                        try {
                            bitmap = Bitmap.createBitmap((int) (f3 / f), (int) (f2 / f), Bitmap.Config.ARGB_8888);
                        } catch (OutOfMemoryError e2) {
                            0KC.A0F("FlyTrapUtil", "OOM during downscaled bitmap creation", e2);
                            bitmap = JTU.A0c(new RuntimeException("OOM Bitmap.createBitmap exception", e2));
                        } catch (Exception e3) {
                            0KC.A0F("FlyTrapUtil", "Create bitmap exception", e3);
                            bitmap = JTU.A0c(new RuntimeException("Bitmap.createBitmap exception", e3));
                        }
                    }
                }
            }
            bitmap = JTU.A0c(AnonymousClass7TE.A15("Invalid screen density for bitmap creation"));
        }
        if (!(bitmap instanceof 0eQ)) {
            Bitmap bitmap2 = bitmap;
            0qQ.A0B(bitmap2, 1);
            if (activity.getWindow() != null) {
                PixelCopy.request(activity.getWindow(), bitmap2, LWY.A00, handler);
            }
        }
        return bitmap;
    }

    public final Object A02(Bitmap bitmap, 0lg r10, File file) {
        Bitmap.CompressFormat compressFormat;
        int i;
        FileOutputStream A0t;
        0qQ.A0B(r10, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, r10, 36324471157633133L)) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            i = DbS.A04(r2, r10, 36605946134402394L);
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
            i = 100;
        }
        try {
            A0t = JTO.A0t(file);
            0fO.A02(compressFormat, bitmap, A0t, i);
            A0t.flush();
            Closeables.A00(A0t, false);
            long length = file.length();
            Long valueOf = Long.valueOf(length);
            if (length > 512000) {
                String format = String.format(Locale.US, "Flytrap screenshot larger than 500 KiB: %s, %d bytes", Arrays.copyOf(new Object[]{compressFormat.name(), valueOf}, 2));
                0qQ.A07(format);
                0wb.A03("flytrap_screenshot_large", format);
            }
            return Uri.fromFile(file);
        } catch (Exception e) {
            0KC.A0F("FlyTrapUtil", "Couldn't save screenshot", e);
            return JTO.A1B(e);
        } catch (Throwable th) {
            Closeables.A00(A0t, false);
            throw th;
        }
    }
}
