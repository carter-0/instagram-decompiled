package X;

import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import java.util.Map;

/* renamed from: X.WaR  reason: case insensitive filesystem */
public final class C19479WaR implements C279314yR {
    public final /* synthetic */ C14910UEp A00;
    public final /* synthetic */ ArchiveReelCalendarFragment A01;
    public final /* synthetic */ Reel A02;

    public C19479WaR(C14910UEp uEp, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        this.A01 = archiveReelCalendarFragment;
        this.A00 = uEp;
        this.A02 = reel;
    }

    public final void Dok(Map map) {
        ArchiveReelCalendarFragment archiveReelCalendarFragment = this.A01;
        archiveReelCalendarFragment.A0F.remove(this);
        if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
            ArchiveReelCalendarFragment.A00(this.A00, archiveReelCalendarFragment, this.A02);
        }
    }

    public final void onFailure() {
        ArchiveReelCalendarFragment archiveReelCalendarFragment = this.A01;
        archiveReelCalendarFragment.A0F.remove(this);
        if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
            ArchiveReelCalendarFragment.A01(this.A00, archiveReelCalendarFragment, this.A02);
        }
    }
}
