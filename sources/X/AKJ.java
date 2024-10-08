package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.Iterator;

public final /* synthetic */ class AKJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AKJ(BrowserLiteFragment browserLiteFragment, String str) {
        this.A00 = browserLiteFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        String str = this.A01;
        if (dialogInterface instanceof AlertDialog) {
            ((Dialog) dialogInterface).setOnDismissListener((DialogInterface.OnDismissListener) null);
        }
        C41803B1i b1i = browserLiteFragment.A0M;
        if (b1i != null) {
            b1i.Cgm(C391409su.A0r, AnonymousClass05K.A00);
        }
        browserLiteFragment.A0V.Avi().A0B(str);
        Intent intent = browserLiteFragment.A06;
        boolean z = false;
        if (intent != null && intent.getBooleanExtra(Pxd.A00(130), false)) {
            z = true;
        }
        C39667A4h A002 = SQY.A00(browserLiteFragment.A05, str, z);
        if (A002.A01 && A002.A00) {
            FragmentActivity activity = browserLiteFragment.getActivity();
            SRY sry = browserLiteFragment.A0L;
            if (activity != null) {
                activity.getLifecycle().A09(new C11623SdR(browserLiteFragment, sry, str, z));
            }
        }
        Iterator it = browserLiteFragment.A0o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
