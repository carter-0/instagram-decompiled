package X;

import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import java.util.List;

/* renamed from: X.Qfr  reason: case insensitive filesystem */
public final class C8046Qfr extends C8029QfJ {
    public int A00;
    public List A01;
    public boolean A02;

    public final TextCellParams A01() {
        super.A01();
        return new CardCellParams(this);
    }
}
