package X;

import com.instagram.api.schemas.IntegrityInterstitialType;

/* renamed from: X.GpO  reason: case insensitive filesystem */
public final class C53492GpO extends AnonymousClass0T0 implements C66389MPv {
    public final long A00;
    public final IntegrityInterstitialType A01;
    public final 2EG A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53492GpO) {
                C53492GpO gpO = (C53492GpO) obj;
                if (this.A01 != gpO.A01 || !0qQ.A0K(this.A05, gpO.A05) || this.A02 != gpO.A02 || !0qQ.A0K(this.A04, gpO.A04) || this.A00 != gpO.A00 || !0qQ.A0K(this.A03, gpO.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0K(this.A01))))) + AnonymousClass7TG.A0E(this.A03);
    }

    public C53492GpO(IntegrityInterstitialType integrityInterstitialType, 2EG r2, String str, String str2, String str3, long j) {
        C51974G9v.A1M(str, r2, str2);
        this.A01 = integrityInterstitialType;
        this.A05 = str;
        this.A02 = r2;
        this.A04 = str2;
        this.A00 = j;
        this.A03 = str3;
    }
}
