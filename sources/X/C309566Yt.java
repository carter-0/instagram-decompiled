package X;

import android.os.Process;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.DalvikInternals;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6Yt  reason: invalid class name and case insensitive filesystem */
public final class C309566Yt extends 0ng {
    public final /* synthetic */ ReelViewerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C309566Yt(ReelViewerFragment reelViewerFragment) {
        super(184);
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00;
        CallerContext callerContext = ReelViewerFragment.A3S;
        int i = 0;
        if (reelViewerFragment.A2e) {
            i = Process.getThreadPriority(0);
            Process.setThreadPriority(reelViewerFragment.A07);
        }
        DalvikInternals.mlockOdex(reelViewerFragment.A08, reelViewerFragment.A2b);
        if (reelViewerFragment.A2e) {
            Process.setThreadPriority(i);
        }
    }
}
