package X;

import android.content.DialogInterface;
import android.widget.CompoundButton;

/* renamed from: X.OgH  reason: case insensitive filesystem */
public final class C71250OgH implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C71250OgH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C358248ab r1, Object obj, int i) {
        r1.A0f(new C71250OgH(obj, i));
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Object value;
        switch (this.A00) {
            case 0:
                value = ((C270284gU) this.A01).getValue();
                break;
            case 1:
                ((C353498Hw) this.A01).A0d = false;
                return;
            case 2:
                NJT njt = (NJT) this.A01;
                if (njt.isAdded()) {
                    OYI.A00(AnonymousClass7TE.A0l(njt.A00)).APX(njt);
                    return;
                }
                return;
            case 3:
                ((C314126hh) this.A01).A00();
                return;
            case 4:
                ((CompoundButton) this.A01).setChecked(true);
                return;
            case 5:
                ((C273414mX) this.A01).Cyc();
                return;
            case 8:
                C68478NJv.A03((C68478NJv) this.A01).A03(true);
                return;
            case 9:
                ((C70506O9f) this.A01).A00.A0H.A03(new C72906POq(false));
                return;
            default:
                value = this.A01;
                break;
        }
        DbS.A1U(value);
    }
}
