package X;

/* renamed from: X.5bp  reason: invalid class name and case insensitive filesystem */
public final class C288385bp extends C286545Wv {
    public static final C288385bp A00 = new C288385bp();

    public C288385bp() {
        super(0, 3);
    }

    public final String A01(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return "from";
        }
        if (i == 2) {
            return "fixups";
        }
        return 002.A0I("ObjectParameter(", ')', i);
    }
}
