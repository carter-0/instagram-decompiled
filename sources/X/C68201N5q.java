package X;

/* renamed from: X.N5q  reason: case insensitive filesystem */
public final class C68201N5q extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68201N5q) {
                C68201N5q n5q = (C68201N5q) obj;
                if (this.A00 != n5q.A00 || !0qQ.A0K(this.A02, n5q.A02) || !0qQ.A0K(this.A01, n5q.A01) || this.A03 != n5q.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        return DbS.A06(this.A03, (AnonymousClass7TF.A08(this.A02, i) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public C68201N5q(Boolean bool, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = bool;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return 0qQ.A0K(obj, this);
    }
}
