package X;

import android.graphics.Paint;
import android.view.View;
import com.instagram.android.R;

public final class K0D extends C232922uf {
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ C315496jz A02;

    public K0D(View view, C315496jz r2, boolean z) {
        this.A02 = r2;
        this.A00 = view;
        this.A01 = z;
    }

    public final void DmB(2cs r4) {
        View view = this.A00;
        view.setLayerType(2, (Paint) null);
        view.setTranslationX(200.0f);
        view.setAlpha(0.0f);
        view.setVisibility(0);
    }

    public final void DmC(2cs r5) {
        this.A00.setLayerType(0, (Paint) null);
        if (this.A01) {
            C315496jz r3 = this.A02;
            View view = r3.A09;
            if (view != null) {
                View A0G = AnonymousClass7TF.A0G(view, R.id.tap_to_dismiss);
                A0G.setAlpha(0.0f);
                A0G.setVisibility(0);
                A0G.animate().withLayer().setDuration(200).alpha(1.0f).withEndAction(new C65926M4p(r3));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DmE(2cs r5) {
        float A012 = (float) JTR.A01(r5);
        View view = this.A00;
        view.setTranslationX(200.0f - (200.0f * A012));
        view.setAlpha(A012);
    }
}
