package com.facebook.react.views.scroll;

import X.AnonymousClass7TF;
import X.C11414SSm;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C14727U4v;
import X.C16615UyB;
import X.C17180VLk;
import X.C17318VQx;
import X.C17413VUs;
import X.C17763VfZ;
import X.C18669VwS;
import X.C20831X0g;
import X.C20836X0l;
import X.QZK;
import X.QZL;
import X.W0a;
import X.W2U;
import X.W3V;
import X.W3s;
import X.X7Y;
import android.view.View;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;

@ReactModule(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager implements X7Y {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public C20836X0l mFpsListener;

    public ReactHorizontalScrollViewManager(C20836X0l x0l) {
        super((QZK) null);
        this.mFpsListener = x0l;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "horizontal")
    public void setHorizontal(C14727U4v u4v, boolean z) {
    }

    public C14727U4v createViewInstance(QZL qzl) {
        return new C14727U4v(qzl);
    }

    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((C14727U4v) obj).A07();
    }

    public void scrollTo(C14727U4v u4v, C17413VUs vUs) {
        OverScroller overScroller = u4v.A0V;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = vUs.A02;
        int i = vUs.A00;
        int i2 = vUs.A01;
        if (z) {
            u4v.E65(i, i2);
        } else {
            u4v.scrollTo(i, i2);
        }
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(View view, int i) {
        C13988Tno.A10((C14727U4v) view, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C14727U4v u4v, int i, Integer num) {
        W3s.A0A(u4v, C16615UyB.A02, num);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(C14727U4v u4v, ReadableMap readableMap) {
        double d;
        if (readableMap != null) {
            double d2 = 0.0d;
            if (readableMap.hasKey("x")) {
                d = readableMap.getDouble("x");
            } else {
                d = 0.0d;
            }
            if (readableMap.hasKey("y")) {
                d2 = readableMap.getDouble("y");
            }
            u4v.scrollTo((int) W2U.A01((float) d), (int) W2U.A01((float) d2));
            return;
        }
        u4v.scrollTo(0, 0);
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(C14727U4v u4v, int i) {
        if (i > 0) {
            u4v.setHorizontalFadingEdgeEnabled(true);
        } else {
            i = 0;
            u4v.setHorizontalFadingEdgeEnabled(false);
        }
        u4v.setFadingEdgeLength(i);
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(C14727U4v u4v, ReadableMap readableMap) {
        C17318VQx vQx;
        Integer num;
        if (readableMap != null) {
            int i = readableMap.getInt("minIndexForVisible");
            if (readableMap.hasKey("autoscrollToTopThreshold")) {
                num = Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold"));
            } else {
                num = null;
            }
            vQx = new C17318VQx(i, num);
        } else {
            vQx = null;
        }
        u4v.setMaintainVisibleContentPosition(vQx);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(C14727U4v u4v, boolean z) {
        u4v.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(C14727U4v u4v, ReadableArray readableArray) {
        ArrayList arrayList;
        if (readableArray == null || readableArray.size() == 0) {
            arrayList = null;
        } else {
            float f = C11414SSm.A00().density;
            arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                AnonymousClass7TF.A1M(arrayList, (int) (readableArray.getDouble(i) * ((double) f)));
            }
        }
        u4v.A06 = arrayList;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        ((C14727U4v) view).A04 = x0g;
        return null;
    }

    public void scrollToEnd(C14727U4v u4v, C17180VLk vLk) {
        View A0G = C13988Tno.A0G(u4v);
        if (A0G != null) {
            int width = A0G.getWidth() + u4v.getPaddingRight();
            OverScroller overScroller = u4v.A0V;
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            boolean z = vLk.A00;
            int scrollY = u4v.getScrollY();
            if (z) {
                u4v.E65(width, scrollY);
            } else {
                u4v.scrollTo(width, scrollY);
            }
        } else {
            throw new RuntimeException("scrollToEnd called on HorizontalScrollView without child");
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C14727U4v u4v, int i, float f) {
        C13988Tno.A13(u4v, C13991Tnr.A0J(f), i);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(C14727U4v u4v, String str) {
        W3s.A0C(u4v, C13991Tnr.A0X(str));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C14727U4v u4v, int i) {
        u4v.setEndFillColor(i);
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(C14727U4v u4v, ReadableArray readableArray) {
        W3s.A07(u4v, readableArray);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(C14727U4v u4v, float f) {
        u4v.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(C14727U4v u4v, boolean z) {
        u4v.A08 = z;
    }

    @ReactProp(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(C14727U4v u4v, boolean z) {
        u4v.A0A = z;
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C14727U4v u4v, boolean z) {
        u4v.setNestedScrollingEnabled(z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(C14727U4v u4v, String str) {
        u4v.setOverScrollMode(W3V.A01(str));
    }

    @ReactProp(name = "overflow")
    public void setOverflow(C14727U4v u4v, String str) {
        u4v.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(C14727U4v u4v, boolean z) {
        u4v.A0B = z;
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(C14727U4v u4v, String str) {
        u4v.A03 = C18669VwS.A00(str);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C14727U4v u4v, boolean z) {
        u4v.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C14727U4v u4v, boolean z) {
        u4v.A0C = z;
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(C14727U4v u4v, int i) {
        u4v.A00 = i;
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(C14727U4v u4v, String str) {
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C14727U4v u4v, boolean z) {
        u4v.A0D = z;
    }

    @ReactProp(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C14727U4v u4v, boolean z) {
        u4v.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(C14727U4v u4v, String str) {
        u4v.A02 = W3V.A02(str);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(C14727U4v u4v, boolean z) {
        u4v.A0E = z;
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(C14727U4v u4v, float f) {
        u4v.A01 = (int) (f * C11414SSm.A00().density);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(C14727U4v u4v, boolean z) {
        u4v.A0F = z;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C14727U4v u4v, int i, float f) {
        C13989Tnp.A18(u4v, f, i);
    }

    public ReactHorizontalScrollViewManager() {
        this((C20836X0l) null);
    }

    public void flashScrollIndicators(C14727U4v u4v) {
        u4v.A07();
    }

    public void setBackgroundColor(C14727U4v u4v, int i) {
        C13988Tno.A10(u4v, i);
    }

    public Object updateState(C14727U4v u4v, C17763VfZ vfZ, C20831X0g x0g) {
        u4v.A04 = x0g;
        return null;
    }

    public void receiveCommand(C14727U4v u4v, int i, ReadableArray readableArray) {
        W0a.A01(readableArray, this, u4v, i);
    }

    public void receiveCommand(C14727U4v u4v, String str, ReadableArray readableArray) {
        W0a.A02(readableArray, this, u4v, str);
    }
}
