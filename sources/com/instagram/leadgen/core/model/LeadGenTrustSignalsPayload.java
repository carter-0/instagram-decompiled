package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C16611Uy7;
import X.C41848B3p;
import X.C51971G9r;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class LeadGenTrustSignalsPayload extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(91);
    public final LeadGenTrustSignal A00;
    public final LeadGenTrustSignal A01;
    public final LeadGenTrustSignal A02;
    public final LeadGenTrustSignal A03;
    public final Integer A04;
    public final List A05;
    public final LeadGenTrustSignal A06;
    public final String A07;

    public LeadGenTrustSignalsPayload(LeadGenTrustSignal leadGenTrustSignal, LeadGenTrustSignal leadGenTrustSignal2, LeadGenTrustSignal leadGenTrustSignal3, LeadGenTrustSignal leadGenTrustSignal4, LeadGenTrustSignal leadGenTrustSignal5, Integer num, String str, List list) {
        AnonymousClass7TF.A1F(num, 2, list);
        this.A07 = str;
        this.A04 = num;
        this.A01 = leadGenTrustSignal;
        this.A02 = leadGenTrustSignal2;
        this.A00 = leadGenTrustSignal3;
        this.A06 = leadGenTrustSignal4;
        this.A03 = leadGenTrustSignal5;
        this.A05 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenTrustSignalsPayload) {
                LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = (LeadGenTrustSignalsPayload) obj;
                if (!0qQ.A0K(this.A07, leadGenTrustSignalsPayload.A07) || this.A04 != leadGenTrustSignalsPayload.A04 || !0qQ.A0K(this.A01, leadGenTrustSignalsPayload.A01) || !0qQ.A0K(this.A02, leadGenTrustSignalsPayload.A02) || !0qQ.A0K(this.A00, leadGenTrustSignalsPayload.A00) || !0qQ.A0K(this.A06, leadGenTrustSignalsPayload.A06) || !0qQ.A0K(this.A03, leadGenTrustSignalsPayload.A03) || !0qQ.A0K(this.A05, leadGenTrustSignalsPayload.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        switch (this.A04.intValue()) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        parcel.writeString(str);
        C13991Tnr.A0u(parcel, this.A01, i);
        C13991Tnr.A0u(parcel, this.A02, i);
        C13991Tnr.A0u(parcel, this.A00, i);
        C13991Tnr.A0u(parcel, this.A06, i);
        C13991Tnr.A0u(parcel, this.A03, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            ((LeadGenTrustSignal) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final C16611Uy7 A00() {
        LeadGenTrustSignal leadGenTrustSignal = this.A00;
        if (leadGenTrustSignal != null && leadGenTrustSignal.A02 != null) {
            return C16611Uy7.A05;
        }
        LeadGenTrustSignal leadGenTrustSignal2 = this.A02;
        if (leadGenTrustSignal2 == null || leadGenTrustSignal2.A02 == null) {
            return C16611Uy7.A0E;
        }
        return C16611Uy7.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r1 == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r1 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r5 = this;
            com.instagram.leadgen.core.model.LeadGenTrustSignal r1 = r5.A01
            r0 = 0
            if (r1 == 0) goto L_0x0007
            java.lang.String r0 = r1.A02
        L_0x0007:
            r4 = 0
            if (r0 == 0) goto L_0x0011
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r3 = r0 ^ 1
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r5.A02
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0023
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            r2 = r0 ^ 1
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r5.A00
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0035
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r1 = r0 ^ 1
            if (r3 != 0) goto L_0x0046
            java.util.List r0 = r5.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x0046
            if (r1 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
        L_0x0046:
            r4 = 1
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload.A01():boolean");
    }

    public final int hashCode() {
        String str;
        int A0E = AnonymousClass7TG.A0E(this.A07) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "FACEBOOK";
                break;
            case 2:
                str = "UNKNOWN";
                break;
            default:
                str = "INSTAGRAM";
                break;
        }
        return AnonymousClass7TE.A0N(this.A05, (((((((((C51971G9r.A0F(str, intValue, A0E) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }
}
