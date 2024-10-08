package X;

/* renamed from: X.Kri  reason: case insensitive filesystem */
public abstract class C63114Kri {
    public static final int A00() {
        Runtime runtime = Runtime.getRuntime();
        return (int) ((runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) >> 20);
    }
}
