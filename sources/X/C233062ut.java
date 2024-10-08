package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ut  reason: invalid class name and case insensitive filesystem */
public final class C233062ut implements C233072uu {
    public final /* synthetic */ C233002un A00;

    public final void CsF(int i) {
    }

    public final void D67() {
    }

    public final C268314dB Dlz(Integer num, List list) {
        C268314dB Dlz;
        C233052us r3;
        int i;
        int intValue;
        0qQ.A0B(list, 0);
        0qQ.A0B(num, 1);
        C233002un r2 = this.A00;
        if (r2.A0L == AnonymousClass05K.A00) {
            int i2 = r2.A02;
            if (i2 != 0 && i2 != -1) {
                r2.A0E = true;
                0sn r1 = 0sn.A00;
                return new C268314dB(r1, r1);
            } else if (!list.isEmpty()) {
                AnonymousClass3W1 r0 = r2.A05;
                Long l = null;
                if (r0 == null) {
                    0qQ.A0F("seedMediaMediaState");
                    throw AnonymousClass00P.createAndThrow();
                }
                r0.A2O = true;
                C54077Gz1 gz1 = r2.A08;
                if (gz1 != null) {
                    if (C55043HbE.A00(r2.A0I, gz1)) {
                        r3 = C233052us.FEED_POST_AD_CLICK_SINGLE_AD;
                    } else {
                        r3 = C233052us.FEED_POST_AD_CLICK_MULTI_ADS;
                    }
                    Map map = r2.A0D;
                    Number number = (Number) map.get(r3);
                    if (number != null) {
                        i = number.intValue();
                    } else {
                        i = 0;
                    }
                    map.put(r3, Integer.valueOf(i + 1));
                    C230282pK r4 = r2.A0K;
                    int i3 = r2.A03;
                    if (gz1.A02() == AnonymousClass05K.A01) {
                        intValue = r2.A01;
                    } else {
                        Integer num2 = gz1.A01().A0G;
                        if (num2 != null) {
                            intValue = num2.intValue();
                        }
                        r4.A0H(gz1, (Integer) r2.A0D.get(r3), l, "server_delivered_iaa", i3);
                    }
                    l = Long.valueOf((long) intValue);
                    r4.A0H(gz1, (Integer) r2.A0D.get(r3), l, "server_delivered_iaa", i3);
                }
            }
        }
        C233072uu r02 = r2.A0A;
        if (!(r02 == null || (Dlz = r02.Dlz(num, list)) == null)) {
            return Dlz;
        }
        0sn r12 = 0sn.A00;
        return new C268314dB(r12, r12);
    }

    public C233062ut(C233002un r1) {
        this.A00 = r1;
    }

    public final Map Bk0() {
        return new LinkedHashMap();
    }

    public final /* synthetic */ C268314dB Dm0(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(C273654mx.A00(11));
    }
}
