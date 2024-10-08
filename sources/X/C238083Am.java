package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.3Am  reason: invalid class name and case insensitive filesystem */
public final class C238083Am extends 02Z {
    public Map A00 = new WeakHashMap();
    public final C238073Al A01;

    public final void A0R(View view, int i) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            r0.A0R(view, i);
        } else {
            C238083Am.super.A0R(view, i);
        }
    }

    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            r0.A0S(view, accessibilityEvent);
        } else {
            C238083Am.super.A0S(view, accessibilityEvent);
        }
    }

    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            r0.A0T(view, accessibilityEvent);
        } else {
            C238083Am.super.A0T(view, accessibilityEvent);
        }
    }

    public final void A0U(View view, AccessibilityEvent accessibilityEvent) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            r0.A0U(view, accessibilityEvent);
        } else {
            C238083Am.super.A0U(view, accessibilityEvent);
        }
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        boolean A0V;
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A1D() || recyclerView.A0D == null) {
            return C238083Am.super.A0V(view, i, bundle);
        }
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            A0V = r0.A0V(view, i, bundle);
        } else {
            A0V = C238083Am.super.A0V(view, i, bundle);
        }
        if (!A0V) {
            return false;
        }
        return true;
    }

    public final boolean A0W(View view, AccessibilityEvent accessibilityEvent) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            return r0.A0W(view, accessibilityEvent);
        }
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        02Z r0 = (02Z) this.A00.get(viewGroup);
        if (r0 != null) {
            return r0.A0X(viewGroup, view, accessibilityEvent);
        }
        return C238083Am.super.A0X(viewGroup, view, accessibilityEvent);
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C252553pI r0;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A1D() && (r0 = recyclerView.A0D) != null) {
            r0.A0l(view, accessibilityNodeInfoCompat);
            02Z r02 = (02Z) this.A00.get(view);
            if (r02 != null) {
                r02.A0Y(view, accessibilityNodeInfoCompat);
                return;
            }
        }
        C238083Am.super.A0Y(view, accessibilityNodeInfoCompat);
    }

    public final 057 A0Z(View view) {
        02Z r0 = (02Z) this.A00.get(view);
        if (r0 != null) {
            return r0.A0Z(view);
        }
        return C238083Am.super.A0Z(view);
    }

    public C238083Am(C238073Al r2) {
        this.A01 = r2;
    }
}
