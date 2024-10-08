package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.fbreact.i18n.FbReactI18nAssetsModule;
import com.facebook.fbreact.i18n.FbReactI18nModule;
import com.facebook.fbreact.igford.ReactIGFordDirectModule;
import com.facebook.fbreact.safearea.ReactSafeArea;
import com.facebook.i18n.react.impl.I18nResourcesModule;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.toast.ToastModule;
import com.instagram.android.R;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.base.IgReactAnalyticsModule;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.base.IgSharedPreferencesModule;
import com.instagram.react.modules.base.RelayAPIConfigModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import go.Seq;
import java.util.HashSet;
import org.webrtc.EglBase14Impl;

/* renamed from: X.TOw  reason: case insensitive filesystem */
public final class C13190TOw implements AnonymousClass0eK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C13190TOw(QZK qzk, IgReactPackage igReactPackage, int i) {
        this.A00 = i;
        this.A01 = igReactPackage;
        this.A02 = qzk;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [X.RUu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.RQm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v49, types: [X.13g, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object get() {
        Sm4 sm4;
        C11210SFk sFk;
        C9137RQm rQm;
        T05 t05;
        13s r1;
        switch (this.A00) {
            case 0:
                return new IgReactCountryCodeRoute((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 1:
                return new BaseJavaModule((QZK) this.A02);
            case 2:
                return new BaseJavaModule((QZK) this.A02);
            case 3:
                return new FbReactI18nAssetsModule((Context) this.A02, R.raw.ads_countries_config, R.raw.localizable);
            case 4:
                QZK qzk = (QZK) this.A02;
                synchronized (C9930Rjj.class) {
                    r1 = C9930Rjj.A00;
                    if (r1 == null) {
                        r1 = new 13s(new Object(), new C13182TOo(0));
                        C9930Rjj.A00 = r1;
                    }
                }
                return new FbReactI18nModule(qzk, r1);
            case 5:
                return new BaseJavaModule((QZK) this.A02);
            case 6:
                return new I18nResourcesModule((QZK) this.A02, AnonymousClass11c.A00().A01(), new C13187TOt(this, 1));
            case 7:
                return new IgReactNavigatorModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 8:
                return new IgSharedPreferencesModule((QZK) this.A02);
            case 9:
                return new LocationModule((QZK) this.A02);
            case 10:
                return new IntentModule((QZK) this.A02);
            case 11:
                return new PermissionsModule((QZK) this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AsyncStorageModule((QZK) this.A02);
            case 13:
                return new ToastModule((QZK) this.A02);
            case 14:
                return new RelayAPIConfigModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 15:
                return new BaseJavaModule((QZK) this.A02);
            case 16:
                return new BaseJavaModule((QZK) this.A02);
            case 17:
                return new IgReactPerformanceLoggerModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new BaseJavaModule((QZK) this.A02);
            case 19:
                return new IgReactQEModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 20:
                return new NativeAnimatedModule((QZK) this.A02);
            case 21:
                return new IgReactPurchaseProtectionSheetModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 22:
                return new IgReactShoppingPickerModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 23:
                SFL sfl = (SFL) SFL.A04.getValue();
                QZK qzk2 = (QZK) this.A02;
                0qQ.A0B(qzk2, 0);
                IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = new IgReactPurchaseExperienceBridgeModule(qzk2);
                sfl.A01 = igReactPurchaseExperienceBridgeModule;
                igReactPurchaseExperienceBridgeModule.mUserSession = sfl.A00;
                igReactPurchaseExperienceBridgeModule.mSurveyController = sfl.A02;
                igReactPurchaseExperienceBridgeModule.mProducts = sfl.A03;
                return igReactPurchaseExperienceBridgeModule;
            case 24:
                return new BaseJavaModule((QZK) this.A02);
            case 25:
                return new AppearanceModule((QZK) this.A02);
            case 26:
                return new AppStateModule((QZK) this.A02);
            case 27:
                return new IgReactMediaPickerNativeModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 28:
                return new IgReactBoostPostModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new BaseJavaModule((QZK) this.A02);
            case 30:
                return new BaseJavaModule((QZK) this.A02);
            case 31:
                return new BaseJavaModule((QZK) this.A02);
            case 32:
                return new BaseJavaModule((QZK) this.A02);
            case 33:
                return new ClipboardModule((QZK) this.A02);
            case 34:
                return new IgReactBloksNavigationModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 35:
                return new NetInfoModule((QZK) this.A02);
            case 36:
                QZK qzk3 = (QZK) this.A02;
                synchronized (C9927Rjg.class) {
                    sm4 = C9927Rjg.A00;
                    if (sm4 == null) {
                        synchronized (C9926Rjf.class) {
                            sFk = C9926Rjf.A00;
                            if (sFk == null) {
                                C62880wX r8 = C61170le.A00;
                                C12764T5y t5y = new C12764T5y(r8);
                                synchronized (C9137RQm.class) {
                                    try {
                                        C9137RQm rQm2 = C9137RQm.A05;
                                        rQm = rQm2;
                                        if (rQm2 == null) {
                                            C11194SEu A002 = C11194SEu.A00(qzk3);
                                            C10668Rw2 rw2 = new C10668Rw2(qzk3);
                                            HashSet A0s = Pxf.A0s(new String[]{"main.jsbundle"});
                                            ? obj = new Object();
                                            obj.A03 = AnonymousClass05K.A00;
                                            obj.A02 = t5y;
                                            obj.A00 = A002;
                                            obj.A01 = rw2;
                                            obj.A04 = A0s;
                                            C9137RQm.A05 = obj;
                                            rQm = obj;
                                        }
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                        }
                                    }
                                }
                                synchronized (T05.class) {
                                    try {
                                        t05 = T05.A01;
                                        if (t05 == null) {
                                            t05 = new T05(qzk3);
                                            T05.A01 = t05;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                                AnonymousClass1BJ A003 = AnonymousClass1F2.A00();
                                C10666Rw0 rw0 = new C10666Rw0(t05, A003.AXT((1LJ) null, 1660028321), A003.AXT((1LJ) null, 993853946));
                                ? obj2 = new Object();
                                T04 t04 = new T04(r8);
                                S0J s0j = new S0J(qzk3, rQm);
                                C10540Rtu rtu = new C10540Rtu(qzk3, A003.AXT((1LJ) null, 1080615614));
                                sFk = new C11210SFk(C9923Rjc.A00, rw0, C9924Rjd.A00, C9922Rjb.A00, rtu, obj2, s0j, t04);
                                C9926Rjf.A00 = sFk;
                            }
                        }
                        sm4 = new Sm4(sFk, 02m.A0p, new 0na(1164602917, 2, false, false));
                        C9927Rjg.A00 = sm4;
                    }
                }
                return new JsSegmentFetcherModule(qzk3, sm4);
            case 37:
                return new ReactIGFordDirectModule((QZK) this.A02);
            case 38:
                return new BaseJavaModule((QZK) this.A02);
            case 39:
                return new BaseJavaModule((QZK) this.A02);
            case 40:
                return new ReactSafeArea((QZK) this.A02);
            case Seq.NULL_REFNUM /*41*/:
                return new BaseJavaModule((QZK) this.A02);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new BaseJavaModule((QZK) this.A02);
            case 43:
                return new IgNetworkingModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 44:
                return new IgReactAnalyticsModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
            case 45:
                return new BaseJavaModule((QZK) this.A02);
            default:
                return new IgReactCommentModerationModule((QZK) this.A02, ((IgReactPackage) this.A01).A00);
        }
    }
}
