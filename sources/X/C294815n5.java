package X;

import android.view.View;
import com.instagram.reels.ui.views.ReelsViewerAccessibilityControls;

/* renamed from: X.5n5  reason: invalid class name and case insensitive filesystem */
public final class C294815n5 implements View.OnLongClickListener {
    public final /* synthetic */ ReelsViewerAccessibilityControls A00;

    public C294815n5(ReelsViewerAccessibilityControls reelsViewerAccessibilityControls) {
        this.A00 = reelsViewerAccessibilityControls;
    }

    public final boolean onLongClick(View view) {
        C273384mU r1 = this.A00.A00;
        if (r1 != null) {
            r1.E4O(true);
        }
        return true;
    }
}
