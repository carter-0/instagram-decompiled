package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.M7m  reason: case insensitive filesystem */
public final class C66001M7m implements Runnable {
    public final /* synthetic */ AnonymousClass5GM A00;
    public final /* synthetic */ List A01;

    public C66001M7m(AnonymousClass5GM r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        List<C283155Gi> list = this.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C283155Gi r0 : list) {
            AnonymousClass7TF.A1M(A0r, r0.A00);
        }
        List A0W = 00k.A0W(A0r);
        AnonymousClass5GM r5 = this.A00;
        AnonymousClass0eK r8 = r5.A03;
        C251983oI r7 = JTR.A0q(r8).A00;
        r7.assertNotSuspendingTransaction();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\n");
        A1A.append("    DELETE FROM newfeedstory");
        A1A.append("\n");
        A1A.append("    WHERE notification_type in (");
        1wO.A00(A1A, A0W.size());
        A1A.append(")");
        A1A.append("\n");
        AnonymousClass1WV compileStatement = r7.compileStatement(AnonymousClass7TF.A0l("  ", A1A));
        Iterator it = A0W.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.ADa(i, (long) AnonymousClass7TG.A0F(it));
            i++;
        }
        r7.beginTransaction();
        try {
            compileStatement.ATQ();
            r7.setTransactionSuccessful();
            r7.endTransaction();
            AnonymousClass5GY A0q = JTR.A0q(r8);
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C283155Gi A002 : list) {
                C283135Gg A003 = C63355Kvc.A00(A002, r5.A01.A06);
                if (A003 != null) {
                    A1C.add(A003);
                }
            }
            A0q.A02(A1C);
            if (AnonymousClass7TE.A1b(list)) {
                r5.A00 = true;
                ((C71082aO) r5.A02.get()).A03();
            }
        } catch (Throwable th) {
            r7.endTransaction();
            throw th;
        }
    }
}
