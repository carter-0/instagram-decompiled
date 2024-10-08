package X;

import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.VuS  reason: case insensitive filesystem */
public final class C18576VuS {
    public static final X39 A07 = new WN3();
    public static final X3A A08 = new WN6();
    public final String A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Set A05;
    public final JsonObject A06;

    public final X3A A00(String str, String str2) {
        X3A wna;
        int i;
        AnonymousClass7TF.A1H(str, str2);
        if (00p.A0k(str2, "@REGEX", false)) {
            int length = str2.length();
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < length) {
                    if (str2.charAt(i2) == '(') {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            int i3 = i2 + 1;
            int i4 = length - 1;
            if (i4 >= 0) {
                while (true) {
                    int i5 = i4 - 1;
                    if (str2.charAt(i4) != ')') {
                        if (i5 < 0) {
                            break;
                        }
                        i4 = i5;
                    } else {
                        i = i4;
                        break;
                    }
                }
            }
            return new WN9(str, C51967G9n.A0q(str2, i3, i));
        }
        if (00p.A0k(str2, "@NONNULL", false)) {
            wna = new WN7(str);
        } else {
            wna = new WNA(str, str2);
        }
        return wna;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        r0 = X.C271114hv.A06(r0).A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18576VuS(java.lang.String r19) {
        /*
            r18 = this;
            r5 = r18
            r5.<init>()
            X.3mC r1 = X.C250863mB.A03     // Catch:{ 1pa | IllegalArgumentException -> 0x0016 }
            kotlinx.serialization.json.JsonElementSerializer r0 = kotlinx.serialization.json.JsonElementSerializer.A00     // Catch:{ 1pa | IllegalArgumentException -> 0x0016 }
            r2 = r19
            java.lang.Object r0 = r1.A00(r2, r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0016 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ 1pa | IllegalArgumentException -> 0x0016 }
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            X.0sm r0 = X.0Yt.A0E()
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r0)
        L_0x001f:
            r5.A06 = r1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A03 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A01 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A02 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A04 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.A05 = r0
            java.lang.String r0 = "version"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0058
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r0 = r0.A00()
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            java.lang.String r0 = "unknown"
        L_0x005a:
            r5.A00 = r0
            java.lang.String r0 = "events"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x030d
            kotlinx.serialization.json.JsonArray r1 = X.C271114hv.A02(r0)
        L_0x006a:
            java.util.Iterator r17 = r1.iterator()
        L_0x006e:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0316
            java.lang.Object r9 = r17.next()
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9
            kotlinx.serialization.json.JsonObject r8 = X.C271114hv.A03(r9)
            java.lang.String r7 = "name"
            java.lang.Object r0 = r8.get(r7)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x01a0
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r6 = r0.A00()
            if (r6 == 0) goto L_0x01a0
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r0 = "two_measurement_info"
            java.lang.Object r0 = r8.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x01a4
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)
            java.util.Set r1 = r0.entrySet()
            if (r1 == 0) goto L_0x01a4
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r0 = r0.A00()
            r3.put(r1, r0)
            goto L_0x00b8
        L_0x00d8:
            java.util.Set r0 = r3.entrySet()
            if (r0 == 0) goto L_0x01a4
            java.util.Iterator r16 = r0.iterator()
        L_0x00e2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r16)
            java.lang.String r3 = X.DbT.A13(r0)
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "two_measurement_categorization"
            java.lang.Object r0 = r8.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0191
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)
            java.lang.Object r0 = r0.get(r3)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0191
            kotlinx.serialization.json.JsonArray r0 = X.C271114hv.A02(r0)
            java.util.List r0 = X.00k.A0a(r0)
        L_0x0118:
            X.WNA r11 = new X.WNA
            r11.<init>(r7, r6)
            java.util.Iterator r15 = r0.iterator()
        L_0x0121:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r14 = r15.next()
            kotlinx.serialization.json.JsonElement r14 = (kotlinx.serialization.json.JsonElement) r14
            java.util.Map r10 = r5.A03
            r12 = 58
            java.lang.String r1 = X.002.A0j(r6, r3, r2, r12, r12)
            java.lang.Object r0 = r10.get(r1)
            if (r0 != 0) goto L_0x013f
            java.lang.Integer r0 = X.C51967G9n.A0k()
        L_0x013f:
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.lang.String r12 = X.002.A0G(r1, r12, r0)
            int r0 = r0 + 1
            X.C66580MXl.A1T(r1, r10, r0)
            X.WN8 r10 = new X.WN8
            r10.<init>()
            java.util.List r1 = r10.A00
            r1.add(r11)
            X.0qQ.A0B(r14, r13)
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r14)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0169:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x018d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r14)
            java.lang.String r13 = X.DbT.A13(r0)
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r0 = r0.A00()
            X.X3A r0 = r5.A00(r13, r0)
            r1.add(r0)
            goto L_0x0169
        L_0x018d:
            r4.put(r12, r10)
            goto L_0x0121
        L_0x0191:
            X.0sm r1 = X.0Yt.A0E()
            kotlinx.serialization.json.JsonObject r0 = new kotlinx.serialization.json.JsonObject
            r0.<init>(r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0118
        L_0x01a0:
            X.0sm r4 = X.0Yt.A0E()
        L_0x01a4:
            java.util.Map r0 = r5.A01
            r0.putAll(r4)
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r9)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r0 = "two_measurement_matching"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x026d
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)
            java.util.Set r1 = r0.entrySet()
            if (r1 == 0) goto L_0x026d
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x01d9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0225
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r0 = r1.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)
            java.lang.Object r4 = r1.getKey()
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01fd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x021d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r0 = r0.A00()
            X.AnonymousClass7TF.A1I(r1, r0, r3)
            goto L_0x01fd
        L_0x021d:
            java.util.List r0 = X.00k.A0a(r3)
            r6.put(r4, r0)
            goto L_0x01d9
        L_0x0225:
            java.util.Set r0 = r6.entrySet()
            if (r0 == 0) goto L_0x026d
            java.util.Iterator r10 = r0.iterator()
        L_0x022f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x026d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r6 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.WN4 r4 = new X.WN4
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x024c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0269
            X.0eP r0 = X.JTO.A1A(r3)
            java.lang.Object r2 = r0.A00
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            X.WN5 r1 = new X.WN5
            r1.<init>(r2, r0)
            java.util.List r0 = r4.A00
            r0.add(r1)
            goto L_0x024c
        L_0x0269:
            r8.put(r6, r4)
            goto L_0x022f
        L_0x026d:
            java.util.Map r0 = r5.A02
            r0.putAll(r8)
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r9)
            java.lang.Object r0 = r1.get(r7)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0302
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r7 = r0.A00()
            if (r7 == 0) goto L_0x0302
            java.lang.String r0 = "validation_rule"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0302
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)
            java.util.Set r1 = r0.entrySet()
            if (r1 == 0) goto L_0x0302
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x02a9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0306
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r9)
            java.lang.Object r0 = r1.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonObject r8 = X.C271114hv.A03(r0)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = ""
            r0 = 58
            java.lang.String r4 = X.002.A0j(r7, r2, r1, r0, r0)
            X.WN8 r3 = new X.WN8
            r3.<init>()
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x02d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            java.lang.String r0 = r0.A00()
            X.X3A r1 = r5.A00(r1, r0)
            java.util.List r0 = r3.A00
            r0.add(r1)
            goto L_0x02d8
        L_0x02fe:
            r6.put(r4, r3)
            goto L_0x02a9
        L_0x0302:
            X.0sm r6 = X.0Yt.A0E()
        L_0x0306:
            java.util.Map r0 = r5.A04
            r0.putAll(r6)
            goto L_0x006e
        L_0x030d:
            X.0sn r0 = X.0sn.A00
            kotlinx.serialization.json.JsonArray r1 = new kotlinx.serialization.json.JsonArray
            r1.<init>(r0)
            goto L_0x006a
        L_0x0316:
            java.util.Map r0 = r5.A01
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r0)
        L_0x031c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0341
            java.lang.Object r3 = X.C13991Tnr.A0Y(r4)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r0 = 1
            char[] r1 = new char[r0]
            r0 = 58
            r1[r2] = r0
            java.util.List r0 = X.00l.A0Q(r3, r1, r2)
            java.lang.Object r1 = r0.get(r2)
            java.util.Set r0 = r5.A05
            r0.add(r1)
            goto L_0x031c
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18576VuS.<init>(java.lang.String):void");
    }
}
