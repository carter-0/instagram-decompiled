package X;

import com.instagram.business.promote.model.LinkingAuthState;
import java.util.Map;

public abstract class V99 {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Map map;
        LinkingAuthState linkingAuthState;
        X6Q x6q;
        String str;
        Object A00 = r11.A00();
        if ((A00 instanceof Map) && (map = (Map) A00) != null) {
            boolean A01 = Q0A.A01(r11.A03(3));
            String A11 = DbT.A11("access_token", map);
            if (A11 == null) {
                A11 = "";
            }
            Object obj = map.get("access_token_type");
            Integer[] A002 = AnonymousClass05K.A00(3);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Integer num = A002[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "facebook_access_token_pro2pro";
                            break;
                        case 2:
                            str = "business_user_access_token";
                            break;
                        default:
                            str = "facebook_access_token_cal";
                            break;
                    }
                    if (str.equals(obj)) {
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            linkingAuthState = LinkingAuthState.NEW_AUTH;
                        } else if (intValue == 1) {
                            linkingAuthState = LinkingAuthState.PRO2PRO_NEW_AUTH;
                        } else if (intValue == 2) {
                            linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i++;
                    }
                } else {
                    linkingAuthState = null;
                }
            }
            X6Q A04 = C308206Td.A04(r10);
            if (A04 instanceof X6Q) {
                x6q = A04;
            } else {
                x6q = null;
            }
            if (linkingAuthState == null) {
                if (x6q != null) {
                    x6q.AUr();
                }
            } else if (x6q != null) {
                x6q.CIY(linkingAuthState, A11, A01);
                return null;
            }
        }
        return null;
    }
}
