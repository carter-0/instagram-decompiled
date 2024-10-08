package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;

/* renamed from: X.Hue  reason: case insensitive filesystem */
public abstract class C56211Hue {
    public static IntentAwareAdsInfo parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            String str5 = null;
            String str6 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("format_info".equals(A17)) {
                    intentAwareAdsFormatInfoImpl = C48336Ect.parseFromJson(r13);
                } else if ("insertion_mechanism".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("is_seed_ad_eligible".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("multi_ads_first_ad_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("multi_ads_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("multi_ads_unit_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("seed_ad_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("seed_ad_position".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r13);
                } else if ("seed_ad_token".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("trigger_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, bool, num, num2, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, IntentAwareAdsInfo intentAwareAdsInfo) {
        r3.A0c();
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = intentAwareAdsInfo.A00;
        if (intentAwareAdsFormatInfo != null) {
            r3.A0q("format_info");
            IntentAwareAdsFormatInfoImpl F5E = intentAwareAdsFormatInfo.F5E();
            r3.A0c();
            IntentAwareAdsFormatType intentAwareAdsFormatType = F5E.A00;
            if (intentAwareAdsFormatType != null) {
                r3.A0R("format", intentAwareAdsFormatType.A00);
            }
            String str = F5E.A01;
            if (str != null) {
                r3.A0R(DialogModule.KEY_TITLE, str);
            }
            r3.A0Z();
        }
        String str2 = intentAwareAdsInfo.A04;
        if (str2 != null) {
            r3.A0R("insertion_mechanism", str2);
        }
        Boolean bool = intentAwareAdsInfo.A01;
        if (bool != null) {
            r3.A0S("is_seed_ad_eligible", bool.booleanValue());
        }
        String str3 = intentAwareAdsInfo.A05;
        if (str3 != null) {
            r3.A0R("multi_ads_first_ad_id", str3);
        }
        Integer num = intentAwareAdsInfo.A02;
        if (num != null) {
            r3.A0P("multi_ads_type", num.intValue());
        }
        String str4 = intentAwareAdsInfo.A06;
        if (str4 != null) {
            r3.A0R("multi_ads_unit_id", str4);
        }
        String str5 = intentAwareAdsInfo.A07;
        if (str5 != null) {
            r3.A0R("seed_ad_id", str5);
        }
        Integer num2 = intentAwareAdsInfo.A03;
        if (num2 != null) {
            r3.A0P("seed_ad_position", num2.intValue());
        }
        String str6 = intentAwareAdsInfo.A08;
        if (str6 != null) {
            r3.A0R("seed_ad_token", str6);
        }
        String str7 = intentAwareAdsInfo.A09;
        if (str7 != null) {
            r3.A0R("trigger_type", str7);
        }
        r3.A0Z();
    }
}
