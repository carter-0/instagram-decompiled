package X;

import android.app.Dialog;

/* renamed from: X.RQy  reason: case insensitive filesystem */
public abstract class C9147RQy {
    public final void A00() {
        if (this instanceof C8379Qpk) {
            C8379Qpk qpk = (C8379Qpk) this;
            C3023963c r2 = qpk.A01.A01;
            r2.A01.set((Object) null);
            r2.A09();
            Dialog dialog = qpk.A00;
            if (dialog.isShowing()) {
                dialog.dismiss();
                return;
            }
            return;
        }
        QpU qpU = (QpU) ((C8378Qpj) this).A00.get();
        if (qpU != null) {
            QpU.A02(qpU);
        }
    }
}
