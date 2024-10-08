package X;

import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.VjZ  reason: case insensitive filesystem */
public final class C17997VjZ {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final C15059UNc A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C73662Phb(this, 38));

    public C17997VjZ(C15059UNc uNc) {
        0qQ.A0B(uNc, 1);
        this.A03 = uNc;
    }

    public final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        List A15 = JTO.A15(this.A04);
        ArrayList<VSD> arrayList2 = new ArrayList<>();
        for (Object next : A15) {
            if (((VSD) next).A00) {
                arrayList2.add(next);
            }
        }
        for (VSD vsd : arrayList2) {
            arrayList.add(vsd.A01.getId());
        }
        String str = this.A00;
        if (str != null) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final boolean A01() {
        boolean z = false;
        if (AnonymousClass7TF.A1W(this.A03.A00, INLINE_SURVEY_QUESTION_TYPES.COMMENT)) {
            String str = this.A00;
            if (str == null || str.length() == 0) {
                z = true;
            }
            return !z;
        }
        List<VSD> A15 = JTO.A15(this.A04);
        if (!(A15 instanceof Collection) || !A15.isEmpty()) {
            for (VSD vsd : A15) {
                if (vsd.A00) {
                    return true;
                }
            }
        }
        return false;
    }
}
