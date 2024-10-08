package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5tU  reason: invalid class name and case insensitive filesystem */
public abstract class C298475tU extends SRc {
    public SparseArray A00 = new SparseArray();
    public ArrayList A01 = new ArrayList();
    public final AnonymousClass2gB A02 = new AnonymousClass2gB();
    public final AnonymousClass2Fj A03 = new 2Fk();

    public final SRc A0D(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i2 >= sparseArray.size()) {
                return super.A0D(i);
            }
            SRc sRc = (SRc) sparseArray.valueAt(i2);
            if (sRc.A02 == i) {
                return sRc;
            }
            i2++;
        }
    }

    public void A0E() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                SRc sRc = (SRc) sparseArray.valueAt(i);
                if (sRc != null) {
                    sRc.A0E();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean A0J() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                return true;
            }
            if (sparseArray.valueAt(i) != null && !((SRc) sparseArray.valueAt(i)).A0J()) {
                return false;
            }
            i++;
        }
    }

    public final boolean A0K() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                return true;
            }
            SRc sRc = (SRc) sparseArray.valueAt(i);
            Object A022 = this.A07.A02();
            A022.getClass();
            if (((Boolean) A022).booleanValue() && !sRc.A0K()) {
                return false;
            }
            i++;
        }
    }

    public final SRc A0L(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i2 >= sparseArray.size()) {
                return null;
            }
            if (sparseArray.valueAt(i2) != null && ((SRc) sparseArray.valueAt(i2)).A02 == i) {
                return (SRc) sparseArray.valueAt(i2);
            }
            i2++;
        }
    }

    public ImmutableList A0M() {
        C298465tT r6 = (C298465tT) this;
        ImmutableList.Builder builder = ImmutableList.builder();
        C8028QfI qfI = new C8028QfI(26);
        qfI.A03 = r6.A00;
        qfI.A07 = true;
        boolean z = r6.A04;
        int i = R.attr.fbpay_hub_header_item_margin_top;
        if (z) {
            i = 0;
        }
        qfI.A04 = i;
        if (z) {
            qfI.A00 = R.attr.fbpay_redesign_nux_form_header_item_margin_bottom;
        }
        builder.add(qfI.A00());
        QXR qxr = r6.A02;
        if (qxr != null) {
            builder.add(SGF.A00(qxr, (Integer) null, (String) null, "nux_new_full_name_form_field", r6.A05, false));
        }
        QXR qxr2 = r6.A01;
        if (qxr2 != null) {
            builder.add(SGE.A00(qxr2, (String) null, "nux_new_email_form_field", r6.A05, false));
        }
        QXR qxr3 = r6.A03;
        if (qxr3 != null) {
            builder.add(SGG.A00(qxr3, (String) null, "nux_new_phone_number_form_field", r6.A05, false));
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public final SparseArray A0B() {
        Object A022 = this.A05.A02();
        A022.getClass();
        return (SparseArray) A022;
    }

    public final 2Fk A0C() {
        return this.A02;
    }

    public final void A0F(C11231SGq sGq) {
        this.A00 = sGq;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                SRc sRc = (SRc) sparseArray.valueAt(i);
                if (sRc != null) {
                    sRc.A0F(sGq);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A0G(boolean z) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            SRc A0L = A0L(((Number) it.next()).intValue());
            if (A0L != null) {
                A0L.A0G(z);
                if (z && !A0L.A0K()) {
                    z = false;
                }
            }
        }
    }

    public final void A0H(boolean z) {
        Object A022 = this.A07.A02();
        A022.getClass();
        if (((Boolean) A022).booleanValue() != z) {
            super.A0H(z);
            A0N();
            AnonymousClass2gB r1 = this.A05;
            r1.A0B(r1.A02());
        }
    }

    public C298475tU(int i, boolean z, boolean z2) {
        super(i, z, z2);
    }

    public void A0N() {
        SparseArray sparseArray;
        ImmutableList A0M = A0M();
        int i = 0;
        while (true) {
            sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            SRc sRc = (SRc) sparseArray.valueAt(i);
            this.A05.A0D(sRc.A05);
            this.A02.A0D(sRc.A0C());
            sRc.A0E();
            i++;
        }
        this.A00 = new SparseArray();
        this.A01 = new ArrayList();
        C249803kO it = A0M.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            SRc A012 = cellParams.A01();
            cellParams.A00 = A012;
            A012.A0F(this.A00);
            int i2 = cellParams.A02;
            if (sparseArray.get(i2) instanceof C8041Qfl) {
                ((C8041Qfl) A012).A0C.A0B(((C8041Qfl) sparseArray.get(i2)).A0C.A02());
            }
            cellParams.A00 = A012;
            this.A00.put(i2, A012);
            this.A01.add(Integer.valueOf(i2));
            this.A02.A0E(A012.A0C(), new C11627SdV(this));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.A00;
            if (i3 < sparseArray2.size()) {
                SRc sRc2 = (SRc) sparseArray2.valueAt(i3);
                this.A05.A0E(sRc2.A05, new C11628SdW(sRc2, this));
                i3++;
            } else {
                this.A03.A0B(A0M);
                return;
            }
        }
    }

    public void A0O(SRc sRc, Object obj, Object obj2) {
    }
}
