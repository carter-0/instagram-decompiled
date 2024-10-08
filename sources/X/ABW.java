package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ABW {
    public static final List A00(Context context, String str) {
        PackageInfo packageInfo;
        int i;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            }
            C39601A1r.A00("lam:CompanionAppUtil", 002.A0S(C66579MXk.A00(1190), packageInfo.versionName, ' '));
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                List A0R = 00l.A0R(str2, new String[]{"."}, 0);
                ArrayList A0r = AnonymousClass7TG.A0r(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (AnonymousClass7TF.A1Q(A18.length())) {
                        i = 0;
                    } else {
                        i = Integer.parseInt(A18);
                    }
                    AnonymousClass7TF.A1M(A0r, i);
                }
                return A0r;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static final boolean A01(List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        if (AnonymousClass7TE.A0M(list.get(0)) > 126) {
            return true;
        }
        return AnonymousClass7TE.A0M(list.get(0)) == 126 && list.size() >= 5 && AnonymousClass7TE.A0M(list.get(4)) >= 20;
    }
}
