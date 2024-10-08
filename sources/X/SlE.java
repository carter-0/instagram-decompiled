package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;

public final class SlE implements C13703TfM {
    public final Bundle A00;
    public final SRY A01;
    public final WeakReference A02;
    public final WeakReference A03;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DgU(com.facebook.browser.lite.extensions.autofill.model.AutofillData r5, boolean r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A02
            X.QKv r1 = X.Pxe.A0Q(r0)
            java.lang.ref.WeakReference r0 = r4.A03
            java.lang.Object r0 = r0.get()
            X.QLA r0 = (X.QLA) r0
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x0018
            r1.A0G(r0)
        L_0x0015:
            r1.A0B(r5)
        L_0x0018:
            X.SRY r3 = r4.A01
            X.RzS r2 = X.C9919RjY.A00
            java.lang.String r1 = "ACCEPTED_SAVE"
            java.lang.String r0 = "CONTACT_AUTOFILL"
            java.util.LinkedHashMap r1 = r2.A00(r1, r0, r6)
            android.os.Bundle r0 = r4.A00
            r3.A07(r0, r1)
            return
        L_0x002a:
            if (r1 == 0) goto L_0x0018
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SlE.DgU(com.facebook.browser.lite.extensions.autofill.model.AutofillData, boolean):void");
    }

    public final void onDecline() {
        this.A01.A07(this.A00, C9919RjY.A00.A00("NOT_NOW_CLICK", "CONTACT_AUTOFILL", false));
    }

    public SlE(Bundle bundle, SRY sry, C7580QKv qKv, QLA qla) {
        this.A00 = bundle;
        this.A01 = sry;
        this.A03 = C51965G9l.A0v(qla);
        this.A02 = C51965G9l.A0v(qKv);
    }
}
