package X;

import com.instagram.user.model.Product;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UfS  reason: case insensitive filesystem */
public final class C15600UfS extends 1P0 {
    public final /* synthetic */ C20981X7w A00;
    public final /* synthetic */ C323486xZ A01;
    public final /* synthetic */ Product A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C15600UfS(C20981X7w x7w, C323486xZ r2, Product product, String str, List list) {
        this.A01 = r2;
        this.A03 = str;
        this.A04 = list;
        this.A02 = product;
        this.A00 = x7w;
    }

    public final void onFail(C268654dm r6) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r6, -1224804280);
        C323486xZ r2 = this.A01;
        r2.A0E(C16508Uw5.FAILED, this.A03);
        r2.A04.A00(new WQM(this.A02, AnonymousClass05K.A01));
        C20981X7w x7w = this.A00;
        Throwable A012 = r6.A01();
        if (A012 != null) {
            str = A012.getMessage();
        } else {
            str = null;
        }
        x7w.DTp(str);
        AnonymousClass0fD.A0A(2053661711, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        int A032 = AnonymousClass0fD.A03(-1429029338);
        CG8 cg8 = (CG8) obj;
        int A033 = AnonymousClass0fD.A03(-590407295);
        0qQ.A0B(cg8, 0);
        C323486xZ r2 = this.A01;
        String str = this.A03;
        r2.A0E(C16508Uw5.LOADED, str);
        List A1J = C51966G9m.A1J(cg8.A03);
        boolean A1b = AnonymousClass7TE.A1b(A1J);
        Iterator it = this.A04.iterator();
        if (A1b) {
            while (it.hasNext()) {
                r2.A0A(str).remove(it.next());
            }
        } else {
            while (it.hasNext()) {
                ((C17991VjT) it.next()).A00 = C16507Uw3.COMMITTED;
            }
        }
        C323486xZ.A03(r2, cg8.A02, cg8.A01);
        C18071Vky A06 = r2.A06(str);
        if (A06 != null) {
            r2.A07.D1H(A06, str);
        }
        if (r2.A0F.contains(str) && C323486xZ.A04(r2, str) && !C323486xZ.A05(r2, str)) {
            r2.A0B();
        }
        if (A06 != null) {
            String str2 = this.A02.A0H;
            0qQ.A0B(str2, 0);
            obj2 = A06.A01.get(str2);
        } else {
            obj2 = null;
        }
        boolean A1b2 = AnonymousClass7TE.A1b(A1J);
        1Ng r3 = r2.A04;
        Product product = this.A02;
        if (A1b2) {
            r3.A00(new WQM(product, AnonymousClass05K.A01));
            this.A00.DwB(A1J);
        } else if (obj2 != null) {
            r3.A00(new WQM(product, AnonymousClass05K.A00));
            this.A00.onSuccess(obj2);
        } else {
            r3.A00(new WQM(product, AnonymousClass05K.A01));
            this.A00.DTp((String) null);
        }
        AnonymousClass0fD.A0A(-2087476043, A033);
        AnonymousClass0fD.A0A(-709909209, A032);
    }
}
