package X;

import com.instagram.user.model.User;

/* renamed from: X.Fne  reason: case insensitive filesystem */
public final class C51048Fne implements G8B {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C51048Fne(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final void CyN() {
    }

    public final void D5S() {
        if (this.A00 != 0) {
            ((C51031FnN) this.A03).A06.A00((C14631Tzd) this.A01, ((User) this.A02).CPV());
        }
    }

    public final void DED() {
        if (this.A00 == 0) {
            DbZ.A1V((C307896Rx) this.A01, this.A02);
        }
    }

    public final void Doy() {
    }

    public final void onCancel() {
    }

    public final void onSuccess() {
        if (this.A00 == 0) {
            DbZ.A1V((C307896Rx) this.A01, this.A03);
        }
    }
}
