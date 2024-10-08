package X;

import com.instagram.user.model.User;

/* renamed from: X.FoS  reason: case insensitive filesystem */
public final class C51098FoS implements G87 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C51098FoS(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public final void DfM() {
        if (this.A00 == 0) {
            DbS.A1R(AnonymousClass6Tm.A01, (C277014uI) this.A02, this.A01);
        }
    }

    public final void DfN() {
        if (this.A00 != 0) {
            ((User) this.A01).A1E(true);
            C14631Tzd tzd = (C14631Tzd) this.A02;
            tzd.A0G = true;
            tzd.A0D = true;
            ((C51031FnN) this.A03).A07.Cs5();
        }
    }

    public final void Dox() {
    }

    public final void Doy() {
    }

    public final void Doz() {
        if (this.A00 == 0) {
            DbS.A1R(AnonymousClass6Tm.A01, (C277014uI) this.A03, this.A01);
        }
    }
}
