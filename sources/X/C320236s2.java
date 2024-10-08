package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.6s2  reason: invalid class name and case insensitive filesystem */
public abstract class C320236s2 {
    public static final Parcelable A00(Bundle bundle, Class cls, String str) {
        0qQ.A0B(bundle, 0);
        Object A01 = 2Yc.A01(bundle, cls, str);
        A03(bundle, A01, str);
        return (Parcelable) A01;
    }

    public static final String A01(Bundle bundle, String str) {
        0qQ.A0B(bundle, 0);
        String string = bundle.getString(str);
        A03(bundle, string, str);
        return string;
    }

    public static final void A03(Bundle bundle, Object obj, String str) {
        if (obj == null) {
            Set<String> keySet = bundle.keySet();
            0qQ.A07(keySet);
            String A0P = 00k.A0P(", ", "", "", 00k.A0Z(keySet), (0sP) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Required argument '");
            sb.append(str);
            sb.append("' is missing from ");
            sb.append(bundle);
            sb.append(", included keys are [");
            sb.append(A0P);
            sb.append(']');
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final ArrayList A02(Bundle bundle, Class cls, String str) {
        ArrayList A02 = 2Yc.A02(bundle, cls, str);
        A03(bundle, A02, str);
        return A02;
    }
}
