package X;

/* renamed from: X.Vr1  reason: case insensitive filesystem */
public final class C18399Vr1 {
    public static final int A00;
    public static volatile C17403VUi A01;

    static {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        A00 = i;
    }
}
