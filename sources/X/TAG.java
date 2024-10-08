package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class TAG implements Comparable, Serializable {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] A00;
    public transient int A01;

    public TAG(byte[] bArr) {
        0qQ.A0B(bArr, 1);
        this.A00 = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r5 = ((X.TAG) r8).A00;
        r0 = r5.length;
        r4 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x0026
            boolean r0 = r8 instanceof X.TAG
            if (r0 == 0) goto L_0x0025
            X.TAG r8 = (X.TAG) r8
            byte[] r5 = r8.A00
            int r0 = r5.length
            byte[] r4 = r7.A00
            int r3 = r4.length
            if (r0 != r3) goto L_0x0025
            r1 = 0
            int r0 = r0 - r3
            if (r1 > r0) goto L_0x0025
            int r0 = r3 - r3
            if (r1 > r0) goto L_0x0025
            r2 = 0
        L_0x001a:
            if (r2 >= r3) goto L_0x0026
            byte r1 = r5[r2]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x0025
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0025:
            r6 = 0
        L_0x0026:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TAG.equals(java.lang.Object):boolean");
    }

    public final byte[] A00() {
        return (byte[]) this.A00.clone();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TAG tag = (TAG) obj;
        0qQ.A0B(tag, 0);
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = tag.A00;
        int length2 = bArr2.length;
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min) {
            byte b = bArr[i] & 255;
            byte b2 = bArr2[i] & 255;
            if (b == b2) {
                i++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        int i = this.A01;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A00);
        this.A01 = hashCode;
        return hashCode;
    }

    public final String toString() {
        Object[] objArr;
        String str;
        byte[] bArr = this.A00;
        if (r8 == 0) {
            return "ByteString[size=0]";
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(r8);
        if (r8 <= 16) {
            char[] cArr = new char[(r8 * 2)];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = A02;
                Pxe.A1a(cArr2, cArr, b >> 4, i);
                i = i2 + 1;
                Pxe.A1a(cArr2, cArr, b, i2);
            }
            objArr2[1] = new String(cArr);
            objArr = Arrays.copyOf(objArr2, 2);
            str = "ByteString[size=%s data=%s]";
        } else {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
                char[] cArr3 = new char[(r7 * 2)];
                int i3 = 0;
                for (byte b2 : C9872Ril.A00(Arrays.copyOf(digest, digest.length)).A00) {
                    int i4 = i3 + 1;
                    char[] cArr4 = A02;
                    Pxe.A1a(cArr4, cArr3, b2 >> 4, i3);
                    i3 = i4 + 1;
                    Pxe.A1a(cArr4, cArr3, b2, i4);
                }
                objArr2[1] = new String(cArr3);
                objArr = Arrays.copyOf(objArr2, 2);
                str = "ByteString[size=%s md5=%s]";
            } catch (NoSuchAlgorithmException e) {
                throw Pxe.A0e(e);
            }
        }
        String format = String.format(str, objArr);
        0qQ.A07(format);
        return format;
    }
}
