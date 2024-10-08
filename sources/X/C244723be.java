package X;

import android.view.View;
import com.facebook.litho.ComponentHost;
import com.instagram.android.R;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
public final class C244723be {
    public static final void A00(View view) {
        boolean z = view instanceof ComponentHost;
        if (z || view.getTag(R.id.component_node_info) != null) {
            view.setTag(R.id.component_node_info, (Object) null);
            if (!z) {
                03v.A0B(view, (02Z) null);
            }
        }
    }

    public final void A01(View view) {
        2W8 r1;
        if (view instanceof ComponentHost) {
            r1 = ((ComponentHost) view).A07;
        } else {
            Object tag = view.getTag(R.id.component_focus_change_listener);
            if (tag instanceof 2W8) {
                r1 = (2W8) tag;
            } else {
                return;
            }
        }
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void A02(View view) {
        AnonymousClass2Ur r1;
        if (view instanceof ComponentHost) {
            r1 = ((ComponentHost) view).A08;
        } else {
            Object tag = view.getTag(R.id.component_long_click_listener);
            if (tag instanceof AnonymousClass2Ur) {
                r1 = (AnonymousClass2Ur) tag;
            } else {
                return;
            }
        }
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public final void A03(View view) {
        AnonymousClass2Vf r1;
        if (view instanceof ComponentHost) {
            r1 = ((ComponentHost) view).A09;
        } else {
            Object tag = view.getTag(R.id.component_touch_listener);
            if (tag instanceof AnonymousClass2Vf) {
                r1 = (AnonymousClass2Vf) tag;
            } else {
                return;
            }
        }
        if (r1 != null) {
            r1.A00 = null;
        }
    }
}
