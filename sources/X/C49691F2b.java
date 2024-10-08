package X;

import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Locale;

/* renamed from: X.F2b  reason: case insensitive filesystem */
public final class C49691F2b {
    public TextWatcher A00;
    public EditText A01;
    public AnonymousClass0aP A02;
    public Integer A03;
    public boolean A04 = false;

    public final void A00(G8C g8c, Integer num) {
        String str;
        String str2;
        String str3;
        EditText editText = this.A01;
        if (editText != null && this.A04) {
            0wc A022 = AnonymousClass0kN.A02(this.A02);
            double A012 = DbS.A01();
            String str4 = "";
            if (g8c.B6Y() != null) {
                str = g8c.B6Y().A00;
            } else {
                str = str4;
            }
            String A0t = DbV.A0t();
            0Aj A0e = AnonymousClass7TE.A0e(A022, "reg_field_interacted");
            DbW.A13(A0e, A012);
            DbY.A1D(A0e, A012, DbS.A00());
            switch (this.A03.intValue()) {
                case 0:
                    str2 = "PHONE_FIELD";
                    break;
                case 1:
                    str2 = "EMAIL_FIELD";
                    break;
                case 2:
                    str2 = "FULLNAME_FIELD";
                    break;
                case 3:
                    str2 = "PASSWORD_FIELD";
                    break;
                default:
                    str2 = "USERNAME_FIELD";
                    break;
            }
            Locale locale = Locale.US;
            A0e.AAJ("field_name", str2.toLowerCase(locale));
            if (num.intValue() != 0) {
                str3 = "TAPPED";
            } else {
                str3 = "STARTED_TYPING";
            }
            A0e.AAJ(C66579MXk.A00(341), str3.toLowerCase(locale));
            DbT.A1P(A0e);
            DbW.A12(A0e, DbS.A00());
            C46634DiE BzS = g8c.BzS();
            BzS.getClass();
            DbZ.A1J(A0e, BzS.A01);
            DbS.A1G(A0e, str);
            if (A0t != null) {
                str4 = A0t;
            }
            A0e.AAJ("guid", str4);
            A0e.Cgf();
            this.A04 = false;
            editText.post(new C51243Fqy(this));
        }
    }

    public C49691F2b(EditText editText, AnonymousClass0aP r5, G8C g8c, Integer num) {
        this.A02 = r5;
        this.A03 = num;
        this.A01 = editText;
        FKj fKj = new FKj(5, g8c, this);
        this.A00 = fKj;
        editText.addTextChangedListener(fKj);
        this.A01.setOnTouchListener(new C18899WBr(9, this, g8c));
    }
}
