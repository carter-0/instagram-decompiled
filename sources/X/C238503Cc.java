package X;

/* renamed from: X.3Cc  reason: invalid class name and case insensitive filesystem */
public final class C238503Cc extends 1Vf {
    public final /* synthetic */ AnonymousClass3CV A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238503Cc(C251983oI r1, AnonymousClass3CV r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C255423u6 r5 = (C255423u6) obj;
        r4.ADh(1, r5.A01);
        Long l = r5.A00;
        if (l == null) {
            r4.ADb(2);
        } else {
            r4.ADa(2, l.longValue());
        }
    }
}
