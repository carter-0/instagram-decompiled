package X;

import java.util.concurrent.Executor;

public final class SF6 {
    public final Sm0 A00;
    public final C11035S6n A01;
    public final Executor A02;
    public final Executor A03;

    public SF6(Sm0 sm0, C11035S6n s6n, Executor executor, Executor executor2) {
        AnonymousClass7TG.A1O(executor, executor2);
        this.A03 = executor;
        this.A02 = executor2;
        this.A01 = s6n;
        this.A00 = sm0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r2.addAll(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.SF6 r5, java.lang.String r6, java.util.List r7) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r3.addAll(r7)
            int r0 = r6.hashCode()
            switch(r0) {
                case -1978111884: goto L_0x0047;
                case 1001998627: goto L_0x0056;
                case 1246886620: goto L_0x0066;
                case 1540243148: goto L_0x0076;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r1.addAll(r2)
            java.util.Iterator r6 = r3.iterator()
        L_0x0021:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r5 = r6.next()
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r5 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r5
            java.util.Iterator r4 = r2.iterator()
        L_0x0031:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r4.next()
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r0
            boolean r0 = r5.Ccl(r0)
            if (r0 == 0) goto L_0x0031
            r7.add(r5)
            goto L_0x0021
        L_0x0047:
            java.lang.String r0 = "email-autofill-data"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.S6n r0 = r5.A01
            java.util.ArrayList r0 = r0.A01()
            goto L_0x0084
        L_0x0056:
            java.lang.String r0 = "name-autofill-data"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.S6n r0 = r5.A01
            java.util.ArrayList r0 = r0.A02()
            goto L_0x0084
        L_0x0066:
            java.lang.String r0 = "telephone-autofill-data"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.S6n r0 = r5.A01
            java.util.ArrayList r0 = r0.A03()
            goto L_0x0084
        L_0x0076:
            java.lang.String r0 = "address-autofill-data"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.S6n r0 = r5.A01
            java.util.ArrayList r0 = r0.A00()
        L_0x0084:
            r2.addAll(r0)
            goto L_0x0016
        L_0x0088:
            r3.removeAll(r7)
            r1.addAll(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SF6.A00(X.SF6, java.lang.String, java.util.List):java.util.ArrayList");
    }
}
