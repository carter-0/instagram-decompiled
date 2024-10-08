package X;

import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.common.session.UserSession;

public abstract class V9X {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        String str;
        boolean z = false;
        C276544tV A0P = DbY.A0P(r12, 0);
        0lg A0B = C308206Td.A0B(r11);
        Fragment A01 = C308206Td.A01(r11);
        if (!(A0B instanceof UserSession)) {
            return null;
        }
        String A0I = A0P.A0I();
        boolean A0R = A0P.A0R(42, false);
        if (A0I != null) {
            C16598Uxs[] values = C16598Uxs.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C16598Uxs uxs = values[i];
                if (!A0I.equals(uxs.A01)) {
                    i++;
                } else if (uxs.A00 != null) {
                    z = true;
                }
            }
        }
        1Yg A00 = VA4.A00();
        String str2 = "";
        String A0F = A0P.A0F();
        if (A0F != null) {
            str2 = A0F;
        }
        if (!z || !A0R) {
            str = "feed_ad4ad";
        } else {
            str = "feed_ad4ad_express";
        }
        W29 A002 = A00.A00(A01.requireContext(), DbT.A0Z(r11), str2, str);
        A0P.A0K(38);
        A0P.A0K(40);
        if (A0P.A0D() != null) {
            A002.A07 = A0P.A0D();
        }
        if (0qQ.A0K(A0I, "whatsapp_message")) {
            A002.A0C = true;
        } else if (0qQ.A0K(A0I, DialogModule.KEY_MESSAGE)) {
            A002.A09 = "feed_ctd_ad4ad";
        }
        if (z) {
            if (A0I != null) {
                C16598Uxs[] values2 = C16598Uxs.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    C16598Uxs uxs2 = values2[i2];
                    if (A0I.equals(uxs2.A01)) {
                        XIGIGBoostDestination xIGIGBoostDestination = uxs2.A00;
                        if (xIGIGBoostDestination != null) {
                            A002.A00 = xIGIGBoostDestination;
                            A002.A01 = BoostFlowType.BOOST_AGAIN;
                        }
                    } else {
                        i2++;
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        C18138VmE.A00().A06(A01, A002, C308206Td.A08(r11));
        return null;
    }
}
