package X;

import com.instagram.model.venue.LocationDict;

/* renamed from: X.Xdm  reason: case insensitive filesystem */
public abstract class C21520Xdm {
    public static final LocationDict A00(XMC xmc) {
        String str;
        XMC xmc2 = xmc;
        0qQ.A0B(xmc2, 0);
        String str2 = xmc2.A0E;
        String str3 = xmc2.A0F;
        String str4 = xmc2.A0G;
        Integer num = xmc2.A04;
        Integer num2 = xmc2.A05;
        Integer num3 = xmc2.A06;
        Long l = xmc2.A0A;
        String str5 = null;
        if (l != null) {
            str = l.toString();
        } else {
            str = null;
        }
        String str6 = xmc2.A0H;
        String str7 = xmc2.A0I;
        Long l2 = xmc2.A0B;
        if (l2 != null) {
            str5 = l2.toString();
        }
        Long l3 = xmc2.A0C;
        String str8 = xmc2.A0J;
        Boolean bool = xmc2.A00;
        Boolean bool2 = xmc2.A01;
        Float f = xmc2.A02;
        Float f2 = xmc2.A03;
        Integer num4 = xmc2.A07;
        String str9 = xmc2.A0K;
        Long l4 = xmc2.A0D;
        String str10 = xmc2.A0L;
        String str11 = xmc2.A0M;
        return new LocationDict(bool, bool2, f, f2, num, num2, num3, num4, xmc2.A08, xmc2.A09, l3, l4, str2, str3, str4, str, str6, str7, str5, str8, str9, str10, str11, xmc2.A0N);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.XMC, java.lang.Object] */
    public static final XMC A01(LocationDict locationDict) {
        ? obj = new Object();
        obj.A0E = null;
        obj.A0F = null;
        obj.A0G = null;
        obj.A04 = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0A = null;
        obj.A0H = null;
        obj.A0I = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0J = null;
        obj.A00 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A03 = null;
        obj.A07 = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0L = null;
        obj.A0M = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0N = null;
        obj.A0E = locationDict.A0C;
        obj.A0F = locationDict.A0D;
        obj.A0G = locationDict.A0E;
        obj.A04 = locationDict.A04;
        obj.A05 = locationDict.A05;
        obj.A06 = locationDict.A06;
        obj.A0A = C51972G9s.A0j(locationDict.A0F);
        obj.A0H = locationDict.A0G;
        obj.A0I = locationDict.A0H;
        obj.A0B = C51972G9s.A0i(locationDict.A0I);
        obj.A0C = locationDict.A0A;
        obj.A0J = locationDict.A0J;
        obj.A00 = locationDict.A00;
        obj.A01 = locationDict.A01;
        obj.A02 = locationDict.A02;
        obj.A03 = locationDict.A03;
        obj.A07 = locationDict.A07;
        obj.A0K = locationDict.A0K;
        obj.A0D = locationDict.A0B;
        obj.A0L = locationDict.A0L;
        obj.A0M = locationDict.A0M;
        obj.A08 = locationDict.A08;
        obj.A09 = locationDict.A09;
        obj.A0N = locationDict.A0N;
        return obj;
    }
}
