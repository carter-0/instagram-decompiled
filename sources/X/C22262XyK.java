package X;

import android.content.Context;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.lang.ref.WeakReference;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* renamed from: X.XyK  reason: case insensitive filesystem */
public final class C22262XyK implements ReactInstanceManagerInspectorTarget.TargetDelegate {
    public WeakReference A00;

    public final Map getMetadata() {
        Context context;
        SSW ssw = (SSW) this.A00.get();
        if (ssw != null) {
            context = ssw.A05;
        } else {
            context = null;
        }
        return SKU.A00(context);
    }

    public final void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        if (XYB.A00 == null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Xnv xnv = new Xnv();
            List list = Y1U.A0R;
            List list2 = Y1U.A0Q;
            XZV xzv = new XZV(C21946Xmb.A00);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                proxySelector = new ProxySelector();
            }
            YBQ ybq = YBQ.A00;
            SocketFactory socketFactory = SocketFactory.getDefault();
            TPE tpe = TPE.A00;
            C11358SOu sOu = C11358SOu.A02;
            YBP ybp = YBP.A00;
            XZU xzu = new XZU();
            YBR ybr = YBR.A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            YBP ybp2 = ybp;
            XZV xzv2 = xzv;
            XYB.A00 = new Y1U(proxySelector, list2, A1C, A1C2, list, socketFactory, tpe, ybp, ybp2, sOu, xzu, ybq, xnv, ybr, xzv2, SUS.A02(timeUnit, 10), SUS.A02(TimeUnit.MINUTES, 0), SUS.A02(timeUnit, 10));
        }
        String str2 = str;
        InspectorNetworkRequestListener inspectorNetworkRequestListener2 = inspectorNetworkRequestListener;
        try {
            C21985Xog xog = new C21985Xog();
            xog.A01(str2);
            C21464Xbw A002 = xog.A00();
            Y1U y1u = XYB.A00;
            Y1T y1t = new Y1T(y1u, A002, false);
            y1t.A00 = new C21988Xp1(y1u, y1t);
            y1t.A00(new C22446Y4d(inspectorNetworkRequestListener2));
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener2.onError(002.A0R("Not a valid URL: ", str2));
        }
    }

    public final void onReload() {
        C18773W0w.A01(new C22381Y1k(this));
    }

    public final void onSetPausedInDebuggerMessage(String str) {
        this.A00.get();
    }
}
