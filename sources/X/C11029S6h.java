package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.S6h  reason: case insensitive filesystem */
public final class C11029S6h {
    public final Context A00;
    public final SOC A01;
    public final C10622RvG A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11029S6h) {
                C11029S6h s6h = (C11029S6h) obj;
                if (!0qQ.A0K(this.A00, s6h.A00) || !0qQ.A0K(this.A01, s6h.A01) || !0qQ.A0K(this.A04, s6h.A04) || !0qQ.A0K(this.A05, s6h.A05) || !0qQ.A0K(this.A09, s6h.A09) || !0qQ.A0K(this.A0A, s6h.A0A) || !0qQ.A0K(this.A0B, s6h.A0B) || !0qQ.A0K(this.A06, s6h.A06) || !0qQ.A0K(this.A03, s6h.A03) || !0qQ.A0K(this.A07, s6h.A07) || !0qQ.A0K(this.A08, s6h.A08) || !0qQ.A0K(this.A02, s6h.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
        int A083 = AnonymousClass7TF.A08(this.A03, (((((((AnonymousClass7TF.A08(this.A05, A082) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31);
        return AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A07(this.A07, A083) + AnonymousClass7TG.A0C(this.A08)) * 31);
    }

    public C11029S6h(Context context, SOC soc, C10622RvG rvG, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, Map map2) {
        C51972G9s.A1D(str, str2);
        C51969G9p.A1N(str6, 9, map);
        this.A00 = context;
        this.A01 = soc;
        this.A04 = str;
        this.A05 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A06 = list;
        this.A03 = str6;
        this.A07 = map;
        this.A08 = map2;
        this.A02 = rvG;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PttGenerationParams(context=");
        A1A.append(this.A00);
        A1A.append(", pttManager=");
        A1A.append(this.A01);
        A1A.append(", paymentType=");
        A1A.append(this.A04);
        A1A.append(", uplSessionId=");
        A1A.append(this.A05);
        A1A.append(", authTicketClientId=");
        A1A.append(this.A09);
        A1A.append(", certificate=");
        A1A.append(this.A0A);
        A1A.append(", encryptionKeyId=");
        A1A.append(this.A0B);
        A1A.append(", encryptionKeyTrustChain=");
        A1A.append(this.A06);
        A1A.append(", operation=");
        A1A.append(this.A03);
        A1A.append(", payload=");
        A1A.append(this.A07);
        A1A.append(", sensitiveKeyMap=");
        A1A.append(this.A08);
        A1A.append(", pttObserver=");
        A1A.append(this.A02);
        A1A.append(", authTicketType=");
        return C51975G9x.A0i((String) null, A1A);
    }
}
