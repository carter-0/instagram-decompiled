package X;

import com.facebook.msys.mci.AccountSession;

/* renamed from: X.Oo0  reason: case insensitive filesystem */
public final class C71620Oo0 implements AnonymousClass68J {
    public final AccountSession A00;
    public final AnonymousClass66a A01;
    public final boolean A02;

    public final AnonymousClass68L ASa(int i) {
        if (this.A02) {
            AnonymousClass66a r2 = this.A01;
            AnonymousClass68L ASa = new C3023662u(this.A00).ASa(i);
            0qQ.A07(ASa);
            return new C71621Oo1(ASa, r2);
        }
        AnonymousClass68L ASa2 = new C3023662u(this.A00).ASa(i);
        0qQ.A0A(ASa2);
        return ASa2;
    }

    public C71620Oo0(AccountSession accountSession, AnonymousClass66a r2, boolean z) {
        this.A01 = r2;
        this.A00 = accountSession;
        this.A02 = z;
    }
}
