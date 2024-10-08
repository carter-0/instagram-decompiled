package X;

/* renamed from: X.Glg  reason: case insensitive filesystem */
public final class C53294Glg extends AnonymousClass0T0 {
    public final C54649HMg A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53294Glg) {
                C53294Glg glg = (C53294Glg) obj;
                if (!0qQ.A0K(this.A02, glg.A02) || !0qQ.A0K(this.A05, glg.A05) || !0qQ.A0K(this.A04, glg.A04) || !0qQ.A0K(this.A01, glg.A01) || this.A00 != glg.A00 || this.A06 != glg.A06 || !0qQ.A0K(this.A03, glg.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A02)))))) + AnonymousClass7TG.A0E(this.A03);
    }

    public C53294Glg(C54649HMg hMg, String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(hMg, 5);
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = hMg;
        this.A06 = z;
        this.A03 = str5;
    }
}
