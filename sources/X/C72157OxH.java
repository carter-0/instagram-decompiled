package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OxH  reason: case insensitive filesystem */
public final class C72157OxH implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3022662i A02;
    public final /* synthetic */ AnonymousClass61J A03;
    public final /* synthetic */ boolean A04;

    public C72157OxH(C3022662i r1, AnonymousClass61J r2, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = r2;
    }

    public final void Eyr(AnonymousClass67Z r9) {
        0qQ.A0B(r9, 0);
        C3022662i r6 = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A04;
        C71655Ooa ooa = new C71655Ooa(r9, this.A03, i2, z);
        AnonymousClass68L A0F = C66580MXl.A0F(r6, 0);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0F, ooa);
        C66582MXn.A1E(A0F, new C71677Oow(i, i2, 0, A0J, r6, z), A0J);
    }
}
