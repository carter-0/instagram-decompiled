package X;

import java.util.List;

/* renamed from: X.9W5  reason: invalid class name */
public final class AnonymousClass9W5 implements C344737sL {
    public final List A00;

    public final boolean CKm() {
        return true;
    }

    public final void CMa(C344567s4 r3) {
        0qQ.A0B(r3, 0);
        for (C344747sM CMa : this.A00) {
            CMa.CMa(r3);
        }
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    public final void EEx(C344697sH r3, Long l) {
        0qQ.A0B(r3, 0);
        for (C344737sL EEx : this.A00) {
            EEx.EEx(r3, l);
        }
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
        for (C344737sL FMh : this.A00) {
            FMh.FMh(i, obj);
        }
    }

    public final void ACn(C345897uG r3) {
        for (C344747sM ACn : this.A00) {
            ACn.ACn(r3);
        }
    }

    public final int AlC() {
        int i = 0;
        for (C344737sL AlC : this.A00) {
            i |= AlC.AlC();
        }
        return i;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        for (C344737sL FLA : this.A00) {
            FLA.FLA(i, i2, i3, z, i4, i5);
        }
    }

    public final void detach() {
        for (C344747sM detach : this.A00) {
            detach.detach();
        }
    }

    public final void release() {
        for (C344747sM release : this.A00) {
            release.release();
        }
    }

    public AnonymousClass9W5(List list) {
        this.A00 = list;
    }
}
