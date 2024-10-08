package X;

import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class SQ9 {
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r5, java.util.Map r6, boolean r7) {
        /*
            if (r5 == 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Character
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Short
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.lang.String
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0046
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r1 = r5.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = A00(r0, r6, r7)
            r3.add(r0)
            goto L_0x0034
        L_0x0046:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L_0x006f
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r5)
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006e
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = A00(r0, r6, r7)
            r3.put(r1, r0)
            goto L_0x0054
        L_0x006e:
            return r3
        L_0x006f:
            boolean r0 = r5 instanceof X.C10448RsP
            if (r0 == 0) goto L_0x007a
            X.RsP r5 = (X.C10448RsP) r5
            java.util.Map r5 = processPttBloksPayload(r5, r6, r7)
            return r5
        L_0x007a:
            java.lang.Class r0 = r5.getClass()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()
            int r2 = r3.length
            r1 = 0
        L_0x0088:
            if (r1 >= r2) goto L_0x0092
            r0 = r3[r1]
            processFieldPayload(r0, r5, r4, r6, r7)
            int r1 = r1 + 1
            goto L_0x0088
        L_0x0092:
            return r4
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ9.A00(java.lang.Object, java.util.Map, boolean):java.lang.Object");
    }

    public static AnonymousClass34S createPayloads(Object obj) {
        byte[] bytes;
        byte[] bArr;
        obj.getClass();
        C7210Pzc pzc = new C7210Pzc();
        pzc.A05 = false;
        Gson A00 = pzc.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        String A0B = A00.A0B(A00(obj, A1E, false));
        if (!A1E.isEmpty()) {
            String A0B2 = A00.A0B(A1E);
            bytes = A0B.getBytes(Charset.defaultCharset());
            bArr = A0B2.getBytes(Charset.defaultCharset());
        } else {
            bytes = A0B.getBytes(Charset.defaultCharset());
            bArr = null;
        }
        return new AnonymousClass34S(bytes, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void processFieldPayload(java.lang.reflect.Field r4, java.lang.Object r5, java.util.Map r6, java.util.Map r7, boolean r8) {
        /*
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r4.isSynthetic()
            if (r0 != 0) goto L_0x005f
            r2 = 1
            r4.setAccessible(r2)
            java.lang.Object r3 = r4.get(r5)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<com.fbpay.ptt.interfaces.SerializedName> r1 = com.fbpay.ptt.interfaces.SerializedName.class
            boolean r0 = r4.isAnnotationPresent(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r1)
            com.fbpay.ptt.interfaces.SerializedName r0 = (com.fbpay.ptt.interfaces.SerializedName) r0
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r0.value()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0065
        L_0x0034:
            if (r8 != 0) goto L_0x0060
            java.lang.Class<com.fbpay.ptt.interfaces.Sensitive> r0 = com.fbpay.ptt.interfaces.Sensitive.class
            boolean r0 = r4.isAnnotationPresent(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "csc"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0060
        L_0x0053:
            java.lang.Object r0 = A00(r3, r7, r2)
            r7.put(r1, r0)
            java.lang.String r0 = "$e2ee"
        L_0x005c:
            r6.put(r1, r0)
        L_0x005f:
            return
        L_0x0060:
            java.lang.Object r0 = A00(r3, r7, r8)
            goto L_0x005c
        L_0x0065:
            java.lang.String r1 = r4.getName()
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ9.processFieldPayload(java.lang.reflect.Field, java.lang.Object, java.util.Map, java.util.Map, boolean):void");
    }

    public static Map processPttBloksPayload(C10448RsP rsP, Map map, boolean z) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Map unmodifiableMap = Collections.unmodifiableMap(rsP.A00);
        Iterator A0u = AnonymousClass7TF.A0u(unmodifiableMap);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A1E.put(A1J.getKey(), A00(A1J.getValue(), map, z));
        }
        for (Object next : Collections.unmodifiableSet(rsP.A01)) {
            if (unmodifiableMap.containsKey(next)) {
                map.put(next, A00(unmodifiableMap.get(next), map, true));
                A1E.put(next, "$e2ee");
            }
        }
        return A1E;
    }
}
