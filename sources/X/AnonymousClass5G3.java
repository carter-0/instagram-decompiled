package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: X.5G3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5G3 implements Runnable {
    public final /* synthetic */ AnonymousClass38C A00;
    public final /* synthetic */ WorkDatabase A01;
    public final /* synthetic */ C255373u1 A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ AnonymousClass5G3(AnonymousClass38C r1, WorkDatabase workDatabase, C255373u1 r3, List list) {
        this.A03 = list;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = workDatabase;
    }

    public final void run() {
        List<AnonymousClass39P> list = this.A03;
        C255373u1 r4 = this.A02;
        WorkDatabase workDatabase = this.A01;
        for (AnonymousClass39P AG6 : list) {
            AG6.AG6(r4.A01);
        }
        C255313tv.A00(workDatabase, list);
    }
}
