package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.Els  reason: case insensitive filesystem */
public abstract class C48892Els {
    public static final Fragment A00(UserMonetizationProductType userMonetizationProductType, EWG ewg, String str, String str2) {
        Bundle A0B = DbV.A0B(ewg, 3);
        A0B.putString("referrer", ewg.toString());
        if (str2 == null || str2.length() == 0) {
            str2 = C2818159r.A01();
        } else if (!00p.A0k(str2, "upl", false)) {
            str2 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), str2);
            0qQ.A0A(str2);
        }
        A0B.putParcelable("logging_data", new LoggingData(str2));
        if (str != null) {
            A0B.putString("financial_entity_id", str);
        }
        if (userMonetizationProductType != null) {
            A0B.putString(Pxd.A00(836), FCM.A00(userMonetizationProductType, false).A00);
        }
        return AnonymousClass2E0.A02().A07(A0B, Pxd.A00(876));
    }
}
