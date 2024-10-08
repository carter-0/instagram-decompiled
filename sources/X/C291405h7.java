package X;

import com.facebook.common.json.FbSerializerProvider$1;
import com.facebook.common.json.FbSerializerProvider$2;
import com.facebook.common.json.FbSerializerProvider$3;
import com.facebook.common.json.FbSerializerProvider$4;
import com.facebook.common.json.FbSerializerProvider$5;
import com.facebook.common.json.FbSerializerProvider$6;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5h7  reason: invalid class name and case insensitive filesystem */
public final class C291405h7 extends C269494fD {
    public static boolean A02;
    public static JsonSerializer A03 = new FbSerializerProvider$5();
    public static JsonSerializer A04 = new FbSerializerProvider$4();
    public static JsonSerializer A05 = new FbSerializerProvider$2();
    public static JsonSerializer A06 = new FbSerializerProvider$6();
    public static JsonSerializer A07 = new FbSerializerProvider$3();
    public static final ConcurrentMap A08 = new ConcurrentHashMap();
    public JsonSerializer A00 = new FbSerializerProvider$1(this);
    public final AnonymousClass4iC A01;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A0J(X.C13901TjO r7, java.lang.Class r8, boolean r9) {
        /*
            r6 = this;
            r5 = 1
            r4 = 0
            java.util.concurrent.ConcurrentMap r3 = A08
            java.lang.Object r0 = r3.get(r8)
            com.fasterxml.jackson.databind.JsonSerializer r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0
            if (r0 != 0) goto L_0x0019
            java.lang.Class<X.4iQ> r0 = X.C271214iQ.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.JsonSerializer r0 = A07
        L_0x0016:
            r3.put(r8, r0)
        L_0x0019:
            return r0
        L_0x001a:
            java.lang.Class<X.3ls> r0 = X.C250673ls.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x0025
            com.fasterxml.jackson.databind.JsonSerializer r0 = A04
            return r0
        L_0x0025:
            java.lang.Class<X.3pF> r0 = X.C252523pF.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x0030
            com.fasterxml.jackson.databind.JsonSerializer r0 = A05
            goto L_0x0016
        L_0x0030:
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto L_0x0039
            com.fasterxml.jackson.databind.JsonSerializer r0 = A03
            goto L_0x0016
        L_0x0039:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x0044
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A00
            goto L_0x0016
        L_0x0044:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x004f
            com.fasterxml.jackson.databind.JsonSerializer r0 = A06
            goto L_0x0016
        L_0x004f:
            java.lang.String r2 = r8.getName()     // Catch:{ ClassNotFoundException -> 0x0065 }
            r1 = 36
            r0 = 95
            java.lang.String r1 = r2.replace(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0065 }
            java.lang.String r0 = "Serializer"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0065 }
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0065 }
            goto L_0x0072
        L_0x0065:
            java.lang.String r1 = r8.getName()     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.String r0 = "$Serializer"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
        L_0x0072:
            java.lang.Object r0 = r3.get(r8)
            com.fasterxml.jackson.databind.JsonSerializer r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0
            if (r0 != 0) goto L_0x0019
            java.lang.Class<com.facebook.flatbuffers.Flattenable> r0 = com.facebook.flatbuffers.Flattenable.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x0091
            java.lang.Class<X.5h7> r2 = X.C291405h7.class
            java.lang.String r0 = r8.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Serializing a FlatBuffer based object to Json: %s"
            X.0KC.A0B(r2, r0, r1)
        L_0x0091:
            com.fasterxml.jackson.databind.JsonSerializer r1 = super.A0J(r4, r8, r5)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009f
        L_0x0096:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L_0x00aa
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.A0O(r8)
        L_0x009f:
            r3.put(r8, r1)
            X.4iC r0 = r6.A01
            if (r0 == 0) goto L_0x00a9
            r8.toString()
        L_0x00a9:
            return r1
        L_0x00aa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291405h7.A0J(X.TjO, java.lang.Class, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final /* bridge */ /* synthetic */ C269494fD A0W(C269294et r3, C269524fG r4) {
        return new C291405h7(this.A01, r3, this, r4);
    }

    public C291405h7(AnonymousClass4iC r5, C269294et r6, C269504fE r7, C269524fG r8) {
        super(r6, r7, r8);
        this.A01 = r5;
        if (!A02) {
            ConcurrentMap concurrentMap = A08;
            concurrentMap.put(String.class, new StringSerializer());
            Class<Integer> cls = Integer.class;
            concurrentMap.put(cls, new StdSerializer((Class) cls));
            Class<Long> cls2 = Long.class;
            concurrentMap.put(cls2, new StdSerializer((Class) cls2));
            concurrentMap.put(Boolean.class, new BooleanSerializer(false));
            concurrentMap.put(Float.class, new NumberSerializers$FloatSerializer());
            Class<Double> cls3 = Double.class;
            concurrentMap.put(cls3, new StdSerializer((Class) cls3));
            A02 = true;
        }
    }
}
