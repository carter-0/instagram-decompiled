package X;

import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.Du1  reason: case insensitive filesystem */
public final class C47273Du1 extends C69678Nq0 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C47273Du1(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void A00() {
        if (1 - this.A00 != 0) {
            super.A00();
        } else {
            ((C49682F1r) this.A01).A00(this.A02);
        }
    }

    public final void A01() {
        if (this.A00 != 0) {
            ((C49682F1r) this.A01).A00(this.A02);
            return;
        }
        E70 e70 = (E70) this.A01;
        DbT.A0j(e70.getSession()).A03.Eep(false);
        Integer num = e70.A02;
        Integer num2 = AnonymousClass05K.A0C;
        View view = e70.A00;
        if (num == num2) {
            ((CompoundButton) view.requireViewById(R.id.edit_gender_unspecified)).setChecked(true);
            e70.A02 = AnonymousClass05K.A0N;
            IgFormField igFormField = e70.A01;
            if (igFormField != null) {
                igFormField.setVisibility(8);
                0nA.A0N(igFormField);
                return;
            }
            return;
        }
        ((CompoundButton) view.requireViewById(F75.A01(num))).setChecked(true);
    }

    public final void A02() {
        if (1 - this.A00 != 0) {
            super.A02();
        } else {
            ((C49682F1r) this.A01).A00(this.A02);
        }
    }

    public final void A03() {
        if (this.A00 != 0) {
            ((C49682F1r) this.A01).A00(this.A02);
            return;
        }
        E70 e70 = (E70) this.A01;
        DbT.A0j(e70.getSession()).A03.Eep(true);
        E70.A01(e70, this.A02);
        DbX.A1J(e70);
    }

    public final void A04(Throwable th) {
        if (1 - this.A00 != 0) {
            super.A04(th);
        } else {
            ((C49682F1r) this.A01).A00(this.A02);
        }
    }
}
