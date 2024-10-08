package com.facebookpay.cardptt;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.C51972G9s;
import X.C51974G9v;
import com.fbpay.ptt.interfaces.Sensitive;
import com.fbpay.ptt.interfaces.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CardPttPayload {
    @SerializedName("app_id")
    public final String appId;
    @SerializedName("auth_ticket_type")
    public final String authTicketType;
    @SerializedName("caps")
    public List caps;
    @SerializedName("credit_card")
    @Sensitive
    public final String cardNumber;
    @SerializedName("credential_id")
    public final String credId;
    @SerializedName("csc")
    @Sensitive
    public final String csc;
    @SerializedName("device_id")
    public final String deviceId;
    @SerializedName("expiry_month")
    public final String expiryMonth;
    @SerializedName("expiry_year")
    public final String expiryYear;
    @SerializedName("first_name")
    public final String firstName;
    @SerializedName("last_name")
    public final String lastName;
    @SerializedName("public_key")
    public final String publicKey;

    public static /* synthetic */ CardPttPayload copy$default(CardPttPayload cardPttPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardPttPayload.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = cardPttPayload.appId;
        }
        if ((i & 4) != 0) {
            str3 = cardPttPayload.firstName;
        }
        if ((i & 8) != 0) {
            str4 = cardPttPayload.lastName;
        }
        if ((i & 16) != 0) {
            str5 = cardPttPayload.cardNumber;
        }
        if ((i & 32) != 0) {
            str6 = cardPttPayload.csc;
        }
        if ((i & 64) != 0) {
            str7 = cardPttPayload.expiryMonth;
        }
        if ((i & 128) != 0) {
            str8 = cardPttPayload.expiryYear;
        }
        if ((i & 256) != 0) {
            str9 = cardPttPayload.publicKey;
        }
        if ((i & 512) != 0) {
            str10 = cardPttPayload.credId;
        }
        if ((i & 1024) != 0) {
            str11 = cardPttPayload.authTicketType;
        }
        if ((i & C249703kE.FLAG_MOVED) != 0) {
            list = cardPttPayload.caps;
        }
        return cardPttPayload.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component10() {
        return this.credId;
    }

    public final String component11() {
        return this.authTicketType;
    }

    public final List component12() {
        return this.caps;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.cardNumber;
    }

    public final String component6() {
        return this.csc;
    }

    public final String component7() {
        return this.expiryMonth;
    }

    public final String component8() {
        return this.expiryYear;
    }

    public final String component9() {
        return this.publicKey;
    }

    public final CardPttPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        0qQ.A0B(str, 0);
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        C51974G9v.A0d(1, str2, str12, str13, str14);
        String str15 = str8;
        0qQ.A0B(str15, 7);
        return new CardPttPayload(str, str2, str3, str4, str12, str13, str14, str15, str9, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardPttPayload) {
                CardPttPayload cardPttPayload = (CardPttPayload) obj;
                if (!0qQ.A0K(this.deviceId, cardPttPayload.deviceId) || !0qQ.A0K(this.appId, cardPttPayload.appId) || !0qQ.A0K(this.firstName, cardPttPayload.firstName) || !0qQ.A0K(this.lastName, cardPttPayload.lastName) || !0qQ.A0K(this.cardNumber, cardPttPayload.cardNumber) || !0qQ.A0K(this.csc, cardPttPayload.csc) || !0qQ.A0K(this.expiryMonth, cardPttPayload.expiryMonth) || !0qQ.A0K(this.expiryYear, cardPttPayload.expiryYear) || !0qQ.A0K(this.publicKey, cardPttPayload.publicKey) || !0qQ.A0K(this.credId, cardPttPayload.credId) || !0qQ.A0K(this.authTicketType, cardPttPayload.authTicketType) || !0qQ.A0K(this.caps, cardPttPayload.caps)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & C249703kE.FLAG_MOVED) != 0 ? null : list);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAuthTicketType() {
        return this.authTicketType;
    }

    public final List getCaps() {
        return this.caps;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCredId() {
        return this.credId;
    }

    public final String getCsc() {
        return this.csc;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.deviceId);
        return ((((((AnonymousClass7TF.A08(this.expiryYear, AnonymousClass7TF.A08(this.expiryMonth, AnonymousClass7TF.A08(this.csc, AnonymousClass7TF.A08(this.cardNumber, (((AnonymousClass7TF.A08(this.appId, A0O) + AnonymousClass7TG.A0E(this.firstName)) * 31) + AnonymousClass7TG.A0E(this.lastName)) * 31)))) + AnonymousClass7TG.A0E(this.publicKey)) * 31) + AnonymousClass7TG.A0E(this.credId)) * 31) + AnonymousClass7TG.A0E(this.authTicketType)) * 31) + AnonymousClass7TE.A0L(this.caps);
    }

    public final void setCaps(List list) {
        this.caps = list;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CardPttPayload(deviceId=");
        A1A.append(this.deviceId);
        A1A.append(", appId=");
        A1A.append(this.appId);
        A1A.append(", firstName=");
        A1A.append(this.firstName);
        A1A.append(", lastName=");
        A1A.append(this.lastName);
        A1A.append(", cardNumber=");
        A1A.append(this.cardNumber);
        A1A.append(", csc=");
        A1A.append(this.csc);
        A1A.append(", expiryMonth=");
        A1A.append(this.expiryMonth);
        A1A.append(", expiryYear=");
        A1A.append(this.expiryYear);
        A1A.append(", publicKey=");
        A1A.append(this.publicKey);
        A1A.append(", credId=");
        A1A.append(this.credId);
        A1A.append(", authTicketType=");
        A1A.append(this.authTicketType);
        A1A.append(", caps=");
        return AnonymousClass7TG.A0n(this.caps, A1A);
    }

    public CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(str5, 5);
        C51972G9s.A1E(str6, str7);
        0qQ.A0B(str8, 8);
        this.deviceId = str;
        this.appId = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.cardNumber = str5;
        this.csc = str6;
        this.expiryMonth = str7;
        this.expiryYear = str8;
        this.publicKey = str9;
        this.credId = str10;
        this.authTicketType = str11;
        this.caps = list;
    }
}
