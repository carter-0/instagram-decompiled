package X;

public abstract class VE6 {
    public static final C48107EVz A00(String str) {
        0qQ.A0B(str, 0);
        Object obj = C48107EVz.A01.get(str);
        if (obj != null) {
            return (C48107EVz) obj;
        }
        throw new IllegalArgumentException("Invalid server value!");
    }
}
