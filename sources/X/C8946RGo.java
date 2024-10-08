package X;

import com.instagram.android.R;
import java.util.regex.Pattern;

/* renamed from: X.RGo  reason: case insensitive filesystem */
public enum C8946RGo {
    AMERICAN_EXPRESS("amex", "^3[47]\\d*", "4", 0, 15, 15),
    DISCOVER("disc", "^(6011|65|64[4-9]|622)\\d*", "3", 1, 16, 16),
    JCB("jcb", "^35\\d*", "3", 2, 16, 16),
    MASTERCARD("mastercard", "^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[0-1]|2720)\\d*", "3", 3, 16, 16),
    RUPAY("rupay", "^(508[5-9]|6521[5-9]|652[2-9]|6530|6531[0-4]|60[6-8])\\d*", "3", 4, 16, 16),
    VISA("visa", "^4\\d*", "3", 5, 16, 16),
    DINERS_CLUB("diners", "^(36|38|30[0-5])\\d*", "3", 6, 14, 14),
    UNIONPAY("cup", "^62\\d*", "3", 7, 16, 19),
    HIPER("hiper", "^637(095|568|599|609|612)\\d*", "3", 8, 16, 16),
    HIPERCARD("hipercard", "^606282\\d*", "3", 9, 16, 16),
    UNKNOWN("unknown", "\\d+", "3", 10, 16, 16),
    EMPTY("", "^$", "3", 11, 16, 16);
    
    public static final C11334SNo A06 = null;
    public static final int[] A07 = null;
    public static final int[] A08 = null;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Pattern A05;

    /* JADX WARNING: type inference failed for: r0v13, types: [X.SNo, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        C8946RGo[] rGoArr;
        A09 = 0oU.A00(rGoArr);
        A06 = new Object();
        A07 = new int[]{4, 10};
        A08 = new int[]{4, 8, 12};
    }

    /* access modifiers changed from: public */
    C8946RGo(String str, String str2, String str3, int i, int i2, int i3) {
        this.A03 = r3;
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = str3;
        Pattern compile = Pattern.compile(str2);
        0qQ.A07(compile);
        this.A05 = compile;
    }

    public final int A00() {
        switch (ordinal()) {
            case 0:
                return R.drawable.payment_amex_40;
            case 1:
                return R.drawable.payment_discover_40;
            case 2:
                return R.drawable.payment_jcb_40;
            case 3:
                return R.drawable.payment_mastercard_40;
            case 5:
                return R.drawable.payment_visa_40;
            case 6:
                return R.drawable.payment_diners_club_40;
            default:
                return R.drawable.payment_generic_card_icon;
        }
    }
}
