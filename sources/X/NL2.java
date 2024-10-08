package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class NL2 extends C331047Ph {
    public List A00;
    public List A01;
    public final Context A02;
    public final NLW A03;
    public final NLS A04;
    public final C67796Mv0 A05;
    public final C47601E9n A06;
    public final C47601E9n A07;

    public NL2(Context context, NKT nkt, C74476PvW pvW) {
        this.A02 = context;
        C47601E9n e9n = new C47601E9n(context);
        this.A07 = e9n;
        NLS nls = new NLS(context);
        this.A04 = nls;
        C47601E9n e9n2 = new C47601E9n(context);
        this.A06 = e9n2;
        NLW nlw = new NLW(context, nkt);
        this.A03 = nlw;
        this.A05 = new C67796Mv0(context, pvW);
        A0B(e9n, nls, e9n2, nlw);
    }

    public final void A0C(NHD nhd) {
        int i;
        A06();
        List list = nhd.A01;
        this.A01 = list;
        this.A00 = nhd.A00;
        if (!list.isEmpty()) {
            for (C70972OTt oTt : this.A01) {
                oTt.A0B = true;
            }
            A08(this.A07, this.A02.getString(2131965572));
            C67796Mv0 mv0 = this.A05;
            mv0.A00 = this.A01;
            A08(this.A04, mv0);
        }
        if (!this.A00.isEmpty()) {
            Iterator it = this.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ((C70972OTt) it.next()).A0B = false;
            }
            A08(this.A06, this.A02.getString(2131965566));
            for (i = 0; i < this.A00.size(); i++) {
                C70972OTt oTt2 = (C70972OTt) this.A00.get(i);
                oTt2.A02 = i;
                A08(this.A03, oTt2);
            }
        }
        A07();
    }
}
