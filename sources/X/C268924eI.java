package X;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4eI  reason: invalid class name and case insensitive filesystem */
public final class C268924eI implements Serializable {
    public static final C268924eI A04;
    public static final C268894eF[] A05;
    public static final String[] A06;
    public final int A00;
    public final C268894eF[] A01;
    public final String[] A02;
    public final String[] A03;

    static {
        String[] strArr = new String[0];
        A06 = strArr;
        C268894eF[] r2 = new C268894eF[0];
        A05 = r2;
        A04 = new C268924eI(r2, strArr, (String[]) null);
    }

    public static C268924eI A02(Class cls, C268894eF[] r7) {
        String[] strArr;
        String str;
        int length;
        int i = 0;
        if (r7 == null) {
            r7 = A05;
        } else {
            int length2 = r7.length;
            if (length2 == 1) {
                return A01(r7[0], cls);
            }
            if (length2 == 2) {
                return A00(r7[0], r7[1], cls);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            strArr = A06;
        } else {
            strArr = new String[length];
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
        }
        int length3 = strArr.length;
        int length4 = r7.length;
        if (length3 == length4) {
            return new C268924eI(r7, strArr, (String[]) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(length4);
        sb.append(" type parameter");
        if (length4 == 1) {
            str = "";
        } else {
            str = "s";
        }
        sb.append(str);
        sb.append(": class expects ");
        sb.append(length3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r9.getClass() != r2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r9 == r8) goto L_0x0031
            java.lang.Class r2 = r8.getClass()
            X.4fM[] r0 = X.C269574fL.A01
            if (r9 == 0) goto L_0x0012
            java.lang.Class r1 = r9.getClass()
            r0 = 1
            if (r1 == r2) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r6 = 0
            if (r0 == 0) goto L_0x0030
            X.4eI r9 = (X.C268924eI) r9
            X.4eF[] r5 = r8.A01
            int r4 = r5.length
            X.4eF[] r3 = r9.A01
            int r0 = r3.length
            if (r4 != r0) goto L_0x0030
            r2 = 0
        L_0x0021:
            if (r2 >= r4) goto L_0x0031
            r1 = r3[r2]
            r0 = r5[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0030:
            return r6
        L_0x0031:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268924eI.equals(java.lang.Object):boolean");
    }

    public static C268924eI A00(C268894eF r4, C268894eF r5, Class cls) {
        TypeVariable[] typeParameters;
        int length;
        TypeVariable[] typeVariableArr = SDD.A00;
        if (cls == Map.class) {
            typeParameters = SDD.A07;
        } else if (cls == HashMap.class) {
            typeParameters = SDD.A03;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = SDD.A05;
        } else {
            typeParameters = cls.getTypeParameters();
        }
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 2) {
                return new C268924eI(new C268894eF[]{r4, r5}, new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, (String[]) null);
            }
        }
        throw new IllegalArgumentException(002.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 2 type parameters: class expects "));
    }

    public static C268924eI A01(C268894eF r4, Class cls) {
        TypeVariable[] typeParameters;
        int length;
        TypeVariable[] typeVariableArr = SDD.A00;
        if (cls == Collection.class) {
            typeParameters = SDD.A02;
        } else if (cls == List.class) {
            typeParameters = SDD.A06;
        } else if (cls == ArrayList.class) {
            typeParameters = SDD.A01;
        } else if (cls == AbstractList.class) {
            typeParameters = SDD.A00;
        } else if (cls == Iterable.class) {
            typeParameters = SDD.A04;
        } else {
            typeParameters = cls.getTypeParameters();
        }
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 1) {
                return new C268924eI(new C268894eF[]{r4}, new String[]{typeParameters[0].getName()}, (String[]) null);
            }
        }
        throw new IllegalArgumentException(002.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects "));
    }

    public final List A03() {
        C268894eF[] r1 = this.A01;
        if (r1.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(r1);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        C268894eF[] r6 = this.A01;
        int length = r6.length;
        if (length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int i = 0;
        while (true) {
            C268894eF r2 = r6[i];
            StringBuilder sb2 = new StringBuilder(40);
            r2.A0I(sb2);
            sb.append(sb2.toString());
            i++;
            if (i >= length) {
                sb.append('>');
                return sb.toString();
            } else if (i > 0) {
                sb.append(',');
            }
        }
    }

    public C268924eI(C268894eF[] r6, String[] strArr, String[] strArr2) {
        strArr = strArr == null ? A06 : strArr;
        this.A02 = strArr;
        r6 = r6 == null ? A05 : r6;
        this.A01 = r6;
        int length = strArr.length;
        if (length == r3) {
            int i = 1;
            for (C268894eF hashCode : r6) {
                i += hashCode.hashCode();
            }
            this.A03 = strArr2;
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException(002.A0n("Mismatching names (", "), types (", ")", length, r3));
    }
}
