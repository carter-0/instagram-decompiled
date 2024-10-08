package X;

import android.view.View;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;

public final class WX8 implements AnonymousClass726 {
    public final /* synthetic */ HighlightsMigrationFragment A00;

    public final void AAh(1Xj r2, int i) {
        0qQ.A0B(r2, 0);
        C321456uC r0 = this.A00.A04;
        if (r0 != null) {
            r0.AAh(r2, i);
        } else {
            0qQ.A0F("profileViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public WX8(HighlightsMigrationFragment highlightsMigrationFragment) {
        this.A00 = highlightsMigrationFragment;
    }

    public final void ECC(View view, 1Xj r3) {
        C321456uC r0 = this.A00.A04;
        if (r0 != null) {
            r0.ECC(view, r3);
        } else {
            0qQ.A0F("profileViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
