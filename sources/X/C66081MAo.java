package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.MAo  reason: case insensitive filesystem */
public final class C66081MAo implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ List A01;

    public C66081MAo(2NU r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DELETE FROM drafts WHERE id in (");
        List list = this.A01;
        1wO.A00(A1A, list.size());
        String A0l = AnonymousClass7TF.A0l(")", A1A);
        C251983oI r4 = this.A00.A02;
        AnonymousClass1WV compileStatement = r4.compileStatement(A0l);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.ADh(i, AnonymousClass7TE.A18(it));
            i++;
        }
        r4.beginTransaction();
        try {
            return AnonymousClass7TF.A10(r4, compileStatement);
        } finally {
            r4.endTransaction();
        }
    }
}
