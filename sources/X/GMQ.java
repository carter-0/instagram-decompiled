package X;

import java.util.List;
import java.util.Map;

public final class GMQ extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public GMQ(C243673Zt r3, C243673Zt r4, C243673Zt r5, C243673Zt r6, C243673Zt r7, C243673Zt r8, C243673Zt r9) {
        this.A00 = 2;
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        C51974G9v.A0d(3, r5, r6, r7, r8);
        0qQ.A0B(r9, 7);
        this.A06 = r3;
        this.A07 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A05 = r9;
    }

    public static /* synthetic */ GMQ A00(GMQ gmq, 1Xj r9, C54662HMt hMt, Integer num, List list, List list2, List list3, Map map, int i) {
        Map map2 = map;
        Integer num2 = num;
        C54662HMt hMt2 = hMt;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        1Xj r1 = r9;
        if ((i & 1) != 0) {
            r1 = (1Xj) gmq.A05;
        }
        if ((i & 2) != 0) {
            list6 = (List) gmq.A02;
        }
        if ((i & 4) != 0) {
            list5 = (List) gmq.A06;
        }
        if ((i & 8) != 0) {
            list4 = (List) gmq.A03;
        }
        if ((i & 16) != 0) {
            hMt2 = (C54662HMt) gmq.A01;
        }
        if ((i & 32) != 0) {
            num2 = (Integer) gmq.A04;
        }
        if ((i & 64) != 0) {
            map2 = (Map) gmq.A07;
        }
        0qQ.A0B(list6, 1);
        C51974G9v.A1S(list5, list4, hMt2, num2, map2);
        return new GMQ(r1, hMt2, num2, list6, list5, list4, map2);
    }

    public final boolean A01() {
        Number number = (Number) this.A03;
        if (number == null || ((long) number.doubleValue()) - System.currentTimeMillis() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GMQ) {
                    GMQ gmq = (GMQ) obj;
                    if (gmq.A00 == 1 && this.A04 == gmq.A04 && this.A06 == gmq.A06 && this.A02 == gmq.A02 && 0qQ.A0K(this.A05, gmq.A05) && 0qQ.A0K(this.A01, gmq.A01) && 0qQ.A0K(this.A07, gmq.A07)) {
                        obj2 = this.A03;
                        obj3 = gmq.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 3:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GMQ) {
                    GMQ gmq2 = (GMQ) obj;
                    if (gmq2.A00 == 3 && 0qQ.A0K(this.A07, gmq2.A07) && 0qQ.A0K(this.A02, gmq2.A02) && 0qQ.A0K(this.A03, gmq2.A03) && 0qQ.A0K(this.A04, gmq2.A04) && 0qQ.A0K(this.A01, gmq2.A01) && 0qQ.A0K(this.A05, gmq2.A05)) {
                        obj2 = this.A06;
                        obj3 = gmq2.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 4:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GMQ) {
                    GMQ gmq3 = (GMQ) obj;
                    if (gmq3.A00 == 4 && 0qQ.A0K(this.A05, gmq3.A05) && 0qQ.A0K(this.A02, gmq3.A02) && 0qQ.A0K(this.A06, gmq3.A06) && 0qQ.A0K(this.A03, gmq3.A03) && this.A01 == gmq3.A01 && this.A04 == gmq3.A04) {
                        obj2 = this.A07;
                        obj3 = gmq3.A07;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                return super.equals(obj);
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object obj;
        String str;
        int hashCode;
        String str2;
        switch (this.A00) {
            case 1:
                Integer num = (Integer) this.A04;
                int A0D = C51971G9r.A0D(num, HSR.A00(num)) * 31;
                int A0M = AnonymousClass7TE.A0M(this.A06);
                switch (A0M) {
                    case 1:
                        str = "NAVIGATION";
                        break;
                    case 2:
                        str = "VIEW";
                        break;
                    default:
                        str = "CLICK";
                        break;
                }
                int A0F = C51971G9r.A0F(str, A0M, A0D);
                Integer num2 = (Integer) this.A02;
                int A0B = AnonymousClass7TG.A0B(num2, HSS.A00(num2), A0F);
                C62230ry r0 = (C62230ry) this.A05;
                if (r0 == null) {
                    hashCode = 0;
                } else {
                    hashCode = r0.hashCode();
                }
                i = AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A01, (A0B + hashCode) * 31));
                obj = this.A03;
                break;
            case 3:
                return (((((((((((AnonymousClass7TG.A0C(this.A07) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06);
            case 4:
                int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0C(this.A05) * 31))));
                int A0M2 = AnonymousClass7TE.A0M(this.A04);
                switch (A0M2) {
                    case 1:
                        str2 = "LOADING";
                        break;
                    case 2:
                        str2 = "LOADED";
                        break;
                    default:
                        str2 = "INITIAL";
                        break;
                }
                i = C51971G9r.A0F(str2, A0M2, A072);
                obj = this.A07;
                break;
            default:
                return super.hashCode();
        }
        return AnonymousClass7TE.A0N(obj, i);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OxEnrichedEvent(name=");
        Integer num = (Integer) this.A04;
        if (num != null) {
            str = HSR.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", type=");
        Number number = (Number) this.A06;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str2 = "NAVIGATION";
                    break;
                case 2:
                    str2 = "VIEW";
                    break;
                default:
                    str2 = "CLICK";
                    break;
            }
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(AnonymousClass000.A00(2006));
        Integer num2 = (Integer) this.A02;
        if (num2 != null) {
            str3 = HSS.A00(num2);
        } else {
            str3 = "null";
        }
        A1A.append(str3);
        A1A.append(", state=");
        A1A.append(this.A05);
        A1A.append(", appInfo=");
        A1A.append(this.A01);
        A1A.append(", utm=");
        A1A.append(this.A07);
        A1A.append(AnonymousClass000.A00(2015));
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public GMQ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
    }

    public GMQ(1Xj r2, C54662HMt hMt, Integer num, List list, List list2, List list3, Map map) {
        this.A00 = 4;
        this.A05 = r2;
        this.A02 = list;
        this.A06 = list2;
        this.A03 = list3;
        this.A01 = hMt;
        this.A04 = num;
        this.A07 = map;
    }

    public GMQ(SOK sok, RRG rrg, Integer num, Integer num2, Integer num3, Map map, C62230ry r8) {
        this.A00 = 1;
        DbZ.A0t(1, num, num2, num3);
        this.A04 = num;
        this.A06 = num2;
        this.A02 = num3;
        this.A05 = r8;
        this.A01 = rrg;
        this.A07 = sok;
        this.A03 = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GMQ() {
        /*
            r9 = this;
            r0 = 4
            r1 = r9
            r9.A00 = r0
            r2 = 0
            X.0sn r5 = X.0sn.A00
            X.HMt r3 = X.C54662HMt.ALL
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.0sm r8 = X.0Yt.A0E()
            r6 = r5
            r7 = r5
            r1.<init>((X.1Xj) r2, (X.C54662HMt) r3, (java.lang.Integer) r4, (java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (java.util.Map) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMQ.<init>():void");
    }
}
