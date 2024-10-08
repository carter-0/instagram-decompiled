package X;

import android.app.Dialog;
import android.os.Bundle;

public abstract class QAN extends QC1 {
    public void A07() {
        Dialog dialog = this.A01;
        if (dialog instanceof QAL) {
            ((QAL) dialog).A06();
        }
        QAN.super.A07();
    }

    public final void A08() {
        Dialog dialog = this.A01;
        if (dialog instanceof QAL) {
            ((QAL) dialog).A06();
        }
        QAN.super.A08();
    }

    public Dialog A0F(Bundle bundle) {
        return new QAL(getContext(), A0E());
    }
}
