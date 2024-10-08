package X;

import java.util.List;

/* renamed from: X.S9j  reason: case insensitive filesystem */
public abstract class C11088S9j {
    /* JADX WARNING: type inference failed for: r0v9, types: [X.S4U, X.Qfw] */
    public static S4U A00(Integer num, List list) {
        switch (num.intValue()) {
            case 0:
                return new S4U();
            case 1:
                return new S4U();
            case 2:
                return new S4U();
            case 3:
                return new S4U();
            case 4:
                return new S4U();
            case 5:
                return new S4U();
            case 6:
                return new S4U();
            case 7:
                return new S4U();
            case 8:
                ? s4u = new S4U();
                s4u.A00 = list;
                return s4u;
            case 9:
                return new C8053Qg5();
            case 10:
                return new Qg3();
            default:
                throw DbW.A0c(C273654mx.A00(115), A01(num));
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MAX_LENGTH";
            case 2:
                return "EXACT_LENGTH";
            case 3:
                return "REGEX";
            case 4:
                return "EMPTY";
            case 5:
                return "US_STATE";
            case 6:
                return "DATE";
            case 7:
                return "CARD";
            case 8:
                return "CARD_TYPE";
            case 9:
                return "US_PHONE";
            case 10:
                return "PHONE";
            default:
                return "MIN_LENGTH";
        }
    }
}
