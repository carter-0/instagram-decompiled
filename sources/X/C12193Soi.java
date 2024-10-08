package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEvent;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;

/* renamed from: X.Soi  reason: case insensitive filesystem */
public final /* synthetic */ class C12193Soi implements C13564Tcd {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ IABEvent A01;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A02;

    public /* synthetic */ C12193Soi(Bundle bundle, IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl) {
        this.A02 = browserLiteCallbackImpl;
        this.A01 = iABEvent;
        this.A00 = bundle;
    }

    public final Object get() {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A02;
        IABEvent iABEvent = this.A01;
        Bundle bundle = this.A00;
        int A03 = AnonymousClass0fD.A03(-12069381);
        BrowserLiteCallbackService.BrowserLiteCallbackImpl.A04(bundle, iABEvent, browserLiteCallbackImpl);
        C60340gF r1 = C60340gF.A00;
        AnonymousClass0fD.A0A(-282329842, A03);
        return r1;
    }
}
