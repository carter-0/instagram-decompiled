package X;

import java.io.IOException;

/* renamed from: X.47p  reason: invalid class name and case insensitive filesystem */
public class C2609347p extends IOException {
    public int A00;
    public boolean A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, X.47p] */
    public static C2609347p A00(String str, Throwable th) {
        ? iOException = new IOException(str, th);
        iOException.A01 = true;
        iOException.A00 = 1;
        return iOException;
    }
}
