package X;

import com.facebook.common.json.ArrayListDeserializer;
import com.facebook.common.json.ImmutableListDeserializer;
import com.facebook.common.json.ImmutableMapDeserializer;
import com.facebook.common.json.LinkedHashMapDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.4db  reason: invalid class name and case insensitive filesystem */
public final class C268554db extends C268544da {
    public static C268554db A01;
    public final AnonymousClass4iC A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4iG, java.lang.Object] */
    public C268554db(AnonymousClass4iC r14, 15p r15) {
        super(r15);
        C269454f9 r4;
        this.A00 = r14;
        A0H(new Object());
        C269254ep r1 = C269254ep.NONE;
        C269184ei r3 = this.A0A;
        r3.A02 = new C269234en(r1);
        C269464fA r0 = C269464fA.FAIL_ON_UNKNOWN_PROPERTIES;
        C269454f9 r5 = this.A00;
        int i = r5.A00;
        int i2 = i & (r0.A00 ^ -1);
        if (i2 == i) {
            r4 = r5;
        } else {
            r4 = new C269454f9(r5, i2, r5.A03, r5.A04, r5.A01, r5.A02, r5.A00);
        }
        this.A00 = r4;
        C269204ek r12 = C269204ek.NON_NULL;
        r3.A00 = new C269194ej(r12, r12, (Class) null, (Class) null);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4eQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.4eR, java.lang.Object] */
    static {
        AnonymousClass4iA r7 = new AnonymousClass4iA();
        C268854eA r5 = C268544da.A0D;
        AnonymousClass4eE r11 = AnonymousClass4eE.A0A;
        C268954eL r12 = C268954eL.A06;
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C269024eS r3 = new C269024eS(C268964eM.A01, r5, (T9E) null, r7, new Object(), new Object(), (C13733Tg5) null, r11, r12, locale, timeZone);
        Class<C268544da> cls = C268544da.class;
        try {
            Field declaredField = cls.getDeclaredField("DEFAULT_INTROSPECTOR");
            declaredField.setAccessible(true);
            declaredField.set((Object) null, r7);
            Field declaredField2 = cls.getDeclaredField("DEFAULT_BASE");
            declaredField2.setAccessible(true);
            declaredField2.set((Object) null, r3);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4iC, java.lang.Object] */
    public static synchronized C268554db A02() {
        C268554db r2;
        synchronized (C268554db.class) {
            r2 = A01;
            if (r2 == null) {
                r2 = new C268554db(new Object(), new 15p((C249933kc) null));
                A01 = r2;
            }
        }
        return r2;
    }

    public final JsonDeserializer A0M(C269674fV r2, Type type) {
        if (type instanceof Class) {
            return A0L(r2, (Class) type);
        }
        return A0K(r2, this.A05.A09(type));
    }

    public final JsonDeserializer A07(C269674fV r2, C268894eF r3) {
        return A0K(r2, r3);
    }

    public final Object A0A(16F r2, C269454f9 r3, C268894eF r4) {
        if (r2.A1K() == null) {
            r2.A1R(this);
        }
        return super.A0A(r2, r3, r4);
    }

    public final Object A0B(16F r2, C268894eF r3) {
        if (r2.A1K() == null) {
            r2.A1R(this);
        }
        return super.A0B(r2, r3);
    }

    public final JsonDeserializer A0K(C269674fV r4, C268894eF r5) {
        JsonDeserializer jsonDeserializer;
        Class<String> cls;
        JsonDeserializer A002;
        if (!r5.A0J() && (A002 = AnonymousClass4iO.A00(r5.A00)) != null) {
            return A002;
        }
        Class<ImmutableMap> cls2 = r5.A00;
        if (cls2 == List.class || cls2 == ArrayList.class) {
            return new ArrayListDeserializer(r5);
        }
        if (cls2 == ImmutableList.class) {
            return new ImmutableListDeserializer(r5);
        }
        C268894eF A07 = r5.A07(0);
        if (A07 != null && ((cls = A07.A00) == String.class || Enum.class.isAssignableFrom(cls))) {
            if (cls2 == Map.class || cls2 == HashMap.class || cls2 == LinkedHashMap.class) {
                return new LinkedHashMapDeserializer(r5);
            }
            if (cls2 == ImmutableMap.class) {
                return new ImmutableMapDeserializer(r5);
            }
        }
        try {
            jsonDeserializer = super.A07(r4, r5);
        } catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                jsonDeserializer = SMS.A00(cls2, cls2.getName());
            } else {
                throw e;
            }
        }
        if (this.A00 == null) {
            return jsonDeserializer;
        }
        r5.toString();
        return jsonDeserializer;
    }

    public final JsonDeserializer A0L(C269674fV r3, Class cls) {
        JsonDeserializer A002 = AnonymousClass4iO.A00(cls);
        if (A002 == null) {
            A002 = super.A07(r3, this.A05.A09(cls));
            if (this.A00 != null) {
                cls.toString();
            }
        }
        return A002;
    }
}
