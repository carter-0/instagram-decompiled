package X;

import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: X.Skr  reason: case insensitive filesystem */
public final class C12030Skr implements C274924pJ {
    public final QJQ A00 = new QJQ();

    public final String getName() {
        return "wholestat";
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        QJQ qjq = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        QJQ.A00(qjq);
        ListIterator listIterator = qjq.A00.listIterator();
        while (listIterator.hasNext()) {
            C274994pQ r2 = (C274994pQ) listIterator.next();
            if (r2 != null) {
                if (!r2.A0F.exists()) {
                    qjq.A01.remove(Integer.valueOf(r2.A0E));
                    listIterator.remove();
                } else {
                    String A01 = r2.A01();
                    if (A01 != null) {
                        A1C.add(A01);
                    }
                }
            }
        }
        s3x.A0D = A1C;
    }

    public final void update() {
        QJQ qjq = this.A00;
        QJQ.A00(qjq);
        ListIterator listIterator = qjq.A00.listIterator();
        while (listIterator.hasNext()) {
            C274994pQ r2 = (C274994pQ) listIterator.next();
            if (r2 != null) {
                if (!r2.A0F.exists()) {
                    qjq.A01.remove(Integer.valueOf(r2.A0E));
                    listIterator.remove();
                } else {
                    r2.A02();
                }
            }
        }
    }
}
