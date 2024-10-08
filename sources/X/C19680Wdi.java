package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Wdi  reason: case insensitive filesystem */
public final class C19680Wdi implements C273414mX {
    public final /* synthetic */ C315656kI A00;

    public final void Cyf() {
    }

    public C19680Wdi(C315656kI r1) {
        this.A00 = r1;
    }

    public final void Cyc() {
        C315656kI r1 = this.A00;
        AnonymousClass6a7 r0 = r1.A01;
        if (r0 != null) {
            r0.A00();
        }
        C310216ac r2 = r1.A00;
        if (r2 != null) {
            C273384mU r12 = r2.A04;
            C250973mM r02 = ((ReelViewerFragment) r12).A0a;
            if (r02 != null) {
                C310016aI r3 = r2.A03;
                Reel reel = r02.A0H;
                C255773uh Au5 = r12.Au5();
                if (Au5 != null) {
                    r3.A06(reel, Au5, "DISMISS_SHEET");
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
