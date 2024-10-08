package X;

/* renamed from: X.7OA  reason: invalid class name */
public final class AnonymousClass7OA extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final int A00;
    public final long A01;
    public final C327637Bp A02;
    public final String A03;

    public AnonymousClass7OA(C327637Bp r2, String str, int i, long j) {
        0qQ.A0B(str, 2);
        0qQ.A0B(r2, 4);
        this.A01 = j;
        this.A03 = str;
        this.A00 = i;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7OA) {
                AnonymousClass7OA r8 = (AnonymousClass7OA) obj;
                if (this.A01 != r8.A01 || !0qQ.A0K(this.A03, r8.A03) || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02)) {
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

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0Q(Pxd.A00(236), this.A01);
    }

    public final int getType() {
        return 34;
    }

    public final int hashCode() {
        long j = this.A01;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
