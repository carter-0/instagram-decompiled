package X;

import com.instagram.igds.components.button.IgdsButton;

public final class IKI implements AnonymousClass2WK {
    public final C273024lp A00;
    public final C273014lo A01;
    public final String A02;

    public final 2WL Cfk(2WI r4, long j) {
        0qQ.A0B(r4, 0);
        IgdsButton igdsButton = (IgdsButton) C51969G9p.A0N(r4, C53974GxI.A05);
        igdsButton.setStyle(this.A01);
        igdsButton.setSize(this.A00);
        String str = this.A02;
        if (str != null) {
            igdsButton.setText(str);
        }
        igdsButton.A02(C273084lx.END, 0);
        igdsButton.setElevated(false);
        return G9w.A0S(igdsButton, j);
    }

    public IKI(C273024lp r1, C273014lo r2, String str) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
