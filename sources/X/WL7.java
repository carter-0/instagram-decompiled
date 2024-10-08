package X;

import java.util.Iterator;

public final class WL7 implements C20888X2s, X6A {
    public C21046XBn A00;
    public int A01 = 1;
    public int A02 = 0;
    public final C18436Vrf A03 = new C18436Vrf();
    public final C18436Vrf A04 = new C18436Vrf();
    public final VR5 A05 = new Object();

    public final C17617Vb9 A00(X69 x69, C17617Vb9 vb9) {
        this.A01++;
        C17617Vb9 vb92 = new C17617Vb9(x69, this, vb9);
        if (vb92.A01 == null) {
            vb92.A01 = new C18731VzA(vb92.A03, vb92.A05);
        }
        WM2.A00(C18436Vrf.A00(this.A04), vb92.A05);
        return vb92;
    }

    public final void A71(C20889X2t x2t, C21046XBn xBn, Object obj) {
        VR5 vr5;
        VV4 vv4;
        this.A02++;
        x2t.accept(obj);
        C18436Vrf vrf = this.A03;
        WM2 wm2 = vrf.A01;
        vrf.A00 = wm2;
        Iterator it = wm2.iterator();
        while (it.hasNext()) {
            C17419VUy vUy = (C17419VUy) it.next();
            C19106WLn wLn = vUy.A02;
            if (wLn.A00 != null && wLn.A01.CVj(obj)) {
                C18436Vrf.A00(vUy.A01.A00.A04.A03).A00.remove(vUy);
                wLn.A00 = null;
                vUy.A00.DBa(obj);
            }
        }
        while (true) {
            int i = this.A02 - 1;
            this.A02 = i;
            if (i != 0 || (vv4 = vr5.A00) == null) {
                vrf.A00 = vrf.A01;
            } else {
                this.A02 = 1;
                VV4 vv42 = vv4.A00;
                (vr5 = this.A05).A00 = vv42;
                if (vv42 == null) {
                    vr5.A01 = null;
                }
                ((Runnable) vv4.A01).run();
            }
        }
        vrf.A00 = vrf.A01;
    }

    public final void APd(Object obj) {
        this.A00.APd(obj);
    }

    public final void D5h(C21046XBn xBn) {
        this.A00 = xBn;
    }
}
