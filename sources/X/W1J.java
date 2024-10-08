package X;

import java.util.ArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

public final class W1J {
    public int A00;
    public final AnonymousClass40W A01;
    public final boolean A02;
    public final boolean A03;

    public W1J(AnonymousClass40P r2, AnonymousClass40W r3) {
        0qQ.A0B(r3, 2);
        this.A01 = r3;
        this.A02 = r2.A0C;
        this.A03 = r2.A06;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C20407Wqr r11, X.AnonymousClass4D7 r12, X.W1J r13) {
        /*
            r3 = 37
            boolean r0 = X.ME0.A02(r3, r12)
            if (r0 == 0) goto L_0x00a5
            r5 = r12
            X.ME0 r5 = (X.ME0) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A05
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r10 = 6
            r9 = 7
            r8 = 4
            r4 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r4) goto L_0x00ac
            java.lang.Object r0 = r5.A04
            java.lang.Object r7 = r5.A03
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r13 = r5.A02
            X.W1J r13 = (X.W1J) r13
            java.lang.Object r11 = r5.A01
            X.Wqr r11 = (X.C20407Wqr) r11
            X.0eS.A00(r1)
            r7.put(r0, r1)
            X.40W r3 = r13.A01
            byte r0 = r3.A03()
            if (r0 == r8) goto L_0x0065
            if (r0 == r9) goto L_0x00b4
            java.lang.String r2 = "Expected end of the object or comma"
        L_0x0044:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0F(r2, r0, r1)
        L_0x004b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0050:
            X.0eS.A00(r1)
            X.40W r3 = r13.A01
            byte r1 = r3.A05(r10)
            byte r0 = r3.A04()
            if (r0 == r8) goto L_0x009e
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            goto L_0x0066
        L_0x0065:
            r1 = 4
        L_0x0066:
            X.40W r2 = r13.A01
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x0090
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x008b
            java.lang.String r1 = r2.A0A()
        L_0x0076:
            r0 = 5
            r2.A05(r0)
            X.0gF r0 = X.C60340gF.A00
            r5.A01 = r11
            r5.A02 = r13
            r5.A03 = r7
            r5.A04 = r1
            r5.A00 = r4
            r11.A02 = r5
            r11.A01 = r0
            return r6
        L_0x008b:
            java.lang.String r1 = r2.A09()
            goto L_0x0076
        L_0x0090:
            if (r1 == r10) goto L_0x00b1
            if (r1 != r8) goto L_0x00b4
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "object"
            X.C18804W2u.A06(r0, r2)
            goto L_0x004b
        L_0x009e:
            r0 = 234(0xea, float:3.28E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            goto L_0x0044
        L_0x00a5:
            X.ME0 r5 = new X.ME0
            r5.<init>(r13, r12, r3)
            goto L_0x0016
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b1:
            r2.A05(r9)
        L_0x00b4:
            kotlinx.serialization.json.JsonObject r6 = new kotlinx.serialization.json.JsonObject
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1J.A00(X.Wqr, X.4D7, X.W1J):java.lang.Object");
    }

    public static final JsonArray A01(W1J w1j) {
        AnonymousClass40W r3 = w1j.A01;
        byte A032 = r3.A03();
        if (r3.A04() != 4) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (r3.A0G()) {
                    arrayList.add(w1j.A03());
                    A032 = r3.A03();
                    if (A032 != 4) {
                        boolean A1S = AnonymousClass7TF.A1S(A032, 9);
                        int i = r3.A00;
                        if (!A1S) {
                            r3.A0F(AnonymousClass000.A00(2262), "", i);
                            break;
                        }
                    }
                } else {
                    if (A032 != 8) {
                        if (A032 == 4) {
                            if (!w1j.A03) {
                                C18804W2u.A06("array", r3);
                            }
                        }
                        return new JsonArray(arrayList);
                    }
                    r3.A05((byte) 9);
                    return new JsonArray(arrayList);
                }
            }
        } else {
            r3.A0F(AnonymousClass000.A00(234), "", r3.A00);
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public static final JsonPrimitive A02(W1J w1j, boolean z) {
        String A0A;
        if (w1j.A02 || !z) {
            A0A = w1j.A01.A0A();
            if (!z && 0qQ.A0K(A0A, "null")) {
                return JsonNull.A00;
            }
        } else {
            A0A = w1j.A01.A09();
        }
        return new JsonLiteral(A0A, z);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Wqr, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r1 = new kotlinx.serialization.json.JsonObject(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.json.JsonElement A03() {
        /*
            r8 = this;
            X.40W r3 = r8.A01
            byte r2 = r3.A04()
            r0 = 1
            if (r2 == r0) goto L_0x000c
            if (r2 != 0) goto L_0x0011
            r0 = 0
        L_0x000c:
            kotlinx.serialization.json.JsonPrimitive r1 = A02(r8, r0)
            return r1
        L_0x0011:
            r0 = 6
            if (r2 != r0) goto L_0x00ec
            int r0 = r8.A00
            int r1 = r0 + 1
            r8.A00 = r1
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0092
            r0 = 0
            X.WvG r1 = new X.WvG
            r1.<init>(r0, r8)
            X.0gF r0 = X.C60340gF.A00
            X.Wqr r7 = new X.Wqr
            r7.<init>()
            r7.A03 = r1
            r7.A01 = r0
            r7.A02 = r7
            java.lang.Object r6 = X.VKN.A00
            r7.A00 = r6
        L_0x0035:
            java.lang.Object r1 = r7.A00
            X.4D7 r5 = r7.A02
            if (r5 != 0) goto L_0x0047
            X.0eS.A00(r1)
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
        L_0x0040:
            int r0 = r8.A00
            int r0 = r0 + -1
            r8.A00 = r0
            return r1
        L_0x0047:
            boolean r0 = X.0qQ.A0K(r6, r1)
            if (r0 == 0) goto L_0x008c
            X.0sK r4 = r7.A03     // Catch:{ all -> 0x0082 }
            java.lang.Object r3 = r7.A01     // Catch:{ all -> 0x0082 }
            boolean r0 = r4 instanceof X.1Em     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0075
            r0 = 0
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x0082 }
            r2 = 3
            X.4Cc r1 = r5.getContext()     // Catch:{ all -> 0x0082 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x0082 }
            if (r1 != r0) goto L_0x006f
            X.Il8 r0 = new X.Il8     // Catch:{ all -> 0x0082 }
            r0.<init>(r5)     // Catch:{ all -> 0x0082 }
        L_0x0067:
            X.0u4.A05(r4, r2)     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r4.invoke(r7, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007d
        L_0x006f:
            X.WvC r0 = new X.WvC     // Catch:{ all -> 0x0082 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0067
        L_0x0075:
            r0 = 3
            X.0u4.A05(r4, r0)     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r4.invoke(r7, r3, r5)     // Catch:{ all -> 0x0082 }
        L_0x007d:
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x0035
            goto L_0x008e
        L_0x0082:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            r5.resumeWith(r0)
            goto L_0x0035
        L_0x008c:
            r7.A00 = r6
        L_0x008e:
            r5.resumeWith(r1)
            goto L_0x0035
        L_0x0092:
            r6 = 6
            byte r1 = r3.A05(r6)
            byte r0 = r3.A04()
            r5 = 4
            if (r0 == r5) goto L_0x00e5
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        L_0x00a3:
            boolean r0 = r3.A0G()
            r2 = 7
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00c8
            java.lang.String r1 = r3.A0A()
        L_0x00b2:
            r0 = 5
            r3.A05(r0)
            kotlinx.serialization.json.JsonElement r0 = r8.A03()
            r4.put(r1, r0)
            byte r1 = r3.A03()
            if (r1 == r5) goto L_0x00a3
            if (r1 == r2) goto L_0x00de
            java.lang.String r2 = "Expected end of the object or comma"
            goto L_0x00ff
        L_0x00c8:
            java.lang.String r1 = r3.A09()
            goto L_0x00b2
        L_0x00cd:
            if (r1 == r6) goto L_0x00db
            if (r1 != r5) goto L_0x00de
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "object"
            X.C18804W2u.A06(r0, r3)
            goto L_0x0106
        L_0x00db:
            r3.A05(r2)
        L_0x00de:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r4)
            goto L_0x0040
        L_0x00e5:
            r0 = 234(0xea, float:3.28E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            goto L_0x00ff
        L_0x00ec:
            r0 = 8
            if (r2 != r0) goto L_0x00f5
            kotlinx.serialization.json.JsonArray r1 = A01(r8)
            return r1
        L_0x00f5:
            java.lang.String r1 = "Cannot read Json element because of unexpected "
            java.lang.String r0 = X.VJ8.A00(r2)
            java.lang.String r2 = X.002.A0R(r1, r0)
        L_0x00ff:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0F(r2, r0, r1)
        L_0x0106:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1J.A03():kotlinx.serialization.json.JsonElement");
    }
}
