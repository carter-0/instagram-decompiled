package X;

import android.os.Bundle;

/* renamed from: X.F5z  reason: case insensitive filesystem */
public abstract class C49766F5z {
    public static Bundle A00(0lg r3, Integer num, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("GDPR.Fragment.EntryPoint", str);
        bundle.putString("GDPR.Fragment.UserState", A01(num));
        bundle.putBoolean("GDPR.Fragment.Entrance.Enabled", z);
        AnonymousClass0Dg.A00(bundle, r3);
        return bundle;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "existing";
            case 2:
                return "unknown";
            default:
                return "new";
        }
    }
}
