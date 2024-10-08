package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4GT  reason: invalid class name */
public class AnonymousClass4GT extends 02Z {
    public ReboundViewPager A00;

    public final boolean A0V(View view, int i, Bundle bundle) {
        int i2;
        ReboundViewPager reboundViewPager;
        0qQ.A0B(view, 0);
        if (i == 4096) {
            reboundViewPager = this.A00;
            if (reboundViewPager.canScrollHorizontally(1)) {
                i2 = reboundViewPager.A07 + 1;
            }
            return false;
        } else if (i != 8192) {
            return AnonymousClass4GT.super.A0V(view, i, bundle);
        } else {
            reboundViewPager = this.A00;
            if (reboundViewPager.canScrollHorizontally(-1)) {
                i2 = reboundViewPager.A07 - 1;
            }
            return false;
        }
        reboundViewPager.A0K(i2);
        int i3 = reboundViewPager.A07;
        for (C252293os Dpz : reboundViewPager.A0x) {
            Dpz.Dpz(i3, i2);
        }
        return false;
    }

    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        View view2;
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityEvent, 1);
        if (accessibilityEvent.getEventType() == 4096 || (view2 = this.A00.A0F) == null) {
            return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return view2.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(accessibilityEvent, 2);
        if (accessibilityEvent.getEventType() == 32768) {
            viewGroup.postDelayed(new C40762Ais(viewGroup), 1000);
        }
        return AnonymousClass4GT.super.A0X(viewGroup, view, accessibilityEvent);
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        AnonymousClass4GT.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(4096);
        accessibilityNodeInfoCompat.addAction(8192);
    }

    public AnonymousClass4GT(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
        if (reboundViewPager.getImportantForAccessibility() == 0) {
            this.A00.setImportantForAccessibility(1);
        }
    }
}
