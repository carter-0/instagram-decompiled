package X;

import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "This class is deprecated, please use BusinessFlowAnalyticsLogger instead", replaceWith = @ReplaceWith(expression = "com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger", imports = {}))
/* renamed from: X.EjD  reason: case insensitive filesystem */
public abstract class C48728EjD {
    public static final HashMap A00(BusinessInfo businessInfo) {
        String str;
        String str2;
        0qQ.A0B(businessInfo, 0);
        String str3 = businessInfo.A0B;
        if (str3 == null) {
            str3 = "";
        }
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        String str4 = "";
        String str5 = str4;
        if (publicPhoneContact != null) {
            String str6 = publicPhoneContact.A02;
            if (str6 == null || str6.length() == 0 || (str2 = publicPhoneContact.A03) == null) {
                str2 = str4;
            }
            str4 = str2;
        }
        Address address = businessInfo.A00;
        if (address == null || (str = address.A03) == null) {
            str = str5;
        }
        String valueOf = String.valueOf(businessInfo.A0S);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("email", str3);
        A1E.put("phone", str4);
        A1E.put("address", str);
        A1E.put("page_id", businessInfo.A0J);
        A1E.put("category_id", businessInfo.A09);
        A1E.put("should_show_public_contacts", valueOf);
        A1E.put("is_profile_audio_call_enabled", String.valueOf(businessInfo.A0P));
        return A1E;
    }
}
