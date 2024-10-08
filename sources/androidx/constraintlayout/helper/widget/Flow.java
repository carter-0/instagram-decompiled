package androidx.constraintlayout.helper.widget;

import X.2d3;
import X.AnonymousClass3MS;
import X.C71482dO;
import X.XGQ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Flow extends AnonymousClass3MS {
    public XGQ A00;

    public final void A07(2d3 r4, boolean z) {
        XGQ xgq = this.A00;
        int i = xgq.A04;
        if (i <= 0 && xgq.A03 <= 0) {
            return;
        }
        if (z) {
            xgq.A06 = xgq.A03;
            xgq.A07 = i;
            return;
        }
        xgq.A06 = i;
        xgq.A07 = xgq.A03;
    }

    public final void onMeasure(int i, int i2) {
        A0B(this.A00, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.A00.A00 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.A00.A01 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.A00.A08 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.A00.A09 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.A00.A02 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.A00.A0A = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.A00.A0B = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.A00.A03 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.A00.A0C = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.A00.A04 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.A00.A0D = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.A00.A0E = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.A00.A0F = i;
        requestLayout();
    }

    public void setPadding(int i) {
        XGQ xgq = this.A00;
        xgq.A05 = i;
        xgq.A02 = i;
        xgq.A04 = i;
        xgq.A03 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.A00.A02 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.A00.A06 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.A00.A05 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.A00.A0G = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.A00.A05 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.A00.A0H = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.A00.A0I = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.A00.A0J = i;
        requestLayout();
    }

    public final void A06(AttributeSet attributeSet) {
        XGQ xgq;
        int dimensionPixelSize;
        XGQ xgq2;
        int dimensionPixelSize2;
        super.A06(attributeSet);
        this.A00 = new XGQ();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71482dO.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.A00.A0F = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == 1) {
                        xgq2 = this.A00;
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        xgq2.A05 = dimensionPixelSize2;
                        xgq2.A02 = dimensionPixelSize2;
                        xgq2.A04 = dimensionPixelSize2;
                    } else {
                        if (index == 18) {
                            xgq = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            xgq.A04 = dimensionPixelSize;
                            xgq.A06 = dimensionPixelSize;
                        } else if (index == 19) {
                            xgq2 = this.A00;
                            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 2) {
                            this.A00.A06 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 3) {
                            this.A00.A05 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 4) {
                            xgq = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 5) {
                            this.A00.A02 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 54) {
                            this.A00.A0J = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 44) {
                            this.A00.A0B = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 53) {
                            this.A00.A0I = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 38) {
                            this.A00.A07 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 46) {
                            this.A00.A0C = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 40) {
                            this.A00.A08 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 48) {
                            this.A00.A0D = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 42) {
                            this.A00.A02 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 37) {
                            this.A00.A00 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 45) {
                            this.A00.A03 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 39) {
                            this.A00.A01 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 47) {
                            this.A00.A04 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 51) {
                            this.A00.A05 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 41) {
                            this.A00.A09 = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 50) {
                            this.A00.A0G = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 43) {
                            this.A00.A0A = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 52) {
                            this.A00.A0H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 49) {
                            this.A00.A0E = obtainStyledAttributes.getInt(index, -1);
                        }
                        xgq.A07 = dimensionPixelSize;
                    }
                    xgq2.A03 = dimensionPixelSize2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.A02 = this.A00;
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0237, code lost:
        if (r1[1] == r13) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x035c, code lost:
        if (r4 == 0) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0366, code lost:
        if (r4 == 0) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 == r1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0515, code lost:
        if (r3[1] == r1) goto L_0x0517;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x040c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass3MR r42, int r43, int r44) {
        /*
            r41 = this;
            int r21 = android.view.View.MeasureSpec.getMode(r43)
            int r20 = android.view.View.MeasureSpec.getSize(r43)
            int r19 = android.view.View.MeasureSpec.getMode(r44)
            int r18 = android.view.View.MeasureSpec.getSize(r44)
            r40 = r41
            r17 = r42
            if (r42 == 0) goto L_0x067b
            r9 = r17
            X.XGQ r9 = (X.XGQ) r9
            int r8 = r9.A00
            r7 = 0
            if (r8 <= 0) goto L_0x0083
            X.2d3 r0 = r9.A0h
            if (r0 == 0) goto L_0x007d
            X.2d1 r0 = (X.2d1) r0
            X.2dN r3 = r0.A08
            if (r3 == 0) goto L_0x007d
            r2 = 0
        L_0x002a:
            int r8 = r9.A00
            r6 = 1
            if (r2 >= r8) goto L_0x0083
            X.2d3[] r0 = r9.A01
            r4 = r0[r2]
            if (r4 == 0) goto L_0x004d
            boolean r0 = r4 instanceof X.AnonymousClass3MQ
            if (r0 != 0) goto L_0x004d
            java.lang.Integer[] r1 = r4.A14
            r0 = r1[r7]
            r5 = r1[r6]
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r0 != r1) goto L_0x0050
            int r0 = r4.A0H
            if (r0 == r6) goto L_0x0052
            if (r5 != r1) goto L_0x0052
            int r0 = r4.A0G
            if (r0 == r6) goto L_0x0052
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0050:
            if (r0 != r1) goto L_0x0054
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0054:
            if (r5 != r1) goto L_0x0058
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x0058:
            X.2d8 r1 = r9.A08
            r1.A06 = r0
            r1.A07 = r5
            int r0 = r4.A07()
            r1.A00 = r0
            int r0 = r4.A06()
            r1.A05 = r0
            r3.Cnt(r4, r1)
            int r0 = r1.A04
            r4.A0I(r0)
            int r0 = r1.A03
            r4.A0H(r0)
            int r0 = r1.A02
            r4.A0G(r0)
            goto L_0x004d
        L_0x007d:
            r9.A01 = r7
            r9.A00 = r7
            goto L_0x0119
        L_0x0083:
            int r0 = r9.A06
            r23 = r0
            int r0 = r9.A07
            r24 = r0
            int r0 = r9.A05
            r22 = r0
            int r0 = r9.A02
            r25 = r0
            r12 = 2
            int[] r6 = new int[r12]
            int r5 = r20 - r23
            int r5 = r5 - r24
            int r4 = r9.A0F
            r0 = 1
            if (r4 != r0) goto L_0x00a3
            int r5 = r18 - r22
            int r5 = r5 - r25
        L_0x00a3:
            r1 = -1
            int r0 = r9.A0B
            if (r0 != r1) goto L_0x00aa
            r9.A0B = r7
        L_0x00aa:
            int r0 = r9.A0I
            if (r0 != r1) goto L_0x00b0
            r9.A0I = r7
        L_0x00b0:
            X.2d3[] r3 = r9.A01
            r11 = r3
            r1 = 0
            r2 = 0
        L_0x00b5:
            r7 = 8
            if (r1 >= r8) goto L_0x00c4
            r0 = r3[r1]
            int r0 = r0.A0R
            if (r0 != r7) goto L_0x00c1
            int r2 = r2 + 1
        L_0x00c1:
            int r1 = r1 + 1
            goto L_0x00b5
        L_0x00c4:
            if (r2 <= 0) goto L_0x00dc
            int r0 = r8 - r2
            X.2d3[] r3 = new X.2d3[r0]
            r2 = 0
            r10 = 0
        L_0x00cc:
            if (r2 >= r8) goto L_0x00db
            r1 = r11[r2]
            int r0 = r1.A0R
            if (r0 == r7) goto L_0x00d8
            r3[r10] = r1
            int r10 = r10 + 1
        L_0x00d8:
            int r2 = r2 + 1
            goto L_0x00cc
        L_0x00db:
            r8 = r10
        L_0x00dc:
            r9.A0O = r3
            r9.A06 = r8
            int r1 = r9.A0J
            if (r1 == 0) goto L_0x05f4
            r2 = 1
            if (r1 == r2) goto L_0x041d
            if (r1 == r12) goto L_0x030b
            r0 = 3
            if (r1 == r0) goto L_0x0141
            r0 = 0
            r7 = 1
        L_0x00ee:
            r2 = r6[r0]
            int r2 = r2 + r23
            int r2 = r2 + r24
            r1 = r6[r7]
            int r1 = r1 + r22
            int r1 = r1 + r25
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r21
            if (r0 != r3) goto L_0x0134
            r2 = r20
        L_0x0104:
            r0 = r19
            if (r0 != r3) goto L_0x0127
            r1 = r18
        L_0x010a:
            r9.A01 = r2
            r9.A00 = r1
            r9.A0I(r2)
            r9.A0H(r1)
            int r0 = r9.A00
            if (r0 > 0) goto L_0x0119
            r7 = 0
        L_0x0119:
            r9.A0A = r7
            r0 = r17
            int r2 = r0.A01
            int r1 = r0.A00
            r0 = r40
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x0127:
            if (r0 != r4) goto L_0x0130
            r0 = r18
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x010a
        L_0x0130:
            if (r19 == 0) goto L_0x010a
            r1 = 0
            goto L_0x010a
        L_0x0134:
            if (r0 != r4) goto L_0x013d
            r0 = r20
            int r2 = java.lang.Math.min(r2, r0)
            goto L_0x0104
        L_0x013d:
            if (r21 == 0) goto L_0x0104
            r2 = 0
            goto L_0x0104
        L_0x0141:
            r7 = 1
            if (r8 == 0) goto L_0x0678
            java.util.ArrayList r14 = r9.A0K
            r14.clear()
            X.2d6 r0 = r9.A0e
            r39 = r0
            X.2d6 r0 = r9.A0g
            r38 = r0
            X.2d6 r0 = r9.A0f
            r37 = r0
            X.2d6 r0 = r9.A0a
            r36 = r0
            X.XdM r13 = new X.XdM
            r26 = r13
            r27 = r39
            r28 = r38
            r29 = r37
            r30 = r0
            r31 = r9
            r32 = r4
            r33 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r14.add(r13)
            r12 = 0
            r1 = 0
            r27 = 0
            r11 = 0
            if (r4 != 0) goto L_0x01d3
            r10 = 0
        L_0x0179:
            if (r11 >= r8) goto L_0x021c
            int r1 = r1 + 1
            r26 = r3[r11]
            r0 = r26
            int r16 = X.XGQ.A01(r0, r9, r5)
            java.lang.Integer[] r0 = r0.A14
            r15 = r0[r12]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r15 != r0) goto L_0x018f
            int r27 = r27 + 1
        L_0x018f:
            if (r10 == r5) goto L_0x0198
            int r0 = r9.A0A
            int r0 = r0 + r10
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x01c0
        L_0x0198:
            X.2d3 r0 = r13.A0G
            if (r0 == 0) goto L_0x01c0
        L_0x019c:
            X.XdM r13 = new X.XdM
            r28 = r13
            r29 = r39
            r30 = r38
            r31 = r37
            r32 = r36
            r33 = r9
            r34 = r12
            r35 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r13.A0A = r11
            r14.add(r13)
            r10 = r16
        L_0x01b8:
            r0 = r26
            r13.A04(r0)
            int r11 = r11 + 1
            goto L_0x0179
        L_0x01c0:
            if (r11 <= 0) goto L_0x01cf
            int r0 = r9.A0E
            if (r0 <= 0) goto L_0x01c9
            if (r1 <= r0) goto L_0x01c9
            goto L_0x019c
        L_0x01c9:
            int r0 = r9.A0A
            int r0 = r0 + r16
            int r10 = r10 + r0
            goto L_0x01d1
        L_0x01cf:
            r10 = r16
        L_0x01d1:
            r1 = 0
            goto L_0x01b8
        L_0x01d3:
            if (r11 >= r8) goto L_0x021c
            r10 = r3[r11]
            int r16 = X.XGQ.A00(r10, r9, r5)
            java.lang.Integer[] r0 = r10.A14
            r15 = r0[r2]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r15 != r0) goto L_0x01e5
            int r27 = r27 + 1
        L_0x01e5:
            if (r1 == r5) goto L_0x01ee
            int r0 = r9.A0H
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x0214
        L_0x01ee:
            X.2d3 r0 = r13.A0G
            if (r0 == 0) goto L_0x0214
            X.XdM r13 = new X.XdM
            r28 = r13
            r29 = r39
            r30 = r38
            r31 = r37
            r32 = r36
            r33 = r9
            r34 = r4
            r35 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r13.A0A = r11
            r14.add(r13)
        L_0x020c:
            r1 = r16
        L_0x020e:
            r13.A04(r10)
            int r11 = r11 + 1
            goto L_0x01d3
        L_0x0214:
            if (r11 <= 0) goto L_0x020c
            int r0 = r9.A0H
            int r0 = r0 + r16
            int r1 = r1 + r0
            goto L_0x020e
        L_0x021c:
            int r16 = r14.size()
            r29 = r37
            r28 = r36
            int r11 = r9.A06
            int r10 = r9.A05
            int r8 = r9.A07
            int r3 = r9.A02
            java.lang.Integer[] r1 = r9.A14
            r0 = r1[r12]
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            if (r0 == r13) goto L_0x0239
            r1 = r1[r2]
            r0 = 0
            if (r1 != r13) goto L_0x023a
        L_0x0239:
            r0 = 1
        L_0x023a:
            if (r27 <= 0) goto L_0x023f
            r2 = 0
            if (r0 != 0) goto L_0x02ee
        L_0x023f:
            r1 = 0
            r2 = 0
            r13 = 0
        L_0x0242:
            r0 = r16
            if (r13 >= r0) goto L_0x0674
            java.lang.Object r15 = r14.get(r13)
            X.XdM r15 = (X.C21506XdM) r15
            int r0 = r16 + -1
            if (r4 != 0) goto L_0x02a0
            if (r13 >= r0) goto L_0x029b
            int r0 = r13 + 1
            java.lang.Object r0 = r14.get(r0)
            X.XdM r0 = (X.C21506XdM) r0
            X.2d3 r0 = r0.A0G
            X.2d6 r0 = r0.A0g
            r28 = r0
            r3 = 0
        L_0x0261:
            X.2d3 r0 = r15.A0G
            X.2d6 r0 = r0.A0a
            r26 = r0
            r15.A05 = r12
            r0 = r39
            r15.A0D = r0
            r0 = r38
            r15.A0F = r0
            r0 = r29
            r15.A0E = r0
            r0 = r28
            r15.A0C = r0
            r15.A07 = r11
            r15.A09 = r10
            r15.A08 = r8
            r15.A06 = r3
            r15.A03 = r5
            int r0 = r15.A01()
            int r2 = java.lang.Math.max(r2, r0)
            int r0 = r15.A00()
            int r1 = r1 + r0
            if (r13 <= 0) goto L_0x0295
            int r0 = r9.A0H
            int r1 = r1 + r0
        L_0x0295:
            r38 = r26
            r10 = 0
        L_0x0298:
            int r13 = r13 + 1
            goto L_0x0242
        L_0x029b:
            r28 = r36
            int r3 = r9.A02
            goto L_0x0261
        L_0x02a0:
            if (r13 >= r0) goto L_0x02e9
            int r0 = r13 + 1
            java.lang.Object r0 = r14.get(r0)
            X.XdM r0 = (X.C21506XdM) r0
            X.2d3 r0 = r0.A0G
            X.2d6 r0 = r0.A0e
            r29 = r0
            r8 = 0
        L_0x02b1:
            X.2d3 r0 = r15.A0G
            X.2d6 r0 = r0.A0f
            r26 = r0
            r15.A05 = r4
            r0 = r39
            r15.A0D = r0
            r0 = r38
            r15.A0F = r0
            r0 = r29
            r15.A0E = r0
            r0 = r28
            r15.A0C = r0
            r15.A07 = r11
            r15.A09 = r10
            r15.A08 = r8
            r15.A06 = r3
            r15.A03 = r5
            int r0 = r15.A01()
            int r2 = r2 + r0
            int r0 = r15.A00()
            int r1 = java.lang.Math.max(r1, r0)
            if (r13 <= 0) goto L_0x02e5
            int r0 = r9.A0A
            int r2 = r2 + r0
        L_0x02e5:
            r39 = r26
            r11 = 0
            goto L_0x0298
        L_0x02e9:
            int r8 = r9.A07
            r29 = r37
            goto L_0x02b1
        L_0x02ee:
            r0 = r16
            if (r2 >= r0) goto L_0x023f
            java.lang.Object r1 = r14.get(r2)
            X.XdM r1 = (X.C21506XdM) r1
            if (r4 != 0) goto L_0x0306
            int r0 = r1.A01()
        L_0x02fe:
            int r0 = r5 - r0
            r1.A02(r0)
            int r2 = r2 + 1
            goto L_0x02ee
        L_0x0306:
            int r0 = r1.A00()
            goto L_0x02fe
        L_0x030b:
            r7 = 1
            r16 = 0
            int r10 = r9.A0E
            if (r4 != 0) goto L_0x032e
            if (r10 > 0) goto L_0x034c
            r10 = 0
            r11 = 0
            r1 = 0
        L_0x0317:
            if (r11 >= r8) goto L_0x034c
            if (r11 <= 0) goto L_0x031e
            int r0 = r9.A0A
            int r1 = r1 + r0
        L_0x031e:
            r0 = r3[r11]
            if (r0 == 0) goto L_0x032b
            int r0 = X.XGQ.A01(r0, r9, r5)
            int r1 = r1 + r0
            if (r1 > r5) goto L_0x034c
            int r10 = r10 + 1
        L_0x032b:
            int r11 = r11 + 1
            goto L_0x0317
        L_0x032e:
            if (r10 > 0) goto L_0x034a
            r10 = 0
            r11 = 0
            r1 = 0
        L_0x0333:
            if (r11 >= r8) goto L_0x034a
            if (r11 <= 0) goto L_0x033a
            int r0 = r9.A0H
            int r1 = r1 + r0
        L_0x033a:
            r0 = r3[r11]
            if (r0 == 0) goto L_0x0347
            int r0 = X.XGQ.A00(r0, r9, r5)
            int r1 = r1 + r0
            if (r1 > r5) goto L_0x034a
            int r10 = r10 + 1
        L_0x0347:
            int r11 = r11 + 1
            goto L_0x0333
        L_0x034a:
            r11 = 0
            goto L_0x034e
        L_0x034c:
            r11 = r10
            r10 = 0
        L_0x034e:
            int[] r0 = r9.A0L
            if (r0 != 0) goto L_0x0356
            int[] r0 = new int[r12]
            r9.A0L = r0
        L_0x0356:
            if (r10 != 0) goto L_0x035a
            if (r4 == r2) goto L_0x035e
        L_0x035a:
            if (r11 != 0) goto L_0x0366
            if (r4 != 0) goto L_0x0412
        L_0x035e:
            int[] r0 = r9.A0L
            r0[r16] = r11
            r0[r2] = r10
            goto L_0x0678
        L_0x0366:
            if (r4 != 0) goto L_0x0412
        L_0x0368:
            float r1 = (float) r8
            float r0 = (float) r11
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r10 = (int) r0
        L_0x0371:
            X.2d3[] r1 = r9.A0M
            r12 = 0
            if (r1 == 0) goto L_0x0406
            int r0 = r1.length
            if (r0 < r11) goto L_0x0406
            java.util.Arrays.fill(r1, r12)
        L_0x037c:
            X.2d3[] r1 = r9.A0N
            if (r1 == 0) goto L_0x0401
            int r0 = r1.length
            if (r0 < r10) goto L_0x0401
            java.util.Arrays.fill(r1, r12)
        L_0x0386:
            r15 = 0
        L_0x0387:
            if (r15 >= r11) goto L_0x03c5
            r14 = 0
        L_0x038a:
            if (r14 >= r10) goto L_0x03c2
            int r1 = r14 * r11
            int r1 = r1 + r15
            if (r4 != r2) goto L_0x0394
            int r1 = r15 * r10
            int r1 = r1 + r14
        L_0x0394:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x03bf
            r13 = r3[r1]
            if (r13 == 0) goto L_0x03bf
            int r12 = X.XGQ.A01(r13, r9, r5)
            X.2d3[] r1 = r9.A0M
            r0 = r1[r15]
            if (r0 == 0) goto L_0x03ab
            int r0 = r0.A07()
            if (r0 >= r12) goto L_0x03ad
        L_0x03ab:
            r1[r15] = r13
        L_0x03ad:
            int r12 = X.XGQ.A00(r13, r9, r5)
            X.2d3[] r1 = r9.A0N
            r0 = r1[r14]
            if (r0 == 0) goto L_0x03bd
            int r0 = r0.A06()
            if (r0 >= r12) goto L_0x03bf
        L_0x03bd:
            r1[r14] = r13
        L_0x03bf:
            int r14 = r14 + 1
            goto L_0x038a
        L_0x03c2:
            int r15 = r15 + 1
            goto L_0x0387
        L_0x03c5:
            r12 = 0
            r14 = 0
        L_0x03c7:
            if (r12 >= r11) goto L_0x03dc
            X.2d3[] r0 = r9.A0M
            r1 = r0[r12]
            if (r1 == 0) goto L_0x03d9
            if (r12 <= 0) goto L_0x03d4
            int r0 = r9.A0A
            int r14 = r14 + r0
        L_0x03d4:
            int r0 = X.XGQ.A01(r1, r9, r5)
            int r14 = r14 + r0
        L_0x03d9:
            int r12 = r12 + 1
            goto L_0x03c7
        L_0x03dc:
            r13 = 0
            r12 = 0
        L_0x03de:
            if (r13 >= r10) goto L_0x03f3
            X.2d3[] r0 = r9.A0N
            r1 = r0[r13]
            if (r1 == 0) goto L_0x03f0
            if (r13 <= 0) goto L_0x03eb
            int r0 = r9.A0H
            int r12 = r12 + r0
        L_0x03eb:
            int r0 = X.XGQ.A00(r1, r9, r5)
            int r12 = r12 + r0
        L_0x03f0:
            int r13 = r13 + 1
            goto L_0x03de
        L_0x03f3:
            r6[r16] = r14
            r6[r2] = r12
            if (r4 != 0) goto L_0x040c
            if (r14 <= r5) goto L_0x035e
            if (r11 <= r2) goto L_0x035e
            int r11 = r11 + -1
            goto L_0x0368
        L_0x0401:
            X.2d3[] r0 = new X.2d3[r10]
            r9.A0N = r0
            goto L_0x0386
        L_0x0406:
            X.2d3[] r0 = new X.2d3[r11]
            r9.A0M = r0
            goto L_0x037c
        L_0x040c:
            if (r12 <= r5) goto L_0x035e
            if (r10 <= r2) goto L_0x035e
            int r10 = r10 + -1
        L_0x0412:
            float r1 = (float) r8
            float r0 = (float) r10
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            goto L_0x0371
        L_0x041d:
            r7 = 1
            if (r8 == 0) goto L_0x0678
            java.util.ArrayList r13 = r9.A0K
            r13.clear()
            X.2d6 r0 = r9.A0e
            r39 = r0
            X.2d6 r0 = r9.A0g
            r38 = r0
            X.2d6 r0 = r9.A0f
            r37 = r0
            X.2d6 r0 = r9.A0a
            r36 = r0
            X.XdM r14 = new X.XdM
            r26 = r14
            r27 = r39
            r28 = r38
            r29 = r37
            r30 = r0
            r31 = r9
            r32 = r4
            r33 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r13.add(r14)
            r12 = 0
            r27 = 0
            r11 = 0
            r10 = 0
            if (r4 != 0) goto L_0x04a6
        L_0x0454:
            if (r10 >= r8) goto L_0x04f8
            r1 = r3[r10]
            int r16 = X.XGQ.A01(r1, r9, r5)
            java.lang.Integer[] r0 = r1.A14
            r15 = r0[r12]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r15 != r0) goto L_0x0466
            int r27 = r27 + 1
        L_0x0466:
            if (r11 == r5) goto L_0x046f
            int r0 = r9.A0A
            int r0 = r0 + r11
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x0495
        L_0x046f:
            X.2d3 r0 = r14.A0G
            if (r0 == 0) goto L_0x0495
        L_0x0473:
            X.XdM r14 = new X.XdM
            r28 = r14
            r29 = r39
            r30 = r38
            r31 = r37
            r32 = r36
            r33 = r9
            r34 = r12
            r35 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r14.A0A = r10
            r13.add(r14)
        L_0x048d:
            r11 = r16
        L_0x048f:
            r14.A04(r1)
            int r10 = r10 + 1
            goto L_0x0454
        L_0x0495:
            if (r10 <= 0) goto L_0x048d
            int r0 = r9.A0E
            if (r0 <= 0) goto L_0x04a0
            int r0 = r10 % r0
            if (r0 != 0) goto L_0x04a0
            goto L_0x0473
        L_0x04a0:
            int r0 = r9.A0A
            int r0 = r0 + r16
            int r11 = r11 + r0
            goto L_0x048f
        L_0x04a6:
            if (r10 >= r8) goto L_0x04f8
            r1 = r3[r10]
            int r16 = X.XGQ.A00(r1, r9, r5)
            java.lang.Integer[] r0 = r1.A14
            r15 = r0[r2]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r15 != r0) goto L_0x04b8
            int r27 = r27 + 1
        L_0x04b8:
            if (r11 == r5) goto L_0x04c1
            int r0 = r9.A0H
            int r0 = r0 + r11
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x04e7
        L_0x04c1:
            X.2d3 r0 = r14.A0G
            if (r0 == 0) goto L_0x04e7
        L_0x04c5:
            X.XdM r14 = new X.XdM
            r28 = r14
            r29 = r39
            r30 = r38
            r31 = r37
            r32 = r36
            r33 = r9
            r34 = r4
            r35 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r14.A0A = r10
            r13.add(r14)
        L_0x04df:
            r11 = r16
        L_0x04e1:
            r14.A04(r1)
            int r10 = r10 + 1
            goto L_0x04a6
        L_0x04e7:
            if (r10 <= 0) goto L_0x04df
            int r0 = r9.A0E
            if (r0 <= 0) goto L_0x04f2
            int r0 = r10 % r0
            if (r0 != 0) goto L_0x04f2
            goto L_0x04c5
        L_0x04f2:
            int r0 = r9.A0H
            int r0 = r0 + r16
            int r11 = r11 + r0
            goto L_0x04e1
        L_0x04f8:
            int r26 = r13.size()
            r29 = r37
            r28 = r36
            int r0 = r9.A06
            r16 = r0
            int r15 = r9.A05
            int r14 = r9.A07
            int r11 = r9.A02
            java.lang.Integer[] r3 = r9.A14
            r0 = r3[r12]
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r0 == r1) goto L_0x0517
            r0 = r3[r2]
            r8 = 0
            if (r0 != r1) goto L_0x0518
        L_0x0517:
            r8 = 1
        L_0x0518:
            if (r27 <= 0) goto L_0x051d
            r3 = 0
            if (r8 != 0) goto L_0x05d1
        L_0x051d:
            r1 = 0
            r3 = 0
            r10 = 0
        L_0x0520:
            r0 = r26
            if (r10 >= r0) goto L_0x05ee
            java.lang.Object r8 = r13.get(r10)
            X.XdM r8 = (X.C21506XdM) r8
            int r0 = r26 + -1
            if (r4 != 0) goto L_0x0580
            if (r10 >= r0) goto L_0x057b
            int r0 = r10 + 1
            java.lang.Object r0 = r13.get(r0)
            X.XdM r0 = (X.C21506XdM) r0
            X.2d3 r0 = r0.A0G
            X.2d6 r0 = r0.A0g
            r28 = r0
            r11 = 0
        L_0x053f:
            X.2d3 r0 = r8.A0G
            X.2d6 r0 = r0.A0a
            r27 = r0
            r8.A05 = r12
            r0 = r39
            r8.A0D = r0
            r0 = r38
            r8.A0F = r0
            r0 = r29
            r8.A0E = r0
            r0 = r28
            r8.A0C = r0
            r0 = r16
            r8.A07 = r0
            r8.A09 = r15
            r8.A08 = r14
            r8.A06 = r11
            r8.A03 = r5
            int r0 = r8.A01()
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r8.A00()
            int r1 = r1 + r0
            if (r10 <= 0) goto L_0x0575
            int r0 = r9.A0H
            int r1 = r1 + r0
        L_0x0575:
            r38 = r27
            r15 = 0
        L_0x0578:
            int r10 = r10 + 1
            goto L_0x0520
        L_0x057b:
            r28 = r36
            int r11 = r9.A02
            goto L_0x053f
        L_0x0580:
            if (r10 >= r0) goto L_0x05cc
            int r0 = r10 + 1
            java.lang.Object r0 = r13.get(r0)
            X.XdM r0 = (X.C21506XdM) r0
            X.2d3 r0 = r0.A0G
            X.2d6 r0 = r0.A0e
            r29 = r0
            r14 = 0
        L_0x0591:
            X.2d3 r0 = r8.A0G
            X.2d6 r0 = r0.A0f
            r27 = r0
            r8.A05 = r4
            r0 = r39
            r8.A0D = r0
            r0 = r38
            r8.A0F = r0
            r0 = r29
            r8.A0E = r0
            r0 = r28
            r8.A0C = r0
            r0 = r16
            r8.A07 = r0
            r8.A09 = r15
            r8.A08 = r14
            r8.A06 = r11
            r8.A03 = r5
            int r0 = r8.A01()
            int r3 = r3 + r0
            int r0 = r8.A00()
            int r1 = java.lang.Math.max(r1, r0)
            if (r10 <= 0) goto L_0x05c7
            int r0 = r9.A0A
            int r3 = r3 + r0
        L_0x05c7:
            r39 = r27
            r16 = 0
            goto L_0x0578
        L_0x05cc:
            int r14 = r9.A07
            r29 = r37
            goto L_0x0591
        L_0x05d1:
            r0 = r26
            if (r3 >= r0) goto L_0x051d
            java.lang.Object r1 = r13.get(r3)
            X.XdM r1 = (X.C21506XdM) r1
            if (r4 != 0) goto L_0x05e9
            int r0 = r1.A01()
        L_0x05e1:
            int r0 = r5 - r0
            r1.A02(r0)
            int r3 = r3 + 1
            goto L_0x05d1
        L_0x05e9:
            int r0 = r1.A00()
            goto L_0x05e1
        L_0x05ee:
            r6[r12] = r3
            r6[r2] = r1
            goto L_0x0678
        L_0x05f4:
            r7 = 1
            if (r8 == 0) goto L_0x0678
            java.util.ArrayList r11 = r9.A0K
            int r0 = r11.size()
            r15 = 0
            if (r0 != 0) goto L_0x062b
            X.2d6 r10 = r9.A0e
            X.2d6 r2 = r9.A0g
            X.2d6 r1 = r9.A0f
            X.2d6 r0 = r9.A0a
            X.XdM r14 = new X.XdM
            r26 = r14
            r27 = r10
            r28 = r2
            r29 = r1
            r30 = r0
            r31 = r9
            r32 = r4
            r33 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r11.add(r14)
        L_0x0620:
            r1 = 0
        L_0x0621:
            if (r1 >= r8) goto L_0x0669
            r0 = r3[r1]
            r14.A04(r0)
            int r1 = r1 + 1
            goto L_0x0621
        L_0x062b:
            java.lang.Object r14 = r11.get(r15)
            X.XdM r14 = (X.C21506XdM) r14
            r14.A00 = r15
            r0 = 0
            r14.A0G = r0
            r14.A0B = r15
            r14.A02 = r15
            r14.A0A = r15
            r14.A01 = r15
            r14.A04 = r15
            X.2d6 r0 = r9.A0e
            r16 = r0
            X.2d6 r13 = r9.A0g
            X.2d6 r12 = r9.A0f
            X.2d6 r11 = r9.A0a
            int r10 = r9.A06
            int r2 = r9.A05
            int r1 = r9.A07
            int r0 = r9.A02
            r14.A05 = r4
            r4 = r16
            r14.A0D = r4
            r14.A0F = r13
            r14.A0E = r12
            r14.A0C = r11
            r14.A07 = r10
            r14.A09 = r2
            r14.A08 = r1
            r14.A06 = r0
            r14.A03 = r5
            goto L_0x0620
        L_0x0669:
            int r0 = r14.A01()
            r6[r15] = r0
            int r1 = r14.A00()
            goto L_0x0676
        L_0x0674:
            r6[r12] = r2
        L_0x0676:
            r6[r7] = r1
        L_0x0678:
            r0 = 0
            goto L_0x00ee
        L_0x067b:
            r1 = 0
            r0 = r40
            r0.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.A0B(X.3MR, int, int):void");
    }

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
