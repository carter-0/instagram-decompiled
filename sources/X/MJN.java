package X;

import java.util.Queue;

public final class MJN extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJN(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A01 = i;
        this.A04 = str5;
        this.A03 = str6;
        this.A05 = str7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        Queue queue;
        switch (this.A00) {
            case 0:
                queue = ((2BJ) this.A02).A01;
                String str = this.A09;
                String str2 = this.A06;
                String str3 = this.A08;
                String str4 = this.A07;
                int i = this.A01;
                String str5 = this.A04;
                String str6 = this.A03;
                if (str6 == null) {
                    str6 = "null";
                }
                String str7 = this.A05;
                if (str7 == null) {
                    str7 = "null";
                }
                obj = new C61312K1z(str, str2, str3, str4, str5, str6, str7, i);
                break;
            case 1:
                queue = ((2BJ) this.A02).A01;
                obj = new K20(this.A04, this.A08, this.A03, this.A09, this.A06, this.A07, this.A05, this.A01);
                break;
            default:
                ((C299665vd) this.A02).DbQ(this.A05, this.A07, this.A06, this.A03, this.A09, this.A08, this.A04, this.A01);
                break;
        }
        queue.add(obj);
        return C60340gF.A00;
    }
}
