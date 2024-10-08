package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Xwe  reason: case insensitive filesystem */
public final class C22173Xwe implements AnonymousClass1N3, AnonymousClass0qK {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public 1DI A03;
    public 1EK A04;
    public NetworkInfoCallback A05;
    public Pair A06 = C61970qY.A03(C62670v5.A0B.A01().A03());
    public final UserSession A07;
    public final Context A08;
    public final HashMap A09 = AnonymousClass7TE.A1E();

    public static final synchronized void A00(NetworkInfoCallback networkInfoCallback, C22173Xwe xwe) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        synchronized (xwe) {
            HashMap hashMap = xwe.A09;
            hashMap.clear();
            if (0qQ.A0K(xwe.A06.first, NetInfoModule.CONNECTION_TYPE_WIFI)) {
                i = 1;
            } else {
                i = 0;
                if (0qQ.A0K(xwe.A06.second, "lte")) {
                    i = 6;
                }
            }
            1EK r0 = xwe.A04;
            Integer num6 = null;
            if (r0 != null) {
                num = Integer.valueOf(r0.A05);
            } else {
                num = null;
            }
            C21341XXi.A00(num, hashMap, C21354XYh.A04, 11);
            1EK r02 = xwe.A04;
            if (r02 != null) {
                num2 = Integer.valueOf(r02.A06);
            } else {
                num2 = null;
            }
            C21341XXi.A00(num2, hashMap, C21354XYh.A05, 12);
            1EK r03 = xwe.A04;
            if (r03 != null) {
                num3 = Integer.valueOf(r03.A08);
            } else {
                num3 = null;
            }
            C21341XXi.A00(num3, hashMap, C21354XYh.A07, 14);
            1EK r04 = xwe.A04;
            if (r04 != null) {
                num4 = Integer.valueOf(r04.A07);
            } else {
                num4 = null;
            }
            C21341XXi.A00(num4, hashMap, C21354XYh.A06, 13);
            1EK r05 = xwe.A04;
            if (r05 != null) {
                num5 = Integer.valueOf(r05.A00);
            } else {
                num5 = null;
            }
            C21341XXi.A00(num5, hashMap, C21354XYh.A00, 15);
            1EK r06 = xwe.A04;
            if (r06 != null) {
                num6 = Integer.valueOf(r06.A04);
            }
            C21341XXi.A00(num6, hashMap, C21354XYh.A02, 8);
            C21341XXi.A00(Integer.valueOf(xwe.A02), hashMap, C21354XYh.A08, 6);
            C21341XXi.A00(Integer.valueOf(xwe.A01), hashMap, C21354XYh.A03, 9);
            C21341XXi.A00(Integer.valueOf(xwe.A00), hashMap, C21354XYh.A01, 10);
            networkInfoCallback.onUpdateRadioSignals(i, hashMap);
        }
    }

    public final void onCellIdentityChanged(1N8 r1) {
    }

    public final synchronized void onCellSignalStrengthChanged(1EK r2) {
        this.A04 = r2;
        NetworkInfoCallback networkInfoCallback = this.A05;
        if (networkInfoCallback != null) {
            A00(networkInfoCallback, this);
        }
    }

    public final synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        NetworkInfoCallback networkInfoCallback;
        Pair A022 = C61970qY.A02(this.A08);
        this.A06 = A022;
        if (!0qQ.A0K((String) A022.first, NetInfoModule.CONNECTION_TYPE_NONE) && (networkInfoCallback = this.A05) != null) {
            A00(networkInfoCallback, this);
        }
    }

    public C22173Xwe(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A08 = context;
        this.A07 = userSession;
    }
}
