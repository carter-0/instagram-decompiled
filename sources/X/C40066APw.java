package X;

import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import java.util.Map;

/* renamed from: X.APw  reason: case insensitive filesystem */
public final class C40066APw implements 2YM {
    public final long A00;
    public final long A01;
    public final Uri A02;
    public final IabCommonTrait A03;
    public final IABViewModeLaunchConfig A04;
    public final String A05;
    public final boolean A06;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        0qQ.A0B(cls, 1);
        return create(cls);
    }

    public C40066APw(Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, String str, long j, long j2, boolean z) {
        this.A05 = str;
        this.A00 = j;
        this.A02 = uri;
        this.A04 = iABViewModeLaunchConfig;
        this.A03 = iabCommonTrait;
        this.A01 = j2;
        this.A06 = z;
    }

    public final 2YL create(Class cls) {
        Map A0E;
        0qQ.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass9YF.class)) {
            boolean z = this.A06;
            if (z) {
                A0E = AnonymousClass7TF.A0w("isUsingUnifiedLauncher", Boolean.valueOf(z));
            } else {
                A0E = 0Yt.A0E();
            }
            Uri uri = this.A02;
            IABViewModeLaunchConfig iABViewModeLaunchConfig = this.A04;
            return new AnonymousClass9YF(uri, this.A03, iABViewModeLaunchConfig, this.A05, A0E, this.A01, this.A00);
        }
        throw AnonymousClass7TE.A0w(AnonymousClass7TG.A0m(cls, Pxd.A00(72), AnonymousClass7TE.A1A()));
    }
}
