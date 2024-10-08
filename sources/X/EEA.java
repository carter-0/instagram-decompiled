package X;

import android.view.View;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class EEA extends C252233om {
    public boolean A00;
    public boolean A01;
    public final E55 A02;
    public final ProgressButton A03;

    public EEA(E55 e55, ProgressButton progressButton, String str) {
        0qQ.A0B(progressButton, 1);
        this.A03 = progressButton;
        if (!(str == null || str.length() == 0)) {
            progressButton.setText((CharSequence) str);
        }
        this.A02 = e55;
        this.A01 = false;
        this.A00 = true;
        progressButton.setEnabled(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3.A00 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            r0 = 1
            r3.A01 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r3.A03
            r2.setShowProgressBar(r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0011
            boolean r1 = r3.A00
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEA.A00():void");
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        FP1.A01(this.A03, 23, this);
    }
}
