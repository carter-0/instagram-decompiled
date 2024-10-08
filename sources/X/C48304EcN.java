package X;

import android.content.Intent;

@Deprecated
/* renamed from: X.EcN  reason: case insensitive filesystem */
public abstract class C48304EcN {
    public static Intent A00(Boolean bool, Boolean bool2, String str, String str2) {
        Intent A09 = DbS.A09();
        A09.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.ui.landing.StubInstallActivity");
        A09.putExtra("package_name", str);
        A09.putExtra("method_type", "internal_or_cross_install");
        if (bool2 != null) {
            A09.putExtra("update_flow", bool2.booleanValue());
        }
        if (str2 != null) {
            A09.putExtra("referrer", str2);
        }
        A09.putExtra("show_back_navigation", bool);
        return A09;
    }
}
