package X;

import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: X.Qkb  reason: case insensitive filesystem */
public class C8228Qkb extends C12444Sua {
    public final C269004eQ A00;

    public final String AwR() {
        return "class name used as type id";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r2 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r4.A00(r3, r2, r5) != r1) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C268894eF A00(X.C269514fF r8, java.lang.String r9) {
        /*
            r7 = this;
            X.4eF r3 = r7.A00
            X.4eQ r4 = r7.A00
            r0 = 60
            int r0 = r9.indexOf(r0)
            X.4ee r5 = r8.A03()
            if (r0 <= 0) goto L_0x0047
            java.lang.String r0 = X.Pxe.A0x(r9, r0)
            java.lang.Integer r6 = r4.A02(r3, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x0036
            X.4eE r0 = r8.A05()
            X.4eF r2 = r0.A08(r9)
            java.lang.Class r0 = r3.A00
            boolean r0 = r2.A0Q(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 == r1) goto L_0x00c0
            java.lang.Integer r0 = r4.A00(r3, r2, r5)
            if (r0 == r1) goto L_0x00c0
        L_0x0036:
            java.lang.String r2 = "Configured `PolymorphicTypeValidator` (of type "
            java.lang.String r1 = X.C269574fL.A07(r4)
            java.lang.String r0 = ") denied resolution"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.Qk3 r0 = r8.A04(r3, r9, r0)
            throw r0
        L_0x0047:
            java.lang.Integer r6 = r4.A02(r3, r5, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x0036
            X.4eE r0 = r8.A05()     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x007e }
            java.lang.Class r2 = r0.A0D(r9)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x007e }
            java.lang.Class r0 = r3.A00
            if (r0 == r2) goto L_0x0061
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0077
        L_0x0061:
            X.4eS r0 = r5.A01
            X.4eE r1 = r0.A07
            r0 = 0
            X.4eF r2 = r1.A05(r3, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r6 != r0) goto L_0x0099
            java.lang.Integer r1 = r4.A00(r3, r2, r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0099
            goto L_0x0036
        L_0x0077:
            java.lang.String r0 = "Not a subtype"
            X.Qk3 r0 = r8.A04(r3, r9, r0)
            throw r0
        L_0x007e:
            r0 = move-exception
            java.lang.String r1 = X.C66581MXm.A0y(r0)
            java.lang.String r0 = X.C269574fL.A09(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "problem: (%s) %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.Qk3 r0 = r8.A04(r3, r9, r0)
            throw r0
        L_0x0097:
            r2 = 0
            goto L_0x009b
        L_0x0099:
            if (r2 != 0) goto L_0x00c0
        L_0x009b:
            boolean r0 = r8 instanceof X.C269674fV
            if (r0 == 0) goto L_0x00c0
            X.4fV r8 = (X.C269674fV) r8
            java.lang.String r2 = "no such class found"
            X.4f9 r0 = r8.A02
            X.RsG r0 = r0.A08
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "handleUnknownTypeId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00b2:
            X.4fA r0 = X.C269464fA.FAIL_ON_INVALID_SUBTYPE
            boolean r0 = r8.A0j(r0)
            if (r0 != 0) goto L_0x00bb
            return r1
        L_0x00bb:
            X.Qk3 r0 = r8.A04(r3, r9, r2)
            throw r0
        L_0x00c0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8228Qkb.A00(X.4fF, java.lang.String):X.4eF");
    }

    public final String A01(AnonymousClass4eE r7, Class cls, Object obj) {
        Class cls2;
        C268944eK A0B;
        Class cls3;
        Iterator it = C269574fL.A00;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (!abstractCollection.isEmpty()) {
                    cls3 = ((Enum) abstractCollection.iterator().next()).getDeclaringClass();
                } else {
                    SNW snw = SNW.A04;
                    Field field = snw.A03;
                    if (field != null) {
                        try {
                            cls3 = (Class) field.get(abstractCollection);
                        } catch (Exception e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else {
                        throw DbW.A0c("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: ", snw.A01);
                    }
                }
                A0B = r7.A0A(r7.A06((C269754fd) null, AnonymousClass4eE.A09, cls3), EnumSet.class);
            } else if (!(obj instanceof EnumMap)) {
                return name;
            } else {
                AbstractMap abstractMap = (AbstractMap) obj;
                if (!abstractMap.isEmpty()) {
                    cls2 = ((Enum) Pxf.A0u(abstractMap).next()).getDeclaringClass();
                } else {
                    SNW snw2 = SNW.A04;
                    Field field2 = snw2.A02;
                    if (field2 != null) {
                        try {
                            cls2 = (Class) field2.get(abstractMap);
                        } catch (Exception e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    } else {
                        throw DbW.A0c("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: ", snw2.A00);
                    }
                }
                C268924eI r3 = AnonymousClass4eE.A09;
                A0B = r7.A0B(r7.A06((C269754fd) null, r3, cls2), r7.A06((C269754fd) null, r3, Object.class), EnumMap.class);
            }
            return A0B.A0R();
        } else if (name.indexOf(36) < 0 || C269574fL.A00(cls) == null) {
            return name;
        } else {
            Class cls4 = this.A00.A00;
            if (C269574fL.A00(cls4) == null) {
                return cls4.getName();
            }
            return name;
        }
    }

    public final String CLx(Object obj) {
        if (this instanceof C8227Qka) {
            String A0y = C66581MXm.A0y(obj);
            String str = ((C8227Qka) this).A00;
            if (A0y.startsWith(str)) {
                return A0y.substring(str.length() - 1);
            }
            return A0y;
        }
        return A01(this.A01, obj.getClass(), obj);
    }

    public final String CLy(Class cls, Object obj) {
        return A01(this.A01, cls, obj);
    }

    public C8228Qkb(C268894eF r1, C269004eQ r2, AnonymousClass4eE r3) {
        super(r1, r3);
        this.A00 = r2;
    }

    public final C268894eF FIK(C269514fF r2, String str) {
        return A00(r2, str);
    }
}
