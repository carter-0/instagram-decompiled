package X;

import android.app.Activity;
import android.app.Dialog;
import java.util.Map;

/* renamed from: X.OKx  reason: case insensitive filesystem */
public final class C70777OKx {
    public Dialog A00;
    public final Activity A01;
    public final Map A02 = AnonymousClass7TE.A1E();

    public C70777OKx(Activity activity) {
        this.A01 = activity;
    }

    public final void A00(X8Y x8y, int i) {
        boolean A1Y = DbW.A1Y(x8y);
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        Dialog A002 = W38.A00(this.A01, x8y, i, A1Y);
        this.A00 = A002;
        if (A002 != null) {
            AnonymousClass0fN.A00(A002);
        }
    }
}
