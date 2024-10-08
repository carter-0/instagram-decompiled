package X;

import java.util.List;

/* renamed from: X.3Ei  reason: invalid class name and case insensitive filesystem */
public final class C238993Ei {
    public int A00;
    public int A01;
    public String A02;
    public List A03;

    public final 1Fn A00() {
        for (1Fn r1 : this.A03) {
            if (r1.A00.equalsIgnoreCase("X-IG-ANDROID-FROM-DISK-CACHE")) {
                return r1;
            }
        }
        return null;
    }
}
