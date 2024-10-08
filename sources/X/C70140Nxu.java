package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.android.R;

/* renamed from: X.Nxu  reason: case insensitive filesystem */
public abstract class C70140Nxu {
    public static final void A00(ViewGroup viewGroup) {
        while (viewGroup != null) {
            int id = viewGroup.getId();
            viewGroup.setClipChildren(false);
            if (id != R.id.message_actions_container) {
                viewGroup.setClipToPadding(false);
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    return;
                }
            } else {
                viewGroup.setClipToPadding(false);
                return;
            }
        }
    }
}
