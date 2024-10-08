package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OmN  reason: case insensitive filesystem */
public final class C71526OmN implements C74290PsI {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ C74377Pts A01;
    public final /* synthetic */ C3024463i A02;
    public final /* synthetic */ String A03;

    public C71526OmN(C71087ObS obS, C74377Pts pts, C3024463i r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = pts;
        this.A00 = obS;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.Npx] */
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        byte[] bArr;
        ONA A002;
        Object obj2;
        OB5 ob5 = (OB5) obj;
        Boolean bool = null;
        if (ob5 != null) {
            bArr = ob5.A01;
            bool = Boolean.valueOf(ob5.A00);
        } else {
            bArr = null;
        }
        C3024463i r6 = this.A02;
        String str = this.A03;
        C74377Pts pts = this.A01;
        if (bArr != null && (A002 = C3024263g.A00(bArr)) != null) {
            List list = A002.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C69675Npx) obj2).A00, str)) {
                    break;
                }
            }
            C69675Npx npx = (C69675Npx) obj2;
            if (npx != null) {
                List list2 = npx.A01;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (0qQ.A0K(((C69676Npy) next).A00, pts.getId())) {
                        if (next != null) {
                            ArrayList A1D = AnonymousClass7TE.A1D(list2);
                            ArrayList A1D2 = AnonymousClass7TE.A1D(list);
                            A1D.remove(next);
                            ? obj3 = new Object();
                            obj3.A00 = str;
                            obj3.A01 = A1D;
                            A1D2.remove(npx);
                            A1D2.add(obj3);
                            byte[] A012 = C3024263g.A01(new ONA(A1D2));
                            if (A012 != null) {
                                if (AnonymousClass7TF.A1Y(bool, true)) {
                                    str = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                                }
                                C71087ObS.A01(C3024463i.A02(r6, str, A012, false), this.A00, 5);
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.A00.A05(NEF.A00);
    }
}
