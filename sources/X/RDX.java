package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public enum RDX {
    ;

    public final String A00(Context context) {
        int i;
        int i2 = ((QK6) this).A00;
        Resources resources = context.getResources();
        switch (i2) {
            case 0:
                i = R.string.f0nameremoved;
                break;
            case 3:
                i = R.string.f0nameremoved;
                break;
            case 4:
                i = R.string.f0nameremoved;
                break;
            default:
                i = R.string.f0nameremoved;
                break;
        }
        return resources.getString(i);
    }

    public final String A01(AutofillData autofillData) {
        Map unmodifiableMap;
        String str;
        switch (((QK6) this).A00) {
            case 0:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                break;
            case 1:
                Map map = autofillData.A00;
                String A11 = DbT.A11("address-line1", Collections.unmodifiableMap(map));
                if (A11 == null) {
                    return null;
                }
                String A112 = DbT.A11("address-line2", Collections.unmodifiableMap(map));
                if (A112 != null) {
                    return 002.A0g(A11, " ", A112);
                }
                return A11;
            case 2:
                ArrayList A1C = AnonymousClass7TE.A1C();
                Map map2 = autofillData.A00;
                Object obj = Collections.unmodifiableMap(map2).get("address-level2");
                if (obj != null) {
                    A1C.add(obj);
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Object obj2 = Collections.unmodifiableMap(map2).get("address-level1");
                if (obj2 != null) {
                    A1C2.add(obj2);
                }
                Object obj3 = Collections.unmodifiableMap(map2).get("postal-code");
                if (obj3 != null) {
                    A1C2.add(obj3);
                }
                if (!A1C2.isEmpty()) {
                    A1C.add(TextUtils.join(" ", A1C2));
                }
                if (!A1C.isEmpty()) {
                    return TextUtils.join(", ", A1C);
                }
                return null;
            case 3:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = "email";
                break;
            default:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = "tel";
                break;
        }
        return DbT.A11(str, unmodifiableMap);
    }
}
