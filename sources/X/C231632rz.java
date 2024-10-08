package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2rz  reason: invalid class name and case insensitive filesystem */
public abstract class C231632rz implements C231642s0 {
    public int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public boolean isEnabled(int i, Object obj, Object obj2) {
        return true;
    }

    public void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    public void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    public void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    public String getBinderGroupName() {
        return getClass().getSimpleName();
    }

    public View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2048425802);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(1534779901, A03);
        return view;
    }

    public String getViewTypeName(int i) {
        return 002.A06(i, getBinderGroupName(), "[", "]");
    }
}
