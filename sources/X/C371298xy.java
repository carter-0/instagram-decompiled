package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8xy  reason: invalid class name and case insensitive filesystem */
public final class C371298xy {
    public C312596el A00;
    public String A01;
    public final C372148zp A02;
    public final C371698yt A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final HashMap A0I;
    public final List A0J;
    public final Map A0K;

    public C371298xy(C372148zp r2, C371698yt r3, C312596el r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, HashMap hashMap, List list, Map map) {
        this.A0I = hashMap;
        this.A0F = str13;
        this.A0G = str14;
        this.A0D = str11;
        this.A0E = str12;
        this.A06 = str4;
        this.A0A = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = r4;
        this.A03 = r3;
        this.A0K = map;
        this.A09 = str7;
        this.A0H = str15;
        this.A08 = str6;
        this.A0J = list;
        this.A02 = r2;
        this.A01 = str3;
        this.A07 = str5;
    }

    public final boolean A00(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C371298xy r5 = (C371298xy) obj;
        return 2Ob.A00(this.A0I, r5.A0I) && 2Ob.A00(this.A0F, r5.A0F) && 2Ob.A00(this.A0G, r5.A0G) && 2Ob.A00(this.A0D, r5.A0D) && 2Ob.A00(this.A0E, r5.A0E) && 2Ob.A00(this.A09, r5.A09) && 2Ob.A00(this.A0H, r5.A0H) && 2Ob.A00(this.A08, r5.A08) && 2Ob.A00(this.A06, r5.A06) && 2Ob.A00(this.A0A, r5.A0A) && 2Ob.A00(this.A0B, r5.A0B) && 2Ob.A00(this.A0C, r5.A0C) && 2Ob.A00(this.A0K, r5.A0K) && 2Ob.A00(this.A04, r5.A04) && 2Ob.A00(this.A05, r5.A05) && 2Ob.A00(this.A0J, r5.A0J) && this.A00 == r5.A00 && 2Ob.A00(this.A02, r5.A02) && 2Ob.A00(this.A03, r5.A03) && 2Ob.A00(this.A07, r5.A07);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbMsqrdConfig{hashCode=");
        sb.append(hashCode());
        sb.append(" effectId=");
        sb.append(this.A0A);
        sb.append(" effectInstanceId=");
        sb.append(this.A0B);
        sb.append(" effectName=");
        sb.append(this.A0C);
        sb.append(" effectSessionId=");
        sb.append(this.A07);
        sb.append(" deliveryOperationId=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}
