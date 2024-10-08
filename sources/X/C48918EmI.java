package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcelable;

/* renamed from: X.EmI  reason: case insensitive filesystem */
public abstract class C48918EmI {
    public static final boolean A00(Context context) {
        Intent intent;
        String A00 = C273654mx.A00(2338);
        if (!new AnonymousClass1SF(context, context.getPackageManager()).A01(14)) {
            boolean z = false;
            try {
                context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (RW3.A00(context)) {
                0Sy r2 = new 0Sy();
                r2.A0D = true;
                r2.A01(context, 0, SN3.MAX_SIGNED_POWER_OF_TWO).getIntentSender();
            }
            intent = C48304EcN.A00(true, Boolean.valueOf(z), "com.facebook.katana", "xav:switcher");
        } else {
            intent = DbS.A09();
            intent.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.appupdate.AppUpdateRequestRedirectActivity");
            intent.putExtra("package_name", "com.facebook.katana").putExtra("fallback_intent", (Parcelable) null);
            if (RW3.A00(context)) {
                0Sy r9 = new 0Sy();
                r9.A0D = true;
                intent.putExtra("intent_sender", r9.A01(context, 0, SN3.MAX_SIGNED_POWER_OF_TWO).getIntentSender());
            }
            intent.putExtra("should_show_back_navigation", true);
            intent.putExtra("referrer", "xav:switcher");
            intent.putExtra("utm_source", "ig4a");
            intent.putExtra("utm_medium", "xav");
            intent.putExtra("utm_campaign", "switcher");
            intent.putExtra("utm_content", A00);
        }
        return 0b6.A00().A06().A0G(context, intent);
    }
}
