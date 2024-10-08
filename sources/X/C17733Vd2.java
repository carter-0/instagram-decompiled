package X;

import android.location.Location;
import java.util.List;

/* renamed from: X.Vd2  reason: case insensitive filesystem */
public final class C17733Vd2 {
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public final int A04;
    public final Location A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final 0sP A0E;
    public final boolean A0F;
    public final Location A0G;

    public C17733Vd2(Location location, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, 0sP r14, int i, boolean z) {
        this.A0D = str;
        this.A08 = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A07 = str5;
        this.A04 = i;
        this.A09 = str6;
        this.A0F = z;
        this.A0G = location;
        this.A0E = r14;
        this.A0A = str7;
        this.A02 = str8;
        this.A01 = str9;
        this.A00 = str10;
        this.A03 = list;
        this.A06 = 002.A0T(str, str4, ':');
        this.A05 = 1Wr.performIntegrityChecks(location);
    }
}
