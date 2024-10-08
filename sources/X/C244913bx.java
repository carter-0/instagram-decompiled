package X;

/* renamed from: X.3bx  reason: invalid class name and case insensitive filesystem */
public final class C244913bx {
    public static final C244913bx A00 = new Object();

    public final long A00(int i, int i2, int i3, int i4) {
        C244893bv r14;
        C244893bv r13;
        int i5 = i;
        int i6 = i2;
        if (i5 == i6) {
            r14 = C244883bu.A00;
        } else if (i == 0) {
            r14 = C244903bw.A00;
        } else {
            r14 = C54017Gxz.A00;
        }
        int i7 = i3;
        int i8 = i4;
        if (i7 == i8) {
            r13 = C244883bu.A00;
        } else if (i3 == 0) {
            r13 = C244903bw.A00;
        } else {
            r13 = C54017Gxz.A00;
        }
        2HY r1 = r14.A01;
        int i9 = r1.A00;
        int i10 = r1.A01;
        2HY r0 = r13.A01;
        int i11 = r0.A00;
        int i12 = r0.A01;
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("minWidth must be >= 0, but was: ");
            sb.append(i5);
            sb.append(". minWidth=");
            sb.append(i5);
            sb.append(", maxWidth=");
            sb.append(i6);
            sb.append(", minHeight=");
            sb.append(i7);
            sb.append(", maxHeight=");
            sb.append(i8);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minHeight must be >= 0, but was: ");
            sb2.append(i7);
            sb2.append(". minWidth=");
            sb2.append(i5);
            sb2.append(", maxWidth=");
            sb2.append(i6);
            sb2.append(", minHeight=");
            sb2.append(i7);
            sb2.append(", maxHeight=");
            sb2.append(i8);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i5 > i9 && i5 != Integer.MAX_VALUE) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("minWidth must be <= ");
            sb3.append(i9);
            sb3.append(", but was: ");
            sb3.append(i5);
            sb3.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
            sb3.append(i5);
            sb3.append(", maxWidth=");
            sb3.append(i6);
            sb3.append(", minHeight=");
            sb3.append(i7);
            sb3.append(", maxHeight=");
            sb3.append(i8);
            throw new IllegalArgumentException(sb3.toString());
        } else if (i6 > i10 && i6 != Integer.MAX_VALUE) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("maxWidth must be <= ");
            sb4.append(i10);
            sb4.append(", but was: ");
            sb4.append(i6);
            sb4.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
            sb4.append(i5);
            sb4.append(", maxWidth=");
            sb4.append(i6);
            sb4.append(", minHeight=");
            sb4.append(i7);
            sb4.append(", maxHeight=");
            sb4.append(i8);
            throw new IllegalArgumentException(sb4.toString());
        } else if (i7 > i11 && i7 != Integer.MAX_VALUE) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("minHeight must be <= ");
            sb5.append(i11);
            sb5.append(", but was: ");
            sb5.append(i7);
            sb5.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
            sb5.append(i5);
            sb5.append(", maxWidth=");
            sb5.append(i6);
            sb5.append(", minHeight=");
            sb5.append(i7);
            sb5.append(", maxHeight=");
            sb5.append(i8);
            throw new IllegalArgumentException(sb5.toString());
        } else if (i8 > i12 && i8 != Integer.MAX_VALUE) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("maxHeight must be <= ");
            sb6.append(i12);
            sb6.append(", but was: ");
            sb6.append(i8);
            sb6.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
            sb6.append(i5);
            sb6.append(", maxWidth=");
            sb6.append(i6);
            sb6.append(", minHeight=");
            sb6.append(i7);
            sb6.append(", maxHeight=");
            sb6.append(i8);
            throw new IllegalArgumentException(sb6.toString());
        } else if (i5 > i6) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("maxWidth must be >= minWidth, but was: maxWidth=");
            sb7.append(i6);
            sb7.append("; minWidth=");
            sb7.append(i5);
            sb7.append(". minWidth=");
            sb7.append(i5);
            sb7.append(", maxWidth=");
            sb7.append(i6);
            sb7.append(", minHeight=");
            sb7.append(i7);
            sb7.append(", maxHeight=");
            sb7.append(i8);
            throw new IllegalArgumentException(sb7.toString());
        } else if (i7 <= i8) {
            return (r14.A04(i5, i6) << 32) | r13.A04(i7, i8);
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("maxHeight must be >= minHeight, but was: maxHeight=");
            sb8.append(i8);
            sb8.append("; minHeight=");
            sb8.append(i7);
            sb8.append(". minWidth=");
            sb8.append(i5);
            sb8.append(", maxWidth=");
            sb8.append(i6);
            sb8.append(", minHeight=");
            sb8.append(i7);
            sb8.append(", maxHeight=");
            sb8.append(i8);
            throw new IllegalArgumentException(sb8.toString());
        }
    }
}
