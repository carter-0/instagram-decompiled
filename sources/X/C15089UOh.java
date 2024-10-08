package X;

/* renamed from: X.UOh  reason: case insensitive filesystem */
public final class C15089UOh extends AnonymousClass0T0 implements XCH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ULw A06;
    public ULH A07;
    public C15042UKv A08;
    public C16597Uxr A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final String A0V;

    public C15089UOh(C16597Uxr uxr, String str) {
        this.A0O = str;
        this.A09 = uxr;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        this.A04 = 0;
        this.A0I = "";
        this.A0B = "";
        this.A0J = "";
        this.A0N = "";
        this.A0M = null;
        this.A0K = "";
        this.A0R = false;
        this.A0P = false;
        this.A0Q = false;
        this.A0U = false;
        this.A0L = null;
        this.A0C = null;
        this.A0A = null;
        this.A0E = null;
        this.A0G = null;
        this.A0F = null;
        this.A0D = null;
        this.A0S = false;
        this.A0T = false;
        this.A0H = null;
        this.A05 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A0V = "ig_media_sticker";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15089UOh) {
                C15089UOh uOh = (C15089UOh) obj;
                if (!0qQ.A0K(this.A0O, uOh.A0O) || this.A09 != uOh.A09 || !0qQ.A0K(this.A08, uOh.A08) || !0qQ.A0K(this.A07, uOh.A07) || !0qQ.A0K(this.A06, uOh.A06) || this.A04 != uOh.A04 || !0qQ.A0K(this.A0I, uOh.A0I) || !0qQ.A0K(this.A0B, uOh.A0B) || !0qQ.A0K(this.A0J, uOh.A0J) || !0qQ.A0K(this.A0N, uOh.A0N) || !0qQ.A0K(this.A0M, uOh.A0M) || !0qQ.A0K(this.A0K, uOh.A0K) || this.A0R != uOh.A0R || this.A0P != uOh.A0P || this.A0Q != uOh.A0Q || this.A0U != uOh.A0U || !0qQ.A0K(this.A0L, uOh.A0L) || !0qQ.A0K(this.A0C, uOh.A0C) || !0qQ.A0K(this.A0A, uOh.A0A) || !0qQ.A0K(this.A0E, uOh.A0E) || !0qQ.A0K(this.A0G, uOh.A0G) || !0qQ.A0K(this.A0F, uOh.A0F) || !0qQ.A0K(this.A0D, uOh.A0D) || this.A0S != uOh.A0S || this.A0T != uOh.A0T || !0qQ.A0K(this.A0H, uOh.A0H) || this.A05 != uOh.A05 || this.A00 != uOh.A00 || this.A01 != uOh.A01 || this.A02 != uOh.A02 || this.A03 != uOh.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A07;
    }

    public final C15042UKv Az6() {
        return this.A08;
    }

    public final int Brw() {
        return this.A04;
    }

    public final C16597Uxr Bzo() {
        return this.A09;
    }

    public final ULw C7Q() {
        return this.A06;
    }

    public final String CDC() {
        return this.A0O;
    }

    public final void EUX(ULH ulh) {
        this.A07 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A08 = uKv;
    }

    public final void Ejk(int i) {
        this.A04 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A06 = uLw;
    }

    public final String getTypeName() {
        return this.A0V;
    }

    public final int hashCode() {
        int A0O2 = AnonymousClass7TE.A0O(this.A0O);
        int A082 = AnonymousClass7TF.A08(this.A0J, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A08(this.A0I, (((((((AnonymousClass7TF.A07(this.A09, A0O2) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A04) * 31)));
        int A092 = AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0P, AnonymousClass7TF.A09(this.A0R, AnonymousClass7TF.A08(this.A0K, (AnonymousClass7TF.A08(this.A0N, A082) + AnonymousClass7TG.A0E(this.A0M)) * 31))));
        return ((((((((((AnonymousClass7TF.A09(this.A0T, AnonymousClass7TF.A09(this.A0S, (((((((((((((AnonymousClass7TF.A09(this.A0U, A092) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31)) + C41845B3m.A00(this.A0H)) * 31) + this.A05) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public C15089UOh() {
        this(C16597Uxr.UNKNOWN, AnonymousClass7TG.A0j());
    }
}
