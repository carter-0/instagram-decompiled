package X;

import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Woe  reason: case insensitive filesystem */
public final /* synthetic */ class C20289Woe implements Runnable {
    public final /* synthetic */ C14910UEp A00;
    public final /* synthetic */ ArchiveReelCalendarFragment A01;
    public final /* synthetic */ Reel A02;

    public /* synthetic */ C20289Woe(C14910UEp uEp, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        this.A01 = archiveReelCalendarFragment;
        this.A00 = uEp;
        this.A02 = reel;
    }

    public final void run() {
        ArchiveReelCalendarFragment.A01(this.A00, this.A01, this.A02);
    }
}
