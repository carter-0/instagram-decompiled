package X;

import android.os.Bundle;

/* renamed from: X.Sdh  reason: case insensitive filesystem */
public final class C11639Sdh implements AnonymousClass2gO {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ 2Fk A01;
    public final /* synthetic */ QDE A02;
    public final /* synthetic */ C11330SNj A03;
    public final /* synthetic */ String A04;

    public C11639Sdh(Bundle bundle, 2Fk r2, QDE qde, C11330SNj sNj, String str) {
        this.A02 = qde;
        this.A01 = r2;
        this.A04 = str;
        this.A03 = sNj;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SUj sUj = (SUj) obj;
        Throwable th = sUj.A02;
        if (th instanceof C13223TQo) {
            int i = ((C13223TQo) th).A00;
            if (i == 7 || i == 9 || i == 13) {
                QDE qde = this.A02;
                qde.A03.A0D(this.A01);
                SR4 sr4 = (SR4) qde.A05.A02();
                if (sr4 != null) {
                    ((C11001S4v) sr4.A01).A00();
                }
                qde.A02(this.A00, this.A04, this.A03.A06);
                return;
            } else if (i == 104) {
                return;
            }
        }
        this.A02.A03.A0A(SUj.A06(sUj, Boolean.valueOf(SUj.A0V(sUj))));
    }
}
