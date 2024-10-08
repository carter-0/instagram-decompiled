package X;

import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* renamed from: X.Ij5  reason: case insensitive filesystem */
public final class C57950Ij5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C57244IUf A01;
    public final /* synthetic */ C55834HoH A02;
    public final /* synthetic */ AfiSecondaryLinkButton A03;

    public C57950Ij5(C57244IUf iUf, C55834HoH hoH, AfiSecondaryLinkButton afiSecondaryLinkButton, int i) {
        this.A02 = hoH;
        this.A00 = i;
        this.A03 = afiSecondaryLinkButton;
        this.A01 = iUf;
    }

    public final void run() {
        HorizontalFlowLayout horizontalFlowLayout = this.A02.A05;
        horizontalFlowLayout.A00 = this.A00;
        int[] A002 = HorizontalFlowLayout.A00(horizontalFlowLayout, horizontalFlowLayout.getWidth(), false);
        C294975nL A012 = C294975nL.A01(horizontalFlowLayout, 0);
        A012.A0G();
        C294975nL A0F = A012.A0F(true);
        A0F.A0N(AnonymousClass7TE.A03(horizontalFlowLayout), (float) A002[1]);
        A0F.A0H();
        this.A03.setVisibility(8);
        this.A01.A00 = AnonymousClass05K.A01;
    }
}
