package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4uQ  reason: invalid class name and case insensitive filesystem */
public class C277094uQ {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public final C67241sS A08;

    public final C250533lb A00() {
        ArrayList arrayList;
        Boolean bool = this.A00;
        Double d = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        Double d2 = this.A02;
        String str3 = this.A06;
        Double d3 = this.A03;
        List<DT2> list = this.A07;
        if (list != null) {
            arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (DT2 FD7 : list) {
                arrayList.add(FD7.FD7());
            }
        } else {
            arrayList = null;
        }
        return new C250533lb(bool, d, d2, d3, str, str2, str3, arrayList);
    }

    public C277094uQ(C67241sS r2) {
        this.A08 = r2;
        this.A00 = r2.B1J();
        this.A01 = r2.BPU();
        this.A04 = r2.Be8();
        this.A05 = r2.Be9();
        this.A02 = r2.BeX();
        this.A06 = r2.BiN();
        this.A03 = r2.C7G();
        this.A07 = r2.CCl();
    }
}
