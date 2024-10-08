package X;

import android.view.View;

/* renamed from: X.3d8  reason: invalid class name and case insensitive filesystem */
public abstract class C245573d8 {
    public static final int A00(Object obj) {
        if (!(obj instanceof View)) {
            return 0;
        }
        View view = (View) obj;
        boolean isClickable = view.isClickable();
        if (view.isLongClickable()) {
            isClickable |= true;
        }
        if (view.isFocusable()) {
            isClickable |= true;
        }
        if (view.isEnabled()) {
            isClickable |= true;
        }
        if (view.isSelected()) {
            isClickable |= true;
        }
        if (view.isKeyboardNavigationCluster()) {
            isClickable |= true;
        }
        int visibility = view.getVisibility();
        if (visibility == 4) {
            isClickable |= true;
        } else if (visibility == 8) {
            isClickable |= true;
        }
        int layerType = view.getLayerType();
        if (layerType == 0) {
            return isClickable ? 1 : 0;
        }
        if (layerType == 1) {
            return isClickable | true ? 1 : 0;
        }
        if (layerType == 2) {
            return isClickable | true ? 1 : 0;
        }
        throw new IllegalArgumentException("Unhandled layer type encountered.");
    }
}
