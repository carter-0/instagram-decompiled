package X;

/* renamed from: X.93j  reason: invalid class name and case insensitive filesystem */
public final class C3729493j extends 0Yg implements C62320sa {
    public static final C3729493j A00 = new C3729493j();

    public C3729493j() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        try {
            Object value = C3729193f.A03.getValue();
            0qQ.A07(value);
            str = ((AnonymousClass159) value).A01;
        } catch (Throwable th) {
            str = new 0eQ(th);
        }
        if (str instanceof 0eQ) {
            str = null;
        }
        if (str == null) {
            return "error";
        }
        return str;
    }
}
