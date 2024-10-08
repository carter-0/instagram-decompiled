package X;

import android.content.Context;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.4mO  reason: invalid class name and case insensitive filesystem */
public final class C273354mO {
    public static C273354mO A01;
    public static final Set A02;
    public static final String[] A03 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public final Context A00;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        A02 = treeSet;
        treeSet.add("com.instagram.android");
    }

    public static synchronized C273354mO A00(Context context) {
        C273354mO r0;
        synchronized (C273354mO.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C273354mO(context);
                A01 = r0;
            }
        }
        return r0;
    }

    public final boolean A01() {
        String[] strArr = A03;
        int i = 0;
        do {
            try {
                if (this.A00.checkCallingOrSelfPermission(strArr[i]) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                0KC.A0F("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            }
            i++;
        } while (i < 2);
        return false;
    }

    public final boolean A02() {
        try {
            if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            0KC.A0F("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            return false;
        }
    }

    public C273354mO(Context context) {
        A02.contains(context.getApplicationContext().getPackageName());
        this.A00 = context.getApplicationContext();
    }
}
