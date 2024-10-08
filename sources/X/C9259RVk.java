package X;

/* renamed from: X.RVk  reason: case insensitive filesystem */
public abstract class C9259RVk {
    public static final C2605346a A00(int i) {
        if (i == 0) {
            return C2605346a.AT_MOST_ONCE;
        }
        if (i == 1) {
            return C2605346a.AT_LEAST_ONCE;
        }
        throw AnonymousClass7TE.A0w("Invalid QOSLevel");
    }
}
