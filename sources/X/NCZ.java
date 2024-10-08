package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.calltag.gen.CallTagApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.devicestats.gen.DeviceStatsApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.groupexpansion.msys.gen.GroupExpansionMsysProxy;
import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import java.util.Map;

public final class NCZ extends CallClient {
    public final NCR A00;
    public final OU3 A01;
    public final NCW A02;
    public final NDB A03;
    public final NDI A04;
    public final NDW A05;
    public final NDr A06;
    public final C54023Gy7 A07;
    public final NCu A08;
    public final OZU A09;
    public final String A0A;
    public final AnonymousClass0eM A0B = C73925Pm5.A00(this, 24);
    public final Context A0C;
    public final Mailbox A0D;
    public final AudioModule A0E;
    public final DevXAgentCallConfig A0F;
    public final UserSession A0G;
    public final C70774OKu A0H;
    public final NDM A0I;
    public final NDP A0J;
    public final NDY A0K;
    public final O9Y A0L;
    public final NCn A0M;
    public final OAA A0N;
    public final IGRTCFeatureProvider A0O;
    public final IGRTCSyncedClockHolder A0P;
    public final 0sP A0Q;
    public final 0sL A0R;
    public final boolean A0S;

    public NCZ(Context context, Mailbox mailbox, NDK ndk, AudioModule audioModule, DevXAgentCallConfig devXAgentCallConfig, AR0 ar0, UserSession userSession, C70774OKu oKu, O27 o27, O9Y o9y, NCn nCn, OAA oaa, IGRTCSyncedClockHolder iGRTCSyncedClockHolder, Integer num, String str, 0sP r50, 0sP r51, 0sL r52, boolean z, boolean z2, boolean z3) {
        AR0 ar02 = ar0;
        0qQ.A0B(ar02, 2);
        OAA oaa2 = oaa;
        O9Y o9y2 = o9y;
        IGRTCSyncedClockHolder iGRTCSyncedClockHolder2 = iGRTCSyncedClockHolder;
        C51973G9u.A0u(6, iGRTCSyncedClockHolder2, oaa2, o9y2);
        Integer num2 = num;
        0qQ.A0B(num2, 13);
        String str2 = str;
        this.A0A = str2;
        Context context2 = context;
        this.A0C = context2;
        UserSession userSession2 = userSession;
        this.A0G = userSession2;
        NCn nCn2 = nCn;
        this.A0M = nCn2;
        this.A0P = iGRTCSyncedClockHolder2;
        0sL r3 = r52;
        this.A0R = r3;
        0sP r4 = r50;
        this.A0Q = r4;
        this.A0N = oaa2;
        this.A0L = o9y2;
        this.A0D = mailbox;
        this.A0S = z;
        C70774OKu oKu2 = oKu;
        this.A0H = oKu2;
        AudioModule audioModule2 = audioModule;
        this.A0E = audioModule2;
        DevXAgentCallConfig devXAgentCallConfig2 = devXAgentCallConfig;
        this.A0F = devXAgentCallConfig2;
        0sP r29 = r51;
        NDK ndk2 = ndk;
        0sP r30 = r4;
        0sL r31 = r3;
        Integer num3 = num2;
        String str3 = str2;
        OAA oaa3 = oaa2;
        IGRTCSyncedClockHolder iGRTCSyncedClockHolder3 = iGRTCSyncedClockHolder2;
        O9Y o9y3 = o9y2;
        NCn nCn3 = nCn2;
        C70774OKu oKu3 = oKu2;
        UserSession userSession3 = userSession2;
        AR0 ar03 = ar02;
        DevXAgentCallConfig devXAgentCallConfig3 = devXAgentCallConfig2;
        AudioModule audioModule3 = audioModule2;
        OU3 ou3 = new OU3(context2, ndk2, audioModule3, devXAgentCallConfig3, ar03, userSession3, oKu3, o27, o9y3, nCn3, oaa3, iGRTCSyncedClockHolder3, num3, str3, r29, r30, r31, z2, z3);
        this.A01 = ou3;
        this.A00 = ou3.A09;
        this.A08 = ou3.A0Z;
        this.A0I = ou3.A0I;
        this.A04 = ou3.A0M;
        this.A03 = ou3.A0K;
        this.A0J = ou3.A0N;
        this.A06 = ou3.A0S;
        this.A05 = ou3.A0Q;
        this.A02 = ou3.A0J;
        this.A09 = ou3.A0c;
        this.A0K = ou3.A0R;
        this.A07 = ou3.A0U;
        IGRTCFeatureProvider createFeatureProvider = IGRTCFeatureProvider.CProxy.createFeatureProvider(new C69142NfO(context2, userSession2, ou3));
        0qQ.A07(createFeatureProvider);
        this.A0O = createFeatureProvider;
    }

    public final void onCallEnded(Map map, CallEndedApi callEndedApi) {
        0qQ.A0B(callEndedApi, 1);
        OU3 ou3 = this.A01;
        NDE nde = ou3.A0L;
        MediaStatsApi mediaStatsApi = nde.A00;
        if (mediaStatsApi != null) {
            mediaStatsApi.unregisterListener(nde.A01);
        }
        ou3.A01 = callEndedApi;
    }

    public final void setApi(CallApi callApi) {
        0qQ.A0B(callApi, 0);
        OU3 ou3 = this.A01;
        ou3.A02 = callApi;
        C70774OKu oKu = ou3.A0F;
        String str = ou3.A0f;
        Long l = oKu.A00;
        if (l != null) {
            long longValue = l.longValue();
            if (0qQ.A0K(oKu.A01, str)) {
                oKu.A02.flowMarkPoint(longValue, "client_api_set");
            }
        }
        ou3.A0j.invoke(callApi, new C69140NfL(ou3));
    }

    public final void setCall(Call call) {
        0qQ.A0B(call, 0);
        OU3 ou3 = this.A01;
        OKD okd = new OKD(call.getApis().getApis());
        NCu nCu = ou3.A0Z;
        0qQ.A0B(nCu, 1);
        DeviceStatsApi deviceStatsApi = (DeviceStatsApi) okd.A00(DeviceStatsApi.CONVERTER);
        if (deviceStatsApi != null) {
            deviceStatsApi.setBatteryStatsReader(nCu);
        }
        ou3.A03 = (CallTagApi) okd.A00(CallTagApi.CONVERTER);
        ou3.A00 = (AppstateApi) okd.A00(AppstateApi.CONVERTER);
        ou3.A04 = (HdVideoApi) okd.A00(HdVideoApi.CONVERTER);
        ou3.A0P.A00 = (NetworkTrafficApi) okd.A00(NetworkTrafficApi.CONVERTER);
        TslogApi tslogApi = (TslogApi) okd.A00(TslogApi.CONVERTER);
        if (tslogApi != null) {
            ou3.A0d.setApi(tslogApi);
        }
    }

    public static NCn A00(NCZ ncz) {
        return (NCn) ncz.A0B.getValue();
    }

    public final void A01(boolean z) {
        CryptoApi cryptoApi = this.A01.A0H.A00;
        if (cryptoApi != null) {
            int i = 1;
            if (z) {
                i = 2;
            }
            cryptoApi.setE2eeMode(i);
            return;
        }
        throw AnonymousClass7TE.A0w("Crypto api is used before proxy is ready");
    }

    public final McfReference getAppCallClient() {
        McfReference rawFeatureProvider = this.A0O.getRawFeatureProvider();
        0qQ.A07(rawFeatureProvider);
        return rawFeatureProvider;
    }

    public final AudioProxy getAudio() {
        AudioProxy audioProxy;
        DevXAgentCallConfig devXAgentCallConfig = this.A0F;
        if (devXAgentCallConfig == null || (audioProxy = devXAgentCallConfig.audioProxy) == null) {
            return this.A01.A09;
        }
        return audioProxy;
    }

    public final /* bridge */ /* synthetic */ CameraProxy getCamera() {
        return (CameraProxy) this.A01.A0h.getValue();
    }

    public final CryptoProxy getCrypto() {
        return this.A01.A0H;
    }

    public final GroupExpansionProxy getGroupExpansion() {
        Mailbox mailbox;
        if (!this.A0S || (mailbox = this.A0D) == null) {
            return null;
        }
        if (!182.A06(0Tu.A05, this.A0G, 36315619229961653L)) {
            return null;
        }
        GroupExpansionProxy create = GroupExpansionMsysProxy.CProxy.create(mailbox);
        0qQ.A07(create);
        return new ND2(create);
    }

    public final MediaStatsProxy getMediaStats() {
        return this.A01.A0L;
    }

    public final /* bridge */ /* synthetic */ TslogProxy getTslog() {
        return this.A01.A0d;
    }

    public final /* bridge */ /* synthetic */ VideoRenderProxy getVideoRenderer() {
        return this.A01.A0D;
    }

    public final /* bridge */ /* synthetic */ VideoSubscriptionsProxy getVideoSubscriptions() {
        return this.A01.A0T;
    }
}
