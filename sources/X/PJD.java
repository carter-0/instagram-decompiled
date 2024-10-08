package X;

import com.instagram.user.model.User;
import java.util.List;

public final class PJD implements C74358PtY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ C71968Ott A02;
    public final /* synthetic */ C68050MzH A03;
    public final /* synthetic */ C70963OTk A04;
    public final /* synthetic */ NR1 A05;

    public PJD(C53401GnY gnY, C71968Ott ott, C68050MzH mzH, C70963OTk oTk, NR1 nr1, int i) {
        this.A05 = nr1;
        this.A03 = mzH;
        this.A04 = oTk;
        this.A01 = gnY;
        this.A02 = ott;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.NR1, android.view.View] */
    public final void D5v(boolean z) {
        ? r1 = this.A05;
        r1.A04 = false;
        r1.A0I();
        r1.setVisibility(8);
        C68050MzH mzH = this.A03;
        mzH.A01.removeView(r1);
        C70963OTk oTk = this.A04;
        C68478NJv nJv = oTk.A02;
        C53401GnY gnY = this.A01;
        C71968Ott ott = this.A02;
        List list = ott.A01;
        int i = this.A00;
        boolean z2 = !z;
        0qQ.A0B(gnY, 0);
        C68478NJv.A03(nJv).A02((C53401GnY) 00k.A0O(list, i + 1), (User) gnY.A01);
        AnonymousClass36N A032 = C68478NJv.A03(nJv);
        String str = gnY.A04;
        0qQ.A0B(str, 0);
        A032.A04.A01.add(str);
        if (z2) {
            C359098c0.A02(C69468NmC.TAP_NEXT_QUICKSNAP, A032.A03, (String) null);
        }
        C70963OTk.A00(ott, mzH, oTk, i + 3);
        mzH.A01();
    }
}
