package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.SdR  reason: case insensitive filesystem */
public final class C11623SdR implements AnonymousClass0hF {
    public Long A00 = C51968G9o.A0u();
    public boolean A01 = false;
    public final /* synthetic */ BrowserLiteFragment A02;
    public final /* synthetic */ SRY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C11623SdR(BrowserLiteFragment browserLiteFragment, SRY sry, String str, boolean z) {
        this.A02 = browserLiteFragment;
        this.A03 = sry;
        this.A05 = z;
        this.A04 = str;
    }

    public final void Dms(07T r11, AnonymousClass07Z r12) {
        String str;
        BrowserLiteFragment browserLiteFragment = this.A02;
        if (browserLiteFragment.getIntent() == null || (str = browserLiteFragment.getIntent().getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID")) == null) {
            str = "";
        }
        if (r11 == 07T.ON_PAUSE) {
            SRY sry = this.A03;
            boolean z = this.A05;
            SRY.A02(new QJp(browserLiteFragment.A08, sry, "mai_play_store_launched", str, 0, z), sry, false);
            SRY.A02(new QJn(browserLiteFragment.A08, sry, this.A04, str, z), sry, false);
            this.A01 = true;
        } else if (r11 == 07T.ON_RESUME && this.A01) {
            SRY sry2 = this.A03;
            boolean z2 = this.A05;
            SRY.A02(new QJp(browserLiteFragment.A08, sry2, "mai_play_store_dismissed", str, System.currentTimeMillis() - this.A00.longValue(), z2), sry2, false);
            r12.getLifecycle().A0A(this);
        }
    }
}
