package X;

import com.facebookpay.form.cell.label.LabelCellParams;

/* renamed from: X.S9k  reason: case insensitive filesystem */
public abstract /* synthetic */ class C11089S9k {
    public static LabelCellParams A00(int i) {
        C8028QfI qfI = new C8028QfI(16);
        qfI.A03 = i;
        SR9 sr9 = new SR9();
        sr9.A03("https://www.facebook.com/privacy/explanation/");
        sr9.A01 = 2131961272;
        SR9.A00(qfI, sr9, "[[data_terms_token]]");
        qfI.A04 = 0;
        return qfI.A00();
    }

    public static LabelCellParams A01(int i, int i2, int i3, int i4) {
        String str;
        C8028QfI qfI = new C8028QfI(16);
        qfI.A03 = i;
        qfI.A04 = i2;
        qfI.A05 = i3;
        qfI.A01 = i4;
        boolean A04 = C11431STx.A04();
        SR9 sr9 = new SR9();
        if (A04) {
            sr9.A03("https://www.meta.com/help/315696271061805/");
            sr9.A05 = true;
            sr9.A01 = 2131961273;
            str = "[[learn_more_token]]";
        } else {
            sr9.A03("https://www.facebook.com/payments_terms/");
            sr9.A01 = 2131961369;
            SR9.A00(qfI, sr9, "[[payment_terms_token]]");
            sr9 = new SR9();
            sr9.A03("https://www.facebook.com/privacy/explanation/");
            sr9.A01 = 2131961368;
            str = "[[data_terms_token]]";
        }
        SR9.A00(qfI, sr9, str);
        return qfI.A00();
    }
}
