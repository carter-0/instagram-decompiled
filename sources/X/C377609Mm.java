package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.pando.PandoSubscriptionPrimaryExecutionJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.primaryexecution.analytics.PandoAnalyticsService;
import com.facebook.pando.primaryexecution.cancelledcallbacks.PandoCancelledCallbacksService;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.uigraph.UiGraph;
import com.instagram.graphql.rtgql.graphqlsubscriptions.sdk.IGGraphQLSubscriptionsSDKProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Mm  reason: invalid class name and case insensitive filesystem */
public final class C377609Mm extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377609Mm(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        RealtimeConfigSourceProxy realtimeConfigSourceProxy;
        HybridData initWWWHybrid;
        switch (this.A00) {
            case 0:
                SharedPreferences sharedPreferences = ((Context) this.A01).getSharedPreferences(this.A02, 0);
                0qQ.A07(sharedPreferences);
                return sharedPreferences;
            case 1:
                return ((TreeJNI) this.A01).getOptionalBooleanValue(this.A02);
            case 2:
                return ((TreeJNI) this.A01).getOptionalDoubleValue(this.A02);
            case 3:
                return ((TreeJNI) this.A01).getOptionalIntValue(this.A02);
            case 4:
                return ((TreeJNI) this.A01).getOptionalTimeValue(this.A02);
            case 5:
            case 6:
                return ((TreeJNI) this.A01).getOptionalStringList(this.A02);
            case 9:
                return Boolean.valueOf(((TreeJNI) this.A01).getBooleanValue(this.A02));
            case 10:
            case 11:
                return ((TreeJNI) this.A01).getStringList(this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return Double.valueOf(((TreeJNI) this.A01).getDoubleValue(this.A02));
            case 13:
                String stringValue = ((TreeJNI) this.A01).getStringValue(this.A02);
                0qQ.A0C(stringValue, "null cannot be cast to non-null type kotlin.String");
                return stringValue;
            case 14:
                return Integer.valueOf(((TreeJNI) this.A01).getIntValue(this.A02));
            case 16:
                return Long.valueOf(((TreeJNI) this.A01).getTimeValue(this.A02));
            case 17:
                ((C299665vd) this.A01).DOq(this.A02);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 20:
                ((C299665vd) this.A01).Ds1(this.A02, ((C291785hs) C291755hp.A00.Atj().A01.get(0)).A00.getLanguage());
                break;
            case 19:
                ((C299635va) this.A01).CqA(this.A02);
                break;
            case 21:
                ((C299665vd) this.A01).D8K(this.A02);
                break;
            case 22:
                UiGraph uiGraph = (UiGraph) this.A01;
                Map map = uiGraph.A04;
                String str = this.A02;
                C242593Vc r3 = (C242593Vc) map.get(str);
                if (r3 != null) {
                    List list = r3.A04;
                    synchronized (list) {
                        list.clear();
                        r3.A06.Epw(0);
                    }
                    r3.A05.clear();
                    C242633Vg r2 = r3.A03;
                    C242633Vg.A00(r2, r2, new AnonymousClass9LM(r2, 26));
                    1wY r4 = uiGraph.A01;
                    if (r4 != null) {
                        1wr r32 = r4.A0C;
                        synchronized (r32) {
                            0qQ.A0B(str, 0);
                            018.A17(r32.A00.values(), new C377589Mk(str, 6));
                            018.A17(r32.A01.values(), new C377589Mk(str, 7));
                        }
                        r4.A0B.EEW(str);
                        break;
                    }
                }
                break;
            case 23:
                return AnonymousClass0kN.A01(new 0xG(this.A02), ((C2360032a) this.A01).A00);
            case 24:
                UserSession userSession = (UserSession) this.A01;
                AnonymousClass1aS r5 = 1aD.A01(userSession, this.A02).A02;
                return new AnonymousClass6EZ(new C304566Ea(r5.A0L(new C72118Owd(24)).A0O(AnonymousClass6F9.A00("mailbox_tam_provider")), r5.A0L(new C72118Owd(25)).A0O(AnonymousClass6F9.A00("mailbox_instagram_secure_message_provider")), r5.A0L(new C72118Owd(17)).A0O(AnonymousClass6F9.A00("mailbox_shim_provider")), userSession));
            case 25:
            case 26:
                ((0sP) this.A01).invoke(this.A02);
                break;
            case 27:
                UserSession userSession2 = (UserSession) this.A01;
                String str2 = this.A02;
                0qQ.A0B(userSession2, 0);
                0qQ.A0B(str2, 1);
                AnonymousClass3qZ r0 = RealtimeGraphQLSDKProvider.Companion;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
                0qQ.A07(scheduledThreadPoolExecutor);
                RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider = new RealtimeGraphQLSDKProvider(scheduledThreadPoolExecutor, ((C67451ta) C67451ta.A02.getValue()).A01);
                BaseRequestStreamClient baseRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession2).mClient;
                0qQ.A07(baseRequestStreamClient);
                C2594241q r33 = new C2594241q(userSession2);
                Long A0n = 00y.A0n(10, userSession2.A06);
                if (A0n != null) {
                    j = A0n.longValue();
                } else {
                    j = 0;
                }
                boolean equals = str2.equals("distillery");
                IGGraphQLSubscriptionsSDKProvider.Companion companion = IGGraphQLSubscriptionsSDKProvider.Companion;
                XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
                XAnalyticsAdapterHolder xAnalyticsAdapterHolder2 = new XAnalyticsAdapterHolder(new 0kQ((ImmutableMap) null, userSession2, "IgXAnalyticsAdapter"));
                if (equals) {
                    initWWWHybrid = IGGraphQLSubscriptionsSDKProvider.initDistilleryHybrid(realtimeGraphQLSDKProvider, baseRequestStreamClient, xAnalyticsAdapterHolder2, realtimeConfigSourceProxy, j);
                } else {
                    realtimeConfigSourceProxy = new RealtimeConfigSourceProxy(r33);
                    initWWWHybrid = IGGraphQLSubscriptionsSDKProvider.initWWWHybrid(realtimeGraphQLSDKProvider, baseRequestStreamClient, xAnalyticsAdapterHolder2, realtimeConfigSourceProxy, j);
                }
                return new PandoSubscriptionPrimaryExecutionJNI(new IGGraphQLSubscriptionsSDKProvider(initWWWHybrid), 182.A06(0Tu.A05, userSession2, 36314485363182193L));
            case 28:
                return new PandoPrimaryExecution(PandoAnalyticsService.initHybridData(new PandoPrimaryExecution(PandoCancelledCallbacksService.initHybridData(1vr.A00((0lg) this.A01, this.A02, false))), 3213622));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new AnonymousClass5CR((UserSession) this.A01, this.A02);
            case 30:
                View requireViewById = ((View) this.A01).requireViewById(R.id.first_option_drawable);
                requireViewById.setContentDescription(this.A02);
                return requireViewById;
            case 31:
                TextView textView = (TextView) ((View) this.A01).requireViewById(R.id.first_option);
                textView.setText(this.A02);
                return textView;
            case 32:
                View requireViewById2 = ((View) this.A01).requireViewById(R.id.second_option_drawable);
                requireViewById2.setContentDescription(this.A02);
                return requireViewById2;
            case 33:
                TextView textView2 = (TextView) ((View) this.A01).requireViewById(R.id.second_option);
                textView2.setText(this.A02);
                return textView2;
            default:
                return ((TreeJNI) this.A01).getStringValue(this.A02);
        }
        return C60340gF.A00;
    }
}
