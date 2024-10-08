package X;

import android.content.DialogInterface;
import android.os.Bundle;

public final class F3H {
    public final DialogInterface.OnDismissListener A00;
    public final 0hq A01;
    public final ERQ A02;

    public F3H(DialogInterface.OnDismissListener onDismissListener, 0hq r7, Integer num) {
        String str;
        this.A01 = r7;
        this.A00 = onDismissListener;
        ERQ erq = new ERQ();
        this.A02 = erq;
        Bundle A0a = AnonymousClass7TE.A0a();
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "isDeleting";
        } else if (intValue == 1) {
            str = "isRemoving";
        } else if (intValue != 2) {
            str = "isArchiving";
        } else {
            str = "isUpdating";
        }
        A0a.putBoolean(str, true);
        erq.setArguments(A0a);
    }

    public final void A00() {
        ERQ erq = this.A02;
        if (erq.isResumed()) {
            erq.A08();
            DialogInterface.OnDismissListener onDismissListener = this.A00;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(new FK2());
            }
        }
    }

    public final void A01() {
        0hq r3 = this.A01;
        if (r3.A0R("ProgressDialog") == null && AnonymousClass06S.A01(r3) && !r3.A0G) {
            ERQ erq = this.A02;
            if (!erq.isAdded()) {
                erq.A0B(r3, "ProgressDialog");
            }
        }
    }
}
