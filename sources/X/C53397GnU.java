package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Map;

/* renamed from: X.GnU  reason: case insensitive filesystem */
public final class C53397GnU extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final C56532I0d A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Map A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final Integer A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53397GnU) {
                C53397GnU gnU = (C53397GnU) obj;
                if (!(this.A0M == gnU.A0M && 0qQ.A0K(this.A0A, gnU.A0A) && 0qQ.A0K(this.A04, gnU.A04) && 0qQ.A0K(this.A08, gnU.A08) && 0qQ.A0K(this.A0B, gnU.A0B) && 0qQ.A0K(this.A07, gnU.A07) && 0qQ.A0K(this.A09, gnU.A09) && 0qQ.A0K(this.A06, gnU.A06) && 0qQ.A0K(this.A03, gnU.A03) && this.A0H == gnU.A0H && Float.compare(this.A00, gnU.A00) == 0 && Float.compare(this.A02, gnU.A02) == 0 && this.A0I == gnU.A0I && this.A0C == gnU.A0C && this.A0D == gnU.A0D && this.A0J == gnU.A0J && Float.compare(this.A01, gnU.A01) == 0 && this.A0K == gnU.A0K && this.A0F == gnU.A0F && this.A0G == gnU.A0G && this.A0L == gnU.A0L && 0qQ.A0K(this.A05, gnU.A05) && this.A0E == gnU.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A0M.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Failed";
                break;
            case 3:
                str = "Success";
                break;
            default:
                str = "Initial";
                break;
        }
        int A082 = AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A0A, C51968G9o.A0F(str, intValue)))))));
        return DbS.A06(this.A0E, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0H, (AnonymousClass7TF.A08(this.A06, A082) + AnonymousClass7TG.A0C(this.A03)) * 31), this.A00), this.A02))))), this.A01)))))));
    }

    public C53397GnU(ImageUrl imageUrl, ImageUrl imageUrl2, C56532I0d i0d, Integer num, String str, String str2, String str3, String str4, String str5, Map map, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A0M = num;
        this.A0A = str;
        this.A04 = imageUrl;
        this.A08 = str2;
        this.A0B = map;
        this.A07 = str3;
        this.A09 = str4;
        this.A06 = str5;
        this.A03 = imageUrl2;
        this.A0H = z;
        this.A00 = f;
        this.A02 = f2;
        this.A0I = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A0J = z5;
        this.A01 = f3;
        this.A0K = z6;
        this.A0F = z7;
        this.A0G = z8;
        this.A0L = z9;
        this.A05 = i0d;
        this.A0E = z10;
    }

    public static /* synthetic */ C53397GnU A00(ImageUrl imageUrl, ImageUrl imageUrl2, C56532I0d i0d, C53397GnU gnU, Integer num, String str, String str2, String str3, String str4, String str5, Map map, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = z10;
        int i2 = i;
        C56532I0d i0d2 = i0d;
        boolean z12 = z8;
        boolean z13 = z7;
        boolean z14 = z6;
        boolean z15 = z4;
        boolean z16 = z9;
        boolean z17 = z3;
        Integer num2 = num;
        float f4 = f3;
        String str6 = str;
        ImageUrl imageUrl3 = imageUrl;
        String str7 = str2;
        Map map2 = map;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        boolean z18 = z5;
        ImageUrl imageUrl4 = imageUrl2;
        boolean z19 = z;
        float f5 = f;
        float f6 = f2;
        boolean z20 = z2;
        C53397GnU gnU2 = gnU;
        if ((i & 1) != 0) {
            num2 = gnU2.A0M;
        }
        if ((i & 2) != 0) {
            str6 = gnU2.A0A;
        }
        if ((i & 4) != 0) {
            imageUrl3 = gnU2.A04;
        }
        if ((i & 8) != 0) {
            str7 = gnU2.A08;
        }
        if ((i & 16) != 0) {
            map2 = gnU2.A0B;
        }
        if ((i & 32) != 0) {
            str8 = gnU2.A07;
        }
        if ((i & 64) != 0) {
            str9 = gnU2.A09;
        }
        if ((i2 & 128) != 0) {
            str10 = gnU2.A06;
        }
        if ((i2 & 256) != 0) {
            imageUrl4 = gnU2.A03;
        }
        if ((i2 & 512) != 0) {
            z19 = gnU2.A0H;
        }
        if ((i2 & 1024) != 0) {
            f5 = gnU2.A00;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            f6 = gnU2.A02;
        }
        if ((i2 & 4096) != 0) {
            z20 = gnU2.A0I;
        }
        if ((i2 & 8192) != 0) {
            z17 = gnU2.A0C;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z15 = gnU2.A0D;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z18 = gnU2.A0J;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            f4 = gnU2.A01;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z14 = gnU2.A0K;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z13 = gnU2.A0F;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            z12 = gnU2.A0G;
        }
        if ((i & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            z16 = gnU2.A0L;
        }
        if ((i & 2097152) != 0) {
            i0d2 = gnU2.A05;
        }
        if ((i & 4194304) != 0) {
            z11 = gnU2.A0E;
        }
        AnonymousClass7TG.A1N(num2, str6);
        C51974G9v.A1S(imageUrl3, str7, map2, str8, str9);
        C51970G9q.A1N(str10, 7, i0d2);
        boolean z21 = z14;
        boolean z22 = z13;
        boolean z23 = z12;
        boolean z24 = z16;
        boolean z25 = z11;
        return new C53397GnU(imageUrl3, imageUrl4, i0d2, num2, str6, str7, str8, str9, str10, map2, f5, f6, f4, z19, z20, z17, z15, z18, z21, z22, z23, z24, z25);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53397GnU() {
        /*
            r25 = this;
            r3 = 0
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.String r6 = ""
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r6)
            X.0sm r11 = X.0Yt.A0E()
            r15 = 0
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            boolean r0 = X.AnonymousClass2Rc.A00
            r18 = r0 ^ 1
            r14 = 1128792064(0x43480000, float:200.0)
            X.0sn r1 = X.0sn.A00
            r0 = -1
            X.I0d r4 = new X.I0d
            r4.<init>(r1, r0)
            r1 = r25
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r17 = r15
            r19 = r18
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53397GnU.<init>():void");
    }
}
