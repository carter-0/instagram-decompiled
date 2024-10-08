package X;

import com.instagram.common.typedurl.ImageUrl;

public final class NHY extends 1XP implements 1XU {
    public long A00;
    public long A01;
    public C69321NjM A02;
    public ImageUrl A03 = null;
    public String A04;
    public String A05 = null;
    public String A06;
    public String A07;
    public String A08;

    public NHY() {
        C69321NjM njM = C69321NjM.SPARKLE;
        this.A02 = njM;
        this.A04 = null;
        this.A07 = "Share to Stories";
        this.A08 = "My first Reel!";
        this.A06 = null;
        this.A01 = -1;
        this.A00 = -1;
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NHY) {
                NHY nhy = (NHY) obj;
                if (!0qQ.A0K(this.A03, nhy.A03) || !0qQ.A0K(this.A05, nhy.A05) || this.A02 != nhy.A02 || !0qQ.A0K(this.A04, nhy.A04) || !0qQ.A0K(this.A07, nhy.A07) || !0qQ.A0K(this.A08, nhy.A08) || !0qQ.A0K(this.A06, nhy.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long AjJ() {
        return this.A00;
    }

    public final long AjP() {
        return this.A01;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A02, ((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A06);
    }

    public final void EQE(long j) {
        this.A00 = j;
    }

    public final void EQG(long j) {
        this.A01 = j;
    }
}
