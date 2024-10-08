package com.facebook.react.views.textinput;

import X.0Sd;
import X.AnonymousClass2T1;
import X.C13989Tnp;
import X.C17615Vb7;
import X.C17664Vbv;
import X.C18592Vuj;
import X.C18764Vzz;
import X.C20837X0m;
import X.C244143ai;
import X.C245003c8;
import X.C251383n1;
import X.C51968G9o;
import X.QZL;
import X.USd;
import X.W3K;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;

public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements AnonymousClass2T1 {
    public int A00 = -1;
    public String A01 = null;
    public String A02 = null;
    public EditText A03;
    public C17615Vb7 A04;

    public ReactTextInputShadowNode() {
        super((C20837X0m) null);
        this.A03 = 1;
        A09(this);
    }

    public final boolean A0B() {
        return true;
    }

    public final boolean A0C() {
        return true;
    }

    public final void setTextBreakStrategy(String str) {
        int i = 0;
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                i = 1;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                C13989Tnp.A1T("Invalid textBreakStrategy: ", str);
            }
        }
        this.A03 = i;
    }

    public final void A08(C18592Vuj vuj) {
        if (this.A00 != -1) {
            SpannableStringBuilder A002 = ReactBaseTextShadowNode.A00((W3K) null, this, this.A02, false);
            int i = this.A00;
            C245003c8 r1 = this.A0B;
            vuj.A0F.add(new USd(vuj, new C17664Vbv(A002, r1.getLayoutPadding(C244143ai.A00(0)), r1.getLayoutPadding(C244143ai.A00(1)), r1.getLayoutPadding(C244143ai.A00(2)), r1.getLayoutPadding(C244143ai.A00(3)), i, this.A02, this.A03, this.A0E), this.A00));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r0 != r1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Cnu(X.C245103cK r5, X.C245103cK r6, X.C245003c8 r7, float r8, float r9) {
        /*
            r4 = this;
            android.widget.EditText r2 = r4.A03
            X.0Sd.A00(r2)
            X.Vb7 r3 = r4.A04
            if (r3 == 0) goto L_0x0078
            android.text.SpannableStringBuilder r0 = r3.A05
            r2.setText(r0)
            float r1 = r3.A00
            r0 = 0
            r2.setTextSize(r0, r1)
            int r0 = r3.A04
            r2.setMinLines(r0)
            int r0 = r3.A03
            r2.setMaxLines(r0)
            int r0 = r3.A02
            r2.setInputType(r0)
            java.lang.CharSequence r0 = r3.A06
            r2.setHint(r0)
            int r1 = r3.A01
        L_0x002a:
            r2.setBreakStrategy(r1)
        L_0x002d:
            java.lang.String r0 = r4.A01
            r2.setHint(r0)
            r0 = 1
            int r1 = X.DbU.A02(r5, r0)
            if (r1 == r0) goto L_0x006c
            r0 = 2
            if (r1 == r0) goto L_0x0070
            r0 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
        L_0x0041:
            r0 = 1
            int r1 = X.DbU.A02(r6, r0)
            if (r1 == r0) goto L_0x0060
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
        L_0x0050:
            r2.measure(r3, r0)
            int r1 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            long r0 = X.C245193cT.A00(r1, r0)
            return r0
        L_0x0060:
            int r1 = (int) r9
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0067
        L_0x0064:
            int r1 = (int) r9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0067:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x0050
        L_0x006c:
            int r1 = (int) r8
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0073
        L_0x0070:
            int r1 = (int) r8
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0073:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x0041
        L_0x0078:
            r1 = 0
            X.Vkp r0 = r4.A04
            int r0 = r0.A02()
            float r0 = (float) r0
            r2.setTextSize(r1, r0)
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x008b
            r2.setLines(r1)
        L_0x008b:
            int r0 = r2.getBreakStrategy()
            int r1 = r4.A03
            if (r0 == r1) goto L_0x002d
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputShadowNode.Cnu(X.3cK, X.3cK, X.3c8, float, float):long");
    }

    public final void EcY(Object obj) {
        0Sd.A02(obj instanceof C17615Vb7);
        this.A04 = (C17615Vb7) obj;
        APB();
    }

    public final void EoS(QZL qzl) {
        this.A0A = qzl;
        0Sd.A00(qzl);
        EditText editText = new EditText(new C251383n1((Context) qzl, 2132018372));
        C18764Vzz vzz = this.A0K;
        vzz.A01((float) editText.getPaddingStart(), 4);
        ReactShadowNodeImpl.A03(this);
        vzz.A01((float) editText.getPaddingTop(), 1);
        ReactShadowNodeImpl.A03(this);
        vzz.A01((float) editText.getPaddingEnd(), 5);
        ReactShadowNodeImpl.A03(this);
        vzz.A01((float) editText.getPaddingBottom(), 3);
        ReactShadowNodeImpl.A03(this);
        this.A03 = editText;
        editText.setPadding(0, 0, 0, 0);
        C51968G9o.A1D(this.A03, -2);
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.A00 = i;
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(String str) {
        this.A01 = str;
        A07();
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A02 = str;
        A07();
    }

    public final void EfF(int i, float f) {
        super.EfF(i, f);
        A07();
    }
}
