package X;

import android.text.TextWatcher;

/* renamed from: X.ALe  reason: case insensitive filesystem */
public final class C39962ALe implements TextWatcher {
    public String A00;
    public final boolean A01;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C39962ALe(boolean z) {
        this.A00 = "";
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r4.A01 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r3 = "@"
            r2 = 0
            if (r0 <= 0) goto L_0x0026
            char r1 = r5.charAt(r2)
            r0 = 64
            if (r1 != r0) goto L_0x002a
            int r0 = r5.length()
            r1 = 1
            if (r0 != r1) goto L_0x002e
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0025
            int r1 = r5.length()
            java.lang.String r0 = ""
            r5.replace(r2, r1, r0)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0042
        L_0x002a:
            r5.insert(r2, r3)
            goto L_0x0042
        L_0x002e:
            int[] r0 = X.AnonymousClass91M.A02
            int r0 = r5.length()
            if (r0 <= r1) goto L_0x0049
            java.util.regex.Pattern r0 = X.AnonymousClass91M.A01
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0049
        L_0x0042:
            java.lang.String r0 = r5.toString()
            r4.A00 = r0
            return
        L_0x0049:
            int r1 = r5.length()
            java.lang.String r0 = r4.A00
            r5.replace(r2, r1, r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39962ALe.afterTextChanged(android.text.Editable):void");
    }

    public C39962ALe() {
        this(false);
    }
}
