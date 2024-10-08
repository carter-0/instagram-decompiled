package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

public abstract class Hd7 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BLOKS";
            case 2:
                return "SHOWREEL_NATIVE";
            case 3:
                return MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
            default:
                return "NATIVE";
        }
    }
}
