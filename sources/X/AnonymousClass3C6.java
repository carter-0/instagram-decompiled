package X;

/* renamed from: X.3C6  reason: invalid class name */
public final class AnonymousClass3C6 extends 1Vf {
    public final /* synthetic */ AnonymousClass3C5 A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3C6(C251983oI r1, AnonymousClass3C5 r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r3, Object obj) {
        C10351Rqo rqo = (C10351Rqo) obj;
        r3.ADh(1, rqo.A01);
        byte[] A01 = C255323tw.A01(rqo.A00);
        if (A01 == null) {
            r3.ADb(2);
        } else {
            r3.ADU(2, A01);
        }
    }
}
