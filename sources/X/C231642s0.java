package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2s0  reason: invalid class name and case insensitive filesystem */
public interface C231642s0 {
    void bindView(int i, View view, Object obj, Object obj2);

    void buildRowViewTypes(C232672uC r1, Object obj, Object obj2);

    View createView(int i, ViewGroup viewGroup);

    String getBinderGroupName();

    int getIdentifier(int i, Object obj, Object obj2);

    View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2);

    int getViewModelHash(int i, Object obj, Object obj2);

    String getViewSubTypeName(int i, Object obj);

    int getViewTypeCount();

    String getViewTypeName(int i);

    void onViewAttachedToWindow(View view, int i, Object obj, Object obj2);

    void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2);

    void onViewRecycled(View view, int i, Object obj, Object obj2);
}
