package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABDummyContext;
import com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity;

/* renamed from: X.S0o  reason: case insensitive filesystem */
public final class C10913S0o {
    public final /* synthetic */ BrowserLiteInMainProcessIGActivity A00;

    public C10913S0o(BrowserLiteInMainProcessIGActivity browserLiteInMainProcessIGActivity) {
        this.A00 = browserLiteInMainProcessIGActivity;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity, android.app.Activity] */
    public final C340017kY A00() {
        IabCommonTrait iABDummyContext;
        ? r2 = this.A00;
        Uri data = r2.getIntent().getData();
        if (data == null) {
            data = Uri.EMPTY;
        }
        0qQ.A0A(data);
        IABViewModeLaunchConfig.FullScreen fullScreen = IABViewModeLaunchConfig.FullScreen.A00;
        Intent intent = r2.getIntent();
        if (intent == null || (iABDummyContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT")) == null) {
            iABDummyContext = new IABDummyContext(0sn.A00);
        }
        IabCommonTrait iabCommonTrait = iABDummyContext;
        Intent intent2 = r2.getIntent();
        long j = -1;
        if (intent2 != null) {
            j = intent2.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1);
        }
        return A0O.A00(data, iabCommonTrait, fullScreen, j);
    }
}
