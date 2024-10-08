package X;

import android.text.TextWatcher;

public final class LWQ implements TextWatcher {
    public boolean A00;
    public final /* synthetic */ C60651Joy A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0.A03 != true) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r7) {
        /*
            r6 = this;
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.Joy r1 = r6.A01
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.9cn r0 = r1.A00
            r5 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A03
            r4 = 1
            if (r0 == r5) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0039
            java.lang.String r3 = r7.toString()
            java.util.List r0 = X.LQE.A00
            X.0qQ.A0B(r3, r2)
        L_0x0020:
            int r0 = r3.length()
            if (r2 >= r0) goto L_0x0039
            char r0 = r3.charAt(r2)
            java.util.List r1 = X.LQE.A00
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x003a
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r4 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            r7.clear()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWQ.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        this.A00 = LQE.A01(charSequence.toString());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public LWQ(C60651Joy joy) {
        this.A01 = joy;
    }
}
