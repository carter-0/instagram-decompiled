package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6Tn  reason: invalid class name */
public abstract class AnonymousClass6Tn {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13, C277014uI r14) {
        boolean z;
        C308336Tw r7;
        C307916Rz r3 = r12.A07;
        if (1KZ.A01.isTracing()) {
            1KZ.A01("Parse script");
        }
        Object obj = null;
        if (r14 instanceof C277004uH) {
            C277004uH r2 = (C277004uH) r14;
            try {
                r2.ASe(r12.A00);
                C308306Tt FJJ = r2.FJJ();
                r3.Cxv(r13, r14, r14.Bq3());
                try {
                    List<Object> unmodifiableList = Collections.unmodifiableList(r13.A00);
                    ThreadLocal threadLocal = C308326Tv.A00;
                    if (threadLocal.get() == null) {
                        z = true;
                        r7 = new C308336Tw();
                        threadLocal.set(r7);
                    } else {
                        z = false;
                        r7 = (C308336Tw) threadLocal.get();
                    }
                    try {
                        C308346Tx r8 = new C308346Tx(r12);
                        int i = r7.A01;
                        C308336Tw.A0D(r7, unmodifiableList.size() + 1 + 5);
                        C308336Tw.A0E(r7, (Object) null);
                        for (Object A0E : unmodifiableList) {
                            C308336Tw.A0E(r7, A0E);
                        }
                        C308336Tw.A0F(r7, new C280064zw(FJJ), (Object) null, unmodifiableList.size(), r7.A02);
                        C308346Tx r1 = r7.A03;
                        r7.A03 = r8;
                        try {
                            C308336Tw.A0B(r7);
                            r7.A03 = r1;
                            obj = r7.A05[r7.A01 - 1];
                            C308336Tw.A0C(r7);
                            int i2 = r7.A01;
                            if (i2 != i) {
                                th = new AnonymousClass6U0(002.A0R("InvalidBytecode: ", String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)})));
                                throw th;
                            } else if (z) {
                                threadLocal.remove();
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7.A03 = r1;
                        }
                    } catch (AnonymousClass6U0 e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw new AnonymousClass6U0((Throwable) e2);
                    } catch (AnonymousClass6U0 e3) {
                        if (z) {
                            try {
                                throw new AnonymousClass6QV(e3);
                            } catch (Throwable th2) {
                                if (z) {
                                    threadLocal.remove();
                                }
                                throw th2;
                            }
                        } else {
                            throw e3;
                        }
                    }
                } catch (AnonymousClass6QV e4) {
                    AnonymousClass6QV r0 = new AnonymousClass6QV(r14.Bxl(), e4);
                    r3.DhD(r0, r14);
                    throw r0;
                }
            } finally {
                if (1KZ.A01.isTracing()) {
                    1KZ.A00();
                }
            }
        }
        r3.Cum(r13, r14, obj, r14.Bq3());
        return obj;
    }
}
