package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.STg  reason: case insensitive filesystem */
public final class C11424STg {
    public static final char[] A00 = "0123456789abcdef".toCharArray();
    public static final char[] A01 = new char[64];
    public static volatile Handler A02;

    public static int A00(Bitmap.Config config, int i, int i2) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int A08 = Pxe.A08(config, C9911RjQ.A00);
        int i4 = 4;
        if (A08 == 1) {
            i4 = 1;
        } else if (A08 == 2 || A08 == 3) {
            i4 = 2;
        } else if (A08 == 4) {
            i4 = 8;
        }
        return i3 * i4;
    }

    public static Handler A02() {
        if (A02 == null) {
            synchronized (C11424STg.class) {
                if (A02 == null) {
                    A02 = AnonymousClass7TF.A0D();
                }
            }
        }
        return A02;
    }

    public static boolean A05(int i, int i2) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static int A01(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Cannot obtain size for recycled Bitmap: ");
            A1A.append(bitmap);
            Pxh.A1P(A1A);
            A1A.append(bitmap.getWidth());
            A1A.append("x");
            A1A.append(bitmap.getHeight());
            A1A.append("] ");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(bitmap.getConfig(), A1A));
        }
    }

    public static ArrayList A03(Collection collection) {
        ArrayList A0v = DbS.A0v(collection.size());
        for (Object next : collection) {
            if (next != null) {
                A0v.add(next);
            }
        }
        return A0v;
    }

    public static void A04() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw AnonymousClass7TE.A0w("You must call this method on the main thread");
        }
    }
}
