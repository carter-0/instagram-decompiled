package X;

import java.util.List;

public final class S46 {
    public final List A00;
    public final C13900TjN[] A01;

    public final void A01(YBZ ybz, SR8 sr8) {
        boolean z;
        int i = 0;
        while (true) {
            C13900TjN[] tjNArr = this.A01;
            if (i < tjNArr.length) {
                sr8.A03();
                SR8.A02(sr8);
                C13900TjN FHV = ybz.FHV(sr8.A00, 3);
                SJM sjm = (SJM) this.A00.get(i);
                String str = sjm.A0Y;
                if (!"application/cea-608".equals(str)) {
                    z = false;
                    if (!"application/cea-708".equals(str)) {
                        C11366SPh.A03(z, 002.A0R("Invalid closed caption MIME type provided: ", str));
                        SOW A002 = SOW.A00();
                        SR8.A02(sr8);
                        A002.A0T = sr8.A01;
                        A002.A01(str);
                        A002.A0H = sjm.A0J;
                        A002.A0V = sjm.A0X;
                        A002.A02 = sjm.A03;
                        A002.A0X = sjm.A0Z;
                        C13900TjN.A00(A002, FHV);
                        tjNArr[i] = FHV;
                        i++;
                    }
                }
                z = true;
                C11366SPh.A03(z, 002.A0R("Invalid closed caption MIME type provided: ", str));
                SOW A0022 = SOW.A00();
                SR8.A02(sr8);
                A0022.A0T = sr8.A01;
                A0022.A01(str);
                A0022.A0H = sjm.A0J;
                A0022.A0V = sjm.A0X;
                A0022.A02 = sjm.A03;
                A0022.A0X = sjm.A0Z;
                C13900TjN.A00(A0022, FHV);
                tjNArr[i] = FHV;
                i++;
            } else {
                return;
            }
        }
    }

    public S46(List list) {
        this.A00 = list;
        this.A01 = new C13900TjN[list.size()];
    }

    public final void A00(C11389SRd sRd, long j) {
        if (Pxe.A06(sRd) >= 9) {
            int A012 = sRd.A01();
            int A013 = sRd.A01();
            int A05 = sRd.A05();
            if (A012 == 434 && A013 == 1195456820 && A05 == 3) {
                C11053S7y.A01(sRd, this.A01, j);
            }
        }
    }
}
