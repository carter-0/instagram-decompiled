package X;

/* renamed from: X.7OB  reason: invalid class name */
public final class AnonymousClass7OB extends AnonymousClass4AA implements C331837So {
    public final int A00;
    public final long A01;
    public final C327637Bp A02;
    public final String A03;
    public final String A04;

    public AnonymousClass7OB(C327637Bp r2, String str, String str2, int i, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(r2, 5);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7OB) {
                AnonymousClass7OB r8 = (AnonymousClass7OB) obj;
                if (!0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01 || !0qQ.A0K(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long C7Z() {
        return this.A01;
    }

    public final int getType() {
        return 68;
    }

    public final int hashCode() {
        long j = this.A01;
        return (((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
