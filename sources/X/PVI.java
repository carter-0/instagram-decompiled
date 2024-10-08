package X;

import java.util.List;

public final class PVI implements Runnable {
    public final /* synthetic */ C67741Mtu A00;

    public PVI(C67741Mtu mtu) {
        this.A00 = mtu;
    }

    public final void run() {
        C67741Mtu mtu = this.A00;
        if (mtu.A01()) {
            C45208CsL csL = mtu.A01;
            if (csL != null) {
                if (!csL.A00.isEmpty()) {
                    int i = mtu.A00;
                    C45208CsL csL2 = mtu.A01;
                    if (csL2 != null) {
                        if (i >= csL2.A00.size()) {
                            mtu.A00 = 0;
                        }
                        05G r4 = mtu.A04;
                        C68175N3q n3q = (C68175N3q) r4.getValue();
                        C45208CsL csL3 = mtu.A01;
                        if (csL3 != null) {
                            List list = csL3.A00;
                            int i2 = mtu.A00;
                            mtu.A00 = i2 + 1;
                            HMC hmc = n3q.A01;
                            boolean z = n3q.A05;
                            String str = n3q.A03;
                            String str2 = n3q.A02;
                            boolean z2 = n3q.A06;
                            String str3 = n3q.A04;
                            DbY.A1S(hmc, str);
                            r4.Epw(new C68175N3q((C45274Ctd) list.get(i2), hmc, str, str2, str3, z, z2));
                        }
                    }
                }
                mtu.A02.postDelayed(this, 4000);
                return;
            }
            0qQ.A0F("randomizedGhostPrompts");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
