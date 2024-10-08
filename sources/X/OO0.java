package X;

import java.util.List;

public abstract class OO0 {
    public String A00 = "";
    public final 0mM A01;
    public final C74452Pv7 A02;
    public final AnonymousClass4D6 A03;

    public void A00(1XP r6, String str) {
        0sn r1;
        String str2;
        if (this instanceof C68747NVh) {
            C68747NVh nVh = (C68747NVh) this;
            C74452Pv7 pv7 = nVh.A01;
            List E1w = pv7.E1w(r6, C62564Khu.GIPHY_STICKERS, str);
            List E1w2 = pv7.E1w(r6, C62564Khu.GIPHY_GIFS, str);
            C68482NJz nJz = nVh.A00;
            OO7 oo7 = nJz.A0D;
            if (oo7 == null) {
                str2 = "stickerItemController";
            } else {
                oo7.A03(E1w);
                OO7 oo72 = nJz.A0C;
                if (oo72 == null) {
                    str2 = "gifItemController";
                } else {
                    oo72.A03(E1w2);
                    C68482NJz.A01(nJz, E1w.isEmpty(), E1w2.isEmpty());
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C68746NVg) {
            C68746NVg nVg = (C68746NVg) this;
            C74452Pv7 pv72 = nVg.A00;
            List E1w3 = pv72.E1w(r6, C62564Khu.GIPHY_STICKERS, str);
            if (!(pv72 instanceof C65267LqM) || !(r6 instanceof C61293K1g)) {
                r1 = null;
            } else {
                C61293K1g k1g = (C61293K1g) r6;
                0qQ.A0B(k1g, 0);
                r1 = k1g.A01.A01;
                if (r1 == null) {
                    r1 = 0sn.A00;
                }
            }
            nVg.A01.Doj(E1w3, r1, str);
        } else {
            C68745NVf nVf = (C68745NVf) this;
            C74452Pv7 pv73 = nVf.A01;
            nVf.A00.Doi(pv73.E1w(r6, C62564Khu.GIPHY_GIFS, str), pv73.E1v(r6));
        }
    }

    public void A01(C268654dm r4, String str) {
        String str2;
        if (this instanceof C68747NVh) {
            C68482NJz nJz = ((C68747NVh) this).A00;
            OO7 oo7 = nJz.A0D;
            if (oo7 == null) {
                str2 = "stickerItemController";
            } else {
                boolean A05 = oo7.A05();
                OO7 oo72 = nJz.A0C;
                if (oo72 == null) {
                    str2 = "gifItemController";
                } else {
                    C68482NJz.A01(nJz, A05, oo72.A05());
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C68746NVg) {
            ((C68746NVg) this).A01.DEF(r4, str);
        } else {
            ((C68745NVf) this).A00.onFail(r4);
        }
    }

    public void A02(String str) {
        String str2;
        if (this instanceof C68747NVh) {
            C68482NJz nJz = ((C68747NVh) this).A00;
            OO7 oo7 = nJz.A0D;
            if (oo7 == null) {
                str2 = "stickerItemController";
            } else {
                oo7.A00();
                OO7 oo72 = nJz.A0C;
                if (oo72 == null) {
                    str2 = "gifItemController";
                } else {
                    oo72.A00();
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C68746NVg) {
            ((C68746NVg) this).A01.DmM(str);
        } else {
            ((C68745NVf) this).A00.onStart();
        }
    }

    public final void A03(String str) {
        0mM r4 = this.A01;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        r4.A01(Dba.A0c(str, length, i));
    }

    public final void A04(String str) {
        if (0qQ.A0K(this.A00, "") || !0qQ.A0K(this.A00, str)) {
            this.A00 = str;
            1OC AEX = this.A02.AEX((AnonymousClass1O9) null, str);
            AEX.A00 = new C15612Ufe(str, this, 4);
            this.A03.schedule(AEX);
        }
    }

    public OO0(AnonymousClass4D6 r6, C74452Pv7 pv7, boolean z) {
        this.A03 = r6;
        this.A02 = pv7;
        0mM r0 = new 0mM(AnonymousClass7TF.A0D(), new C72255OzQ(this, 2), 300);
        r0.A03 = z;
        this.A01 = r0;
    }
}
