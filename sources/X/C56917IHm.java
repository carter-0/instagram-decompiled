package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.IHm  reason: case insensitive filesystem */
public final class C56917IHm implements C279744zE {
    public final /* synthetic */ C226742hm A00;

    public C56917IHm(C226742hm r1) {
        this.A00 = r1;
    }

    public final void DzX(boolean z) {
        C226742hm r1 = this.A00;
        0qQ.A0C(r1, AnonymousClass000.A00(13));
        if (((Drawable) r1).isVisible() == z) {
            return;
        }
        if (!z) {
            C226722hk.A00().ECM(r1);
            return;
        }
        Runnable BlC = r1.BlC();
        if (BlC != null) {
            BlC.run();
        }
    }
}
