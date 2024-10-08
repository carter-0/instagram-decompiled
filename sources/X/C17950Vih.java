package X;

import android.os.Bundle;

/* renamed from: X.Vih  reason: case insensitive filesystem */
public final class C17950Vih {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.os.Bundle r10, java.lang.Object r11) {
        /*
            r9 = this;
            java.lang.String r0 = "DynamicFlowPlugin.extraFlowId"
            java.lang.String r7 = r10.getString(r0)
            if (r7 == 0) goto L_0x005c
            X.1WR r6 = X.1WR.A01()
            X.1WQ r6 = (X.1WQ) r6
            java.util.Map r5 = r6.A01
            java.lang.Object r4 = r5.get(r7)
            X.XAC r4 = (X.XAC) r4
            java.lang.String r0 = "Could not find flow for the given id."
            X.17k.A07(r4, r0)
            X.Wfe r4 = (X.C19797Wfe) r4
            X.Vc9 r3 = r4.A01
            if (r3 != 0) goto L_0x0068
            r0 = 0
        L_0x0022:
            X.Utm r2 = new X.Utm
            r2.<init>(r4, r0)
        L_0x0027:
            boolean r0 = r2 instanceof X.C16370Utn
            if (r0 == 0) goto L_0x005d
            X.Utn r2 = (X.C16370Utn) r2
            int r0 = r2.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x005c
            java.lang.Object r0 = r2.A03
            boolean r0 = X.DbW.A1a(r0)
            if (r0 == 0) goto L_0x005c
        L_0x003b:
            java.util.Map r3 = r6.A00
            java.lang.Object r0 = r3.get(r7)
            X.VT4 r0 = (X.VT4) r0
            if (r0 == 0) goto L_0x0056
            X.V43 r0 = r0.A00
            X.1WW.A00(r0)
            X.6Yo r2 = r0.A00
            X.V1b r0 = X.V1b.ENTRY_POINT
            java.lang.String r1 = r0.toString()
            r0 = 1
            r2.A0G(r1, r0)
        L_0x0056:
            r5.remove(r7)
            r3.remove(r7)
        L_0x005c:
            return
        L_0x005d:
            boolean r0 = r2 instanceof X.C16369Utm
            if (r0 == 0) goto L_0x005c
            X.Utm r2 = (X.C16369Utm) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x003b
            return
        L_0x0068:
            X.XAG r0 = r3.A05
            java.lang.Object r2 = r0.FHf(r3, r11)
            X.XAD r0 = r3.A00
            boolean r0 = r0.AFU(r3, r2)
            if (r0 == 0) goto L_0x00af
            java.util.Stack r1 = r4.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x009c
            r0 = 0
        L_0x007f:
            r8 = -1
            X.XAF r1 = r3.A03
            java.lang.Object r2 = r1.DTf(r3, r2, r8)
            r1 = 0
            r3.A04 = r1
            r4.A01 = r0
            if (r0 == 0) goto L_0x0095
            X.XAF r1 = r0.A02
            java.lang.Object r1 = r1.DTf(r0, r2, r8)
            r4.A02 = r1
        L_0x0095:
            r1 = 1
            X.Utn r2 = new X.Utn
            r2.<init>(r4, r3, r0, r1)
            goto L_0x0027
        L_0x009c:
            java.lang.Object r0 = r1.pop()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r4.A00 = r1
            java.util.List r0 = r4.A03
            java.lang.Object r0 = r0.get(r1)
            X.Vc9 r0 = (X.C17678Vc9) r0
            goto L_0x007f
        L_0x00af:
            r0 = 1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17950Vih.A00(android.os.Bundle, java.lang.Object):void");
    }

    public final void A01(Bundle bundle, Object obj) {
        String string = bundle.getString("DynamicFlowPlugin.extraFlowId");
        if (string != null) {
            1WR.A01().A06(string, obj);
        }
    }
}
