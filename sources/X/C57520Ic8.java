package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ic8  reason: case insensitive filesystem */
public final class C57520Ic8 implements JQQ {
    public final /* synthetic */ C55780HnF A00;
    public final /* synthetic */ DHK A01;
    public final /* synthetic */ C242803Vz A02;

    public C57520Ic8(C55780HnF hnF, DHK dhk, C242803Vz r3) {
        this.A00 = hnF;
        this.A02 = r3;
        this.A01 = dhk;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        Integer num;
        List<C279864zZ> list;
        C55780HnF hnF = this.A00;
        AnonymousClass4DU r5 = hnF.A01;
        C254523sc A0n = C51965G9l.A0n(r5, "IMPRESSION");
        C242803Vz r3 = this.A02;
        DHK dhk = this.A01;
        A0n.A4s = r5.getModuleName();
        ArrayList arrayList = null;
        if (r3 != null) {
            num = Integer.valueOf(r3.getPosition());
        } else {
            num = null;
        }
        A0n.A0T(num);
        BBM bbm = dhk.A00;
        String str = bbm.A06;
        A0n.A3W = C51972G9s.A0j(str);
        A0n.A0d = C297375re.NOTES_IN_FEED_UNIT;
        AnonymousClass9J1 r0 = bbm.A00;
        if (!(r0 == null || (list = (List) r0.A01) == null)) {
            arrayList = AnonymousClass7TG.A0r(list);
            for (C279864zZ r02 : list) {
                arrayList.add(r02.A0H);
            }
        }
        A0n.A7V = AnonymousClass7TE.A1D(arrayList);
        A0n.A14 = Boolean.valueOf(C51971G9r.A0j(hnF.A00).A03(str));
        return new C254563sg(A0n);
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        return null;
    }
}
