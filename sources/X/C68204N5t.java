package X;

/* renamed from: X.N5t  reason: case insensitive filesystem */
public final class C68204N5t extends AnonymousClass0T0 implements C232262tL {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68204N5t) {
                C68204N5t n5t = (C68204N5t) obj;
                if (!0qQ.A0K(this.A01, n5t.A01) || !0qQ.A0K(this.A03, n5t.A03) || !0qQ.A0K(this.A00, n5t.A00) || !0qQ.A0K(this.A02, n5t.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return C41845B3m.A01(this.A02, (AnonymousClass7TF.A08(this.A03, A0O) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C68204N5t(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = num;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
