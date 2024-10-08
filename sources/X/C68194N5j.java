package X;

/* renamed from: X.N5j  reason: case insensitive filesystem */
public final class C68194N5j extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68194N5j) {
                C68194N5j n5j = (C68194N5j) obj;
                if (!(0qQ.A0K(this.A00, n5j.A00) && this.A01 == n5j.A01 && this.A02 == n5j.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C68194N5j(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
