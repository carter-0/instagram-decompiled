package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SCx  reason: case insensitive filesystem */
public abstract class C11163SCx {
    public static final 01e A00 = new 01e(16);
    public static final 01r A01 = new 01r(0);
    public static final Object A02 = Pxe.A0p();
    public static final ExecutorService A03;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.TOC, java.util.concurrent.ThreadFactory] */
    static {
        ? obj = new Object();
        obj.A01 = "fonts-androidx";
        obj.A00 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
    }

    public static SE3 A00(Context context, 1rR r8, String str, int i) {
        int length;
        01e r6 = A00;
        Typeface typeface = (Typeface) r6.A02(str);
        if (typeface == null) {
            try {
                26z A002 = C67001rX.A00(context, r8);
                int i2 = -3;
                if (A002.A00 != 0) {
                    i2 = -2;
                } else {
                    26x[] r3 = A002.A01;
                    if (r3 == null || (length = r3.length) == 0) {
                        i2 = 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            int i4 = r3[i3].A00;
                            if (i4 == 0) {
                                i3++;
                                if (i3 >= length) {
                                    typeface = 270.A01.A03(context, (CancellationSignal) null, r3, i);
                                    if (typeface != null) {
                                        r6.A05(str, typeface);
                                    }
                                }
                            } else if (i4 >= 0) {
                                i2 = i4;
                            }
                        }
                    }
                }
                return new SE3(i2);
            } catch (PackageManager.NameNotFoundException unused) {
                return new SE3(-1);
            }
        }
        return new SE3(typeface);
    }
}
