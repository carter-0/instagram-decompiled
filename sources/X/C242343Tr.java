package X;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: X.3Tr  reason: invalid class name and case insensitive filesystem */
public final class C242343Tr implements InputFilter {
    public C271074hr A00;
    public final TextView A01;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != 3) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r2 = r3.A01
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L_0x0018
            X.Tnu r0 = X.C13993Tnu.A00()
            int r1 = r0.A01()
            if (r1 == 0) goto L_0x0047
            r0 = 1
            if (r1 == r0) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x0047
        L_0x0018:
            return r4
        L_0x0019:
            if (r9 != 0) goto L_0x002a
            if (r8 != 0) goto L_0x002a
            int r0 = r7.length()
            if (r0 != 0) goto L_0x002a
            java.lang.CharSequence r0 = r2.getText()
            if (r4 != r0) goto L_0x002a
            return r4
        L_0x002a:
            if (r4 == 0) goto L_0x0018
            if (r5 != 0) goto L_0x0042
            int r0 = r4.length()
            if (r6 != r0) goto L_0x0042
        L_0x0034:
            X.Tnu r2 = X.C13993Tnu.A00()
            int r1 = r4.length()
            r0 = 0
            java.lang.CharSequence r4 = r2.A02(r4, r0, r1)
            return r4
        L_0x0042:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
            goto L_0x0034
        L_0x0047:
            X.Tnu r1 = X.C13993Tnu.A00()
            X.4hr r0 = r3.A00
            if (r0 != 0) goto L_0x0056
            X.4hq r0 = new X.4hq
            r0.<init>(r2, r3)
            r3.A00 = r0
        L_0x0056:
            r1.A04(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242343Tr.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public C242343Tr(TextView textView) {
        this.A01 = textView;
    }
}
