package X;

/* renamed from: X.N5i  reason: case insensitive filesystem */
public final class C68193N5i extends AnonymousClass0T0 implements C232262tL {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68193N5i) {
                C68193N5i n5i = (C68193N5i) obj;
                if (!0qQ.A0K(this.A02, n5i.A02) || !0qQ.A0K(this.A01, n5i.A01) || !0qQ.A0K(this.A00, n5i.A00)) {
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
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0C(this.A00);
    }

    public C68193N5i(String str, Integer num, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
