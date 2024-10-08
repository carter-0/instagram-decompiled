package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;

/* renamed from: X.9ZW  reason: invalid class name */
public final class AnonymousClass9ZW extends C10980S3o {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ SRY A01;
    public final /* synthetic */ IABExpandableFooterCallback A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9ZW(Bundle bundle, SRY sry, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4) {
        super(sry);
        this.A01 = sry;
        this.A06 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A00 = bundle;
        this.A02 = iABExpandableFooterCallback;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        BrowserLiteCallback browserLiteCallback2 = browserLiteCallback;
        browserLiteCallback2.DJc(this.A00, this.A02, this.A06, this.A04, this.A03, this.A05, true);
    }
}
