package X;

/* renamed from: X.FFp  reason: case insensitive filesystem */
public final class C49936FFp {
    public int A00;
    public C3263576k A01;
    public C69445Nlp A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public static 0xG A00(C49936FFp fFp) {
        String str = fFp.A09;
        0qQ.A07(str);
        return new 0xG(str);
    }

    public static boolean A01(C49936FFp fFp) {
        EZZ valueOf = EZZ.valueOf(fFp.A06);
        0qQ.A07(valueOf);
        if (valueOf == EZZ.SUGGESTED_BLOCKS || valueOf == EZZ.BLOCKED_ACCOUNTS || valueOf == EZZ.PSEUDO_BLOCK_WARNING || valueOf == EZZ.SECURE_OVER_WA_PSEUDO_BLOCK_WARNING) {
            return true;
        }
        return false;
    }

    public C49936FFp(C3263576k r1, C69445Nlp nlp, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.A09 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A08 = str3;
        this.A0B = str4;
        this.A04 = bool;
        this.A03 = bool2;
        this.A05 = str5;
        this.A06 = str6;
        this.A0A = str7;
        this.A01 = r1;
        this.A02 = nlp;
    }

    public C49936FFp() {
    }
}
