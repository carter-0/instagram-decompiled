package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* renamed from: X.Xc6  reason: case insensitive filesystem */
public class C21473Xc6 {
    public Boolean A00;
    public Float A01;
    public Float A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public final LocationDictIntf A0O;

    public final LocationDict A00() {
        String str = this.A04;
        String str2 = this.A0G;
        String str3 = this.A0H;
        Integer num = this.A09;
        Integer num2 = this.A0A;
        Integer num3 = this.A0B;
        String str4 = this.A05;
        String str5 = this.A0I;
        String str6 = this.A06;
        String str7 = this.A0J;
        Long l = this.A0F;
        String str8 = this.A0K;
        Boolean bool = this.A00;
        Boolean bool2 = this.A08;
        Float f = this.A01;
        Float f2 = this.A02;
        Integer num4 = this.A0C;
        String str9 = this.A07;
        Long l2 = this.A03;
        String str10 = this.A0L;
        String str11 = this.A0M;
        Integer num5 = this.A0D;
        Integer num6 = num3;
        String str12 = str3;
        return new LocationDict(bool, bool2, f, f2, num, num2, num6, num4, num5, this.A0E, l, l2, str, str2, str12, str4, str5, str6, str7, str8, str9, str10, str11, this.A0N);
    }

    public C21473Xc6(LocationDictIntf locationDictIntf) {
        this.A0O = locationDictIntf;
        this.A04 = locationDictIntf.getAddress();
        this.A0G = locationDictIntf.getCategory();
        this.A0H = locationDictIntf.getCity();
        this.A09 = locationDictIntf.AsB();
        this.A0A = locationDictIntf.B1c();
        this.A0B = locationDictIntf.B2G();
        this.A05 = locationDictIntf.B39();
        this.A0I = locationDictIntf.B3A();
        this.A06 = locationDictIntf.getExternalSource();
        this.A0J = locationDictIntf.B3X();
        this.A0F = locationDictIntf.B3Y();
        this.A0K = locationDictIntf.B7n();
        this.A00 = locationDictIntf.BCR();
        this.A08 = locationDictIntf.CRz();
        this.A01 = locationDictIntf.BLV();
        this.A02 = locationDictIntf.BNV();
        this.A0C = locationDictIntf.BTM();
        this.A07 = locationDictIntf.getName();
        this.A03 = locationDictIntf.Bcn();
        this.A0L = locationDictIntf.getProfilePicUrl();
        this.A0M = locationDictIntf.getShortName();
        this.A0D = locationDictIntf.Bym();
        this.A0E = locationDictIntf.C7L();
        this.A0N = locationDictIntf.C7d();
    }
}
