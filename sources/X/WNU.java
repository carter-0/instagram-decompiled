package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;
import java.util.List;

public final class WNU implements X3G {
    public final /* synthetic */ ArchiveReelRecycleBinFragment A00;

    public WNU(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        this.A00 = archiveReelRecycleBinFragment;
    }

    public final void DvO(List list) {
        ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = this.A00;
        0S7.A00(archiveReelRecycleBinFragment);
        int firstVisiblePosition = archiveReelRecycleBinFragment.A04.getFirstVisiblePosition();
        C252063oV r0 = archiveReelRecycleBinFragment.downloadAllButtonStubHolder;
        if (r0 != null) {
            View view = r0.getView();
            int i = 0;
            if (firstVisiblePosition == 0) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        0qQ.A0F("downloadAllButtonStubHolder");
        throw AnonymousClass00P.createAndThrow();
    }
}
