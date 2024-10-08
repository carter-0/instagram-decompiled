package X;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.42T  reason: invalid class name */
public abstract class AnonymousClass42T {
    public static final Object A02(AnonymousClass4D7 r1, AnonymousClass2Q9[] r2) {
        if (r2.length == 0) {
            return 0sn.A00;
        }
        return new AnonymousClass42U(r2).A00(r1);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.util.Collection r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 22
            boolean r0 = X.C58075Il7.A02(r3, r7)
            if (r0 == 0) goto L_0x0047
            r5 = r7
            X.Il7 r5 = (X.C58075Il7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r2) goto L_0x0050
            java.lang.Object r1 = r5.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0eS.A00(r4)
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()
            X.4Co r0 = (X.C262204Co) r0
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r0 = r0.CfH(r5)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x003f:
            X.0eS.A00(r4)
            java.util.Iterator r1 = r6.iterator()
            goto L_0x0028
        L_0x0047:
            X.Il7 r5 = new X.Il7
            r5.<init>(r3, r7)
            goto L_0x0016
        L_0x004d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0050:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass42T.A01(java.util.Collection, X.4D7):java.lang.Object");
    }

    public static final Object A00(Collection collection, AnonymousClass4D7 r2) {
        if (collection.isEmpty()) {
            return 0sn.A00;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass42U.A01;
        return new AnonymousClass42U((AnonymousClass2Q9[]) collection.toArray(new AnonymousClass2Q9[0])).A00(r2);
    }
}
