package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.Arrays;

/* renamed from: X.82j  reason: invalid class name and case insensitive filesystem */
public final class C3499082j {
    public int A00;
    public NewFundraiserInfo A01;
    public AE3 A02;
    public AE3 A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C3499082j(NewFundraiserInfo newFundraiserInfo, AE3 ae3, AE3 ae32, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A09 = str6;
        this.A08 = str5;
        ae32.getClass();
        this.A03 = ae32;
        this.A07 = str4;
        this.A01 = newFundraiserInfo;
        this.A04 = str;
        this.A06 = str3;
        this.A02 = ae3;
        this.A05 = str2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3499082j r5 = (C3499082j) obj;
            if (!2Ob.A00(this.A09, r5.A09) || !2Ob.A00(this.A08, r5.A08) || !2Ob.A00(this.A03, r5.A03) || !2Ob.A00(this.A07, r5.A07) || !2Ob.A00(this.A01, r5.A01) || !2Ob.A00(this.A04, r5.A04) || !2Ob.A00(this.A06, r5.A06) || !2Ob.A00(this.A02, r5.A02) || !2Ob.A00(this.A05, r5.A05) || !2Ob.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A08, this.A03, this.A07, this.A01, this.A04, this.A06, this.A02, this.A05});
    }

    public C3499082j() {
    }
}
