package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;

/* renamed from: X.RoZ  reason: case insensitive filesystem */
public final class C10218RoZ {
    public final C10219Roa A00;

    public C10218RoZ(Context context, PackageManager packageManager, AnonymousClass1SF r8) {
        C10219Roa roa;
        IllegalArgumentException illegalArgumentException;
        r8.A00();
        r8.A00.A00();
        1TK A002 = r8.A01.A00();
        try {
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(C10074RmB.A01, 0);
            if (resolveContentProvider != null) {
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(resolveContentProvider.packageName, resolveContentProvider.name));
                if (componentEnabledSetting == 0) {
                    resolveContentProvider.isEnabled();
                } else if (!(componentEnabledSetting == 1 || componentEnabledSetting == 2)) {
                    illegalArgumentException = DbW.A0a("Unexpected component setting: ", componentEnabledSetting);
                    roa = new C10219Roa(illegalArgumentException);
                    this.A00 = roa;
                    if (A002 != null && A002.A05) {
                        A002.A04.contains(1TG.A03);
                    }
                    C9272RVx.A00(context);
                }
            }
            illegalArgumentException = null;
            roa = new C10219Roa(illegalArgumentException);
        } catch (Exception e) {
            roa = new C10219Roa(e);
        }
        this.A00 = roa;
        A002.A04.contains(1TG.A03);
        C9272RVx.A00(context);
    }
}
