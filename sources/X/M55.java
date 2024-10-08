package X;

import com.instagram.realtimeclient.RealtimeClientManager;

public final class M55 implements Runnable {
    public final /* synthetic */ M0X A00;

    public M55(M0X m0x) {
        this.A00 = m0x;
    }

    public final void run() {
        M0X m0x = this.A00;
        if (m0x.A0G) {
            1Ln A03 = M0X.A03(m0x, AnonymousClass05K.A0j);
            A03.A0Q(C273654mx.A00(344), Long.valueOf(G9t.A0k(RealtimeClientManager.getInstance(m0x.A0P).isMqttConnected() ? 1 : 0)));
            long j = m0x.A05 + 1;
            m0x.A05 = j;
            A03.A0Q(AnonymousClass000.A00(814), Long.valueOf(j));
            A03.Cgf();
            if (m0x.A0b.get() > 0 && !m0x.A0H) {
                m0x.A0H = true;
            }
        }
        m0x.A0L.postDelayed(this, 10000);
    }
}
