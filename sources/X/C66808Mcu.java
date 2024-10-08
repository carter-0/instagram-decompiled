package X;

import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Mcu  reason: case insensitive filesystem */
public final class C66808Mcu implements C74351PtR {
    public final /* synthetic */ C66775McL A00;
    public final /* synthetic */ C66811Mcx A01;
    public final /* synthetic */ C66819MdB A02;
    public final /* synthetic */ C66809Mcv A03;

    public C66808Mcu(C66775McL mcL, C66811Mcx mcx, C66819MdB mdB, C66809Mcv mcv) {
        this.A02 = mdB;
        this.A00 = mcL;
        this.A03 = mcv;
        this.A01 = mcx;
    }

    public final void Dmr(Integer num) {
        IgProgressImageView igProgressImageView;
        int A032 = C51967G9n.A03(num, 0);
        if (A032 == 3) {
            this.A02.Ddt();
            this.A00.A09.setBackgroundColor(0);
        } else if (A032 == 4) {
            this.A02.Ddu();
            C66809Mcv mcv = this.A03;
            if (mcv.A03 != 29 || !mcv.A0H || !AnonymousClass7TF.A1Z(this.A01.A03.A1P)) {
                C66775McL mcL = this.A00;
                View view = mcL.A03;
                0nA.A0W(view, 8388661);
                igProgressImageView = mcL.A09;
                igProgressImageView.setErrorMode(C242463Uf.RETRY_ICON);
                view.setVisibility(8);
            } else {
                C66775McL mcL2 = this.A00;
                View view2 = mcL2.A03;
                0nA.A0W(view2, 17);
                igProgressImageView = mcL2.A09;
                igProgressImageView.setErrorMode(C242463Uf.A02);
                view2.setVisibility(0);
            }
            igProgressImageView.A03();
        }
    }
}
