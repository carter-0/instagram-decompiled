package X;

import java.util.AbstractMap;

public final class SFW {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static void A00(String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(str, new SFW(str, str2, false, false, false, true));
    }

    public SFW(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
    }
}
