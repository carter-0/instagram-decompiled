package X;

/* renamed from: X.Qw7  reason: case insensitive filesystem */
public final class C8511Qw7 extends C9056RNf {
    public final int A00 = 1;
    public final String A01 = "vision-common";
    public final boolean A02 = true;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C9056RNf) {
                C8511Qw7 qw7 = (C8511Qw7) ((C9056RNf) obj);
                if (!(this.A01.equals(qw7.A01) && this.A02 == qw7.A02 && this.A00 == qw7.A00)) {
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
        StringBuilder A14 = Pxe.A14(str.length() + 84);
        Pxk.A0a(str, A14, i, z);
        return AnonymousClass7TF.A0l("}", A14);
    }
}
