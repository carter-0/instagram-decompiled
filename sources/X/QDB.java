package X;

import com.facebookpay.logging.FBPayLoggerData;

public final class QDB extends 2YL {
    public FBPayLoggerData A00;
    public C8272QnE A01;
    public QD1 A02;
    public C8269QnB A03;
    public boolean A04 = false;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass2gO A06 = new C11651Sdt(this, 11);
    public final 2FO A07;

    public static boolean A00(QDB qdb) {
        if (qdb.A03.A03.A02() != null && AnonymousClass7TE.A1a(qdb.A03.A03.A02())) {
            return true;
        }
        if (qdb.A01.A03.A02() != null && AnonymousClass7TE.A1a(qdb.A01.A03.A02())) {
            return true;
        }
        QD1 qd1 = qdb.A02;
        if (qd1 == null || qd1.A01.A02() == null || !AnonymousClass7TE.A1a(qdb.A02.A01.A02())) {
            return false;
        }
        return true;
    }

    public QDB(2FO r3) {
        this.A07 = r3;
    }
}
