package X;

import java.io.Serializable;

/* renamed from: X.4ej  reason: invalid class name and case insensitive filesystem */
public final class C269194ej implements Serializable {
    public static final C269194ej A04;
    public final C269204ek A00;
    public final C269204ek A01;
    public final Class A02;
    public final Class A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C269194ej r5 = (C269194ej) obj;
            if (!(r5.A01 == this.A01 && r5.A00 == this.A00 && r5.A03 == this.A03 && r5.A02 == this.A02)) {
                return false;
            }
        }
        return true;
    }

    static {
        C269204ek r2 = C269204ek.USE_DEFAULTS;
        A04 = new C269194ej(r2, r2, (Class) null, (Class) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r8 == X.C269204ek.A05) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r9 == X.C269204ek.A05) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C269194ej A00(X.C269194ej r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0048
            X.4ej r0 = A04
            if (r11 == r0) goto L_0x0048
            X.4ek r9 = r11.A01
            X.4ek r8 = r11.A00
            java.lang.Class r7 = r11.A03
            java.lang.Class r6 = r11.A02
            X.4ek r5 = r10.A01
            r4 = 1
            if (r9 == r5) goto L_0x0018
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            r3 = 1
            if (r9 != r0) goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            X.4ek r2 = r10.A00
            if (r8 == r2) goto L_0x0022
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            r1 = 1
            if (r8 != r0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.Class r0 = r10.A03
            if (r7 != r0) goto L_0x002a
            if (r6 != r0) goto L_0x002a
            r4 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x0038
            X.4ej r0 = new X.4ej
            if (r1 == 0) goto L_0x0034
            r0.<init>(r9, r8, r7, r6)
            return r0
        L_0x0034:
            r0.<init>(r9, r2, r7, r6)
            return r0
        L_0x0038:
            if (r1 == 0) goto L_0x0040
            X.4ej r0 = new X.4ej
            r0.<init>(r5, r8, r7, r6)
            return r0
        L_0x0040:
            if (r4 == 0) goto L_0x0048
            X.4ej r0 = new X.4ej
            r0.<init>(r5, r2, r7, r6)
            return r0
        L_0x0048:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269194ej.A00(X.4ej):X.4ej");
    }

    public final int hashCode() {
        return (this.A01.hashCode() << 2) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this.A01);
        sb.append(C66579MXk.A00(195));
        sb.append(this.A00);
        Class cls = this.A03;
        if (cls != null) {
            sb.append(",valueFilter=");
            sb.append(cls.getName());
            sb.append(".class");
        }
        Class cls2 = this.A02;
        if (cls2 != null) {
            sb.append(",contentFilter=");
            sb.append(cls2.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }

    public C269194ej(C269204ek r3, C269204ek r4, Class cls, Class cls2) {
        this.A01 = r3 == null ? C269204ek.USE_DEFAULTS : r3;
        this.A00 = r4 == null ? C269204ek.USE_DEFAULTS : r4;
        Class<Void> cls3 = Void.class;
        this.A03 = cls == cls3 ? null : cls;
        this.A02 = cls2 == cls3 ? null : cls2;
    }
}
