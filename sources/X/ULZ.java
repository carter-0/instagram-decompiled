package X;

import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import java.util.List;

public final class ULZ extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public ULZ(GSY gsy, GSY gsy2, PaymentCredentialTypeEnum paymentCredentialTypeEnum, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(list, 6);
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A01 = gsy;
        this.A02 = list;
        this.A03 = paymentCredentialTypeEnum;
        this.A04 = gsy2;
    }

    public final boolean equals(Object obj) {
        ULZ ulz;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ULZ)) {
                return false;
            }
            ulz = (ULZ) obj;
            if (ulz.A00 != 1 || !0qQ.A0K(this.A03, ulz.A03) || !0qQ.A0K(this.A07, ulz.A07) || !0qQ.A0K(this.A06, ulz.A06) || !0qQ.A0K(this.A02, ulz.A02) || !0qQ.A0K(this.A08, ulz.A08) || !0qQ.A0K(this.A05, ulz.A05) || !0qQ.A0K(this.A01, ulz.A01)) {
                return false;
            }
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof ULZ)) {
                return false;
            }
            ulz = (ULZ) obj;
            if (ulz.A00 != 0 || !0qQ.A0K(this.A05, ulz.A05) || !0qQ.A0K(this.A06, ulz.A06) || !0qQ.A0K(this.A07, ulz.A07) || !0qQ.A0K(this.A08, ulz.A08) || !0qQ.A0K(this.A01, ulz.A01) || !0qQ.A0K(this.A02, ulz.A02) || this.A03 != ulz.A03) {
                return false;
            }
        }
        if (!0qQ.A0K(this.A04, ulz.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072;
        int A0L;
        if (this.A00 != 0) {
            A072 = ((((((((((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A04);
        } else {
            A072 = (AnonymousClass7TF.A07(this.A02, ((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A04);
        }
        return A072 + A0L;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RtcMessageEventHeader(sequenceNumber=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(2046));
        sb.append(this.A07);
        sb.append(", receiverUserId=");
        sb.append(this.A06);
        sb.append(", retryCount=");
        sb.append(this.A02);
        sb.append(AnonymousClass000.A00(2050));
        sb.append(this.A08);
        sb.append(", conferenceName=");
        sb.append(this.A05);
        sb.append(", conferenceType=");
        sb.append(this.A01);
        sb.append(", type=");
        return AnonymousClass7TG.A0n(this.A04, sb);
    }

    public ULZ(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4) {
        this.A03 = l;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = num;
        this.A08 = str3;
        this.A05 = str4;
        this.A01 = num2;
        this.A04 = num3;
    }
}
