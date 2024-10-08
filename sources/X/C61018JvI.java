package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;

/* renamed from: X.JvI  reason: case insensitive filesystem */
public final class C61018JvI extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final Double A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public static void A00(1WE r3, C61018JvI jvI, String str) {
        r3.ADh(1, str);
        r3.ADh(2, jvI.A0C);
        r3.ADa(3, (long) jvI.A00);
        r3.ADa(4, (long) jvI.A01);
        r3.ADa(5, (long) jvI.A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61018JvI) {
                C61018JvI jvI = (C61018JvI) obj;
                if (!0qQ.A0K(this.A08, jvI.A08) || !0qQ.A0K(this.A0C, jvI.A0C) || this.A00 != jvI.A00 || this.A01 != jvI.A01 || this.A02 != jvI.A02 || !0qQ.A0K(this.A06, jvI.A06) || !0qQ.A0K(this.A07, jvI.A07) || !0qQ.A0K(this.A0A, jvI.A0A) || !0qQ.A0K(this.A0B, jvI.A0B) || !0qQ.A0K(this.A09, jvI.A09) || !0qQ.A0K(this.A05, jvI.A05) || !0qQ.A0K(this.A03, jvI.A03) || !0qQ.A0K(this.A04, jvI.A04) || this.A0D != jvI.A0D) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A08);
        return DbS.A06(this.A0D, (((((((((((((((((((((AnonymousClass7TF.A08(this.A0C, A0O) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
    }

    public C61018JvI(Double d, Double d2, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A08 = str;
        this.A0C = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A06 = l;
        this.A07 = l2;
        this.A0A = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A05 = l3;
        this.A03 = d;
        this.A04 = d2;
        this.A0D = z;
    }

    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A01(this.A08, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        A002.A01(this.A0C, "userId");
        A002.A02("cryptoMailboxType", this.A00);
        A002.A02("deviceChangeType", this.A01);
        A002.A02("deviceId", this.A02);
        A002.A01(this.A06, "createdTimestampMs");
        A002.A01(this.A07, "firstReadTimestampMs");
        A002.A01(this.A0A, "model");
        A002.A01(this.A0B, "platform");
        A002.A01(this.A09, "location");
        A002.A01(this.A05, "activityFeedReadTimestampMs");
        A002.A01(this.A03, Location.LATITUDE);
        A002.A01(this.A04, "longitude");
        A002.A04("isConfirmed", this.A0D);
        return DbT.A10(A002);
    }
}
