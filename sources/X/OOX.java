package X;

import com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3;
import java.util.concurrent.Executor;

public abstract class OOX {
    public static final void A01(C69560No4 no4, 0sP r3, 0r1 r4, 0rm r5, 0rm r6) {
        if (!r4.A00) {
            C51970G9q.A1S((C262204Co) r5.A00);
            C62320sa r0 = (C62320sa) r6.A00;
            if (r0 != null) {
                r0.invoke();
            }
            r4.A00 = true;
            r3.invoke(no4);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public static final Object A00(String str, AnonymousClass4D7 r23, 0sP r24, 0sP r25, long j) {
        Object obj;
        int i;
        C69560No4 ncb;
        1IW A0q = C51973G9u.A0q(r23);
        0sP pqL = new C74179PqL(A0q, 11);
        String str2 = str;
        0qQ.A0B(str2, 0);
        long j2 = j;
        if (j == Long.MIN_VALUE || j > 0) {
            ? obj2 = new Object();
            0rm A11 = C51965G9l.A11();
            0rm A112 = C51965G9l.A11();
            C73540PeW A00 = OYW.A00(str2);
            C73540PeW peW = OYW.A00;
            if (0qQ.A0K(A00, peW)) {
                ncb = NCC.A00;
            } else {
                0sP r9 = r25;
                if (C51971G9r.A1a(A00.B9B().invoke(), r9)) {
                    ncb = new NCB(A00);
                } else {
                    0rm r21 = A11;
                    C73516Pdz pdz = new C73516Pdz(new C58799Ixk(0, r9, A112, A00, r21, obj2, pqL));
                    C74179PqL pqL2 = new C74179PqL(r24, 10);
                    0fh.A01("RpStore.subscribe", -1133804133);
                    try {
                        synchronized (A00.A02) {
                            if (A00.equals(peW)) {
                                C71004OWb.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", (Throwable) null);
                                obj = C70364O3q.A00;
                                i = -44480449;
                            } else {
                                pqL2.invoke(new OB2(pdz, A00.A01));
                                ((Executor) A00.A03.getValue()).execute(new C73164PXz(A00, pdz));
                                obj = new C13349TVw(18, pdz, A00);
                                i = -1285750994;
                            }
                        }
                        0fh.A00(i);
                        A11.A00 = obj;
                        if (j != Long.MIN_VALUE) {
                            0r1 r19 = obj2;
                            0sP r18 = pqL;
                            0sP r17 = r9;
                            A112.A00 = C51966G9m.A1L(new WaitForCallConditionKt$waitForCallCondition$3(A00, str2, (AnonymousClass4D7) null, r17, r18, r19, A112, r21, j2), 19E.A02(new AnonymousClass19G((C262204Co) null)));
                        }
                        return A0q.A0E();
                    } catch (Throwable th) {
                        0fh.A00(-1472487928);
                        throw th;
                    }
                }
            }
            A01(ncb, pqL, obj2, A112, A11);
            return A0q.A0E();
        }
        throw AnonymousClass7TE.A0z(002.A0Q("timeout must be a positive value or NEVER_TIME_OUT: ", j2));
    }
}
