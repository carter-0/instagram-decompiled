package X;

import java.security.KeyStore;
import java.util.HashMap;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0zh  reason: invalid class name and case insensitive filesystem */
public final class C63320zh {
    public static C63320zh A02;
    public final KeyStore A00;
    public final HashMap A01;

    public static synchronized C63320zh A00() {
        C63320zh r0;
        synchronized (C63320zh.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new C63320zh();
                A02 = r0;
            }
        }
        return r0;
    }
}
