package com.facebook.react.views.text;

import X.0I1;
import X.0Sd;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C14702U2c;
import X.C16531Uwb;
import X.C16684Uze;
import X.C18063Vkp;
import X.C18557Vu9;
import X.C18788W1q;
import X.C20837X0m;
import X.C245003c8;
import X.C245093cJ;
import X.C51967G9n;
import X.Pxg;
import X.QZA;
import X.QZL;
import X.U2D;
import X.U2K;
import X.U2R;
import X.U2S;
import X.V6H;
import X.W2U;
import X.W7v;
import X.WJc;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;
import java.util.Map;

public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C18063Vkp A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public C16684Uze A0G;
    public C16531Uwb A0H;
    public C20837X0m A0I;
    public String A0J;
    public String A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r13 != null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A00(X.W3K r13, com.facebook.react.views.text.ReactBaseTextShadowNode r14, java.lang.String r15, boolean r16) {
        /*
            r11 = 0
            r5 = 1
            r12 = r16
            if (r16 == 0) goto L_0x0009
            r1 = 0
            if (r13 == 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            java.lang.String r0 = "nativeViewHierarchyOptimizer is required when inline views are supported"
            X.0Sd.A03(r1, r0)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r16 == 0) goto L_0x007a
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x0020:
            r7 = r14
            if (r15 == 0) goto L_0x002e
            X.Vkp r0 = r14.A04
            java.lang.Integer r0 = r0.A05
            java.lang.String r0 = X.V6H.A00(r0, r15)
            r6.append(r0)
        L_0x002e:
            r8 = 0
            A01(r6, r7, r8, r9, r10, r11, r12)
            r14.A0L = r10
            r3 = 2143289344(0x7fc00000, float:NaN)
        L_0x0036:
            int r0 = r9.size()
            if (r11 >= r0) goto L_0x007c
            int r0 = r9.size()
            int r0 = r0 - r11
            int r0 = r0 - r5
            java.lang.Object r4 = r9.get(r0)
            X.Vu9 r4 = (X.C18557Vu9) r4
            X.X0n r1 = r4.A00
            boolean r0 = r1 instanceof X.C14702U2c
            if (r0 == 0) goto L_0x0074
            X.U2c r1 = (X.C14702U2c) r1
            int r2 = r1.A00
            int r0 = r1.A01
            java.lang.Object r1 = X.C51968G9o.A0z(r10, r0)
            com.facebook.react.uimanager.ReactShadowNode r1 = (com.facebook.react.uimanager.ReactShadowNode) r1
            r0 = r1
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0064
            X.W3K.A02(r13, r1, r8)
        L_0x0064:
            com.facebook.react.uimanager.ReactShadowNodeImpl r1 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r1
            r1.A07 = r14
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x0073
            float r0 = (float) r2
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0074
        L_0x0073:
            float r3 = (float) r2
        L_0x0074:
            r4.A01(r6, r11)
            int r11 = r11 + 1
            goto L_0x0036
        L_0x007a:
            r10 = 0
            goto L_0x0020
        L_0x007c:
            X.Vkp r0 = r14.A04
            r0.A01 = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactBaseTextShadowNode.A00(X.W3K, com.facebook.react.views.text.ReactBaseTextShadowNode, java.lang.String, boolean):android.text.SpannableStringBuilder");
    }

    @ReactProp(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i = 1;
        if (str != null && !"highQuality".equals(str)) {
            if ("simple".equals(str)) {
                i = 0;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                C13989Tnp.A1T("Invalid textBreakStrategy: ", str);
            }
        }
        this.A03 = i;
        A07();
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.A0P = false;
        this.A0O = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.A0P = true;
                } else if ("line-through".equals(str2)) {
                    this.A0O = true;
                }
            }
        }
        A07();
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.A07 = 0.0f;
        this.A08 = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey(IgReactMediaPickerNativeModule.WIDTH) && !readableMap.isNull(IgReactMediaPickerNativeModule.WIDTH)) {
                this.A07 = W2U.A04(readableMap, IgReactMediaPickerNativeModule.WIDTH);
            }
            if (readableMap.hasKey(IgReactMediaPickerNativeModule.HEIGHT) && !readableMap.isNull(IgReactMediaPickerNativeModule.HEIGHT)) {
                this.A08 = W2U.A04(readableMap, IgReactMediaPickerNativeModule.HEIGHT);
            }
        }
        A07();
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [android.text.style.StrikethroughSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v22, types: [android.text.style.UnderlineSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v26, types: [android.text.style.AbsoluteSizeSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v33, types: [android.text.style.BackgroundColorSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v34, types: [android.text.style.ForegroundColorSpan, X.X0n] */
    public static void A01(SpannableStringBuilder spannableStringBuilder, ReactBaseTextShadowNode reactBaseTextShadowNode, C18063Vkp vkp, List list, Map map, int i, boolean z) {
        Object obj;
        float f;
        float f2;
        ReactBaseTextShadowNode reactBaseTextShadowNode2 = reactBaseTextShadowNode;
        C18063Vkp vkp2 = reactBaseTextShadowNode2.A04;
        C18063Vkp vkp3 = vkp;
        if (vkp != null) {
            C18063Vkp vkp4 = new C18063Vkp();
            vkp4.A06 = vkp3.A06;
            float f3 = vkp2.A00;
            if (Float.isNaN(f3)) {
                f3 = vkp3.A00;
            }
            vkp4.A00 = f3;
            float f4 = vkp2.A03;
            if (Float.isNaN(f4)) {
                f4 = vkp3.A03;
            }
            vkp4.A03 = f4;
            float f5 = vkp2.A02;
            if (Float.isNaN(f5)) {
                f5 = vkp3.A02;
            }
            vkp4.A02 = f5;
            float f6 = vkp2.A04;
            if (Float.isNaN(f6)) {
                f6 = vkp3.A04;
            }
            vkp4.A04 = f6;
            float f7 = vkp2.A01;
            if (Float.isNaN(f7)) {
                f7 = vkp3.A01;
            }
            vkp4.A01 = f7;
            Integer num = vkp2.A05;
            if (num == AnonymousClass05K.A0Y) {
                num = vkp3.A05;
            }
            vkp4.A05 = num;
            vkp2 = vkp4;
        }
        int AnH = reactBaseTextShadowNode2.AnH();
        int i2 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            List list2 = list;
            if (i2 < AnH) {
                ReactShadowNodeImpl A062 = reactBaseTextShadowNode2.A06(i2);
                if (A062 instanceof ReactRawTextShadowNode) {
                    spannableStringBuilder2.append(V6H.A00(vkp2.A05, ((ReactRawTextShadowNode) A062).A00));
                } else {
                    Map map2 = map;
                    boolean z2 = z;
                    if (A062 instanceof ReactBaseTextShadowNode) {
                        List list3 = list2;
                        C18063Vkp vkp5 = vkp2;
                        ReactBaseTextShadowNode reactBaseTextShadowNode3 = (ReactBaseTextShadowNode) A062;
                        A01(spannableStringBuilder2, reactBaseTextShadowNode3, vkp5, list3, map2, spannableStringBuilder2.length(), z2);
                    } else if (z) {
                        int i3 = A062.A00;
                        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) A062.A0B;
                        C245093cJ valueFromLong = YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer));
                        C245093cJ valueFromLong2 = YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer));
                        Integer num2 = valueFromLong.A01;
                        Integer num3 = AnonymousClass05K.A01;
                        if (num2 == num3 && valueFromLong2.A01 == num3) {
                            f = valueFromLong.A00;
                            f2 = valueFromLong2.A00;
                        } else {
                            C245003c8 r3 = A062.A0B;
                            r3.calculateLayout(Float.NaN, Float.NaN);
                            float[] fArr = ((YogaNodeJNIBase) r3).arr;
                            if (fArr != null) {
                                f = fArr[1];
                            } else {
                                f = 0.0f;
                            }
                            float[] fArr2 = ((YogaNodeJNIBase) A062.A0B).arr;
                            if (fArr2 != null) {
                                f2 = fArr2[2];
                            } else {
                                f2 = 0.0f;
                            }
                        }
                        spannableStringBuilder2.append("0");
                        int length = spannableStringBuilder2.length();
                        C18557Vu9.A00(new C14702U2c(i3, (int) f, (int) f2), list2, spannableStringBuilder2.length() - 1, length);
                        C51967G9n.A1O(A062, map2, i3);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        Pxg.A1R(sb, "Unexpected view type nested under a <Text> or <TextInput> node: ", A062);
                        throw new QZA(sb.toString());
                    }
                }
                A062.Cm6();
                i2++;
            } else {
                int length2 = spannableStringBuilder2.length();
                int i4 = i;
                if (length2 >= i4) {
                    if (reactBaseTextShadowNode2.A0N) {
                        C18557Vu9.A00(new ForegroundColorSpan(reactBaseTextShadowNode2.A0B), list2, i4, length2);
                    }
                    if (reactBaseTextShadowNode2.A0M) {
                        C18557Vu9.A00(new BackgroundColorSpan(reactBaseTextShadowNode2.A0A), list2, i4, length2);
                    }
                    Object obj2 = reactBaseTextShadowNode2.A0H;
                    if (obj2 != null) {
                        obj = C16531Uwb.LINK;
                    } else {
                        obj2 = reactBaseTextShadowNode2.A0G;
                        obj = C16684Uze.LINK;
                    }
                    if (obj2 == obj) {
                        C18557Vu9.A00(new U2K(reactBaseTextShadowNode2.A00), list2, i4, length2);
                    }
                    float A002 = vkp2.A00();
                    if (!Float.isNaN(A002) && (vkp == null || vkp3.A00() != A002)) {
                        C18557Vu9.A00(new U2R(A002), list2, i4, length2);
                    }
                    int A022 = vkp2.A02();
                    if (vkp == null || vkp3.A02() != A022) {
                        C18557Vu9.A00(new AbsoluteSizeSpan(A022), list2, i4, length2);
                    }
                    int i5 = reactBaseTextShadowNode2.A0C;
                    if (!(i5 == -1 && reactBaseTextShadowNode2.A0D == -1 && reactBaseTextShadowNode2.A0J == null)) {
                        int i6 = reactBaseTextShadowNode2.A0D;
                        String str = reactBaseTextShadowNode2.A0K;
                        String str2 = reactBaseTextShadowNode2.A0J;
                        QZL qzl = reactBaseTextShadowNode2.A0A;
                        0Sd.A00(qzl);
                        C18557Vu9.A00(new U2S(qzl.getAssets(), str, str2, i5, i6), list2, i4, length2);
                    }
                    if (reactBaseTextShadowNode2.A0P) {
                        C18557Vu9.A00(new UnderlineSpan(), list2, i4, length2);
                    }
                    if (reactBaseTextShadowNode2.A0O) {
                        C18557Vu9.A00(new StrikethroughSpan(), list2, i4, length2);
                    }
                    if (!((reactBaseTextShadowNode2.A07 == 0.0f && reactBaseTextShadowNode2.A08 == 0.0f && reactBaseTextShadowNode2.A09 == 0.0f) || Color.alpha(reactBaseTextShadowNode2.A0F) == 0)) {
                        C18557Vu9.A00(new U2D(reactBaseTextShadowNode2.A07, reactBaseTextShadowNode2.A08, reactBaseTextShadowNode2.A09, reactBaseTextShadowNode2.A0F), list2, i4, length2);
                    }
                    float A012 = vkp2.A01();
                    if (!Float.isNaN(A012) && (vkp == null || vkp3.A01() != A012)) {
                        C18557Vu9.A00(new W7v(A012), list2, i4, length2);
                    }
                    C18557Vu9.A00(new WJc(reactBaseTextShadowNode2.A00), list2, i4, length2);
                    return;
                }
                return;
            }
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.A05) {
            this.A05 = z;
            A07();
        }
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        C18063Vkp vkp = this.A04;
        if (z != vkp.A06) {
            vkp.A06 = z;
            A07();
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(String str) {
        this.A0J = str;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.A04.A00 = f;
        A07();
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.A06 = z;
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.A04.A02 = f;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.A04.A03 = f;
        A07();
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        C18063Vkp vkp = this.A04;
        if (f != vkp.A04) {
            if (f != 0.0f && f < 1.0f) {
                0I1.A04("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
                f = Float.NaN;
            }
            vkp.A04 = f;
            A07();
        }
    }

    @ReactProp(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A07();
        }
    }

    @ReactProp(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.A01 = i;
        A07();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            this.A0E = 1;
        } else {
            int i = 0;
            this.A0E = 0;
            if (str != null && !"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        i = 5;
                    } else if ("center".equals(str)) {
                        this.A02 = 1;
                        A07();
                    } else {
                        C13989Tnp.A1T("Invalid textAlign: ", str);
                    }
                }
            }
            this.A02 = i;
            A07();
        }
        this.A02 = 3;
        A07();
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.A0F) {
            this.A0F = i;
            A07();
        }
    }

    @ReactProp(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.A09) {
            this.A09 = f;
            A07();
        }
    }

    @ReactProp(name = "textTransform")
    public void setTextTransform(String str) {
        C18063Vkp vkp;
        Integer num;
        if (str == null) {
            vkp = this.A04;
            num = AnonymousClass05K.A0Y;
        } else if (NetInfoModule.CONNECTION_TYPE_NONE.equals(str)) {
            vkp = this.A04;
            num = AnonymousClass05K.A00;
        } else if ("uppercase".equals(str)) {
            vkp = this.A04;
            num = AnonymousClass05K.A01;
        } else if ("lowercase".equals(str)) {
            vkp = this.A04;
            num = AnonymousClass05K.A0C;
        } else if ("capitalize".equals(str)) {
            vkp = this.A04;
            num = AnonymousClass05K.A0N;
        } else {
            C13989Tnp.A1T("Invalid textTransform: ", str);
            vkp = this.A04;
            num = AnonymousClass05K.A0Y;
        }
        vkp.A05 = num;
        A07();
    }

    public ReactBaseTextShadowNode(C20837X0m x0m) {
        this.A0N = false;
        this.A0M = false;
        this.A0G = null;
        this.A0H = null;
        this.A01 = -1;
        this.A02 = 0;
        this.A03 = 1;
        this.A0E = 0;
        this.A07 = 0.0f;
        this.A08 = 0.0f;
        this.A09 = 0.0f;
        this.A0F = 1426063360;
        this.A0P = false;
        this.A0O = false;
        this.A06 = true;
        this.A05 = false;
        this.A00 = 0.0f;
        this.A0C = -1;
        this.A0D = -1;
        this.A0J = null;
        this.A0K = null;
        this.A04 = new C18063Vkp();
        this.A0I = x0m;
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (Cem()) {
            this.A0G = C16684Uze.A01(str);
            A07();
        }
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (Cem()) {
            boolean A1V = AnonymousClass7TF.A1V(num);
            this.A0M = A1V;
            if (A1V) {
                this.A0A = num.intValue();
            }
            A07();
        }
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean A1V = AnonymousClass7TF.A1V(num);
        this.A0N = A1V;
        if (A1V) {
            this.A0B = num.intValue();
        }
        A07();
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(String str) {
        int A002 = C18788W1q.A00(str);
        if (A002 != this.A0C) {
            this.A0C = A002;
            A07();
        }
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String A032 = C18788W1q.A03(readableArray);
        if (!TextUtils.equals(A032, this.A0K)) {
            this.A0K = A032;
            A07();
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(String str) {
        int A012 = C18788W1q.A01(str);
        if (A012 != this.A0D) {
            this.A0D = A012;
            A07();
        }
    }

    @ReactProp(name = "role")
    public void setRole(String str) {
        C16531Uwb uwb;
        if (Cem()) {
            C16531Uwb[] values = C16531Uwb.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uwb = null;
                    break;
                }
                uwb = values[i];
                if (uwb.name().equalsIgnoreCase(str)) {
                    break;
                }
                i++;
            }
            this.A0H = uwb;
            A07();
        }
    }

    public ReactBaseTextShadowNode() {
        this((C20837X0m) null);
    }
}
