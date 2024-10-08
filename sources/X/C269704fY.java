package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.4fY  reason: invalid class name and case insensitive filesystem */
public abstract class C269704fY extends C269524fG implements Serializable {
    public static final HashMap A01;
    public static final HashMap A02;
    public final C269724fa A00;

    /* JADX WARNING: type inference failed for: r1v5, types: [X.4fY, X.4fX] */
    public final C269694fX A05(C269724fa r4) {
        C269694fX r1 = (C269694fX) this;
        if (r1.A00 == r4) {
            return r1;
        }
        Class<?> cls = r1.getClass();
        if (cls == C269694fX.class) {
            return new C269704fY(r4);
        }
        throw new IllegalStateException(002.A0g("Subtype of BeanSerializerFactory (", cls.getName(), ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions"));
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.A00;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        Class<Integer> cls = Integer.class;
        hashMap2.put(cls.getName(), new NumberSerializers$Base(cls));
        Class cls2 = Integer.TYPE;
        hashMap2.put(cls2.getName(), new NumberSerializers$Base(cls2));
        Class<Long> cls3 = Long.class;
        hashMap2.put(cls3.getName(), new NumberSerializers$Base(cls3));
        Class cls4 = Long.TYPE;
        hashMap2.put(cls4.getName(), new NumberSerializers$Base(cls4));
        String name = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.A00;
        hashMap2.put(name, numberSerializers$IntLikeSerializer);
        hashMap2.put(Byte.TYPE.getName(), numberSerializers$IntLikeSerializer);
        String name2 = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.A00;
        hashMap2.put(name2, numberSerializers$ShortSerializer);
        hashMap2.put(Short.TYPE.getName(), numberSerializers$ShortSerializer);
        Class<Double> cls5 = Double.class;
        hashMap2.put(cls5.getName(), new NumberSerializers$Base(cls5));
        Class cls6 = Double.TYPE;
        hashMap2.put(cls6.getName(), new NumberSerializers$Base(cls6));
        String name3 = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.A00;
        hashMap2.put(name3, numberSerializers$FloatSerializer);
        hashMap2.put(Float.TYPE.getName(), numberSerializers$FloatSerializer);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        Class<BigInteger> cls7 = BigInteger.class;
        hashMap2.put(cls7.getName(), new NumberSerializer(cls7));
        Class<BigDecimal> cls8 = BigDecimal.class;
        hashMap2.put(cls8.getName(), new NumberSerializer(cls8));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.A00);
        hashMap2.put(Date.class.getName(), DateSerializer.A00);
        HashMap hashMap3 = new HashMap();
        Class<URL> cls9 = URL.class;
        hashMap3.put(cls9, new StdSerializer(cls9, false));
        Class<URI> cls10 = URI.class;
        hashMap3.put(cls10, new StdSerializer(cls10, false));
        Class<Currency> cls11 = Currency.class;
        hashMap3.put(cls11, new StdSerializer(cls11, false));
        hashMap3.put(UUID.class, new UUIDSerializer());
        Class<Pattern> cls12 = Pattern.class;
        hashMap3.put(cls12, new StdSerializer(cls12, false));
        Class<Locale> cls13 = Locale.class;
        hashMap3.put(cls13, new StdSerializer(cls13, false));
        hashMap3.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        hashMap3.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        hashMap3.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        hashMap3.put(File.class, FileSerializer.class);
        hashMap3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.A00;
        hashMap3.put(Void.class, nullSerializer);
        hashMap3.put(Void.TYPE, nullSerializer);
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof JsonSerializer;
            String name4 = ((Class) entry.getKey()).getName();
            if (z) {
                hashMap2.put(name4, value);
            } else {
                hashMap.put(name4, value);
            }
        }
        hashMap.put(C267574bm.class.getName(), TokenBufferSerializer.class);
        A01 = hashMap2;
        A02 = hashMap;
    }

    public final JsonSerializer A03(C268894eF r6, C269504fE r7, C269134ed r8) {
        if (C252523pF.class.isAssignableFrom(r6.A00)) {
            return SerializableSerializer.A00;
        }
        C8208QkH A012 = r8.A01();
        if (A012 == null) {
            return null;
        }
        C269294et r3 = r7.A05;
        if (r3.A06()) {
            C269574fL.A0H(A012.A0C(), r3.A08());
        }
        C268894eF A03 = A012.A03();
        JsonSerializer A04 = A04(r7, A012);
        if (A04 == null) {
            A04 = (JsonSerializer) A03.A02;
        }
        SPK spk = (SPK) A03.A01;
        if (spk == null) {
            spk = A02(A03, r3);
        }
        return new JsonValueSerializer(A04, A012, spk);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A04(X.C269504fE r6, X.C269064eW r7) {
        /*
            r5 = this;
            X.4et r0 = r6.A05
            X.4eA r4 = r0.A01()
            boolean r0 = r4 instanceof X.C268844e9
            if (r0 == 0) goto L_0x001e
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r7.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r0
            if (r0 == 0) goto L_0x0020
            java.lang.Class r2 = r0.using()
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r0 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            if (r2 == r0) goto L_0x0020
            if (r2 != 0) goto L_0x003a
        L_0x001e:
            r3 = 0
        L_0x001f:
            return r3
        L_0x0020:
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRawValue> r0 = com.fasterxml.jackson.annotation.JsonRawValue.class
            java.lang.annotation.Annotation r0 = r7.A06(r0)
            com.fasterxml.jackson.annotation.JsonRawValue r0 = (com.fasterxml.jackson.annotation.JsonRawValue) r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.value()
            if (r0 == 0) goto L_0x001e
            java.lang.Class r1 = r7.A04()
            r0 = 0
            com.fasterxml.jackson.databind.ser.std.RawSerializer r2 = new com.fasterxml.jackson.databind.ser.std.RawSerializer
            r2.<init>(r1, r0)
        L_0x003a:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r6.A0M(r7, r2)
            java.lang.Object r0 = r4.A0d(r7)
            if (r0 == 0) goto L_0x001f
            X.Tgx r2 = r6.A06(r0)
            if (r2 == 0) goto L_0x001f
            X.4eE r0 = r6.A05()
            X.4eF r1 = r2.BZZ(r0)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269704fY.A04(X.4fE, X.4eW):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public C269704fY(C269724fa r1) {
        this.A00 = r1 == null ? new C269724fa() : r1;
    }
}
