package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40X  reason: invalid class name */
public final class AnonymousClass40X {
    public int A00;
    public int[] A01;
    public Object[] A02 = new Object[8];

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.A00 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.A02[i2];
            String str = "]";
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean A0K = 0qQ.A0K(serialDescriptor.BKK(), C2591140l.A00);
                int[] iArr = this.A01;
                int i3 = iArr[i2];
                if (A0K) {
                    if (i3 != -1) {
                        sb.append("[");
                        sb.append(iArr[i2]);
                    }
                } else if (i3 >= 0) {
                    sb.append(".");
                    str = serialDescriptor.B0V(i3);
                }
            } else if (obj != C2591740r.A00) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
            }
            sb.append(str);
        }
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public AnonymousClass40X() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.A01 = iArr;
        this.A00 = -1;
    }

    public final String toString() {
        return A00();
    }
}
