package X;

import java.util.HashSet;

/* renamed from: X.SMg  reason: case insensitive filesystem */
public final class C11312SMg {
    public static String A00 = "media3.common";
    public static final HashSet A01 = AnonymousClass7TE.A1F();

    public static synchronized void A00(String str) {
        synchronized (C11312SMg.class) {
            if (A01.add(str)) {
                A00 = 002.A0g(A00, ", ", str);
            }
        }
    }
}
