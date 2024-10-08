package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4dx  reason: invalid class name and case insensitive filesystem */
public abstract class C268764dx {
    public static Method A00;
    public static final Bitmap.Config A01 = Bitmap.Config.ARGB_8888;

    public void A01(Bitmap bitmap) {
    }

    public void A02(Bitmap bitmap, Bitmap bitmap2) {
        if (!AnonymousClass1T1.A00 || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        } else {
            try {
                Method method = A00;
                if (method == null) {
                    Class<Bitmap> cls = Bitmap.class;
                    method = Class.forName("com.facebook.imagepipeline.nativecode.Bitmaps").getDeclaredMethod("copyBitmap", new Class[]{cls, cls});
                    A00 = method;
                }
                method.invoke((Object) null, new Object[]{bitmap, bitmap2});
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        }
        A01(bitmap);
    }

    public C249903kY A00(Bitmap bitmap, AnonymousClass1TV r5) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = A01;
        }
        C249903kY A002 = r5.A00(config, width, height);
        try {
            A02((Bitmap) A002.A05(), bitmap);
            C249903kY A03 = A002.A03();
            A002.close();
            return A03;
        } catch (Throwable th) {
            C249903kY.A01(A002);
            throw th;
        }
    }
}
