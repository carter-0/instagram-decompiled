package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FrO  reason: case insensitive filesystem */
public final class C51269FrO implements Runnable {
    public final /* synthetic */ C47033DpP A00;

    public C51269FrO(C47033DpP dpP) {
        this.A00 = dpP;
    }

    public final void run() {
        C47033DpP dpP = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        IgImageView igImageView = dpP.A09;
        I7E.A06(igImageView, igImageView.getWidth());
        I7E.A06(dpP.A02, igImageView.getWidth());
        dpP.A00 = true;
    }
}
