package X;

import java.util.Arrays;

public final class QOu extends AnonymousClass0T0 {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        QOu qOu;
        if (this == obj) {
            return true;
        }
        Class<?> cls = getClass();
        Class<?> cls2 = null;
        if (obj != null) {
            cls2 = obj.getClass();
        }
        if (!0qQ.A0K(cls, cls2) || !(obj instanceof QOu) || (qOu = (QOu) obj) == null) {
            return false;
        }
        return Arrays.equals(this.A00, qOu.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return Pxg.A0z(this.A00);
    }

    public QOu(byte[] bArr) {
        this.A00 = bArr;
    }
}
