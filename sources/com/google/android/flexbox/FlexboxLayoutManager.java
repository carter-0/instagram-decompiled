package com.google.android.flexbox;

import X.002;
import X.2Rw;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3BB;
import X.AnonymousClass3BC;
import X.AnonymousClass3MX;
import X.AnonymousClass4CR;
import X.AnonymousClass52S;
import X.AnonymousClass972;
import X.C14042Toj;
import X.C14043Tok;
import X.C17190VLu;
import X.C238673Cy;
import X.C252553pI;
import X.C252563pJ;
import X.C66848Mdh;
import X.C70794OLp;
import X.Pxk;
import X.SWW;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends C252553pI implements AnonymousClass4CR, C252563pJ {
    public static final Rect A0P = new Rect();
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A06 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public SparseArray A0A = new SparseArray();
    public AnonymousClass3BB A0B;
    public AnonymousClass3BB A0C;
    public AnonymousClass3AN A0D;
    public AnonymousClass3AW A0E;
    public C17190VLu A0F = new Object();
    public C66848Mdh A0G = new C66848Mdh(this);
    public C70794OLp A0H;
    public SavedState A0I;
    public List A0J = new ArrayList();
    public boolean A0K;
    public boolean A0L;
    public View A0M;
    public final Context A0N;
    public final C14042Toj A0O = new C14042Toj(this);

    public class LayoutParams extends AnonymousClass3MX implements FlexItem {
        public static final Parcelable.Creator CREATOR = SWW.A00(78);
        public float A00;
        public float A01;
        public float A02;
        public int A03;
        public int A04;
        public int A05;
        public int A06;
        public int A07;
        public boolean A08;

        public final int describeContents() {
            return 0;
        }

        public final int Aag() {
            return this.A03;
        }

        public final float B6U() {
            return this.A00;
        }

        public final float B6V() {
            return this.A01;
        }

        public final float B6W() {
            return this.A02;
        }

        public final int BP7() {
            return this.A04;
        }

        public final int BPT() {
            return this.A05;
        }

        public final int BT6() {
            return this.A06;
        }

        public final int BTI() {
            return this.A07;
        }

        public final boolean Cex() {
            return this.A08;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.A01);
            parcel.writeFloat(this.A02);
            parcel.writeInt(this.A03);
            parcel.writeFloat(this.A00);
            parcel.writeInt(this.A07);
            parcel.writeInt(this.A06);
            parcel.writeInt(this.A05);
            parcel.writeInt(this.A04);
            Pxk.A0R(parcel, this, this.A08 ? (byte) 1 : 0);
        }
    }

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(79);
        public int A00;
        public int A01;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return 002.A0X("SavedState{mAnchorPosition=", ", mAnchorOffset=", '}', this.A01, this.A00);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    private View A0H(int i) {
        int i2;
        View A0J2 = A0J(0, A0T(), i);
        if (A0J2 == null || (i2 = this.A0O.A00[C252553pI.A06(A0J2)]) == -1) {
            return null;
        }
        return A0K(A0J2, (C14043Tok) this.A0J.get(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (r2 >= r6) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r3 >= r8) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View A0M(com.google.android.flexbox.FlexboxLayoutManager r11, int r12, int r13) {
        /*
            r10 = -1
            if (r13 <= r12) goto L_0x0004
            r10 = 1
        L_0x0004:
            if (r12 == r13) goto L_0x0071
            android.view.View r7 = r11.A0X(r12)
            int r8 = r11.Ba9()
            int r6 = r11.BaC()
            int r9 = r11.A03
            int r0 = r11.BaB()
            int r9 = r9 - r0
            int r5 = r11.A00
            int r0 = r11.Ba8()
            int r5 = r5 - r0
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r7.getLeft()
            int r0 = X.C252553pI.A05(r7)
            int r1 = r1 - r0
            int r0 = r2.leftMargin
            int r1 = r1 - r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r4 = r11.A0W(r7)
            int r0 = r0.topMargin
            int r4 = r4 - r0
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r7.getRight()
            int r0 = X.C252553pI.A07(r7)
            int r3 = r3 + r0
            int r0 = r2.rightMargin
            int r3 = r3 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r2 = r11.A0V(r7)
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            if (r1 >= r9) goto L_0x0063
            r1 = 0
            if (r3 < r8) goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            if (r4 >= r5) goto L_0x0069
            r0 = 0
            if (r2 < r6) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            if (r0 == 0) goto L_0x006f
            return r7
        L_0x006f:
            int r12 = r12 + r10
            goto L_0x0004
        L_0x0071:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0M(com.google.android.flexbox.FlexboxLayoutManager, int, int):android.view.View");
    }

    public final void A1S(AnonymousClass3AW r3) {
        this.A0I = null;
        this.A08 = -1;
        this.A09 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = -1;
        C66848Mdh.A01(this.A0G);
        this.A0A.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r5.A0L == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r1 = r5.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bd, code lost:
        if (r28 > 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c1, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r28 < 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(X.AnonymousClass3AN r26, X.AnonymousClass3AW r27, int r28) {
        /*
            r25 = this;
            r5 = r25
            r2 = r28
            int r0 = r5.A0T()
            r7 = 0
            if (r0 == 0) goto L_0x01c4
            if (r28 == 0) goto L_0x01c4
            r5.A0N()
            X.OLp r1 = r5.A0H
            r6 = 1
            r1.A08 = r6
            boolean r18 = r5.CWo()
            if (r18 != 0) goto L_0x01bb
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x01bb
            r17 = 1
            if (r28 >= 0) goto L_0x01c1
        L_0x0023:
            int r4 = java.lang.Math.abs(r2)
            r1.A03 = r6
            int r1 = r5.A03
            int r0 = r5.A04
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r1 = r5.A00
            int r0 = r5.A01
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r3 = 0
            r11 = 1
            if (r18 != 0) goto L_0x0043
            boolean r0 = r5.A0L
            r16 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r16 = 0
        L_0x0045:
            r12 = -1
            if (r6 != r11) goto L_0x0135
            int r0 = r5.A0T()
            int r0 = r0 - r11
            android.view.View r13 = r5.A0X(r0)
            X.OLp r1 = r5.A0H
            X.3BB r0 = r5.A0B
            int r0 = r0.A08(r13)
            r1.A04 = r0
            int r14 = X.C252553pI.A06(r13)
            X.Toj r8 = r5.A0O
            int[] r0 = r8.A00
            r1 = r0[r14]
            java.util.List r0 = r5.A0J
            java.lang.Object r0 = r0.get(r1)
            X.Tok r0 = (X.C14043Tok) r0
            android.view.View r1 = r5.A0L(r13, r0)
            X.OLp r13 = r5.A0H
            int r15 = r14 + 1
            r13.A05 = r15
            int[] r14 = r8.A00
            int r0 = r14.length
            if (r0 > r15) goto L_0x012f
            r13.A01 = r12
        L_0x007e:
            X.3BB r0 = r5.A0B
            if (r16 == 0) goto L_0x0116
            int r0 = r0.A0D(r1)
            r13.A04 = r0
            X.OLp r13 = r5.A0H
            X.3BB r0 = r5.A0B
            int r0 = r0.A0D(r1)
            int r1 = -r0
            X.3BB r0 = r5.A0B
            int r0 = r0.A06()
            int r1 = r1 + r0
            r13.A06 = r1
            X.OLp r1 = r5.A0H
            int r0 = r1.A06
            if (r0 < 0) goto L_0x00a1
            r3 = r0
        L_0x00a1:
            r1.A06 = r3
        L_0x00a3:
            X.OLp r0 = r5.A0H
            int r1 = r0.A01
            if (r1 == r12) goto L_0x00b2
            java.util.List r0 = r5.A0J
            int r0 = r0.size()
            int r0 = r0 - r11
            if (r1 <= r0) goto L_0x00ea
        L_0x00b2:
            X.OLp r1 = r5.A0H
            int r3 = r1.A05
            X.3AW r0 = r5.A0E
            int r0 = r0.A00()
            if (r3 > r0) goto L_0x00ea
            int r0 = r1.A06
            int r22 = r4 - r0
            X.VLu r1 = r5.A0F
            r0 = 0
            r1.A00 = r0
            if (r22 <= 0) goto L_0x00ea
            java.util.List r0 = r5.A0J
            if (r18 == 0) goto L_0x0113
            r21 = r10
        L_0x00cf:
            r23 = r3
            r24 = r12
            r18 = r8
            r19 = r1
            r20 = r0
            r18.A0F(r19, r20, r21, r22, r23, r24)
            X.OLp r0 = r5.A0H
            int r0 = r0.A05
            r8.A0C(r10, r9, r0)
            X.OLp r0 = r5.A0H
            int r0 = r0.A05
            r8.A0B(r0)
        L_0x00ea:
            X.OLp r3 = r5.A0H
            int r1 = r3.A06
            int r0 = r4 - r1
            r3.A00 = r0
            r8 = r26
            r0 = r27
            int r0 = r5.A0D(r8, r0, r3)
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x01c4
            if (r17 == 0) goto L_0x010e
            if (r4 <= r1) goto L_0x0103
            int r2 = -r6
            int r2 = r2 * r1
        L_0x0103:
            X.3BB r1 = r5.A0B
            int r0 = -r2
            r1.A0E(r0)
            X.OLp r0 = r5.A0H
            r0.A02 = r2
            return r2
        L_0x010e:
            if (r4 <= r1) goto L_0x0103
            int r2 = r6 * r1
            goto L_0x0103
        L_0x0113:
            r21 = r9
            goto L_0x00cf
        L_0x0116:
            int r0 = r0.A08(r1)
            r13.A04 = r0
            X.OLp r3 = r5.A0H
            X.3BB r0 = r5.A0B
            int r1 = r0.A08(r1)
            X.3BB r0 = r5.A0B
            int r0 = r0.A03()
            int r1 = r1 - r0
            r3.A06 = r1
            goto L_0x00a3
        L_0x012f:
            r0 = r14[r15]
            r13.A01 = r0
            goto L_0x007e
        L_0x0135:
            android.view.View r9 = r5.A0X(r7)
            X.OLp r1 = r5.A0H
            X.3BB r0 = r5.A0B
            int r0 = r0.A0D(r9)
            r1.A04 = r0
            int r10 = X.C252553pI.A06(r9)
            X.Toj r8 = r5.A0O
            int[] r0 = r8.A00
            r1 = r0[r10]
            java.util.List r0 = r5.A0J
            java.lang.Object r0 = r0.get(r1)
            X.Tok r0 = (X.C14043Tok) r0
            android.view.View r9 = r5.A0K(r9, r0)
            X.OLp r1 = r5.A0H
            int[] r0 = r8.A00
            r8 = r0[r10]
            if (r8 == r12) goto L_0x019d
            if (r8 <= 0) goto L_0x019d
            java.util.List r1 = r5.A0J
            int r0 = r8 + -1
            java.lang.Object r0 = r1.get(r0)
            X.Tok r0 = (X.C14043Tok) r0
            X.OLp r1 = r5.A0H
            int r0 = r0.A06
            int r10 = r10 - r0
            r1.A05 = r10
            int r8 = r8 - r11
        L_0x0175:
            r1.A01 = r8
            X.3BB r0 = r5.A0B
            if (r16 == 0) goto L_0x01a1
            int r0 = r0.A08(r9)
            r1.A04 = r0
            X.OLp r8 = r5.A0H
            X.3BB r0 = r5.A0B
            int r1 = r0.A08(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A03()
            int r1 = r1 - r0
            r8.A06 = r1
            X.OLp r1 = r5.A0H
            int r0 = r1.A06
            if (r0 < 0) goto L_0x0199
            r3 = r0
        L_0x0199:
            r1.A06 = r3
            goto L_0x00ea
        L_0x019d:
            r1.A05 = r12
            r8 = 0
            goto L_0x0175
        L_0x01a1:
            int r0 = r0.A0D(r9)
            r1.A04 = r0
            X.OLp r3 = r5.A0H
            X.3BB r0 = r5.A0B
            int r0 = r0.A0D(r9)
            int r1 = -r0
            X.3BB r0 = r5.A0B
            int r0 = r0.A06()
            int r1 = r1 + r0
            r3.A06 = r1
            goto L_0x00ea
        L_0x01bb:
            r17 = 0
            if (r28 <= 0) goto L_0x01c1
            goto L_0x0023
        L_0x01c1:
            r6 = -1
            goto L_0x0023
        L_0x01c4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A01(X.3AN, X.3AW, int):int");
    }

    private int A0D(AnonymousClass3AN r34, AnonymousClass3AW r35, C70794OLp oLp) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int measuredHeight;
        float f3;
        float f4;
        int round;
        int measuredWidth;
        C70794OLp oLp2 = oLp;
        int i4 = oLp2.A06;
        AnonymousClass3AN r32 = r34;
        if (i4 != Integer.MIN_VALUE) {
            int i5 = oLp2.A00;
            if (i5 < 0) {
                oLp2.A06 = i4 + i5;
            }
            A0O(r32, oLp2);
        }
        int i6 = oLp2.A00;
        int i7 = i6;
        int i8 = 0;
        boolean CWo = CWo();
        while (true) {
            if (i7 <= 0 && !this.A0H.A07) {
                break;
            }
            List list = this.A0J;
            int i9 = oLp2.A05;
            if (i9 < 0 || i9 >= r35.A00() || (i = oLp2.A01) < 0 || i >= list.size()) {
                break;
            }
            C14043Tok tok = (C14043Tok) this.A0J.get(oLp2.A01);
            oLp2.A05 = tok.A04;
            if (CWo()) {
                int Ba9 = Ba9();
                int BaB = BaB();
                int i10 = this.A03;
                int i11 = oLp2.A04;
                if (oLp2.A03 == -1) {
                    i11 -= tok.A02;
                }
                int i12 = oLp2.A05;
                int i13 = this.A04;
                if (i13 == 0) {
                    f3 = (float) Ba9;
                    f4 = (float) (i10 - BaB);
                } else if (i13 != 1) {
                    float f5 = ((float) (i10 - tok.A08)) / 2.0f;
                    f3 = ((float) Ba9) + f5;
                    f4 = ((float) (i10 - BaB)) - f5;
                } else {
                    int i14 = tok.A08;
                    f3 = (float) ((i10 - i14) + BaB);
                    f4 = (float) (i14 - Ba9);
                }
                float f6 = (float) this.A0G.A02;
                float f7 = f3 - f6;
                float f8 = f4 - f6;
                float max = Math.max(0.0f, 0.0f);
                int i15 = 0;
                int i16 = tok.A06;
                for (int i17 = i12; i17 < i12 + i16; i17++) {
                    View view = (View) this.A0A.get(i17);
                    if (view != null || (view = this.A0D.A04(i17)) != null) {
                        int i18 = oLp2.A03;
                        Rect rect = A0P;
                        if (i18 == 1) {
                            A0k(view, rect);
                            A0h(view, -1);
                        } else {
                            A0k(view, rect);
                            A0h(view, i15);
                            i15++;
                        }
                        C14042Toj toj = this.A0O;
                        C14042Toj toj2 = toj;
                        long j = toj.A01[i17];
                        int i19 = (int) j;
                        int i20 = (int) (j >> 32);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (view.isLayoutRequested() || !this.A0D || !A0S(view.getWidth(), i19, marginLayoutParams.width) || !A0S(view.getHeight(), i20, marginLayoutParams.height)) {
                            view.measure(i19, i20);
                        }
                        float A052 = f7 + ((float) (marginLayoutParams.leftMargin + C252553pI.A05(view)));
                        float A072 = f8 - ((float) (marginLayoutParams.rightMargin + C252553pI.A07(view)));
                        int i21 = i11 + ((AnonymousClass3MX) view.getLayoutParams()).A02.top;
                        if (this.A0L) {
                            measuredWidth = Math.round(A072);
                            round = measuredWidth - view.getMeasuredWidth();
                        } else {
                            round = Math.round(A052);
                            measuredWidth = round + view.getMeasuredWidth();
                        }
                        toj2.A0D(view, tok, round, i21, measuredWidth, i21 + view.getMeasuredHeight());
                        f7 = A052 + ((float) (view.getMeasuredWidth() + marginLayoutParams.rightMargin + C252553pI.A07(view))) + max;
                        f8 = A072 - (((float) ((view.getMeasuredWidth() + marginLayoutParams.leftMargin) + C252553pI.A05(view))) + max);
                    }
                }
            } else {
                int BaC = BaC();
                int Ba8 = Ba8();
                int i22 = this.A00;
                int i23 = oLp2.A04;
                int i24 = i23;
                if (oLp2.A03 == -1) {
                    int i25 = tok.A02;
                    i24 = i23 - i25;
                    i23 += i25;
                }
                int i26 = oLp2.A05;
                int i27 = this.A04;
                if (i27 == 0) {
                    f = (float) BaC;
                    f2 = (float) (i22 - Ba8);
                } else if (i27 != 1) {
                    float f9 = ((float) (i22 - tok.A08)) / 2.0f;
                    f = ((float) BaC) + f9;
                    f2 = ((float) (i22 - Ba8)) - f9;
                } else {
                    int i28 = tok.A08;
                    f = (float) ((i22 - i28) + Ba8);
                    f2 = (float) (i28 - BaC);
                }
                float f10 = (float) this.A0G.A02;
                float f11 = f - f10;
                float f12 = f2 - f10;
                float max2 = Math.max(0.0f, 0.0f);
                int i29 = 0;
                int i30 = tok.A06;
                for (int i31 = i26; i31 < i26 + i30; i31++) {
                    View view2 = (View) this.A0A.get(i31);
                    if (view2 != null || (view2 = this.A0D.A04(i31)) != null) {
                        C14042Toj toj3 = this.A0O;
                        C14042Toj toj4 = toj3;
                        long j2 = toj3.A01[i31];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (view2.isLayoutRequested() || !this.A0D || !A0S(view2.getWidth(), i32, marginLayoutParams2.width) || !A0S(view2.getHeight(), i33, marginLayoutParams2.height)) {
                            view2.measure(i32, i33);
                        }
                        float f13 = f11 + ((float) (marginLayoutParams2.topMargin + ((AnonymousClass3MX) view2.getLayoutParams()).A02.top));
                        float f14 = f12 - ((float) (marginLayoutParams2.rightMargin + ((AnonymousClass3MX) view2.getLayoutParams()).A02.bottom));
                        int i34 = oLp2.A03;
                        Rect rect2 = A0P;
                        if (i34 == 1) {
                            A0k(view2, rect2);
                            A0h(view2, -1);
                        } else {
                            A0k(view2, rect2);
                            A0h(view2, i29);
                            i29++;
                        }
                        int A053 = i24 + C252553pI.A05(view2);
                        int A073 = i23 - C252553pI.A07(view2);
                        boolean z = this.A0L;
                        boolean z2 = this.A0K;
                        if (z) {
                            A053 = A073 - view2.getMeasuredWidth();
                            if (z2) {
                                measuredHeight = Math.round(f14);
                                i3 = measuredHeight - view2.getMeasuredHeight();
                            } else {
                                i3 = Math.round(f13);
                                measuredHeight = i3 + view2.getMeasuredHeight();
                            }
                        } else if (z2) {
                            measuredHeight = Math.round(f14);
                            i3 = measuredHeight - view2.getMeasuredHeight();
                            A073 = A053 + view2.getMeasuredWidth();
                        } else {
                            i3 = Math.round(f13);
                            A073 = A053 + view2.getMeasuredWidth();
                            measuredHeight = i3 + view2.getMeasuredHeight();
                        }
                        toj4.A0E(view2, tok, A053, i3, A073, measuredHeight, z);
                        f11 = f13 + ((float) (view2.getMeasuredHeight() + marginLayoutParams2.topMargin + ((AnonymousClass3MX) view2.getLayoutParams()).A02.bottom)) + max2;
                        f12 = f14 - (((float) ((view2.getMeasuredHeight() + marginLayoutParams2.bottomMargin) + ((AnonymousClass3MX) view2.getLayoutParams()).A02.top)) + max2);
                    }
                }
            }
            oLp2.A01 += this.A0H.A03;
            int i35 = tok.A02;
            i8 += i35;
            if (CWo || !this.A0L) {
                i2 = oLp2.A04 + (oLp2.A03 * i35);
            } else {
                i2 = oLp2.A04 - (oLp2.A03 * i35);
            }
            oLp2.A04 = i2;
            i7 -= i35;
        }
        int i36 = oLp2.A00 - i8;
        oLp2.A00 = i36;
        int i37 = oLp2.A06;
        if (i37 != Integer.MIN_VALUE) {
            int i38 = i37 + i8;
            oLp2.A06 = i38;
            if (i36 < 0) {
                oLp2.A06 = i38 + i36;
            }
            A0O(r32, oLp2);
        }
        return i6 - oLp2.A00;
    }

    private void A0N() {
        AnonymousClass3BB r0;
        if (this.A0B == null) {
            boolean CWo = CWo();
            int i = this.A03;
            if (!CWo ? i != 0 : i == 0) {
                this.A0B = new AnonymousClass3BC(this);
                r0 = new C238673Cy(this);
            } else {
                this.A0B = new C238673Cy(this);
                r0 = new AnonymousClass3BC(this);
            }
            this.A0C = r0;
        }
    }

    private void A0O(AnonymousClass3AN r11, C70794OLp oLp) {
        int A0T;
        int A082;
        int A0T2;
        if (oLp.A08) {
            int i = oLp.A03;
            int i2 = oLp.A06;
            if (i == -1) {
                if (i2 >= 0 && (A0T2 = A0T()) != 0) {
                    int i3 = A0T2 - 1;
                    int i4 = this.A0O.A00[C252553pI.A06(A0X(i3))];
                    if (i4 != -1) {
                        C14043Tok tok = (C14043Tok) this.A0J.get(i4);
                        int i5 = i3;
                        while (true) {
                            if (i5 < 0) {
                                break;
                            }
                            View A0X = A0X(i5);
                            int i6 = oLp.A06;
                            if (!CWo() && this.A0L) {
                                if (this.A0B.A08(A0X) > i6) {
                                    break;
                                }
                            } else if (this.A0B.A0D(A0X) < this.A0B.A02() - i6) {
                                break;
                            }
                            if (tok.A04 == C252553pI.A06(A0X)) {
                                if (i4 <= 0) {
                                    A0T2 = i5;
                                    break;
                                }
                                i4 += oLp.A03;
                                tok = (C14043Tok) this.A0J.get(i4);
                                A0T2 = i5;
                            }
                            i5--;
                        }
                        while (i3 >= A0T2) {
                            A0q(r11, i3);
                            i3--;
                        }
                    }
                }
            } else if (i2 >= 0 && (A0T = A0T()) != 0) {
                int i7 = this.A0O.A00[C252553pI.A06(A0X(0))];
                int i8 = -1;
                if (i7 != -1) {
                    C14043Tok tok2 = (C14043Tok) this.A0J.get(i7);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= A0T) {
                            break;
                        }
                        View A0X2 = A0X(i9);
                        int i10 = oLp.A06;
                        if (CWo() || !this.A0L) {
                            A082 = this.A0B.A08(A0X2);
                        } else {
                            AnonymousClass3BB r0 = this.A0B;
                            A082 = r0.A02() - r0.A0D(A0X2);
                        }
                        if (A082 > i10) {
                            break;
                        }
                        if (tok2.A07 == C252553pI.A06(A0X2)) {
                            if (i7 >= this.A0J.size() - 1) {
                                i8 = i9;
                                break;
                            }
                            i7 += oLp.A03;
                            tok2 = (C14043Tok) this.A0J.get(i7);
                            i8 = i9;
                        }
                        i9++;
                    }
                    while (i8 >= 0) {
                        A0q(r11, i8);
                        i8--;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3 == Integer.MIN_VALUE) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0P(X.C66848Mdh r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L_0x007f
            boolean r0 = r4.CWo()
            if (r0 == 0) goto L_0x007c
            int r3 = r4.A01
        L_0x000a:
            X.OLp r2 = r4.A0H
            if (r3 == 0) goto L_0x0013
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A07 = r0
            boolean r0 = r4.CWo()
            if (r0 != 0) goto L_0x0071
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x0071
            X.OLp r2 = r4.A0H
            int r1 = r5.A00
            int r0 = r4.BaB()
        L_0x0028:
            int r1 = r1 - r0
            r2.A00 = r1
            X.OLp r1 = r4.A0H
            int r0 = r5.A03
            r1.A05 = r0
            r2 = 1
            r1.A03 = r2
            int r0 = r5.A00
            r1.A04 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A06 = r0
            int r0 = r5.A01
            r1.A01 = r0
            if (r6 == 0) goto L_0x0070
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x0070
            int r1 = r5.A01
            if (r1 < 0) goto L_0x0070
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x0070
            java.util.List r1 = r4.A0J
            int r0 = r5.A01
            java.lang.Object r3 = r1.get(r0)
            X.Tok r3 = (X.C14043Tok) r3
            X.OLp r2 = r4.A0H
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            int r1 = r2.A05
            int r0 = r3.A06
            int r1 = r1 + r0
            r2.A05 = r1
        L_0x0070:
            return
        L_0x0071:
            X.OLp r2 = r4.A0H
            X.3BB r0 = r4.A0B
            int r1 = r0.A03()
            int r0 = r5.A00
            goto L_0x0028
        L_0x007c:
            int r3 = r4.A04
            goto L_0x000a
        L_0x007f:
            X.OLp r2 = r4.A0H
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0P(X.Mdh, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3 == Integer.MIN_VALUE) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(X.C66848Mdh r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L_0x0077
            boolean r0 = r4.CWo()
            if (r0 == 0) goto L_0x0074
            int r3 = r4.A01
        L_0x000a:
            X.OLp r2 = r4.A0H
            if (r3 == 0) goto L_0x0013
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A07 = r0
            boolean r0 = r4.CWo()
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x006f
            X.OLp r2 = r4.A0H
            android.view.View r0 = r4.A0M
            int r1 = r0.getWidth()
            int r0 = r5.A00
            int r1 = r1 - r0
        L_0x002b:
            X.3BB r0 = r4.A0B
            int r0 = r0.A06()
            int r1 = r1 - r0
            r2.A00 = r1
            X.OLp r1 = r4.A0H
            int r0 = r5.A03
            r1.A05 = r0
            r0 = -1
            r1.A03 = r0
            int r0 = r5.A00
            r1.A04 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A06 = r0
            int r0 = r5.A01
            r1.A01 = r0
            if (r6 == 0) goto L_0x006e
            if (r0 <= 0) goto L_0x006e
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            int r1 = r5.A01
            if (r0 <= r1) goto L_0x006e
            java.util.List r0 = r4.A0J
            java.lang.Object r3 = r0.get(r1)
            X.Tok r3 = (X.C14043Tok) r3
            X.OLp r2 = r4.A0H
            int r0 = r2.A01
            int r0 = r0 + -1
            r2.A01 = r0
            int r1 = r2.A05
            int r0 = r3.A06
            int r1 = r1 - r0
            r2.A05 = r1
        L_0x006e:
            return
        L_0x006f:
            X.OLp r2 = r4.A0H
            int r1 = r5.A00
            goto L_0x002b
        L_0x0074:
            int r3 = r4.A04
            goto L_0x000a
        L_0x0077:
            X.OLp r2 = r4.A0H
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0Q(X.Mdh, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    public final Parcelable A1M() {
        ? obj;
        int A0D2;
        SavedState savedState = this.A0I;
        if (savedState != null) {
            obj.A01 = savedState.A01;
            A0D2 = savedState.A00;
        } else {
            obj = new Object();
            if (A0T() > 0) {
                View A0X = A0X(0);
                obj.A01 = C252553pI.A06(A0X);
                A0D2 = this.A0B.A0D(A0X) - this.A0B.A06();
            } else {
                obj.A01 = -1;
                return obj;
            }
        }
        obj.A00 = A0D2;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3MX, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    public final AnonymousClass3MX A1N(Context context, AttributeSet attributeSet) {
        ? r1 = new AnonymousClass3MX(context, attributeSet);
        r1.A01 = 0.0f;
        r1.A02 = 1.0f;
        r1.A03 = -1;
        r1.A00 = -1.0f;
        r1.A05 = 16777215;
        r1.A04 = 16777215;
        return r1;
    }

    public final void A1O(int i) {
        this.A08 = i;
        this.A09 = AnonymousClass972.MUTABLE_FLAG_MASK;
        SavedState savedState = this.A0I;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0b();
    }

    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.A0I = (SavedState) parcelable;
            A0b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0367, code lost:
        if (r8 == 1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036c, code lost:
        if (r8 != 1) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036f, code lost:
        r5.A0L = r0;
        r5.A0K = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1R(X.AnonymousClass3AN r23, X.AnonymousClass3AW r24) {
        /*
            r22 = this;
            r5 = r22
            r4 = r23
            r5.A0D = r4
            r3 = r24
            r5.A0E = r3
            int r6 = r3.A00()
            if (r6 != 0) goto L_0x0015
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07
            int r8 = r0.getLayoutDirection()
            int r7 = r5.A02
            r0 = 2
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0367
            if (r7 == r2) goto L_0x036c
            if (r7 == r0) goto L_0x0367
            if (r8 != r2) goto L_0x0029
            r1 = 1
        L_0x0029:
            r5.A0L = r1
            r5.A0K = r2
        L_0x002d:
            r5.A0N()
            X.OLp r0 = r5.A0H
            if (r0 != 0) goto L_0x003b
            X.OLp r0 = new X.OLp
            r0.<init>()
            r5.A0H = r0
        L_0x003b:
            X.Toj r15 = r5.A0O
            r15.A09(r6)
            r15.A0A(r6)
            r15.A08(r6)
            X.OLp r0 = r5.A0H
            r1 = 0
            r0.A08 = r1
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r12 = r5.A0I
            if (r12 == 0) goto L_0x0057
            int r0 = r12.A01
            if (r0 < 0) goto L_0x0057
            if (r0 >= r6) goto L_0x0057
            r5.A08 = r0
        L_0x0057:
            X.Mdh r7 = r5.A0G
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0064
            int r8 = r5.A08
            r0 = -1
            if (r8 != r0) goto L_0x0064
            if (r12 == 0) goto L_0x009c
        L_0x0064:
            X.C66848Mdh.A01(r7)
            boolean r0 = r3.A08
            r10 = 0
            if (r0 != 0) goto L_0x028d
            int r13 = r5.A08
            r11 = -1
            if (r13 == r11) goto L_0x028d
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 < 0) goto L_0x0289
            int r8 = r3.A00()
            if (r13 >= r8) goto L_0x0289
            r7.A03 = r13
            int[] r0 = r15.A00
            r0 = r0[r13]
            r7.A01 = r0
            if (r12 == 0) goto L_0x020b
            int r0 = r12.A01
            if (r0 < 0) goto L_0x020b
            if (r0 >= r8) goto L_0x020b
            X.3BB r0 = r5.A0B
            int r8 = r0.A06()
            int r0 = r12.A00
            int r8 = r8 + r0
            r7.A00 = r8
            r7.A04 = r2
            r7.A01 = r11
        L_0x009a:
            r7.A06 = r2
        L_0x009c:
            r5.A0n(r4)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0206
            r5.A0Q(r7, r1, r2)
        L_0x00a6:
            int r8 = r5.A03
            int r0 = r5.A04
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            int r8 = r5.A00
            int r0 = r5.A01
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            int r9 = r5.A03
            int r8 = r5.A00
            boolean r0 = r5.CWo()
            r13 = 1
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x01e6
            int r0 = r5.A06
            if (r0 == r12) goto L_0x01e3
            if (r0 == r9) goto L_0x01e3
        L_0x00c9:
            X.OLp r12 = r5.A0H
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0202
            android.content.Context r0 = r5.A0N
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
        L_0x00db:
            r5.A06 = r9
            r5.A05 = r8
            int r12 = r5.A01
            r8 = -1
            if (r12 != r8) goto L_0x01db
            int r9 = r5.A08
            if (r9 != r8) goto L_0x018f
            if (r13 != 0) goto L_0x018f
            int r12 = r7.A03
        L_0x00ec:
            X.VLu r9 = r5.A0F
            r13 = 0
            r9.A00 = r13
            boolean r14 = r5.CWo()
            java.util.List r13 = r5.A0J
            int r13 = r13.size()
            if (r14 == 0) goto L_0x016d
            if (r13 <= 0) goto L_0x015b
            java.util.List r6 = r5.A0J
            r15.A0G(r6, r12)
            int r8 = r7.A03
            java.util.List r6 = r5.A0J
            r16 = r9
            r17 = r6
            r18 = r11
        L_0x010e:
            r19 = r0
            r20 = r12
        L_0x0112:
            r21 = r8
        L_0x0114:
            r15.A0F(r16, r17, r18, r19, r20, r21)
            java.util.List r0 = r9.A00
            r5.A0J = r0
            r15.A0C(r11, r10, r12)
            r15.A0B(r12)
        L_0x0121:
            boolean r6 = r7.A05
            X.OLp r0 = r5.A0H
            r5.A0D(r4, r3, r0)
            X.OLp r0 = r5.A0H
            int r8 = r0.A04
            if (r6 == 0) goto L_0x014d
            r5.A0P(r7, r2, r1)
            X.OLp r0 = r5.A0H
            r5.A0D(r4, r3, r0)
            X.OLp r0 = r5.A0H
            int r6 = r0.A04
        L_0x013a:
            int r0 = r5.A0T()
            if (r0 <= 0) goto L_0x0014
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0375
            int r0 = r5.A02(r4, r3, r6, r2)
            int r8 = r8 + r0
            r5.A0C(r4, r3, r8, r1)
            return
        L_0x014d:
            r6 = r8
            r5.A0Q(r7, r2, r1)
            X.OLp r0 = r5.A0H
            r5.A0D(r4, r3, r0)
            X.OLp r0 = r5.A0H
            int r8 = r0.A04
            goto L_0x013a
        L_0x015b:
            r15.A08(r6)
            java.util.List r6 = r5.A0J
            r21 = r8
            r16 = r9
            r17 = r6
            r18 = r11
            r19 = r0
            r20 = r1
            goto L_0x0114
        L_0x016d:
            if (r13 <= 0) goto L_0x017f
            java.util.List r6 = r5.A0J
            r15.A0G(r6, r12)
            int r8 = r7.A03
            java.util.List r6 = r5.A0J
            r16 = r9
            r17 = r6
            r18 = r10
            goto L_0x010e
        L_0x017f:
            r15.A08(r6)
            java.util.List r6 = r5.A0J
            r16 = r9
            r17 = r6
            r18 = r10
            r19 = r0
            r20 = r1
            goto L_0x0112
        L_0x018f:
            boolean r6 = r7.A05
            if (r6 != 0) goto L_0x0121
            java.util.List r6 = r5.A0J
            r6.clear()
            X.VLu r12 = r5.A0F
            r6 = 0
            r12.A00 = r6
            boolean r9 = r5.CWo()
            int r8 = r7.A03
            java.util.List r6 = r5.A0J
            if (r9 == 0) goto L_0x01ce
            r21 = r8
            r18 = r11
            r19 = r0
            r20 = r1
            r16 = r12
            r17 = r6
        L_0x01b3:
            r15.A0F(r16, r17, r18, r19, r20, r21)
            java.util.List r0 = r12.A00
            r5.A0J = r0
            r15.A0C(r11, r10, r1)
            r15.A0B(r1)
            int[] r6 = r15.A00
            int r0 = r7.A03
            r6 = r6[r0]
            r7.A01 = r6
            X.OLp r0 = r5.A0H
            r0.A01 = r6
            goto L_0x0121
        L_0x01ce:
            r16 = r12
            r17 = r6
            r18 = r10
            r19 = r0
            r20 = r1
            r21 = r8
            goto L_0x01b3
        L_0x01db:
            int r9 = r7.A03
            int r12 = java.lang.Math.min(r12, r9)
            goto L_0x00ec
        L_0x01e3:
            r13 = 0
            goto L_0x00c9
        L_0x01e6:
            int r0 = r5.A05
            if (r0 == r12) goto L_0x0200
            if (r0 == r8) goto L_0x0200
        L_0x01ec:
            X.OLp r12 = r5.A0H
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0202
            android.content.Context r0 = r5.A0N
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            goto L_0x00db
        L_0x0200:
            r13 = 0
            goto L_0x01ec
        L_0x0202:
            int r0 = r12.A00
            goto L_0x00db
        L_0x0206:
            r5.A0P(r7, r1, r2)
            goto L_0x00a6
        L_0x020b:
            int r8 = r5.A09
            if (r8 != r9) goto L_0x033f
            android.view.View r9 = r5.A1D(r13)
            if (r9 == 0) goto L_0x026f
            X.3BB r0 = r5.A0B
            int r8 = r0.A0B(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A07()
            if (r8 > r0) goto L_0x0284
            X.3BB r0 = r5.A0B
            int r8 = r0.A0D(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A06()
            int r8 = r8 - r0
            X.3BB r0 = r5.A0B
            if (r8 >= 0) goto L_0x023e
            int r0 = r0.A06()
            r7.A00 = r0
            r7.A05 = r1
            goto L_0x009a
        L_0x023e:
            int r8 = r0.A03()
            X.3BB r0 = r5.A0B
            int r0 = r0.A08(r9)
            int r8 = r8 - r0
            if (r8 >= 0) goto L_0x0257
            X.3BB r0 = r5.A0B
            int r0 = r0.A03()
            r7.A00 = r0
            r7.A05 = r2
            goto L_0x009a
        L_0x0257:
            boolean r8 = r7.A05
            X.3BB r0 = r5.A0B
            if (r8 == 0) goto L_0x0269
            int r8 = r0.A08(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A01()
            goto L_0x035c
        L_0x0269:
            int r8 = r0.A0D(r9)
            goto L_0x0350
        L_0x026f:
            int r0 = r5.A0T()
            if (r0 <= 0) goto L_0x0284
            android.view.View r0 = r5.A0X(r1)
            int r8 = X.C252553pI.A06(r0)
            int r0 = r5.A08
            if (r0 >= r8) goto L_0x0282
            r10 = 1
        L_0x0282:
            r7.A05 = r10
        L_0x0284:
            X.C66848Mdh.A00(r7)
            goto L_0x009a
        L_0x0289:
            r5.A08 = r11
            r5.A09 = r9
        L_0x028d:
            int r0 = r5.A0T()
            if (r0 == 0) goto L_0x035e
            boolean r8 = r7.A05
            int r0 = r3.A00()
            if (r8 == 0) goto L_0x0334
            android.view.View r9 = r5.A0I(r0)
        L_0x029f:
            if (r9 == 0) goto L_0x035e
            com.google.android.flexbox.FlexboxLayoutManager r10 = r7.A07
            boolean r0 = r10.CWo()
            if (r0 != 0) goto L_0x0324
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x0324
            boolean r8 = r7.A05
            X.3BB r0 = r10.A0B
            if (r8 == 0) goto L_0x031f
            int r8 = r0.A0D(r9)
        L_0x02b7:
            X.3BB r0 = r10.A0B
            int r0 = r0.A01()
            int r8 = r8 + r0
        L_0x02be:
            r7.A00 = r8
            int r12 = X.C252553pI.A06(r9)
            r7.A03 = r12
            r11 = 0
            r7.A04 = r1
            X.Toj r0 = r10.A0O
            int[] r0 = r0.A00
            r8 = -1
            if (r12 != r8) goto L_0x02d1
            r12 = 0
        L_0x02d1:
            r0 = r0[r12]
            if (r0 == r8) goto L_0x02d6
            r11 = r0
        L_0x02d6:
            r7.A01 = r11
            java.util.List r0 = r10.A0J
            int r0 = r0.size()
            int r8 = r7.A01
            if (r0 <= r8) goto L_0x02ee
            java.util.List r0 = r10.A0J
            java.lang.Object r0 = r0.get(r8)
            X.Tok r0 = (X.C14043Tok) r0
            int r0 = r0.A04
            r7.A03 = r0
        L_0x02ee:
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x009a
            boolean r0 = r5.A1J()
            if (r0 == 0) goto L_0x009a
            X.3BB r0 = r5.A0B
            int r8 = r0.A0D(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A03()
            if (r8 >= r0) goto L_0x0314
            X.3BB r0 = r5.A0B
            int r8 = r0.A08(r9)
            X.3BB r0 = r5.A0B
            int r0 = r0.A06()
            if (r8 >= r0) goto L_0x009a
        L_0x0314:
            boolean r8 = r7.A05
            X.3BB r0 = r5.A0B
            if (r8 == 0) goto L_0x033a
            int r8 = r0.A03()
            goto L_0x0350
        L_0x031f:
            int r8 = r0.A08(r9)
            goto L_0x02be
        L_0x0324:
            boolean r8 = r7.A05
            X.3BB r0 = r10.A0B
            if (r8 == 0) goto L_0x032f
            int r8 = r0.A08(r9)
            goto L_0x02b7
        L_0x032f:
            int r8 = r0.A0D(r9)
            goto L_0x02be
        L_0x0334:
            android.view.View r9 = r5.A0H(r0)
            goto L_0x029f
        L_0x033a:
            int r8 = r0.A06()
            goto L_0x0350
        L_0x033f:
            boolean r0 = r5.CWo()
            if (r0 != 0) goto L_0x0354
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x0354
            X.3BB r0 = r5.A0B
            int r0 = r0.A04()
            int r8 = r8 - r0
        L_0x0350:
            r7.A00 = r8
            goto L_0x009a
        L_0x0354:
            X.3BB r0 = r5.A0B
            int r8 = r0.A06()
            int r0 = r5.A09
        L_0x035c:
            int r8 = r8 + r0
            goto L_0x0350
        L_0x035e:
            X.C66848Mdh.A00(r7)
            r7.A03 = r1
            r7.A01 = r1
            goto L_0x009a
        L_0x0367:
            if (r8 != r2) goto L_0x036a
            goto L_0x036e
        L_0x036a:
            r0 = 0
            goto L_0x036f
        L_0x036c:
            if (r8 == r2) goto L_0x036a
        L_0x036e:
            r0 = 1
        L_0x036f:
            r5.A0L = r0
            r5.A0K = r1
            goto L_0x002d
        L_0x0375:
            int r0 = r5.A0C(r4, r3, r8, r2)
            int r6 = r6 + r0
            r5.A02(r4, r3, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A1R(X.3AN, X.3AW):void");
    }

    public final void A1a(int i) {
        if (this.A02 != i) {
            A0a();
            this.A02 = i;
            this.A0B = null;
            this.A0C = null;
            this.A0J.clear();
            C66848Mdh mdh = this.A0G;
            C66848Mdh.A01(mdh);
            mdh.A02 = 0;
            A0b();
        }
    }

    public final int BKY() {
        if (this.A0J.size() == 0) {
            return 0;
        }
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        int size = this.A0J.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C14043Tok) this.A0J.get(i2)).A08);
        }
        return i;
    }

    public final View Bm1(int i) {
        View view = (View) this.A0A.get(i);
        if (view == null) {
            return this.A0D.A04(i);
        }
        return view;
    }

    public final boolean CWo() {
        int i = this.A02;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.VLu, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FlexboxLayoutManager(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            r6 = this;
            r6.<init>()
            r1 = -1
            r6.A07 = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0J = r0
            X.Toj r0 = new X.Toj
            r0.<init>(r6)
            r6.A0O = r0
            X.Mdh r0 = new X.Mdh
            r0.<init>(r6)
            r6.A0G = r0
            r6.A08 = r1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A09 = r0
            r6.A06 = r0
            r6.A05 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r6.A0A = r0
            r6.A01 = r1
            X.VLu r0 = new X.VLu
            r0.<init>()
            r6.A0F = r0
            int[] r0 = X.C238093An.A00
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r8, r0, r9, r10)
            r0 = 0
            r3 = 1
            int r4 = r5.getInt(r0, r3)
            r0 = 10
            r5.getInt(r0, r3)
            r0 = 9
            r2 = 0
            boolean r1 = r5.getBoolean(r0, r2)
            r0 = 11
            r5.getBoolean(r0, r2)
            r5.recycle()
            if (r4 == 0) goto L_0x009c
            if (r4 != r3) goto L_0x0060
            r0 = 2
            if (r1 == 0) goto L_0x005d
            r0 = 3
        L_0x005d:
            r6.A1a(r0)
        L_0x0060:
            int r0 = r6.A03
            if (r0 == r3) goto L_0x007d
            r6.A0a()
            java.util.List r0 = r6.A0J
            r0.clear()
            X.Mdh r0 = r6.A0G
            X.C66848Mdh.A01(r0)
            r0.A02 = r2
            r6.A03 = r3
            r0 = 0
            r6.A0B = r0
            r6.A0C = r0
            r6.A0b()
        L_0x007d:
            r1 = 4
            int r0 = r6.A00
            if (r0 == r1) goto L_0x0096
            r6.A0a()
            java.util.List r0 = r6.A0J
            r0.clear()
            X.Mdh r0 = r6.A0G
            X.C66848Mdh.A01(r0)
            r0.A02 = r2
            r6.A00 = r1
            r6.A0b()
        L_0x0096:
            r6.A0v(r3)
            r6.A0N = r7
            return
        L_0x009c:
            if (r1 == 0) goto L_0x00a2
            r6.A1a(r3)
            goto L_0x0060
        L_0x00a2:
            r0 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private int A00(int i) {
        int height;
        int i2;
        int i3;
        if (A0T() == 0 || i == 0) {
            return 0;
        }
        A0N();
        boolean CWo = CWo();
        View view = this.A0M;
        if (CWo) {
            height = view.getWidth();
            i2 = this.A03;
        } else {
            height = view.getHeight();
            i2 = this.A00;
        }
        if (this.A07.getLayoutDirection() == 1) {
            int abs = Math.abs(i);
            C66848Mdh mdh = this.A0G;
            if (i < 0) {
                i3 = Math.min((i2 + mdh.A02) - height, abs);
            } else {
                i3 = mdh.A02;
                if (i3 + i <= 0) {
                    return i;
                }
            }
        } else {
            C66848Mdh mdh2 = this.A0G;
            if (i > 0) {
                return Math.min((i2 - mdh2.A02) - height, i);
            }
            i3 = mdh2.A02;
            if (i3 + i >= 0) {
                return i;
            }
        }
        return -i3;
    }

    private int A02(AnonymousClass3AN r4, AnonymousClass3AW r5, int i, boolean z) {
        int i2;
        int A032;
        if (CWo() || !this.A0L) {
            int A033 = this.A0B.A03() - i;
            if (A033 <= 0) {
                return 0;
            }
            i2 = -A01(r4, r5, -A033);
        } else {
            int A062 = i - this.A0B.A06();
            if (A062 <= 0) {
                return 0;
            }
            i2 = A01(r4, r5, A062);
        }
        int i3 = i + i2;
        if (!z || (A032 = this.A0B.A03() - i3) <= 0) {
            return i2;
        }
        this.A0B.A0E(A032);
        return A032 + i2;
    }

    private int A0C(AnonymousClass3AN r4, AnonymousClass3AW r5, int i, boolean z) {
        int i2;
        int A062;
        if (CWo() || !this.A0L) {
            int A063 = i - this.A0B.A06();
            if (A063 > 0) {
                i2 = -A01(r4, r5, A063);
            }
            return 0;
        }
        int A032 = this.A0B.A03() - i;
        if (A032 > 0) {
            i2 = A01(r4, r5, -A032);
        }
        return 0;
        int i3 = i + i2;
        if (!z || (A062 = i3 - this.A0B.A06()) <= 0) {
            return i2;
        }
        this.A0B.A0E(-A062);
        return i2 - A062;
    }

    public static int A0E(AnonymousClass3AW r4, FlexboxLayoutManager flexboxLayoutManager) {
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A002 = r4.A00();
        flexboxLayoutManager.A0N();
        View A0H2 = flexboxLayoutManager.A0H(A002);
        View A0I2 = flexboxLayoutManager.A0I(A002);
        if (r4.A00() == 0 || A0H2 == null || A0I2 == null) {
            return 0;
        }
        return Math.min(flexboxLayoutManager.A0B.A07(), flexboxLayoutManager.A0B.A08(A0I2) - flexboxLayoutManager.A0B.A0D(A0H2));
    }

    public static int A0F(AnonymousClass3AW r7, FlexboxLayoutManager flexboxLayoutManager) {
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A002 = r7.A00();
        View A0H2 = flexboxLayoutManager.A0H(A002);
        View A0I2 = flexboxLayoutManager.A0I(A002);
        if (r7.A00() == 0 || A0H2 == null || A0I2 == null) {
            return 0;
        }
        int A062 = C252553pI.A06(A0H2);
        int A063 = C252553pI.A06(A0I2);
        int abs = Math.abs(flexboxLayoutManager.A0B.A08(A0I2) - flexboxLayoutManager.A0B.A0D(A0H2));
        int[] iArr = flexboxLayoutManager.A0O.A00;
        int i = iArr[A062];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[A063] - i) + 1)))) + ((float) (flexboxLayoutManager.A0B.A06() - flexboxLayoutManager.A0B.A0D(A0H2))));
    }

    public static int A0G(AnonymousClass3AW r5, FlexboxLayoutManager flexboxLayoutManager) {
        int A062;
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A002 = r5.A00();
        View A0H2 = flexboxLayoutManager.A0H(A002);
        View A0I2 = flexboxLayoutManager.A0I(A002);
        if (r5.A00() == 0 || A0H2 == null || A0I2 == null) {
            return 0;
        }
        View A0M2 = A0M(flexboxLayoutManager, 0, flexboxLayoutManager.A0T());
        if (A0M2 == null) {
            A062 = -1;
        } else {
            A062 = C252553pI.A06(A0M2);
        }
        int i = -1;
        View A0M3 = A0M(flexboxLayoutManager, flexboxLayoutManager.A0T() - 1, -1);
        if (A0M3 != null) {
            i = C252553pI.A06(A0M3);
        }
        return (int) ((((float) Math.abs(flexboxLayoutManager.A0B.A08(A0I2) - flexboxLayoutManager.A0B.A0D(A0H2))) / ((float) ((i - A062) + 1))) * ((float) r5.A00()));
    }

    private View A0I(int i) {
        View A0J2 = A0J(A0T() - 1, -1, i);
        if (A0J2 == null) {
            return null;
        }
        return A0L(A0J2, (C14043Tok) this.A0J.get(this.A0O.A00[C252553pI.A06(A0J2)]));
    }

    private View A0J(int i, int i2, int i3) {
        A0N();
        if (this.A0H == null) {
            this.A0H = new C70794OLp();
        }
        int A062 = this.A0B.A06();
        int A032 = this.A0B.A03();
        int i4 = -1;
        if (i2 > i) {
            i4 = 1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0X = A0X(i);
            int A063 = C252553pI.A06(A0X);
            if (A063 >= 0 && A063 < i3) {
                if (((AnonymousClass3MX) A0X.getLayoutParams()).mViewHolder.isRemoved()) {
                    if (view2 == null) {
                        view2 = A0X;
                    }
                } else if (this.A0B.A0D(A0X) >= A062 && this.A0B.A08(A0X) <= A032) {
                    return A0X;
                } else {
                    if (view == null) {
                        view = A0X;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    private View A0K(View view, C14043Tok tok) {
        boolean CWo = CWo();
        int i = tok.A06;
        for (int i2 = 1; i2 < i; i2++) {
            View A0X = A0X(i2);
            if (!(A0X == null || A0X.getVisibility() == 8)) {
                if (!this.A0L || CWo) {
                    if (this.A0B.A0D(view) <= this.A0B.A0D(A0X)) {
                    }
                } else if (this.A0B.A08(view) >= this.A0B.A08(A0X)) {
                }
                view = A0X;
            }
        }
        return view;
    }

    private View A0L(View view, C14043Tok tok) {
        boolean CWo = CWo();
        int A0T = (A0T() - tok.A06) - 1;
        for (int A0T2 = A0T() - 2; A0T2 > A0T; A0T2--) {
            View A0X = A0X(A0T2);
            if (!(A0X == null || A0X.getVisibility() == 8)) {
                if (!this.A0L || CWo) {
                    if (this.A0B.A08(view) >= this.A0B.A08(A0X)) {
                    }
                } else if (this.A0B.A0D(view) <= this.A0B.A0D(A0X)) {
                }
                view = A0X;
            }
        }
        return view;
    }

    public static void A0R(FlexboxLayoutManager flexboxLayoutManager, int i) {
        int A0D2;
        int i2 = -1;
        View A0M2 = A0M(flexboxLayoutManager, flexboxLayoutManager.A0T() - 1, -1);
        if (A0M2 != null) {
            i2 = C252553pI.A06(A0M2);
        }
        if (i < i2) {
            int A0T = flexboxLayoutManager.A0T();
            C14042Toj toj = flexboxLayoutManager.A0O;
            toj.A09(A0T);
            toj.A0A(A0T);
            toj.A08(A0T);
            if (i < toj.A00.length) {
                flexboxLayoutManager.A01 = i;
                View A0X = flexboxLayoutManager.A0X(0);
                if (A0X != null) {
                    flexboxLayoutManager.A08 = C252553pI.A06(A0X);
                    if (flexboxLayoutManager.CWo() || !flexboxLayoutManager.A0L) {
                        A0D2 = flexboxLayoutManager.A0B.A0D(A0X) - flexboxLayoutManager.A0B.A06();
                    } else {
                        A0D2 = flexboxLayoutManager.A0B.A08(A0X) + flexboxLayoutManager.A0B.A04();
                    }
                    flexboxLayoutManager.A09 = A0D2;
                }
            }
        }
    }

    public static boolean A0S(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public final int A1K(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        if (!CWo()) {
            int A012 = A01(r4, r5, i);
            this.A0A.clear();
            return A012;
        }
        int A002 = A00(i);
        this.A0G.A02 += A002;
        this.A0C.A0E(-A002);
        return A002;
    }

    public final int A1L(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        if (CWo()) {
            int A012 = A01(r4, r5, i);
            this.A0A.clear();
            return A012;
        }
        int A002 = A00(i);
        this.A0G.A02 += A002;
        this.A0C.A0E(-A002);
        return A002;
    }

    public final void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        AnonymousClass52S r0 = new AnonymousClass52S(recyclerView.getContext());
        r0.A00 = i;
        A0t(r0);
    }

    public final void A1U(RecyclerView recyclerView) {
        this.A0M = (View) recyclerView.getParent();
    }

    public final boolean A1X() {
        if (!CWo() || this.A03 > this.A0M.getWidth()) {
            return true;
        }
        return false;
    }

    public final boolean A1Y() {
        if (CWo() || this.A00 > this.A0M.getHeight()) {
            return true;
        }
        return false;
    }

    public final PointF AIp(int i) {
        PointF pointF;
        if (A0T() == 0) {
            return null;
        }
        int i2 = 1;
        if (i < C252553pI.A06(A0X(0))) {
            i2 = -1;
        }
        float f = (float) i2;
        if (CWo()) {
            return pointF;
        }
        pointF = new PointF(f, 0.0f);
        return pointF;
    }

    public final int Avg(View view) {
        int A052;
        int A072;
        if (CWo()) {
            A052 = ((AnonymousClass3MX) view.getLayoutParams()).A02.top;
            A072 = ((AnonymousClass3MX) view.getLayoutParams()).A02.bottom;
        } else {
            A052 = C252553pI.A05(view);
            A072 = C252553pI.A07(view);
        }
        return A052 + A072;
    }

    public final boolean A1Z(AnonymousClass3MX r2) {
        return r2 instanceof LayoutParams;
    }

    public final void A1Q(2Rw r1, 2Rw r2) {
        A0a();
    }

    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        A0R(this, i);
    }

    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        A0R(this, i);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.VLu, java.lang.Object] */
    public FlexboxLayoutManager(Context context) {
        A1a(0);
        if (this.A03 != 1) {
            A0a();
            this.A0J.clear();
            C66848Mdh mdh = this.A0G;
            C66848Mdh.A01(mdh);
            mdh.A02 = 0;
            this.A03 = 1;
            this.A0B = null;
            this.A0C = null;
            A0b();
        }
        if (this.A00 != 4) {
            A0a();
            this.A0J.clear();
            C66848Mdh mdh2 = this.A0G;
            C66848Mdh.A01(mdh2);
            mdh2.A02 = 0;
            this.A00 = 4;
            A0b();
        }
        A0v(true);
        this.A0N = context;
    }
}
