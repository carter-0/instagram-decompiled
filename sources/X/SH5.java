package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class SH5 {
    public static final SH5 A02 = new SH5();
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final SDy A01 = new SDy();

    public final C13903TjQ A00(Class cls) {
        Integer num;
        C9749Rg7 rg7;
        C10899Rzz rzz;
        C10894Rzu rzu;
        C9748Rg6 rg6;
        C11309SKx sKx;
        C10894Rzu rzu2;
        C9748Rg6 rg62;
        Class cls2;
        Charset charset = SD9.A04;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            C13903TjQ tjQ = (C13903TjQ) concurrentMap.get(cls);
            if (tjQ == null) {
                SDy sDy = this.A01;
                C10894Rzu rzu3 = C11433SUe.A02;
                Class<R5b> cls3 = R5b.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C11433SUe.A03) == null || cls2.isAssignableFrom(cls)) {
                    C10704Rwi CoH = sDy.A00.CoH(cls);
                    int i = CoH.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            rzu2 = C11433SUe.A02;
                            rg62 = C10095RmX.A01;
                        } else {
                            rzu2 = C11433SUe.A00;
                            rg62 = C10095RmX.A00;
                            if (rg62 == null) {
                                throw AnonymousClass7TE.A0z("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        tjQ = new T5M(CoH.A01, rg62, rzu2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        if ((i & 1) == 1) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
                        if (isAssignableFrom) {
                            rg7 = C10097RmZ.A01;
                            rzz = C10899Rzz.A01;
                            rzu = C11433SUe.A02;
                            if (A1W) {
                                rg6 = C10095RmX.A01;
                                sKx = C10096RmY.A01;
                            } else {
                                rg6 = null;
                                sKx = C10096RmY.A01;
                            }
                        } else {
                            rg7 = C10097RmZ.A00;
                            rzz = C10899Rzz.A00;
                            if (A1W) {
                                rzu = C11433SUe.A00;
                                rg6 = C10095RmX.A00;
                                if (rg6 != null) {
                                    sKx = C10096RmY.A00;
                                } else {
                                    throw AnonymousClass7TE.A0z("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                rzu = C11433SUe.A01;
                                rg6 = null;
                                sKx = C10096RmY.A00;
                            }
                        }
                        tjQ = T5N.A0C(rg6, rzz, sKx, rg7, CoH, rzu);
                    }
                    C13903TjQ tjQ2 = (C13903TjQ) concurrentMap.putIfAbsent(cls, tjQ);
                    if (tjQ2 != null) {
                        return tjQ2;
                    }
                } else {
                    throw AnonymousClass7TE.A0w("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
            }
            return tjQ;
        }
        throw AnonymousClass7TE.A11("messageType");
    }
}
