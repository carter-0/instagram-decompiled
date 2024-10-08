package com.facebook.react.views.view;

import X.002;
import X.00p;
import X.0I1;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass0fU;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C16615UyB;
import X.C17178VLi;
import X.C18103VlX;
import X.C18649Vw1;
import X.C18669VwS;
import X.C18703VyU;
import X.C19057WIj;
import X.C51967G9n;
import X.C66580MXl;
import X.DbW;
import X.QZK;
import X.QZL;
import X.U1B;
import X.U3r;
import X.W2U;
import X.W3s;
import X.WBH;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;
import java.util.Map;
import kotlin.enums.EnumEntries;

@ReactModule(name = "RCTView")
public class ReactViewManager extends ReactClippingViewManager {
    public static final int CMD_HOTSPOT_UPDATE = 1;
    public static final int CMD_SET_PRESSED = 2;
    public static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    public ReactViewManager() {
        super((QZK) null);
        setupViewRecycling();
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(U3r u3r, int i, Dynamic dynamic) {
        StringBuilder sb;
        0qQ.A0B(dynamic, 0);
        int ordinal = dynamic.getType().ordinal();
        C18649Vw1 vw1 = null;
        if (ordinal != 2) {
            if (ordinal != 3) {
                sb = new StringBuilder();
                sb.append("Unsupported type for radius property: ");
                sb.append(dynamic.getType());
            } else {
                String asString = dynamic.asString();
                if (00p.A0i(asString, "%", false)) {
                    try {
                        float parseFloat = Float.parseFloat(C51967G9n.A0q(asString, 0, asString.length() - 1));
                        if (parseFloat >= 0.0f) {
                            vw1 = new C18649Vw1(AnonymousClass05K.A01, parseFloat);
                        }
                    } catch (NumberFormatException unused) {
                        0I1.A04("ReactNative", 002.A0R("Invalid percentage format: ", asString));
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Invalid string value: ");
                    sb.append(asString);
                }
            }
            0I1.A04("ReactNative", sb.toString());
        } else {
            double asDouble = dynamic.asDouble();
            if (asDouble >= 0.0d) {
                vw1 = new C18649Vw1(AnonymousClass05K.A00, (float) asDouble);
            }
        }
        if (!(C18103VlX.A00(u3r) == 2 || vw1 == null || vw1.A00 != AnonymousClass05K.A01)) {
            vw1 = null;
        }
        C13988Tno.A13(u3r, vw1, i);
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(U3r u3r, boolean z) {
    }

    @ReactProp(name = "collapsableChildren")
    public void setCollapsableChildren(U3r u3r, boolean z) {
    }

    private void handleHotspotUpdate(U3r u3r, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new RuntimeException("Illegal number of arguments for 'updateHotspot' command");
        }
        u3r.drawableHotspotChanged(W2U.A01((float) readableArray.getDouble(0)), W2U.A01((float) readableArray.getDouble(1)));
    }

    private void handleSetPressed(U3r u3r, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new RuntimeException("Illegal number of arguments for 'setPressed' command");
        }
        u3r.setPressed(readableArray.getBoolean(0));
    }

    public U3r createViewInstance(QZL qzl) {
        return new U3r(qzl);
    }

    public void receiveCommand(U3r u3r, String str, ReadableArray readableArray) {
        if (str.equals("setPressed")) {
            handleSetPressed(u3r, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(u3r, readableArray);
        }
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(View view, int i) {
        C13988Tno.A10((U3r) view, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(U3r u3r, int i, Integer num) {
        C16615UyB uyB;
        int i2 = SPACING_TYPES[i];
        EnumEntries enumEntries = C16615UyB.A00;
        switch (i2) {
            case 0:
                uyB = C16615UyB.A09;
                break;
            case 1:
                uyB = C16615UyB.A0C;
                break;
            case 2:
                uyB = C16615UyB.A0A;
                break;
            case 3:
                uyB = C16615UyB.A06;
                break;
            case 4:
                uyB = C16615UyB.A0B;
                break;
            case 5:
                uyB = C16615UyB.A07;
                break;
            case 6:
                uyB = C16615UyB.A08;
                break;
            case 7:
                uyB = C16615UyB.A0D;
                break;
            case 8:
                uyB = C16615UyB.A02;
                break;
            case 9:
                uyB = C16615UyB.A03;
                break;
            case 10:
                uyB = C16615UyB.A04;
                break;
            case 11:
                uyB = C16615UyB.A05;
                break;
            default:
                throw DbW.A0a("Unknown spacing type: ", i2);
        }
        W3s.A0A(u3r, uyB, num);
    }

    @ReactProp(name = "focusable")
    public void setFocusable(U3r u3r, boolean z) {
        if (z) {
            AnonymousClass0fU.A00(new WBH(3, (Object) this, (Object) u3r), u3r);
            u3r.setFocusable(true);
            return;
        }
        u3r.setOnClickListener((View.OnClickListener) null);
        u3r.setClickable(false);
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(U3r u3r, ReadableMap readableMap) {
        Drawable drawable;
        if (readableMap != null) {
            drawable = C18703VyU.A00(u3r.getContext(), readableMap);
        } else {
            drawable = null;
        }
        W3s.A04(drawable, u3r);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    public void setNativeForeground(U3r u3r, ReadableMap readableMap) {
        Drawable A00;
        if (readableMap == null) {
            A00 = null;
        } else {
            A00 = C18703VyU.A00(u3r.getContext(), readableMap);
        }
        u3r.setForeground(A00);
    }

    public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
        ((U3r) view).setOpacityIfPossible(f);
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(U3r u3r, boolean z) {
        if (z) {
            u3r.setFocusable(true);
            u3r.setFocusableInTouchMode(true);
            u3r.requestFocus();
        }
    }

    public Map getCommandsMap() {
        return C13991Tnr.A0p(HOTSPOT_UPDATE_KEY, C13988Tno.A0R(), "setPressed", C66580MXl.A0q());
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(U3r u3r, int i) {
        u3r.setNextFocusDownId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(U3r u3r, int i) {
        u3r.setNextFocusForwardId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(U3r u3r, int i) {
        u3r.setNextFocusLeftId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(U3r u3r, int i) {
        u3r.setNextFocusRightId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(U3r u3r, int i) {
        u3r.setNextFocusUpId(i);
    }

    public U3r prepareToRecycleView(QZL qzl, U3r u3r) {
        super.prepareToRecycleView(qzl, u3r);
        if (u3r != null) {
            u3r.A07();
        }
        return u3r;
    }

    @ReactProp(name = "accessible")
    public void setAccessible(U3r u3r, boolean z) {
        u3r.setFocusable(z);
    }

    @ReactProp(name = "backfaceVisibility")
    public void setBackfaceVisibility(U3r u3r, String str) {
        u3r.setBackfaceVisibility(str);
    }

    @ReactProp(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(U3r u3r, ReadableArray readableArray) {
        ArrayList arrayList;
        if (C18103VlX.A00(u3r) == 2) {
            if (readableArray == null || readableArray.size() <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(readableArray.size());
                for (int i = 0; i < readableArray.size(); i++) {
                    arrayList.add(new C17178VLi(u3r.getContext(), readableArray.getMap(i)));
                }
            }
            0qQ.A0B(u3r, 0);
            U1B A00 = W3s.A00(u3r);
            A00.A0G = arrayList;
            A00.invalidateSelf();
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(U3r u3r, String str) {
        W3s.A0C(u3r, C13991Tnr.A0X(str));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(U3r u3r, ReadableArray readableArray) {
        W3s.A07(u3r, readableArray);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(U3r u3r, Dynamic dynamic) {
        int i;
        int i2;
        int i3;
        Rect rect;
        int ordinal = dynamic.getType().ordinal();
        if (ordinal == 4) {
            ReadableMap asMap = dynamic.asMap();
            int i4 = 0;
            if (asMap.hasKey("left")) {
                i = (int) W2U.A04(asMap, "left");
            } else {
                i = 0;
            }
            if (asMap.hasKey("top")) {
                i2 = (int) W2U.A04(asMap, "top");
            } else {
                i2 = 0;
            }
            if (asMap.hasKey("right")) {
                i3 = (int) W2U.A04(asMap, "right");
            } else {
                i3 = 0;
            }
            if (asMap.hasKey("bottom")) {
                i4 = (int) W2U.A04(asMap, "bottom");
            }
            rect = new Rect(i, i2, i3, i4);
        } else if (ordinal != 2) {
            if (ordinal != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid type for 'hitSlop' value ");
                0I1.A04("ReactNative", AnonymousClass7TF.A0i(dynamic.getType(), sb));
            }
            rect = null;
        } else {
            int A01 = (int) W2U.A01((float) dynamic.asDouble());
            rect = new Rect(A01, A01, A01, A01);
        }
        u3r.A02 = rect;
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(U3r u3r, boolean z) {
        u3r.A06 = z;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(U3r u3r, String str) {
        u3r.setOverflow(str);
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(U3r u3r, String str) {
        u3r.A04 = C18669VwS.A00(str);
    }

    public void setTransformProperty(U3r u3r, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty(u3r, readableArray, readableArray2);
        u3r.A08();
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(U3r u3r, int i, float f) {
        C13989Tnp.A18(u3r, f, i);
    }

    public /* bridge */ /* synthetic */ View prepareToRecycleView(QZL qzl, View view) {
        U3r u3r = (U3r) view;
        prepareToRecycleView(qzl, u3r);
        return u3r;
    }

    public void receiveCommand(U3r u3r, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(u3r, readableArray);
        } else if (i == 2) {
            handleSetPressed(u3r, readableArray);
        }
    }

    public void setBackgroundColor(U3r u3r, int i) {
        C13988Tno.A10(u3r, i);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(U3r u3r, int i, float f) {
        C19057WIj.A01(u3r, this, Float.valueOf(f), i);
    }

    public void setOpacity(U3r u3r, float f) {
        u3r.setOpacityIfPossible(f);
    }
}
