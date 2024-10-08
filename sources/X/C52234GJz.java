package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.GJz  reason: case insensitive filesystem */
public abstract class C52234GJz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECTED_CACHE";
            case 2:
                return MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
            default:
                return "CONNECTED_NETWORK";
        }
    }
}
