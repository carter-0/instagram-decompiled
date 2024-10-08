package X;

import java.util.Map;

/* renamed from: X.FSj  reason: case insensitive filesystem */
public final class C50177FSj implements C13560TcZ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 1IX A01;

    public C50177FSj(String str, 1IX r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final void Df6(C11230SGo sGo, C8918RFl rFl, Map map) {
        String str;
        1IX r1;
        Object obj;
        RRR rrr = (RRR) map.get(this.A00);
        if (rrr != null) {
            str = rrr.A03();
        } else {
            str = null;
        }
        if (sGo.A00 != 0 || str == null) {
            r1 = this.A01;
            obj = C47859EKf.A00;
        } else {
            r1 = this.A01;
            obj = new C47857EKd(str);
        }
        r1.resumeWith(obj);
    }
}
