package X;

import java.util.ArrayList;

/* renamed from: X.5qI  reason: invalid class name and case insensitive filesystem */
public final class C296575qI implements AnonymousClass3LR {
    public final C340077kf A00;
    public final ArrayList A01 = new ArrayList();

    public C296575qI(C340077kf r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean A02(C296605qL r6) {
        C296605qL r2;
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty() && (r6 == (r2 = (C296605qL) 00k.A0K(arrayList)) || (r2 != null && 0qQ.A0K(r6.A01, r2.A01) && 0qQ.A0K(r6.A00, r2.A00) && 0qQ.A0K(r6.A03, r2.A03) && 0qQ.A0K(r6.A02, r2.A02)))) {
            return false;
        }
        arrayList.add(r6);
        return true;
    }

    public final boolean A00() {
        C296605qL r4;
        C296605qL r3;
        ArrayList arrayList = this.A01;
        if (arrayList.size() <= 1 || (r4 = (C296605qL) 00k.A0I(arrayList)) == (r3 = (C296605qL) 00k.A0K(arrayList)) || r4 == null || r3 == null || !0qQ.A0K(r4.A01, r3.A01) || !0qQ.A0K(r4.A00, r3.A00) || !0qQ.A0K(r4.A03, r3.A03) || 0qQ.A0K(r4.A02, r3.A02)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        C296605qL A002 = this.A00.A00();
        if (A002 == null) {
            return false;
        }
        return A02(A002);
    }

    public final String AwV() {
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 1) {
            return ((C296605qL) 00k.A0K(arrayList)).A00;
        }
        return "";
    }

    public final String AwW() {
        ArrayList arrayList = this.A01;
        if (arrayList.size() > 1) {
            return ((C296605qL) 00k.A0K(arrayList)).A01;
        }
        return "";
    }

    public final String AwX() {
        String str;
        ArrayList arrayList = this.A01;
        if (arrayList.size() <= 1 || (str = ((C296605qL) 00k.A0K(arrayList)).A03) == null) {
            return "";
        }
        return str;
    }

    public final String Bxt() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            return ((C296605qL) 00k.A0I(arrayList)).A00;
        }
        return "";
    }

    public final String Bxu() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            return ((C296605qL) 00k.A0I(arrayList)).A01;
        }
        return "";
    }
}
