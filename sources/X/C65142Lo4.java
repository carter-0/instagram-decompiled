package X;

import android.view.View;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Lo4  reason: case insensitive filesystem */
public final class C65142Lo4 implements MVP {
    public final /* synthetic */ C59962JcV A00;

    public final void D9Y() {
    }

    public final void E2A() {
    }

    public final void EuQ(C65499LuN luN, boolean z) {
        0qQ.A0B(luN, 0);
        C59962JcV jcV = this.A00;
        if (C59962JcV.A0A(jcV)) {
            View view = jcV.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = jcV.A04;
            if (view2 != null) {
                view2.bringToFront();
            }
        }
        C59962JcV.A01(jcV).A09(luN, z);
    }

    public C65142Lo4(C59962JcV jcV) {
        this.A00 = jcV;
    }

    public final void DFk(AudioOverlayTrack audioOverlayTrack) {
        AnonymousClass7TH.A0R(this.A00.A00);
    }

    public final void DSl() {
        C59962JcV jcV = this.A00;
        JTS.A1O(jcV.A0H, jcV);
        182.A06(0Tu.A05, AnonymousClass7TE.A0l(jcV.A0i), 36326541331871556L);
    }
}
