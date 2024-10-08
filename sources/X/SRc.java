package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.util.TextFieldHandler;

public abstract class SRc {
    public C11231SGq A00;
    public FormCellLoggingEvents A01;
    public final int A02;
    public final int A03;
    public final SparseArray A04;
    public final AnonymousClass2gB A05;
    public final AnonymousClass2Fj A06;
    public final AnonymousClass2Fj A07;
    public final boolean A08;
    public final boolean A09;

    public SRc(int i, boolean z, boolean z2) {
        this((FormCellLoggingEvents) null, 0, i, z, z2);
    }

    public void A0E() {
    }

    public static Object A0A(SRc sRc) {
        return sRc.A05.A02();
    }

    public 2Fk A0C() {
        return this.A06;
    }

    public SRc A0D(int i) {
        if (this.A02 == i) {
            return this;
        }
        return null;
    }

    public void A0F(C11231SGq sGq) {
        this.A00 = sGq;
    }

    public void A0G(boolean z) {
        if (this instanceof C8041Qfl) {
            C8041Qfl qfl = (C8041Qfl) this;
            if (z && !qfl.A0K()) {
                JTP.A1B(qfl.A0A, true);
            }
            JTP.A1B(qfl.A06, !qfl.A0K());
        }
    }

    public void A0H(boolean z) {
        JTP.A1B(this.A07, z);
    }

    public boolean A0I() {
        if (this instanceof C8032Qfc) {
            return C51969G9p.A1a(this.A04.get(this.A02), A0A(this));
        }
        if (this instanceof C8041Qfl) {
            C8041Qfl qfl = (C8041Qfl) this;
            if (qfl.A0O) {
                CharSequence charSequence = (CharSequence) A0A(qfl);
                if (charSequence == null || charSequence.length() == 0) {
                    return false;
                }
                return true;
            }
            TextFieldHandler textFieldHandler = qfl.A0J;
            boolean A1V = AnonymousClass7TF.A1V(textFieldHandler);
            Object obj = qfl.A04.get(qfl.A02);
            if (A1V) {
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                return textFieldHandler.CJv((String) obj, (String) A0A(qfl));
            }
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            if (!0qQ.A0K(obj, A0A(qfl))) {
                return true;
            }
            return false;
        } else if (this instanceof C8035Qff) {
            Object obj2 = this.A04.get(this.A02);
            DbS.A1Y(obj2);
            return C51966G9m.A1a(obj2, A0A(this));
        } else if (this instanceof C8037Qfh) {
            return C51969G9p.A1a(this.A04.get(this.A02), A0A(this));
        } else {
            if (this instanceof C8040Qfk) {
                return C51969G9p.A1a(this.A04.get(this.A02), A0A(this));
            }
            return false;
        }
    }

    public boolean A0J() {
        CharSequence charSequence;
        if (!(this instanceof C8041Qfl) || (charSequence = (CharSequence) A0A(this)) == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public boolean A0K() {
        if (!(this instanceof C8041Qfl)) {
            return true;
        }
        C8041Qfl qfl = (C8041Qfl) this;
        if (!qfl.A09 || !qfl.A08) {
            return true;
        }
        String str = (String) A0A(qfl);
        C249803kO A0J = C66580MXl.A0J(qfl.A00);
        while (A0J.hasNext()) {
            if (!((S4U) A0J.next()).A01(str)) {
                return false;
            }
        }
        return true;
    }

    public SparseArray A0B() {
        SparseArray A0L = Pxe.A0L();
        A0L.put(this.A02, A0A(this));
        return A0L;
    }

    public SRc(FormCellLoggingEvents formCellLoggingEvents, int i, int i2, boolean z, boolean z2) {
        this.A06 = JTO.A0K();
        this.A05 = Pxh.A0M();
        this.A04 = Pxe.A0L();
        this.A07 = new 2Fk(AnonymousClass7TE.A0v());
        this.A03 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = formCellLoggingEvents;
    }

    public SRc(CellParams cellParams) {
        this.A06 = JTO.A0K();
        this.A05 = Pxh.A0M();
        this.A04 = Pxe.A0L();
        this.A07 = new 2Fk(AnonymousClass7TE.A0v());
        this.A03 = cellParams.A03;
        this.A02 = cellParams.A02;
        this.A09 = cellParams.A06;
        this.A08 = cellParams.A05;
        this.A01 = cellParams.A04;
    }
}
