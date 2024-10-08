package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7oM  reason: invalid class name and case insensitive filesystem */
public final class C342297oM extends 02Z {
    public final Map A00 = new WeakHashMap();
    public final C342287oL A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        View A0D;
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        ReboundViewPager reboundViewPager = this.A01.A00;
        AnonymousClass4GW r0 = (AnonymousClass4GW) reboundViewPager.A0w.get(view);
        if (!(r0 == null || (i = r0.A00) <= 0 || (A0D = reboundViewPager.A0D(i - 1)) == null)) {
            accessibilityNodeInfoCompat.mInfo.setTraversalAfter(A0D);
        }
        02Z r02 = (02Z) this.A00.get(view);
        if (r02 != null) {
            r02.A0Y(view, accessibilityNodeInfoCompat);
        } else {
            C342297oM.super.A0Y(view, accessibilityNodeInfoCompat);
        }
    }

    public C342297oM(C342287oL r2) {
        this.A01 = r2;
    }
}
