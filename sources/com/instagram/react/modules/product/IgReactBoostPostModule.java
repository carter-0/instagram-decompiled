package com.instagram.react.modules.product;

import X.0Aj;
import X.0lg;
import X.0qQ;
import X.1ES;
import X.1Q9;
import X.AnonymousClass07i;
import X.AnonymousClass07t;
import X.AnonymousClass0kN;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.C16678UzE;
import X.C16905VAi;
import X.C18773W0w;
import X.C18794W2b;
import X.C19180WOm;
import X.C20325WpM;
import X.C20339Wpc;
import X.C20340Wpd;
import X.C305796Jo;
import X.C3724090s;
import X.DbS;
import X.DbV;
import X.JTS;
import X.Q63;
import X.QZK;
import X.SQI;
import X.V70;
import X.WQL;
import android.app.Activity;
import android.content.IntentFilter;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

@ReactModule(name = "IGBoostPostReactModule")
public class IgReactBoostPostModule extends NativeIGBoostPostReactModuleSpec {
    public static final String MODULE_NAME = "IGBoostPostReactModule";
    public final QZK mReactContext;
    public final UserSession mUserSession;

    public void addListener(String str) {
    }

    public void clearTokenAndReLoginToFB(Callback callback, Callback callback2) {
        callback2.invoke(new Object[0]);
    }

    public void dismissModalWithReactTag(double d) {
    }

    public String getFBAccessToken() {
        return "";
    }

    public String getName() {
        return "IGBoostPostReactModule";
    }

    public void removeListeners(double d) {
    }

    public String getBusinessUserAccessToken() {
        return C16905VAi.A00(this.mUserSession).A00;
    }

    public void nexusLandingScreenLoaded(boolean z, String str, String str2) {
        0Aj A0e;
        if (str2 != null) {
            if (z) {
                UserSession userSession = this.mUserSession;
                0qQ.A0B(userSession, 1);
                A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "promoted_posts_action");
                if (A0e.isSampled()) {
                    JTS.A18(A0e, 1Q9.A01("ads_manager"));
                    DbS.A1J(A0e, "nexus_page_load");
                    DbS.A1H(A0e, C16678UzE.PROMOTION_PAYMENT.toString());
                } else {
                    return;
                }
            } else if (str != null) {
                UserSession userSession2 = this.mUserSession;
                0qQ.A0B(userSession2, 1);
                A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession2), "promoted_posts_action_error");
                if (A0e.isSampled()) {
                    JTS.A18(A0e, 1Q9.A01("ads_manager"));
                    DbS.A1J(A0e, "nexus_page_load");
                    DbS.A1H(A0e, C16678UzE.PROMOTION_PAYMENT.toString());
                    A0e.AAJ("error_message", str);
                } else {
                    return;
                }
            } else {
                return;
            }
            DbV.A1J(A0e, str2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public void promotionManagerShouldRefresh() {
        AnonymousClass1Nd.A00(this.mUserSession).A00(new Object());
    }

    public void refreshMediaAfterPromotion(String str) {
        1ES.A03(C3724090s.A04(this.mUserSession, str));
    }

    public void sendBillingWizardClosedEvent(String str, String str2) {
        AnonymousClass1Nd.A00(this.mUserSession).A00(new WQL(str, str2));
    }

    public void showPromotePreview(String str, String str2, String str3, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = readableArray.toArrayList().iterator();
        while (it.hasNext()) {
            arrayList.add(V70.A00(AnonymousClass7TE.A18(it).toUpperCase(Locale.US)));
        }
        Activity currentActivity = getCurrentActivity();
        currentActivity.getClass();
        C305796Jo.A02(currentActivity, this.mUserSession, "ads_manager", str, str2, str3, arrayList);
    }

    public IgReactBoostPostModule(QZK qzk, 0lg r6) {
        super(qzk);
        this.mReactContext = qzk;
        AnonymousClass07t A00 = AnonymousClass07t.A00(qzk);
        A00.A01(new Q63(this, 14), new IntentFilter("IGBoostPostSubmitSuccessNotification"));
        A00.A01(new Q63(this, 15), new IntentFilter("IGBoostPostRefreshPromotionInsights"));
        this.mUserSession = (UserSession) r6;
    }

    public void clearWebviewCookie() {
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
    }

    public void getFBAuth(Callback callback, Callback callback2) {
        C18794W2b.A01(getCurrentActivity(), AnonymousClass07i.A00(getCurrentActivity()), new C19180WOm(callback, callback2, this), this.mUserSession);
    }

    public void navigateToBoostPost(String str, String str2) {
        C18773W0w.A01(new C20325WpM(SQI.A02(getCurrentActivity()), this, str, str2));
    }

    public void navigateToCampaignControls(String str, String str2, String str3) {
        FragmentActivity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C18773W0w.A01(new C20340Wpd(currentActivity, this, str, str2, str3));
        }
    }

    public void pushAdsPreviewForMediaID(String str, String str2, double d, String str3) {
        FragmentActivity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C18773W0w.A01(new C20339Wpc(currentActivity, this, str, str2, str3));
        }
    }
}
