package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.WjG  reason: case insensitive filesystem */
public final class C19995WjG implements Runnable {
    public final /* synthetic */ LN9 A00;

    public C19995WjG(LN9 ln9) {
        this.A00 = ln9;
    }

    public final void run() {
        LN9 ln9 = this.A00;
        C14002To4 to4 = new C14002To4();
        to4.A01(0.3f);
        to4.A02(200.0f);
        ConstrainedImageView constrainedImageView = ln9.A0A;
        C14090Tph tph = new C14090Tph(C14001To3.A0G, constrainedImageView);
        tph.A01 = to4;
        C14090Tph tph2 = new C14090Tph(C14001To3.A0H, constrainedImageView);
        tph2.A01 = to4;
        tph.A09(0.8f);
        tph2.A09(0.8f);
    }
}
