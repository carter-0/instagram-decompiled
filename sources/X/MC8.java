package X;

import android.app.Application;

public final class MC8 implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public MC8(Application application, C60090JfW jfW, AnonymousClass0r6 r3, int i) {
        this.A00 = i;
        this.A02 = r3;
        switch (i) {
            case 3:
            case 4:
                this.A03 = jfW;
                this.A01 = application;
                break;
            default:
                this.A01 = application;
                this.A03 = jfW;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        r3 = new X.MCf(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r3 = new X.MCf(r0, r2, (java.lang.Object) r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        return X.AnonymousClass7TG.A0i(r7, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.02o r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x006b;
                case 2: goto L_0x005b;
                case 3: goto L_0x0047;
                case 4: goto L_0x0038;
                case 5: goto L_0x0024;
                case 6: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r5.A03
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A01
            java.lang.Object r1 = r5.A02
            r0 = 21
        L_0x000f:
            X.MCf r3 = new X.MCf
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6, (java.lang.Object) r1)
        L_0x0014:
            java.lang.Object r0 = X.AnonymousClass7TG.A0i(r7, r4, r3)
            return r0
        L_0x0019:
            java.lang.Object r4 = r5.A03
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A01
            java.lang.Object r1 = r5.A02
            r0 = 20
            goto L_0x000f
        L_0x0024:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A01
            android.app.Application r2 = (android.app.Application) r2
            java.lang.Object r1 = r5.A03
            X.JfW r1 = (X.C60090JfW) r1
            r0 = 12
            X.MCf r3 = new X.MCf
            r3.<init>((android.app.Application) r2, (X.C60090JfW) r1, (X.02o) r6, (int) r0)
            goto L_0x0014
        L_0x0038:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A03
            X.JfW r2 = (X.C60090JfW) r2
            java.lang.Object r1 = r5.A01
            android.app.Application r1 = (android.app.Application) r1
            r0 = 11
            goto L_0x0055
        L_0x0047:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A03
            X.JfW r2 = (X.C60090JfW) r2
            java.lang.Object r1 = r5.A01
            android.app.Application r1 = (android.app.Application) r1
            r0 = 10
        L_0x0055:
            X.MCf r3 = new X.MCf
            r3.<init>((android.app.Application) r1, (X.C60090JfW) r2, (X.02o) r6, (int) r0)
            goto L_0x0014
        L_0x005b:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A03
            java.lang.Object r1 = r5.A01
            r0 = 9
            X.MCf r3 = new X.MCf
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r6)
            goto L_0x0014
        L_0x006b:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A01
            java.lang.Object r1 = r5.A03
            r0 = 3
            X.IkS r3 = new X.IkS
            r3.<init>(r0, r2, r1, r6)
            goto L_0x0014
        L_0x007a:
            java.lang.Object r4 = r5.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            java.lang.Object r2 = r5.A03
            java.lang.Object r1 = r5.A01
            r0 = 1
            X.Av3 r3 = new X.Av3
            r3.<init>(r0, r2, r1, r6)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MC8.collect(X.02o, X.4D7):java.lang.Object");
    }

    public MC8(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }
}
