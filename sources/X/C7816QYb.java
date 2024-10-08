package X;

import java.util.List;

/* renamed from: X.QYb  reason: case insensitive filesystem */
public final class C7816QYb extends SIU {
    public final C11404SSb A00;
    public final List A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.QYr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.QYq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.QYr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.QYr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7816QYb(X.C11404SSb r10, com.facebook.react.bridge.ReadableMap r11) {
        /*
            r9 = this;
            r9.<init>()
            r9.A00 = r10
            java.lang.String r0 = "transforms"
            com.facebook.react.bridge.ReadableArray r7 = r11.getArray(r0)
            if (r7 != 0) goto L_0x0015
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x0012:
            r9.A01 = r5
            return
        L_0x0015:
            int r6 = r7.size()
            java.util.ArrayList r5 = X.DbS.A0v(r6)
            r4 = 0
        L_0x001e:
            if (r4 >= r6) goto L_0x0012
            com.facebook.react.bridge.ReadableMap r8 = r7.getMap(r4)
            java.lang.String r0 = "property"
            java.lang.String r3 = r8.getString(r0)
            java.lang.String r0 = "type"
            java.lang.String r1 = r8.getString(r0)
            java.lang.String r0 = "animated"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0050
            X.QYq r2 = new X.QYq
            r2.<init>(r9)
            r2.A00 = r3
            java.lang.String r0 = "nodeTag"
            int r0 = r8.getInt(r0)
            r2.A00 = r0
        L_0x004a:
            r5.add(r2)
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0050:
            X.QYr r2 = new X.QYr
            r2.<init>(r9)
            r2.A00 = r3
            java.lang.String r0 = "value"
            double r0 = r8.getDouble(r0)
            r2.A00 = r0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7816QYb.<init>(X.SSb, com.facebook.react.bridge.ReadableMap):void");
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "TransformAnimatedNode[", A1A);
        A1A.append("]: transformConfigs: ");
        return AnonymousClass7TF.A0i(this.A01, A1A);
    }
}
