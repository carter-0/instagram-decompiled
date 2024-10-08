package X;

import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;

public final class A6w {
    public final long A00;
    public final Uri A01;
    public final IabCommonTrait A02;
    public final IABViewModeLaunchConfig A03;
    public final boolean A04;

    public A6w(Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, long j, boolean z) {
        this.A01 = uri;
        this.A03 = iABViewModeLaunchConfig;
        this.A02 = iabCommonTrait;
        this.A00 = j;
        this.A04 = z;
    }
}
