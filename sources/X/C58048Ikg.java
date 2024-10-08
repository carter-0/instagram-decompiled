package X;

import java.util.TimerTask;

/* renamed from: X.Ikg  reason: case insensitive filesystem */
public final class C58048Ikg extends TimerTask {
    public final /* synthetic */ GFP A00;

    public C58048Ikg(GFP gfp) {
        this.A00 = gfp;
    }

    public final void run() {
        GFP gfp = this.A00;
        0eP r2 = (0eP) gfp.A01.get();
        if (r2 != null) {
            AnonymousClass7TF.A0D().post(new C57876Iht(gfp, r2));
        }
        gfp.A00 = null;
    }
}
