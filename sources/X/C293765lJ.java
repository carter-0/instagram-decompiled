package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.5lJ  reason: invalid class name and case insensitive filesystem */
public final class C293765lJ {
    public final C296835qi A00;
    public final Set A01;
    public final int[] A02;
    public final String[] A03;

    public C293765lJ(C296835qi r3, int[] iArr, String[] strArr) {
        0sl singleton;
        this.A00 = r3;
        this.A02 = iArr;
        this.A03 = strArr;
        int length = strArr.length;
        if (length == 0) {
            singleton = 0sl.A00;
        } else {
            singleton = Collections.singleton(strArr[0]);
            0qQ.A07(singleton);
        }
        this.A01 = singleton;
        if (iArr.length != length) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
