package X;

/* renamed from: X.N5s  reason: case insensitive filesystem */
public final class C68203N5s extends AnonymousClass0T0 implements C232262tL {
    public final C3253572b A00;
    public final C320156rr A01;
    public final String A02;
    public final String A03;

    public C68203N5s(C3253572b r2, C320156rr r3, String str, String str2) {
        0qQ.A0B(r2, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68203N5s) {
                C68203N5s n5s = (C68203N5s) obj;
                if (!0qQ.A0K(this.A02, n5s.A02) || !0qQ.A0K(this.A03, n5s.A03) || !0qQ.A0K(this.A00, n5s.A00) || this.A01 != n5s.A01) {
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
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
