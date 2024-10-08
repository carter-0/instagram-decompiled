package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.Sle  reason: case insensitive filesystem */
public final class C12051Sle implements C13769Tgh {
    public final boolean FIC(Context context, Bundle bundle) {
        return false;
    }

    public final Bundle ALa(String str, String str2, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString("url_param", str);
        }
        return A0a;
    }

    public final boolean FID(Context context, Bundle bundle) {
        String str;
        String string = bundle.getString("url_param");
        if (string != null) {
            try {
                Uri A03 = 0cp.A03(string);
                if (A03 != null) {
                    Intent A0F = Pxe.A0F(A03);
                    for (ResolveInfo resolveInfo : 0ba.A04(context, A0F, 0)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo != null && activityInfo.packageName.contentEquals("com.oculus.twilight")) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            C66581MXm.A17(A0F, activityInfo2.packageName, activityInfo2.name);
                            boolean A0G = 0b6.A00().A06().A0G(context, A0F);
                            if (A0G) {
                                str = "Success";
                            } else {
                                str = "Failed";
                            }
                            0KC.A0O("TwilightAppUriHandler", "Launch status of Twilight App : %s", new Object[]{str});
                            return A0G;
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        return false;
    }
}
