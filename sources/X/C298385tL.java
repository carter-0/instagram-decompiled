package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.5tL  reason: invalid class name and case insensitive filesystem */
public final class C298385tL implements Callable {
    public final /* synthetic */ AnonymousClass92U A00;
    public final /* synthetic */ List A01;

    public C298385tL(AnonymousClass92U r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass92U r0 = this.A00;
        C251983oI r2 = r0.A05;
        r2.beginTransaction();
        try {
            List insertAndReturnIdsList = r0.A04.insertAndReturnIdsList(this.A01);
            r2.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            r2.endTransaction();
        }
    }
}
