package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class TKU implements Runnable {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C7580QKv A01;
    public final /* synthetic */ RRP A02;
    public final /* synthetic */ RequestAutofillJSBridgeCall A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ List A05;

    public TKU(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C7580QKv qKv, RRP rrp, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, Integer num, List list) {
        this.A01 = qKv;
        this.A00 = autofillSharedJSBridgeProxy;
        this.A03 = requestAutofillJSBridgeCall;
        this.A05 = list;
        this.A04 = num;
        this.A02 = rrp;
    }

    public final void run() {
        C7580QKv qKv = this.A01;
        UserSession userSession = qKv.A0d;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36310430910382147L);
        boolean z = qKv.A0Q;
        boolean z2 = qKv.A0S;
        boolean A0H = qKv.A0H();
        boolean A0J = qKv.A0J();
        boolean A062 = 182.A06(0Tu.A06, userSession, 36310430913593442L);
        Bundle A022 = qKv.A02();
        QKC qkc = new QKC();
        Bundle A0J2 = Pxe.A0J(Pxi.A0C(A022, A022));
        A0J2.putBoolean("is_payment_enabled", z);
        A0J2.putBoolean("is_reconsent_enabled", z2);
        A0J2.putBoolean("is_consent_accepted", A0H);
        A0J2.putBoolean("should_always_show_ads_disclosure", A06);
        A0J2.putBoolean("should_show_fbpay_disclosure", A0J);
        A0J2.putBoolean("disable_drag_and_bg_tap_to_dismiss", A062);
        qkc.setArguments(A0J2);
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = this.A00;
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = this.A03;
        List list = this.A05;
        C270254gR r4 = qKv.A0b;
        C10860RzL rzL = r4.A00;
        String str = rzL.A0P.A03;
        if (str == null) {
            str = "";
        }
        String str2 = rzL.A05.A06;
        if (str2 == null) {
            str2 = "";
        }
        S5W s5w = qKv.A0a;
        1yd r0 = r4.A04;
        qkc.A00 = autofillSharedJSBridgeProxy;
        qkc.A05 = requestAutofillJSBridgeCall;
        qkc.A08 = list;
        qkc.A03 = qKv;
        qkc.A06 = str;
        qkc.A07 = str2;
        qkc.A01 = s5w;
        qkc.A04 = r0;
        qkc.A02 = r4;
        C11288SJh sJh = r4.A02;
        Integer num = this.A04;
        sJh.A03(num, "prompt_name", "AutofillContactBottomSheetDialogFragment", 772805755);
        qKv.A09(qkc, this.A02, num, AnonymousClass05K.A00, "AutofillContactBottomSheetDialogFragment");
        if (qKv.A0J()) {
            qKv.A06();
        }
    }
}
