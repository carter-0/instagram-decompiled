package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;

/* renamed from: X.RRi  reason: case insensitive filesystem */
public abstract class C9157RRi {
    public static int A00(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int myUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (myUid2 != myUid || !02S.A00(packageName2, packageName)) {
            noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
        } else {
            noteProxyOpNoThrow = C9152RRd.A00(context, permissionToOp, packageName, myUid);
        }
        if (noteProxyOpNoThrow != 0) {
            return -2;
        }
        return 0;
    }
}
