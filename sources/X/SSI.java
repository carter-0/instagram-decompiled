package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.os.Build;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

public final class SSI {
    public static Field A00;
    public static Field A01;
    public static C10396RrY A02;
    public static SSI A03;
    public static final AnonymousClass0S9 A04;
    public static final boolean A05 = JTQ.A1P(Build.VERSION.SDK_INT, 30);

    public static /* synthetic */ Boolean A02() {
        Field field;
        try {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                return false;
            }
            if (AnonymousClass7TE.A1a(15e.A00().A01.get())) {
                return false;
            }
            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
            if (Build.VERSION.SDK_INT >= 29) {
                field = ActivityThread.class.getDeclaredField("mLastProcessState");
                A01 = field;
            } else {
                Field declaredField = ActivityThread.class.getDeclaredField("mAppThread");
                A00 = declaredField;
                declaredField.setAccessible(true);
                Object obj = A00.get(currentActivityThread);
                if (obj != null) {
                    field = obj.getClass().getDeclaredField("mLastProcessState");
                    A01 = field;
                }
                return true;
            }
            field.setAccessible(true);
            return true;
        } catch (Throwable th) {
            0f9 A012 = 15e.A00().A01("RefActivityThread.ensureInit");
            A012.ERJ(th);
            A012.report();
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.0h8, java.lang.Object, X.0S9] */
    static {
        C13182TOo tOo = new C13182TOo(1);
        ? obj = new Object();
        obj.A00 = tOo;
        A04 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.SSI] */
    public static SSI A01() {
        0JA.A09(AnonymousClass7TE.A1a(A04.get()), "Check isSupported() before call get() or use getOrNull() instead");
        SSI ssi = A03;
        if (ssi != null) {
            return ssi;
        }
        ? obj = new Object();
        A03 = obj;
        return obj;
    }

    public final boolean A03() {
        int i = -1;
        if (A01 != null) {
            try {
                ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = A01.getInt(currentActivityThread);
                } else {
                    Field field = A00;
                    if (field != null) {
                        i = A01.getInt(field.get(currentActivityThread));
                    }
                }
            } catch (Throwable th) {
                0f9 A012 = 15e.A00().A01("RefActivityThread.readCurrentProcesState");
                A012.ERJ(th);
                A012.report();
            }
        }
        int i2 = 2;
        if (A05) {
            if (i == 2) {
                return true;
            }
            i2 = 3;
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public static final Activity A00() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            try {
                Map map = (Map) Pxg.A10(ActivityThread.class, "mActivities").get(currentActivityThread);
                if (map != null && !map.isEmpty()) {
                    Iterator A0v = AnonymousClass7TF.A0v(map);
                    while (A0v.hasNext()) {
                        Object next = A0v.next();
                        if (next != null) {
                            C10396RrY rrY = A02;
                            if (rrY == null) {
                                rrY = new C10396RrY(next);
                                A02 = rrY;
                            }
                            if (!rrY.A01.getBoolean(next)) {
                                return (Activity) A02.A00.get(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                0f9 A012 = 15e.A00().A01("RefActivityThread.getCurrentActivity");
                A012.ERJ(th);
                A012.report();
                return null;
            }
        }
        return null;
    }
}
