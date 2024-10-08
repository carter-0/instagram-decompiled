package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fig  reason: case insensitive filesystem */
public final class C50800Fig implements G6H {
    public final Context A00;
    public final Fragment A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A002 = AnonymousClass000.A00(1190);
        if (packageManager == null || packageManager.getLaunchIntentForPackage(A002) == null) {
            0oI.A07(context, A002, uri.getQueryParameter("referrer"));
        } else {
            0kR.A03(DbX.A09("fb-pma://login"), this.A01);
        }
    }

    public C50800Fig(Context context, Fragment fragment) {
        this.A00 = context;
        this.A01 = fragment;
    }
}
