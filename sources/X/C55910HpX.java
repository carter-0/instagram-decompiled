package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.mediaactions.ScrubberWithKeyFrames;

/* renamed from: X.HpX  reason: case insensitive filesystem */
public final class C55910HpX {
    public final ScrubberWithKeyFrames A00(Activity activity, C267324bN r6) {
        View childAt;
        View findViewWithTag;
        AnonymousClass7TF.A1H(activity, r6);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null || (findViewWithTag = childAt.findViewWithTag(002.A0R("clips_scrubber_", r6.getId()))) == null) {
            return null;
        }
        return (ScrubberWithKeyFrames) findViewWithTag.findViewById(R.id.scrubber);
    }
}
