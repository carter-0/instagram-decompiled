package X;

import android.app.Dialog;
import android.os.Bundle;

public abstract class QC1 extends 0SM {
    public final void A0A(Dialog dialog, int i) {
        if (dialog instanceof QAE) {
            QAE qae = (QAE) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            qae.A04().A0Q(1);
            return;
        }
        QC1.super.A0A(dialog, i);
    }

    public Dialog A0F(Bundle bundle) {
        return new QAE(getContext(), A0E());
    }
}
