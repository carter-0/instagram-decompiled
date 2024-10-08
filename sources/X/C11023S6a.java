package X;

import java.util.Map;

/* renamed from: X.S6a  reason: case insensitive filesystem */
public final class C11023S6a {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final boolean A06;

    public C11023S6a(String str, String str2, String str3, String str4, String str5, Map map, boolean z) {
        0qQ.A0B(str2, 2);
        this.A04 = str;
        this.A00 = str2;
        this.A06 = z;
        this.A05 = map;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11023S6a) {
                C11023S6a s6a = (C11023S6a) obj;
                if (!0qQ.A0K(this.A04, s6a.A04) || !0qQ.A0K(this.A00, s6a.A00) || !"UNKNOWN".equals("UNKNOWN") || this.A06 != s6a.A06 || !0qQ.A0K(this.A05, s6a.A05) || !0qQ.A0K(this.A03, s6a.A03) || !0qQ.A0K(this.A01, s6a.A01) || !0qQ.A0K(this.A02, s6a.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return ((((((AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A08(this.A00, A0O) + 433141802) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvailabilityInfo(securityOriginUrlHost=");
        A1A.append(this.A04);
        A1A.append(", clickSourceOfIAWLink=");
        A1A.append(this.A00);
        A1A.append(", errorCode=");
        A1A.append("UNKNOWN");
        A1A.append(", isProductEnabled=");
        A1A.append(this.A06);
        A1A.append(", additionalInfo=");
        A1A.append(this.A05);
        A1A.append(", sdkFeatureFlags=");
        A1A.append(this.A03);
        A1A.append(", iawAdId=");
        A1A.append(this.A01);
        A1A.append(", iawSessionId=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
