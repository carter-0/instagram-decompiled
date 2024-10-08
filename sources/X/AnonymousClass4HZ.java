package X;

/* renamed from: X.4HZ  reason: invalid class name */
public abstract class AnonymousClass4HZ {
    public static 15F A00;
    public static 15H A01;
    public static 15H A02;

    static {
        15F r2 = new 15F("com.samsung.android.os.SemPerfManager");
        A00 = r2;
        Class cls = Boolean.TYPE;
        A01 = r2.A02("onScrollEvent", new Class[]{cls});
        A02 = A00.A03("onSmoothScrollEvent", new Class[]{cls});
    }

    public static boolean A00() {
        if (A02.A00 != null) {
            return true;
        }
        return false;
    }

    public static boolean A01() {
        return A00.A05((ClassLoader) null);
    }
}
