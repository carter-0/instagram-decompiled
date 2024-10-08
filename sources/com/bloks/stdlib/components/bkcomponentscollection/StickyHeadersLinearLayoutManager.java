package com.bloks.stdlib.components.bkcomponentscollection;

import X.0qQ;
import X.0sr;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass972;
import X.C249703kE;
import X.C51966G9m;
import X.C51971G9r;
import X.C67818MvM;
import X.C7216Pzk;
import X.DbZ;
import X.Tq8;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public View A03;
    public Tq8 A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final C67818MvM A06 = new C67818MvM(this);

    public StickyHeadersLinearLayoutManager(Context context, int i) {
        super(context, i, false);
    }

    private final void A0D(View view) {
        A0j(view, 0, 0);
        if (this.A01 == 1) {
            view.layout(Ba9(), 0, this.A03 - BaB(), view.getMeasuredHeight());
        } else {
            view.layout(0, BaC(), view.getMeasuredWidth(), this.A00 - Ba8());
        }
    }

    public final int A11(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0J = LinearLayoutManager.A0J(this, r2);
        A02();
        return A0J;
    }

    public final int A12(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0K = LinearLayoutManager.A0K(this, r2);
        A02();
        return A0K;
    }

    public final int A13(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0L = LinearLayoutManager.A0L(this, r2);
        A02();
        return A0L;
    }

    public final int A14(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0J = LinearLayoutManager.A0J(this, r2);
        A02();
        return A0J;
    }

    public final int A15(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0K = LinearLayoutManager.A0K(this, r2);
        A02();
        return A0K;
    }

    public final int A16(AnonymousClass3AW r2) {
        0qQ.A0B(r2, 0);
        A0C();
        int A0L = LinearLayoutManager.A0L(this, r2);
        A02();
        return A0L;
    }

    public final View A1E(View view, AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        DbZ.A0t(0, view, r3, r4);
        A0C();
        View A1E = super.A1E(view, r3, r4, i);
        A02();
        return A1E;
    }

    public final void A1p(int i, int i2) {
        int width;
        this.A01 = -1;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int A002 = A00(i);
        if (A002 != -1) {
            List list = this.A05;
            if (0sr.A1J(Integer.valueOf(i), list, list.size()) < 0) {
                int i3 = i - 1;
                if (0sr.A1J(Integer.valueOf(i3), list, list.size()) < 0) {
                    View view = this.A03;
                    if (view != null) {
                        int A1J = 0sr.A1J(Integer.valueOf(this.A02), list, list.size());
                        if (A1J < 0) {
                            A1J = -1;
                        }
                        if (A002 == A1J) {
                            if (i2 == Integer.MIN_VALUE) {
                                i2 = 0;
                            }
                            if (this.A01 == 1) {
                                width = view.getHeight();
                            } else {
                                width = view.getWidth();
                            }
                            i2 += width;
                        }
                    }
                    this.A01 = i;
                    this.A00 = i2;
                } else {
                    super.A1p(i3, i2);
                    return;
                }
            }
        }
        super.A1p(i, i2);
    }

    public final class SavedState implements Parcelable {
        public static final C7216Pzk CREATOR = new C7216Pzk(84);
        public final int A00;
        public final int A01;
        public final Parcelable A02;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.A02 = parcelable;
            this.A01 = i;
            this.A00 = i2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SavedState(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.Class<com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState> r2 = com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState.class
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 33
                if (r1 < r0) goto L_0x001e
                java.lang.ClassLoader r0 = r2.getClassLoader()
                java.lang.Object r2 = r4.readParcelable(r0, r2)
            L_0x0010:
                com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState r2 = (com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState) r2
                int r1 = r4.readInt()
                int r0 = r4.readInt()
                r3.<init>(r2, r1, r0)
                return
            L_0x001e:
                android.os.Parcelable r2 = X.C41847B3o.A03(r4, r2)
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState.<init>(android.os.Parcel):void");
        }
    }

    private final int A00(int i) {
        List list = this.A05;
        int A062 = C51966G9m.A06(list);
        int i2 = 0;
        while (i2 <= A062) {
            int i3 = (i2 + A062) / 2;
            if (C51971G9r.A0I(list, i3) > i) {
                A062 = i3 - 1;
            } else if (i3 >= C51966G9m.A06(list)) {
                return i3;
            } else {
                i2 = i3 + 1;
                if (C51971G9r.A0I(list, i2) > i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final int A01(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        List list = stickyHeadersLinearLayoutManager.A05;
        int A062 = C51966G9m.A06(list);
        int i2 = 0;
        while (i2 <= A062) {
            int i3 = (i2 + A062) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (C51971G9r.A0I(list, i4) >= i) {
                    A062 = i4;
                }
            }
            if (C51971G9r.A0I(list, i3) >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    private final void A02() {
        View view = this.A03;
        if (view != null) {
            A0i(view, -1);
        }
    }

    private final void A0C() {
        int A052;
        View view = this.A03;
        if (view != null && (A052 = this.A05.A05(view)) >= 0) {
            this.A05.A08(A052);
        }
    }

    private final void A0E(2Rw r3) {
        Tq8 tq8 = this.A04;
        if (tq8 != null) {
            tq8.unregisterAdapterDataObserver(this.A06);
        }
        if (r3 instanceof Tq8) {
            this.A04 = (Tq8) r3;
            C67818MvM mvM = this.A06;
            r3.registerAdapterDataObserver(mvM);
            mvM.onChanged();
            return;
        }
        this.A04 = null;
        this.A05.clear();
    }

    public static final void A0F(AnonymousClass3AN r3, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A03 = null;
            stickyHeadersLinearLayoutManager.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C249703kE A062 = RecyclerView.A06(view);
            A062.stopIgnoring();
            A062.resetInternal();
            A062.addFlags(4);
            stickyHeadersLinearLayoutManager.A0g(view);
            if (r3 != null) {
                r3.A0A(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020a, code lost:
        if ((r4 + r1) > 0.0f) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r4 >= ((float) r1)) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0252 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0G(X.AnonymousClass3AN r23, boolean r24) {
        /*
            r22 = this;
            r8 = r22
            java.util.List r11 = r8.A05
            int r10 = r11.size()
            int r12 = r8.A0T()
            r7 = r23
            if (r10 <= 0) goto L_0x025c
            if (r12 <= 0) goto L_0x025c
            r9 = 0
        L_0x0013:
            r14 = 0
            r6 = -1
            if (r9 >= r12) goto L_0x025c
            android.view.View r5 = r8.A0X(r9)
            if (r5 == 0) goto L_0x0259
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
        L_0x0021:
            boolean r0 = r4 instanceof X.AnonymousClass3MX
            if (r0 == 0) goto L_0x0256
            X.3MX r4 = (X.AnonymousClass3MX) r4
        L_0x0027:
            if (r5 == 0) goto L_0x0252
            if (r4 == 0) goto L_0x0252
            X.3kE r1 = r4.mViewHolder
            boolean r0 = r1.isRemoved()
            if (r0 != 0) goto L_0x0252
            boolean r0 = r1.isInvalid()
            if (r0 != 0) goto L_0x0252
            int r0 = r8.A01
            r13 = 0
            r3 = 1
            boolean r2 = r8.A08
            if (r0 != r3) goto L_0x0222
            if (r2 == 0) goto L_0x0234
            int r0 = r5.getTop()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
            float r1 = r1 + r0
            int r0 = r8.A00
        L_0x004f:
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0252
        L_0x0054:
            android.view.View r0 = r8.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0252
            X.3kE r0 = r4.mViewHolder
            int r0 = r0.getBindingAdapterPosition()
            if (r0 == r6) goto L_0x025c
            int r1 = r8.A00(r0)
            if (r1 == r6) goto L_0x021f
            int r15 = X.C51971G9r.A0I(r11, r1)
        L_0x006e:
            int r1 = r1 + 1
            if (r10 <= r1) goto L_0x021c
            int r10 = X.C51971G9r.A0I(r11, r1)
        L_0x0076:
            if (r15 == r6) goto L_0x025c
            if (r15 != r0) goto L_0x0091
            int r1 = r8.A01
            if (r1 != r3) goto L_0x01f6
            if (r2 == 0) goto L_0x01ec
            int r1 = r5.getBottom()
            float r4 = (float) r1
            float r1 = r5.getTranslationY()
            float r4 = r4 - r1
            int r1 = r8.A00
        L_0x008c:
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x025c
        L_0x0091:
            int r1 = r15 + 1
            if (r10 == r1) goto L_0x025c
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L_0x01e9
            X.3kE r1 = androidx.recyclerview.widget.RecyclerView.A06(r1)
            int r1 = r1.mItemViewType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x00a3:
            X.Tq8 r1 = r8.A04
            if (r1 == 0) goto L_0x01e6
            int r1 = r1.getItemViewType(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00af:
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 != 0) goto L_0x00b8
            A0F(r7, r8)
        L_0x00b8:
            android.view.View r5 = r8.A03
            if (r5 != 0) goto L_0x00eb
            android.view.View r5 = r7.A04(r15)
            X.0qQ.A07(r5)
            r8.A0h(r5, r6)
            r8.A0D(r5)
            android.view.ViewParent r4 = r5.getParent()
            androidx.recyclerview.widget.RecyclerView r1 = r8.A07
            if (r4 != r1) goto L_0x028d
            int r1 = r1.indexOfChild(r5)
            if (r1 == r6) goto L_0x028d
            X.3kE r4 = androidx.recyclerview.widget.RecyclerView.A06(r5)
            r1 = 128(0x80, float:1.794E-43)
            r4.addFlags(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r8.A07
            X.3AO r1 = r1.A10
            r1.A04(r4)
            r8.A03 = r5
            r8.A02 = r15
        L_0x00eb:
            if (r24 != 0) goto L_0x0171
            if (r5 == 0) goto L_0x0171
            int r1 = X.C252553pI.A06(r5)
            if (r1 != r15) goto L_0x0171
        L_0x00f5:
            if (r10 == r6) goto L_0x0106
            int r10 = r10 - r0
            int r9 = r9 + r10
            android.view.View r1 = r8.A0X(r9)
            android.view.View r0 = r8.A03
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x0106
            r14 = r1
        L_0x0106:
            android.view.View r5 = r8.A03
            if (r5 == 0) goto L_0x0159
            int r0 = r8.A01
            r4 = 0
            if (r0 == r3) goto L_0x0136
            if (r2 != 0) goto L_0x0117
            boolean r0 = r8.A1u()
            if (r0 == 0) goto L_0x011f
        L_0x0117:
            int r1 = r8.A03
            int r0 = r5.getWidth()
            int r1 = r1 - r0
            int r4 = r4 + r1
        L_0x011f:
            if (r14 == 0) goto L_0x0136
            if (r2 != 0) goto L_0x0168
            boolean r0 = r8.A1u()
            if (r0 != 0) goto L_0x0168
            int r1 = r14.getLeft()
            int r0 = r5.getWidth()
            int r1 = r1 - r0
            int r4 = java.lang.Math.min(r1, r4)
        L_0x0136:
            float r0 = (float) r4
            r5.setTranslationX(r0)
            int r0 = r8.A01
            r4 = 0
            if (r0 != r3) goto L_0x0155
            if (r2 == 0) goto L_0x0149
            int r1 = r8.A00
            int r0 = r5.getHeight()
            int r1 = r1 - r0
            int r4 = r4 + r1
        L_0x0149:
            if (r14 == 0) goto L_0x0155
            if (r2 == 0) goto L_0x015a
            int r0 = r14.getBottom()
            int r4 = java.lang.Math.max(r0, r4)
        L_0x0155:
            float r0 = (float) r4
            r5.setTranslationY(r0)
        L_0x0159:
            return
        L_0x015a:
            int r1 = r14.getTop()
            int r0 = r5.getHeight()
            int r1 = r1 - r0
            int r4 = java.lang.Math.min(r1, r4)
            goto L_0x0155
        L_0x0168:
            int r0 = r14.getRight()
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x0136
        L_0x0171:
            android.view.View r12 = r8.A03
            if (r12 == 0) goto L_0x00f5
            X.3kE r11 = androidx.recyclerview.widget.RecyclerView.A06(r12)
            if (r11 == 0) goto L_0x0280
            androidx.recyclerview.widget.RecyclerView r4 = r7.A08
            X.3Ae r1 = r4.A07
            r5 = 0
            int r1 = r1.A04(r15, r5)
            if (r1 < 0) goto L_0x0264
            X.2Rw r13 = r4.A0A
            int r13 = r13.getItemCount()
            if (r1 >= r13) goto L_0x0264
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r11
            r18 = r1
            r19 = r15
            r16 = r7
            X.AnonymousClass3AN.A02(r16, r17, r18, r19, r20)
            android.view.View r1 = r11.itemView
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            if (r7 != 0) goto L_0x01d8
            android.view.ViewGroup$LayoutParams r7 = r4.generateDefaultLayoutParams()
        L_0x01aa:
            X.3MX r7 = (X.AnonymousClass3MX) r7
            android.view.View r1 = r11.itemView
            r1.setLayoutParams(r7)
        L_0x01b1:
            r4 = 1
            r7.A00 = r3
            r7.mViewHolder = r11
            android.view.View r1 = r11.itemView
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x01bf
            r4 = 0
        L_0x01bf:
            r7.A01 = r4
            r8.A02 = r15
            r8.A0D(r12)
            int r1 = r8.A01
            if (r1 == r6) goto L_0x00f5
            android.view.ViewTreeObserver r4 = r12.getViewTreeObserver()
            X.Okn r1 = new X.Okn
            r1.<init>(r5, r4, r8)
            r4.addOnGlobalLayoutListener(r1)
            goto L_0x00f5
        L_0x01d8:
            boolean r1 = r4.checkLayoutParams(r7)
            if (r1 != 0) goto L_0x01e3
            android.view.ViewGroup$LayoutParams r7 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r7)
            goto L_0x01aa
        L_0x01e3:
            X.3MX r7 = (X.AnonymousClass3MX) r7
            goto L_0x01b1
        L_0x01e6:
            r1 = r14
            goto L_0x00af
        L_0x01e9:
            r4 = r14
            goto L_0x00a3
        L_0x01ec:
            int r1 = r5.getTop()
            float r4 = (float) r1
            float r1 = r5.getTranslationY()
            goto L_0x0207
        L_0x01f6:
            if (r2 != 0) goto L_0x020e
            boolean r1 = r8.A1u()
            if (r1 != 0) goto L_0x020e
            int r1 = r5.getLeft()
            float r4 = (float) r1
            float r1 = r5.getTranslationX()
        L_0x0207:
            float r4 = r4 + r1
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x025c
            goto L_0x0091
        L_0x020e:
            int r1 = r5.getRight()
            float r4 = (float) r1
            float r1 = r5.getTranslationX()
            float r4 = r4 - r1
            int r1 = r8.A03
            goto L_0x008c
        L_0x021c:
            r10 = -1
            goto L_0x0076
        L_0x021f:
            r15 = -1
            goto L_0x006e
        L_0x0222:
            if (r2 != 0) goto L_0x0244
            boolean r0 = r8.A1u()
            if (r0 != 0) goto L_0x0244
            int r0 = r5.getRight()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
            goto L_0x023d
        L_0x0234:
            int r0 = r5.getBottom()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
        L_0x023d:
            float r1 = r1 - r0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0252
            goto L_0x0054
        L_0x0244:
            int r0 = r5.getLeft()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
            float r1 = r1 + r0
            int r0 = r8.A03
            goto L_0x004f
        L_0x0252:
            int r9 = r9 + 1
            goto L_0x0013
        L_0x0256:
            r4 = r14
            goto L_0x0027
        L_0x0259:
            r4 = r14
            goto L_0x0021
        L_0x025c:
            android.view.View r0 = r8.A03
            if (r0 == 0) goto L_0x0159
            A0F(r7, r8)
            return
        L_0x0264:
            java.lang.String r11 = "Inconsistency detected. Invalid item position "
            java.lang.String r12 = "(offset:"
            java.lang.String r13 = ").state:"
            X.3AW r0 = r4.mState
            int r17 = r0.A00()
            java.lang.String r14 = r4.A0a()
            r16 = r1
            java.lang.String r1 = X.002.A0z(r11, r12, r13, r14, r15, r16, r17)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0280:
            java.lang.String r1 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            androidx.recyclerview.widget.RecyclerView r0 = r7.A08
            java.lang.String r0 = r0.A0a()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x028d:
            java.lang.String r1 = "View should be fully attached to be ignored"
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            java.lang.String r0 = r0.A0a()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A0G(X.3AN, boolean):void");
    }

    public final void A1O(int i) {
        A1p(i, AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A01 = savedState.A01;
            this.A00 = savedState.A00;
            parcelable = savedState.A02;
        }
        super.A1P(parcelable);
    }

    public final void A1U(RecyclerView recyclerView) {
        A0E(recyclerView.A0A);
    }

    public final int A1K(AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        AnonymousClass7TG.A1O(r3, r4);
        A0C();
        int A1K = super.A1K(r3, r4, i);
        A02();
        if (A1K != 0) {
            A0G(r3, false);
        }
        return A1K;
    }

    public final int A1L(AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        AnonymousClass7TG.A1O(r3, r4);
        A0C();
        int A1L = super.A1L(r3, r4, i);
        A02();
        if (A1L != 0) {
            A0G(r3, false);
        }
        return A1L;
    }

    public final Parcelable A1M() {
        return new SavedState(super.A1M(), this.A01, this.A00);
    }

    public final void A1R(AnonymousClass3AN r4, AnonymousClass3AW r5) {
        int A032 = AnonymousClass0fD.A03(-1676302042);
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r5);
        A0C();
        super.A1R(r4, r5);
        A02();
        if (!r5.A08) {
            A0G(r4, A1Z);
        }
        AnonymousClass0fD.A0A(-274752195, A032);
    }

    public final PointF AIp(int i) {
        A0C();
        PointF AIp = super.AIp(i);
        A02();
        return AIp;
    }

    public final void A1Q(2Rw r1, 2Rw r2) {
        A0E(r2);
    }
}
