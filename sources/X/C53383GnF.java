package X;

/* renamed from: X.GnF  reason: case insensitive filesystem */
public final class C53383GnF extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C53383GnF(C54617HLa hLa, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = str;
        this.A07 = z;
        this.A01 = hLa;
        this.A06 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A02 = num;
        this.A04 = str2;
    }

    public static /* synthetic */ C53383GnF A00(C53383GnF gnF, C54617HLa hLa, Integer num, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str2;
        Integer num2 = num;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        C54617HLa hLa2 = hLa;
        boolean z8 = z;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = gnF.A03;
        }
        if ((i & 2) != 0) {
            z8 = gnF.A07;
        }
        if ((i & 4) != 0) {
            hLa2 = (C54617HLa) gnF.A01;
        }
        if ((i & 8) != 0) {
            z7 = gnF.A06;
        }
        if ((i & 16) != 0) {
            z6 = gnF.A08;
        }
        if ((i & 32) != 0) {
            z5 = gnF.A05;
        }
        if ((i & 64) != 0) {
            num2 = (Integer) gnF.A02;
        }
        if ((i & 128) != 0) {
            str3 = gnF.A04;
        }
        DbY.A1S(str4, hLa2);
        return new C53383GnF(hLa2, num2, str4, str3, z8, z7, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53383GnF)) {
                return false;
            }
            C53383GnF gnF = (C53383GnF) obj;
            if (gnF.A00 == 1 && 0qQ.A0K(this.A03, gnF.A03) && this.A07 == gnF.A07 && this.A01 == gnF.A01 && this.A06 == gnF.A06 && this.A08 == gnF.A08 && this.A05 == gnF.A05 && 0qQ.A0K(this.A02, gnF.A02) && 0qQ.A0K(this.A04, gnF.A04)) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53383GnF)) {
                return false;
            }
            C53383GnF gnF2 = (C53383GnF) obj;
            if (gnF2.A00 == 0 && 0qQ.A0K(this.A03, gnF2.A03) && 0qQ.A0K(this.A04, gnF2.A04) && this.A02 == gnF2.A02 && this.A01 == gnF2.A01 && this.A07 == gnF2.A07 && this.A08 == gnF2.A08 && this.A05 == gnF2.A05 && this.A06 == gnF2.A06) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i = this.A00;
        String str = this.A03;
        if (i != 0) {
            return ((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TE.A0O(str)))))) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A04);
        }
        int A0O = (AnonymousClass7TE.A0O(str) + AnonymousClass7TG.A0E(this.A04)) * 31;
        Integer num = (Integer) this.A02;
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0B(num, C333837aE.A01(num), A0O))))));
    }

    public C53383GnF(C333797aA r3, Integer num, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A04 = null;
        this.A02 = num;
        this.A01 = r3;
        this.A07 = false;
        this.A08 = z;
        this.A05 = z2;
        this.A06 = false;
    }

    public C53383GnF() {
        this(C54617HLa.LOADING, (Integer) null, "", (String) null, false, false, false, false);
    }
}
