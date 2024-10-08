package com.facebook.react.views.scroll;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.C11414SSm;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C16615UyB;
import X.C17180VLk;
import X.C17318VQx;
import X.C17413VUs;
import X.C17763VfZ;
import X.C18669VwS;
import X.C20831X0g;
import X.C20836X0l;
import X.C66580MXl;
import X.Dba;
import X.QZK;
import X.QZL;
import X.U5c;
import X.W0a;
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
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager implements X7Y {
    public static final String REACT_CLASS = "RCTScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public C20836X0l mFpsListener;

    public ReactScrollViewManager(C20836X0l x0l) {
        super((QZK) null);
        this.mFpsListener = x0l;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "horizontal")
    public void setHorizontal(U5c u5c, boolean z) {
    }

    public static Map createExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        0qQ.A0B(AnonymousClass05K.A0C, 0);
        hashMap.put("topScroll", Dba.A0f("registrationName", "onScroll"));
        0qQ.A0B(AnonymousClass05K.A00, 0);
        hashMap.put("topScrollBeginDrag", Dba.A0f("registrationName", "onScrollBeginDrag"));
        0qQ.A0B(AnonymousClass05K.A01, 0);
        hashMap.put("topScrollEndDrag", Dba.A0f("registrationName", "onScrollEndDrag"));
        0qQ.A0B(AnonymousClass05K.A0N, 0);
        hashMap.put("topMomentumScrollBegin", Dba.A0f("registrationName", "onMomentumScrollBegin"));
        0qQ.A0B(AnonymousClass05K.A0Y, 0);
        hashMap.put("topMomentumScrollEnd", Dba.A0f("registrationName", "onMomentumScrollEnd"));
        return hashMap;
    }

    public U5c createViewInstance(QZL qzl) {
        return new U5c(qzl);
    }

    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((U5c) obj).A03();
    }

    public void scrollTo(U5c u5c, C17413VUs vUs) {
        OverScroller overScroller = u5c.A0U;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = vUs.A02;
        int i = vUs.A00;
        int i2 = vUs.A01;
        if (z) {
            u5c.E65(i, i2);
        } else {
            u5c.scrollTo(i, i2);
        }
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(View view, int i) {
        C13988Tno.A10((U5c) view, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(U5c u5c, int i, Integer num) {
        W3s.A0A(u5c, C16615UyB.A02, num);
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(U5c u5c, int i) {
        if (i > 0) {
            u5c.setVerticalFadingEdgeEnabled(true);
        } else {
            i = 0;
            u5c.setVerticalFadingEdgeEnabled(false);
        }
        u5c.setFadingEdgeLength(i);
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(U5c u5c, ReadableMap readableMap) {
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
        u5c.setMaintainVisibleContentPosition(vQx);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(U5c u5c, boolean z) {
        u5c.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(U5c u5c, boolean z) {
        u5c.A0E = z;
        u5c.setFocusable(z);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(U5c u5c, ReadableArray readableArray) {
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
        u5c.A08 = arrayList;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        ((U5c) view).A06 = x0g;
        return null;
    }

    public Map getCommandsMap() {
        HashMap A0p = C13991Tnr.A0p("scrollTo", C13988Tno.A0R(), "scrollToEnd", C66580MXl.A0q());
        A0p.put("flashScrollIndicators", 3);
        return A0p;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    public void scrollToEnd(U5c u5c, C17180VLk vLk) {
        View A0G = C13988Tno.A0G(u5c);
        if (A0G != null) {
            int height = A0G.getHeight() + u5c.getPaddingBottom();
            OverScroller overScroller = u5c.A0U;
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            boolean z = vLk.A00;
            int scrollX = u5c.getScrollX();
            if (z) {
                u5c.E65(scrollX, height);
            } else {
                u5c.scrollTo(scrollX, height);
            }
        } else {
            throw new RuntimeException("scrollToEnd called on ScrollView without child");
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(U5c u5c, int i, float f) {
        C13988Tno.A13(u5c, C13991Tnr.A0J(f), i);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(U5c u5c, String str) {
        W3s.A0C(u5c, C13991Tnr.A0X(str));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(U5c u5c, int i) {
        u5c.setEndFillColor(i);
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(U5c u5c, ReadableArray readableArray) {
        W3s.A07(u5c, readableArray);
    }

    @ReactProp(customType = "Point", name = "contentOffset")
    public void setContentOffset(U5c u5c, ReadableMap readableMap) {
        u5c.setContentOffset(readableMap);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(U5c u5c, float f) {
        u5c.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(U5c u5c, boolean z) {
        u5c.A0A = z;
    }

    @ReactProp(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(U5c u5c, boolean z) {
        u5c.A0C = z;
    }

    @ReactProp(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(U5c u5c, boolean z) {
        u5c.setVerticalScrollbarPosition(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(U5c u5c, boolean z) {
        u5c.setNestedScrollingEnabled(z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(U5c u5c, String str) {
        u5c.setOverScrollMode(W3V.A01(str));
    }

    @ReactProp(name = "overflow")
    public void setOverflow(U5c u5c, String str) {
        u5c.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(U5c u5c, boolean z) {
        u5c.A0D = z;
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(U5c u5c, String str) {
        u5c.A05 = C18669VwS.A00(str);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(U5c u5c, boolean z) {
        u5c.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(U5c u5c, int i) {
        u5c.A00 = i;
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(U5c u5c, String str) {
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(U5c u5c, boolean z) {
        u5c.A0F = z;
    }

    @ReactProp(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(U5c u5c, boolean z) {
        u5c.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(U5c u5c, String str) {
        u5c.A02 = W3V.A02(str);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(U5c u5c, boolean z) {
        u5c.A0G = z;
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(U5c u5c, float f) {
        u5c.A01 = (int) (f * C11414SSm.A00().density);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(U5c u5c, boolean z) {
        u5c.A0H = z;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(U5c u5c, int i, float f) {
        C13989Tnp.A18(u5c, f, i);
    }

    public ReactScrollViewManager() {
        this((C20836X0l) null);
    }

    public void flashScrollIndicators(U5c u5c) {
        u5c.A03();
    }

    public void setBackgroundColor(U5c u5c, int i) {
        C13988Tno.A10(u5c, i);
    }

    public Object updateState(U5c u5c, C17763VfZ vfZ, C20831X0g x0g) {
        u5c.A06 = x0g;
        return null;
    }

    public void receiveCommand(U5c u5c, int i, ReadableArray readableArray) {
        W0a.A01(readableArray, this, u5c, i);
    }

    public void receiveCommand(U5c u5c, String str, ReadableArray readableArray) {
        W0a.A02(readableArray, this, u5c, str);
    }
}
