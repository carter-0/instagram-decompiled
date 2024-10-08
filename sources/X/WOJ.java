package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class WOJ implements C21049XBq {
    public final /* synthetic */ C15328Uac A00;
    public final /* synthetic */ C19176WOi A01;
    public final /* synthetic */ String A02;

    public final void Dmn(LinkingAuthState linkingAuthState) {
    }

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        C15328Uac uac = this.A00;
        C19176WOi wOi = this.A01;
        String str2 = this.A02;
        C18641Vvg vvg = uac.A0C;
        if (vvg == null) {
            0qQ.A0F("promoteAdsManagerDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        String BYo = wOi.BYo();
        String str3 = wOi.A0F;
        C15620Ufm ufm = new C15620Ufm(wOi, uac, str2, 1);
        UserSession userSession = vvg.A02;
        C18641Vvg.A00(vvg, ufm, C18146VmM.A01(userSession, BYo, str3, str, WGU.A00(userSession).A03));
    }

    public WOJ(C15328Uac uac, C19176WOi wOi, String str) {
        this.A00 = uac;
        this.A01 = wOi;
        this.A02 = str;
    }

    public final void DED() {
        String str;
        C15328Uac uac = this.A00;
        C238143As r0 = uac.A0H;
        if (r0 == null) {
            str = "recyclerViewProxy";
        } else {
            r0.EaP(false);
            AnonymousClass3AD r02 = uac.A0J;
            if (r02 != null) {
                r02.setIsLoading(false);
                AnonymousClass3AD r03 = uac.A0J;
                if (r03 != null) {
                    if (!(r03 instanceof C19763Wf4)) {
                        SpinnerImageView spinnerImageView = uac.A0K;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            JTO.A1X(spinnerImageView);
                            C15480UdV udV = uac.A0B;
                            if (udV == null) {
                                str = "promoteAdToolsAdapter";
                            } else {
                                udV.A01(uac.A0e);
                            }
                        }
                    }
                    C18662VwK vwK = uac.A07;
                    if (vwK == null) {
                        str = "adsManagerLogger";
                    } else {
                        vwK.A07("promotion_list", AppStateModule.APP_STATE_ACTIVE, this.A01.BYo(), "FB Login failed or cancelled");
                        C13990Tnq.A0w(uac);
                        return;
                    }
                }
            }
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
