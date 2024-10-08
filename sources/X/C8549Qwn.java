package X;

/* renamed from: X.Qwn  reason: case insensitive filesystem */
public final class C8549Qwn extends RPJ {
    public final int A00 = 1;
    public final String A01;
    public final boolean A02 = true;

    public /* synthetic */ C8549Qwn(String str) {
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof RPJ) {
                C8549Qwn qwn = (C8549Qwn) ((RPJ) obj);
                if (!(this.A01.equals(qwn.A01) && this.A02 == qwn.A02 && this.A00 == qwn.A00)) {
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
