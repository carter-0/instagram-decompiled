package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.IjB  reason: case insensitive filesystem */
public final class C57956IjB implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316726m7 A02;
    public final /* synthetic */ C317566nT A03;

    public C57956IjB(C255773uh r1, C255783ui r2, C316726m7 r3, C317566nT r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void run() {
        C316726m7 r3 = this.A02;
        C255773uh r2 = this.A00;
        C255783ui r5 = this.A01;
        ImageView imageView = r3.A01;
        if (imageView != null) {
            ViewGroup viewGroup = r3.A00;
            0qQ.A0A(viewGroup);
            int width = viewGroup.getWidth();
            ViewGroup viewGroup2 = r3.A00;
            0qQ.A0A(viewGroup2);
            C306406Ma.A04(imageView, r5, r2.A00(), width, viewGroup2.getHeight(), true);
            C317566nT r1 = this.A03;
            ImageView imageView2 = r3.A01;
            0qQ.A0A(imageView2);
            r1.DnC(imageView2, r2, r5);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
