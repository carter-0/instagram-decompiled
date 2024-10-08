package com.facebook.react.devsupport;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11358SOu;
import X.C21464Xbw;
import X.C21946Xmb;
import X.C21985Xog;
import X.C21988Xp1;
import X.C22447Y4e;
import X.C51973G9u;
import X.C9113RPk;
import X.SBQ;
import X.SUS;
import X.TPE;
import X.XRO;
import X.XZU;
import X.XZV;
import X.Xnv;
import X.Xo0;
import X.Y1E;
import X.Y1T;
import X.Y1U;
import X.Y7C;
import X.YBP;
import X.YBQ;
import X.YBR;
import android.os.Handler;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public abstract class CxxInspectorPackagerConnection {
    public final HybridData mHybridData;

    public class DelegateImpl {
        public final Handler mHandler;
        public final Y1U mHttpClient;

        public DelegateImpl() {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Xnv xnv = new Xnv();
            List list = Y1U.A0R;
            List list2 = Y1U.A0Q;
            XZV xzv = new XZV(C21946Xmb.A00);
            ProxySelector proxySelector = ProxySelector.getDefault();
            proxySelector = proxySelector == null ? new ProxySelector() : proxySelector;
            YBQ ybq = YBQ.A00;
            SocketFactory socketFactory = SocketFactory.getDefault();
            TPE tpe = TPE.A00;
            C11358SOu sOu = C11358SOu.A02;
            YBP ybp = YBP.A00;
            XZU xzu = new XZU();
            YBR ybr = YBR.A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.mHttpClient = new Y1U(proxySelector, list2, A1C, A1C2, list, socketFactory, tpe, ybp, ybp, sOu, xzu, ybq, xnv, ybr, xzv, SUS.A02(timeUnit, 10), SUS.A02(TimeUnit.MINUTES, 0), SUS.A02(timeUnit, 10));
            this.mHandler = AnonymousClass7TF.A0D();
        }

        public Y1E connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            C21985Xog xog = new C21985Xog();
            xog.A01(str);
            C21464Xbw A00 = xog.A00();
            Y1U y1u = this.mHttpClient;
            Y7C y7c = new Y7C(this, webSocketDelegate);
            List list = Xo0.A0M;
            Random random = new Random();
            int i = y1u.A02;
            Xo0 xo0 = new Xo0(random, A00, y7c, (long) i);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Xnv xnv = y1u.A0J;
            Proxy proxy = y1u.A05;
            List list2 = y1u.A07;
            A1C.addAll(y1u.A08);
            A1C2.addAll(y1u.A09);
            ProxySelector proxySelector = y1u.A06;
            YBQ ybq = y1u.A0I;
            SocketFactory socketFactory = y1u.A0B;
            SSLSocketFactory sSLSocketFactory = y1u.A0D;
            C9113RPk rPk = y1u.A0M;
            HostnameVerifier hostnameVerifier = y1u.A0C;
            C11358SOu sOu = y1u.A0G;
            YBP ybp = y1u.A0F;
            YBP ybp2 = y1u.A0E;
            XZU xzu = y1u.A0H;
            YBR ybr = y1u.A0K;
            boolean z = y1u.A0O;
            boolean z2 = y1u.A0N;
            boolean z3 = y1u.A0P;
            int i2 = y1u.A00;
            int i3 = y1u.A01;
            int i4 = y1u.A03;
            int i5 = y1u.A04;
            XZV xzv = new XZV(C21946Xmb.A00);
            ArrayList A1D = AnonymousClass7TE.A1D(Xo0.A0M);
            XRO xro = XRO.H2_PRIOR_KNOWLEDGE;
            if (!A1D.contains(xro) && !A1D.contains(XRO.HTTP_1_1)) {
                throw C51973G9u.A0g(A1D, "protocols must contain h2_prior_knowledge or http/1.1: ", AnonymousClass7TE.A1A());
            } else if (A1D.contains(xro) && A1D.size() > 1) {
                throw C51973G9u.A0g(A1D, "protocols containing h2_prior_knowledge cannot use other protocols: ", AnonymousClass7TE.A1A());
            } else if (A1D.contains(XRO.HTTP_1_0)) {
                throw C51973G9u.A0g(A1D, "protocols must not contain http/1.0: ", AnonymousClass7TE.A1A());
            } else if (!A1D.contains((Object) null)) {
                A1D.remove(XRO.SPDY_3);
                int i6 = i5;
                boolean z4 = z2;
                boolean z5 = z;
                boolean z6 = z3;
                Y1U y1u2 = new Y1U(proxy, proxySelector, list2, A1C, A1C2, Collections.unmodifiableList(A1D), socketFactory, hostnameVerifier, sSLSocketFactory, ybp2, ybp, sOu, xzu, ybq, xnv, ybr, xzv, rPk, i2, i3, i, i4, i6, z4, z5, z6);
                C21985Xog xog2 = new C21985Xog(xo0.A0K);
                xog2.A02("Upgrade", "websocket");
                xog2.A02("Connection", "Upgrade");
                xog2.A02("Sec-WebSocket-Key", xo0.A0G);
                xog2.A02("Sec-WebSocket-Version", "13");
                C21464Xbw A002 = xog2.A00();
                Y1T y1t = new Y1T(y1u2, A002, true);
                y1t.A00 = new C21988Xp1(y1u2, y1t);
                xo0.A07 = y1t;
                y1t.A00(new C22447Y4e(A002, xo0));
                return new Y1E(this, xo0);
            } else {
                throw AnonymousClass7TE.A0w("protocols must not contain null");
            }
        }

        public void scheduleCallback(Runnable runnable, long j) {
            this.mHandler.postDelayed(runnable, j);
        }
    }

    public class WebSocketDelegate implements Closeable {
        public final HybridData mHybridData;

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);

        public void close() {
            this.mHybridData.resetNative();
        }

        public WebSocketDelegate(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    public static native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    public native void closeQuietly();

    public native void connect();

    public native void sendEventToAllConnections(String str);

    static {
        SBQ.A00();
    }
}
