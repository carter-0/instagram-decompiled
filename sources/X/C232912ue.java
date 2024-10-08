package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2ue  reason: invalid class name and case insensitive filesystem */
public final class C232912ue extends C232922uf {
    public final /* synthetic */ AnonymousClass2uE A00;

    public final void DmE(2cs r4) {
        0qQ.A0B(r4, 0);
        float f = (float) r4.A09.A00;
        C3254872q r1 = this.A00.A09;
        if (r1 != null) {
            r1.A00.setScaleX(f);
            r1.A00.setScaleY(f);
            ImageView imageView = r1.A06;
            imageView.setScaleX(f);
            imageView.setScaleY(f);
        }
    }

    public C232912ue(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    public final void DmC(2cs r6) {
        AnonymousClass2uE r2 = this.A00;
        C3254872q r0 = r2.A09;
        if (r0 != null) {
            View view = r0.A00;
            if (r2.A0C == AnonymousClass05K.A0Y) {
                AnonymousClass2uE.A00(r2);
            } else {
                r2.A0Q.postDelayed(new C12925TDo(view), 1000);
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
