package X;

import android.content.Intent;

/* renamed from: X.5DZ  reason: invalid class name */
public final class AnonymousClass5DZ implements C282425Da {
    public Integer A00 = null;
    public final Intent A01;
    public final C241903Rv A02;

    public final boolean CeN() {
        Integer A012 = this.A02.A01(this.A01.getPackage());
        this.A00 = A012;
        return AnonymousClass05K.A05.equals(A012);
    }

    public final boolean CeP() {
        Integer A012 = this.A02.A01(C241903Rv.A00(this.A01));
        this.A00 = A012;
        return AnonymousClass05K.A05.equals(A012);
    }

    public AnonymousClass5DZ(Intent intent, C241903Rv r3) {
        this.A02 = r3;
        this.A01 = intent;
    }

    public final void FMy() {
        if (!CeN()) {
            Integer num = this.A00;
            if (num == null) {
                num = AnonymousClass05K.A06;
            }
            throw new C241863Rp(002.A0R("Invalid package ", this.A01.getPackage()), num);
        }
    }
}
