package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.9FK  reason: invalid class name */
public final class AnonymousClass9FK {
    public final 0wc A00;
    public final UserSession A01;

    public AnonymousClass9FK(0wc r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final void A00(String str) {
        String str2;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_dogfood_updater");
        if (A002.isSampled()) {
            Context A06 = this.A01.A03.A06();
            A002.AAJ(TraceFieldType.AdhocEventName, str);
            PackageManager packageManager = A06.getPackageManager();
            String packageName = A06.getPackageName();
            Uri uri = 0oI.A01;
            try {
                str2 = packageManager.getInstallerPackageName(packageName);
                if (str2 == null) {
                    str2 = "";
                }
            } catch (IllegalArgumentException unused) {
                str2 = "unknown";
            }
            A002.AAJ("installer_name", str2);
            A002.Cgf();
        }
    }
}
