package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.SKg  reason: case insensitive filesystem */
public abstract class C11297SKg {
    public static Integer A00(String str) {
        if (str.equals("INVALID_OFFER_CODE")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("INVALID_PAYMENT_DATA")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("INVALID_SHIPPING_ADDRESS")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("INVALID_SHIPPING_OPTION")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("INVALID_FULFILLMENT_OPTION")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("PAYPAL_AUTHORIZATION_ERROR")) {
            return AnonymousClass05K.A0j;
        }
        if (str.equals("INVALID_BILLING_ADDRESS")) {
            return AnonymousClass05K.A0u;
        }
        if (str.equals("OUT_OF_SERVICE_AREA")) {
            return AnonymousClass05K.A15;
        }
        if (str.equals("OTHER_ERROR")) {
            return AnonymousClass05K.A1F;
        }
        if (str.equals("TIMEOUT")) {
            return AnonymousClass05K.A1I;
        }
        if (str.equals("PRODUCT_OWNED")) {
            return AnonymousClass05K.A02;
        }
        if (str.equals("UPDATE_ORDER_ERROR")) {
            return AnonymousClass05K.A03;
        }
        if (str.equals("GENERIC_FAILURE")) {
            return AnonymousClass05K.A04;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "INVALID_SHIPPING_OPTION";
            case 4:
                return "INVALID_FULFILLMENT_OPTION";
            case 5:
                return "PAYPAL_AUTHORIZATION_ERROR";
            case 6:
                return "INVALID_BILLING_ADDRESS";
            case 7:
                return "OUT_OF_SERVICE_AREA";
            case 8:
                return "OTHER_ERROR";
            case 9:
                return "TIMEOUT";
            case 10:
                return "PRODUCT_OWNED";
            case 11:
                return "UPDATE_ORDER_ERROR";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "INVALID_SHIPPING_OPTION";
            case 4:
                return "INVALID_FULFILLMENT_OPTION";
            case 5:
                return "PAYPAL_AUTHORIZATION_ERROR";
            case 6:
                return "INVALID_BILLING_ADDRESS";
            case 7:
                return "OUT_OF_SERVICE_AREA";
            case 8:
                return "OTHER_ERROR";
            case 9:
                return "TIMEOUT";
            case 10:
                return "PRODUCT_OWNED";
            case 11:
                return "UPDATE_ORDER_ERROR";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }
}
