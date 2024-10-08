package X;

import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.google.common.collect.ImmutableList;
import java.util.Calendar;

/* renamed from: X.SRf  reason: case insensitive filesystem */
public abstract class C11391SRf {
    public static final CardDetails A01(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        Integer num = null;
        Integer num2 = null;
        String str8 = null;
        String str9 = null;
        if (str != null) {
            str6 = Pxj.A0s(str);
            if (str6.length() > 4) {
                str8 = C66580MXl.A0z(str, str.length() - 4);
            }
            str7 = C8946RGo.A06.A02(str6).toString();
        } else {
            str6 = null;
        }
        if (str3 != null && str3.length() != 0) {
            0eP A03 = SPn.A03(str3);
            if (A03 != null) {
                num = (Integer) A03.A00;
                num2 = (Integer) A03.A01;
            }
        } else if (!(str4 == null || str4.length() == 0 || str5 == null || str5.length() == 0)) {
            num = Pxf.A0Z(str4);
            num2 = SPn.A00(Pxf.A0Z(str5));
        }
        if (str2 != null) {
            str9 = DbV.A12(str2);
        }
        return new CardDetails((Address) null, (ImmutableList) null, (Boolean) null, num, num2, str7, (String) null, str6, (String) null, str9, str8);
    }

    public static final boolean A02(CardDetails cardDetails) {
        String str;
        String str2 = cardDetails.A07;
        if (str2 == null || !C11098S9z.A01(str2) || (str = cardDetails.A05) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A04(CardDetails cardDetails) {
        Integer num = cardDetails.A03;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = cardDetails.A04;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Calendar instance = Calendar.getInstance();
                instance.set(2, intValue - 1);
                instance.set(1, intValue2);
                return !instance.before(Calendar.getInstance());
            }
        }
        return false;
    }

    public static final CardDetails A00(C7607QOp qOp) {
        return A01(qOp.A01, qOp.A02, qOp.A03, qOp.A04, qOp.A05);
    }

    public static final boolean A03(CardDetails cardDetails) {
        Integer num;
        int intValue;
        Integer num2;
        String str;
        int length;
        if (!A02(cardDetails) || (num = cardDetails.A03) == null || 1 > (intValue = num.intValue()) || intValue >= 13 || (num2 = cardDetails.A04) == null || num2.intValue() < 2000 || (str = cardDetails.A09) == null || (((length = str.length()) != 3 && length != 4) || !A04(cardDetails))) {
            return false;
        }
        return true;
    }
}
