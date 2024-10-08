package X;

import android.os.Bundle;
import android.text.TextUtils;

public final class QDA extends 2YL {
    public Bundle A00;
    public final 2Fk A01;
    public final AnonymousClass2gB A02;
    public final AnonymousClass2gB A03;
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final QDE A06;

    public static String A00(QDA qda) {
        String string = qda.A00.getString("PAYMENT_TYPE");
        if (TextUtils.isEmpty(string)) {
            return "fbpay_hub";
        }
        return string;
    }

    public QDA(QDE qde, SIS sis) {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A03 = A0M;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A02 = A0M2;
        this.A06 = qde;
        AnonymousClass2gB A012 = sis.A01();
        this.A01 = A012;
        C11651Sdt.A02(A012, A0M, C11652Sdu.A00(this, 37), 22);
        2Fk[] r3 = {A012, qde.A04, qde.A03, qde.A02};
        C11648Sdq sdq = new C11648Sdq(21, (Object) A0M2, (Object) r3);
        int i = 0;
        do {
            A0M2.A0E(r3[i], sdq);
            i++;
        } while (i < 4);
    }
}
