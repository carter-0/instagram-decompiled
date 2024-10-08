package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4fG  reason: invalid class name and case insensitive filesystem */
public abstract class C269524fG {
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r0 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A00(X.C268894eF r13, com.fasterxml.jackson.databind.JsonSerializer r14, X.C269504fE r15) {
        /*
            r12 = this;
            r10 = r12
            X.4fY r10 = (X.C269704fY) r10
            X.4et r7 = r15.A05
            X.4eS r0 = r7.A01
            X.4eT r0 = r0.A03
            X.4eU r0 = (X.C269044eU) r0
            X.4ed r9 = r0.A03(r13, r7, r7)
            X.4fa r6 = r10.A00
            X.4fb[] r2 = r6.A00
            int r1 = r2.length
            r0 = 0
            if (r1 <= 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            r8 = 0
            if (r0 == 0) goto L_0x0047
            X.5E8 r1 = new X.5E8
            r1.<init>(r2)
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r1.next()
            X.4fb r0 = (X.C269734fb) r0
            com.fasterxml.jackson.databind.JsonSerializer r2 = r0.AVR(r13, r7, r9)
            if (r2 == 0) goto L_0x0020
        L_0x0032:
            r14 = r2
        L_0x0033:
            X.4fc[] r2 = r6.A02
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0141
            X.5E8 r1 = new X.5E8
            r1.<init>(r2)
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0141
            r1.next()
            goto L_0x003d
        L_0x0047:
            X.4eV r1 = r9.A07
            X.4eA r0 = r7.A01()
            java.lang.Object r0 = r0.A0c(r1)
            if (r0 == 0) goto L_0x0059
            com.fasterxml.jackson.databind.JsonSerializer r2 = r15.A0M(r1, r0)
            if (r2 != 0) goto L_0x0032
        L_0x0059:
            if (r14 != 0) goto L_0x0033
            java.lang.Class r5 = r13.A00
            r1 = r5
            if (r5 == 0) goto L_0x013a
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L_0x013a
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 != r0) goto L_0x006b
            com.fasterxml.jackson.databind.JsonSerializer r2 = X.C11129SBk.A00
            goto L_0x0032
        L_0x006b:
            boolean r0 = r5.isPrimitive()
            if (r0 == 0) goto L_0x0075
            java.lang.Class r1 = X.C269574fL.A02(r5)
        L_0x0075:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L_0x0080
            r0 = 5
        L_0x007a:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r2.<init>(r1, r0)
            goto L_0x0032
        L_0x0080:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L_0x0086
            r0 = 6
            goto L_0x007a
        L_0x0086:
            boolean r0 = r1.isPrimitive()
            r4 = 8
            if (r0 != 0) goto L_0x0133
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0133
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            if (r1 != r0) goto L_0x009c
            r0 = 3
            goto L_0x007a
        L_0x009c:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00a6
            r0 = 1
            goto L_0x007a
        L_0x00a6:
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00b0
            r0 = 2
            goto L_0x007a
        L_0x00b0:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            if (r1 == r0) goto L_0x0133
            java.lang.Class<byte[]> r0 = byte[].class
            if (r1 != r0) goto L_0x00ba
            r0 = 7
            goto L_0x007a
        L_0x00ba:
            X.SJu r3 = r9.A08
            if (r3 == 0) goto L_0x00ef
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x00c5
            r3.A02()
        L_0x00c5:
            java.util.LinkedList r11 = r3.A08
            if (r11 == 0) goto L_0x00ef
            int r2 = r11.size()
            r1 = 0
            r0 = 1
            if (r2 <= r0) goto L_0x00e7
            java.lang.Object r1 = r11.get(r1)
            java.lang.Object r0 = r11.get(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Multiple 'as-key' properties defined (%s vs %s)"
            r3.A06(r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e7:
            java.lang.Object r0 = r11.get(r1)
            X.QkH r0 = (X.C8208QkH) r0
            if (r0 != 0) goto L_0x0113
        L_0x00ef:
            X.QkH r0 = r9.A01()
            if (r0 != 0) goto L_0x0113
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            if (r5 == r1) goto L_0x013a
            X.4fM[] r0 = X.C269574fL.A01
            boolean r0 = r1.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x010c
            X.T9d r0 = X.C12831T9d.A00(r7, r5)
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer r2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer
            r2.<init>(r0, r5)
            goto L_0x0032
        L_0x010c:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r2.<init>(r5, r4)
            goto L_0x0032
        L_0x0113:
            X.4eF r1 = r0.A03()
            com.fasterxml.jackson.databind.JsonSerializer r3 = r10.A00(r1, r14, r15)
            boolean r1 = r7.A06()
            if (r1 == 0) goto L_0x012c
            java.lang.reflect.Member r2 = r0.A0C()
            boolean r1 = r7.A08()
            X.C269574fL.A0H(r2, r1)
        L_0x012c:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r14 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r14.<init>(r3, r0, r8)
            goto L_0x0033
        L_0x0133:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r2.<init>(r1, r4)
            goto L_0x0032
        L_0x013a:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic r2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic
            r2.<init>()
            goto L_0x0032
        L_0x0141:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269524fG.A00(X.4eF, com.fasterxml.jackson.databind.JsonSerializer, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A01(X.C268894eF r12, X.C269504fE r13) {
        /*
            r11 = this;
            r7 = r11
            X.4fX r7 = (X.C269694fX) r7
            X.4et r9 = r13.A05
            X.4eS r0 = r9.A01
            X.4eT r8 = r0.A03
            X.4eU r8 = (X.C269044eU) r8
            X.4ed r4 = r8.A03(r12, r9, r9)
            X.4eV r1 = r4.A07
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A04(r13, r1)
            if (r6 != 0) goto L_0x0091
            X.4eA r0 = r9.A01()
            r2 = 0
            if (r0 != 0) goto L_0x0065
            r10 = r12
        L_0x001f:
            r5 = 1
            if (r10 == r12) goto L_0x002d
            java.lang.Class r1 = r12.A00
            java.lang.Class r0 = r10.A00
            if (r0 == r1) goto L_0x002c
            X.4ed r4 = r8.A03(r10, r9, r9)
        L_0x002c:
            r2 = 1
        L_0x002d:
            X.4eA r1 = r4.A04
            if (r1 == 0) goto L_0x006a
            X.4eV r0 = r4.A07
            java.lang.Object r0 = r1.A0d(r0)
            X.Tgx r3 = r4.A02(r0)
            if (r3 == 0) goto L_0x006a
            X.4eE r0 = r13.A05()
            X.4eF r2 = r3.BZZ(r0)
            java.lang.Class r0 = r10.A00
            java.lang.Class r1 = r2.A00
            if (r1 == r0) goto L_0x0057
            X.4ed r4 = r8.A03(r2, r9, r9)
            X.4eV r0 = r4.A07
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A04(r13, r0)
            if (r6 != 0) goto L_0x005f
        L_0x0057:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x005f
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A06(r2, r13, r4, r5)
        L_0x005f:
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r2, r6, r3)
            return r0
        L_0x0065:
            X.4eF r10 = r0.A0C(r12, r9, r1)     // Catch:{ 4iD -> 0x006f }
            goto L_0x001f
        L_0x006a:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r7.A06(r10, r13, r4, r2)
            return r0
        L_0x006f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            X.4eF r0 = r4.A05
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = X.C269574fL.A06(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Invalid type definition for type %s: %s"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.4fD r13 = (X.C269494fD) r13
            X.17Z r2 = r13.A00
            r1 = 0
            X.Qi4 r0 = new X.Qi4
            r0.<init>((X.17Z) r2, (X.C269134ed) r4, (X.SK8) r1, (java.lang.String) r3)
            throw r0
        L_0x0091:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269524fG.A01(X.4eF, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final C8233Qkg A02(C268894eF r10, C269294et r11) {
        C269294et r5 = r11;
        C269054eV r6 = r11.A03(r10.A00).A07;
        C268854eA A01 = r11.A01();
        C13733Tg5 A0K = A01.A0K(r11, r6);
        ArrayList arrayList = null;
        if (A0K == null) {
            A0K = r11.A01.A06;
            if (A0K == null) {
                return null;
            }
        } else {
            C269154ef r3 = r11.A03;
            HashMap hashMap = new HashMap();
            r3.A04(A01, r5, r6, new T9Y(r6.A05, (String) null), hashMap);
            arrayList = new ArrayList(hashMap.values());
        }
        return A0K.AEe(r10, r11, arrayList);
    }
}
