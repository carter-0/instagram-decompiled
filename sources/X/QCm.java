package X;

public final class QCm extends AnonymousClass2gB {
    public C10818Rye A00;
    public Throwable A01;

    public static void A00(QCm qCm) {
        C10818Rye rye = qCm.A00;
        if (rye != null) {
            rye.A02 = null;
            if (qCm.A01 != null) {
                int i = 0;
                if (rye.A08.isEmpty()) {
                    i = Integer.MAX_VALUE;
                }
                Throwable th = qCm.A01;
                if (th instanceof C13224TQp) {
                    int A06 = C51966G9m.A06(qCm.A00.A08);
                    int i2 = ((C13224TQp) th).A00;
                    if (A06 > i2) {
                        i = i2;
                    } else if (!qCm.A00.A08.isEmpty()) {
                        i = C51966G9m.A06(qCm.A00.A08);
                    }
                }
                if (qCm.A00.A08.size() > i) {
                    C10818Rye rye2 = qCm.A00;
                    rye2.A02 = AnonymousClass7TE.A19(rye2.A08, i);
                }
            }
            qCm.A0A(qCm.A00);
        }
    }
}
