package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: X.NqH  reason: case insensitive filesystem */
public abstract class C69695NqH {
    public static final O5U A00(Context context, String str) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 1024);
        long longVersionCode = packageInfo.getLongVersionCode();
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = null;
        if (applicationInfo != null) {
            strArr = applicationInfo.sharedLibraryFiles;
        }
        String lowerCase = "com.google.android.trichromelibrary".toLowerCase();
        0qQ.A07(lowerCase);
        if (strArr != null) {
            0sC r3 = new 0sC(strArr);
            while (r3.hasNext()) {
                String str2 = (String) r3.next();
                0qQ.A0A(str2);
                if (DbU.A1a(DbY.A0j(str2), lowerCase)) {
                    break;
                }
            }
        }
        return new O5U(longVersionCode);
    }
}
