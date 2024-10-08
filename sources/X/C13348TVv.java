package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.primitive.textinput.TextInputView;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.rendercore.text.RCTextView;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.TVv  reason: case insensitive filesystem */
public final class C13348TVv extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13348TVv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C13348TVv(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        Integer valueOf;
        0sP r0;
        switch (this.A00) {
            case 0:
            case 3:
            case 7:
            case 9:
            case 13:
            case 15:
            case 19:
            case 21:
                return ((C62320sa) this.A01).invoke();
            case 2:
                return this.A01;
            case 5:
            case 6:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return ((Fragment) this.A01).requireParentFragment();
            case 23:
                0lg r6 = (0lg) this.A01;
                0Tu r5 = 0Tu.A05;
                return new C10673Rw8(182.A06(r5, r6, 36315580577025430L), 182.A06(r5, r6, 36315580577156504L), 182.A06(r5, r6, 36315580577090967L), 182.A06(r5, r6, 36315580577222041L));
            case 24:
                return new T7T((UserSession) this.A01);
            case 25:
                return new AnonymousClass58I((UserSession) this.A01);
            case 26:
                0lg r3 = (0lg) this.A01;
                0Tu r2 = 0Tu.A05;
                return new C10777Rxw(182.A01(r2, r3, 36597055552031447L), 182.A01(r2, r3, 36597055552096984L), 182.A01(r2, r3, 36597055552162521L), 182.A06(r2, r3, 2342158589789277584L), 182.A06(r2, r3, 2342158589789343121L), 182.A06(r2, r3, 2342158589789408658L));
            case 27:
                InAppPurchaseControllerCoro inAppPurchaseControllerCoro = (InAppPurchaseControllerCoro) this.A01;
                if (!inAppPurchaseControllerCoro.A0B.A01()) {
                    C8918RFl rFl = C8918RFl.DCP_NOT_ENABLED;
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    SKS.A01("Payments are not enabled", A1H);
                    inAppPurchaseControllerCoro.A0J(rFl, (List) null, A1H);
                    break;
                } else {
                    inAppPurchaseControllerCoro.A06.A00.Cgp((Map) null, (Map) null, "client_load_iap_store_purchases_init");
                    AnonymousClass7TE.A1Z(new MHP(inAppPurchaseControllerCoro, (AnonymousClass4D7) null, 43), inAppPurchaseControllerCoro.A0E);
                    break;
                }
            case 28:
                InAppPurchaseControllerCoro.A0C((InAppPurchaseControllerCoro) this.A01);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                ((C52844Gda) this.A01).setCanvasModel((C59721JVf) null);
                break;
            case 30:
                ((C52706GbJ) this.A01).A01.A00 = null;
                break;
            case 31:
                ((TextInputView) this.A01).A01 = null;
                break;
            case 32:
                WKW wkw = (WKW) this.A01;
                C263624Ms r02 = wkw.A03;
                if (!(r02 == null || (valueOf = Integer.valueOf((int) r02.A0I.A08())) == null || (r0 = wkw.A07) == null)) {
                    r0.invoke(valueOf);
                    break;
                }
            case 33:
                ((WKW) this.A01).A02();
                break;
            case 34:
                ((WKW) this.A01).A01 = null;
                break;
            case 35:
                WKW wkw2 = (WKW) this.A01;
                wkw2.A07 = null;
                wkw2.A0L.A00();
                break;
            case 36:
                ((WKW) this.A01).A06 = null;
                break;
            case 37:
                return new OTP((0lg) this.A01);
            case 38:
                C307786Rm A02 = ((AnonymousClass6NS) this.A01).A02();
                0qQ.A07(A02);
                return A02;
            case 39:
                return new OJO((0lg) this.A01);
            case 40:
                0KC.A0D("proxy_service", "onConnected");
                C11768SgE sgE = (C11768SgE) this.A01;
                ProxyServiceBroadcaster proxyServiceBroadcaster = sgE.A05;
                if (proxyServiceBroadcaster != null) {
                    int i = sgE.A00;
                    int i2 = sgE.A01;
                    String str3 = sgE.A02;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = sgE.A03;
                    if (str4 == null) {
                        str4 = "";
                    }
                    synchronized (proxyServiceBroadcaster) {
                        proxyServiceBroadcaster.proxyAddress = "localhost";
                        proxyServiceBroadcaster.httpProxyPort = i;
                        proxyServiceBroadcaster.socksProxyPort = i2;
                        proxyServiceBroadcaster.clientAddress = str3;
                        proxyServiceBroadcaster.clientRegion = str4;
                        proxyServiceBroadcaster.isProxyMode = true;
                        for (C13715Tfe D5g : proxyServiceBroadcaster.observers) {
                            D5g.D5g(proxyServiceBroadcaster.proxyAddress, proxyServiceBroadcaster.httpProxyPort, proxyServiceBroadcaster.socksProxyPort, proxyServiceBroadcaster.clientAddress);
                        }
                        break;
                    }
                }
                break;
            case Seq.NULL_REFNUM /*41*/:
                str = "proxy_service";
                str2 = "onConnecting";
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                str = "proxy_service";
                str2 = "onExiting";
                break;
            case 43:
                String[] access$importKeys = ((ReadableNativeMap) this.A01).importKeys();
                ReadableNativeMap.jniPassCounter++;
                return access$importKeys;
            case 44:
                ReadableNativeMap readableNativeMap = (ReadableNativeMap) this.A01;
                int length = readableNativeMap.getKeys().length;
                HashMap hashMap = new HashMap(length);
                Object[] access$importValues = readableNativeMap.importValues();
                ReadableNativeMap.jniPassCounter++;
                for (int i3 = 0; i3 < length; i3++) {
                    hashMap.put(readableNativeMap.getKeys()[i3], access$importValues[i3]);
                }
                return hashMap;
            case 45:
                ReadableNativeMap readableNativeMap2 = (ReadableNativeMap) this.A01;
                int length2 = readableNativeMap2.getKeys().length;
                HashMap hashMap2 = new HashMap(length2);
                Object[] access$importTypes = readableNativeMap2.importTypes();
                ReadableNativeMap.jniPassCounter++;
                for (int i4 = 0; i4 < length2; i4++) {
                    String str5 = readableNativeMap2.getKeys()[i4];
                    Object obj = access$importTypes[i4];
                    0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
                    hashMap2.put(str5, obj);
                }
                return hashMap2;
            case 46:
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Could not find the extension ");
                return AnonymousClass7TF.A0i(this.A01, A1A);
            case 47:
                break;
            case 48:
                C52873Ge7 ge7 = (C52873Ge7) this.A01;
                ge7.A04 = null;
                ge7.A03 = null;
                ge7.A00.setEmpty();
                1Tq A002 = C226722hk.A00();
                Drawable drawable = ge7.getDrawable();
                0qQ.A0C(drawable, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
                A002.ECf((C226742hm) drawable);
                break;
            case 49:
                ((RCTextView) this.A01).A04();
                break;
            default:
                return DbY.A0I(this.A01);
        }
        0KC.A0D(str, str2);
        ProxyServiceBroadcaster proxyServiceBroadcaster2 = ((C11768SgE) this.A01).A05;
        if (proxyServiceBroadcaster2 != null) {
            synchronized (proxyServiceBroadcaster2) {
                if (proxyServiceBroadcaster2.isProxyMode) {
                    proxyServiceBroadcaster2.isProxyMode = false;
                    proxyServiceBroadcaster2.proxyAddress = "";
                    proxyServiceBroadcaster2.socksProxyPort = 0;
                    proxyServiceBroadcaster2.httpProxyPort = 0;
                    proxyServiceBroadcaster2.clientAddress = "";
                    proxyServiceBroadcaster2.clientRegion = "";
                    for (C13715Tfe D97 : proxyServiceBroadcaster2.observers) {
                        D97.D97();
                    }
                }
            }
        }
        return C60340gF.A00;
    }
}
