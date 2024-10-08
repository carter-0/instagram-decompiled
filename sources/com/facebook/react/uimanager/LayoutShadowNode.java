package com.facebook.react.uimanager;

import X.0Sd;
import X.C13989Tnp;
import X.C17791Vg3;
import X.C21053XCe;
import X.C21950Xmf;
import X.C244143ai;
import X.C244163ak;
import X.C244413b9;
import X.QZL;
import X.W2U;
import X.XQa;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

public class LayoutShadowNode extends ReactShadowNodeImpl {
    public final C17791Vg3 A00 = new Object();

    @ReactProp(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z) {
    }

    @ReactProp(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i, Dynamic dynamic) {
    }

    @ReactProp(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i, Dynamic dynamic) {
    }

    @ReactProp(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @ReactProp(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @ReactProp(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    private int A05(int i) {
        I18nUtil i18nUtil = I18nUtil.A00;
        QZL qzl = this.A0A;
        0Sd.A00(qzl);
        if (!i18nUtil.A00(qzl)) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r4.equals("flex-start") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for alignContent: ", r4);
        r0 = X.C243573Zh.A06;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignContent")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlignContent(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0081
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x0076;
                case -1720785339: goto L_0x006b;
                case -1364013995: goto L_0x0060;
                case -46581362: goto L_0x0057;
                case 3005871: goto L_0x004c;
                case 441309761: goto L_0x0041;
                case 1742952711: goto L_0x0036;
                case 1937124468: goto L_0x002b;
                case 2055030478: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for alignContent: "
            X.C13989Tnp.A1T(r0, r4)
            X.3Zh r0 = X.C243573Zh.FLEX_START
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignContentJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_EVENLY
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_AROUND
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.FLEX_END
            goto L_0x0016
        L_0x0041:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_BETWEEN
            goto L_0x0016
        L_0x004c:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.AUTO
            goto L_0x0016
        L_0x0057:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0081
            goto L_0x000f
        L_0x0060:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.CENTER
            goto L_0x0016
        L_0x006b:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.BASELINE
            goto L_0x0016
        L_0x0076:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.STRETCH
            goto L_0x0016
        L_0x0081:
            X.3Zh r0 = X.C243573Zh.FLEX_START
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignContent(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r4.equals("stretch") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for alignItems: ", r4);
        r0 = X.C243573Zh.A0A;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignItems")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlignItems(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0076
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x006d;
                case -1720785339: goto L_0x0062;
                case -1364013995: goto L_0x0057;
                case -46581362: goto L_0x004c;
                case 3005871: goto L_0x0041;
                case 441309761: goto L_0x0036;
                case 1742952711: goto L_0x002b;
                case 1937124468: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for alignItems: "
            X.C13989Tnp.A1T(r0, r4)
            X.3Zh r0 = X.C243573Zh.STRETCH
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignItemsJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_AROUND
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.FLEX_END
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_BETWEEN
            goto L_0x0016
        L_0x0041:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.AUTO
            goto L_0x0016
        L_0x004c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.FLEX_START
            goto L_0x0016
        L_0x0057:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.CENTER
            goto L_0x0016
        L_0x0062:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.BASELINE
            goto L_0x0016
        L_0x006d:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x000f
        L_0x0076:
            X.3Zh r0 = X.C243573Zh.STRETCH
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignItems(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r4.equals("auto") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for alignSelf: ", r4);
        r0 = X.C243573Zh.A02;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "alignSelf")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlignSelf(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0076
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x006b;
                case -1720785339: goto L_0x0060;
                case -1364013995: goto L_0x0055;
                case -46581362: goto L_0x004a;
                case 3005871: goto L_0x0041;
                case 441309761: goto L_0x0036;
                case 1742952711: goto L_0x002b;
                case 1937124468: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for alignSelf: "
            X.C13989Tnp.A1T(r0, r4)
            X.3Zh r0 = X.C243573Zh.AUTO
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignSelfJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_AROUND
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.FLEX_END
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.SPACE_BETWEEN
            goto L_0x0016
        L_0x0041:
            java.lang.String r0 = "auto"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x000f
        L_0x004a:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.FLEX_START
            goto L_0x0016
        L_0x0055:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.CENTER
            goto L_0x0016
        L_0x0060:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.BASELINE
            goto L_0x0016
        L_0x006b:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zh r0 = X.C243573Zh.STRETCH
            goto L_0x0016
        L_0x0076:
            X.3Zh r0 = X.C243573Zh.AUTO
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setAlignSelf(java.lang.String):void");
    }

    @ReactProp(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(C21053XCe.A04(this), f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!Cem()) {
            int A05 = A05(C21950Xmf.A01[i]);
            YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00, W2U.A01(f));
        }
    }

    @ReactProp(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0 || A01 == 3) {
                YogaNative.jni_YGNodeStyleSetGapJNI(C21053XCe.A04(this), 0, vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetGapPercentJNI(C21053XCe.A04(this), 0, vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "display")
    public void setDisplay(String str) {
        XQa xQa;
        if (!Cem()) {
            if (str != null && !str.equals("flex")) {
                if (!str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                    C13989Tnp.A1T("invalid value for display: ", str);
                } else {
                    xQa = XQa.A02;
                    YogaNative.jni_YGNodeStyleSetDisplayJNI(C21053XCe.A04(this), xQa.A00);
                }
            }
            xQa = XQa.FLEX;
            YogaNative.jni_YGNodeStyleSetDisplayJNI(C21053XCe.A04(this), xQa.A00);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!Cem()) {
            YogaNative.jni_YGNodeStyleSetFlexJNI(C21053XCe.A04(this), f);
        }
    }

    @ReactProp(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetFlexBasisJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 3) {
                YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(C21053XCe.A04(this));
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r4.equals("column") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for flexDirection: ", r4);
        r0 = X.C243603Zl.A02;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "flexDirection")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFlexDirection(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x004a
            int r0 = r4.hashCode()
            switch(r0) {
                case -1448970769: goto L_0x003f;
                case -1354837162: goto L_0x0036;
                case 113114: goto L_0x002b;
                case 1272730475: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for flexDirection: "
            X.C13989Tnp.A1T(r0, r4)
            X.3Zl r0 = X.C243603Zl.COLUMN
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "column-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zl r0 = X.C243603Zl.COLUMN_REVERSE
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "row"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zl r0 = X.C243603Zl.ROW
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "column"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x000f
        L_0x003f:
            java.lang.String r0 = "row-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zl r0 = X.C243603Zl.ROW_REVERSE
            goto L_0x0016
        L_0x004a:
            X.3Zl r0 = X.C243603Zl.COLUMN
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setFlexDirection(java.lang.String):void");
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!Cem()) {
            YogaNative.jni_YGNodeStyleSetFlexGrowJNI(C21053XCe.A04(this), f);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!Cem()) {
            YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(C21053XCe.A04(this), f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r4.equals("nowrap") == false) goto L_0x000f;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "flexWrap")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFlexWrap(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0014
            int r0 = r4.hashCode()
            switch(r0) {
                case -1039592053: goto L_0x0036;
                case -749527969: goto L_0x002b;
                case 3657802: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for flexWrap: "
            X.C13989Tnp.A1T(r0, r4)
        L_0x0014:
            X.3b2 r0 = X.C244343b2.NO_WRAP
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexWrapJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "wrap"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3b2 r0 = X.C244343b2.WRAP
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "wrap-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3b2 r0 = X.C244343b2.WRAP_REVERSE
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "nowrap"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0014
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setFlexWrap(java.lang.String):void");
    }

    @ReactProp(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0 || A01 == 3 || A01 == 2) {
                YogaNative.jni_YGNodeStyleSetGapJNI(C21053XCe.A04(this), 2, vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetHeightJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 3) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(C21053XCe.A04(this));
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r4.equals("flex-start") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for justifyContent: ", r4);
        r0 = X.C243583Zi.A04;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "justifyContent")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setJustifyContent(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0060
            int r0 = r4.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x0055;
                case -46581362: goto L_0x004c;
                case 441309761: goto L_0x0041;
                case 1742952711: goto L_0x0036;
                case 1937124468: goto L_0x002b;
                case 2055030478: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for justifyContent: "
            X.C13989Tnp.A1T(r0, r4)
            X.3Zi r0 = X.C243583Zi.FLEX_START
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetJustifyContentJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zi r0 = X.C243583Zi.SPACE_EVENLY
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "space-around"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zi r0 = X.C243583Zi.SPACE_AROUND
            goto L_0x0016
        L_0x0036:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zi r0 = X.C243583Zi.FLEX_END
            goto L_0x0016
        L_0x0041:
            java.lang.String r0 = "space-between"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zi r0 = X.C243583Zi.SPACE_BETWEEN
            goto L_0x0016
        L_0x004c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x000f
        L_0x0055:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Zi r0 = X.C243583Zi.CENTER
            goto L_0x0016
        L_0x0060:
            X.3Zi r0 = X.C243583Zi.FLEX_START
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setJustifyContent(java.lang.String):void");
    }

    @ReactPropGroup(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!Cem()) {
            int A05 = A05(C21950Xmf.A02[i]);
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00, vg3.A00);
            } else if (A01 == 3) {
                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00, vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetMinHeightJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetMinWidthJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        X.C13989Tnp.A1T("invalid value for overflow: ", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4.equals("visible") == false) goto L_0x000f;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "overflow")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverflow(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.Cem()
            if (r0 != 0) goto L_0x001f
            if (r4 == 0) goto L_0x0014
            int r0 = r4.hashCode()
            switch(r0) {
                case -1217487446: goto L_0x0034;
                case -907680051: goto L_0x0029;
                case 466743410: goto L_0x0020;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "invalid value for overflow: "
            X.C13989Tnp.A1T(r0, r4)
        L_0x0014:
            X.XQb r0 = X.C21230XQb.VISIBLE
        L_0x0016:
            long r1 = X.C21053XCe.A04(r3)
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetOverflowJNI(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "visible"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0014
            goto L_0x000f
        L_0x0029:
            java.lang.String r0 = "scroll"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.XQb r0 = X.C21230XQb.SCROLL
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "hidden"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.XQb r0 = X.C21230XQb.HIDDEN
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.LayoutShadowNode.setOverflow(java.lang.String):void");
    }

    @ReactPropGroup(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!Cem()) {
            int A05 = A05(C21950Xmf.A02[i]);
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                EfF(A05, vg3.A00);
            } else if (A01 == 2) {
                float f = vg3.A00;
                this.A0L[A05] = f;
                this.A0M[A05] = !C244163ak.A00(f);
                ReactShadowNodeImpl.A03(this);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "position")
    public void setPosition(String str) {
        C244413b9 r0;
        if (!Cem()) {
            if (str != null && !str.equals("relative")) {
                if (!str.equals("absolute")) {
                    C13989Tnp.A1T("invalid value for position: ", str);
                } else {
                    r0 = C244413b9.ABSOLUTE;
                    YogaNative.jni_YGNodeStyleSetPositionTypeJNI(C21053XCe.A04(this), r0.A00);
                }
            }
            r0 = C244413b9.RELATIVE;
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(C21053XCe.A04(this), r0.A00);
        }
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!Cem()) {
            int A05 = A05(new int[]{4, 5, 0, 2, 1, 3}[i]);
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00, vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) this.A0B).mNativePointer, C244143ai.A00(A05).A00, vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0 || A01 == 3) {
                YogaNative.jni_YGNodeStyleSetGapJNI(C21053XCe.A04(this), 1, vg3.A00);
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetGapPercentJNI(C21053XCe.A04(this), 1, vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!Cem()) {
            C17791Vg3 vg3 = this.A00;
            int A01 = C21053XCe.A01(dynamic, vg3);
            if (A01 == 1 || A01 == 0) {
                YogaNative.jni_YGNodeStyleSetWidthJNI(C21053XCe.A04(this), vg3.A00);
            } else if (A01 == 3) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(C21053XCe.A04(this));
            } else if (A01 == 2) {
                YogaNative.jni_YGNodeStyleSetWidthPercentJNI(C21053XCe.A04(this), vg3.A00);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        this.A0J = z;
    }
}
