package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;

/* renamed from: X.WFw  reason: case insensitive filesystem */
public final class C18995WFw implements C13847TiP {
    public ViewStub A00;
    public ViewStub A01;
    public X9X A02;
    public C340027ka A03;
    public C340037kb A04;

    public final void AJB(boolean z, int i, int i2, int i3, int i4) {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.AJB(z, i, i2, i3, 8);
        }
    }

    public final void CMu() {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.CMu();
        }
    }

    public final void Cnb() {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.Cnb();
        }
    }

    public final void Dvv(String str) {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.Dvv(str);
        }
    }

    public final void EVZ(int i) {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.EuU(i);
        }
    }

    public final void Egj(Intent intent, String str, int i) {
        X9X x9x = (X9X) JTP.A0H(this.A00, i);
        this.A02 = x9x;
        if (intent != null) {
            x9x.setIntent(intent);
        }
        X9X x9x2 = this.A02;
        x9x2.setControllers(this.A03, this.A04);
        x9x2.CMp();
        X9X x9x3 = this.A02;
        if (!(x9x3 == null || str == null || !str.equals("watch_and_browse"))) {
            Pxf.A1B((View) x9x3, -16777216);
        }
        ((View) this.A02).bringToFront();
    }

    public final boolean EvO() {
        X9X x9x = this.A02;
        if (x9x == null) {
            return false;
        }
        return x9x.EvO();
    }

    public final int getHeightPx() {
        X9X x9x = this.A02;
        if (x9x == null) {
            return 0;
        }
        return x9x.getHeightPx();
    }

    public final void setProgress(int i) {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.setProgress(i);
        }
    }

    public final void setProgressBarVisibility(int i) {
        X9X x9x = this.A02;
        if (x9x != null) {
            x9x.setProgressBarVisibility(i);
        }
    }
}
