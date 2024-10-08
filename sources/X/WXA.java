package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;

public final class WXA implements AnonymousClass728 {
    public final /* synthetic */ HighlightsMigrationFragment A00;

    public final void AAi(Reel reel, int i) {
        0qQ.A0B(reel, 0);
        C321456uC r0 = this.A00.A04;
        if (r0 != null) {
            r0.AAi(reel, i);
        } else {
            0qQ.A0F("profileViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public WXA(HighlightsMigrationFragment highlightsMigrationFragment) {
        this.A00 = highlightsMigrationFragment;
    }

    public final void ECD(View view, Reel reel) {
        C321456uC r0 = this.A00.A04;
        if (r0 != null) {
            r0.ECD(view, reel);
        } else {
            0qQ.A0F("profileViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
