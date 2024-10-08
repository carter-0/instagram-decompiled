package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.networktraffic.gen.HttpStats;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonobserver.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.TigonRequestSucceeded;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Qbg  reason: case insensitive filesystem */
public final class C7856Qbg extends NetworkTrafficProxy implements 1I2 {
    public NetworkTrafficApi A00;
    public final AtomicBoolean A01 = JTQ.A0k();

    public final void CuU(TigonRequestAdded tigonRequestAdded) {
    }

    public final void E0Q(TigonRequestErrored tigonRequestErrored) {
    }

    private final void A00(TigonError tigonError, TigonRequestSucceeded tigonRequestSucceeded) {
        C239923Iu summary;
        C239883Iq r0;
        TigonRequest submittedRequest;
        long j;
        long j2;
        long j3;
        long j4;
        String str;
        int i;
        String str2;
        Long A10;
        Long A102;
        Long A103;
        Long A104;
        if (this.A01.get() && (summary = tigonRequestSucceeded.summary()) != null && (r0 = (C239883Iq) summary.BLk(C239953Iy.A04)) != null) {
            Map map = r0.A01;
            if (!map.isEmpty() && (submittedRequest = tigonRequestSucceeded.submittedRequest()) != null) {
                AnonymousClass1S0 r02 = C64641Rz.A05;
                0qQ.A08(r02);
                1Rt r2 = (1Rt) submittedRequest.getLayerInformation(r02);
                String A11 = DbT.A11(AnonymousClass000.A00(3884), map);
                if (A11 == null || (A104 = AnonymousClass7TE.A10(A11)) == null) {
                    j = 0;
                } else {
                    j = A104.longValue();
                }
                String A112 = DbT.A11(TraceFieldType.ReqBodySize, map);
                if (A112 == null || (A103 = AnonymousClass7TE.A10(A112)) == null) {
                    j2 = 0;
                } else {
                    j2 = A103.longValue();
                }
                String A113 = DbT.A11(AnonymousClass000.A00(3891), map);
                if (A113 == null || (A102 = AnonymousClass7TE.A10(A113)) == null) {
                    j3 = 0;
                } else {
                    j3 = A102.longValue();
                }
                String A114 = DbT.A11(AnonymousClass000.A00(3889), map);
                if (A114 == null || (A10 = AnonymousClass7TE.A10(A114)) == null) {
                    j4 = 0;
                } else {
                    j4 = A10.longValue();
                }
                String A19 = AnonymousClass7TE.A19(DbV.A18(submittedRequest.url(), "?"), 0);
                String A115 = DbT.A11("request_friendly_name", map);
                if (A115 == null) {
                    A115 = "";
                }
                AnonymousClass1S0 r03 = C64641Rz.A01;
                0qQ.A08(r03);
                FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) submittedRequest.getLayerInformation(r03);
                if (facebookLoggingRequestInfo == null) {
                    str = "";
                } else {
                    str = facebookLoggingRequestInfo.mCallerClass;
                    0qQ.A07(str);
                }
                int i2 = submittedRequest.requestCategory().A00;
                AnonymousClass9IM response = tigonRequestSucceeded.response();
                if (response != null) {
                    i = response.A00;
                } else {
                    i = -1;
                }
                String method = submittedRequest.method();
                String str3 = null;
                TigonError tigonError2 = tigonError;
                if (tigonError != null) {
                    str2 = tigonError2.analyticsDetail;
                } else {
                    str2 = null;
                }
                if (r2 != null) {
                    str3 = DbT.A11("surface", Pxf.A0x(r2.A00));
                }
                HttpStats httpStats = new HttpStats(j, j2, j3, j4, A19, A115, str, i2, i, method, str2, "", str3);
                NetworkTrafficApi networkTrafficApi = this.A00;
                if (networkTrafficApi != null) {
                    networkTrafficApi.onHttpEventComplete(tigonRequestSucceeded.requestId(), httpStats);
                }
            }
        }
    }

    public final void DBG(TigonRequestSucceeded tigonRequestSucceeded) {
        if (tigonRequestSucceeded != null) {
            A00((TigonError) null, tigonRequestSucceeded);
        }
    }

    public final void DCk(TigonRequestErrored tigonRequestErrored) {
        if (tigonRequestErrored != null) {
            A00(tigonRequestErrored.error(), tigonRequestErrored);
        }
    }

    public final void Df8(TigonRequestResponse tigonRequestResponse) {
        NetworkTrafficApi networkTrafficApi;
        if (tigonRequestResponse != null && (networkTrafficApi = this.A00) != null) {
            networkTrafficApi.onHttpEventResponse(tigonRequestResponse.requestId());
        }
    }

    public final void Dml(TigonRequestStarted tigonRequestStarted) {
        NetworkTrafficApi networkTrafficApi;
        if (tigonRequestStarted != null && (networkTrafficApi = this.A00) != null) {
            networkTrafficApi.onHttpEventStart(tigonRequestStarted.requestId());
        }
    }

    public final void onCallEnd() {
        this.A01.set(false);
    }

    public final void onCallStart() {
        this.A01.set(true);
        if (this.A00 != null) {
            1IC.A01.add(this);
        }
    }
}
