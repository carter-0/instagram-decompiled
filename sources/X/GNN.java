package X;

import android.view.View;

public final class GNN implements Runnable {
    public final /* synthetic */ GNL A00;

    public GNN(GNL gnl) {
        this.A00 = gnl;
    }

    public final void run() {
        Object obj;
        View view;
        View view2;
        View A02;
        GNL gnl = this.A00;
        C267324bN r1 = gnl.A00;
        if (r1 != null) {
            GNL.A03(r1, gnl, "scrubber");
            GME gme = gnl.A0K;
            C52012GBj gBj = gnl.A02;
            if (gBj == null || (A02 = C52012GBj.A02(gBj)) == null) {
                obj = null;
            } else {
                obj = A02.getTag();
            }
            if (obj instanceof C52079GDz) {
                GC3 gc3 = gnl.A0O;
                C52079GDz gDz = (C52079GDz) obj;
                if (gme != null) {
                    view = gme.A0C();
                } else {
                    view = null;
                }
                GNH gnh = gnl.A0J;
                if (gnh != null) {
                    view2 = gnh.A02;
                } else {
                    view2 = null;
                }
                gc3.A00(view, view2, (View) null, gDz);
            }
            11Z.A02(new C52321GNn(gnl.A0I, 8));
        }
    }
}
