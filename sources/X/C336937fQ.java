package X;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: X.7fQ  reason: invalid class name and case insensitive filesystem */
public abstract class C336937fQ implements C231642s0 {
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return 0;
    }

    public final String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(86546705);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(002.A0u(getClass().getSimpleName(), " was used in a RecyclerView adapter but doesn't implement ", "bindView", "!"));
        AnonymousClass0fD.A0A(-195732508, A03);
        throw unsupportedOperationException;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2142740490);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(002.A0u(getClass().getSimpleName(), " was used in a RecyclerView adapter but doesn't implement ", "createView", "!"));
        AnonymousClass0fD.A0A(1444493804, A03);
        throw unsupportedOperationException;
    }

    public final String getBinderGroupName() {
        return getClass().getSimpleName();
    }

    public final String getViewTypeName(int i) {
        return 002.A06(i, getClass().getSimpleName(), "[", "]");
    }
}
