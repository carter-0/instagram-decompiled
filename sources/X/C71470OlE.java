package X;

import android.widget.PopupWindow;

/* renamed from: X.OlE  reason: case insensitive filesystem */
public final /* synthetic */ class C71470OlE implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C71870OsD A00;

    public /* synthetic */ C71470OlE(C71870OsD osD) {
        this.A00 = osD;
    }

    public final void onDismiss() {
        C71870OsD osD = this.A00;
        if (!osD.A0G) {
            C71870OsD.A03(osD);
            osD.A0C = null;
        }
    }
}
