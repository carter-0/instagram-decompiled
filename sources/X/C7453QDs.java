package X;

import java.io.IOException;
import java.util.Map;

/* renamed from: X.QDs  reason: case insensitive filesystem */
public final class C7453QDs extends C7454QDt {
    public final int A00;
    public final Map A01;
    public final byte[] A02;

    public C7453QDs(SH8 sh8, IOException iOException, Map map, byte[] bArr, int i) {
        super(sh8, iOException, 002.A0O("Response code: ", i), 2004);
        this.A00 = i;
        this.A01 = map;
        this.A02 = bArr;
    }
}
