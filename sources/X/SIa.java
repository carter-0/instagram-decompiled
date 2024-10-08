package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class SIa {
    public final SRZ A00;
    public final ST2 A01;
    public final Map A02 = AnonymousClass7TE.A1E();
    public final RealtimeSinceBootClock A03;
    public final C13986Tnc A04;
    public final C13262TSd A05;

    public static void A00(C11026S6d s6d, SIa sIa) {
        boolean z;
        C8889REg rEg;
        RFZ rfz = s6d.A04;
        int i = s6d.A01;
        ST3 st3 = s6d.A03;
        String name = rfz.name();
        Integer valueOf = Integer.valueOf(i);
        Map map = sIa.A02;
        synchronized (map) {
            if (map.get(valueOf) == s6d) {
                map.remove(valueOf);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            sIa.A00.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, s6d.A05, (Throwable) null, 1, i, i, st3.A0V);
        } else {
            0KC.A0P("MqttOperationManager", "operation/timeout/duplicate; id=%d, operation=%s, client=%s", new Object[]{valueOf, name, st3});
        }
        s6d.A00();
        boolean equals = rfz.equals(RFZ.PINGRESP);
        if (equals || rfz.equals(RFZ.PUBACK)) {
            TimeoutException timeoutException = new TimeoutException();
            if (equals) {
                rEg = C8889REg.PING;
            } else {
                rEg = C8889REg.PUBLISH;
            }
            synchronized (st3) {
                C8947RGw rGw = C8947RGw.OPERATION_TIMEOUT;
                EnumSet enumSet = ST3.A0c;
                if (st3.A04()) {
                    st3.A0J.submit(new C13052TJi(st3, rEg, rGw, timeoutException));
                }
            }
        }
    }

    public SIa(RealtimeSinceBootClock realtimeSinceBootClock, SRZ srz, ST2 st2, C13986Tnc tnc, C13262TSd tSd) {
        this.A04 = tnc;
        this.A05 = tSd;
        this.A00 = srz;
        this.A01 = st2;
        this.A03 = realtimeSinceBootClock;
    }

    public final C11026S6d A01(ST3 st3, C13775Tgq tgq, RFZ rfz, String str, int i, int i2) {
        C11026S6d s6d;
        C11026S6d s6d2 = new C11026S6d(st3, rfz, str, i, SystemClock.elapsedRealtime());
        Map map = this.A02;
        synchronized (map) {
            s6d = (C11026S6d) map.put(Integer.valueOf(s6d2.A01), s6d2);
        }
        if (s6d != null) {
            s6d.A00();
            0KC.A0O("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", new Object[]{Integer.valueOf(s6d.A01), s6d.A04.name()});
        }
        C13262TSd tSd = this.A05;
        TGM tgm = new TGM(s6d2, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C7871Qbv qbv = new C7871Qbv(tSd, (Object) null, tgm);
        Pxj.A1G(qbv, tSd, timeUnit, (long) i2);
        S9L.A01(DbW.A1a(s6d2.A06));
        s6d2.A06 = qbv;
        C13775Tgq tgq2 = tgq;
        tgq2.getClass();
        S9L.A01(DbW.A1a(s6d2.A07));
        s6d2.A07 = tgq2;
        return s6d2;
    }

    public final C11026S6d A02(ST3 st3, RFZ rfz, String str, int i, int i2) {
        C11026S6d s6d;
        C11026S6d s6d2 = new C11026S6d(st3, rfz, str, i, SystemClock.elapsedRealtime());
        Map map = this.A02;
        synchronized (map) {
            s6d = (C11026S6d) map.put(Integer.valueOf(s6d2.A01), s6d2);
        }
        if (s6d != null) {
            s6d.A00();
            0KC.A0O("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", new Object[]{Integer.valueOf(s6d.A01), s6d.A04.name()});
        }
        C13262TSd tSd = this.A05;
        TGL tgl = new TGL(s6d2, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C7871Qbv qbv = new C7871Qbv(tSd, (Object) null, tgl);
        Pxj.A1G(qbv, tSd, timeUnit, (long) i2);
        S9L.A01(DbW.A1a(s6d2.A06));
        s6d2.A06 = qbv;
        return s6d2;
    }
}
