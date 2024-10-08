package X;

import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;

public final /* synthetic */ class TKP implements Runnable {
    public final /* synthetic */ IABEvent A00;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A01;
    public final /* synthetic */ C7572QKn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ TKP(IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl, C7572QKn qKn, String str, boolean z) {
        this.A01 = browserLiteCallbackImpl;
        this.A00 = iABEvent;
        this.A04 = z;
        this.A02 = qKn;
        this.A03 = str;
    }

    public final void run() {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A01;
        IABEvent iABEvent = this.A00;
        boolean z = this.A04;
        C7572QKn qKn = this.A02;
        String str = this.A03;
        int A032 = AnonymousClass0fD.A03(1901306018);
        if (!BrowserLiteCallbackService.this.A05.get()) {
            BrowserLiteCallbackService.BrowserLiteCallbackImpl.A05(iABEvent, browserLiteCallbackImpl, qKn.A00(), z, BrowserLiteCallbackService.BrowserLiteCallbackImpl.A08(browserLiteCallbackImpl, qKn, str, ((IABLaunchEvent) iABEvent).A05, (String) null));
        }
        AnonymousClass0fD.A0A(-954280390, A032);
    }
}
