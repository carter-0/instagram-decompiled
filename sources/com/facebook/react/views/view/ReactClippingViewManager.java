package com.facebook.react.views.view;

import X.0Sd;
import X.C51969G9p;
import X.QZK;
import X.U3r;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public abstract class ReactClippingViewManager extends ViewGroupManager {
    public ReactClippingViewManager() {
        super((QZK) null);
    }

    public void addView(U3r u3r, View view, int i) {
        if (u3r.A07) {
            0Sd.A00(u3r.A01);
            0Sd.A00(u3r.A08);
            View[] viewArr = u3r.A08;
            0Sd.A00(viewArr);
            int i2 = u3r.A00;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    View[] viewArr2 = new View[(length + 12)];
                    u3r.A08 = viewArr2;
                    System.arraycopy(viewArr, 0, viewArr2, 0, length);
                    viewArr = u3r.A08;
                }
                int i3 = u3r.A00;
                u3r.A00 = i3 + 1;
                viewArr[i3] = view;
            } else if (i < i2) {
                if (length == i2) {
                    View[] viewArr3 = new View[(length + 12)];
                    u3r.A08 = viewArr3;
                    System.arraycopy(viewArr, 0, viewArr3, 0, i);
                    System.arraycopy(viewArr, i, u3r.A08, i + 1, i2 - i);
                    viewArr = u3r.A08;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                u3r.A00++;
            } else {
                throw C51969G9p.A0p("index=", " count=", i, i2);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (u3r.A08[i5].getParent() == null) {
                    i4++;
                }
            }
            U3r.A03(u3r.A01, u3r, i, i4);
            view.addOnLayoutChangeListener(u3r.A05);
            return;
        }
        u3r.addView(view, i);
    }

    public View getChildAt(U3r u3r, int i) {
        if (!u3r.A07) {
            return u3r.getChildAt(i);
        }
        if (i < 0 || i >= u3r.A00) {
            return null;
        }
        View[] viewArr = u3r.A08;
        0Sd.A00(viewArr);
        return viewArr[i];
    }

    public int getChildCount(U3r u3r) {
        if (u3r.A07) {
            return u3r.A00;
        }
        return u3r.getChildCount();
    }

    public void removeAllViews(U3r u3r) {
        if (u3r.A07) {
            0Sd.A00(u3r.A08);
            for (int i = 0; i < u3r.A00; i++) {
                u3r.A08[i].removeOnLayoutChangeListener(u3r.A05);
            }
            u3r.removeAllViewsInLayout();
            u3r.A00 = 0;
            return;
        }
        u3r.removeAllViews();
    }

    public void removeViewAt(U3r u3r, int i) {
        if (u3r.A07) {
            View childAt = getChildAt(u3r, i);
            if (childAt != null) {
                if (childAt.getParent() != null) {
                    u3r.removeView(childAt);
                }
                0Sd.A02(u3r.A07);
                0Sd.A00(u3r.A01);
                0Sd.A00(u3r.A08);
                childAt.removeOnLayoutChangeListener(u3r.A05);
                int i2 = u3r.A00;
                View[] viewArr = u3r.A08;
                0Sd.A00(viewArr);
                int i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        if (viewArr[i3] == childAt) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (u3r.A08[i3].getParent() != null) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (u3r.A08[i5].getParent() == null) {
                            i4++;
                        }
                    }
                    u3r.removeViewsInLayout(i3 - i4, 1);
                }
                View[] viewArr2 = u3r.A08;
                0Sd.A00(viewArr2);
                int i6 = u3r.A00;
                int i7 = i6 - 1;
                if (i3 != i7) {
                    if (i3 < 0 || i3 >= i6) {
                        throw new IndexOutOfBoundsException();
                    }
                    System.arraycopy(viewArr2, i3 + 1, viewArr2, i3, (i6 - i3) - 1);
                    i7 = u3r.A00 - 1;
                }
                u3r.A00 = i7;
                viewArr2[i7] = null;
                return;
            }
            return;
        }
        u3r.removeViewAt(i);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(U3r u3r, boolean z) {
        u3r.setRemoveClippedSubviews(z);
    }
}
