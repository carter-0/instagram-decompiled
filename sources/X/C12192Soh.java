package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;

/* renamed from: X.Soh  reason: case insensitive filesystem */
public final /* synthetic */ class C12192Soh implements C13564Tcd {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ IABEvent A01;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A02;

    public /* synthetic */ C12192Soh(Bundle bundle, IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl) {
        this.A02 = browserLiteCallbackImpl;
        this.A01 = iABEvent;
        this.A00 = bundle;
    }

    public final Object get() {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A02;
        IABEvent iABEvent = this.A01;
        Bundle bundle = this.A00;
        int A03 = AnonymousClass0fD.A03(1459988051);
        try {
            ZonePolicy zonePolicy = ZonePolicy.A06;
            C9011RLf EJX = Pxg.A0R().EJX(new C12193Soi(bundle, iABEvent, browserLiteCallbackImpl), zonePolicy, "UNKNOWN");
            0qQ.A07(EJX);
            0qQ.A07(RWG.A00(EJX));
        } catch (TQ7 unused) {
        }
        C60340gF r1 = C60340gF.A00;
        AnonymousClass0fD.A0A(1268872687, A03);
        return r1;
    }
}
