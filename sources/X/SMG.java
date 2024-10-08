package X;

import android.content.pm.PackageManager;

public final class SMG {
    public static final SMG A00 = new Object();

    public static final QP1 A00(PackageManager packageManager, String str, String str2) {
        C8951RIq rIq;
        boolean z;
        if (packageManager != null) {
            try {
                String str3 = packageManager.getPackageInfo(str, 0).versionName;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.isEmpty() && !str2.isEmpty()) {
                    String[] split = str3.split("\\.");
                    String[] split2 = str2.split("\\.");
                    int min = Math.min(split.length, split2.length);
                    int i = 0;
                    while (true) {
                        if (i >= min) {
                            break;
                        }
                        String str4 = split[i];
                        String str5 = split2[i];
                        if (str4.equals(str5)) {
                            i++;
                        } else if (Integer.parseInt(str4) - Integer.parseInt(str5) < 0) {
                            return new QP1(C8951RIq.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION, true);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
                rIq = C8951RIq.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION;
                z = true;
                return new QP1(rIq, z);
            } catch (PackageManager.NameNotFoundException unused2) {
                rIq = C8951RIq.OEM_FALLBACK_OEM_STORE_NOT_FOUND;
                z = true;
                return new QP1(rIq, z);
            }
        }
        rIq = null;
        z = false;
        return new QP1(rIq, z);
    }
}
