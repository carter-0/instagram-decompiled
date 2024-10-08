package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.8XM  reason: invalid class name */
public final class AnonymousClass8XM implements AnonymousClass8P2 {
    public final /* synthetic */ AnonymousClass8XG A00;

    public AnonymousClass8XM(AnonymousClass8XG r1) {
        this.A00 = r1;
    }

    public final void DOy() {
        AnonymousClass8XG r1 = this.A00;
        Medium medium = r1.A00;
        if (medium != null && medium.isValid()) {
            AnonymousClass8XA r12 = r1.A0C.A00;
            if (!((C352568Dw) r12.A0M.A00.A00()).DHO()) {
                C362048hG A08 = r12.A08();
                C357638Yz r2 = A08.A0f;
                if (!(r2.A08.A00 instanceof AnonymousClass80O) && !r2.A0V(C358088aL.A0T)) {
                    if (medium.A05()) {
                        A08.A0w.A0E(medium, A08, false);
                    } else if (medium.CeS()) {
                        A08.A0w.A0F(medium, A08, false);
                    }
                }
            }
        }
    }
}
