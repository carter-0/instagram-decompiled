package X;

import android.view.View;

/* renamed from: X.3E4  reason: invalid class name */
public final class AnonymousClass3E4 {
    public static C328817Gi A00(View view) {
        return new C328817Gi(view);
    }

    public static AnonymousClass3E5 A01(Object obj, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(obj.getClass().getSimpleName());
        if (obj instanceof AnonymousClass0iw) {
            try {
                String moduleName = ((AnonymousClass0iw) obj).getModuleName();
                sb.append(".");
                sb.append(moduleName);
            } catch (RuntimeException e) {
                0KC.A07(AnonymousClass3E4.class, "Caught exception when getting analytics module", e, new Object[0]);
            }
        }
        if (z) {
            sb.append(".cache");
        }
        return new AnonymousClass3E5(sb.toString(), z2);
    }
}
