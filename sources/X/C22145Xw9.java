package X;

import com.facebook.proxygen.ProxygenRadioMeter;

/* renamed from: X.Xw9  reason: case insensitive filesystem */
public final class C22145Xw9 implements AnonymousClass0C5 {
    public final ProxygenRadioMeter A00;

    public final boolean Bx8(0Uy r7) {
        ProxygenRadioMeter.Metrics snapshot = this.A00.getSnapshot();
        r7.A04 = (int) (snapshot.mqttActiveRadioTimeMs / 1000);
        r7.A05 = (int) (snapshot.mqttTailRadioTimeMs / 1000);
        r7.A0D = snapshot.mqttUpBytes;
        r7.A0C = snapshot.mqttDownBytes;
        r7.A06 = snapshot.mqttRequestCount;
        r7.A07 = snapshot.mqttWakeupCount;
        r7.A00 = (int) (snapshot.httpActiveRadioTimeMs / 1000);
        r7.A01 = (int) (snapshot.httpTailRadioTimeMs / 1000);
        r7.A0B = snapshot.httpUpBytes;
        r7.A0A = snapshot.httpDownBytes;
        r7.A02 = snapshot.httpRequestCount;
        r7.A03 = snapshot.httpWakeupCount;
        r7.A08 = (int) (snapshot.totalActiveRadioTimeMs / 1000);
        r7.A09 = (int) (snapshot.totalTailRadioTimeMs / 1000);
        return true;
    }

    public C22145Xw9(ProxygenRadioMeter proxygenRadioMeter) {
        this.A00 = proxygenRadioMeter;
    }
}
