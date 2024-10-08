package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IUj  reason: case insensitive filesystem */
public final class C57248IUj implements C242803Vz, C266944ab, AnonymousClass3W0 {
    public WeakReference A00;
    public boolean A01;
    public int A02 = -1;
    public C266954ac A03 = C266954ac.NONE;

    public final C266954ac BDD() {
        return this.A03;
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final boolean CdP() {
        return C51969G9p.A1a(this.A03, C266954ac.NONE);
    }

    public final int getPosition() {
        boolean z = false;
        if (this.A02 >= 0) {
            z = true;
        }
        17k.A0G(z, "Position is not set.");
        return this.A02;
    }

    public final void A00(int i) {
        11Z.A00();
        this.A02 = i;
    }

    public final void EZ9(C266954ac r1) {
        this.A03 = r1;
    }
}
