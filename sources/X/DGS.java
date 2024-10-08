package X;

public final class DGS implements AnonymousClass2hV {
    public static final DGS A00 = new DGS();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr A03;
        C250663lr A02;
        C250663lr r5 = (C250663lr) obj;
        if (r5 == null || (A03 = r5.A03(C42872Bks.class, "payment_pin_update(data:$input)", 1365850279)) == null || (A02 = A03.A02(C42871Bkr.class, "authentication_ticket", -1899007378)) == null) {
            return null;
        }
        try {
            QSW qsw = (QSW) A02.A01(QSW.class, -1563793709);
            if (qsw != null) {
                return C9655ReZ.A00(qsw);
            }
            return null;
        } catch (ClassNotFoundException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
