package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Callable;

/* renamed from: X.4lb  reason: invalid class name and case insensitive filesystem */
public final class C272894lb implements Callable {
    public final /* synthetic */ Context A00;

    public C272894lb(Context context) {
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        return packageManager.getPackageInfo(context.getPackageName(), 0);
    }
}
