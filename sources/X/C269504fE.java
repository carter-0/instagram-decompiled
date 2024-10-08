package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4fE  reason: invalid class name and case insensitive filesystem */
public abstract class C269504fE extends C269514fF {
    public static final JsonSerializer A0C = new FailingSerializer();
    public static final JsonSerializer A0D = new UnknownSerializer();
    public JsonSerializer A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public DateFormat A03;
    public JsonSerializer A04;
    public final C269294et A05;
    public final C269524fG A06;
    public final Class A07;
    public final boolean A08;
    public final C269534fH A09;
    public final AnonymousClass5EC A0A;
    public transient C269444f8 A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer A0J(X.C13901TjO r9, java.lang.Class r10, boolean r11) {
        /*
            r8 = this;
            r5 = 0
            X.5EC r3 = r8.A0A
            X.5ED[] r2 = r3.A01
            java.lang.String r0 = r10.getName()
            int r0 = r0.hashCode()
            int r1 = r0 + 1
            int r0 = r3.A00
            r1 = r1 & r0
            r1 = r2[r1]
            if (r1 != 0) goto L_0x0050
        L_0x0016:
            X.4fH r4 = r8.A09
            monitor-enter(r4)
            java.util.HashMap r7 = r4.A00     // Catch:{ all -> 0x0072 }
            r6 = 1
            X.5EE r0 = new X.5EE     // Catch:{ all -> 0x0072 }
            r0.<init>(r10, r6)     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0072 }
            com.fasterxml.jackson.databind.JsonSerializer r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x005c
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A0I(r5, r10)
            X.4fG r2 = r8.A06
            X.4et r1 = r8.A05
            X.4eS r0 = r1.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r10)
            X.Qkg r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L_0x004a
            X.SPK r1 = r0.A06(r5)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer
            r0.<init>(r3, r1)
            r3 = r0
        L_0x004a:
            monitor-enter(r4)
            goto L_0x005d
        L_0x004c:
            X.5ED r1 = r1.A02
            if (r1 == 0) goto L_0x0016
        L_0x0050:
            java.lang.Class r0 = r1.A03
            if (r0 != r10) goto L_0x004c
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x004c
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01
            if (r0 == 0) goto L_0x0016
        L_0x005c:
            return r0
        L_0x005d:
            X.5EE r0 = new X.5EE     // Catch:{ all -> 0x006f }
            r0.<init>(r10, r6)     // Catch:{ all -> 0x006f }
            java.lang.Object r0 = r7.put(r0, r3)     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006d
            java.util.concurrent.atomic.AtomicReference r0 = r4.A01     // Catch:{ all -> 0x006f }
            r0.set(r5)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r3
        L_0x006f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269504fE.A0J(X.TjO, java.lang.Class, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final JsonSerializer A0M(C269064eW r4, Object obj) {
        C268894eF A032;
        StringBuilder sb;
        String str;
        JsonSerializer jsonSerializer = null;
        if (!(obj instanceof JsonSerializer)) {
            if (!(obj instanceof Class)) {
                A032 = r4.A03();
                sb = new StringBuilder();
                sb.append("AnnotationIntrospector returned serializer definition of type ");
                sb.append(obj.getClass().getName());
                str = "; expected type JsonSerializer or Class<JsonSerializer> instead";
            } else {
                Class<JsonSerializer.None> cls = (Class) obj;
                if (cls != JsonSerializer.None.class && !C269574fL.A0I(cls)) {
                    if (!JsonSerializer.class.isAssignableFrom(cls)) {
                        A032 = r4.A03();
                        sb = new StringBuilder();
                        sb.append("AnnotationIntrospector returned Class ");
                        sb.append(cls.getName());
                        str = "; expected Class<JsonSerializer>";
                    } else {
                        obj = C269574fL.A03(cls, this.A05.A06());
                    }
                }
                return jsonSerializer;
            }
            sb.append(str);
            A08(A032, sb.toString());
            throw AnonymousClass00P.createAndThrow();
        }
        jsonSerializer = (JsonSerializer) obj;
        if (jsonSerializer instanceof AnonymousClass5EG) {
            ((AnonymousClass5EG) jsonSerializer).EIT(this);
        }
        return jsonSerializer;
    }

    public final S4W A0Q(T9X t9x, Object obj) {
        Map identityHashMap;
        C269494fD r5 = (C269494fD) this;
        Map map = r5.A02;
        if (map == null) {
            if (r5.A05.A0D(C269424f6.USE_EQUALITY_FOR_OBJECT_ID)) {
                identityHashMap = new HashMap();
            } else {
                identityHashMap = new IdentityHashMap();
            }
            r5.A02 = identityHashMap;
        } else {
            S4W s4w = (S4W) map.get(obj);
            if (s4w != null) {
                return s4w;
            }
        }
        ArrayList arrayList = r5.A01;
        if (arrayList != null) {
            int i = 0;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                T9X t9x2 = (T9X) arrayList.get(i);
                if (t9x2.A02(t9x)) {
                    t9x = t9x2;
                    break;
                }
                i++;
            }
        } else {
            arrayList = new ArrayList(8);
            r5.A01 = arrayList;
        }
        arrayList.add(t9x);
        S4W s4w2 = new S4W(t9x);
        r5.A02.put(obj, s4w2);
        return s4w2;
    }

    public final Object A0R(Class cls) {
        if (cls != null) {
            return C269574fL.A03(cls, this.A05.A06());
        }
        return null;
    }

    public final boolean A0V(Object obj) {
        C268894eF A092;
        C269494fD r6 = (C269494fD) this;
        try {
            return obj.equals((Object) null);
        } catch (Throwable th) {
            Class<?> cls = obj.getClass();
            String format = String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{cls.getName(), th.getClass().getName(), C269574fL.A09(th)});
            17Z r2 = r6.A00;
            if (cls == null) {
                A092 = null;
            } else {
                A092 = r6.A05().A09(cls);
            }
            C8161Qi4 qi4 = new C8161Qi4(r2, A092, format);
            qi4.initCause(th);
            throw qi4;
        }
    }

    public final C268894eF A0A(C268894eF r3, Class cls) {
        if (r3.A00 != cls) {
            return this.A05.A01.A07.A05(r3, cls, true);
        }
        return r3;
    }

    public final JsonSerializer A0B(C13901TjO tjO, C268894eF r3) {
        JsonSerializer A002 = this.A0A.A00(r3);
        if (A002 == null && (A002 = this.A09.A00(r3)) == null && (A002 = A0L(r3)) == null) {
            return A0O(r3.A00);
        }
        return A0F(tjO, A002);
    }

    public final JsonSerializer A0C(C13901TjO tjO, C268894eF r4) {
        JsonSerializer A002 = this.A06.A00(r4, this.A04, this);
        if (A002 instanceof AnonymousClass5EG) {
            ((AnonymousClass5EG) A002).EIT(this);
        }
        return A0F(tjO, A002);
    }

    public final JsonSerializer A0D(C13901TjO tjO, C268894eF r4) {
        JsonSerializer A002 = this.A0A.A00(r4);
        if (A002 == null && (A002 = this.A09.A00(r4)) == null && (A002 = A0L(r4)) == null) {
            return A0O(r4.A00);
        }
        if (A002 instanceof C269714fZ) {
            return ((C269714fZ) A002).ALi(tjO, this);
        }
        return A002;
    }

    public final JsonSerializer A0E(C13901TjO tjO, C268894eF r6) {
        if (r6 == null) {
            throw new AnonymousClass4iD(((C269494fD) this).A00, "Null passed for `valueType` of `findValueSerializer()`", (Throwable) null);
        }
        JsonSerializer A002 = this.A0A.A00(r6);
        if (A002 == null && (A002 = this.A09.A00(r6)) == null && (A002 = A0L(r6)) == null) {
            return A0O(r6.A00);
        }
        return A0F(tjO, A002);
    }

    public final JsonSerializer A0F(C13901TjO tjO, JsonSerializer jsonSerializer) {
        if (jsonSerializer == null || !(jsonSerializer instanceof C269714fZ)) {
            return jsonSerializer;
        }
        return ((C269714fZ) jsonSerializer).ALi(tjO, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r2.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A0G(X.C13901TjO r3, java.lang.Class r4) {
        /*
            r2 = this;
            X.5EC r0 = r2.A0A
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x002b
            X.4fH r1 = r2.A09
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01(r4)
            if (r0 != 0) goto L_0x002b
            X.4et r0 = r2.A05
            X.4eS r0 = r0.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r4)
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0P(r4)
            if (r0 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0O(r4)
            return r0
        L_0x002b:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0F(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269504fE.A0G(X.TjO, java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A0H(X.C13901TjO r4, java.lang.Class r5) {
        /*
            r3 = this;
            X.5EC r0 = r3.A0A
            com.fasterxml.jackson.databind.JsonSerializer r2 = r0.A01(r5)
            if (r2 != 0) goto L_0x002b
            X.4fH r1 = r3.A09
            com.fasterxml.jackson.databind.JsonSerializer r2 = r1.A01(r5)
            if (r2 != 0) goto L_0x002b
            X.4et r0 = r3.A05
            X.4eS r0 = r0.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r5)
            com.fasterxml.jackson.databind.JsonSerializer r2 = r1.A00(r0)
            if (r2 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r2 = r3.A0P(r5)
            if (r2 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r2 = r3.A0O(r5)
        L_0x002a:
            return r2
        L_0x002b:
            boolean r0 = r2 instanceof X.C269714fZ
            if (r0 == 0) goto L_0x002a
            X.4fZ r2 = (X.C269714fZ) r2
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.ALi(r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269504fE.A0H(X.TjO, java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r2.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A0I(X.C13901TjO r3, java.lang.Class r4) {
        /*
            r2 = this;
            X.5EC r0 = r2.A0A
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x002b
            X.4fH r1 = r2.A09
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01(r4)
            if (r0 != 0) goto L_0x002b
            X.4et r0 = r2.A05
            X.4eS r0 = r0.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r4)
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0P(r4)
            if (r0 != 0) goto L_0x002b
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0O(r4)
            return r0
        L_0x002b:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A0F(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269504fE.A0I(X.TjO, java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final JsonSerializer A0K(C268894eF r2) {
        JsonSerializer A002 = this.A0A.A00(r2);
        if (A002 != null) {
            return A002;
        }
        JsonSerializer A003 = this.A09.A00(r2);
        if (A003 != null) {
            return A003;
        }
        JsonSerializer A0L = A0L(r2);
        if (A0L == null) {
            return A0O(r2.A00);
        }
        return A0L;
    }

    public final JsonSerializer A0L(C268894eF r5) {
        try {
            JsonSerializer A012 = this.A06.A01(r5, this);
            if (A012 == null) {
                return A012;
            }
            C269534fH r2 = this.A09;
            synchronized (r2) {
                if (r2.A00.put(new AnonymousClass5EE(r5), A012) == null) {
                    r2.A01.set((Object) null);
                }
                if (A012 instanceof AnonymousClass5EG) {
                    ((AnonymousClass5EG) A012).EIT(this);
                }
            }
            return A012;
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass4iD(((C269494fD) this).A00, C269574fL.A09(e), e);
        }
    }

    public final JsonSerializer A0N(Class cls) {
        JsonSerializer A012 = this.A0A.A01(cls);
        if (A012 != null) {
            return A012;
        }
        C269534fH r1 = this.A09;
        JsonSerializer A013 = r1.A01(cls);
        if (A013 != null) {
            return A013;
        }
        JsonSerializer A002 = r1.A00(this.A05.A01.A07.A09(cls));
        if (A002 != null) {
            return A002;
        }
        JsonSerializer A0P = A0P(cls);
        if (A0P == null) {
            return A0O(cls);
        }
        return A0P;
    }

    public final JsonSerializer A0O(Class cls) {
        if (cls == Object.class) {
            return this.A02;
        }
        return new StdSerializer(cls, false);
    }

    public final JsonSerializer A0P(Class cls) {
        C268894eF A092 = this.A05.A01.A07.A09(cls);
        try {
            JsonSerializer A012 = this.A06.A01(A092, this);
            if (A012 == null) {
                return A012;
            }
            C269534fH r3 = this.A09;
            synchronized (r3) {
                HashMap hashMap = r3.A00;
                Object put = hashMap.put(new AnonymousClass5EE(cls, false), A012);
                Object put2 = hashMap.put(new AnonymousClass5EE(A092), A012);
                if (put == null || put2 == null) {
                    r3.A01.set((Object) null);
                }
                if (A012 instanceof AnonymousClass5EG) {
                    ((AnonymousClass5EG) A012).EIT(this);
                }
            }
            return A012;
        } catch (IllegalArgumentException e) {
            A08(A092, C269574fL.A09(e));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0S(Object obj) {
        Object obj2;
        C269444f8 r2 = this.A0B;
        Map map = r2.A01;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return r2.A00.get(obj);
        }
        if (obj2 == C269444f8.A03) {
            return null;
        }
        return obj2;
    }

    public final void A0T(17Z r3) {
        if (this.A08) {
            r3.A0a();
        } else {
            this.A01.A0A(r3, this, (Object) null);
        }
    }

    public C269504fE(C269294et r5, C269504fE r6, C269524fG r7) {
        this.A02 = A0D;
        this.A01 = NullSerializer.A00;
        JsonSerializer jsonSerializer = A0C;
        this.A00 = jsonSerializer;
        this.A06 = r7;
        this.A05 = r5;
        C269534fH r3 = r6.A09;
        this.A09 = r3;
        this.A02 = r6.A02;
        this.A04 = r6.A04;
        JsonSerializer jsonSerializer2 = r6.A01;
        this.A01 = jsonSerializer2;
        this.A00 = r6.A00;
        this.A08 = jsonSerializer2 == jsonSerializer;
        this.A07 = r5.A05;
        this.A0B = r5.A02;
        AtomicReference atomicReference = r3.A01;
        AnonymousClass5EC r1 = (AnonymousClass5EC) atomicReference.get();
        if (r1 == null) {
            synchronized (r3) {
                r1 = (AnonymousClass5EC) atomicReference.get();
                if (r1 == null) {
                    r1 = new AnonymousClass5EC(r3.A00);
                    atomicReference.set(r1);
                }
            }
        }
        this.A0A = r1;
    }

    public final void A0U(17Z r4, Object obj, String str) {
        r4.A0q(str);
        if (obj != null) {
            A0J((C13901TjO) null, obj.getClass(), true).A0A(r4, this, obj);
        } else if (this.A08) {
            r4.A0a();
        } else {
            this.A01.A0A(r4, this, (Object) null);
        }
    }

    public C269504fE() {
        this.A02 = A0D;
        this.A01 = NullSerializer.A00;
        this.A00 = A0C;
        this.A05 = null;
        this.A06 = null;
        this.A09 = new C269534fH();
        this.A0A = null;
        this.A07 = null;
        this.A0B = null;
        this.A08 = true;
    }
}
