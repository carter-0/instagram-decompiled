package X;

/* renamed from: X.Mal  reason: case insensitive filesystem */
public final class C66678Mal extends AnonymousClass4AA {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66678Mal) {
                C66678Mal mal = (C66678Mal) obj;
                if (!(this.A01 == mal.A01 && this.A00 == mal.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51975G9x.A03(this.A01) + this.A00;
    }

    public C66678Mal(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
