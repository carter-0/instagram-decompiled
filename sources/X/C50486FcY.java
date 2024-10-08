package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.FcY  reason: case insensitive filesystem */
public final class C50486FcY implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50486FcY(C46843DmJ dmJ, F2P f2p, int i) {
        this.A00 = i;
        this.A02 = dmJ;
        this.A01 = f2p;
    }

    public final void onClick() {
        int i = this.A00;
        C46843DmJ dmJ = (C46843DmJ) this.A02;
        if (i != 0) {
            Object obj = this.A01;
            C358248ab A0Y = DbS.A0Y(dmJ.A01);
            A0Y.A09(2131957601);
            A0Y.A0Q(C50025FJk.A00(obj, dmJ, 14), C358278ae.RED, 2131957602);
            DbY.A1M(A0Y, 2131957600);
            return;
        }
        DirectShareSheetFragment directShareSheetFragment = dmJ.A04;
        1ES.A05(C290635fd.A01(directShareSheetFragment.A0G, new EHO(0, directShareSheetFragment, this.A01)), 1967622104, 2, false, false);
    }
}
