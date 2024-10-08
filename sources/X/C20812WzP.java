package X;

import java.util.ArrayList;

/* renamed from: X.WzP  reason: case insensitive filesystem */
public abstract class C20812WzP extends C20442Wrk {
    public final String A0G() {
        ArrayList arrayList = this.A01;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return 00k.A0P(".", "$.", "", arrayList, (0sP) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r1 = r2.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0H(kotlinx.serialization.descriptors.SerialDescriptor r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C20811WzO
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L_0x0008:
            return r1
        L_0x0009:
            boolean r0 = r5 instanceof X.C20815WzT
            if (r0 == 0) goto L_0x0068
            r3 = r5
            X.WzT r3 = (X.C20815WzT) r3
            boolean r0 = r3 instanceof X.C20814WzS
            if (r0 == 0) goto L_0x001f
            X.WzS r3 = (X.C20814WzS) r3
            int r1 = r7 / 2
            java.util.List r0 = r3.A02
            java.lang.String r1 = X.AnonymousClass7TE.A19(r0, r1)
            return r1
        L_0x001f:
            X.3mB r2 = r3.A01
            X.3uF r1 = r6.BKK()
            X.40i r0 = X.C2590840i.A00
            X.0qQ.A0K(r1, r0)
            java.lang.String r4 = r6.B0V(r7)
            X.40P r0 = r3.A02
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0067
            kotlinx.serialization.json.JsonObject r1 = r3.A02
            java.util.Set r0 = r1.keySet()
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0067
            java.util.Map r3 = X.C2591440o.A02(r6, r2)
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = r2.next()
            java.lang.Number r0 = X.C51966G9m.A14(r1, r3)
            if (r0 == 0) goto L_0x004c
            int r0 = r0.intValue()
            if (r0 != r7) goto L_0x004c
        L_0x0063:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0008
        L_0x0067:
            return r4
        L_0x0068:
            java.lang.String r1 = r6.B0V(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20812WzP.A0H(kotlinx.serialization.descriptors.SerialDescriptor, int):java.lang.String");
    }
}
