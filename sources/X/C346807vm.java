package X;

/* renamed from: X.7vm  reason: invalid class name and case insensitive filesystem */
public abstract class C346807vm {
    public static final int A00(2SP r3, 2HY r4) {
        0qQ.A0B(r3, 0);
        if (!r4.isEmpty()) {
            int i = r4.A01;
            int i2 = r4.A00;
            if (i < Integer.MAX_VALUE) {
                return r3.A06(i2, i + 1);
            }
            if (i2 > Integer.MIN_VALUE) {
                return r3.A06(i2 - 1, i) + 1;
            }
            return r3.A03();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C66579MXk.A00(494));
        sb.append(r4);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final String A01(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }
}
