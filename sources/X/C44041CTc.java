package X;

/* renamed from: X.CTc  reason: case insensitive filesystem */
public final class C44041CTc extends C54726HQf {
    public final Throwable A00;

    public final String A01() {
        return "GRAPHQL_FAILURE";
    }

    public final String A00() {
        Throwable th = this.A00;
        if (th != null) {
            return th.getMessage();
        }
        return null;
    }

    public C44041CTc(Throwable th) {
        this.A00 = th;
    }
}
