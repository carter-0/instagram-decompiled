package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AsN  reason: case insensitive filesystem */
public final class C41340AsN implements Callable {
    public final /* synthetic */ 1Vd A00;
    public final /* synthetic */ List A01;

    public C41340AsN(1Vd r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DELETE FROM user_feed_items WHERE item_type IN (");
        List list = this.A01;
        1wO.A00(A1A, list.size());
        String A0l = AnonymousClass7TF.A0l(")", A1A);
        C251983oI r5 = this.A00.A01;
        AnonymousClass1WV compileStatement = r5.compileStatement(A0l);
        int i = 1;
        for (Object next : list) {
            0qQ.A0B(next, 0);
            compileStatement.ADh(i, next.toString());
            i++;
        }
        r5.beginTransaction();
        try {
            return AnonymousClass7TF.A10(r5, compileStatement);
        } finally {
            r5.endTransaction();
        }
    }
}
