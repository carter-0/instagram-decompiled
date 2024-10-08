package X;

/* renamed from: X.N5u  reason: case insensitive filesystem */
public final class C68205N5u extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68205N5u) {
                C68205N5u n5u = (C68205N5u) obj;
                if (!0qQ.A0K(this.A03, n5u.A03) || !0qQ.A0K(this.A02, n5u.A02) || !0qQ.A0K(this.A01, n5u.A01) || !0qQ.A0K(this.A00, n5u.A00) || this.A04 != n5u.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, ((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A00)) * 31);
    }

    public C68205N5u(String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
