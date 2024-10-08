package X;

/* renamed from: X.Sgw  reason: case insensitive filesystem */
public final class C11810Sgw implements C13519Tbo {
    public final Integer A00;
    public final boolean A01;

    public final C13687Tf4 Ezs(S7N s7n, Q6Y q6y, C11796Sgi sgi) {
        if (q6y.A0S) {
            return new C11784SgW(this);
        }
        S85.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "SUBTRACT";
                    break;
                case 3:
                    str = "INTERSECT";
                    break;
                case 4:
                    str = "EXCLUDE_INTERSECTIONS";
                    break;
                default:
                    str = "MERGE";
                    break;
            }
        } else {
            str = "null";
        }
        return 002.A0S("MergePaths{mode=", str, '}');
    }

    public C11810Sgw(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
