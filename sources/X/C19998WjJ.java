package X;

import android.app.Dialog;

/* renamed from: X.WjJ  reason: case insensitive filesystem */
public final /* synthetic */ class C19998WjJ implements Runnable {
    public final /* synthetic */ C20409Wqt A00;

    public /* synthetic */ C19998WjJ(C20409Wqt wqt) {
        this.A00 = wqt;
    }

    public final void run() {
        Dialog dialog = (Dialog) this.A00.A00.A1y.getValue();
        if (!dialog.isShowing()) {
            AnonymousClass0fN.A00(dialog);
        }
    }
}
