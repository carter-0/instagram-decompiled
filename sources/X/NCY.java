package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import java.util.Map;

public final class NCY extends CallClient {
    public C70405O5i A00;
    public final C73540PeW A01;
    public final NCS A02;
    public final CallContext A03;
    public final NCm A04;
    public final String A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A04, new C73912Pln(this, 4));
    public final C62320sa A07;
    public final 0sP A08;

    public final CryptoProxy getCrypto() {
        return null;
    }

    public final GroupExpansionProxy getGroupExpansion() {
        return null;
    }

    public final MediaStatsProxy getMediaStats() {
        return null;
    }

    public final TslogProxy getTslog() {
        return null;
    }

    public final VideoRenderProxy getVideoRenderer() {
        return null;
    }

    public final VideoSubscriptionsProxy getVideoSubscriptions() {
        return null;
    }

    public final void onCallEnded(Map map, CallEndedApi callEndedApi) {
    }

    public final void setApi(CallApi callApi) {
        0qQ.A0B(callApi, 0);
        callApi.setAppModelListener(new C68365NCe(this));
    }

    public final void setCall(Call call) {
        0qQ.A0B(call, 0);
        this.A00 = new C70405O5i(call.getApis().getApis());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.NCm] */
    public /* synthetic */ NCY(NCS ncs, CallContext callContext, String str, C62320sa r7) {
        ? obj = new Object();
        C73995PnM pnM = C73995PnM.A00;
        DbW.A1O(str, 1, pnM);
        this.A05 = str;
        this.A03 = callContext;
        this.A02 = ncs;
        this.A04 = obj;
        this.A07 = r7;
        this.A08 = pnM;
        this.A01 = OYW.A00(str);
    }

    public final CallApi A00() {
        C70405O5i o5i = this.A00;
        if (o5i != null) {
            CallApi callApi = (CallApi) o5i.A00.A00(CallApi.CONVERTER);
            if (callApi != null) {
                return callApi;
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public final McfReference getAppCallClient() {
        return (McfReference) this.A06.getValue();
    }

    public final AudioProxy getAudio() {
        return this.A02;
    }

    public final CameraProxy getCamera() {
        return this.A04;
    }
}
