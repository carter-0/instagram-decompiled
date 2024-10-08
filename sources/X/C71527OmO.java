package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.OmO  reason: case insensitive filesystem */
public final class C71527OmO implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ C74377Pts A01;
    public final /* synthetic */ C3024463i A02;
    public final /* synthetic */ String A03;

    public C71527OmO(C71087ObS obS, C74377Pts pts, C3024463i r3, String str) {
        this.A00 = obS;
        this.A02 = r3;
        this.A03 = str;
        this.A01 = pts;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C71087ObS obS;
        Object obj2;
        Object obj3;
        List list;
        Object obj4;
        byte[] bArr;
        OB5 ob5 = (OB5) obj;
        if (ob5 != null) {
            byte[] bArr2 = ob5.A01;
            if (bArr2.length != 0) {
                String str = this.A03;
                C74377Pts pts = this.A01;
                ONA A002 = C3024263g.A00(bArr2);
                if (A002 != null) {
                    Iterator it = A002.A00.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        if (0qQ.A0K(((C69675Npx) obj3).A00, str)) {
                            break;
                        }
                    }
                    C69675Npx npx = (C69675Npx) obj3;
                    if (!(npx == null || (list = npx.A01) == null)) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it2.next();
                            if (0qQ.A0K(((C69676Npy) obj4).A00, pts.getId())) {
                                break;
                            }
                        }
                        C69676Npy npy = (C69676Npy) obj4;
                        if (!(npy == null || (bArr = npy.A01) == null)) {
                            obS = this.A00;
                            obj2 = new NEC(bArr);
                            obS.A05(obj2);
                        }
                    }
                }
            }
        }
        obS = this.A00;
        obj2 = NED.A00;
        obS.A05(obj2);
    }
}
