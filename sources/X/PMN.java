package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

public final class PMN implements C74361Ptb {
    public IgTextView A00;
    public IgTextView A01;
    public N9R A02;
    public boolean A03;
    public final View A04;
    public final OA2 A05;
    public final AnonymousClass0eM A06 = C73922Pm2.A01(this, 8);
    public final AnonymousClass0eM A07 = C73922Pm2.A01(this, 9);

    public static final void A00(PMN pmn) {
        String str;
        String str2;
        String str3;
        IgTextView igTextView = pmn.A00;
        if (igTextView == null) {
            str3 = "primaryButtonView";
        } else {
            N9R n9r = pmn.A02;
            if (n9r == null || (str = n9r.A01) == null) {
                str = "";
            }
            igTextView.setText(str);
            IgTextView igTextView2 = pmn.A01;
            if (igTextView2 == null) {
                str3 = "secondaryButtonView";
            } else {
                N9R n9r2 = pmn.A02;
                if (n9r2 == null || (str2 = n9r2.A02) == null) {
                    str2 = "";
                }
                igTextView2.setText(str2);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9R n9r = (N9R) pry;
        0qQ.A0B(n9r, 0);
        this.A02 = n9r;
        if (this.A03) {
            A00(this);
            0nA.A0X(C66581MXm.A0B(this.A06), n9r.A00);
        }
    }

    public PMN(View view, OA2 oa2) {
        this.A04 = view;
        this.A05 = oa2;
    }
}
