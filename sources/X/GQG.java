package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

public final class GQG implements AnonymousClass6H1 {
    public final /* synthetic */ AnonymousClass6IX A00;
    public final /* synthetic */ ScrollingLogic A01;

    public GQG(AnonymousClass6IX r1, ScrollingLogic scrollingLogic) {
        this.A01 = scrollingLogic;
        this.A00 = r1;
    }

    public final float EKW(float f) {
        ScrollingLogic scrollingLogic = this.A01;
        AnonymousClass6IX r3 = this.A00;
        long A02 = scrollingLogic.A02(f);
        if (scrollingLogic.A07) {
            A02 = C289295dM.A05(-1.0f, A02);
        }
        float A012 = scrollingLogic.A01(r3.EKY(A02, 2));
        if (scrollingLogic.A07) {
            return A012 * -1.0f;
        }
        return A012;
    }
}
