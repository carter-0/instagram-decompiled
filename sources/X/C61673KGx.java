package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.KGx  reason: case insensitive filesystem */
public final class C61673KGx extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61673KGx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                return;
            case 2:
                0qQ.A0B(exc, 0);
                C63876LAf lAf = (C63876LAf) this.A02;
                L43 l43 = lAf.A02;
                if (l43 != null) {
                    l43.A01.APc();
                    l43.A00.DWa();
                }
                lAf.A02 = null;
                return;
            case 3:
                OWV owv = (OWV) this.A02;
                OWV.A00(C290635fd.A00(owv.A0F), owv);
                owv.A01.post(new M4B((2Cn) this.A01));
                return;
            default:
                C61673KGx.super.onFail(exc);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                C352218Cl r7 = (C352218Cl) obj;
                0qQ.A0B(r7, 0);
                C3507486a r5 = (C3507486a) this.A02;
                r5.A02.A01(r7.A07, r7.A06(), true);
                JTS.A12(r5.A00);
                if (182.A06(0Tu.A05, (0lg) this.A01, 36327627958729289L)) {
                    MHA.A03(r5, C318116oQ.A00(r5), 47);
                    return;
                }
                return;
            case 1:
                C347987xh r72 = (C347987xh) obj;
                0qQ.A0B(r72, 0);
                for (Medium A04 : r72.A01) {
                    ((C355608Qq) this.A01).A04(A04, (C348257y9) this.A02);
                }
                return;
            case 2:
                File file = (File) obj;
                0qQ.A0B(file, 0);
                C63876LAf lAf = (C63876LAf) this.A02;
                ((C40607Aev) this.A01).A06 = C282665Eg.A03(file, 3, 0);
                lAf.A03 = false;
                L43 l43 = lAf.A02;
                if (l43 != null) {
                    l43.A01.APc();
                    l43.A00.DWb();
                }
                lAf.A02 = null;
                return;
            default:
                C290645fe r73 = (C290645fe) obj;
                0qQ.A0B(r73, 0);
                OWV owv = (OWV) this.A02;
                OWV.A00(r73, owv);
                owv.A01.post(new M4B((2Cn) this.A01));
                return;
        }
    }
}
