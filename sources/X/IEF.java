package X;

import android.widget.PopupWindow;

public final class IEF implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public IEF(C62320sa r1, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public final void onDismiss() {
        if (this.A00 != 0) {
            DbS.A1U(this.A01);
            return;
        }
        C338047hK r0 = (C338047hK) this.A01;
        C52971GgO ggO = r0.A02;
        C335907dj r02 = r0.A00;
        ggO.A0g(r02.A0K, r02.A0N, false);
    }

    public IEF(C338047hK r2) {
        this.A00 = 0;
        this.A01 = r2;
    }
}
