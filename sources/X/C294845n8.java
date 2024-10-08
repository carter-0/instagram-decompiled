package X;

import android.view.View;
import com.instagram.reels.ui.views.ReelsViewerAccessibilityControls;

/* renamed from: X.5n8  reason: invalid class name and case insensitive filesystem */
public final class C294845n8 implements View.OnLongClickListener {
    public final /* synthetic */ ReelsViewerAccessibilityControls A00;

    public C294845n8(ReelsViewerAccessibilityControls reelsViewerAccessibilityControls) {
        this.A00 = reelsViewerAccessibilityControls;
    }

    public final boolean onLongClick(View view) {
        C273384mU r1 = this.A00.A00;
        if (r1 != null) {
            r1.Crd(true);
        }
        return true;
    }
}
