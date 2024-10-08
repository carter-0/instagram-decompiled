package X;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;

/* renamed from: X.VlP  reason: case insensitive filesystem */
public abstract class C18095VlP {
    public static final byte[] A01(String str) {
        try {
            Charset forName = Charset.forName("ASCII");
            0qQ.A07(forName);
            return Pxf.A1V(str, forName);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static final boolean A00(byte[] bArr, byte[] bArr2, int i) {
        boolean A1X = DbW.A1X(bArr2);
        int length = bArr2.length;
        if (length + i > bArr.length) {
            return A1X;
        }
        Collection r1 = new 2HY(A1X ? 1 : 0, length - 1);
        if ((r1 instanceof Collection) && r1.isEmpty()) {
            return true;
        }
        0sh it = r1.iterator();
        while (it.hasNext()) {
            int A00 = it.A00();
            if (bArr[i + A00] != bArr2[A00]) {
                return false;
            }
        }
        return true;
    }
}
