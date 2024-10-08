package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.6IW  reason: invalid class name */
public final class AnonymousClass6IW implements AnonymousClass6IX {
    public final /* synthetic */ ScrollingLogic A00;

    public AnonymousClass6IW(ScrollingLogic scrollingLogic) {
        this.A00 = scrollingLogic;
    }

    public final long EKY(long j, int i) {
        ScrollingLogic scrollingLogic = this.A00;
        scrollingLogic.A00 = i;
        C305386Hs r2 = scrollingLogic.A01;
        if (r2 == null || (!scrollingLogic.A05.AkW() && !scrollingLogic.A05.AkV())) {
            return ScrollingLogic.A00(scrollingLogic.A04, scrollingLogic, i, j);
        }
        return r2.ACA(scrollingLogic.A09, scrollingLogic.A00, j);
    }
}
