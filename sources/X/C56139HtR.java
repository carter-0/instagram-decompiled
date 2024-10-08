package X;

/* renamed from: X.HtR  reason: case insensitive filesystem */
public final class C56139HtR {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final Integer A05;
    public final Integer A06;

    public C56139HtR(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = str3;
        this.A00 = bool;
        this.A06 = num;
        this.A05 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56139HtR) {
                C56139HtR htR = (C56139HtR) obj;
                if (!0qQ.A0K(this.A01, htR.A01) || !0qQ.A0K(this.A02, htR.A02) || this.A04 != htR.A04 || !0qQ.A0K(this.A03, htR.A03) || !0qQ.A0K(this.A00, htR.A00) || !0qQ.A0K(this.A06, htR.A06) || !0qQ.A0K(this.A05, htR.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31 * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaEditParams(imagineMediaId=");
        A1A.append(this.A01);
        A1A.append(", mediaUrl=");
        A1A.append(this.A02);
        A1A.append(", primaryActionIsSave=");
        A1A.append(this.A04);
        A1A.append(", prompt=");
        A1A.append(this.A03);
        A1A.append(", isAnimatable=");
        A1A.append(this.A00);
        C51975G9x.A1H(A1A, ", mediaEverstoreHandle=");
        A1A.append(AnonymousClass000.A00(2034));
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(2033));
        return AnonymousClass7TG.A0n(this.A05, A1A);
    }
}
