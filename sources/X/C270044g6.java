package X;

/* renamed from: X.4g6  reason: invalid class name and case insensitive filesystem */
public final class C270044g6 {
    public AnonymousClass6NS A00;
    public final C270864hR A01;
    public final C270864hR A02;

    public C270044g6(C270864hR r3, String str) {
        this.A02 = r3;
        if (r3 == null) {
            if (str != null) {
                r3 = C45662D0m.parseFromJson(16P.A00(str)).A00;
                if (r3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A01 = r3;
    }

    public C270044g6() {
        this((C270864hR) null, (String) null);
        throw AnonymousClass00P.createAndThrow();
    }
}
