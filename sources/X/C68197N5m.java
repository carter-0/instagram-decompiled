package X;

/* renamed from: X.N5m  reason: case insensitive filesystem */
public final class C68197N5m extends AnonymousClass0T0 implements C232262tL {
    public CharSequence A00 = "";
    public boolean A01 = false;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68197N5m) {
                C68197N5m n5m = (C68197N5m) obj;
                if (!(this.A02 == n5m.A02 && 0qQ.A0K(this.A00, n5m.A00) && this.A01 == n5m.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C68197N5m(int i) {
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A02);
    }

    public final int hashCode() {
        return DbS.A06(this.A01, ((this.A02 * 31) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
