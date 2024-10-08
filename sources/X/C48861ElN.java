package X;

/* renamed from: X.ElN  reason: case insensitive filesystem */
public abstract class C48861ElN {
    public static final Boolean A00(String str) {
        boolean z = true;
        if (!"true".equalsIgnoreCase(str)) {
            if (!"false".equalsIgnoreCase(str)) {
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
