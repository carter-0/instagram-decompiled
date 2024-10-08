package com.facebook.react.views.text;

import X.0Sd;
import X.AnonymousClass2T1;
import X.AnonymousClass7TF;
import X.C14702U2c;
import X.C17664Vbv;
import X.C18592Vuj;
import X.C20837X0m;
import X.C20887X2r;
import X.C244143ai;
import X.C245003c8;
import X.C245033cB;
import X.C51968G9o;
import X.USd;
import X.W3K;
import X.WL0;
import X.WL3;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Map;

public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint A04 = new TextPaint(1);
    public Spannable A00;
    public boolean A01;
    public final C20887X2r A02;
    public final AnonymousClass2T1 A03;

    public final boolean A0A() {
        return true;
    }

    public final void Cxt(W3K w3k) {
        this.A00 = ReactBaseTextShadowNode.A00(w3k, this, (String) null, true);
        A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r12 == 3) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r12 == 5) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r21 < 0.0f) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A01(android.text.Spannable r18, com.facebook.react.views.text.ReactTextShadowNode r19, X.C245103cK r20, float r21) {
        /*
            r8 = r21
            android.text.TextPaint r15 = A04
            r6 = r19
            X.Vkp r0 = r6.A04
            int r0 = r0.A02()
            float r0 = (float) r0
            r15.setTextSize(r0)
            r14 = r18
            android.text.BoringLayout$Metrics r1 = android.text.BoringLayout.isBoring(r14, r15)
            if (r1 != 0) goto L_0x00de
            float r10 = android.text.Layout.getDesiredWidth(r14, r15)
        L_0x001c:
            X.3cK r0 = X.C245103cK.UNDEFINED
            r5 = 0
            r7 = 0
            r4 = 1
            r2 = r20
            if (r2 == r0) goto L_0x002a
            int r0 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            r13 = 0
            if (r0 >= 0) goto L_0x002b
        L_0x002a:
            r13 = 1
        L_0x002b:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r12 = r6.A02
            X.3c8 r0 = r6.A0B
            X.3cB r11 = r0.getLayoutDirection()
            X.3cB r9 = X.C245033cB.RTL
            r2 = 3
            r0 = 5
            if (r11 != r9) goto L_0x00d2
            if (r12 == r0) goto L_0x0041
            if (r12 != r2) goto L_0x00d2
        L_0x003f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x0041:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0084
            if (r13 != 0) goto L_0x0051
            boolean r0 = X.C244163ak.A00(r10)
            if (r0 != 0) goto L_0x00a4
            int r0 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
        L_0x0051:
            double r0 = (double) r10
            double r0 = java.lang.Math.ceil(r0)
            int r8 = (int) r0
            int r0 = r14.length()
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r14, r7, r0, r15, r8)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r3)
            android.text.StaticLayout$Builder r1 = r0.setLineSpacing(r5, r2)
            boolean r0 = r6.A06
            android.text.StaticLayout$Builder r1 = r1.setIncludePad(r0)
            int r0 = r6.A03
            android.text.StaticLayout$Builder r0 = r1.setBreakStrategy(r0)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r7)
            int r0 = r6.A0E
            r1.setJustificationMode(r0)
        L_0x007c:
            r1.setUseLineSpacingFromFallbacks(r4)
            android.text.StaticLayout r0 = r1.build()
            return r0
        L_0x0084:
            if (r13 != 0) goto L_0x008d
            int r0 = r1.width
            float r0 = (float) r0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
        L_0x008d:
            int r0 = r1.width
            int r16 = java.lang.Math.max(r0, r7)
            boolean r0 = r6.A06
            r21 = r0
            r19 = r5
            r20 = r1
            r17 = r3
            r18 = r2
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x00a4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 <= r0) goto L_0x00b0
            double r0 = (double) r8
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
        L_0x00b0:
            int r1 = r14.length()
            int r0 = (int) r8
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r14, r7, r1, r15, r0)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r3)
            android.text.StaticLayout$Builder r1 = r0.setLineSpacing(r5, r2)
            boolean r0 = r6.A06
            android.text.StaticLayout$Builder r1 = r1.setIncludePad(r0)
            int r0 = r6.A03
            android.text.StaticLayout$Builder r0 = r1.setBreakStrategy(r0)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r7)
            goto L_0x007c
        L_0x00d2:
            if (r12 == r4) goto L_0x00da
            if (r12 == r2) goto L_0x0041
            if (r12 == r0) goto L_0x003f
            goto L_0x0041
        L_0x00da:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0041
        L_0x00de:
            r10 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextShadowNode.A01(android.text.Spannable, com.facebook.react.views.text.ReactTextShadowNode, X.3cK, float):android.text.Layout");
    }

    public final void A08(C18592Vuj vuj) {
        Spannable spannable = this.A00;
        if (spannable != null) {
            C245003c8 r1 = this.A0B;
            float layoutPadding = r1.getLayoutPadding(C244143ai.A00(4));
            float layoutPadding2 = r1.getLayoutPadding(C244143ai.A00(1));
            float layoutPadding3 = r1.getLayoutPadding(C244143ai.A00(5));
            float layoutPadding4 = r1.getLayoutPadding(C244143ai.A00(3));
            int i = this.A02;
            if (r1.getLayoutDirection() == C245033cB.RTL) {
                if (i == 5) {
                    i = 3;
                } else if (i == 3) {
                    i = 5;
                }
            }
            vuj.A0F.add(new USd(vuj, new C17664Vbv(spannable, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, -1, i, this.A03, this.A0E), this.A00));
        }
    }

    public final Iterable AF0() {
        Map map = this.A0L;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spannable spannable = this.A00;
        0Sd.A01(spannable, "Spannable element has not been prepared in onBeforeLayout");
        ArrayList arrayList = new ArrayList(r3);
        for (C14702U2c u2c : (C14702U2c[]) spannable.getSpans(0, spannable.length(), C14702U2c.class)) {
            ReactShadowNode reactShadowNode = (ReactShadowNode) C51968G9o.A10(this.A0L, u2c.A01);
            ((ReactShadowNodeImpl) reactShadowNode).A0B.calculateLayout(Float.NaN, Float.NaN);
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.A01 = z;
    }

    public ReactTextShadowNode(C20837X0m x0m) {
        super(x0m);
        WL3 wl3 = new WL3(this);
        this.A03 = wl3;
        this.A02 = new WL0(this);
        if (!Cem()) {
            A09(wl3);
            C20887X2r x2r = this.A02;
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.A0B;
            yogaNodeJNIBase.mBaselineFunction = x2r;
            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass7TF.A1V(x2r));
        }
    }

    public final void A07() {
        super.A07();
        APB();
    }

    public ReactTextShadowNode() {
        this((C20837X0m) null);
    }
}
