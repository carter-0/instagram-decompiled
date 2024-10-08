package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.Window;

public final class FmI implements C332277Ui {
    public final int A00;
    public final Object A01;

    public FmI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9V() {
        String str;
        switch (this.A00) {
            case 0:
                ((AnonymousClass2kB) ((C46654DiZ) this.A01).A06.getValue()).A00(C47376Dwn.A00);
                return;
            case 1:
                C46369Ddm ddm = ((E1S) this.A01).A01;
                if (ddm == null) {
                    str = "bottomSheetViewModel";
                    break;
                } else {
                    DxH dxH = DxH.A00;
                    0qQ.A0B(dxH, 0);
                    ddm.A00.Epw(dxH);
                    return;
                }
            case 3:
                ((DialogInterface.OnDismissListener) this.A01).onDismiss((DialogInterface) null);
                return;
            case 5:
                ((Activity) this.A01).finish();
                return;
            case 6:
                DbS.A1U(this.A01);
                return;
            case 7:
                G6R g6r = ((E60) this.A01).A00;
                if (g6r != null) {
                    g6r.DLa();
                    return;
                }
                return;
            case 8:
                E5B e5b = (E5B) this.A01;
                if (!e5b.A03) {
                    G7R g7r = e5b.A01;
                    if (g7r == null) {
                        str = "callback";
                        break;
                    } else {
                        g7r.onCancel();
                        I21.A00.A00(DbT.A0X(e5b.A0A));
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D9a() {
        Activity activity;
        Window window;
        if (2 - this.A00 == 0 && (activity = (Activity) this.A01) != null && (window = activity.getWindow()) != null) {
            04R.A00(window, false);
        }
    }
}
