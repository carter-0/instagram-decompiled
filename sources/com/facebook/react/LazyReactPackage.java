package com.facebook.react;

import X.AnonymousClass7TE;
import X.C13187TOt;
import X.C13190TOw;
import X.C13716Tff;
import X.Pxg;
import X.QZK;
import X.RH1;
import X.SNI;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.linking.FBLinkingModule;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.fbreact.billingptt.ReactBillingPTT;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.fbreact.igford.ReactIGFordDirectModule;
import com.facebook.fbreact.safearea.ReactSafeArea;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.i18n.react.impl.I18nResourcesModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgNativeColorsModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFBUserAgentModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCompassionResourceModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPostInsightsModule;
import com.instagram.react.modules.product.IgReactPromoteMigrationModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated(since = "This class is deprecated, please use BaseReactPackage instead.")
public abstract class LazyReactPackage implements C13716Tff {
    public final ArrayList A01(QZK qzk) {
        IgReactPackage igReactPackage = (IgReactPackage) this;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A00(qzk, igReactPackage, IntentModule.class, A1C, 10);
        A00(qzk, igReactPackage, NativeAnimatedModule.class, A1C, 20);
        A00(qzk, igReactPackage, CameraRollManager.class, A1C, 31);
        A00(qzk, igReactPackage, DialogModule.class, A1C, 41);
        A00(qzk, igReactPackage, DatePickerDialogModule.class, A1C, 42);
        A00(qzk, igReactPackage, IgNetworkingModule.TAG, A1C, 43);
        A00(qzk, igReactPackage, IgReactAnalyticsModule.class, A1C, 44);
        A00(qzk, igReactPackage, IgNativeColorsModule.class, A1C, 45);
        A00(qzk, igReactPackage, IgReactCommentModerationModule.class, A1C, 46);
        A00(qzk, igReactPackage, IgReactCountryCodeRoute.class, A1C, 0);
        A00(qzk, igReactPackage, IgReactPostInsightsModule.class, A1C, 1);
        A00(qzk, igReactPackage, IgReactPromoteMigrationModule.class, A1C, 2);
        A1C.add(new SNI("I18nAssets", new C13190TOw(qzk, igReactPackage, 3)));
        A00(qzk, igReactPackage, FbReactI18nModule.class, A1C, 4);
        A00(qzk, igReactPackage, I18nManagerModule.class, A1C, 5);
        A00(qzk, igReactPackage, I18nResourcesModule.class, A1C, 6);
        A00(qzk, igReactPackage, IgReactNavigatorModule.class, A1C, 7);
        A00(qzk, igReactPackage, IgSharedPreferencesModule.class, A1C, 8);
        A00(qzk, igReactPackage, LocationModule.class, A1C, 9);
        A00(qzk, igReactPackage, PermissionsModule.class, A1C, 11);
        A00(qzk, igReactPackage, AsyncStorageModule.class, A1C, 12);
        A00(qzk, igReactPackage, ToastModule.class, A1C, 13);
        A00(qzk, igReactPackage, RelayAPIConfigModule.class, A1C, 14);
        A1C.add(SNI.A00(IgReactExceptionManager.class, new C13187TOt(igReactPackage, 2)));
        A00(qzk, igReactPackage, IgReactFBUserAgentModule.class, A1C, 15);
        A00(qzk, igReactPackage, IgReactDialogModule.class, A1C, 16);
        A00(qzk, igReactPackage, IgReactPerformanceLoggerModule.class, A1C, 17);
        A00(qzk, igReactPackage, IgReactImageLoaderModule.class, A1C, 18);
        A00(qzk, igReactPackage, IgReactQEModule.class, A1C, 19);
        A00(qzk, igReactPackage, IgReactPurchaseProtectionSheetModule.class, A1C, 21);
        A00(qzk, igReactPackage, IgReactShoppingPickerModule.class, A1C, 22);
        A00(qzk, igReactPackage, IgReactPurchaseExperienceBridgeModule.class, A1C, 23);
        A00(qzk, igReactPackage, IgReactCompassionResourceModule.class, A1C, 24);
        A00(qzk, igReactPackage, AppearanceModule.class, A1C, 25);
        A00(qzk, igReactPackage, AppStateModule.class, A1C, 26);
        A00(qzk, igReactPackage, IgReactMediaPickerNativeModule.class, A1C, 27);
        A00(qzk, igReactPackage, IgReactBoostPostModule.class, A1C, 28);
        A00(qzk, igReactPackage, StatusBarModule.class, A1C, 29);
        A00(qzk, igReactPackage, SoundManagerModule.class, A1C, 30);
        A00(qzk, igReactPackage, IgReactGeoGatingModule.class, A1C, 32);
        A00(qzk, igReactPackage, ClipboardModule.class, A1C, 33);
        A00(qzk, igReactPackage, IgReactBloksNavigationModule.class, A1C, 34);
        A00(qzk, igReactPackage, NetInfoModule.class, A1C, 35);
        A00(qzk, igReactPackage, JsSegmentFetcherModule.class, A1C, 36);
        A00(qzk, igReactPackage, ReactIGFordDirectModule.class, A1C, 37);
        A00(qzk, igReactPackage, ReactBillingPTT.class, A1C, 38);
        A00(qzk, igReactPackage, FBLinkingModule.class, A1C, 39);
        A00(qzk, igReactPackage, ReactSafeArea.class, A1C, 40);
        return A1C;
    }

    public static void A00(QZK qzk, IgReactPackage igReactPackage, Class cls, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(SNI.A00(cls, new C13190TOw(qzk, igReactPackage, i)));
    }

    /* JADX INFO: finally extract failed */
    public final List AMR(QZK qzk) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A01(qzk).iterator();
        while (it.hasNext()) {
            SNI sni = (SNI) it.next();
            SystraceMessage.A00(SystraceMessage.A00, "createNativeModule", 8192).A02();
            ReactMarker.logMarker(RH1.A0N, sni.A00, 0);
            try {
                NativeModule nativeModule = (NativeModule) sni.A01.get();
                ReactMarker.logMarker(RH1.A0M);
                Pxg.A1A();
                A1C.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(RH1.A0M);
                Pxg.A1A();
                throw th;
            }
        }
        return A1C;
    }
}
