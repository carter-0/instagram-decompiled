package X;

import android.content.Context;
import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import com.facebook.rsys.networkinfo.gen.NetworkInfoProxy;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class XNW extends NetworkInfoProxy {
    public C22173Xwe A00;
    public final Context A01;
    public final UserSession A02;

    public final void start(NetworkInfoCallback networkInfoCallback) {
        int i;
        Number number;
        Number number2;
        Number number3;
        int i2;
        Number number4;
        Number number5;
        Number number6;
        0qQ.A0B(networkInfoCallback, 0);
        C22173Xwe xwe = new C22173Xwe(this.A01, this.A02);
        this.A00 = xwe;
        if (182.A06(0Tu.A05, xwe.A07, 36328890678918819L)) {
            1DI r0 = xwe.A03;
            if (r0 != null) {
                r0.A0K.remove(xwe);
            }
            C61940qJ.A00(xwe);
            xwe.A05 = null;
            xwe.A05 = networkInfoCallback;
            1DI A002 = AnonymousClass1D8.A00();
            A002.A0d(xwe);
            xwe.A03 = A002;
            xwe.A04 = (1EK) A002.A0O.get();
            C62670v5.A0B.A03(xwe);
            HashMap A1E = AnonymousClass7TE.A1E();
            int i3 = 0;
            int i4 = -1;
            try {
                1DI r02 = xwe.A03;
                if (r02 != null) {
                    r02.A0e(A1E);
                }
            } catch (RuntimeException e) {
                0KC.A0F("IgNetworkInfoProxyImpl", "Radio signals: error loading cellInfoProvider", e);
            } catch (Throwable th) {
                Object obj = A1E.get("upstream_bandwidth_kbps");
                if (!(obj instanceof Integer) || (number6 = (Number) obj) == null) {
                    i2 = -1;
                } else {
                    i2 = number6.intValue();
                }
                xwe.A02 = i2;
                Object obj2 = A1E.get("is_congested");
                if ((obj2 instanceof Integer) && (number5 = (Number) obj2) != null) {
                    i3 = number5.intValue();
                }
                xwe.A01 = i3;
                Object obj3 = A1E.get("data_saver");
                if ((obj3 instanceof Integer) && (number4 = (Number) obj3) != null) {
                    i4 = number4.intValue();
                }
                xwe.A00 = i4;
                throw th;
            }
            Object obj4 = A1E.get("upstream_bandwidth_kbps");
            if (!(obj4 instanceof Integer) || (number3 = (Number) obj4) == null) {
                i = -1;
            } else {
                i = number3.intValue();
            }
            xwe.A02 = i;
            Object obj5 = A1E.get("is_congested");
            if ((obj5 instanceof Integer) && (number2 = (Number) obj5) != null) {
                i3 = number2.intValue();
            }
            xwe.A01 = i3;
            Object obj6 = A1E.get("data_saver");
            if ((obj6 instanceof Integer) && (number = (Number) obj6) != null) {
                i4 = number.intValue();
            }
            xwe.A00 = i4;
            C22173Xwe.A00(networkInfoCallback, xwe);
        }
    }

    public final void stop() {
        C22173Xwe xwe = this.A00;
        if (xwe != null) {
            1DI r0 = xwe.A03;
            if (r0 != null) {
                r0.A0K.remove(xwe);
            }
            C61940qJ.A00(xwe);
            xwe.A05 = null;
            this.A00 = null;
        }
    }

    public XNW(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }
}
