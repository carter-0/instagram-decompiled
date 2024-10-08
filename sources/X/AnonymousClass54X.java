package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.54X  reason: invalid class name */
public final class AnonymousClass54X implements ParameterizedType, Serializable {
    public final Type A00;
    public final Type A01;
    public final Type[] A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType) || !2HD.A06(this, (Type) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.A02.clone();
    }

    public final Type getOwnerType() {
        return this.A00;
    }

    public final Type getRawType() {
        return this.A01;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.A02) ^ this.A01.hashCode();
        Type type = this.A00;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.A02;
        int length = typeArr.length;
        if (length == 0) {
            return 2HD.A01(this.A01);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(2HD.A01(this.A01));
        sb.append("<");
        sb.append(2HD.A01(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(2HD.A01(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r5 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1.getEnclosingClass() == null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[LOOP:0: B:14:0x003e->B:15:0x0040, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass54X(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
        /*
            r4 = this;
            r4.<init>()
            r6.getClass()
            boolean r0 = r6 instanceof java.lang.Class
            r3 = 0
            if (r0 == 0) goto L_0x002a
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x001f
            java.lang.Class r1 = r1.getEnclosingClass()
            r0 = 0
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r5 != 0) goto L_0x005b
            if (r0 != 0) goto L_0x002c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x002a:
            if (r5 != 0) goto L_0x005b
        L_0x002c:
            r0 = 0
        L_0x002d:
            r4.A00 = r0
            java.lang.reflect.Type r0 = X.2HD.A04(r6)
            r4.A01 = r0
            java.lang.Object r0 = r7.clone()
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r4.A02 = r0
            int r2 = r0.length
        L_0x003e:
            if (r3 >= r2) goto L_0x0060
            java.lang.reflect.Type[] r0 = r4.A02
            r0 = r0[r3]
            r0.getClass()
            java.lang.reflect.Type[] r0 = r4.A02
            r0 = r0[r3]
            X.2HD.A05(r0)
            java.lang.reflect.Type[] r1 = r4.A02
            r0 = r1[r3]
            java.lang.reflect.Type r0 = X.2HD.A04(r0)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x003e
        L_0x005b:
            java.lang.reflect.Type r0 = X.2HD.A04(r5)
            goto L_0x002d
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54X.<init>(java.lang.reflect.Type, java.lang.reflect.Type, java.lang.reflect.Type[]):void");
    }
}
