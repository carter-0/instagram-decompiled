package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback;
import java.util.List;

/* renamed from: X.9ZX  reason: invalid class name */
public final class AnonymousClass9ZX extends C10980S3o {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ SRY A01;
    public final /* synthetic */ IABExtensionPreExitHandlerBloksCallback A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9ZX(Bundle bundle, SRY sry, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list) {
        super(sry);
        this.A01 = sry;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = list;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = bundle;
        this.A02 = iABExtensionPreExitHandlerBloksCallback;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        String str = this.A05;
        String str2 = this.A04;
        List list = this.A07;
        BrowserLiteCallback browserLiteCallback2 = browserLiteCallback;
        browserLiteCallback2.DJe(this.A00, this.A02, str, str2, this.A03, this.A06, list);
    }
}
