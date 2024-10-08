package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;

public final class SO4 {
    public ActivityOptions A00;
    public final Intent A01 = Pxe.A0E();

    private void A00() {
        ActivityOptions activityOptions = this.A00;
        if (activityOptions == null) {
            activityOptions = ActivityOptions.makeBasic();
            this.A00 = activityOptions;
        }
        RRZ.A00(activityOptions);
    }

    public final C10917S0u A01() {
        String str;
        Bundle A0a;
        Intent intent = this.A01;
        Bundle bundle = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            intent.putExtras(A0a2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(AnonymousClass7TE.A0a());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            str = adjustedDefault.get(0).toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                A0a = intent.getBundleExtra("com.android.browser.headers");
            } else {
                A0a = AnonymousClass7TE.A0a();
            }
            if (!A0a.containsKey("Accept-Language")) {
                A0a.putString("Accept-Language", str);
                intent.putExtra("com.android.browser.headers", A0a);
            }
        }
        if (i >= 34) {
            A00();
        }
        ActivityOptions activityOptions = this.A00;
        if (activityOptions != null) {
            bundle = activityOptions.toBundle();
        }
        return new C10917S0u(intent, bundle);
    }

    public SO4(C10506RtL rtL) {
    }

    public SO4() {
    }
}
