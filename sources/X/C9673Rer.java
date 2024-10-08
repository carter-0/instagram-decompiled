package X;

import com.facebookpay.form.cell.label.LabelCellParams;

/* renamed from: X.Rer  reason: case insensitive filesystem */
public abstract class C9673Rer {
    public static LabelCellParams A00() {
        int i;
        String str;
        C8028QfI qfI = new C8028QfI(16);
        if (C11431STx.A04()) {
            i = 2131966450;
        } else {
            i = 2131954833;
            if (C11431STx.A03()) {
                i = 2131966444;
            }
        }
        qfI.A03 = i;
        boolean A04 = C11431STx.A04();
        SR9 sr9 = new SR9();
        if (A04) {
            sr9.A03("https://www.meta.com/help/315696271061805/");
            sr9.A05 = true;
            sr9.A01 = 2131969211;
            str = "[[learn_more_token]]";
        } else {
            sr9.A03("https://m.facebook.com/payments_terms");
            sr9.A01 = 2131969233;
            str = "[[payment_terms_token]]";
        }
        SR9.A00(qfI, sr9, str);
        return qfI.A00();
    }
}
