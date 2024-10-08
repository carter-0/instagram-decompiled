package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjn  reason: case insensitive filesystem */
public final class C50869Fjn implements G6H {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        0qQ.A0B(uri, 0);
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A002 = AnonymousClass000.A00(1190);
        if (packageManager.getLaunchIntentForPackage(A002) != null) {
            String BaE = DbS.A0h(this.A02, AnonymousClass0t1.A01).BaE();
            if (BaE != null) {
                str = StringFormatUtil.formatStrLocaleSafe("fb-pma://pages/inbox/{#%s}", BaE);
            } else {
                str = "fb-pma://login";
            }
            0kR.A03(DbX.A09(str), this.A01);
            return;
        }
        0oI.A07(context, A002, uri.getQueryParameter("referrer"));
    }

    public C50869Fjn(Context context, Fragment fragment, UserSession userSession) {
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
    }
}
