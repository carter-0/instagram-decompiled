package X;

/* renamed from: X.3cA  reason: invalid class name and case insensitive filesystem */
public abstract class C245023cA {
    public static final int A00(C245033cB r3) {
        0qQ.A0B(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal == 0) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown YogaDirection ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final C245033cB A01(int i) {
        if (i == 0) {
            return C245033cB.LTR;
        }
        if (i == 1) {
            return C245033cB.RTL;
        }
        if (i == 2) {
            return C245033cB.INHERIT;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown LayoutDirection ");
        sb.append(002.A0I("LayoutDirection(value=", ')', i));
        throw new IllegalArgumentException(sb.toString());
    }
}
