package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lln  reason: case insensitive filesystem */
public final class C65010Lln implements MTU {
    public final /* synthetic */ QDV A00;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.UOk, java.lang.Object] */
    public final void DtV(C61077JwF jwF, String str) {
        Object obj;
        ArrayList arrayList;
        Object kKx;
        List<C15092UOk> list;
        Iterator A1H = C51966G9m.A1H(jwF.A00);
        do {
            obj = null;
            if (!A1H.hasNext()) {
                break;
            }
            obj = A1H.next();
        } while (!G9w.A1b(((GNY) obj).A01));
        GNY gny = (GNY) obj;
        QDV qdv = this.A00;
        if (gny == null || (list = (List) gny.A01) == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = AnonymousClass7TG.A0r(list);
            for (C15092UOk uOk : list) {
                boolean z = uOk.A07;
                String str2 = uOk.A06;
                if (z) {
                    str2 = LQE.A00(DbX.A05(str2));
                }
                float f = uOk.A00;
                int i = uOk.A04;
                int i2 = uOk.A02;
                boolean z2 = uOk.A07;
                int i3 = uOk.A03;
                float f2 = uOk.A01;
                String str3 = uOk.A05;
                AnonymousClass7TF.A1E(str2, 0, str3);
                ? obj2 = new Object();
                obj2.A06 = str2;
                obj2.A00 = f;
                obj2.A04 = i;
                obj2.A02 = i2;
                obj2.A07 = z2;
                obj2.A03 = i3;
                obj2.A01 = f2;
                obj2.A05 = str3;
                arrayList.add(obj2);
            }
        }
        LED led = qdv.A01;
        if (led != null) {
            0qQ.A0B(arrayList, 0);
            led.A07 = arrayList;
        }
        02m.A0p.markerEnd(18946359, 2);
        AnonymousClass2Fj r1 = qdv.A06;
        if (gny == null) {
            kKx = C61759KKy.A00;
        } else {
            kKx = new C61758KKx(arrayList);
        }
        r1.A0A(kKx);
    }

    public C65010Lln(QDV qdv) {
        this.A00 = qdv;
    }

    public final void DtU() {
        QDV qdv = this.A00;
        02m.A0p.markerEnd(18946359, 3);
        LED led = qdv.A01;
        if (led != null) {
            0sn r1 = 0sn.A00;
            0qQ.A0B(r1, 0);
            led.A07 = r1;
        }
        qdv.A06.A0A(C61760KKz.A00);
    }
}
