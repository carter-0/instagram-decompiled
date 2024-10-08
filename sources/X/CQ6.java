package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CQ6 extends 17P implements C46302DUf {
    public DUD A00;
    public List A01;

    public final List BZQ() {
        List list = this.A01;
        if (list == null) {
            return A08(-1547473904, CQ7.class);
        }
        return list;
    }

    public final DUD CCk() {
        DUD dud = this.A00;
        if (dud == null) {
            return (DUD) A05(339043230, CQ7.class);
        }
        return dud;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUf, X.CQ6] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44486Cfi.A00(this));
    }

    public final String Alg() {
        return A0j(553933994);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQ6] */
    public final Integer C44() {
        return getOptionalIntValueByHashCode(-643954005);
    }

    public final String C4Z() {
        return A0h(1769642752);
    }

    public final C46302DUf E9I(1E9 r5) {
        ArrayList arrayList;
        List<DUD> BZQ = BZQ();
        DUD dud = null;
        if (BZQ != null) {
            arrayList = AnonymousClass7TG.A0r(BZQ);
            for (DUD dud2 : BZQ) {
                dud2.E9J(r5);
                arrayList.add(dud2);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        DUD CCk = CCk();
        if (CCk != null) {
            CCk.E9J(r5);
            dud = CCk;
        }
        this.A00 = dud;
        return this;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CQ6] */
    public final C42101BHe FC7(1E9 r9) {
        ArrayList arrayList;
        String A0j = A0j(553933994);
        String A0f = A0f();
        List<DUD> BZQ = BZQ();
        C42102BHf bHf = null;
        if (BZQ != null) {
            arrayList = AnonymousClass7TG.A0r(BZQ);
            for (DUD FC8 : BZQ) {
                arrayList.add(FC8.FC8(r9));
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-643954005);
        String A0h = A0h(1769642752);
        DUD CCk = CCk();
        if (CCk != null) {
            bHf = CCk.FC8(r9);
        }
        return new C42101BHe(bHf, optionalIntValueByHashCode, A0j, A0f, A0h, arrayList);
    }

    public final String getMediaId() {
        return A0f();
    }
}
