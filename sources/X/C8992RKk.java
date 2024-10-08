package X;

/* renamed from: X.RKk  reason: case insensitive filesystem */
public final class C8992RKk extends Exception {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8992RKk(String str, Throwable th) {
        super(str, th);
        AnonymousClass3Qk.A06(str, "Provided message must not be empty.");
        this.A00 = 13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8992RKk(String str, int i) {
        super(str);
        AnonymousClass3Qk.A06(str, "Provided message must not be empty.");
        this.A00 = i;
    }
}
