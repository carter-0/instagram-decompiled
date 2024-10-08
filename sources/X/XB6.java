package X;

import android.os.Bundle;

public interface XB6 {
    void Cgq(Bundle bundle, String str, String str2, String str3, String str4);

    static void A00(Bundle bundle, XB6 xb6, String str, String str2, String str3) {
        xb6.Cgq(bundle, str, str2, str3, "click");
    }

    static void A01(XB6 xb6, String str, String str2, String str3) {
        xb6.Cgq((Bundle) null, str, str2, str3, "click");
    }

    static void A02(XB6 xb6, String str, String str2, String str3) {
        xb6.Cgq((Bundle) null, str, str2, str3, "impression");
    }
}
