package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.S2a  reason: case insensitive filesystem */
public final class C10943S2a {
    public final int A00;
    public final int A01;
    public final String A02;
    public final List A03;
    public final byte[] A04;

    public final int A00() {
        int i = this.A00;
        if (i == 2) {
            return C249703kE.FLAG_MOVED;
        }
        if (i != 3) {
            return 0;
        }
        return 512;
    }

    public C10943S2a(String str, List list, byte[] bArr, int i, int i2) {
        List unmodifiableList;
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A03 = unmodifiableList;
        this.A04 = bArr;
    }
}
