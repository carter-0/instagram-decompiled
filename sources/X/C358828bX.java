package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import com.instagram.ui.text.CustomUnderlineSpan;

/* renamed from: X.8bX  reason: invalid class name and case insensitive filesystem */
public final class C358828bX implements TextWatcher {
    public boolean A00;
    public final /* synthetic */ C358368an A01;

    public C358828bX(C358368an r1) {
        this.A01 = r1;
    }

    public final void afterTextChanged(Editable editable) {
        C358368an r2 = this.A01;
        if (r2.A1X.Cd8() || r2.A0e) {
            C358368an.A09(r2);
            C358368an.A0A(r2);
            C314676if r1 = r2.A1d;
            if (r1 == null || !C358368an.A0Q(r2)) {
                C314676if r0 = r2.A1a;
                if (r0 != null) {
                    ((C338677iL) r0.get()).A05();
                }
            } else {
                ((C348987zP) r1.get()).A03();
            }
            C314676if r12 = r2.A1c;
            if (r12.A03) {
                ((A9W) r12.get()).A01(this.A00);
            }
            ((AnonymousClass91N) r2.A1f.get()).A01(((AnonymousClass91a) r2.A1Z.get()).A00);
            if (((AnonymousClass9UP[]) C263324Kh.A06(editable, AnonymousClass9UP.class)).length == 0) {
                Object obj = new Object();
                C263324Kh.A05(editable, CustomUnderlineSpan.class, C389949qU.class);
                AnonymousClass91P[] r4 = (AnonymousClass91P[]) C263324Kh.A06(editable, AnonymousClass91P.class);
                for (AnonymousClass91P r13 : r4) {
                    editable.setSpan(new UnderlineSpan(), editable.getSpanStart(r13) + 1, editable.getSpanEnd(r13), 33);
                }
                editable.setSpan(obj, 0, editable.length(), 18);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C358368an r2 = this.A01;
        if (r2.A0a && charSequence.length() > 0 && charSequence.length() > i && charSequence.charAt(i) == '@') {
            C59961JcU.A00(r2.A1J);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = TextUtils.isEmpty(charSequence);
    }
}
