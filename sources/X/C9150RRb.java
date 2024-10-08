package X;

import java.util.Arrays;

/* renamed from: X.RRb  reason: case insensitive filesystem */
public abstract class C9150RRb {
    public static final String A00(Object obj) {
        String simpleName;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass()) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        String format = String.format("%07x", Arrays.copyOf(AnonymousClass7TF.A1b(System.identityHashCode(obj)), 1));
        0qQ.A07(format);
        return 002.A0T(simpleName, format, '@');
    }
}
