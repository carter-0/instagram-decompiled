package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEvent;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.modal.TransparentBackgroundModalActivity;

public final /* synthetic */ class TPT implements 0sP {
    public final /* synthetic */ IABEvent A00;
    public final /* synthetic */ BrowserLiteCallbackService.BrowserLiteCallbackImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ TPT(IABEvent iABEvent, BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl, String str, boolean z, boolean z2) {
        this.A01 = browserLiteCallbackImpl;
        this.A00 = iABEvent;
        this.A03 = z;
        this.A02 = str;
        this.A04 = z2;
    }

    public final Object invoke(Object obj) {
        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this.A01;
        IABEvent iABEvent = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        boolean z2 = this.A04;
        int A032 = AnonymousClass0fD.A03(1647608247);
        int A033 = AnonymousClass0fD.A03(-563466697);
        if (z2 && obj == null) {
            String str2 = iABEvent.A03;
            int A034 = AnonymousClass0fD.A03(425552981);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(C66579MXk.A00(4), "link_history_opt_in_nux");
            A0a.putString("iab_session_id", str2);
            C11242SHc.A00(new C11242SHc(browserLiteCallbackImpl.A02, str2, str, z), "opt_in_ui_show", (String) null);
            AnonymousClass6W8.A06(BrowserLiteCallbackService.this.getApplicationContext(), A0a, TransparentBackgroundModalActivity.class, "bottom_sheet");
            AnonymousClass0fD.A0A(889703654, A034);
        }
        AnonymousClass0fD.A0A(-217449032, A033);
        C60340gF r1 = C60340gF.A00;
        AnonymousClass0fD.A0A(-1536868364, A032);
        return r1;
    }
}
