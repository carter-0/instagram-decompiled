package com.facebook.react.uimanager;

import X.0qQ;
import X.C66581MXm;
import X.QZK;
import X.X2Y;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewGroupManager extends BaseViewManager implements X2Y {
    public static WeakHashMap mZIndexHash = new WeakHashMap();

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* synthetic */ void removeAllViews(View view) {
        0qQ.A0B(view, 1);
        int childCount = getChildCount(view);
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(view, childCount);
            } else {
                return;
            }
        }
    }

    public void removeView(ViewGroup viewGroup, View view) {
        for (int i = 0; i < getChildCount(viewGroup); i++) {
            if (getChildAt(viewGroup, i) == view) {
                removeViewAt(viewGroup, i);
                return;
            }
        }
    }

    public void updateExtraData(ViewGroup viewGroup, Object obj) {
    }

    public static Integer getViewZIndex(View view) {
        return (Integer) mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        C66581MXm.A1S(view, mZIndexHash, i);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public Class getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    public void addViews(ViewGroup viewGroup, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(viewGroup, (View) list.get(i), i);
        }
    }

    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }

    public ViewGroupManager(QZK qzk) {
        super(qzk);
    }

    public ViewGroupManager() {
        super((QZK) null);
    }

    public void addView(ViewGroup viewGroup, View view, int i) {
        viewGroup.addView(view, i);
    }

    public View getChildAt(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i);
    }

    public int getChildCount(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public void removeViewAt(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
    }
}
