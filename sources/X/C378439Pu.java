package X;

/* renamed from: X.9Pu  reason: invalid class name and case insensitive filesystem */
public final class C378439Pu extends C359248cL {
    public final C359218cI A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C378439Pu(C359218cI r2, String str) {
        super(r2);
        0qQ.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C378439Pu) {
                C378439Pu r5 = (C378439Pu) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
