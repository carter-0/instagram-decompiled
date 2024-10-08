package androidx.compose.foundation.lazy.layout;

import X.0sL;
import X.0sP;
import X.AnonymousClass4D7;
import X.C285235Qj;
import X.C287455aA;
import X.C288875cd;
import androidx.compose.ui.Modifier;

public final class AwaitFirstLayoutModifier implements C288875cd {
    public AnonymousClass4D7 A00;
    public boolean A01;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.C376709Ja.A00(r5, r7)
            if (r0 == 0) goto L_0x0053
            r4 = r7
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0030
            if (r0 != r5) goto L_0x0059
            java.lang.Object r2 = r4.A02
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            X.0eS.A00(r1)
        L_0x0026:
            if (r2 == 0) goto L_0x002d
            X.0gF r0 = X.C60340gF.A00
            r2.resumeWith(r0)
        L_0x002d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0030:
            X.0eS.A00(r1)
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x002d
            X.4D7 r2 = r6.A00
            r4.A01 = r6
            r4.A02 = r2
            r4.A00 = r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01
            X.4D7 r1 = X.1Ey.A02(r4)
            X.3Pl r0 = new X.3Pl
            r0.<init>(r1)
            r6.A00 = r0
            java.lang.Object r0 = r0.A00()
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x0053:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r6, r7, r5)
            goto L_0x0015
        L_0x0059:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.A00(X.4D7):java.lang.Object");
    }

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }
}
