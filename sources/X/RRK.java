package X;

import java.lang.ref.WeakReference;

public abstract class RRK {
    public final void A00() {
        WeakReference weakReference = ((QAS) this).A00;
        if (weakReference.get() != null && ((QDG) weakReference.get()).A0I) {
            QDG qdg = (QDG) weakReference.get();
            AnonymousClass2Fj r1 = qdg.A0D;
            if (r1 == null) {
                r1 = JTO.A0K();
                qdg.A0D = r1;
            }
            QDG.A00(r1, true);
        }
    }

    public final void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = ((QAS) this).A00;
        if (weakReference.get() != null && !((QDG) weakReference.get()).A0J && ((QDG) weakReference.get()).A0I) {
            QDG qdg = (QDG) weakReference.get();
            S44 s44 = new S44(i, charSequence);
            AnonymousClass2Fj r0 = qdg.A08;
            if (r0 == null) {
                r0 = JTO.A0K();
                qdg.A08 = r0;
            }
            QDG.A00(r0, s44);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if ((r1 & com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO) != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C10336RqZ r5) {
        /*
            r4 = this;
            r0 = r4
            X.QAS r0 = (X.QAS) r0
            java.lang.ref.WeakReference r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r3.get()
            X.QDG r0 = (X.QDG) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x004a
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0037
            X.SR5 r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.QDG r0 = (X.QDG) r0
            int r1 = r0.A01()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L_0x0031
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            X.RqZ r5 = new X.RqZ
            r5.<init>(r2, r0)
        L_0x0037:
            java.lang.Object r1 = r3.get()
            X.QDG r1 = (X.QDG) r1
            X.2Fj r0 = r1.A0A
            if (r0 != 0) goto L_0x0047
            X.2Fj r0 = X.JTO.A0K()
            r1.A0A = r0
        L_0x0047:
            X.QDG.A00(r0, r5)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RRK.A02(X.RqZ):void");
    }
}
