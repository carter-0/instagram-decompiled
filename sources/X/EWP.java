package X;

import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

public enum EWP {
    A05("DEFAULT", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    A09("GIFT_CARDS", SMBPartnerType.GIFT_CARD.toString()),
    A0A("ORDER_FOOD", SMBPartnerType.FOOD_DELIVERY.toString()),
    A06("DONATE", SMBPartnerType.DONATION.toString()),
    A04("BOOK_NOW", "book_now"),
    A08("GET_TICKETS", "get_tickets"),
    A0B("RESERVE", "reserve"),
    A07("GET_QUOTE", "get_quote");
    
    public static final Map A02 = null;
    public int A00;
    public String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = AnonymousClass7TE.A1E();
        for (EWP ewp : values()) {
            A02.put(ewp.A01, ewp);
        }
    }

    /* access modifiers changed from: public */
    EWP(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
