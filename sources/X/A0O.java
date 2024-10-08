package X;

import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;

public abstract class A0O {
    public static final C340017kY A00(Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, long j) {
        AnonymousClass7TG.A1P(uri, iabCommonTrait);
        C340017kY r0 = new C340017kY();
        r0.A01 = new A6w(uri, iabCommonTrait, iABViewModeLaunchConfig, j, true);
        return r0;
    }
}
