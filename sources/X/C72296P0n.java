package X;

import android.content.Context;

/* renamed from: X.P0n  reason: case insensitive filesystem */
public final class C72296P0n implements C74311Psn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ NK5 A01;
    public final /* synthetic */ AnonymousClass2Ep A02;
    public final /* synthetic */ String A03;

    public final void FKB(ODT odt) {
        int i = odt.A00;
        int i2 = odt.A01;
        NK5 nk5 = this.A01;
        nk5.A00 = true;
        if (i == -1 || !odt.A02) {
            C66671Mae.A08(AnonymousClass7TE.A0l(nk5.A07), this.A02.AiM(), this.A03, 5, false, false);
        } else {
            C66671Mae.A0H(AnonymousClass7TE.A0l(nk5.A07), Integer.valueOf(i2), this.A03, 5, i);
        }
        DbX.A14(this.A00, AnonymousClass37D.A00);
    }

    public C72296P0n(Context context, NK5 nk5, AnonymousClass2Ep r3, String str) {
        this.A01 = nk5;
        this.A03 = str;
        this.A02 = r3;
        this.A00 = context;
    }
}
