package X;

public final class NUZ extends C66913Mex {
    public final 0BQ A00;

    public final void A0H(Integer num, boolean z, boolean z2) {
        String str;
        String str2;
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "INBOX";
        } else if (intValue == 2 || intValue == 6) {
            str = "SETTINGS";
        } else {
            return;
        }
        if (z) {
            str2 = "V2";
        } else {
            str2 = "V1";
        }
        A0D("VERSION", str2);
        A0D("IS_FROM_OMNISTORE", AnonymousClass7TF.A0k(String.valueOf(z2)));
        A0D("ENTRY_POINT", str);
        A0D("LOGGED_IN_ACCOUNTS", String.valueOf(this.A00.BNv()));
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NUZ(02m r1, AnonymousClass65E r2, 0BQ r3) {
        super(r1, r2, r3);
        AnonymousClass7TG.A1Q(r3, r2);
        this.A00 = r3;
    }
}
