package X;

/* renamed from: X.LbZ  reason: case insensitive filesystem */
public final class C64418LbZ implements C258743zZ {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C64418LbZ() {
        this(127, (String) null, (String) null, 0);
    }

    public /* synthetic */ C64418LbZ(int i, String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        Integer num = null;
        if ((i & 1) != 0) {
            str3 = "DEFAULT_USE_CASE_ID";
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = "1.0";
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = "Default Purpose";
        } else {
            str5 = null;
        }
        str = (i & 8) != 0 ? "Default Model Name" : str;
        j = (i & 16) != 0 ? 1 : j;
        str2 = (i & 32) != 0 ? "Default Model Asset" : str2;
        num = (i & 64) != 0 ? AnonymousClass05K.A00 : num;
        C51974G9v.A1P(str3, str4, str5, str);
        C51972G9s.A1E(str2, num);
        this.A04 = str3;
        this.A06 = str4;
        this.A05 = str5;
        this.A03 = str;
        this.A00 = j;
        this.A02 = str2;
        this.A01 = num;
    }

    public final int Bis() {
        return 873412642;
    }

    public final String BTd() {
        return this.A02;
    }

    public final String BTg() {
        return this.A03;
    }

    public final long BTh() {
        return this.A00;
    }

    public final Integer BeZ() {
        return this.A01;
    }

    public final long Bsd() {
        return 4320;
    }

    public final boolean Bux() {
        return false;
    }

    public final String CCP() {
        return this.A04;
    }

    public final String CCR() {
        return this.A05;
    }

    public final String CCS() {
        return this.A06;
    }

    public final boolean CCa() {
        return false;
    }

    public final boolean CTQ() {
        return false;
    }

    public final boolean CZg() {
        return true;
    }

    public final boolean CaD() {
        return AnonymousClass7TF.A1W(this.A01, AnonymousClass05K.A00);
    }

    public final boolean CdU() {
        return false;
    }

    public final String CCQ() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03);
        A1A.append('_');
        A1A.append(this.A00);
        A1A.append('_');
        return AnonymousClass7TF.A0l(this.A02, A1A);
    }
}
