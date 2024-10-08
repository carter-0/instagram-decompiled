package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3wo  reason: invalid class name and case insensitive filesystem */
public final class C257073wo implements C250813m6 {
    public List A00 = new ArrayList();
    public final C257093wq A01 = new C257083wp(this);
    public final boolean A02;

    public final void Czk(C257113ws r3, C257263x7 r4, int i, boolean z) {
        if (this.A02) {
            for (C250823m7 Czk : this.A00) {
                Czk.Czk(r3, r4, i, z);
            }
            return;
        }
        synchronized (this) {
            for (C250813m6 Czk2 : this.A00) {
                Czk2.Czk(r3, r4, i, z);
            }
        }
    }

    public final void DFs(C257183wz r11, long j, long j2, long j3) {
        for (C250813m6 DFs : this.A00) {
            DFs.DFs(r11, j, j2, j3);
        }
    }

    public final void DFt(long j, long j2) {
        for (C250813m6 DFt : this.A00) {
            DFt.DFt(j, j2);
        }
    }

    public final void DtW() {
        for (C250813m6 DtW : this.A00) {
            DtW.DtW();
        }
    }

    public final void DtX(C257113ws r3, C257263x7 r4, boolean z) {
        if (this.A02) {
            for (C250823m7 DtX : this.A00) {
                DtX.DtX(r3, r4, z);
            }
            return;
        }
        synchronized (this) {
            for (C250813m6 DtX2 : this.A00) {
                DtX2.DtX(r3, r4, z);
            }
        }
    }

    public final void DtY(IOException iOException) {
        if (this.A02) {
            for (C250813m6 DtY : this.A00) {
                DtY.DtY(iOException);
            }
            return;
        }
        synchronized (this) {
            for (C250813m6 DtY2 : this.A00) {
                DtY2.DtY(iOException);
            }
        }
    }

    public final void Dtb(String str, Object obj) {
        for (C250833m8 Dtb : this.A00) {
            Dtb.Dtb(str, obj);
        }
    }

    public final void Dtd(C257183wz r3, C257263x7 r4) {
        for (C250813m6 Dtd : this.A00) {
            Dtd.Dtd(r3, r4);
        }
    }

    public final void Dtf(C257113ws r3, C257263x7 r4, boolean z, boolean z2) {
        if (this.A02) {
            for (C250823m7 Dtf : this.A00) {
                Dtf.Dtf(r3, r4, z, z2);
            }
            return;
        }
        synchronized (this) {
            for (C250813m6 Dtf2 : this.A00) {
                Dtf2.Dtf(r3, r4, z, z2);
            }
        }
    }

    public final void EUi(String str) {
        for (C250813m6 EUi : this.A00) {
            EUi.EUi(str);
        }
    }

    public C257073wo(boolean z) {
        this.A02 = z;
    }
}
