package X;

import android.content.DialogInterface;

/* renamed from: X.FJx  reason: case insensitive filesystem */
public final class C50038FJx implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public C50038FJx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener;
        switch (this.A00) {
            case 0:
                DbW.A1L(AnonymousClass7TE.A0p((1Av) this.A01), "has_seen_messaging_hub_afterparty_dialog");
                return;
            case 1:
                onShowListener = (DialogInterface.OnShowListener) this.A01;
                break;
            case 2:
                C59844JaK.A00((C59844JaK) this.A01).A09(false);
                return;
            case 3:
                onShowListener = ((C46659Dig) this.A01).A00;
                if (onShowListener == null) {
                    return;
                }
                break;
            default:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
        }
        onShowListener.onShow(dialogInterface);
    }
}
