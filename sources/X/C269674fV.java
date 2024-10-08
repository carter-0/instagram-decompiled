package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.4fV  reason: invalid class name and case insensitive filesystem */
public abstract class C269674fV extends C269514fF implements Serializable {
    public C10439RsG A00;
    public final int A01;
    public final C269454f9 A02;
    public final C269684fW A03;
    public final C269564fK A04;
    public final Class A05;
    public final 16H A06;
    public transient 16F A07;
    public transient DateFormat A08;
    public transient C269444f8 A09;
    public transient AnonymousClass4iJ A0A;
    public transient S7X A0B;

    public final JsonDeserializer A0F(Object obj) {
        JsonDeserializer jsonDeserializer = null;
        if (obj != null) {
            if (!(obj instanceof JsonDeserializer)) {
                if (obj instanceof Class) {
                    Class<JsonDeserializer.None> cls = (Class) obj;
                    if (cls != JsonDeserializer.None.class && !C269574fL.A0I(cls)) {
                        if (JsonDeserializer.class.isAssignableFrom(cls)) {
                            obj = C269574fL.A03(cls, this.A02.A06());
                        } else {
                            throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<JsonDeserializer>"));
                        }
                    }
                } else {
                    throw new IllegalStateException(002.A0g("AnnotationIntrospector returned deserializer definition of type ", obj.getClass().getName(), "; expected type JsonDeserializer or Class<JsonDeserializer> instead"));
                }
            }
            jsonDeserializer = (JsonDeserializer) obj;
            if (jsonDeserializer instanceof C269774ff) {
                ((C269774ff) jsonDeserializer).EIS(this);
            }
        }
        return jsonDeserializer;
    }

    public final C10889Rzp A0H(Object obj) {
        C10889Rzp rzp = null;
        if (obj != null) {
            if (!(obj instanceof C10889Rzp)) {
                if (obj instanceof Class) {
                    Class<C8162QiN> cls = (Class) obj;
                    if (cls != C8162QiN.class && !C269574fL.A0I(cls)) {
                        if (C10889Rzp.class.isAssignableFrom(cls)) {
                            obj = C269574fL.A03(cls, this.A02.A06());
                        } else {
                            throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<KeyDeserializer>"));
                        }
                    }
                } else {
                    throw new IllegalStateException(002.A0g("AnnotationIntrospector returned key deserializer definition of type ", obj.getClass().getName(), "; expected type KeyDeserializer or Class<KeyDeserializer> instead"));
                }
            }
            rzp = (C10889Rzp) obj;
            if (rzp instanceof C269774ff) {
                ((C269774ff) rzp).EIS(this);
            }
        }
        return rzp;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.Taf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.Taf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.Taf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S6M A0I(X.T9X r7, X.C13452Taf r8, java.lang.Object r9) {
        /*
            r6 = this;
            r5 = r6
            X.4fU r5 = (X.C269664fU) r5
            r1 = 0
            if (r9 == 0) goto L_0x0041
            X.QhY r7 = (X.C8139QhY) r7
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = r7.A00
            X.T9Z r4 = new X.T9Z
            r4.<init>(r1, r0, r9)
            java.util.LinkedHashMap r0 = r5.A01
            if (r0 != 0) goto L_0x005d
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A01 = r0
        L_0x001e:
            java.util.List r0 = r5.A00
            if (r0 != 0) goto L_0x0042
            r1 = 8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r5.A00 = r0
        L_0x002b:
            X.SuR r2 = new X.SuR
            r2.<init>()
            java.util.List r0 = r5.A00
            r0.add(r2)
        L_0x0035:
            X.S6M r1 = new X.S6M
            r1.<init>(r4)
            r1.A00 = r2
            java.util.LinkedHashMap r0 = r5.A01
            r0.put(r4, r1)
        L_0x0041:
            return r1
        L_0x0042:
            java.util.Iterator r3 = r0.iterator()
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r2 = r3.next()
            X.Taf r2 = (X.C13452Taf) r2
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r2.getClass()
            if (r1 != r0) goto L_0x0046
            goto L_0x0035
        L_0x005d:
            java.lang.Object r1 = r0.get(r4)
            X.S6M r1 = (X.S6M) r1
            if (r1 == 0) goto L_0x001e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269674fV.A0I(X.T9X, X.Taf, java.lang.Object):X.S6M");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(X.16F r3, X.16L r4, X.C268894eF r5, java.lang.String r6, java.lang.Object... r7) {
        /*
            r2 = this;
            int r0 = r7.length
            if (r0 <= 0) goto L_0x0007
            java.lang.String r6 = java.lang.String.format(r6, r7)
        L_0x0007:
            X.4f9 r0 = r2.A02
            X.RsG r0 = r0.A08
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "handleUnexpectedToken"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0015:
            if (r6 != 0) goto L_0x005d
            java.lang.String r1 = X.C269574fL.A04(r5)
            if (r4 != 0) goto L_0x0031
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Unexpected end-of-input when trying read value of type %s"
            java.lang.String r6 = java.lang.String.format(r0, r1)
        L_0x0027:
            X.16F r0 = r2.A07
            X.Qi2 r1 = new X.Qi2
            r1.<init>(r0, r6)
            X.4fM[] r0 = X.C269574fL.A01
            throw r1
        L_0x0031:
            int r0 = r4.ordinal()
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0045;
                case 3: goto L_0x0048;
                case 4: goto L_0x0048;
                case 5: goto L_0x0045;
                case 6: goto L_0x004e;
                case 7: goto L_0x0057;
                case 8: goto L_0x0054;
                case 9: goto L_0x0051;
                case 10: goto L_0x004b;
                case 11: goto L_0x004b;
                case 12: goto L_0x005a;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.String r0 = "[Unavailable value]"
        L_0x003a:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4}
            java.lang.String r0 = "Cannot deserialize value of type %s from %s (token `JsonToken.%s`)"
            java.lang.String r6 = java.lang.String.format(r0, r1)
            goto L_0x005f
        L_0x0045:
            java.lang.String r0 = "Object value"
            goto L_0x003a
        L_0x0048:
            java.lang.String r0 = "Array value"
            goto L_0x003a
        L_0x004b:
            java.lang.String r0 = "Boolean value"
            goto L_0x003a
        L_0x004e:
            java.lang.String r0 = "Embedded Object"
            goto L_0x003a
        L_0x0051:
            java.lang.String r0 = "Floating-point value"
            goto L_0x003a
        L_0x0054:
            java.lang.String r0 = "Integer value"
            goto L_0x003a
        L_0x0057:
            java.lang.String r0 = "String value"
            goto L_0x003a
        L_0x005a:
            java.lang.String r0 = "Null value"
            goto L_0x003a
        L_0x005d:
            if (r4 == 0) goto L_0x0027
        L_0x005f:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0027
            r3.A1P()
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269674fV.A0Q(X.16F, X.16L, X.4eF, java.lang.String, java.lang.Object[]):void");
    }

    public final void A0R(16F r7, C268894eF r8) {
        A0Q(r7, r7.A10(), r8, (String) null, new Object[0]);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0T(16F r8, Class cls) {
        A0Q(r8, r8.A10(), A0A(cls), (String) null, new Object[0]);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0U(16L r5, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        16F r3 = this.A07;
        String format = String.format(C273654mx.A00(520), new Object[]{r3.A10(), r5});
        if (str != null) {
            format = 002.A0g(format, ": ", str);
        }
        AnonymousClass4iD r1 = new AnonymousClass4iD(r3, format);
        C269584fM[] r0 = C269574fL.A01;
        throw r1;
    }

    public final void A0V(16L r4, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        16F r2 = this.A07;
        String format = String.format(C273654mx.A00(520), new Object[]{r2.A10(), r4});
        if (str != null) {
            format = 002.A0g(format, ": ", str);
        }
        throw new AnonymousClass4iD(r2, format);
    }

    public final void A0W(C13901TjO tjO, String str, Object... objArr) {
        C8208QkH BRS;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AnonymousClass4iD r2 = new AnonymousClass4iD(this.A07, str);
        C269584fM[] r0 = C269574fL.A01;
        if (!(tjO == null || (BRS = tjO.BRS()) == null)) {
            r2.A08(BRS.A09(), tjO.getName());
        }
        throw r2;
    }

    public final void A0Y(SK6 sk6, Class cls, String str, Object... objArr) {
        Object[] objArr2;
        String A002;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException(Pxd.A00(751));
        }
        if (sk6 == null) {
            objArr2 = new Object[]{C269574fL.A06(cls), str};
            A002 = "Cannot construct instance of %s: %s";
        } else {
            boolean A0N = sk6.A0N();
            objArr2 = new Object[]{C269574fL.A06(cls), str};
            if (!A0N) {
                A002 = Pxd.A00(443);
            } else {
                throw new AnonymousClass4iD(this.A07, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", objArr2));
            }
        }
        A09(String.format(A002, objArr2), cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0Z(C269134ed r4, SK8 sk8, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        C269584fM[] r0 = C269574fL.A01;
        throw new C8161Qi4(this.A07, r4, sk8, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{C269574fL.A08(sk8.A0L()), C269574fL.A06(r4.A05.A00), str}));
    }

    public final void A0a(C269134ed r5, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new C8161Qi4(this.A07, r5, (SK8) null, String.format("Invalid type definition for type %s: %s", new Object[]{C269574fL.A06(r5.A05.A00), str}));
    }

    public final void A0c(Class cls, Number number, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdNumberValue");
        }
        throw new C8194Qk1(this.A07, number, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{C269574fL.A06(cls), String.valueOf(number), str}));
    }

    public final void A0d(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdKey");
        }
        throw new C8194Qk1(this.A07, str, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{C269574fL.A06(cls), A07(str), str2}));
    }

    public final void A0e(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdStringValue");
        }
        throw A0J(cls, str, str2);
    }

    public final void A0h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new AnonymousClass4iD(this.A07, str);
    }

    public final C268894eF A0A(Class cls) {
        if (cls == null) {
            return null;
        }
        return this.A02.A01.A07.A09(cls);
    }

    public final JsonDeserializer A0B(C13901TjO tjO, C268894eF r4) {
        JsonDeserializer A012 = this.A03.A01(this, r4, this.A04);
        if (A012 != null) {
            return A0D(tjO, r4, A012);
        }
        return A012;
    }

    public final JsonDeserializer A0C(C13901TjO tjO, C268894eF r4, JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer instanceof C269784fg) {
            this.A00 = new C10439RsG(this.A00, r4);
            try {
                jsonDeserializer = ((C269784fg) jsonDeserializer).ALh(tjO, this);
            } finally {
                this.A00 = this.A00.A00;
            }
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer A0D(C13901TjO tjO, C268894eF r4, JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer instanceof C269784fg) {
            this.A00 = new C10439RsG(this.A00, r4);
            try {
                jsonDeserializer = ((C269784fg) jsonDeserializer).ALh(tjO, this);
            } finally {
                this.A00 = this.A00.A00;
            }
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer A0E(C268894eF r5) {
        C269684fW r0 = this.A03;
        C269564fK r3 = this.A04;
        JsonDeserializer A012 = r0.A01(this, r5, r3);
        if (A012 == null) {
            return null;
        }
        JsonDeserializer A0D = A0D((C13901TjO) null, r5, A012);
        C8225QkY A082 = r3.A08(this.A02, r5);
        if (A082 != null) {
            return new TypeWrappedDeserializer(A0D, A082.A02((C13901TjO) null));
        }
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0194, code lost:
        r9 = new X.C8193Qjp(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02b0, code lost:
        if (r6 == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r9 = new X.C8164QiP(r2, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0243, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0336 A[Catch:{ IllegalArgumentException -> 0x0357 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0350 A[Catch:{ IllegalArgumentException -> 0x0357 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10889Rzp A0G(X.C268894eF r12) {
        /*
            r11 = this;
            X.4fK r0 = r11.A04     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4fJ r0 = (X.C269554fJ) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4f9 r4 = r11.A02     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4fN r3 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4fT[] r1 = r3.A03     // Catch:{ IllegalArgumentException -> 0x0357 }
            int r0 = r1.length     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 <= 0) goto L_0x00e3
            X.4ed r6 = r4.A02(r12)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.5E8 r2 = new X.5E8     // Catch:{ IllegalArgumentException -> 0x0357 }
            r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0016:
            boolean r0 = r2.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x00e9
            r2.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class r5 = r12.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r5.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x002b
            java.lang.Class r5 = X.C269574fL.A02(r5)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x002b:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 == r0) goto L_0x00df
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L_0x00db
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            if (r5 == r0) goto L_0x00d2
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            if (r5 == r0) goto L_0x00d2
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            if (r5 != r0) goto L_0x0040
            goto L_0x009d
        L_0x0040:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L_0x0045
            goto L_0x00a0
        L_0x0045:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r5 != r0) goto L_0x004a
            goto L_0x00a2
        L_0x004a:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r5 != r0) goto L_0x004f
            goto L_0x00a4
        L_0x004f:
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            if (r5 != r0) goto L_0x0054
            goto L_0x00a7
        L_0x0054:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r5 != r0) goto L_0x0059
            goto L_0x00aa
        L_0x0059:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r5 != r0) goto L_0x005e
            goto L_0x00ac
        L_0x005e:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r5 != r0) goto L_0x0063
            goto L_0x00ae
        L_0x0063:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r5 != r0) goto L_0x0068
            goto L_0x00b0
        L_0x0068:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r5 != r0) goto L_0x006d
            goto L_0x00b2
        L_0x006d:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r5 != r0) goto L_0x0072
            goto L_0x00b4
        L_0x0072:
            java.lang.Class<java.net.URI> r0 = java.net.URI.class
            if (r5 != r0) goto L_0x0077
            goto L_0x00b7
        L_0x0077:
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            if (r5 != r0) goto L_0x007c
            goto L_0x00ba
        L_0x007c:
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            if (r5 != r0) goto L_0x0081
            goto L_0x00bd
        L_0x0081:
            java.lang.Class<java.util.Locale> r1 = java.util.Locale.class
            if (r5 != r1) goto L_0x008d
            r0 = 8
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std r2 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std     // Catch:{ IllegalArgumentException -> 0x0357 }
            r2.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x00c0
        L_0x008d:
            java.lang.Class<java.util.Currency> r1 = java.util.Currency.class
            if (r5 != r1) goto L_0x0098
            r0 = 6
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std r2 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std     // Catch:{ IllegalArgumentException -> 0x0357 }
            r2.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x00c4
        L_0x0098:
            java.lang.Class<byte[]> r0 = byte[].class
            if (r5 != r0) goto L_0x0016
            goto L_0x00c8
        L_0x009d:
            r1 = 12
            goto L_0x00ca
        L_0x00a0:
            r1 = 5
            goto L_0x00ca
        L_0x00a2:
            r1 = 6
            goto L_0x00ca
        L_0x00a4:
            r1 = 10
            goto L_0x00ca
        L_0x00a7:
            r1 = 11
            goto L_0x00ca
        L_0x00aa:
            r1 = 1
            goto L_0x00ca
        L_0x00ac:
            r1 = 2
            goto L_0x00ca
        L_0x00ae:
            r1 = 4
            goto L_0x00ca
        L_0x00b0:
            r1 = 3
            goto L_0x00ca
        L_0x00b2:
            r1 = 7
            goto L_0x00ca
        L_0x00b4:
            r1 = 8
            goto L_0x00ca
        L_0x00b7:
            r1 = 13
            goto L_0x00ca
        L_0x00ba:
            r1 = 14
            goto L_0x00ca
        L_0x00bd:
            r1 = 15
            goto L_0x00ca
        L_0x00c0:
            r0 = 9
            goto L_0x032c
        L_0x00c4:
            r0 = 16
            goto L_0x032c
        L_0x00c8:
            r1 = 17
        L_0x00ca:
            r0 = 0
            X.QiP r9 = new X.QiP     // Catch:{ IllegalArgumentException -> 0x0357 }
            r9.<init>(r0, r5, r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x00d2:
            r1 = -1
            r0 = 0
            X.Qjm r9 = new X.Qjm     // Catch:{ IllegalArgumentException -> 0x0357 }
            r9.<init>(r0, r5, r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x00db:
            X.Qjm r9 = X.C8190Qjm.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x00df:
            X.Qjm r9 = X.C8190Qjm.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x00e3:
            java.lang.Class r0 = r12.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4ed r6 = r4.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x00e9:
            X.4eV r0 = r6.A07     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eA r8 = r4.A01()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r0 = r8.A0b(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x00fd
            X.Rzp r9 = r11.A0H(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r9 != 0) goto L_0x0331
        L_0x00fd:
            java.lang.Class r6 = r12.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4fM[] r0 = X.C269574fL.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x01c6
            X.4eS r0 = r4.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eT r0 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eU r0 = (X.C269044eU) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4ed r5 = r0.A02(r4, r12, r4)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eV r2 = r5.A07     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r8 == 0) goto L_0x0125
            java.lang.Object r0 = r8.A0b(r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0125
            X.Rzp r9 = r11.A0H(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r9 == 0) goto L_0x0125
            goto L_0x0331
        L_0x0125:
            X.4fO[] r0 = r3.A02     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.5E8 r1 = new X.5E8     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x012c:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0136
            r1.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x012c
        L_0x0136:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = X.C269554fJ.A02(r11, r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0143
            X.QiO r9 = new X.QiO     // Catch:{ IllegalArgumentException -> 0x0357 }
            r9.<init>(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x0143:
            X.QkH r0 = r5.A01()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.T9m r7 = X.C269554fJ.A03(r4, r0, r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.List r0 = r5.A04()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0153:
            boolean r0 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x019b
            java.lang.Object r5 = r9.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkF r5 = (X.C8206QkF) r5     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r8 == 0) goto L_0x0153
            X.REE r1 = r8.A03(r5)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 == 0) goto L_0x0153
            X.REE r0 = X.REE.DISABLED     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 == r0) goto L_0x0153
            int r1 = r5.A0F()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0 = 1
            if (r1 != r0) goto L_0x019d
            java.lang.reflect.Method r2 = r5.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class r0 = r2.getReturnType()     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r0.isAssignableFrom(r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x019d
            r0 = 0
            java.lang.Class r1 = r5.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L_0x0153
            boolean r0 = r4.A06()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0194
            boolean r0 = r4.A08()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.C269574fL.A0H(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0194:
            X.Qjp r9 = new X.Qjp     // Catch:{ IllegalArgumentException -> 0x0357 }
            r9.<init>(r5, r7)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x019b:
            r5 = 0
            goto L_0x0194
        L_0x019d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = "Unsuitable method ("
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.append(r5)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = ") decorated with @JsonCreator (for Enum type "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = r6.getName()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x034b
        L_0x01c6:
            X.4ed r8 = r4.A0C(r12)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eV r6 = r8.A07     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eY r0 = X.C269054eV.A00(r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.List r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r1.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0201
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x01dc:
            java.util.Iterator r5 = r7.iterator()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x01e0:
            boolean r0 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0229
            java.lang.Object r7 = r5.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.RsE r7 = (X.C10437RsE) r7     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eW r2 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkG r2 = (X.C8207QkG) r2     // Catch:{ IllegalArgumentException -> 0x0357 }
            int r1 = r2.A0F()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0 = 1
            if (r1 != r0) goto L_0x01e0
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 0
            java.lang.Class r0 = r2.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 != r0) goto L_0x01e0
            goto L_0x022a
        L_0x0201:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0357 }
            r7.<init>()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x020a:
            boolean r0 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r2 = r5.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eW r2 = (X.C269064eW) r2     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eA r0 = r8.A04     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.REE r1 = r0.A03(r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.REE r0 = X.REE.DISABLED     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 == r0) goto L_0x020a
            X.RsE r0 = new X.RsE     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            r7.add(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x020a
        L_0x0229:
            r7 = 0
        L_0x022a:
            if (r7 == 0) goto L_0x0232
            java.lang.Object r0 = r7.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0232
            goto L_0x030a
        L_0x0232:
            X.4eY r0 = X.C269054eV.A00(r6)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.List r1 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r1.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 != 0) goto L_0x02b2
            r6 = 0
            java.util.Iterator r10 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0243:
            boolean r0 = r10.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r5 = r10.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkF r5 = (X.C8206QkF) r5     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.reflect.Method r9 = r5.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class r1 = r9.getReturnType()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.4eF r0 = r8.A05     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0243
            X.4eA r0 = r8.A04     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.REE r2 = r0.A03(r5)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r2 == 0) goto L_0x026c
            X.REE r0 = X.REE.DISABLED     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r2 != r0) goto L_0x027f
            goto L_0x0243
        L_0x026c:
            java.lang.String r9 = r9.getName()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = "valueOf"
            boolean r0 = r0.equals(r9)     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1 = 1
            if (r0 == 0) goto L_0x0285
            int r0 = r5.A0F()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 != r1) goto L_0x0285
        L_0x027f:
            X.RsE r0 = new X.RsE     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>(r5, r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x02a5
        L_0x0285:
            java.lang.String r0 = "fromString"
            boolean r0 = r0.equals(r9)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0243
            int r0 = r5.A0F()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 != r1) goto L_0x0243
            r0 = 0
            java.lang.Class r1 = r5.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L_0x027f
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0243
            goto L_0x027f
        L_0x02a5:
            if (r6 != 0) goto L_0x02ac
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0357 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x02ac:
            r6.add(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0243
        L_0x02b0:
            if (r6 != 0) goto L_0x02b6
        L_0x02b2:
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x02b6:
            X.TOc r0 = new X.TOc     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r6.removeIf(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0 = 0
        L_0x02c3:
            boolean r1 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 == 0) goto L_0x02f4
            java.lang.Object r2 = r5.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.RsE r2 = (X.C10437RsE) r2     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Object r1 = r2.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r1 == 0) goto L_0x02c3
            if (r0 != 0) goto L_0x02da
            X.4eW r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkH r0 = (X.C8208QkH) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x02c3
        L_0x02da:
            X.4eW r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkF r0 = (X.C8206QkF) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.reflect.Method r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r1 = "Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type "
            java.lang.String r0 = X.C269574fL.A06(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x034b
        L_0x02f4:
            if (r0 == 0) goto L_0x02fb
            X.QiP r9 = X.C269644fS.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x02fb:
            if (r7 != 0) goto L_0x030a
            boolean r0 = r6.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 != 0) goto L_0x0313
            r0 = 0
            java.lang.Object r7 = r6.get(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.RsE r7 = (X.C10437RsE) r7     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x030a:
            X.4eW r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QkH r0 = (X.C8208QkH) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.QiP r9 = X.C269644fS.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0331
        L_0x0313:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = "Cannot find a (Map) Key deserializer for type "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.append(r12)     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0357 }
            r11.A08(r12, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x034b
        L_0x032c:
            X.QiP r9 = new X.QiP     // Catch:{ IllegalArgumentException -> 0x0357 }
            r9.<init>(r2, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0331:
            X.4fP[] r2 = r3.A01     // Catch:{ IllegalArgumentException -> 0x0357 }
            int r0 = r2.length     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 <= 0) goto L_0x034c
            X.5E8 r1 = new X.5E8     // Catch:{ IllegalArgumentException -> 0x0357 }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            boolean r0 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x034c
            r1.next()     // Catch:{ IllegalArgumentException -> 0x0357 }
            java.lang.String r1 = "modifyKeyDeserializer"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x034b:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x034c:
            boolean r0 = r9 instanceof X.C269774ff     // Catch:{ IllegalArgumentException -> 0x0357 }
            if (r0 == 0) goto L_0x0356
            r0 = r9
            X.4ff r0 = (X.C269774ff) r0     // Catch:{ IllegalArgumentException -> 0x0357 }
            r0.EIS(r11)     // Catch:{ IllegalArgumentException -> 0x0357 }
        L_0x0356:
            return r9
        L_0x0357:
            r0 = move-exception
            java.lang.String r0 = X.C269574fL.A09(r0)
            r11.A08(r12, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269674fV.A0G(X.4eF):X.Rzp");
    }

    public final C8160Qi3 A0K(Class cls, Throwable th) {
        String A092;
        if (th == null) {
            A092 = "N/A";
        } else {
            A092 = C269574fL.A09(th);
            if (A092 == null) {
                A092 = C269574fL.A06(th.getClass());
            }
        }
        return new C8160Qi3(this.A07, A0A(cls), String.format("Cannot construct instance of %s, problem: %s", new Object[]{C269574fL.A06(cls), A092}), th);
    }

    public final AnonymousClass4iJ A0L() {
        AnonymousClass4iJ r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass4iJ r02 = new AnonymousClass4iJ();
        this.A0A = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.S7X, java.lang.Object] */
    public final S7X A0M() {
        S7X s7x = this.A0B;
        if (s7x == null) {
            return new Object();
        }
        this.A0B = null;
        return s7x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2.A0D(X.C269464fA.FAIL_ON_NUMBERS_FOR_ENUMS) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r2.A0D(X.C269464fA.ACCEPT_FLOAT_AS_INT) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r5 != X.AnonymousClass05K.A03) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r2.A09(X.C269354ez.ALLOW_COERCION_OF_SCALARS) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r6 != X.AnonymousClass05K.A1I) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r1 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (r2.A0D(X.C269464fA.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        if (r5 != X.AnonymousClass05K.A04) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        if (r2.A0D(X.C269464fA.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0072, code lost:
        return r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A0N(java.lang.Integer r5, java.lang.Integer r6) {
        /*
            r4 = this;
            X.4f9 r2 = r4.A02
            X.4eq r3 = r2.A05
            X.4er r0 = r3.A01
            java.lang.Integer[] r0 = r0.A00
            int r1 = r6.intValue()
            r0 = r0[r1]
            if (r0 != 0) goto L_0x0027
            r0 = 7
            if (r1 == r0) goto L_0x0065
            r0 = 3
            if (r1 == r0) goto L_0x0028
            r0 = 2
            if (r1 != r0) goto L_0x0037
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r5 != r0) goto L_0x0037
            X.4fA r0 = X.C269464fA.FAIL_ON_NUMBERS_FOR_ENUMS
            boolean r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x0037
        L_0x0025:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0027:
            return r0
        L_0x0028:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r5 != r0) goto L_0x0037
            X.4fA r0 = X.C269464fA.ACCEPT_FLOAT_AS_INT
            boolean r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0034:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x0037:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r5 == r0) goto L_0x0048
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r5 == r0) goto L_0x0048
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r5 == r0) goto L_0x0048
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r1 = 0
            if (r5 != r0) goto L_0x0052
        L_0x0048:
            r1 = 1
            X.4ez r0 = X.C269354ez.ALLOW_COERCION_OF_SCALARS
            boolean r0 = r2.A09(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0025
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            if (r6 != r0) goto L_0x0070
            if (r1 != 0) goto L_0x006d
            X.4fA r0 = X.C269464fA.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            if (r5 != r0) goto L_0x0025
            goto L_0x0034
        L_0x0065:
            X.4fA r0 = X.C269464fA.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
            boolean r0 = r2.A0D(r0)
            if (r0 == 0) goto L_0x0025
        L_0x006d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x0070:
            java.lang.Integer r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269674fV.A0N(java.lang.Integer, java.lang.Integer):java.lang.Integer");
    }

    public final Integer A0O(Integer num, Integer num2) {
        C269454f9 r3 = this.A02;
        Integer num3 = r3.A05.A01.A00[9];
        if (!Boolean.FALSE.equals((Object) null)) {
            if (num3 != null) {
                return num3;
            }
            if (num == AnonymousClass05K.A0u || num == AnonymousClass05K.A0j || num == AnonymousClass05K.A15 || num == AnonymousClass05K.A03 || r3.A0D(C269464fA.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return AnonymousClass05K.A0C;
            }
        }
        return num2;
    }

    public final Date A0P(String str) {
        try {
            DateFormat dateFormat = this.A08;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.A02.A01.A08.clone();
                this.A08 = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, C269574fL.A09(e)}));
        }
    }

    public final void A0S(16F r6, JsonDeserializer jsonDeserializer, Object obj, String str) {
        Class<?> cls;
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleUnknownProperty");
        } else if (!A0j(C269464fA.FAIL_ON_UNKNOWN_PROPERTIES)) {
            r6.A0z();
        } else {
            Collection A0L = jsonDeserializer.A0L();
            16F r3 = this.A07;
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            C8199Qk6 qk6 = new C8199Qk6(r3.A1H(), r3, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", new Object[]{str, cls.getName()}), A0L);
            qk6.A08(obj, str);
            throw qk6;
        }
    }

    public final void A0X(JsonDeserializer jsonDeserializer) {
        if (!this.A02.A09(C269354ez.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            C268894eF A0A2 = A0A(jsonDeserializer.A0H());
            throw new C8161Qi4(this.A07, A0A2, String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{C269574fL.A04(A0A2)}));
        }
    }

    public final void A0b(S7X s7x) {
        int length;
        S7X s7x2 = this.A0B;
        if (s7x2 != null) {
            Object[] objArr = s7x.A01;
            if (objArr == null) {
                length = 0;
            } else {
                length = objArr.length;
            }
            Object[] objArr2 = s7x2.A01;
            if (objArr2 != null && length < objArr2.length) {
                return;
            }
        }
        this.A0B = s7x;
    }

    public final void A0f(Class cls, Throwable th) {
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleInstantiationProblem");
        }
        C269584fM[] r0 = C269574fL.A01;
        if (!(th instanceof IOException)) {
            if (!A0j(C269464fA.WRAP_EXCEPTIONS)) {
                C269574fL.A0F(th);
            }
            throw A0K(cls, th);
        }
        throw th;
    }

    public final void A0g(Object obj) {
        Class<?> cls;
        C269584fM[] r0 = C269574fL.A01;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        A09(String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}), cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0i(16G r3) {
        if ((r3.BP4() & this.A06.A00) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A0j(C269464fA r3) {
        if ((r3.A00 & this.A01) != 0) {
            return true;
        }
        return false;
    }

    public C269674fV(C269564fK r2) {
        this.A04 = r2;
        this.A03 = new C269684fW();
        this.A01 = 0;
        this.A06 = null;
        this.A02 = null;
        this.A05 = null;
        this.A09 = null;
    }

    public final C8194Qk1 A0J(Class cls, String str, String str2) {
        return new C8194Qk1(this.A07, str, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{C269574fL.A06(cls), A07(str), str2}));
    }

    public C269674fV(16F r2, C269454f9 r3, C269674fV r4) {
        this.A03 = r4.A03;
        this.A04 = r4.A04;
        this.A06 = r2.A1L();
        this.A02 = r3;
        this.A01 = r3.A00;
        this.A05 = r3.A05;
        this.A07 = r2;
        this.A09 = r3.A02;
    }

    public C269674fV(C269454f9 r3, C269674fV r4) {
        this.A03 = r4.A03;
        this.A04 = r4.A04;
        this.A06 = null;
        this.A02 = r3;
        this.A01 = r3.A00;
        this.A05 = null;
        this.A07 = null;
        this.A09 = null;
    }

    public C269674fV(C269674fV r2, C269564fK r3) {
        this.A03 = r2.A03;
        this.A04 = r3;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A07 = r2.A07;
        this.A09 = r2.A09;
    }
}
