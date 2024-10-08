package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Vwy  reason: case insensitive filesystem */
public abstract class C18700Vwy {
    public static final C20441Wrj A00(String str, 0sP r5, C255513uF r6, SerialDescriptor[] serialDescriptorArr) {
        String str2 = str;
        0qQ.A0B(str, 0);
        if (C51966G9m.A1X(str)) {
            C255513uF r4 = r6;
            if (!r6.equals(C2590840i.A00)) {
                C17912Vi3 vi3 = new C17912Vi3(str2);
                r5.invoke(vi3);
                return new C20441Wrj(str2, 03t.A0J(serialDescriptorArr), vi3, r4, vi3.A03.size());
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final C20441Wrj A01(String str, 0sP r5, SerialDescriptor[] serialDescriptorArr) {
        String str2 = str;
        if (C51966G9m.A1X(str)) {
            C17912Vi3 vi3 = new C17912Vi3(str);
            r5.invoke(vi3);
            return new C20441Wrj(str2, 03t.A0J(serialDescriptorArr), vi3, C2590840i.A00, vi3.A03.size());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C255523uG A02(java.lang.String r4, X.C255503uE r5) {
        /*
            boolean r0 = X.C51966G9m.A1X(r4)
            if (r0 == 0) goto L_0x005c
            java.util.Map r0 = X.C360178eA.A00
            java.util.Iterator r2 = X.DbV.A16(r0)
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r2.next()
            X.0ry r0 = (X.C62230ry) r0
            X.0Yh r0 = (X.0Yh) r0
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = X.0q1.A01(r0)
            X.0qQ.A0A(r0)
            java.lang.String r1 = X.C360178eA.A00(r0)
            r0 = 3486(0xd9e, float:4.885E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r1)
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x000c
        L_0x003e:
            java.lang.String r3 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            java.lang.String r2 = " there already exist "
            java.lang.String r1 = X.C360178eA.A00(r1)
            java.lang.String r0 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            java.lang.String r0 = X.002.A11(r3, r4, r2, r1, r0)
            java.lang.String r1 = X.0rw.A0t(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0056:
            X.3uG r0 = new X.3uG
            r0.<init>(r4, r5)
            return r0
        L_0x005c:
            java.lang.String r1 = "Blank serial names are prohibited"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18700Vwy.A02(java.lang.String, X.3uE):X.3uG");
    }
}
