package com.instagram.rtc.rsys.tslog;

import X.0Tu;
import X.0qQ;
import X.182;
import X.1DI;
import X.1EK;
import X.1N8;
import X.AnonymousClass0qK;
import X.AnonymousClass1D8;
import X.AnonymousClass1N3;
import X.C21456XbK;
import X.C276174sn;
import X.C276214sr;
import X.C61940qJ;
import X.C61970qY;
import X.C62670v5;
import X.DbZ;
import android.content.Context;
import android.net.NetworkInfo;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.common.session.UserSession;

public final class IgRadioTsLoggerEngine implements AnonymousClass1N3, AnonymousClass0qK {
    public final Context appContext;
    public final 1DI cellInfoProvider;
    public final C21456XbK counters;
    public final long kOffset;
    public final C276214sr wifiInfoProvider;

    public IgRadioTsLoggerEngine(Context context, UserSession userSession, TslogStreamApi tslogStreamApi, boolean z, boolean z2) {
        1DI r0;
        DbZ.A0t(1, context, userSession, tslogStreamApi);
        this.appContext = context;
        this.kOffset = 182.A01(0Tu.A05, userSession, 36604825147937901L);
        C276214sr r1 = null;
        if (z) {
            r0 = AnonymousClass1D8.A00();
        } else {
            r0 = null;
        }
        this.cellInfoProvider = r0;
        this.wifiInfoProvider = z2 ? C276174sn.A00(context) : r1;
        this.counters = new C21456XbK(tslogStreamApi, this);
    }

    public void onCellIdentityChanged(1N8 r1) {
    }

    public void onCellSignalStrengthChanged(1EK r4) {
        0qQ.A0B(r4, 0);
        C21456XbK xbK = this.counters;
        synchronized (xbK) {
            xbK.A01 = r4;
            xbK.A08.addSample(1);
        }
    }

    public void onConnectionChanged(NetworkInfo networkInfo) {
        C21456XbK xbK = this.counters;
        synchronized (xbK) {
            xbK.A01 = null;
            xbK.A00 = C61970qY.A02(xbK.A0C.appContext);
        }
    }

    public final void start() {
        1DI r0 = this.cellInfoProvider;
        if (r0 != null) {
            r0.A0d(this);
        }
        C62670v5.A0B.A03(this);
    }

    public final void stop() {
        1DI r0 = this.cellInfoProvider;
        if (r0 != null) {
            r0.A0K.remove(this);
        }
        C61940qJ.A00(this);
    }

    public final C21456XbK getCounters() {
        return this.counters;
    }
}
