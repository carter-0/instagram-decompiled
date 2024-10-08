package com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer;

import X.002;
import X.0KC;
import X.0Tu;
import X.0cp;
import X.182;
import X.1GK;
import X.1OC;
import X.1Pq;
import X.A7G;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9D0;
import X.C10380RrH;
import X.C10494Rt9;
import X.C10536Rtq;
import X.C10537Rtr;
import X.C13887TjA;
import X.C51968G9o;
import X.C66069MAc;
import X.C8764R8p;
import X.C9225RUc;
import X.C9228RUf;
import X.DbS;
import X.DbT;
import X.DbY;
import X.Pxf;
import X.RLO;
import X.S78;
import X.XUO;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.util.clickid.BloomFilter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IGPixelRequestBuffer implements C13887TjA {
    public static final String TAG = "IgPixelRequestBuffer";
    public static final String URL_PREFIX = "facebook.com";
    public WebResourceResponse mResponse;
    public UserSession mUserSession;

    public /* synthetic */ boolean shouldBuffer(WebResourceRequest webResourceRequest) {
        return C9225RUc.A00(webResourceRequest, this);
    }

    private void updateResponse(WebResourceResponse webResourceResponse) {
        this.mResponse = webResourceResponse;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.0bY] */
    public WebResourceResponse handleRequest(WebResourceRequest webResourceRequest, S78 s78, C10380RrH rrH) {
        boolean z;
        Uri A00;
        C10537Rtr A04;
        String str;
        String queryParameter;
        UserSession userSession = this.mUserSession;
        String A0c = Pxf.A0c(webResourceRequest);
        1Pq A0S = Pxf.A0S();
        if (!182.A06(0Tu.A05, userSession, 36327924311407414L) || rrH.A01) {
            z = false;
        } else {
            Uri url = webResourceRequest.getUrl();
            C10536Rtq rtq = rrH.A00;
            z = false;
            if (!(rtq == null || (queryParameter = url.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null)) {
                try {
                    long parseLong = Long.parseLong(queryParameter);
                    XUO xuo = BloomFilter.Companion;
                    z = !new BloomFilter(BloomFilter.initHybrid0(rtq.A01, rtq.A00, rtq.A02)).contains(parseLong);
                } catch (NumberFormatException e) {
                    0KC.A0F("IGBufferedRequest", "Failed to parse pixel id", e);
                }
            }
        }
        if (z && (A00 = 0cp.A00(new Object(), A0c)) != null && A00.getQueryParameter("fbc") == null && (str = A04.A01) != null && !str.isEmpty()) {
            Long l = (A04 = s78.A04(S78.A03(webResourceRequest, true))).A00;
            if (l == null || l.longValue() == 0) {
                l = C51968G9o.A0u();
            }
            String A0u = 002.A0u("fb.1.", l.toString(), ".", str);
            Uri.Builder buildUpon = A00.buildUpon();
            buildUpon.appendQueryParameter("fbc", A0u);
            A0c = Pxf.A0b(buildUpon);
            maybeCallTrListeners(A0c);
        }
        A0S.A02(A0c);
        A0S.A01(AnonymousClass05K.A0N);
        A0S.A05 = true;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0u2 = AnonymousClass7TF.A0u(webResourceRequest.getRequestHeaders());
        while (A0u2.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u2);
            Pxf.A1M(DbT.A13(A1J), DbS.A0s(A1J), A1C);
        }
        List list = A0S.A06;
        list.clear();
        list.addAll(A1C);
        1OC A01 = AnonymousClass9D0.A01(1GK.A06.A00(new C66069MAc(A0S, 0), 528676151, 2, false, true), "IGBufferedRequest", A0c);
        try {
            A01.A00 = new C8764R8p((Object) this, 0);
            A01.run();
        } catch (Exception e2) {
            0KC.A0F(TAG, "Request failed", e2);
            this.mResponse = C9228RUf.A00("Not Found", e2.toString(), 404);
        }
        return C9228RUf.A00("OK", "", 200);
    }

    public void maybeCallTrListeners(String str) {
        UserSession userSession = this.mUserSession;
        0Tu r4 = 0Tu.A05;
        if (DbY.A1Y(r4, userSession, 36327924311276340L)) {
            C10494Rt9 rt9 = new C10494Rt9(this.mUserSession);
            if (182.A06(r4, rt9.A00, 36322963624045262L)) {
                for (A7G a7g : rt9.A01) {
                    Iterator it = a7g.A04.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public IGPixelRequestBuffer(Context context, Bundle bundle) {
        this.mUserSession = DbS.A0U(bundle);
    }

    private boolean isTrRequest(WebResourceRequest webResourceRequest) {
        String method = webResourceRequest.getMethod();
        Uri url = webResourceRequest.getUrl();
        String host = url.getHost();
        String path = url.getPath();
        if (host == null || path == null || !method.equals("GET")) {
            return false;
        }
        if (!host.equalsIgnoreCase(URL_PREFIX) && !host.toLowerCase().endsWith(".facebook.com")) {
            return false;
        }
        if (path.equals("/tr") || path.equals("/tr/")) {
            return true;
        }
        return false;
    }

    private WebResourceResponse handleRequest(RLO rlo) {
        try {
            throw AnonymousClass7TE.A11("getIgHttpRequest");
        } catch (Exception e) {
            0KC.A0F(TAG, "Request failed", e);
            this.mResponse = C9228RUf.A00("Not Found", e.toString(), 404);
            return C9228RUf.A00("OK", "", 200);
        }
    }
}
