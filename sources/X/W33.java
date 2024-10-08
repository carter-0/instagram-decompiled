package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.base.IgReactQEModule;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public final class W33 {
    public static final W33 A00 = new Object();
    public static final Set A01;
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C20652Wwk.A00);
    public static final String A03;
    public static final SimpleDateFormat A04;

    public static final N4R A00(Context context, String str) {
        CountryCodeData A002;
        int A0A;
        0qQ.A0B(str, 1);
        if (!((Set) A02.getValue()).contains(str) || 00l.A0W(str) || (A0A = PhoneNumberUtil.A01(context).A0A(str)) == 0) {
            A002 = C3270479e.A00(context);
        } else {
            Locale locale = new Locale(AnonymousClass1Q2.A02().getLanguage(), str);
            String valueOf = String.valueOf(A0A);
            String displayCountry = locale.getDisplayCountry();
            String country = locale.getCountry();
            0qQ.A07(country);
            A002 = new CountryCodeData(valueOf, displayCountry, country);
        }
        return new N4R(A002, (Integer) null, 2);
    }

    public static final C266444Yx A01(String str) {
        if (str == null || str.length() == 0) {
            return new GKO(new Object[0], 2131964812);
        }
        return new C52255GKw(str);
    }

    public static final String A03(Context context, C16595Uxp uxp, String str) {
        int i;
        switch (DbU.A02(uxp, 2)) {
            case 4:
            case 23:
                i = 2131964716;
                break;
            case 5:
            case 22:
                i = 2131964739;
                break;
            case 11:
                i = 2131964740;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131964746;
                break;
            default:
                return str;
        }
        return context.getString(i);
    }

    public static final void A04(C59732JVq jVq, LeadGenInfoFieldTypes leadGenInfoFieldTypes, boolean z) {
        0qQ.A0B(jVq, 0);
        int A022 = DbU.A02(leadGenInfoFieldTypes, 1);
        if (A022 == 6) {
            jVq.A00 = z;
        } else if (A022 == 14) {
            jVq.A01 = z;
        } else if (A022 == 20) {
            jVq.A02 = z;
        }
    }

    public final String A06(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        C16595Uxp uxp = C16595Uxp.A06;
        C16595Uxp uxp2 = leadGenFormBaseQuestion.A03;
        if (uxp == uxp2 || C16595Uxp.A0U == uxp2 || C16595Uxp.A0V == uxp2 || C16595Uxp.A08 == uxp2) {
            return null;
        }
        return uxp2.toString();
    }

    public final String A07(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        C16595Uxp uxp = C16595Uxp.A06;
        Object obj = leadGenFormBaseQuestion.A03;
        if (uxp != obj) {
            if (C16595Uxp.A0U == obj || C16595Uxp.A0V == obj) {
                obj = C16527UwW.STORE_LOCATOR;
            } else if (C16595Uxp.A08 != obj) {
                return C16595Uxp.A07.toString();
            }
        } else if (leadGenFormBaseQuestion.A02 > 0 && leadGenFormBaseQuestion.A0B != null && leadGenFormBaseQuestion.A0E != null) {
            obj = C16527UwW.SLIDER;
        } else if (leadGenFormBaseQuestion.A0D.isEmpty()) {
            obj = C16534Uwe.SHORT_ANSWER;
        } else {
            List list = leadGenFormBaseQuestion.A0C;
            if (list != null && !list.isEmpty()) {
                obj = C16527UwW.QUALIFYING_QUESTION;
            } else if ((!leadGenFormBaseQuestion.A0G.isEmpty()) || leadGenFormBaseQuestion.A0H) {
                obj = C16527UwW.CONDITIONAL_ANSWER;
            } else {
                obj = C16534Uwe.MULTIPLE_CHOICE;
            }
        }
        return obj.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.W33] */
    static {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(AnonymousClass1Q2.A02(), "MM/dd/yy, hh:mm a");
        A03 = bestDateTimePattern;
        A04 = new SimpleDateFormat(bestDateTimePattern, AnonymousClass1Q2.A02());
        String[] strArr = new String[28];
        boolean A1X = AnonymousClass7TF.A1X(new String[]{"GB", "AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES"}, strArr);
        System.arraycopy(new String[]{"SE"}, A1X ? 1 : 0, strArr, 27, 1);
        A01 = C51967G9n.A0t(strArr, A1X);
    }

    public final int A05(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C16644Uyg uyg = (C16644Uyg) EnumHelper.A00(leadGenFormBaseQuestion.A08, C16644Uyg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (uyg != null) {
            switch (uyg.ordinal()) {
                case 2:
                    return 4097;
                case 3:
                    return 33;
                case 4:
                case 6:
                case 7:
                case 8:
                case 10:
                    return 2;
                case 5:
                case 9:
                    return 528497;
                case 11:
                    return 3;
            }
        }
        int ordinal = leadGenFormBaseQuestion.A03.ordinal();
        if (ordinal == 4) {
            return 33;
        }
        if (ordinal != 5) {
            return 16385;
        }
        return 3;
    }

    public static final String A02(Context context) {
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = A04;
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        simpleDateFormat.applyLocalizedPattern(A03);
        return DbY.A0c(context, simpleDateFormat.format(time), 2131964766);
    }
}
