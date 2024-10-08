package X;

import java.util.Iterator;

public final class HG6 extends C320566sa {
    public final HAH A00;

    public HG6(HAH hah, boolean z) {
        super(true, z);
        this.A00 = hah;
    }

    /* renamed from: A04 */
    public final HAW A00(JOP jop) {
        0qQ.A0B(jop, 0);
        Iterator A03 = this.A00.A03();
        while (A03.hasNext()) {
            C296935qt r2 = (C296935qt) A03.next();
            0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.mediakit.ui.definition.picker.MediaKitGridItemModel");
            HAW haw = (HAW) r2;
            if (0qQ.A0K(haw.A02.getId(), jop.getId())) {
                return haw;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r7 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A02(X.C320726sq r7, java.lang.Object r8, java.lang.String r9) {
        /*
            r6 = this;
            X.JOP r8 = (X.JOP) r8
            X.HAW r7 = (X.HAW) r7
            r5 = 0
            r4 = 1
            X.0qQ.A0B(r8, r4)
            java.util.LinkedHashMap r2 = r6.A02
            boolean r0 = r2.containsKey(r9)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.remove(r9)
            X.HAW r1 = (X.HAW) r1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r0 = -1
            r1.Ejf(r5, r0)
        L_0x001e:
            java.util.Collection r0 = r2.values()
            X.0qQ.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            if (r3 >= 0) goto L_0x003f
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            X.HAW r1 = (X.HAW) r1
            r1.Ejf(r4, r0)
            r3 = r0
            goto L_0x0029
        L_0x0046:
            X.HAW r0 = r6.A00(r8)
            if (r0 != 0) goto L_0x0062
            if (r7 == 0) goto L_0x005a
        L_0x004e:
            int r0 = r2.size()
            int r0 = r0 + 1
            r7.Ejf(r4, r0)
            r2.put(r9, r7)
        L_0x005a:
            X.6sW r0 = r6.A00
            if (r0 == 0) goto L_0x0061
            r0.update()
        L_0x0061:
            return
        L_0x0062:
            r7 = r0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HG6.A02(X.6sq, java.lang.Object, java.lang.String):void");
    }
}
