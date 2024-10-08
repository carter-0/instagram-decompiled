package X;

/* renamed from: X.NUa  reason: case insensitive filesystem */
public final class C68714NUa extends C66913Mex {
    public final Integer A00;

    public static final void A05(C68714NUa nUa, String str) {
        String str2;
        Integer num = nUa.A00;
        int intValue = num.intValue();
        if (intValue == 0) {
            str2 = "INBOX";
        } else if (intValue == 2 || intValue == 6) {
            str2 = "SETTINGS";
        } else if (intValue == 1) {
            str2 = "REENGAGE_TOAST";
        } else if (intValue == 4) {
            str2 = C69894Ntw.A00(num);
        } else {
            return;
        }
        nUa.A09();
        nUa.A0D("ENTRY_POINT", str2);
        nUa.A0D("RESTORE_REASON", str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68714NUa(02m r1, AnonymousClass65E r2, 0BQ r3, Integer num) {
        super(r1, r2, r3);
        C51972G9s.A1C(r3, r2);
        this.A00 = num;
    }
}
