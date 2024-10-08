package X;

import android.content.Context;

/* renamed from: X.96G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass96G implements AnonymousClass96C {
    public static final AnonymousClass96G A00 = new AnonymousClass96G();

    public final String ATh(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return installerPackageName.replace(' ', '_').replace('/', '_');
        }
        return "";
    }
}
