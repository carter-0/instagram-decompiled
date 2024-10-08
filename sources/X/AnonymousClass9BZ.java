package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.9BZ  reason: invalid class name */
public final class AnonymousClass9BZ {
    public static final AnonymousClass9BZ A02 = new AnonymousClass9BZ();
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final C374859Bb A01 = new C374859Bb();

    public final C374899Bg A00(Class cls) {
        Integer num;
        AnonymousClass9C3 r7;
        AnonymousClass9C4 r5;
        AnonymousClass9C0 r9;
        AnonymousClass9CE r4;
        AnonymousClass9C8 r6;
        AnonymousClass9C0 r2;
        AnonymousClass9CE r1;
        Class cls2;
        Charset charset = AnonymousClass97S.A04;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            C374899Bg r42 = (C374899Bg) concurrentMap.get(cls);
            if (r42 == null) {
                C374859Bb r12 = this.A01;
                AnonymousClass9C0 r0 = C374949Bl.A01;
                Class<AnonymousClass972> cls3 = AnonymousClass972.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C374949Bl.A02) == null || cls2.isAssignableFrom(cls)) {
                    AnonymousClass9C1 CoG = r12.A00.CoG(cls);
                    int i = CoG.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = C374949Bl.A01;
                            r1 = C39616A2g.A01;
                        } else {
                            r2 = C374949Bl.A00;
                            r1 = C39616A2g.A00;
                            if (r1 == null) {
                                throw new IllegalStateException(Pxd.A00(30));
                            }
                        }
                        r42 = new C40235AWz(CoG.A01, r1, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        if ((i & 1) != 0) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        int intValue = num.intValue();
                        boolean z = true;
                        if (intValue == 1) {
                            z = false;
                        }
                        if (isAssignableFrom) {
                            r7 = AnonymousClass9C2.A01;
                            r5 = AnonymousClass9C4.A01;
                            r9 = C374949Bl.A01;
                            if (z) {
                                r4 = C39616A2g.A01;
                                r6 = AnonymousClass9C7.A01;
                            } else {
                                r4 = null;
                                r6 = AnonymousClass9C7.A01;
                            }
                        } else {
                            r7 = AnonymousClass9C2.A00;
                            r5 = AnonymousClass9C4.A00;
                            r9 = C374949Bl.A00;
                            if (z) {
                                r4 = C39616A2g.A00;
                                if (r4 != null) {
                                    r6 = AnonymousClass9C7.A00;
                                } else {
                                    throw new IllegalStateException(Pxd.A00(30));
                                }
                            } else {
                                r4 = null;
                                r6 = AnonymousClass9C7.A00;
                            }
                        }
                        r42 = AnonymousClass9C9.A02(r4, r5, r6, r7, CoG, r9);
                    }
                    C374899Bg r02 = (C374899Bg) concurrentMap.putIfAbsent(cls, r42);
                    if (r02 != null) {
                        return r02;
                    }
                } else {
                    throw new IllegalArgumentException(Pxd.A00(529));
                }
            }
            return r42;
        }
        throw new NullPointerException("messageType");
    }
}
