package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.EpY  reason: case insensitive filesystem */
public abstract class C49109EpY {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PHONE_REG";
            case 2:
                return "MAIN_ACCOUNT";
            case 3:
                return "SIMPLE_SAC";
            case 4:
                return "ADD_PHONE";
            case 5:
                return "SAC_CAL";
            case 6:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return PaymentDetailChangeTypes$Companion.EMAIL;
        }
    }
}
