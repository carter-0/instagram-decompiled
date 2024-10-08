package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.S9i  reason: case insensitive filesystem */
public abstract class C11087S9i {
    public static Integer A00(String str) {
        if (str.equals("ALPHA_NUMERIC")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("ALPHA_NUMERIC_UPPERCASE")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("NUMERICAL")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("STRING")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("STRING_UPPERCASE")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("PHONE")) {
            return AnonymousClass05K.A0j;
        }
        if (str.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
            return AnonymousClass05K.A0u;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ALPHA_NUMERIC_UPPERCASE";
            case 2:
                return "NUMERICAL";
            case 3:
                return "STRING";
            case 4:
                return "STRING_UPPERCASE";
            case 5:
                return "PHONE";
            case 6:
                return PaymentDetailChangeTypes$Companion.EMAIL;
            default:
                return "ALPHA_NUMERIC";
        }
    }
}
