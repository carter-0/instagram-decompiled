package X;

/* renamed from: X.Qw3  reason: case insensitive filesystem */
public final class C8507Qw3 extends C9022RLx {
    public final int A00 = 1;
    public final String A01 = "common";
    public final boolean A02 = true;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C9022RLx) {
                C8507Qw3 qw3 = (C8507Qw3) ((C9022RLx) obj);
                if (!(this.A01.equals(qw3.A01) && this.A02 == qw3.A02 && this.A00 == qw3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A01.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A02) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str = this.A01;
        boolean z = this.A02;
        int i = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxk.A0a(str, A1A, i, z);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
