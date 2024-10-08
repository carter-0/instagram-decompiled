package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ORd  reason: case insensitive filesystem */
public abstract class C70908ORd {
    /* JADX INFO: finally extract failed */
    public static final void A01(Object obj, 0r1 r4, 0rm r5, 0rm r6, 0rm r7, 0rm r8) {
        if (!(obj instanceof AnonymousClass0eL)) {
            try {
                r4.A00 = true;
                r5.A00 = ((0sL) r6.A00).invoke(r5.A00, obj);
                r4.A00 = false;
                Object obj2 = r7.A00;
                r8.A00 = obj2;
                for (Object A1U : (List) obj2) {
                    DbS.A1U(A1U);
                }
            } catch (Throwable th) {
                r4.A00 = false;
                throw th;
            }
        } else {
            throw AnonymousClass7TE.A0w("Actions must be plain objects. Use custom middleware for async \nactions.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0r1, java.lang.Object] */
    public static final C59628JQw A00(Object obj, 0sP r5, 0sL r6) {
        if (r5 != null) {
            return (C59628JQw) ((0sK) r5.invoke(C74209Pqq.A00)).invoke(r6, obj, (Object) null);
        }
        0rm A11 = C51965G9l.A11();
        A11.A00 = r6;
        0rm A112 = C51965G9l.A11();
        A112.A00 = obj;
        0rm A113 = C51965G9l.A11();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A113.A00 = A1C;
        0rm A114 = C51965G9l.A11();
        A114.A00 = A1C;
        ? obj2 = new Object();
        A01(OSS.A00, obj2, A112, A11, A114, A113);
        return new C73539PeV(obj2, A112, A11, A114, A113);
    }
}
