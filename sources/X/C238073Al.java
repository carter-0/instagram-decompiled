package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Al  reason: invalid class name and case insensitive filesystem */
public class C238073Al extends 02Z {
    public final RecyclerView A00;
    public final C238083Am A01;

    public 02Z A0a() {
        return this.A01;
    }

    public C238073Al(RecyclerView recyclerView) {
        C238083Am r1;
        this.A00 = recyclerView;
        C238083Am A0a = A0a();
        if (A0a == null || !(A0a instanceof C238083Am)) {
            r1 = new C238083Am(this);
        } else {
            r1 = A0a;
        }
        this.A01 = r1;
    }

    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        C252553pI r0;
        C238073Al.super.A0S(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.A00.A1D() && (r0 = ((RecyclerView) view).A0D) != null) {
            r0.A1F(accessibilityEvent);
        }
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        C252553pI r2;
        if (C238073Al.super.A0V(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A1D() || (r2 = recyclerView.A0D) == null) {
            return false;
        }
        RecyclerView recyclerView2 = r2.A07;
        return r2.A0y(bundle, recyclerView2.A0y, recyclerView2.mState, i);
    }

    public void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C252553pI r2;
        C238073Al.super.A0Y(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A1D() && (r2 = recyclerView.A0D) != null) {
            RecyclerView recyclerView2 = r2.A07;
            r2.A17(accessibilityNodeInfoCompat, recyclerView2.A0y, recyclerView2.mState);
        }
    }
}
