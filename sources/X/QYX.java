package X;

import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

public final class QYX extends 0zn implements 0HU {
    public static int A02;
    public static int A03;
    public static String A04;
    public static AnonymousClass0eK A05;
    public static AnonymousClass0eK A06;
    public static boolean A07;
    public static final List A08 = Pxf.A0q(new String[]{"caller_1", "caller_2", "caller_3", "caller_4"});
    public boolean A00 = false;
    public final boolean A01;

    public final void A6z(Message message, AnonymousClass0HS r2, String str) {
    }

    public final 0HV AjQ(0HW r2, String str, Method method, Object[] objArr) {
        return null;
    }

    public final boolean DRT(Message message, AnonymousClass0HS r3, String str) {
        return false;
    }

    public final String getName() {
        return "system_service_binder_logger";
    }

    public final void onMarkerDrop(0XY r2) {
        this.A00 = false;
    }

    public final void onMarkerStart(0XY r2) {
        this.A00 = true;
    }

    public final void onMarkerStop(0XY r2) {
        this.A00 = false;
    }

    public final 0Xc getListenerMarkers() {
        return new 0Xc(new int[]{A03}, (int[]) null);
    }

    public QYX(boolean z) {
        this.A01 = z;
    }

    public final void DDH(Object obj, String str, Method method, Object[] objArr, long j) {
        int i = 0;
        boolean z = false;
        long j2 = j;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Binder(");
            A1A.append(j2);
            A1A.append("ms): ");
            A1A.append(method.getDeclaringClass().getSimpleName());
            A1A.append(".");
            StrictMode.noteSlowCall(AnonymousClass7TF.A0l(method.getName(), A1A));
        }
        if (this.A00 || (this.A01 && z)) {
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) A06.get();
            if (quickPerformanceLogger == null) {
                0KC.A0H("SystemServiceBinderLogger", "QuickPerformanceLogger not initialized", new Throwable());
                return;
            }
            int nextInt = new Random().nextInt();
            quickPerformanceLogger.markerStart(A02, nextInt);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, C273654mx.A00(390), str);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, AnonymousClass000.A00(3599), method.getName());
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "is_main_thread", z);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "current_module_name", (String) A05.get());
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "execution_duration_ms", j2);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "is_scrolling", this.A00);
            if (A07) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i2 = 7;
                do {
                    if (length > i2) {
                        quickPerformanceLogger.markerAnnotate(A02, nextInt, AnonymousClass7TE.A19(A08, i), stackTrace[i2].toString());
                        i++;
                    }
                    i2++;
                } while (i2 <= 10);
                int i3 = A02;
                String str2 = A04;
                if (str2.isEmpty()) {
                    str2 = "caller_4";
                }
                quickPerformanceLogger.markerAnnotate(i3, nextInt, AnonymousClass000.A00(3133), str2);
            }
            quickPerformanceLogger.markerEnd(A02, nextInt, 2);
        }
    }
}
