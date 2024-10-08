package com.facebook.react.uimanager;

import X.002;
import X.0I1;
import X.0Sd;
import X.0qQ;
import X.2Ob;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11414SSm;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C13992Tns;
import X.C14750U7h;
import X.C16483Uvd;
import X.C16531Uwb;
import X.C16684Uze;
import X.C18098VlS;
import X.C18103VlX;
import X.C18716Vym;
import X.C18774W0x;
import X.Dba;
import X.JTR;
import X.Pxd;
import X.QZK;
import X.QZL;
import X.S9D;
import X.VZA;
import X.W2U;
import X.W3D;
import X.W3s;
import X.X60;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class BaseViewManager extends ViewManager implements View.OnLayoutChangeListener {
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    public static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    public static final String STATE_BUSY = "busy";
    public static final String STATE_CHECKED = "checked";
    public static final String STATE_EXPANDED = "expanded";
    public static final String STATE_MIXED = "mixed";
    public static final VZA sMatrixDecompositionContext = new VZA();
    public static final double[] sTransformDecompositionArray = new double[16];

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7 - i5;
        int i10 = i3 - i;
        if (i4 - i2 != i8 - i6 || i10 != i9) {
            ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
            ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
            if (readableArray2 != null || readableArray != null) {
                setTransformProperty(view, readableArray2, readableArray);
            }
        }
    }

    public View prepareToRecycleView(QZL qzl, View view) {
        View view2 = view;
        view.setTag((Object) null);
        view.setTag(R.id.pointer_events, (Object) null);
        view.setTag(R.id.react_test_id, (Object) null);
        view.setTag(R.id.view_tag_native_id, (Object) null);
        view.setTag(R.id.labelled_by, (Object) null);
        view.setTag(R.id.accessibility_label, (Object) null);
        view.setTag(R.id.accessibility_hint, (Object) null);
        view.setTag(R.id.accessibility_role, (Object) null);
        view.setTag(R.id.accessibility_state, (Object) null);
        view.setTag(R.id.accessibility_actions, (Object) null);
        view.setTag(R.id.accessibility_value, (Object) null);
        view.setTag(R.id.accessibility_state_expanded, (Object) null);
        setTransformProperty(view, (ReadableArray) null, (ReadableArray) null);
        view.resetPivot();
        view.setTop(0);
        view.setBottom(0);
        view.setLeft(0);
        view.setRight(0);
        view.setElevation(0.0f);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setAnimationMatrix((Matrix) null);
        }
        view.setTag(R.id.transform, (Object) null);
        view.setTag(R.id.transform_origin, (Object) null);
        view.setTag(R.id.invalidate_transform, (Object) null);
        view.removeOnLayoutChangeListener(this);
        view.setTag(R.id.use_hardware_layer, (Object) null);
        view.setTag(R.id.filter, (Object) null);
        view.setTag(R.id.mix_blend_mode, (Object) null);
        C18098VlS.A00(view, (ReadableArray) null, (Boolean) null);
        view.setOutlineAmbientShadowColor(-16777216);
        view.setOutlineSpotShadowColor(-16777216);
        view.setNextFocusDownId(-1);
        view.setNextFocusForwardId(-1);
        view.setNextFocusRightId(-1);
        view.setNextFocusUpId(-1);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.setElevation(0.0f);
        view.setAlpha(1.0f);
        setPadding(view2, 0, 0, 0, 0);
        view.setForeground((Drawable) null);
        return view;
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(View view, boolean z) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(View view, boolean z) {
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(View view, boolean z) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(View view, boolean z) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(View view, boolean z) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(View view, boolean z) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(View view, boolean z) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(View view, boolean z) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(View view, boolean z) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(View view, boolean z) {
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(View view, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(View view, boolean z) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(View view, boolean z) {
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(View view, boolean z) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(View view, boolean z) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(View view, boolean z) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(View view, boolean z) {
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("topPointerCancel", Dba.A0f("phasedRegistrationNames", C13991Tnr.A0p("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture")));
        hashMap2.put("topPointerDown", C13992Tns.A0T("onPointerDown", "onPointerDownCapture"));
        Boolean A0v = AnonymousClass7TE.A0v();
        HashMap A0p = C13991Tnr.A0p("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture");
        A0p.put("skipBubbling", A0v);
        hashMap2.put("topPointerEnter", Dba.A0f("phasedRegistrationNames", A0p));
        HashMap A0p2 = C13991Tnr.A0p("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture");
        A0p2.put("skipBubbling", A0v);
        hashMap2.put("topPointerLeave", Dba.A0f("phasedRegistrationNames", A0p2));
        hashMap2.put("topPointerMove", C13992Tns.A0T("onPointerMove", "onPointerMoveCapture"));
        hashMap2.put("topPointerUp", C13992Tns.A0T("onPointerUp", "onPointerUpCapture"));
        hashMap2.put("topPointerOut", C13992Tns.A0T("onPointerOut", "onPointerOutCapture"));
        hashMap2.put("topPointerOver", C13992Tns.A0T("onPointerOver", "onPointerOverCapture"));
        hashMap2.put("topClick", C13992Tns.A0T("onClick", "onClickCapture"));
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("topAccessibilityAction", Dba.A0f("registrationName", "onAccessibilityAction"));
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(View view, ReadableArray readableArray) {
        if (readableArray != null) {
            view.setTag(R.id.accessibility_actions, readableArray);
        }
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(View view, String str) {
        int i;
        if (str == null || str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            i = 0;
        } else if (str.equals("polite")) {
            i = 1;
        } else if (str.equals("assertive")) {
            i = 2;
        } else {
            return;
        }
        view.setAccessibilityLiveRegion(i);
    }

    public void setBorderBottomLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @ReactProp(name = "onClick")
    public void setClick(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.CLICK, z);
    }

    @ReactProp(name = "onClickCapture")
    public void setClickCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.CLICK_CAPTURE, z);
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(View view, String str) {
        int i;
        if (str == null || str.equals("auto")) {
            i = 0;
        } else if (str.equals("yes")) {
            i = 1;
        } else if (str.equals("no")) {
            i = 2;
        } else if (str.equals("no-hide-descendants")) {
            i = 4;
        } else {
            return;
        }
        view.setImportantForAccessibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "outlineStyle")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOutlineStyle(android.view.View r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x005f
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r6)
            int r1 = r2.hashCode()
            r0 = -1338941519(0xffffffffb0315fb1, float:-6.452821E-10)
            if (r1 == r0) goto L_0x0054
            r0 = -1325970902(0xffffffffb0f74a2a, float:-1.7992694E-9)
            if (r1 == r0) goto L_0x0049
            r0 = 109618859(0x688a6ab, float:5.140241E-35)
            if (r1 != r0) goto L_0x005f
            java.lang.String r0 = "solid"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0023:
            r1 = 0
            X.0qQ.A0B(r5, r1)
            int r2 = X.C18103VlX.A00(r5)
            r1 = 2
            if (r2 != r1) goto L_0x0048
            X.U18 r3 = X.W3s.A02(r5)
            if (r0 == 0) goto L_0x0048
            java.lang.Integer r1 = r3.A04
            if (r0 == r1) goto L_0x0048
            r3.A04 = r0
            android.graphics.Paint r2 = r3.A06
            float r1 = r3.A00
            android.graphics.DashPathEffect r0 = X.U18.A01(r0, r1)
            r2.setPathEffect(r0)
            r3.invalidateSelf()
        L_0x0048:
            return
        L_0x0049:
            java.lang.String r0 = "dotted"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0023
        L_0x0054:
            java.lang.String r0 = "dashed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0023
        L_0x005f:
            r0 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManager.setOutlineStyle(android.view.View, java.lang.String):void");
    }

    @ReactProp(name = "onPointerEnter")
    public void setPointerEnter(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.ENTER, z);
    }

    @ReactProp(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.ENTER_CAPTURE, z);
    }

    @ReactProp(name = "onPointerLeave")
    public void setPointerLeave(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.LEAVE, z);
    }

    @ReactProp(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.LEAVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerMove")
    public void setPointerMove(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.MOVE, z);
    }

    @ReactProp(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.MOVE_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOut")
    public void setPointerOut(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.OUT, z);
    }

    @ReactProp(name = "onPointerOutCapture")
    public void setPointerOutCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.OUT_CAPTURE, z);
    }

    @ReactProp(name = "onPointerOver")
    public void setPointerOver(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.OVER, z);
    }

    @ReactProp(name = "onPointerOverCapture")
    public void setPointerOverCapture(View view, boolean z) {
        setPointerEventsFlag(view, C16483Uvd.OVER_CAPTURE, z);
    }

    public void setTransformProperty(View view, ReadableArray readableArray, ReadableArray readableArray2) {
        float[] fArr;
        float sanitizeFloatPropertyValue;
        double d;
        double cos;
        double d2;
        char c;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double sin;
        char c2;
        float f;
        View view2 = view;
        ReadableArray readableArray3 = readableArray;
        if (readableArray == null) {
            view2.setTranslationX(W2U.A01(0.0f));
            view2.setTranslationY(W2U.A01(0.0f));
            sanitizeFloatPropertyValue = 0.0f;
            view2.setRotation(0.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            JTR.A1B(view2);
        } else {
            boolean A1S = AnonymousClass7TF.A1S(C18103VlX.A00(view2), 2);
            VZA vza = sMatrixDecompositionContext;
            double[] dArr = vza.A00;
            int i = 0;
            do {
                dArr[i] = 0.0d;
                i++;
            } while (i < 4);
            double[] dArr2 = vza.A02;
            int i2 = 0;
            do {
                dArr2[i2] = 0.0d;
                i2++;
            } while (i2 < 3);
            double[] dArr3 = vza.A03;
            int i3 = 0;
            do {
                dArr3[i3] = 0.0d;
                i3++;
            } while (i3 < 3);
            double[] dArr4 = vza.A04;
            int i4 = 0;
            do {
                dArr4[i4] = 0.0d;
                i4++;
            } while (i4 < 3);
            double[] dArr5 = vza.A01;
            int i5 = 0;
            do {
                dArr5[i5] = 0.0d;
                i5++;
            } while (i5 < 3);
            double[] dArr6 = sTransformDecompositionArray;
            float A00 = W2U.A00((float) view2.getWidth());
            float A002 = W2U.A00((float) view2.getHeight());
            double[] dArr7 = (double[]) C18774W0x.A00.get();
            W3D.A03(dArr6);
            ReadableArray readableArray4 = readableArray2;
            if (readableArray2 == null || (A002 == 0.0f && A00 == 0.0f)) {
                fArr = null;
            } else {
                float f2 = A00 / 2.0f;
                float f3 = A002 / 2.0f;
                float[] fArr2 = {f2, f3, 0.0f};
                int i6 = 0;
                while (i6 < readableArray4.size() && i6 < 3) {
                    int ordinal = readableArray4.getType(i6).ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 3 && A1S) {
                            String string = readableArray4.getString(i6);
                            if (string.endsWith("%")) {
                                float parseFloat = Float.parseFloat(string.substring(0, string.length() - 1));
                                float f4 = A002;
                                if (i6 == 0) {
                                    f4 = A00;
                                }
                                f = (f4 * parseFloat) / 100.0f;
                            }
                        }
                        i6++;
                    } else {
                        f = (float) readableArray4.getDouble(i6);
                    }
                    fArr2[i6] = f;
                    i6++;
                }
                fArr = new float[]{(-f2) + fArr2[0], (-f3) + fArr2[1], fArr2[2]};
                W3D.A03(dArr7);
                double d8 = (double) fArr[0];
                double d9 = (double) fArr[1];
                0qQ.A0B(dArr7, 0);
                dArr7[12] = d8;
                dArr7[13] = d9;
                dArr7[14] = (double) fArr[2];
                W3D.A04(dArr6, dArr6, dArr7);
            }
            if (readableArray3.size() == 16 && readableArray3.getType(0) == ReadableType.Number) {
                W3D.A03(dArr7);
                for (int i7 = 0; i7 < readableArray3.size(); i7++) {
                    dArr7[i7] = readableArray3.getDouble(i7);
                }
                W3D.A04(dArr6, dArr6, dArr7);
            } else {
                int size = readableArray3.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ReadableMap map = readableArray3.getMap(i8);
                    String Crc = map.keySetIterator().Crc();
                    W3D.A03(dArr7);
                    if ("matrix".equals(Crc)) {
                        ReadableArray array = map.getArray(Crc);
                        int i9 = 0;
                        do {
                            dArr7[i9] = array.getDouble(i9);
                            i9++;
                        } while (i9 < 16);
                    } else {
                        if ("perspective".equals(Crc)) {
                            double d10 = map.getDouble(Crc);
                            0qQ.A0B(dArr7, 0);
                            d2 = -1.0d / d10;
                            c = 11;
                        } else {
                            if ("rotateX".equals(Crc)) {
                                double A003 = C18774W0x.A00(map, Crc);
                                0qQ.A0B(dArr7, 0);
                                d2 = Math.cos(A003);
                                dArr7[5] = d2;
                                double sin2 = Math.sin(A003);
                                dArr7[6] = sin2;
                                sin = -sin2;
                                c2 = 9;
                            } else if ("rotateY".equals(Crc)) {
                                double A004 = C18774W0x.A00(map, Crc);
                                0qQ.A0B(dArr7, 0);
                                d2 = Math.cos(A004);
                                dArr7[0] = d2;
                                sin = Math.sin(A004);
                                dArr7[2] = -sin;
                                c2 = 8;
                            } else {
                                if ("rotate".equals(Crc) || "rotateZ".equals(Crc)) {
                                    double A005 = C18774W0x.A00(map, Crc);
                                    0qQ.A0B(dArr7, 0);
                                    cos = Math.cos(A005);
                                    dArr7[0] = cos;
                                    double sin3 = Math.sin(A005);
                                    dArr7[1] = sin3;
                                    dArr7[4] = -sin3;
                                } else {
                                    if ("scale".equals(Crc)) {
                                        cos = map.getDouble(Crc);
                                        0qQ.A0B(dArr7, 0);
                                        dArr7[0] = cos;
                                    } else if ("scaleX".equals(Crc)) {
                                        double d11 = map.getDouble(Crc);
                                        0qQ.A0B(dArr7, 0);
                                        dArr7[0] = d11;
                                    } else if ("scaleY".equals(Crc)) {
                                        cos = map.getDouble(Crc);
                                    } else if ("translate".equals(Crc)) {
                                        ReadableArray array2 = map.getArray(Crc);
                                        ReadableType type = array2.getType(0);
                                        ReadableType readableType = ReadableType.String;
                                        if (type != readableType || !A1S) {
                                            d5 = array2.getDouble(0);
                                        } else {
                                            d5 = C18774W0x.A01(array2.getString(0), (double) A00);
                                        }
                                        if (array2.getType(1) != readableType || !A1S) {
                                            d6 = array2.getDouble(1);
                                        } else {
                                            d6 = C18774W0x.A01(array2.getString(1), (double) A002);
                                        }
                                        if (array2.size() > 2) {
                                            d7 = array2.getDouble(2);
                                        } else {
                                            d7 = 0.0d;
                                        }
                                        0qQ.A0B(dArr7, 0);
                                        dArr7[12] = d5;
                                        dArr7[13] = d6;
                                        c = 14;
                                    } else {
                                        if ("translateX".equals(Crc)) {
                                            if (map.getType(Crc) != ReadableType.String || !A1S) {
                                                d4 = map.getDouble(Crc);
                                            } else {
                                                d4 = C18774W0x.A01(map.getString(Crc), (double) A00);
                                            }
                                            d3 = 0.0d;
                                        } else if ("translateY".equals(Crc)) {
                                            if (map.getType(Crc) != ReadableType.String || !A1S) {
                                                d3 = map.getDouble(Crc);
                                            } else {
                                                d3 = C18774W0x.A01(map.getString(Crc), (double) A002);
                                            }
                                            d4 = 0.0d;
                                        } else if ("skewX".equals(Crc)) {
                                            double A006 = C18774W0x.A00(map, Crc);
                                            0qQ.A0B(dArr7, 0);
                                            d2 = Math.tan(A006);
                                            c = 4;
                                        } else if ("skewY".equals(Crc)) {
                                            double A007 = C18774W0x.A00(map, Crc);
                                            0qQ.A0B(dArr7, 0);
                                            dArr7[1] = Math.tan(A007);
                                        } else {
                                            C13989Tnp.A1T("Unsupported transform type: ", Crc);
                                        }
                                        0qQ.A0B(dArr7, 0);
                                        dArr7[12] = d4;
                                        c = 13;
                                    }
                                    0qQ.A0B(dArr7, 0);
                                }
                                c = 5;
                            }
                            dArr7[c2] = sin;
                            c = 10;
                        }
                        dArr7[c] = d2;
                    }
                    W3D.A04(dArr6, dArr6, dArr7);
                }
            }
            if (fArr != null) {
                W3D.A03(dArr7);
                double d12 = (double) (-fArr[0]);
                double d13 = (double) (-fArr[1]);
                0qQ.A0B(dArr7, 0);
                dArr7[12] = d12;
                dArr7[13] = d13;
                dArr7[14] = (double) (-fArr[2]);
                W3D.A04(dArr6, dArr6, dArr7);
            }
            0qQ.A0B(dArr6, 0);
            0Sd.A02(AnonymousClass7TF.A1S(dArr6.length, 16));
            double[] dArr8 = vza.A00;
            double[] dArr9 = vza.A02;
            double[] dArr10 = vza.A03;
            double[] dArr11 = vza.A04;
            double[] dArr12 = vza.A01;
            if (!W3D.A05(dArr6[15])) {
                double[][] dArr13 = new double[4][];
                int i10 = 0;
                do {
                    dArr13[i10] = new double[4];
                    i10++;
                } while (i10 < 4);
                double[] dArr14 = new double[16];
                int i11 = 0;
                do {
                    int i12 = 0;
                    do {
                        int i13 = (i11 * 4) + i12;
                        double d14 = dArr6[i13] / dArr6[15];
                        dArr13[i11][i12] = d14;
                        if (i12 == 3) {
                            d14 = 0.0d;
                        }
                        dArr14[i13] = d14;
                        i12++;
                    } while (i12 < 4);
                    i11++;
                } while (i11 < 4);
                dArr14[15] = 1.0d;
                if (!W3D.A05(W3D.A00(dArr14))) {
                    double d15 = dArr13[0][3];
                    if (!W3D.A05(d15) || !W3D.A05(dArr13[1][3]) || !W3D.A05(dArr13[2][3])) {
                        double[] dArr15 = {d15, dArr13[1][3], dArr13[2][3], dArr13[3][3]};
                        double A008 = W3D.A00(dArr14);
                        if (!W3D.A05(A008)) {
                            double d16 = dArr14[0];
                            double d17 = dArr14[1];
                            double d18 = dArr14[2];
                            double d19 = dArr14[3];
                            double d20 = dArr14[4];
                            double d21 = dArr14[5];
                            double d22 = dArr14[6];
                            double d23 = dArr14[7];
                            double d24 = dArr14[8];
                            double d25 = dArr14[9];
                            double d26 = dArr14[10];
                            double d27 = dArr14[11];
                            double d28 = dArr14[12];
                            double d29 = dArr14[13];
                            double d30 = dArr14[14];
                            double d31 = dArr14[15];
                            double d32 = d22 * d27;
                            double d33 = d23 * d26;
                            double d34 = d23 * d25;
                            double d35 = d21 * d27;
                            double d36 = d22 * d25;
                            double d37 = d21 * d26;
                            double d38 = d19 * d26;
                            double d39 = d18 * d27;
                            double d40 = d19 * d25;
                            double d41 = d17 * d27;
                            double d42 = d18 * d25;
                            double d43 = d17 * d26;
                            double d44 = d18 * d23;
                            double d45 = d19 * d22;
                            double d46 = d19 * d21;
                            double d47 = d17 * d23;
                            double d48 = d18 * d21;
                            double d49 = d17 * d22;
                            double d50 = d23 * d24;
                            double d51 = d20 * d27;
                            double d52 = d22 * d24;
                            double d53 = d20 * d26;
                            double d54 = d19 * d24;
                            double d55 = d16 * d27;
                            double d56 = d18 * d24;
                            double d57 = d16 * d26;
                            double d58 = d19 * d20;
                            double d59 = d23 * d16;
                            double d60 = d18 * d20;
                            double d61 = d22 * d16;
                            double d62 = d21 * d24;
                            double d63 = d20 * d25;
                            double d64 = d17 * d24;
                            double d65 = d16 * d25;
                            double d66 = d17 * d20;
                            double d67 = d16 * d21;
                            dArr14 = new double[]{((((((d32 * d29) - (d33 * d29)) + (d34 * d30)) - (d35 * d30)) - (d36 * d31)) + (d37 * d31)) / A008, ((((((d38 * d29) - (d39 * d29)) - (d40 * d30)) + (d41 * d30)) + (d42 * d31)) - (d43 * d31)) / A008, ((((((d44 * d29) - (d45 * d29)) + (d46 * d30)) - (d47 * d30)) - (d48 * d31)) + (d49 * d31)) / A008, ((((((d45 * d25) - (d44 * d25)) - (d46 * d26)) + (d47 * d26)) + (d48 * d27)) - (d49 * d27)) / A008, ((((((d33 * d28) - (d32 * d28)) - (d50 * d30)) + (d51 * d30)) + (d52 * d31)) - (d53 * d31)) / A008, ((((((d39 * d28) - (d38 * d28)) + (d54 * d30)) - (d55 * d30)) - (d56 * d31)) + (d57 * d31)) / A008, ((((((d45 * d28) - (d44 * d28)) - (d58 * d30)) + (d59 * d30)) + (d60 * d31)) - (d61 * d31)) / A008, ((((((d44 * d24) - (d45 * d24)) + (d58 * d26)) - (d59 * d26)) - (d60 * d27)) + (d61 * d27)) / A008, ((((((d35 * d28) - (d34 * d28)) + (d50 * d29)) - (d51 * d29)) - (d62 * d31)) + (d63 * d31)) / A008, ((((((d40 * d28) - (d41 * d28)) - (d54 * d29)) + (d55 * d29)) + (d64 * d31)) - (d65 * d31)) / A008, ((((((d47 * d28) - (d46 * d28)) + (d58 * d29)) - (d59 * d29)) - (d66 * d31)) + (d31 * d67)) / A008, ((((((d46 * d24) - (d47 * d24)) - (d58 * d25)) + (d59 * d25)) + (d66 * d27)) - (d27 * d67)) / A008, ((((((d36 * d28) - (d37 * d28)) - (d52 * d29)) + (d53 * d29)) + (d62 * d30)) - (d63 * d30)) / A008, ((((((d43 * d28) - (d42 * d28)) + (d56 * d29)) - (d57 * d29)) - (d64 * d30)) + (d65 * d30)) / A008, ((((((d48 * d28) - (d28 * d49)) - (d60 * d29)) + (d29 * d61)) + (d66 * d30)) - (d30 * d67)) / A008, ((((((d49 * d24) - (d48 * d24)) + (d60 * d25)) - (d61 * d25)) - (d66 * d26)) + (d67 * d26)) / A008};
                        }
                        double[] dArr16 = {dArr14[0], dArr14[4], dArr14[8], dArr14[12], dArr14[1], dArr14[5], dArr14[9], dArr14[13], dArr14[2], dArr14[6], dArr14[10], dArr14[14], dArr14[3], dArr14[7], dArr14[11], dArr14[15]};
                        0qQ.A0B(dArr8, 2);
                        double d68 = dArr15[0];
                        double d69 = dArr15[1];
                        double d70 = dArr15[2];
                        double d71 = dArr15[3];
                        dArr8[0] = (dArr16[0] * d68) + (dArr16[4] * d69) + (dArr16[8] * d70) + (dArr16[12] * d71);
                        dArr8[1] = (dArr16[1] * d68) + (dArr16[5] * d69) + (dArr16[9] * d70) + (dArr16[13] * d71);
                        dArr8[2] = (dArr16[2] * d68) + (dArr16[6] * d69) + (dArr16[10] * d70) + (dArr16[14] * d71);
                        d = (d68 * dArr16[3]) + (d69 * dArr16[7]) + (d70 * dArr16[11]) + (d71 * dArr16[15]);
                    } else {
                        dArr8[2] = 0.0d;
                        dArr8[1] = 0.0d;
                        dArr8[0] = 0.0d;
                        d = 1.0d;
                    }
                    dArr8[3] = d;
                    int i14 = 0;
                    do {
                        dArr11[i14] = dArr13[3][i14];
                        i14++;
                    } while (i14 < 3);
                    double[][] dArr17 = new double[3][];
                    int i15 = 0;
                    do {
                        dArr17[i15] = new double[3];
                        i15++;
                    } while (i15 < 3);
                    int i16 = 0;
                    do {
                        double[] dArr18 = dArr17[i16];
                        double[] dArr19 = dArr13[i16];
                        dArr18[0] = dArr19[0];
                        dArr18[1] = dArr19[1];
                        dArr18[2] = dArr19[2];
                        i16++;
                    } while (i16 < 3);
                    double A01 = W3D.A01(dArr17[0]);
                    dArr9[0] = A01;
                    double[] A06 = W3D.A06(dArr17[0], A01);
                    dArr17[0] = A06;
                    double A02 = W3D.A02(A06, dArr17[1]);
                    dArr10[0] = A02;
                    double[] A07 = W3D.A07(dArr17[1], dArr17[0], -A02);
                    dArr17[1] = A07;
                    double A012 = W3D.A01(A07);
                    dArr9[1] = A012;
                    dArr17[1] = W3D.A06(dArr17[1], A012);
                    dArr10[0] = dArr10[0] / dArr9[1];
                    double A022 = W3D.A02(dArr17[0], dArr17[2]);
                    dArr10[1] = A022;
                    double[] A072 = W3D.A07(dArr17[2], dArr17[0], -A022);
                    dArr17[2] = A072;
                    double A023 = W3D.A02(dArr17[1], A072);
                    dArr10[2] = A023;
                    double[] A073 = W3D.A07(dArr17[2], dArr17[1], -A023);
                    dArr17[2] = A073;
                    double A013 = W3D.A01(A073);
                    dArr9[2] = A013;
                    double[] A062 = W3D.A06(dArr17[2], A013);
                    dArr17[2] = A062;
                    double d72 = dArr10[1];
                    double d73 = dArr9[2];
                    dArr10[1] = d72 / d73;
                    dArr10[2] = dArr10[2] / d73;
                    double[] dArr20 = dArr17[1];
                    0qQ.A0B(dArr20, 0);
                    double d74 = dArr20[1];
                    double d75 = A062[2];
                    double d76 = dArr20[2];
                    double d77 = A062[0];
                    double d78 = dArr20[0];
                    if (W3D.A02(dArr17[0], new double[]{(d74 * d75) - (A062[1] * d76), (d76 * d77) - (d75 * d78), (d78 * A062[1]) - (dArr20[1] * d77)}) < 0.0d) {
                        int i17 = 0;
                        do {
                            dArr9[i17] = dArr9[i17] * -1.0d;
                            double[] dArr21 = dArr17[i17];
                            dArr21[0] = dArr21[0] * -1.0d;
                            dArr21[1] = dArr21[1] * -1.0d;
                            dArr21[2] = dArr21[2] * -1.0d;
                            i17++;
                        } while (i17 < 3);
                    }
                    double[] dArr22 = dArr17[2];
                    C13990Tnq.A1W(dArr12, (-Math.atan2(dArr22[1], dArr22[2])) * 57.29577951308232d, 0);
                    double d79 = -dArr22[0];
                    double d80 = dArr22[1];
                    double d81 = dArr22[2];
                    C13990Tnq.A1W(dArr12, (-Math.atan2(d79, Math.sqrt((d80 * d80) + (d81 * d81)))) * 57.29577951308232d, 1);
                    C13990Tnq.A1W(dArr12, (-Math.atan2(dArr17[1][0], dArr17[0][0])) * 57.29577951308232d, 2);
                }
            }
            view2.setTranslationX(W2U.A01(sanitizeFloatPropertyValue((float) dArr11[0])));
            view2.setTranslationY(W2U.A01(sanitizeFloatPropertyValue((float) dArr11[1])));
            view2.setRotation(sanitizeFloatPropertyValue((float) dArr12[2]));
            view2.setRotationX(sanitizeFloatPropertyValue((float) dArr12[0]));
            view2.setRotationY(sanitizeFloatPropertyValue((float) dArr12[1]));
            view2.setScaleX(sanitizeFloatPropertyValue((float) dArr9[0]));
            view2.setScaleY(sanitizeFloatPropertyValue((float) dArr9[1]));
            float f5 = (float) dArr8[2];
            if (f5 == 0.0f) {
                f5 = 7.8125E-4f;
            }
            float f6 = -1.0f / f5;
            DisplayMetrics displayMetrics = C11414SSm.A00;
            if (displayMetrics != null) {
                float f7 = displayMetrics.density;
                sanitizeFloatPropertyValue = sanitizeFloatPropertyValue(f7 * f7 * f6 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                throw new IllegalStateException(Pxd.A00(472));
            }
        }
        view2.setCameraDistance(sanitizeFloatPropertyValue);
    }

    @ReactProp(name = "accessibilityState")
    public void setViewState(View view, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey(STATE_EXPANDED)) {
                view.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
            }
            if (readableMap.hasKey("selected")) {
                boolean isSelected = view.isSelected();
                boolean z = readableMap.getBoolean("selected");
                view.setSelected(z);
                if (view.isAccessibilityFocused() && isSelected && !z) {
                    view.announceForAccessibility(view.getContext().getString(2131974190));
                }
            } else {
                view.setSelected(false);
            }
            view.setTag(R.id.accessibility_state, readableMap);
            if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
                view.setEnabled(true);
            }
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CKI()) {
                String Crc = keySetIterator.Crc();
                if (Crc.equals(STATE_BUSY) || Crc.equals(STATE_EXPANDED) || (Crc.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                    updateViewContentDescription(view);
                    return;
                } else if (view.isAccessibilityFocused()) {
                    view.sendAccessibilityEvent(1);
                }
            }
        }
    }

    private void logUnsupportedPropertyWarning(String str) {
        0I1.A09("ReactNative", "%s doesn't support property '%s'", new Object[]{getName(), str});
    }

    public static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException(002.A0N("Invalid float property value: ", f));
    }

    public static void setPointerEventsFlag(View view, C16483Uvd uvd, boolean z) {
        int A0A = AnonymousClass7TG.A0A((Number) view.getTag(R.id.pointer_events));
        int ordinal = 1 << uvd.ordinal();
        int i = ordinal | A0A;
        if (!z) {
            i = (ordinal ^ -1) & A0A;
        }
        view.setTag(R.id.pointer_events, Integer.valueOf(i));
    }

    private void updateViewAccessibility(View view) {
        C14750U7h.A02(view, view.getImportantForAccessibility(), view.isFocusable());
    }

    private void updateViewContentDescription(View view) {
        Dynamic dynamic;
        Context context;
        int i;
        Object tag = view.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (tag != null) {
            arrayList.add(tag);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CKI()) {
                String Crc = keySetIterator.Crc();
                Dynamic dynamic2 = readableMap.getDynamic(Crc);
                if (Crc.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    context = view.getContext();
                    i = 2131974187;
                } else if (Crc.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    context = view.getContext();
                    i = 2131974185;
                }
                arrayList.add(context.getString(i));
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            view.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    public void onAfterUpdateTransaction(View view) {
        updateViewAccessibility(view);
        Boolean bool = (Boolean) view.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            view.addOnLayoutChangeListener(this);
            setTransformProperty(view, (ReadableArray) view.getTag(R.id.transform), (ReadableArray) view.getTag(R.id.transform_origin));
            view.setTag(R.id.invalidate_transform, AnonymousClass7TE.A0u());
        }
        C18098VlS.A00(view, (ReadableArray) view.getTag(R.id.filter), (Boolean) view.getTag(R.id.use_hardware_layer));
    }

    @ReactProp(name = "accessibilityCollection")
    public void setAccessibilityCollection(View view, ReadableMap readableMap) {
        view.setTag(R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(View view, ReadableMap readableMap) {
        view.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(View view, String str) {
        view.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(View view, String str) {
        view.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(View view, Dynamic dynamic) {
        int i;
        String string;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                i = R.id.labelled_by;
                string = dynamic.asString();
            } else if (dynamic.getType() == ReadableType.Array) {
                i = R.id.labelled_by;
                string = dynamic.asArray().getString(0);
            } else {
                return;
            }
            view.setTag(i, string);
        }
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(View view, String str) {
        C16684Uze A01;
        if (str == null) {
            A01 = null;
        } else {
            A01 = C16684Uze.A01(str);
        }
        view.setTag(R.id.accessibility_role, A01);
    }

    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(View view, ReadableMap readableMap) {
        if (readableMap == null) {
            view.setTag(R.id.accessibility_value, (Object) null);
            view.setContentDescription((CharSequence) null);
            return;
        }
        view.setTag(R.id.accessibility_value, readableMap);
        if (readableMap.hasKey("text")) {
            updateViewContentDescription(view);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(View view, int i) {
        view.setBackgroundColor(i);
    }

    @ReactProp(name = "elevation")
    public void setElevation(View view, float f) {
        view.setElevation(W2U.A01(f));
    }

    @ReactProp(customType = "Filter", name = "filter")
    public void setFilter(View view, ReadableArray readableArray) {
        if (C18103VlX.A00(view) == 2) {
            view.setTag(R.id.filter, readableArray);
        }
    }

    @ReactProp(name = "mixBlendMode")
    public void setMixBlendMode(View view, String str) {
        if (C18103VlX.A00(view) == 2) {
            view.setTag(R.id.mix_blend_mode, S9D.A00(str));
            if (view.getParent() instanceof View) {
                ((View) view.getParent()).invalidate();
            }
        }
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(View view, String str) {
        view.setTag(R.id.view_tag_native_id, str);
        Object tag = view.getTag(R.id.view_tag_native_id);
        if ((tag instanceof String) && tag != null) {
            Iterator it = C18716Vym.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("getNativeId");
            }
            Iterator A0u = AnonymousClass7TF.A0u(C18716Vym.A01);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Set set = (Set) A1J.getValue();
                if (set != null && set.contains(tag)) {
                    A1J.getKey();
                    throw new NullPointerException("onViewFound");
                }
            }
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(View view, float f) {
        view.setAlpha(f);
    }

    @ReactProp(customType = "Color", name = "outlineColor")
    public void setOutlineColor(View view, Integer num) {
        W3s.A0D(view, num);
    }

    @ReactProp(name = "outlineOffset")
    public void setOutlineOffset(View view, float f) {
        W3s.A05(view, f);
    }

    @ReactProp(name = "outlineWidth")
    public void setOutlineWidth(View view, float f) {
        W3s.A06(view, f);
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(View view, boolean z) {
        view.setTag(R.id.use_hardware_layer, Boolean.valueOf(z));
    }

    @ReactProp(name = "role")
    public void setRole(View view, String str) {
        C16531Uwb uwb;
        if (str != null) {
            C16531Uwb[] values = C16531Uwb.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                uwb = values[i];
                if (uwb.name().equalsIgnoreCase(str)) {
                    break;
                }
                i++;
            }
        }
        uwb = null;
        view.setTag(R.id.role, uwb);
    }

    @ReactProp(name = "rotation")
    @Deprecated
    public void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    @ReactProp(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
        view.setOutlineSpotShadowColor(i);
    }

    @ReactProp(name = "testID")
    public void setTestId(View view, String str) {
        view.setTag(R.id.react_test_id, str);
        view.setTag(str);
    }

    @ReactProp(name = "transform")
    public void setTransform(View view, ReadableArray readableArray) {
        if (!2Ob.A00(view.getTag(R.id.transform), readableArray)) {
            view.setTag(R.id.transform, readableArray);
            view.setTag(R.id.invalidate_transform, AnonymousClass7TE.A0v());
        }
    }

    @ReactProp(name = "transformOrigin")
    public void setTransformOrigin(View view, ReadableArray readableArray) {
        if (!2Ob.A00(view.getTag(R.id.transform_origin), readableArray)) {
            view.setTag(R.id.transform_origin, readableArray);
            view.setTag(R.id.invalidate_transform, AnonymousClass7TE.A0v());
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(View view, float f) {
        view.setTranslationX(W2U.A01(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(View view, float f) {
        view.setTranslationY(W2U.A01(f));
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(View view, float f) {
        ViewGroupManager.setViewZIndex(view, Math.round(f));
        ViewParent parent = view.getParent();
        if (parent instanceof X60) {
            ((X60) parent).FKE();
        }
    }

    public BaseViewManager(QZK qzk) {
        super(qzk);
    }

    public BaseViewManager() {
        super((QZK) null);
    }
}
