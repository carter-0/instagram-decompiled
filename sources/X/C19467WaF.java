package X;

import android.animation.Animator;
import android.os.Handler;
import android.widget.ImageView;

/* renamed from: X.WaF  reason: case insensitive filesystem */
public final class C19467WaF implements X4V {
    public final /* synthetic */ C316716m6 A00;
    public final /* synthetic */ C310236ae A01;

    public C19467WaF(C316716m6 r1, C310236ae r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void D1d(boolean z, boolean z2) {
        if (z) {
            C310236ae r4 = this.A01;
            AnonymousClass37D A0i = DbT.A0i(r4.A07);
            A0i.getClass();
            A0i.A0B();
            if (!z2) {
                r4.A04 = true;
                C310256ag r2 = r4.A0B;
                ImageView imageView = this.A00.A01;
                imageView.getClass();
                r2.A04((Animator.AnimatorListener) null, imageView, true, true);
                r4.A0F.EHY("tapped");
                new Handler().postDelayed(new C20112WlA(this), 5500);
            }
        }
    }
}
