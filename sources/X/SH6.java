package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class SH6 {
    public static final SH6 A02 = new SH6();
    public final SDz A00 = new SDz();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public final C13807ThW A00(Object obj) {
        Integer num;
        C9753RgB rgB;
        C10101Rmd rmd;
        C9755RgD rgD;
        C9751Rg9 rg9;
        C9752RgA rgA;
        C9755RgD rgD2;
        C9751Rg9 rg92;
        Class cls;
        Class<?> cls2 = obj.getClass();
        Charset charset = SDA.A04;
        if (cls2 != null) {
            ConcurrentMap concurrentMap = this.A01;
            C13807ThW thW = (C13807ThW) concurrentMap.get(cls2);
            if (thW == null) {
                SDz sDz = this.A00;
                C9755RgD rgD3 = SD1.A02;
                Class<R5n> cls3 = R5n.class;
                if (cls3.isAssignableFrom(cls2) || (cls = SD1.A03) == null || cls.isAssignableFrom(cls2)) {
                    C10705Rwj CoI = sDz.A00.CoI(cls2);
                    int i = CoI.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls2)) {
                            rgD2 = SD1.A02;
                            rg92 = C10100Rmc.A01;
                        } else {
                            rgD2 = SD1.A00;
                            rg92 = C10100Rmc.A00;
                            if (rg92 == null) {
                                throw AnonymousClass7TE.A0z("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        thW = new T5U(CoI.A01, rg92, rgD2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls2);
                        if ((i & 1) == 1) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
                        if (isAssignableFrom) {
                            rgB = C10103Rmf.A01;
                            rmd = C10101Rmd.A01;
                            rgD = SD1.A02;
                            if (A1W) {
                                rg9 = C10100Rmc.A01;
                                rgA = C10102Rme.A01;
                            } else {
                                rg9 = null;
                                rgA = C10102Rme.A01;
                            }
                        } else {
                            rgB = C10103Rmf.A00;
                            rmd = C10101Rmd.A00;
                            if (A1W) {
                                rgD = SD1.A00;
                                rg9 = C10100Rmc.A00;
                                if (rg9 != null) {
                                    rgA = C10102Rme.A00;
                                } else {
                                    throw AnonymousClass7TE.A0z("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                rgD = SD1.A01;
                                rg9 = null;
                                rgA = C10102Rme.A00;
                            }
                        }
                        thW = T5V.A00(rg9, rmd, rgA, rgB, CoI, rgD);
                    }
                    C13807ThW thW2 = (C13807ThW) concurrentMap.putIfAbsent(cls2, thW);
                    if (thW2 != null) {
                        return thW2;
                    }
                } else {
                    throw AnonymousClass7TE.A0w("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
            }
            return thW;
        }
        throw AnonymousClass7TE.A11("messageType");
    }
}
