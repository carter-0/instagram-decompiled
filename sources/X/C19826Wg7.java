package X;

/* renamed from: X.Wg7  reason: case insensitive filesystem */
public final class C19826Wg7 implements C249763kK {
    public final int A00;
    public final String A01;

    public C19826Wg7(int i) {
        this.A00 = i;
        this.A01 = AnonymousClass7TG.A0j();
    }

    public final String getSessionId() {
        int i = this.A00;
        String str = this.A01;
        if (2 - i == 0 && str == null) {
            return "";
        }
        return str;
    }

    public C19826Wg7(String str) {
        this.A00 = 2;
        this.A01 = str;
    }
}
