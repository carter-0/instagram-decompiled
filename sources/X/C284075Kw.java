package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5Kw  reason: invalid class name and case insensitive filesystem */
public final class C284075Kw {
    public static final C284075Kw A02 = new C284075Kw();
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final C284095Ky A01 = new C284085Kx();

    public final AnonymousClass5L3 A00(Class cls) {
        Integer num;
        AnonymousClass5LQ r9;
        AnonymousClass5LR r6;
        AnonymousClass5L5 r10;
        AnonymousClass5LV r5;
        AnonymousClass5LY r7;
        AnonymousClass5L5 r2;
        AnonymousClass5LV r1;
        Class cls2;
        Charset charset = C284045Ks.A03;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            AnonymousClass5L3 r3 = (AnonymousClass5L3) concurrentMap.get(cls);
            if (r3 == null) {
                C284085Kx r12 = (C284085Kx) this.A01;
                AnonymousClass5L5 r0 = AnonymousClass5L4.A02;
                Class<C283985Kk> cls3 = C283985Kk.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = AnonymousClass5L4.A03) == null || cls2.isAssignableFrom(cls)) {
                    AnonymousClass5LN CoF = r12.A00.CoF(cls);
                    AnonymousClass5LM r32 = (AnonymousClass5LM) CoF;
                    int i = r32.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = AnonymousClass5L4.A02;
                            r1 = AnonymousClass5LU.A01;
                        } else {
                            r2 = AnonymousClass5L4.A00;
                            r1 = AnonymousClass5LU.A00;
                            if (r1 == null) {
                                throw new IllegalStateException(Pxd.A00(30));
                            }
                        }
                        r3 = new C11619SdN(r1, r32.A01, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        if ((i & 1) == 1) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        boolean z = false;
                        if (num == AnonymousClass05K.A00) {
                            z = true;
                        }
                        if (isAssignableFrom) {
                            r9 = AnonymousClass5LO.A01;
                            r6 = AnonymousClass5LR.A01;
                            r10 = AnonymousClass5L4.A02;
                            if (z) {
                                r5 = AnonymousClass5LU.A01;
                                r7 = AnonymousClass5LW.A01;
                            } else {
                                r5 = null;
                                r7 = AnonymousClass5LW.A01;
                            }
                        } else {
                            r9 = AnonymousClass5LO.A00;
                            r6 = AnonymousClass5LR.A00;
                            if (z) {
                                r10 = AnonymousClass5L4.A00;
                                r5 = AnonymousClass5LU.A00;
                                if (r5 != null) {
                                    r7 = AnonymousClass5LW.A00;
                                } else {
                                    throw new IllegalStateException(Pxd.A00(30));
                                }
                            } else {
                                r10 = AnonymousClass5L4.A01;
                                r5 = null;
                                r7 = AnonymousClass5LW.A00;
                            }
                        }
                        r3 = AnonymousClass5LZ.A02(r5, r6, r7, CoF, r9, r10);
                    }
                    AnonymousClass5L3 r02 = (AnonymousClass5L3) concurrentMap.putIfAbsent(cls, r3);
                    if (r02 != null) {
                        return r02;
                    }
                } else {
                    throw new IllegalArgumentException(Pxd.A00(528));
                }
            }
            return r3;
        }
        throw new NullPointerException("messageType");
    }
}
