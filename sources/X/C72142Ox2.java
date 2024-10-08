package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Ox2  reason: case insensitive filesystem */
public final /* synthetic */ class C72142Ox2 implements AnonymousClass67Q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ NAC A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C72142Ox2(NAC nac, String str, long j, long j2) {
        this.A02 = nac;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void Eyr(AnonymousClass67Z r10) {
        NAC nac = this.A02;
        String str = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        MYb mYb = MYb.A0M;
        Long valueOf = Long.valueOf(j);
        C71722Opg A002 = C71722Opg.A00(r10, 61);
        AnonymousClass68L A0F = C66580MXl.A0F(nac, 0);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0F, A002);
        C66582MXn.A1E(A0F, new C71656Oob(nac, A0J, valueOf, str, j2), A0J);
    }
}
