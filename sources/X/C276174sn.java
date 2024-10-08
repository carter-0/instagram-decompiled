package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.4sn  reason: invalid class name and case insensitive filesystem */
public final class C276174sn {
    public static C276214sr A00;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.4so, java.lang.Object] */
    public static synchronized C276214sr A00(Context context) {
        C276214sr r3;
        synchronized (C276174sn.class) {
            r3 = A00;
            if (r3 == null) {
                r3 = new C276214sr(context, (WifiManager) context.getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI), new C276194sp(context), new Object());
                A00 = r3;
            }
        }
        return r3;
    }
}
