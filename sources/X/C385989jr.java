package X;

import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.9jr  reason: invalid class name and case insensitive filesystem */
public final class C385989jr extends IgFrameLayout {
    public final void setTitle(String str) {
        if (str != null && str.length() != 0) {
            TextView A0R = AnonymousClass7TG.A0R(this, R.id.igds_debug_overlay_textview);
            A0R.setText(str);
            A0R.setVisibility(0);
        }
    }
}
