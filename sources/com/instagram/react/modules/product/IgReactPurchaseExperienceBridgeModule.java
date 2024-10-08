package com.instagram.react.modules.product;

import X.0hq;
import X.AnonymousClass0t1;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.C13008THq;
import X.C13009THr;
import X.C13430TaH;
import X.C13904TjR;
import X.C18738VzJ;
import X.C18773W0w;
import X.C20307Wow;
import X.C323526xd;
import X.Pxj;
import X.QZK;
import X.Sp6;
import X.TE1;
import X.TK1;
import X.WQO;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ReactModule(name = "IGPurchaseExperienceBridgeModule")
public class IgReactPurchaseExperienceBridgeModule extends NativeIGPurchaseExperienceBridgeModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseExperienceBridgeModule";
    public static final String RN_PAYMENT_TYPE_KEY = "paymentType";
    public static final String RN_SHOP_PAY_CODE = "code";
    public static final String RN_SHOP_PAY_SESSION_ID = "session_id";
    public static final String RN_SHOP_PAY_STATE = "state";
    public static final String RN_SHOP_PAY_STATUS = "status";
    public static final int SHOP_PAY_REQUEST_CODE = 1;
    public final C13430TaH mActivityEventListener;
    public List mProducts;
    public C13904TjR mShopPayPromise;
    public C18738VzJ mSurveyController;
    public UserSession mUserSession;

    public void authenticate(double d, ReadableMap readableMap, C13904TjR tjR) {
    }

    public void checkoutConfirmationWillDismiss() {
    }

    public String getName() {
        return "IGPurchaseExperienceBridgeModule";
    }

    public void openConnectFlow(double d, String str, String str2, C13904TjR tjR) {
    }

    public void openPaypalConsentFlow(double d, String str, String str2, String str3, C13904TjR tjR) {
    }

    public static 0hq getFragmentManager(FragmentActivity fragmentActivity, Fragment fragment) {
        if (fragment != null) {
            return fragment.getChildFragmentManager();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw AnonymousClass7TE.A0w("FragmentActivity and fragment cannot both be empty");
    }

    public void dismissCheckout(double d, ReadableArray readableArray, boolean z, boolean z2) {
        AnonymousClass1Nd.A00(this.mUserSession).A00(new WQO(getProductIdsFromReadableArray(readableArray), z, z2));
        C18773W0w.A01(new TE1(this));
    }

    public void initCheckout(double d, ReadableMap readableMap) {
        C18773W0w.A01(new C13009THr(readableMap, this));
    }

    public void onPaymentSuccess(String str, boolean z, String str2, ReadableArray readableArray, ReadableArray readableArray2) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            User A01 = AnonymousClass0t1.A01.A01(userSession);
            A01.A03.EYe(AnonymousClass7TE.A0v());
            if (z && str2 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (readableArray2 != null) {
                    Iterator it = readableArray2.toArrayList().iterator();
                    while (it.hasNext()) {
                        Pxj.A1T(A1C, it);
                    }
                }
                AnonymousClass1Nd.A00(userSession).A00(new C323526xd(str2, Collections.unmodifiableList(A1C)));
            }
        }
        C18738VzJ vzJ = this.mSurveyController;
        if (vzJ != null) {
            vzJ.A01 = true;
        }
    }

    public void openShopPayFlow(double d, String str, String str2, C13904TjR tjR) {
        this.mShopPayPromise = tjR;
        try {
            C18773W0w.A01(new C13008THq(this, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            tjR.reject(e);
        }
    }

    public void openShopPayInterstitial(double d, String str, String str2, C13904TjR tjR) {
        try {
            C18773W0w.A01(new TK1(tjR, this, str2, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            tjR.reject(e);
        }
    }

    public void setProducts(List list) {
        this.mProducts = list;
    }

    public void setSurveyController(C18738VzJ vzJ) {
        this.mSurveyController = vzJ;
    }

    public void setUserSession(UserSession userSession) {
        this.mUserSession = userSession;
    }

    public void sharePurchaseToStory(double d, String str, String str2) {
        C18773W0w.A01(new C20307Wow(this, str, str2));
    }

    public IgReactPurchaseExperienceBridgeModule(QZK qzk) {
        super(qzk);
        Sp6 sp6 = new Sp6(this);
        this.mActivityEventListener = sp6;
        qzk.A0B.add(sp6);
    }

    private List getProductIdsFromReadableArray(ReadableArray readableArray) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (readableArray != null) {
            Iterator it = readableArray.toArrayList().iterator();
            while (it.hasNext()) {
                Pxj.A1T(A1C, it);
            }
        }
        return A1C;
    }
}
