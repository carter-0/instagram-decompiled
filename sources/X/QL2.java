package X;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

public final class QL2 extends C12050Sld {
    public static final ArrayList A00 = AnonymousClass7TE.A1D(Collections.singletonList("com.sec.android.app.samsungapps"));
    public static final String[] A01 = {"https://apps.samsung.com", "samsungapps://cloudgame/play"};

    public final Bundle ALa(String str, String str2, boolean z) {
        Bundle A0J = Pxh.A0J(str, str2, z);
        A0J.putStringArrayList("package_names", A00);
        return A0J;
    }

    public final boolean FIC(Context context, Bundle bundle) {
        String string = bundle.getString("package_name");
        if (string == null) {
            return false;
        }
        return C12050Sld.A02(context, Pxe.A0I().scheme("samsungapps").authority("ProductDetail").appendPath(string).build(), bundle);
    }

    public final boolean FID(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null) {
            return false;
        }
        String[] strArr = A01;
        int i = 0;
        while (!string.startsWith(strArr[i])) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return C12050Sld.A02(context, 0cp.A03(string), bundle);
    }
}
