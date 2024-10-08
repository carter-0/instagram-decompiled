package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.73f  reason: invalid class name and case insensitive filesystem */
public final class C3255873f {
    public final long A00;
    public final String A01;
    public final Set A02;
    public final Set A03 = new HashSet();

    public C3255873f(String str, Set set, long j) {
        this.A00 = j;
        this.A02 = Collections.unmodifiableSet(set);
        this.A01 = str;
    }
}
