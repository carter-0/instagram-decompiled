package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SGa {
    public final Context A00;

    private final C11617SdK A00() {
        C11617SdK sdK = new C11617SdK(this.A00);
        if (sdK.isAvailableOnDevice()) {
            return sdK;
        }
        return null;
    }

    public final C13762Tga A01() {
        C11617SdK sdK;
        String string;
        if (Build.VERSION.SDK_INT < 34 || (sdK = A00()) == null) {
            sdK = null;
            Context context = this.A00;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (!(serviceInfo.metaData == null || (string = serviceInfo.metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) == null)) {
                        A1C.add(string);
                    }
                }
            }
            List A0a = 00k.A0a(A1C);
            if (!A0a.isEmpty()) {
                Iterator it = A0a.iterator();
                C13762Tga tga = null;
                while (it.hasNext()) {
                    try {
                        Object newInstance = Class.forName(AnonymousClass7TE.A18(it)).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                        0qQ.A0C(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                        C13762Tga tga2 = (C13762Tga) newInstance;
                        if (!tga2.isAvailableOnDevice()) {
                            continue;
                        } else if (tga == null) {
                            tga = tga2;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return tga;
            }
        }
        return sdK;
    }

    public SGa(Context context) {
        this.A00 = context;
    }
}
