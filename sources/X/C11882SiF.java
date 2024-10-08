package X;

import java.io.File;
import java.util.List;

/* renamed from: X.SiF  reason: case insensitive filesystem */
public final class C11882SiF implements C13692TfA, C13695TfD {
    public int A00;
    public List A01;
    public int A02 = -1;
    public C13892TjF A03;
    public File A04;
    public final C13766Tge A05;
    public final S77 A06;
    public final List A07;
    public volatile C10528Rth A08;

    public final void D7o(Object obj) {
        this.A05.D7m(this.A03, this.A03, this.A08.A01, AnonymousClass05K.A0C, obj);
    }

    public final void DOG(Exception exc) {
        this.A05.D7l(this.A03, this.A08.A01, exc, AnonymousClass05K.A0C);
    }

    public final boolean ExI() {
        while (true) {
            List list = this.A01;
            if (list == null || this.A00 >= list.size()) {
                int i = this.A02 + 1;
                this.A02 = i;
                List list2 = this.A07;
                if (i >= list2.size()) {
                    return false;
                }
                C13892TjF tjF = (C13892TjF) list2.get(this.A02);
                S77 s77 = this.A06;
                File AXD = s77.A07.A00().AXD(new C11854Shg(tjF, s77.A04));
                this.A04 = AXD;
                if (AXD != null) {
                    this.A03 = tjF;
                    this.A01 = C13882Tj5.A00(s77).A02(AXD);
                    this.A00 = 0;
                }
            } else {
                this.A08 = null;
                while (this.A00 < this.A01.size()) {
                    List list3 = this.A01;
                    int i2 = this.A00;
                    this.A00 = i2 + 1;
                    File file = this.A04;
                    S77 s772 = this.A06;
                    this.A08 = ((C13698TfG) list3.get(i2)).AEZ(s772.A05, file, s772.A01, s772.A00);
                    if (this.A08 != null && s772.A01(this.A08.A01.AvH()) != null) {
                        this.A08.A01.CgB(s772.A03, this);
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public final void cancel() {
        C10528Rth rth = this.A08;
        if (rth != null) {
            rth.A01.cancel();
        }
    }

    public C11882SiF(C13766Tge tge, S77 s77, List list) {
        this.A07 = list;
        this.A06 = s77;
        this.A05 = tge;
    }
}
