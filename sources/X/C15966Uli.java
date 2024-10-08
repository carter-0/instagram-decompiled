package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uli  reason: case insensitive filesystem */
public final class C15966Uli extends C48220Eb1 {
    public ImageUrl A00;
    public ImageUrl A01;
    public C16584Uxe A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0G = new ArrayList(0);
    public boolean A0H = false;

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A0E2 = (((((((((((((((((((((((((((((this.A0H ? 1 : 0) * true) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A03)) * 31) + JTR.A0G(this.A0B)) * 31) + JTR.A0G(this.A0C)) * 31) + JTR.A0G(this.A0D)) * 31) + JTR.A0G(this.A0E)) * 31) + JTR.A0G(this.A0F)) * 31) + JTR.A0G(this.A05)) * 31) + JTR.A0G(this.A09)) * 31) + JTR.A0G(this.A08)) * 31) + JTR.A0G(this.A0A)) * 31) + JTR.A0G(this.A07)) * 31) + C51971G9r.A0E(this.A02)) * 31;
        List list = this.A0G;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int A0E3 = (((A0E2 + i) * 31) + C51971G9r.A0E(this.A00)) * 31;
        String str = this.A06;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0E3 + i2;
    }
}
