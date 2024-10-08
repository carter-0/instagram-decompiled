package X;

import android.content.DialogInterface;

public final class W5b implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public W5b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C358248ab r1, Object obj, int i) {
        r1.A0f(new W5b(obj, i));
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
            case 1:
                ((U7x) this.A01).A03 = false;
                return;
            case 2:
                ((X8T) this.A01).onDismiss();
                return;
            case 5:
                DialogInterface.OnDismissListener onDismissListener = ((C19201WPh) this.A01).A01;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                    return;
                }
                return;
            case 6:
                DbS.A1U(this.A01);
                return;
            case 7:
                G9w.A1O((AnonymousClass6Z5) this.A01);
                return;
            default:
                X8Y x8y = (X8Y) this.A01;
                if (x8y != null) {
                    x8y.onDismiss();
                    return;
                }
                return;
        }
    }
}
