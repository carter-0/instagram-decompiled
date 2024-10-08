package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Sl0  reason: case insensitive filesystem */
public final class C12039Sl0 implements C13919TlL, C13550TcM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C12039Sl0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            0qQ.A0B(th, 0);
            if (th instanceof TRR) {
                String str = ((TRR) th).A00;
                new SHK((C327287Ae) this.A02, (C327307Ag) this.A01, str).A00(new C18981WFi(this.A03, 3));
                return;
            }
            return;
        }
        ((C13550TcM) this.A02).onError(th);
    }

    public final void onSuccess() {
        if (this.A00 == 0) {
            ((SHK) this.A01).A00.AOa((C13919TlL) this.A02, ((LiveLocationSession) this.A03).A02);
        }
    }
}
