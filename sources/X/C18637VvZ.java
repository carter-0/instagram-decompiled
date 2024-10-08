package X;

/* renamed from: X.VvZ  reason: case insensitive filesystem */
public final class C18637VvZ {
    public static final C18637VvZ A02 = new C18637VvZ("UNKNOWN", (String) null);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18637VvZ) {
                C18637VvZ vvZ = (C18637VvZ) obj;
                if (!0qQ.A0K(this.A01, vvZ.A01) || !0qQ.A0K(this.A00, vvZ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }

    public final String toString() {
        return this.A01;
    }

    public C18637VvZ(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
