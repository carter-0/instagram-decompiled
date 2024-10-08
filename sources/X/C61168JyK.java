package X;

/* renamed from: X.JyK  reason: case insensitive filesystem */
public final class C61168JyK extends AnonymousClass0T0 implements C232262tL {
    public final C62587KiK A00;
    public final AnonymousClass7L0 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61168JyK) {
                C61168JyK jyK = (C61168JyK) obj;
                if (this.A00 != jyK.A00 || this.A05 != jyK.A05 || !0qQ.A0K(this.A01, jyK.A01) || !0qQ.A0K(this.A02, jyK.A02) || !0qQ.A0K(this.A03, jyK.A03) || !0qQ.A0K(this.A04, jyK.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61168JyK jyK = (C61168JyK) obj;
        0qQ.A0B(jyK, 0);
        if (this.A00 != jyK.A00 || !0qQ.A0K(this.A02, jyK.A02) || !0qQ.A0K(this.A01, jyK.A01) || this.A05 != jyK.A05 || !0qQ.A0K(this.A03, jyK.A03) || !0qQ.A0K(this.A04, jyK.A04)) {
            return false;
        }
        return true;
    }

    public C61168JyK(C62587KiK kiK, AnonymousClass7L0 r2, String str, String str2, String str3, boolean z) {
        this.A00 = kiK;
        this.A05 = z;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }
}
