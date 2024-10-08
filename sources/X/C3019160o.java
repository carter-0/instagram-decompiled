package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.60o  reason: invalid class name and case insensitive filesystem */
public abstract class C3019160o {
    public static final ViewGroup A00(View view) {
        0qQ.A0B(view, 0);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final ViewGroup A01(View view) {
        ViewGroup viewGroup;
        0qQ.A0B(view, 0);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            return viewGroup;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("parent of ");
        sb.append(view);
        sb.append(" is not a ViewGroup, it is ");
        sb.append(parent);
        throw new IllegalArgumentException(sb.toString());
    }
}
