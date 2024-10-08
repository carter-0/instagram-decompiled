package com.instagram.analytics.traffic;

import X.0Aj;
import X.0qQ;
import X.0wc;
import X.14i;
import X.1DI;
import X.1Wr;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0lh;
import X.AnonymousClass0qK;
import X.AnonymousClass1D8;
import X.C268634dj;
import X.C268704dr;
import X.C61110lV;
import X.C61940qJ;
import X.C61970qY;
import X.MMK;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class IGNetworkStateLogger implements C61110lV, AnonymousClass0lh, AnonymousClass0qK {
    public String A00;
    public C268704dr A01;
    public final Context A02;
    public final C268634dj A03;
    public final 0wc A04;
    public final UserSession A05;
    public final 1DI cellDiagnostics;

    public final synchronized void A00() {
        C268704dr r0;
        if (!14i.A08()) {
            Context context = this.A02;
            if (1Wr.isLocationEnabled(context)) {
                String str = null;
                if (1Wr.isLocationPermitted(context, (UserSession) null, "NETWORK_STATE_LOGGER")) {
                    0wc r3 = this.A04;
                    0Aj A002 = r3.A00(r3.A00, "mobile_network_change_unified");
                    Pair A022 = C61970qY.A02(context);
                    String str2 = null;
                    if (0qQ.A0K(A022.first, "mobile")) {
                        HashMap hashMap = new HashMap();
                        AnonymousClass1D8.A00().A0f(hashMap);
                        str = (String) hashMap.get("network_params");
                    }
                    C268634dj r1 = this.A03;
                    synchronized (r1) {
                        r0 = r1.A00.latestSessionId;
                    }
                    this.A01 = r0;
                    if (r0 != null) {
                        str2 = r0.A00();
                    }
                    A002.A9F("weight", 1L);
                    A002.AAJ("connection_subtype", (String) A022.second);
                    A002.AAJ("connection_type", (String) A022.first);
                    String str3 = this.A00;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A002.AAJ("app_network_change_id", str3);
                    if (str2 == null) {
                        str2 = "";
                    }
                    A002.AAJ("app_net_session_id", str2);
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("network_params", str);
                    A002.Cgf();
                }
            }
        }
    }

    public final synchronized void onAppBackgrounded() {
        AnonymousClass0fD.A0A(1679812350, AnonymousClass0fD.A03(1672749439));
    }

    public final synchronized void onAppForegrounded() {
        String updateAndGetLocationId;
        synchronized (this) {
            int A032 = AnonymousClass0fD.A03(-762898488);
            C268634dj r1 = this.A03;
            synchronized (r1) {
                updateAndGetLocationId = r1.A00.updateAndGetLocationId();
            }
            this.A00 = updateAndGetLocationId;
            A00();
            AnonymousClass0fD.A0A(-203265884, A032);
        }
    }

    public final synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        String updateAndGetLocationId;
        synchronized (this) {
            C268634dj r1 = this.A03;
            synchronized (r1) {
                updateAndGetLocationId = r1.A00.updateAndGetLocationId();
            }
            this.A00 = updateAndGetLocationId;
            A00();
        }
    }

    public final synchronized void onSessionWillEnd() {
        14i.A06(this);
        C61940qJ.A00(this);
    }

    public IGNetworkStateLogger(UserSession userSession) {
        this.A05 = userSession;
        this.A02 = userSession.A03.A06();
        this.A04 = AnonymousClass0kN.A02(userSession);
        1DI A002 = AnonymousClass1D8.A00();
        0qQ.A07(A002);
        this.cellDiagnostics = A002;
        this.A03 = (C268634dj) userSession.A01(C268634dj.class, new MMK(userSession, 19));
    }
}
