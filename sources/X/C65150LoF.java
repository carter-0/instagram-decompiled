package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LoF  reason: case insensitive filesystem */
public final class C65150LoF implements MVQ {
    public final /* synthetic */ C59962JcV A00;

    public final void Cp5() {
    }

    public final void D9J() {
    }

    public final void DkR(C65499LuN luN) {
        0qQ.A0B(luN, 0);
        C59962JcV.A01(this.A00).A09(luN, false);
    }

    public C65150LoF(C59962JcV jcV) {
        this.A00 = jcV;
    }

    public final void Dsy() {
        C60439JlX jlX = this.A00.A0M;
        if (jlX == null) {
            0qQ.A0F("audioListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        LFA lfa = jlX.A00;
        if (lfa != null) {
            jlX.A00 = null;
            jlX.notifyItemChanged(jlX.A06.indexOf(lfa) + 1);
        }
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        C59963JcW A01 = C59962JcV.A01(this.A00);
        MHN.A03(audioOverlayTrack, A01, C318116oQ.A00(A01), 34);
    }
}
