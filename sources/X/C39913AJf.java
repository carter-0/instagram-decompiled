package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.AJf  reason: case insensitive filesystem */
public final /* synthetic */ class C39913AJf implements DialogInterface.OnClickListener {
    public final /* synthetic */ BrowserLiteFragment A00;

    public /* synthetic */ C39913AJf(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BrowserLiteFragment browserLiteFragment = this.A00;
        if (dialogInterface instanceof AlertDialog) {
            ((Dialog) dialogInterface).setOnDismissListener((DialogInterface.OnDismissListener) null);
        }
        C41803B1i b1i = browserLiteFragment.A0M;
        if (b1i != null) {
            b1i.Cgm(C391409su.A0p, AnonymousClass05K.A00);
        }
    }
}
