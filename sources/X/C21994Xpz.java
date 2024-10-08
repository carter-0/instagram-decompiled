package X;

import java.util.List;

/* renamed from: X.Xpz  reason: case insensitive filesystem */
public abstract class C21994Xpz {
    public static final ThreadLocal A00 = new Y5P();

    public static void A01() {
        try {
            List list = ((C21390XZx) A00.get()).A01;
            17k.A0F(AnonymousClass7TE.A1b(list));
            list.remove(list.size() - 1);
        } catch (IllegalStateException e) {
            AnonymousClass0fB.A00();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(int r5) {
        /*
            android.content.Context r0 = X.C22224Xxe.A00()
            r4 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.ThreadLocal r0 = A00
            java.lang.Object r0 = r0.get()
            X.XZx r0 = (X.C21390XZx) r0
            if (r0 == 0) goto L_0x0021
            java.util.List r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0021
            java.lang.Object r1 = X.C66582MXn.A0r(r1)
            X.YCK r1 = (X.YCK) r1
            if (r1 != 0) goto L_0x0029
        L_0x0021:
            android.content.Context r0 = X.C22224Xxe.A00()
        L_0x0025:
            X.Xxe r1 = X.C22224Xxe.get(r0)
        L_0x0029:
            X.YCK r1 = (X.YCK) r1
            r3 = 0
            java.lang.ThreadLocal r0 = A00
            java.lang.Object r0 = r0.get()
            X.XZx r0 = (X.C21390XZx) r0
            X.YCK r2 = r1.Bpl()
            java.util.List r0 = r0.A01
            r0.add(r2)
            X.XZx r3 = r1.ASh()     // Catch:{ all -> 0x0055 }
            r0 = r1
            X.XLx r0 = (X.XLx) r0     // Catch:{ all -> 0x0055 }
            X.Xxe r0 = r0.A00     // Catch:{ all -> 0x0055 }
            X.XLy r0 = r0.Bpn()     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = com.facebook.ultralight.UL.factorymap.get(r5, r0, r4)     // Catch:{ all -> 0x0055 }
            A01()
            r1.ATZ(r3)
            return r0
        L_0x0055:
            r0 = move-exception
            A01()
            r1.ATZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21994Xpz.A00(int):java.lang.Object");
    }
}
