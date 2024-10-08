package androidx.recyclerview.widget;

import X.002;
import X.03N;
import X.03v;
import X.0ff;
import X.0kx;
import X.0qQ;
import X.2Rw;
import X.AnonymousClass03M;
import X.AnonymousClass0fD;
import X.AnonymousClass3AJ;
import X.AnonymousClass3AK;
import X.AnonymousClass3AL;
import X.AnonymousClass3AM;
import X.AnonymousClass3AN;
import X.AnonymousClass3AO;
import X.AnonymousClass3AS;
import X.AnonymousClass3AT;
import X.AnonymousClass3AU;
import X.AnonymousClass3AW;
import X.AnonymousClass3AY;
import X.AnonymousClass3Ae;
import X.AnonymousClass3Ai;
import X.AnonymousClass3B3;
import X.AnonymousClass3BD;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass52T;
import X.AnonymousClass5Oq;
import X.AnonymousClass6U9;
import X.AnonymousClass972;
import X.C21286XSr;
import X.C228442lg;
import X.C2366234l;
import X.C237993Ab;
import X.C238043Ah;
import X.C238053Aj;
import X.C238073Al;
import X.C240673Lu;
import X.C241463Ph;
import X.C241543Pp;
import X.C249403jg;
import X.C249703kE;
import X.C252553pI;
import X.C275604qc;
import X.C331087Pm;
import X.C331097Pn;
import X.JLS;
import X.SN3;
import X.XD6;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements AnonymousClass03M {
    public static boolean A1C;
    public static boolean A1D;
    public static final float A1E = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final Interpolator A1F = new AnonymousClass3AJ();
    public static final AnonymousClass3AK A1G = new Object();
    public static final Class[] A1H;
    public static final int[] A1I = {16843830};
    public int A00;
    public int A01;
    public int A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public AnonymousClass3Ae A07;
    public C238053Aj A08;
    public AnonymousClass3AU A09;
    public 2Rw A0A;
    public AnonymousClass3AL A0B;
    public AnonymousClass3AS A0C;
    public C252553pI A0D;
    public C228442lg A0E;
    public C331097Pn A0F;
    public C249403jg A0G;
    public JLS A0H;
    public SavedState A0I;
    public C238073Al A0J;
    public Runnable A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public float A0a;
    public float A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public VelocityTracker A0m;
    public 03N A0n;
    public C331087Pm A0o;
    public AnonymousClass3AY A0p;
    public boolean A0q;
    public boolean A0r;
    public final float A0s;
    public final int A0t;
    public final Rect A0u;
    public final Rect A0v;
    public final RectF A0w;
    public final AccessibilityManager A0x;
    public final AnonymousClass3AN A0y;
    public final C237993Ab A0z;
    public final AnonymousClass3AO A10;
    public final Runnable A11;
    public final ArrayList A12;
    public final List A13;
    public final List A14;
    public final int[] A15;
    public final int[] A16;
    public final int A17;
    public final AnonymousClass3AM A18;
    public final ArrayList A19;
    public final int[] A1A;
    public final int[] A1B;
    public C240673Lu mGapWorker;
    public final AnonymousClass3AW mState;
    public final AnonymousClass3AT mViewFlinger;

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A0F(View view, View view2) {
        View view3 = view;
        View view4 = view;
        if (view2 != null) {
            view4 = view2;
        }
        Rect rect = this.A0u;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof AnonymousClass3MX) {
            AnonymousClass3MX r1 = (AnonymousClass3MX) layoutParams;
            if (!r1.A00) {
                Rect rect2 = r1.A02;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        C252553pI r2 = this.A0D;
        boolean z = !this.A0R;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        r2.A0x(rect, view3, this, z, z2);
    }

    private boolean A0Q(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float A002 = XD6.A00(edgeEffect) * ((float) i2);
        float f = this.A0s * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) A1E;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A002;
    }

    public final void A0l() {
        AnonymousClass52T r0;
        setScrollState(0);
        AnonymousClass3AT r1 = this.mViewFlinger;
        r1.A06.removeCallbacks(r1);
        r1.A01.abortAnimation();
        C252553pI r02 = this.A0D;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A02();
        }
    }

    public final void A0u(int i, int i2) {
        A0z((Interpolator) null, i, i2, AnonymousClass972.MUTABLE_FLAG_MASK, false);
    }

    public final void A10(C241463Ph r4, C249703kE r5) {
        long j;
        r5.setFlags(0, 8192);
        if (this.mState.A0D && r5.isUpdated() && !r5.isRemoved() && !r5.shouldIgnore()) {
            if (this.A0A.hasStableIds()) {
                j = r5.mItemId;
            } else {
                j = (long) r5.mPosition;
            }
            this.A10.A00.A09(j, r5);
        }
        this.A10.A01(r4, r5);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0D.A0x(rect, view, this, z, false);
    }

    public void setAdapter(2Rw r2) {
        suppressLayout(false);
        A0J(r2, this, false);
        A19(false);
        requestLayout();
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new AnonymousClass6U9();
        public Parcelable A00;

        public final void writeToParcel(Parcel parcel, int i) {
            RecyclerView.super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, 0);
        }
    }

    public static int A05(EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i, int i2) {
        int round;
        if (i > 0) {
            if (edgeEffect == null || XD6.A00(edgeEffect) == 0.0f) {
                return i;
            }
            round = Math.round((((float) (-i2)) / 4.0f) * XD6.A01(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
        } else if (i >= 0 || edgeEffect2 == null || XD6.A00(edgeEffect2) == 0.0f) {
            return i;
        } else {
            float f = (float) i2;
            round = Math.round((f / 4.0f) * XD6.A01(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f));
            if (round != i) {
                edgeEffect2.finish();
            }
        }
        return i - round;
    }

    public static C249703kE A06(View view) {
        if (view == null) {
            return null;
        }
        return ((AnonymousClass3MX) view.getLayoutParams()).mViewHolder;
    }

    public static RecyclerView A07(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView A072 = A07(viewGroup.getChildAt(i));
            if (A072 != null) {
                return A072;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.3MZ} */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.3Ph, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v49, types: [X.3Ph, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08() {
        /*
            r11 = this;
            X.3AW r0 = r11.mState
            r8 = 1
            r0.A01(r8)
            int r0 = r11.getScrollState()
            r5 = 2
            if (r0 != r5) goto L_0x001d
            X.3AT r0 = r11.mViewFlinger
            android.widget.OverScroller r0 = r0.A01
            r0.getFinalX()
            r0.getCurrX()
            r0.getFinalY()
            r0.getCurrY()
        L_0x001d:
            X.3AW r0 = r11.mState
            r6 = 0
            r0.A09 = r6
            r11.A0k()
            X.3AO r3 = r11.A10
            X.01r r7 = r3.A01
            r7.clear()
            X.01c r2 = r3.A00
            r2.A07()
            int r0 = r11.A01
            int r0 = r0 + 1
            r11.A01 = r0
            r11.A0A()
            boolean r0 = r11.A0Z
            if (r0 == 0) goto L_0x009e
            boolean r0 = r11.hasFocus()
            if (r0 == 0) goto L_0x009e
            X.2Rw r0 = r11.A0A
            if (r0 == 0) goto L_0x009e
            android.view.View r0 = r11.getFocusedChild()
            if (r0 == 0) goto L_0x009e
            X.3kE r9 = r11.A0Y(r0)
            if (r9 == 0) goto L_0x009e
            X.3AW r4 = r11.mState
            X.2Rw r0 = r11.A0A
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x009b
            long r0 = r9.mItemId
        L_0x0060:
            r4.A07 = r0
            boolean r0 = r11.A0P
            if (r0 == 0) goto L_0x008d
            r0 = -1
        L_0x0067:
            r4.A01 = r0
            android.view.View r9 = r9.itemView
        L_0x006b:
            int r10 = r9.getId()
        L_0x006f:
            boolean r0 = r9.isFocused()
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r9.hasFocus()
            if (r0 == 0) goto L_0x00a7
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r9 = r9.getFocusedChild()
            int r1 = r9.getId()
            r0 = -1
            if (r1 == r0) goto L_0x006f
            goto L_0x006b
        L_0x008d:
            boolean r0 = r9.isRemoved()
            if (r0 == 0) goto L_0x0096
            int r0 = r9.mOldPosition
            goto L_0x0067
        L_0x0096:
            int r0 = r9.getAbsoluteAdapterPosition()
            goto L_0x0067
        L_0x009b:
            r0 = -1
            goto L_0x0060
        L_0x009e:
            X.3AW r4 = r11.mState
            r0 = -1
            r4.A07 = r0
            r10 = -1
            r4.A01 = r10
        L_0x00a7:
            r4.A02 = r10
            X.3AW r1 = r11.mState
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0139
            boolean r0 = r11.A0V
            if (r0 == 0) goto L_0x0139
        L_0x00b3:
            r1.A0D = r8
            r11.A0V = r6
            r11.A0U = r6
            boolean r0 = r1.A0A
            r1.A08 = r0
            X.2Rw r0 = r11.A0A
            int r0 = r0.getItemCount()
            r1.A03 = r0
            int[] r0 = r11.A15
            r11.A0O(r0)
            X.3AW r0 = r11.mState
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x013c
            X.3Aj r10 = r11.A08
            int r9 = r10.A03()
            r8 = 0
        L_0x00d7:
            if (r8 >= r9) goto L_0x013c
            android.view.View r0 = r10.A06(r8)
            X.3kE r4 = A06(r0)
            boolean r0 = r4.shouldIgnore()
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r4.isInvalid()
            if (r0 == 0) goto L_0x00f8
            X.2Rw r0 = r11.A0A
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto L_0x00f8
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x00d7
        L_0x00f8:
            X.AnonymousClass3AS.A04(r4)
            r4.getUnmodifiedPayloads()
            X.3Ph r0 = new X.3Ph
            r0.<init>()
            r0.A00(r4)
            r3.A01(r0, r4)
            X.3AW r0 = r11.mState
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r4.isUpdated()
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r4.isRemoved()
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r4.shouldIgnore()
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r4.isInvalid()
            if (r0 != 0) goto L_0x00f5
            X.2Rw r0 = r11.A0A
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x0135
            long r0 = r4.mItemId
        L_0x0131:
            r2.A09(r0, r4)
            goto L_0x00f5
        L_0x0135:
            int r0 = r4.mPosition
            long r0 = (long) r0
            goto L_0x0131
        L_0x0139:
            r8 = 0
            goto L_0x00b3
        L_0x013c:
            X.3AW r0 = r11.mState
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x01f2
            X.3Aj r4 = r11.A08
            int r8 = r4.A04()
            r3 = 0
        L_0x0149:
            if (r3 >= r8) goto L_0x017e
            android.view.View r0 = r4.A07(r3)
            X.3kE r2 = A06(r0)
            boolean r0 = A1C
            if (r0 == 0) goto L_0x0172
            int r1 = r2.mPosition
            r0 = -1
            if (r1 != r0) goto L_0x0172
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L_0x0172
            java.lang.String r1 = "view holder cannot have position -1 unless it is removed"
            java.lang.String r0 = r11.A0a()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            boolean r0 = r2.shouldIgnore()
            if (r0 != 0) goto L_0x017b
            r2.saveOldPosition()
        L_0x017b:
            int r3 = r3 + 1
            goto L_0x0149
        L_0x017e:
            X.3AW r3 = r11.mState
            boolean r2 = r3.A0C
            r3.A0C = r6
            X.3pI r1 = r11.A0D
            X.3AN r0 = r11.A0y
            r1.A1R(r0, r3)
            X.3AW r0 = r11.mState
            r0.A0C = r2
            r3 = 0
        L_0x0190:
            int r0 = r4.A03()
            if (r3 >= r0) goto L_0x01f2
            android.view.View r0 = r4.A06(r3)
            X.3kE r8 = A06(r0)
            boolean r0 = r8.shouldIgnore()
            if (r0 != 0) goto L_0x01b2
            java.lang.Object r0 = r7.get(r8)
            X.3MZ r0 = (X.AnonymousClass3MZ) r0
            if (r0 == 0) goto L_0x01b5
            int r0 = r0.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01b5
        L_0x01b2:
            int r3 = r3 + 1
            goto L_0x0190
        L_0x01b5:
            X.AnonymousClass3AS.A04(r8)
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = r8.hasAnyOfTheFlags(r0)
            r8.getUnmodifiedPayloads()
            X.3Ph r2 = new X.3Ph
            r2.<init>()
            r2.A00(r8)
            if (r0 == 0) goto L_0x01cf
            r11.A10(r2, r8)
            goto L_0x01b2
        L_0x01cf:
            java.lang.Object r1 = r7.get(r8)
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x01e9
            X.02U r0 = X.AnonymousClass3MZ.A03
            java.lang.Object r1 = r0.A7A()
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x01e6
            X.3MZ r1 = new X.3MZ
            r1.<init>()
        L_0x01e6:
            r7.put(r8, r1)
        L_0x01e9:
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A02 = r2
            goto L_0x01b2
        L_0x01f2:
            X.3Aj r4 = r11.A08
            int r3 = r4.A04()
            r2 = 0
        L_0x01f9:
            if (r2 >= r3) goto L_0x020f
            android.view.View r0 = r4.A07(r2)
            X.3kE r1 = A06(r0)
            boolean r0 = r1.shouldIgnore()
            if (r0 != 0) goto L_0x020c
            r1.clearOldPosition()
        L_0x020c:
            int r2 = r2 + 1
            goto L_0x01f9
        L_0x020f:
            X.3AN r7 = r11.A0y
            java.util.ArrayList r3 = r7.A06
            int r2 = r3.size()
            r4 = 0
            r1 = 0
        L_0x0219:
            if (r1 >= r2) goto L_0x0227
            java.lang.Object r0 = r3.get(r1)
            X.3kE r0 = (X.C249703kE) r0
            r0.clearOldPosition()
            int r1 = r1 + 1
            goto L_0x0219
        L_0x0227:
            java.util.ArrayList r3 = r7.A05
            int r2 = r3.size()
            r1 = 0
        L_0x022e:
            if (r1 >= r2) goto L_0x023c
            java.lang.Object r0 = r3.get(r1)
            X.3kE r0 = (X.C249703kE) r0
            r0.clearOldPosition()
            int r1 = r1 + 1
            goto L_0x022e
        L_0x023c:
            java.util.ArrayList r2 = r7.A04
            if (r2 == 0) goto L_0x0252
            int r1 = r2.size()
        L_0x0244:
            if (r4 >= r1) goto L_0x0252
            java.lang.Object r0 = r2.get(r4)
            X.3kE r0 = (X.C249703kE) r0
            r0.clearOldPosition()
            int r4 = r4 + 1
            goto L_0x0244
        L_0x0252:
            r0 = 1
            r11.A18(r0)
            r11.A1A(r6)
            X.3AW r0 = r11.mState
            r0.A04 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A08():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.A0V != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.A0D.A1J() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A() {
        /*
            r4 = this;
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x001c
            X.3Ae r1 = r4.A07
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x001c
            X.3pI r0 = r4.A0D
            r0.A1C(r4)
        L_0x001c:
            X.3AS r0 = r4.A0C
            if (r0 == 0) goto L_0x0029
            X.3pI r0 = r4.A0D
            boolean r0 = r0.A1J()
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.3Ae r0 = r4.A07
            if (r1 == 0) goto L_0x0076
            r0.A07()
        L_0x0031:
            boolean r0 = r4.A0U
            r3 = 0
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.A0V
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.3AW r1 = r4.mState
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x0074
            X.3AS r0 = r4.A0C
            if (r0 == 0) goto L_0x0074
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x0052
            X.3pI r0 = r4.A0D
            boolean r0 = r0.A0F
        L_0x0050:
            if (r0 == 0) goto L_0x0074
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1.A0B = r0
            if (r0 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x006a
            X.3AS r0 = r4.A0C
            if (r0 == 0) goto L_0x006a
            X.3pI r0 = r4.A0D
            boolean r0 = r0.A1J()
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r1.A0A = r3
            return
        L_0x006d:
            X.2Rw r0 = r4.A0A
            boolean r0 = r0.hasStableIds()
            goto L_0x0050
        L_0x0074:
            r0 = 0
            goto L_0x0053
        L_0x0076:
            r0.A06()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0A():void");
    }

    private void A0B() {
        boolean z;
        VelocityTracker velocityTracker = this.A0m;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0q(0);
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A04.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A06;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A05;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public static void A0D(MotionEvent motionEvent, RecyclerView recyclerView, int i, int i2) {
        float y;
        float x;
        int i3 = i2;
        int i4 = i;
        RecyclerView recyclerView2 = recyclerView;
        C252553pI r5 = recyclerView.A0D;
        if (r5 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!recyclerView.A0W) {
            int[] iArr = recyclerView.A16;
            int i5 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean A1X = r5.A1X();
            boolean A1Y = recyclerView.A0D.A1Y();
            boolean z = A1X;
            if (A1Y) {
                z = A1X | true;
            }
            MotionEvent motionEvent2 = motionEvent;
            if (motionEvent == null) {
                y = ((float) recyclerView.getHeight()) / 2.0f;
                x = ((float) recyclerView.getWidth()) / 2.0f;
            } else {
                y = motionEvent.getY();
                x = motionEvent.getX();
            }
            int A012 = i - recyclerView.A01(i4, y);
            int A022 = i2 - recyclerView.A02(i3, x);
            recyclerView.A0v(z ? 1 : 0, 1);
            int i6 = 0;
            if (A1X) {
                i6 = A012;
            }
            int i7 = 0;
            if (A1Y) {
                i7 = A022;
            }
            if (recyclerView2.A1H(iArr, recyclerView2.A1B, i6, i7, 1)) {
                A012 -= iArr[0];
                A022 -= iArr[1];
            }
            int i8 = 0;
            if (A1X) {
                i8 = A012;
            }
            if (A1Y) {
                i5 = A022;
            }
            recyclerView2.A1G(motionEvent2, i8, i5, 1);
            C240673Lu r0 = recyclerView2.mGapWorker;
            if (!(r0 == null || (A012 == 0 && A022 == 0))) {
                r0.A01(recyclerView2, A012, A022);
            }
            recyclerView2.A0q(1);
        }
    }

    public static void A0J(2Rw r6, RecyclerView recyclerView, boolean z) {
        2Rw r1 = recyclerView.A0A;
        if (r1 != null) {
            r1.unregisterAdapterDataObserver(recyclerView.A18);
            recyclerView.A0A.onDetachedFromRecyclerView(recyclerView);
        }
        AnonymousClass3AS r0 = recyclerView.A0C;
        if (r0 != null) {
            r0.A0I();
        }
        C252553pI r02 = recyclerView.A0D;
        if (r02 != null) {
            AnonymousClass3AN r12 = recyclerView.A0y;
            r02.A0o(r12);
            recyclerView.A0D.A0p(r12);
        }
        AnonymousClass3AN r4 = recyclerView.A0y;
        r4.A06();
        AnonymousClass3Ae r13 = recyclerView.A07;
        r13.A09(r13.A04);
        r13.A09(r13.A05);
        r13.A00 = 0;
        2Rw r5 = recyclerView.A0A;
        recyclerView.A0A = r6;
        if (r6 != null) {
            r6.registerAdapterDataObserver(recyclerView.A18);
            r6.onAttachedToRecyclerView(recyclerView);
        }
        C252553pI r14 = recyclerView.A0D;
        if (r14 != null) {
            r14.A1Q(r5, recyclerView.A0A);
        }
        2Rw r3 = recyclerView.A0A;
        r4.A06();
        AnonymousClass3AN.A00(r5, r4, true);
        if (r4.A02 == null) {
            r4.A02 = new AnonymousClass3BD();
            AnonymousClass3AN.A01(r4);
        }
        AnonymousClass3BD r15 = r4.A02;
        if (r5 != null) {
            r15.A00--;
        }
        if (!z && r15.A00 == 0) {
            r15.A01();
        }
        if (r3 != null) {
            r15.A00++;
        }
        AnonymousClass3AN.A01(r4);
        recyclerView.mState.A0C = true;
    }

    public static void A0K(C249703kE r3) {
        WeakReference weakReference = r3.mNestedRecyclerView;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        r3.mNestedRecyclerView = null;
                        return;
                    } else if (view != r3.itemView) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0N(RecyclerView recyclerView, C249703kE r7) {
        View view = r7.itemView;
        boolean z = false;
        if (view.getParent() == recyclerView) {
            z = true;
        }
        recyclerView.A0y.A0D(recyclerView.A0Z(view));
        boolean isTmpDetached = r7.isTmpDetached();
        C238053Aj r2 = recyclerView.A08;
        if (isTmpDetached) {
            r2.A0B(view, view.getLayoutParams(), -1, true);
        } else if (!z) {
            r2.A0A(view, -1, true);
        } else {
            int indexOfChild = ((C238043Ah) r2.A03).A00.indexOfChild(view);
            if (indexOfChild >= 0) {
                r2.A02.A04(indexOfChild);
                C238053Aj.A01(view, r2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void A0O(int[] iArr) {
        int i;
        C238053Aj r8 = this.A08;
        int A032 = r8.A03();
        if (A032 == 0) {
            i = -1;
            iArr[0] = -1;
        } else {
            int i2 = Integer.MAX_VALUE;
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
            for (int i3 = 0; i3 < A032; i3++) {
                C249703kE A062 = A06(r8.A06(i3));
                if (!A062.shouldIgnore()) {
                    int layoutPosition = A062.getLayoutPosition();
                    if (layoutPosition < i2) {
                        i2 = layoutPosition;
                    }
                    if (layoutPosition > i) {
                        i = layoutPosition;
                    }
                }
            }
            iArr[0] = i2;
        }
        iArr[1] = i;
    }

    private 03N getScrollingChildHelper() {
        03N r0 = this.A0n;
        if (r0 != null) {
            return r0;
        }
        03N r02 = new 03N(this);
        this.A0n = r02;
        return r02;
    }

    public final int A0S(C249703kE r8) {
        if (!r8.hasAnyOfTheFlags(524) && r8.isBound()) {
            AnonymousClass3Ae r0 = this.A07;
            int i = r8.mPosition;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C241543Pp r6 = (C241543Pp) arrayList.get(i2);
                int i3 = r6.A00;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            if (r6.A02 == i) {
                                i = r6.A01;
                            } else {
                                if (r6.A02 < i) {
                                    i--;
                                }
                                if (r6.A01 <= i) {
                                    i++;
                                }
                            }
                        }
                    } else if (r6.A02 > i) {
                        continue;
                    } else if (r6.A02 + r6.A01 <= i) {
                        i -= r6.A01;
                    }
                } else if (r6.A02 <= i) {
                    i += r6.A01;
                }
            }
            return i;
        }
        return -1;
    }

    public final View A0U(float f, float f2) {
        C238053Aj r2 = this.A08;
        int A032 = r2.A03();
        while (true) {
            A032--;
            if (A032 < 0) {
                return null;
            }
            View A062 = r2.A06(A032);
            float translationX = A062.getTranslationX();
            float translationY = A062.getTranslationY();
            if (f >= ((float) A062.getLeft()) + translationX && f <= ((float) A062.getRight()) + translationX && f2 >= ((float) A062.getTop()) + translationY && f2 <= ((float) A062.getBottom()) + translationY) {
                return A062;
            }
        }
    }

    public final C249703kE A0W(int i) {
        C249703kE r1 = null;
        if (!this.A0P) {
            C238053Aj r5 = this.A08;
            int A042 = r5.A04();
            for (int i2 = 0; i2 < A042; i2++) {
                C249703kE A062 = A06(r5.A07(i2));
                if (A062 != null && !A062.isRemoved() && A0S(A062) == i) {
                    if (!r5.A04.contains(A062.itemView)) {
                        return A062;
                    }
                    r1 = A062;
                }
            }
        }
        return r1;
    }

    public final C249703kE A0X(int i, boolean z) {
        int layoutPosition;
        C238053Aj r5 = this.A08;
        int A042 = r5.A04();
        C249703kE r1 = null;
        for (int i2 = 0; i2 < A042; i2++) {
            C249703kE A062 = A06(r5.A07(i2));
            if (A062 != null && !A062.isRemoved()) {
                if (z) {
                    layoutPosition = A062.mPosition;
                } else {
                    layoutPosition = A062.getLayoutPosition();
                }
                if (layoutPosition == i) {
                    if (!r5.A04.contains(A062.itemView)) {
                        return A062;
                    }
                    r1 = A062;
                } else {
                    continue;
                }
            }
        }
        return r1;
    }

    public final String A0a() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.A0A);
        sb.append(", layout:");
        sb.append(this.A0D);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public final void A0b() {
        List list = this.A0M;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.3Ph, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c0, code lost:
        if (r5.A08.A04.contains(getFocusedChild()) == false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0403, code lost:
        if (r9 != null) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0458, code lost:
        r4 = r1.itemView;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0403 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d() {
        /*
            r20 = this;
            r5 = r20
            X.2Rw r0 = r5.A0A
            java.lang.String r7 = "RecyclerView"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r7, r0)
            return
        L_0x000e:
            X.3pI r0 = r5.A0D
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r7, r0)
            return
        L_0x0018:
            X.3AW r0 = r5.mState
            r4 = 0
            r0.A09 = r4
            boolean r0 = r5.A0r
            r3 = 1
            if (r0 == 0) goto L_0x023d
            int r1 = r5.A0h
            int r0 = r5.getWidth()
            if (r1 != r0) goto L_0x0032
            int r1 = r5.A0g
            int r0 = r5.getHeight()
            if (r1 == r0) goto L_0x023d
        L_0x0032:
            r2 = 1
        L_0x0033:
            r5.A0h = r4
            r5.A0g = r4
            r5.A0r = r4
            X.3AW r0 = r5.mState
            int r0 = r0.A04
            if (r0 != r3) goto L_0x01fa
            r5.A08()
        L_0x0042:
            X.3pI r3 = r5.A0D
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0d(r1, r0)
            r5.A09()
        L_0x005c:
            X.3AW r1 = r5.mState
            r0 = 4
            r1.A01(r0)
            r5.A0k()
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            r6 = 1
            r1.A04 = r6
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0326
            X.3Aj r0 = r5.A08
            r19 = r0
            int r3 = r19.A03()
            int r3 = r3 - r6
        L_0x007b:
            if (r3 < 0) goto L_0x0262
            r0 = r19
            android.view.View r0 = r0.A06(r3)
            X.3kE r11 = A06(r0)
            boolean r0 = r11.shouldIgnore()
            if (r0 != 0) goto L_0x00da
            X.2Rw r0 = r5.A0A
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x01f5
            long r1 = r11.mItemId
        L_0x0097:
            X.3Ph r15 = new X.3Ph
            r15.<init>()
            r15.A00(r11)
            X.3AO r14 = r5.A10
            X.01c r0 = r14.A00
            java.lang.Object r12 = r0.A05(r1)
            X.3kE r12 = (X.C249703kE) r12
            if (r12 == 0) goto L_0x00d7
            boolean r0 = r12.shouldIgnore()
            if (r0 != 0) goto L_0x00d7
            X.01r r13 = r14.A01
            java.lang.Object r0 = r13.get(r12)
            X.3MZ r0 = (X.AnonymousClass3MZ) r0
            r18 = 1
            if (r0 == 0) goto L_0x01f1
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01f1
        L_0x00c3:
            java.lang.Object r0 = r13.get(r11)
            X.3MZ r0 = (X.AnonymousClass3MZ) r0
            r17 = 1
            if (r0 == 0) goto L_0x01ed
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ed
        L_0x00d3:
            if (r18 == 0) goto L_0x00dd
            if (r12 != r11) goto L_0x00dd
        L_0x00d7:
            r14.A00(r15, r11)
        L_0x00da:
            int r3 = r3 + -1
            goto L_0x007b
        L_0x00dd:
            int r10 = r13.A03(r12)
            r9 = 0
            if (r10 < 0) goto L_0x018e
            java.lang.Object r8 = r13.A06(r10)
            X.3MZ r8 = (X.AnonymousClass3MZ) r8
            if (r8 == 0) goto L_0x018e
            int r0 = r8.A00
            r16 = r0 & 4
            if (r16 == 0) goto L_0x018e
            r16 = r0 & -5
            r0 = r16
            r8.A00 = r0
            X.3Ph r0 = r8.A02
            r16 = r16 & 12
            if (r16 != 0) goto L_0x010c
            r13.A04(r10)
            r8.A00 = r4
            r8.A02 = r9
            r8.A01 = r9
            X.02U r10 = X.AnonymousClass3MZ.A03
            r10.ECR(r8)
        L_0x010c:
            r14.A00(r15, r11)
            int r15 = r13.A03(r11)
            if (r15 < 0) goto L_0x013c
            java.lang.Object r14 = r13.A06(r15)
            X.3MZ r14 = (X.AnonymousClass3MZ) r14
            if (r14 == 0) goto L_0x013c
            int r10 = r14.A00
            r8 = r10 & 8
            if (r8 == 0) goto L_0x013c
            r8 = r10 & -9
            r14.A00 = r8
            X.3Ph r10 = r14.A01
            r8 = r8 & 12
            if (r8 != 0) goto L_0x013b
            r13.A04(r15)
            r14.A00 = r4
            r14.A02 = r9
            r14.A01 = r9
            X.02U r8 = X.AnonymousClass3MZ.A03
            r8.ECR(r14)
        L_0x013b:
            r9 = r10
        L_0x013c:
            if (r0 != 0) goto L_0x01b6
            int r14 = r19.A03()
            r13 = 0
        L_0x0143:
            if (r13 >= r14) goto L_0x0191
            r0 = r19
            android.view.View r0 = r0.A06(r13)
            X.3kE r10 = A06(r0)
            if (r10 == r11) goto L_0x018b
            X.2Rw r0 = r5.A0A
            boolean r15 = r0.hasStableIds()
            if (r15 == 0) goto L_0x0187
            long r8 = r10.mItemId
        L_0x015b:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x018b
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r15 == 0) goto L_0x0240
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r5.A0a()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0187:
            int r0 = r10.mPosition
            long r8 = (long) r0
            goto L_0x015b
        L_0x018b:
            int r13 = r13 + 1
            goto L_0x0143
        L_0x018e:
            r0 = r9
            goto L_0x010c
        L_0x0191:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " cannot be found but it is necessary for "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r5.A0a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r7, r0)
            goto L_0x00da
        L_0x01b6:
            r12.setIsRecyclable(r4)
            if (r18 == 0) goto L_0x01be
            A0N(r5, r12)
        L_0x01be:
            if (r12 == r11) goto L_0x01d4
            if (r17 == 0) goto L_0x01c5
            A0N(r5, r11)
        L_0x01c5:
            r12.mShadowedHolder = r11
            A0N(r5, r12)
            X.3AN r1 = r5.A0y
            r1.A0D(r12)
            r11.setIsRecyclable(r4)
            r11.mShadowingHolder = r12
        L_0x01d4:
            X.3AS r1 = r5.A0C
            boolean r0 = r1.A0G(r0, r9, r12, r11)
            if (r0 == 0) goto L_0x00da
            boolean r0 = r5.A0Y
            if (r0 != 0) goto L_0x00da
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x00da
            java.lang.Runnable r0 = r5.A0K
            r5.postOnAnimation(r0)
            r5.A0Y = r6
            goto L_0x00da
        L_0x01ed:
            r17 = 0
            goto L_0x00d3
        L_0x01f1:
            r18 = 0
            goto L_0x00c3
        L_0x01f5:
            int r0 = r11.mPosition
            long r1 = (long) r0
            goto L_0x0097
        L_0x01fa:
            X.3Ae r1 = r5.A07
            java.util.ArrayList r0 = r1.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x020e
            java.util.ArrayList r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x020e
            goto L_0x0042
        L_0x020e:
            if (r2 != 0) goto L_0x0042
            X.3pI r0 = r5.A0D
            int r1 = r0.A03
            int r0 = r5.getWidth()
            if (r1 != r0) goto L_0x0042
            X.3pI r0 = r5.A0D
            int r1 = r0.A00
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x0042
            X.3pI r3 = r5.A0D
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0d(r1, r0)
            goto L_0x005c
        L_0x023d:
            r2 = 0
            goto L_0x0033
        L_0x0240:
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r5.A0a()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0262:
            X.3AO r0 = r5.A10
            X.3Ab r8 = r5.A0z
            X.01r r7 = r0.A01
            int r3 = r7.size()
        L_0x026c:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0326
            java.lang.Object r10 = r7.A05(r3)
            X.3kE r10 = (X.C249703kE) r10
            java.lang.Object r2 = r7.A04(r3)
            X.3MZ r2 = (X.AnonymousClass3MZ) r2
            int r0 = r2.A00
            r1 = 3
            r0 = r0 & 3
            if (r0 == r1) goto L_0x0314
            int r0 = r2.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02c5
            X.3Ph r0 = r2.A02
            if (r0 == 0) goto L_0x0314
            X.3Ph r9 = r2.A02
            X.3Ph r1 = r2.A01
        L_0x0291:
            r0 = r8
            X.3Aa r0 = (X.C237983Aa) r0
            androidx.recyclerview.widget.RecyclerView r11 = r0.A00
            X.3AN r0 = r11.A0y
            r0.A0D(r10)
            A0N(r11, r10)
            r10.setIsRecyclable(r4)
            X.3AS r0 = r11.A0C
            boolean r0 = r0.A0F(r9, r1, r10)
        L_0x02a7:
            if (r0 == 0) goto L_0x02b8
            boolean r0 = r11.A0Y
            if (r0 != 0) goto L_0x02b8
            boolean r0 = r11.A0T
            if (r0 == 0) goto L_0x02b8
            java.lang.Runnable r0 = r11.A0K
            r11.postOnAnimation(r0)
            r11.A0Y = r6
        L_0x02b8:
            r2.A00 = r4
            r0 = 0
            r2.A02 = r0
            r2.A01 = r0
            X.02U r0 = X.AnonymousClass3MZ.A03
            r0.ECR(r2)
            goto L_0x026c
        L_0x02c5:
            int r0 = r2.A00
            r1 = 14
            r0 = r0 & 14
            if (r0 == r1) goto L_0x0301
            int r0 = r2.A00
            r1 = 12
            r0 = r0 & 12
            if (r0 != r1) goto L_0x02f1
            X.3Ph r12 = r2.A02
            X.3Ph r9 = r2.A01
            r0 = r8
            X.3Aa r0 = (X.C237983Aa) r0
            r10.setIsRecyclable(r4)
            androidx.recyclerview.widget.RecyclerView r11 = r0.A00
            boolean r1 = r11.A0P
            X.3AS r0 = r11.A0C
            if (r1 == 0) goto L_0x02ec
            boolean r0 = r0.A0G(r12, r9, r10, r10)
            goto L_0x02a7
        L_0x02ec:
            boolean r0 = r0.A0D(r12, r9, r10)
            goto L_0x02a7
        L_0x02f1:
            int r0 = r2.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x02fb
            X.3Ph r9 = r2.A02
            r1 = 0
            goto L_0x0291
        L_0x02fb:
            int r0 = r2.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x02b8
        L_0x0301:
            X.3Ph r9 = r2.A02
            X.3Ph r1 = r2.A01
            r0 = r8
            X.3Aa r0 = (X.C237983Aa) r0
            androidx.recyclerview.widget.RecyclerView r11 = r0.A00
            r10.setIsRecyclable(r4)
            X.3AS r0 = r11.A0C
            boolean r0 = r0.A0E(r9, r1, r10)
            goto L_0x02a7
        L_0x0314:
            r0 = r8
            X.3Aa r0 = (X.C237983Aa) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.3pI r9 = r0.A0D
            android.view.View r1 = r10.itemView
            X.3AN r0 = r0.A0y
            r9.A0g(r1)
            r0.A0A(r1)
            goto L_0x02b8
        L_0x0326:
            X.3pI r0 = r5.A0D
            X.3AN r2 = r5.A0y
            r0.A0p(r2)
            X.3AW r1 = r5.mState
            int r0 = r1.A03
            r1.A05 = r0
            r5.A0P = r4
            r5.A0Q = r4
            r1.A0B = r4
            r1.A0A = r4
            X.3pI r1 = r5.A0D
            r1.A0F = r4
            java.util.ArrayList r0 = r2.A04
            if (r0 == 0) goto L_0x0346
            r0.clear()
        L_0x0346:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0351
            r1.A02 = r4
            r1.A0E = r4
            r2.A08()
        L_0x0351:
            X.3pI r1 = r5.A0D
            X.3AW r0 = r5.mState
            r1.A1S(r0)
            r5.A18(r6)
            r5.A1A(r4)
            X.3AO r1 = r5.A10
            X.01r r0 = r1.A01
            r0.clear()
            X.01c r0 = r1.A00
            r0.A07()
            int[] r3 = r5.A15
            r2 = r3[r4]
            r1 = r3[r6]
            r5.A0O(r3)
            r0 = r3[r4]
            if (r0 != r2) goto L_0x037b
            r0 = r3[r6]
            if (r0 == r1) goto L_0x037e
        L_0x037b:
            r5.A0t(r4, r4)
        L_0x037e:
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x03a2
            X.2Rw r0 = r5.A0A
            if (r0 == 0) goto L_0x03a2
            boolean r0 = r5.hasFocus()
            if (r0 == 0) goto L_0x03a2
            int r1 = r5.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r0) goto L_0x03a2
            int r1 = r5.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r0) goto L_0x03ae
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x03ae
        L_0x03a2:
            X.3AW r2 = r5.mState
            r0 = -1
            r2.A07 = r0
            r0 = -1
            r2.A01 = r0
            r2.A02 = r0
            return
        L_0x03ae:
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L_0x03c3
            android.view.View r1 = r5.getFocusedChild()
            X.3Aj r0 = r5.A08
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x03c3
            goto L_0x03a2
        L_0x03c3:
            X.3AW r0 = r5.mState
            long r2 = r0.A07
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x041a
            X.2Rw r0 = r5.A0A
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x041a
            r9 = 0
            X.3Aj r10 = r5.A08
            int r11 = r10.A04()
            r8 = 0
        L_0x03dd:
            if (r8 >= r11) goto L_0x0403
            android.view.View r0 = r10.A07(r8)
            X.3kE r4 = A06(r0)
            if (r4 == 0) goto L_0x0400
            boolean r0 = r4.isRemoved()
            if (r0 != 0) goto L_0x0400
            long r6 = r4.mItemId
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0400
            android.view.View r1 = r4.itemView
            java.util.List r0 = r10.A04
            boolean r0 = r0.contains(r1)
            r9 = r4
            if (r0 == 0) goto L_0x0405
        L_0x0400:
            int r8 = r8 + 1
            goto L_0x03dd
        L_0x0403:
            if (r9 == 0) goto L_0x041a
        L_0x0405:
            android.view.View r1 = r9.itemView
            java.util.List r0 = r10.A04
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x041a
            android.view.View r0 = r9.itemView
            boolean r0 = r0.hasFocusable()
            if (r0 == 0) goto L_0x041a
            android.view.View r4 = r9.itemView
            goto L_0x045a
        L_0x041a:
            X.3Aj r0 = r5.A08
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x03a2
            X.3AW r1 = r5.mState
            int r4 = r1.A01
            r0 = -1
            if (r4 != r0) goto L_0x042a
            r4 = 0
        L_0x042a:
            int r3 = r1.A00()
            r2 = r4
        L_0x042f:
            if (r2 >= r3) goto L_0x0442
            X.3kE r1 = r5.A0W(r2)
            if (r1 == 0) goto L_0x0442
            android.view.View r0 = r1.itemView
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0458
            int r2 = r2 + 1
            goto L_0x042f
        L_0x0442:
            int r2 = java.lang.Math.min(r3, r4)
        L_0x0446:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x03a2
            X.3kE r1 = r5.A0W(r2)
            if (r1 == 0) goto L_0x03a2
            android.view.View r0 = r1.itemView
            boolean r0 = r0.hasFocusable()
            if (r0 == 0) goto L_0x0446
        L_0x0458:
            android.view.View r4 = r1.itemView
        L_0x045a:
            if (r4 == 0) goto L_0x03a2
            X.3AW r0 = r5.mState
            int r3 = r0.A02
            long r1 = (long) r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0472
            android.view.View r1 = r4.findViewById(r3)
            if (r1 == 0) goto L_0x0472
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto L_0x0472
            r4 = r1
        L_0x0472:
            r4.requestFocus()
            goto L_0x03a2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0d():void");
    }

    public final void A0e() {
        int measuredHeight;
        if (this.A03 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A03 = edgeEffect;
            boolean z = this.A0O;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public final void A0f() {
        int measuredWidth;
        if (this.A04 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A04 = edgeEffect;
            boolean z = this.A0O;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public final void A0g() {
        int measuredWidth;
        if (this.A05 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A05 = edgeEffect;
            boolean z = this.A0O;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public final void A0h() {
        int measuredHeight;
        if (this.A06 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A06 = edgeEffect;
            boolean z = this.A0O;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public final void A0i() {
        if (this.A12.size() != 0) {
            C252553pI r1 = this.A0D;
            if (r1 != null) {
                r1.A1G("Cannot invalidate item decorations during a scroll or layout");
            }
            A0j();
            requestLayout();
        }
    }

    public final void A0j() {
        C238053Aj r4 = this.A08;
        int A042 = r4.A04();
        for (int i = 0; i < A042; i++) {
            ((AnonymousClass3MX) r4.A07(i).getLayoutParams()).A00 = true;
        }
        ArrayList arrayList = this.A0y.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass3MX r1 = (AnonymousClass3MX) ((C249703kE) arrayList.get(i2)).itemView.getLayoutParams();
            if (r1 != null) {
                r1.A00 = true;
            }
        }
    }

    public final void A0k() {
        int i = this.A0f + 1;
        this.A0f = i;
        if (i == 1 && !this.A0W) {
            this.A0X = false;
        }
    }

    public final void A0m(int i) {
        if (this.A0D != null) {
            setScrollState(2);
            this.A0D.A1O(i);
            awakenScrollBars();
        }
    }

    public final void A0n(int i) {
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        if (i < size) {
            int size2 = arrayList.size();
            if (i < size2) {
                A12((AnonymousClass3B3) arrayList.get(i));
                return;
            }
            throw new IndexOutOfBoundsException(002.A0P(" is an invalid index for size ", i, size2));
        }
        throw new IndexOutOfBoundsException(002.A0P(" is an invalid index for size ", i, size));
    }

    public final void A0o(int i) {
        if (!this.A0W) {
            A0l();
            C252553pI r0 = this.A0D;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A1O(i);
            awakenScrollBars();
        }
    }

    public final void A0p(int i) {
        if (!this.A0W) {
            C252553pI r1 = this.A0D;
            if (r1 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                r1.A1T(this.mState, this, i);
            }
        }
    }

    public final void A0r(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A04.onRelease();
            z = this.A04.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A05;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A05.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A06;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A06.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A03.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void A0t(int i, int i2) {
        this.A0c++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        C249403jg r0 = this.A0G;
        if (r0 != null) {
            r0.onScrolled(this, i, i2);
        }
        List list = this.A0M;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C249403jg) this.A0M.get(size)).onScrolled(this, i, i2);
            }
        }
        this.A0c--;
    }

    public final void A0w(int i, int i2, boolean z) {
        int i3 = i + i2;
        C238053Aj r7 = this.A08;
        int A042 = r7.A04();
        for (int i4 = 0; i4 < A042; i4++) {
            C249703kE A062 = A06(r7.A07(i4));
            if (A062 != null && !A062.shouldIgnore()) {
                int i5 = A062.mPosition;
                if (i5 >= i3) {
                    A062.offsetPosition(-i2, z);
                } else if (i5 >= i) {
                    A062.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                }
                this.mState.A0C = true;
            }
        }
        AnonymousClass3AN r4 = this.A0y;
        ArrayList arrayList = r4.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C249703kE r1 = (C249703kE) arrayList.get(size);
                if (r1 != null) {
                    if (r1.mPosition >= i3) {
                        r1.offsetPosition(-i2, z);
                    } else if (r1.mPosition >= i) {
                        r1.addFlags(8);
                        r4.A09(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void A0z(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        C252553pI r1 = this.A0D;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0W) {
            int i4 = 0;
            if (!r1.A1X()) {
                i = 0;
            }
            if (!this.A0D.A1Y()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        A0v(i4, 1);
                    }
                    this.mViewFlinger.A02(interpolator, i, i2, i3);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public final void A11(AnonymousClass3B3 r3) {
        C252553pI r1 = this.A0D;
        if (r1 != null) {
            r1.A1G("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0j();
        requestLayout();
    }

    public final void A12(AnonymousClass3B3 r4) {
        C252553pI r1 = this.A0D;
        if (r1 != null) {
            r1.A1G("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        arrayList.remove(r4);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0j();
        requestLayout();
    }

    public final void A13(C331097Pn r2) {
        this.A19.add(r2);
    }

    public final void A14(C331097Pn r2) {
        this.A19.remove(r2);
        if (this.A0F == r2) {
            this.A0F = null;
        }
    }

    public void A15(C249403jg r2) {
        List list = this.A0M;
        if (list == null) {
            list = new ArrayList();
            this.A0M = list;
        }
        list.add(r2);
    }

    public void A16(C249403jg r2) {
        List list = this.A0M;
        if (list != null) {
            list.remove(r2);
        }
    }

    public final void A17(String str) {
        if (this.A01 > 0) {
            if (str == null) {
                throw new IllegalStateException(002.A0R("Cannot call this method while RecyclerView is computing a layout or scrolling", A0a()));
            }
            throw new IllegalStateException(str);
        } else if (this.A0c > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(002.A0R("", A0a())));
        }
    }

    public final void A18(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A01 - 1;
        this.A01 = i2;
        if (i2 >= 1) {
            return;
        }
        if (!A1C || i2 >= 0) {
            this.A01 = 0;
            if (z) {
                int i3 = this.A00;
                this.A00 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.A0x) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(C249703kE.FLAG_MOVED);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A13;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C249703kE r3 = (C249703kE) list.get(size);
                        if (r3.itemView.getParent() == this && !r3.shouldIgnore() && (i = r3.mPendingAccessibilityState) != -1) {
                            r3.itemView.setImportantForAccessibility(i);
                            r3.mPendingAccessibilityState = -1;
                        }
                    } else {
                        list.clear();
                        return;
                    }
                }
            }
        } else {
            throw new IllegalStateException(002.A0R("layout or scroll counter cannot go below zero.Some calls are not matching", A0a()));
        }
    }

    public final void A19(boolean z) {
        this.A0Q = z | this.A0Q;
        this.A0P = true;
        C238053Aj r4 = this.A08;
        int A042 = r4.A04();
        for (int i = 0; i < A042; i++) {
            C249703kE A062 = A06(r4.A07(i));
            if (A062 != null && !A062.shouldIgnore()) {
                A062.addFlags(6);
            }
        }
        A0j();
        AnonymousClass3AN r5 = this.A0y;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C249703kE r1 = (C249703kE) arrayList.get(i2);
            if (r1 != null) {
                r1.addFlags(6);
                r1.addChangePayload((Object) null);
            }
        }
        2Rw r0 = r5.A08.A0A;
        if (r0 == null || !r0.hasStableIds()) {
            r5.A07();
        }
    }

    public final void A1A(boolean z) {
        int i = this.A0f;
        if (i < 1) {
            if (!A1C) {
                this.A0f = 1;
                i = 1;
            } else {
                throw new IllegalStateException(002.A0R("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.", A0a()));
            }
        }
        if (!z && !this.A0W) {
            this.A0X = false;
        }
        if (i == 1) {
            if (z && this.A0X && !this.A0W && this.A0D != null && this.A0A != null) {
                A0d();
            }
            if (!this.A0W) {
                this.A0X = false;
            }
        }
        this.A0f--;
    }

    public final boolean A1D() {
        if (!this.A0R || this.A0P || this.A07.A04.size() > 0) {
            return true;
        }
        return false;
    }

    public final boolean A1E() {
        if (this.A01 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        if (r7 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1F(int r10, int r11) {
        /*
            r9 = this;
            X.3pI r1 = r9.A0D
            r8 = 0
            if (r1 != 0) goto L_0x000d
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r0)
        L_0x000c:
            return r8
        L_0x000d:
            boolean r0 = r9.A0W
            if (r0 != 0) goto L_0x000c
            boolean r6 = r1.A1X()
            X.3pI r0 = r9.A0D
            boolean r7 = r0.A1Y()
            if (r6 == 0) goto L_0x0025
            int r1 = java.lang.Math.abs(r10)
            int r0 = r9.A0t
            if (r1 >= r0) goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            if (r7 == 0) goto L_0x0030
            int r1 = java.lang.Math.abs(r11)
            int r0 = r9.A0t
            if (r1 >= r0) goto L_0x0031
        L_0x0030:
            r11 = 0
        L_0x0031:
            if (r10 != 0) goto L_0x0036
            if (r11 != 0) goto L_0x0036
            return r8
        L_0x0036:
            r3 = 0
            if (r10 == 0) goto L_0x00e3
            android.widget.EdgeEffect r0 = r9.A04
            if (r0 == 0) goto L_0x00c4
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            android.widget.EdgeEffect r2 = r9.A04
            int r1 = -r10
            int r0 = r9.getWidth()
            boolean r0 = r9.A0Q(r2, r1, r0)
            if (r0 == 0) goto L_0x0058
            android.widget.EdgeEffect r0 = r9.A04
            r0.onAbsorb(r1)
        L_0x0057:
            r10 = 0
        L_0x0058:
            r2 = r10
            r10 = 0
        L_0x005a:
            if (r11 == 0) goto L_0x00c1
            android.widget.EdgeEffect r0 = r9.A06
            if (r0 == 0) goto L_0x00a3
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            android.widget.EdgeEffect r3 = r9.A06
            int r1 = -r11
            int r0 = r9.getHeight()
            boolean r0 = r9.A0Q(r3, r1, r0)
            if (r0 == 0) goto L_0x007b
            android.widget.EdgeEffect r0 = r9.A06
            r0.onAbsorb(r1)
        L_0x007a:
            r11 = 0
        L_0x007b:
            r5 = 0
        L_0x007c:
            if (r2 != 0) goto L_0x0080
            if (r11 == 0) goto L_0x0098
        L_0x0080:
            int r3 = r9.A17
            int r1 = -r3
            int r0 = java.lang.Math.min(r2, r3)
            int r2 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r11, r3)
            int r11 = java.lang.Math.max(r1, r0)
            X.3AT r0 = r9.mViewFlinger
            r0.A01(r2, r11)
        L_0x0098:
            r4 = 1
            if (r10 != 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00e6
            if (r2 != 0) goto L_0x00a1
            if (r11 == 0) goto L_0x000c
        L_0x00a1:
            r8 = 1
            return r8
        L_0x00a3:
            android.widget.EdgeEffect r0 = r9.A03
            if (r0 == 0) goto L_0x00c1
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            android.widget.EdgeEffect r1 = r9.A03
            int r0 = r9.getHeight()
            boolean r0 = r9.A0Q(r1, r11, r0)
            if (r0 == 0) goto L_0x007b
            android.widget.EdgeEffect r0 = r9.A03
            r0.onAbsorb(r11)
            goto L_0x007a
        L_0x00c1:
            r5 = r11
            r11 = 0
            goto L_0x007c
        L_0x00c4:
            android.widget.EdgeEffect r0 = r9.A05
            if (r0 == 0) goto L_0x00e3
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            android.widget.EdgeEffect r1 = r9.A05
            int r0 = r9.getWidth()
            boolean r0 = r9.A0Q(r1, r10, r0)
            if (r0 == 0) goto L_0x0058
            android.widget.EdgeEffect r0 = r9.A05
            r0.onAbsorb(r10)
            goto L_0x0057
        L_0x00e3:
            r2 = 0
            goto L_0x005a
        L_0x00e6:
            float r3 = (float) r10
            float r2 = (float) r5
            X.03N r0 = r9.getScrollingChildHelper()
            boolean r0 = r0.A03(r3, r2)
            if (r0 != 0) goto L_0x000c
            if (r6 != 0) goto L_0x00f7
            r1 = 0
            if (r7 == 0) goto L_0x00f8
        L_0x00f7:
            r1 = 1
        L_0x00f8:
            r9.dispatchNestedFling(r3, r2, r1)
            X.2lg r0 = r9.A0E
            if (r0 == 0) goto L_0x0106
            boolean r0 = r0.A01(r10, r5)
            if (r0 == 0) goto L_0x0106
            return r4
        L_0x0106:
            if (r1 == 0) goto L_0x000c
            if (r7 == 0) goto L_0x010c
            r6 = r6 | 2
        L_0x010c:
            r9.A0v(r6, r4)
            int r3 = r9.A17
            int r1 = -r3
            int r0 = java.lang.Math.min(r10, r3)
            int r2 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r5, r3)
            int r1 = java.lang.Math.max(r1, r0)
            X.3AT r0 = r9.mViewFlinger
            r0.A01(r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1F(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r5 == 0.0f) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r0 != 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1G(android.view.MotionEvent r24, int r25, int r26, int r27) {
        /*
            r23 = this;
            r15 = r23
            r15.A0c()
            X.2Rw r0 = r15.A0A
            r14 = 1
            r10 = 0
            r4 = r25
            r3 = r26
            if (r0 == 0) goto L_0x0118
            int[] r0 = r15.A16
            r0[r10] = r10
            r0[r14] = r10
            r15.A0x(r4, r0, r3)
            r2 = r0[r10]
            r1 = r0[r14]
            int r7 = r25 - r2
            int r9 = r26 - r1
        L_0x0020:
            java.util.ArrayList r0 = r15.A12
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002b
            r15.invalidate()
        L_0x002b:
            int[] r0 = r15.A16
            r0[r10] = r10
            r0[r14] = r10
            int[] r6 = r15.A1B
            r22 = r27
            r20 = r7
            r21 = r9
            r18 = r2
            r19 = r1
            r16 = r6
            r17 = r0
            r15.A1B(r16, r17, r18, r19, r20, r21, r22)
            r5 = r0[r10]
            int r7 = r7 - r5
            r0 = r0[r14]
            int r9 = r9 - r0
            if (r5 != 0) goto L_0x004f
            r13 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r13 = 1
        L_0x0050:
            int r0 = r15.A0i
            r8 = r6[r10]
            int r0 = r0 - r8
            r15.A0i = r0
            int r0 = r15.A0j
            r6 = r6[r14]
            int r0 = r0 - r6
            r15.A0j = r0
            int[] r5 = r15.A1A
            r0 = r5[r10]
            int r0 = r0 + r8
            r5[r10] = r0
            r0 = r5[r14]
            int r0 = r0 + r6
            r5[r14] = r0
            int r5 = r15.getOverScrollMode()
            r0 = 2
            if (r5 == r0) goto L_0x00c4
            if (r24 == 0) goto L_0x00c1
            r5 = 8194(0x2002, float:1.1482E-41)
            int r0 = r24.getSource()
            r0 = r0 & r5
            if (r0 == r5) goto L_0x00c1
            float r6 = r24.getX()
            float r7 = (float) r7
            float r8 = r24.getY()
            float r5 = (float) r9
            r12 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            r15.A0f()
            android.widget.EdgeEffect r9 = r15.A04
            float r10 = -r7
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r10 = r10 / r0
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            float r8 = r12 - r8
        L_0x00a1:
            X.XD6.A01(r9, r10, r8)
            r8 = 1
        L_0x00a5:
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
            r15.A0h()
            android.widget.EdgeEffect r7 = r15.A06
            float r5 = -r5
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
        L_0x00bb:
            X.XD6.A01(r7, r5, r6)
        L_0x00be:
            r15.postInvalidateOnAnimation()
        L_0x00c1:
            r15.A0r(r4, r3)
        L_0x00c4:
            if (r2 != 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00cb
        L_0x00c8:
            r15.A0t(r2, r1)
        L_0x00cb:
            boolean r0 = r15.awakenScrollBars()
            if (r0 != 0) goto L_0x00d4
            r15.invalidate()
        L_0x00d4:
            if (r13 != 0) goto L_0x00db
            if (r2 != 0) goto L_0x00db
            if (r1 != 0) goto L_0x00db
            r14 = 0
        L_0x00db:
            return r14
        L_0x00dc:
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            r15.A0e()
            android.widget.EdgeEffect r7 = r15.A03
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r6 = r12 - r6
            goto L_0x00bb
        L_0x00f4:
            if (r8 != 0) goto L_0x00be
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            goto L_0x00be
        L_0x00ff:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            r15.A0g()
            android.widget.EdgeEffect r9 = r15.A05
            int r0 = r15.getWidth()
            float r0 = (float) r0
            float r10 = r7 / r0
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            goto L_0x00a1
        L_0x0116:
            r8 = 0
            goto L_0x00a5
        L_0x0118:
            r1 = 0
            r2 = 0
            r7 = 0
            r9 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1G(android.view.MotionEvent, int, int, int):boolean");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof AnonymousClass3MX) || !this.A0D.A1Z((AnonymousClass3MX) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1X()) {
            return 0;
        }
        return this.A0D.A11(this.mState);
    }

    public final int computeHorizontalScrollOffset() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1X()) {
            return 0;
        }
        return this.A0D.A12(this.mState);
    }

    public final int computeHorizontalScrollRange() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1X()) {
            return 0;
        }
        return this.A0D.A13(this.mState);
    }

    public final int computeVerticalScrollExtent() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1Y()) {
            return 0;
        }
        return this.A0D.A14(this.mState);
    }

    public final int computeVerticalScrollOffset() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1Y()) {
            return 0;
        }
        return this.A0D.A15(this.mState);
    }

    public final int computeVerticalScrollRange() {
        C252553pI r0 = this.A0D;
        if (r0 == null || !r0.A1Y()) {
            return 0;
        }
        return this.A0D.A16(this.mState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0142, code lost:
        if (r3 <= r2) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (A0V(r12) == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        A0k();
        r11.A0D.A1E(r12, r11.A0y, r11.mState, r13);
        A1A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r5 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r11.A0W != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            r11 = this;
            X.3pI r0 = r11.A0D
            android.view.View r5 = r0.A0Y(r12, r13)
            if (r5 != 0) goto L_0x016e
            X.2Rw r0 = r11.A0A
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            X.3pI r0 = r11.A0D
            if (r0 == 0) goto L_0x001b
            int r0 = r11.A01
            if (r0 > 0) goto L_0x001b
            boolean r0 = r11.A0W
            r1 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r1 == 0) goto L_0x0091
            r3 = 2
            if (r13 == r3) goto L_0x0028
            if (r13 != r6) goto L_0x0091
        L_0x0028:
            X.3pI r0 = r11.A0D
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L_0x006b
            r0 = 33
            if (r13 != r3) goto L_0x0036
            r0 = 130(0x82, float:1.82E-43)
        L_0x0036:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x006b
        L_0x003c:
            r11.A0c()
            android.view.View r0 = r11.A0V(r12)
            if (r0 == 0) goto L_0x0169
            r11.A0k()
            X.3pI r3 = r11.A0D
            X.3AN r1 = r11.A0y
            X.3AW r0 = r11.mState
            r3.A1E(r12, r1, r0, r13)
            r11.A1A(r2)
        L_0x0054:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
        L_0x0058:
            if (r5 == 0) goto L_0x016a
        L_0x005a:
            boolean r0 = r5.hasFocusable()
            if (r0 != 0) goto L_0x00b7
            android.view.View r0 = r11.getFocusedChild()
            if (r0 != 0) goto L_0x00b3
            android.view.View r12 = super.focusSearch(r12, r13)
            return r12
        L_0x006b:
            X.3pI r0 = r11.A0D
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x0054
            X.3pI r0 = r11.A0D
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = r0.getLayoutDirection()
            r1 = 0
            if (r0 != r6) goto L_0x007f
            r1 = 1
        L_0x007f:
            r0 = 0
            if (r13 != r3) goto L_0x0083
            r0 = 1
        L_0x0083:
            r1 = r1 ^ r0
            r0 = 17
            if (r1 == 0) goto L_0x008a
            r0 = 66
        L_0x008a:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x0054
            goto L_0x003c
        L_0x0091:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
            if (r5 != 0) goto L_0x005a
            if (r1 == 0) goto L_0x016a
            r11.A0c()
            android.view.View r0 = r11.A0V(r12)
            if (r0 == 0) goto L_0x0169
            r11.A0k()
            X.3pI r3 = r11.A0D
            X.3AN r1 = r11.A0y
            X.3AW r0 = r11.mState
            android.view.View r5 = r3.A1E(r12, r1, r0, r13)
            r11.A1A(r2)
            goto L_0x0058
        L_0x00b3:
            r11.A0F(r5, r4)
            return r12
        L_0x00b7:
            if (r5 == r11) goto L_0x016a
            if (r5 == r12) goto L_0x016a
            android.view.View r0 = r11.A0V(r5)
            if (r0 == 0) goto L_0x016a
            if (r12 == 0) goto L_0x016e
            android.view.View r0 = r11.A0V(r12)
            if (r0 == 0) goto L_0x016e
            android.graphics.Rect r8 = r11.A0u
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r8.set(r2, r2, r1, r0)
            android.graphics.Rect r7 = r11.A0v
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r7.set(r2, r2, r1, r0)
            r11.offsetDescendantRectToMyCoords(r12, r8)
            r11.offsetDescendantRectToMyCoords(r5, r7)
            X.3pI r0 = r11.A0D
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = r0.getLayoutDirection()
            r10 = -1
            r9 = 1
            if (r0 != r6) goto L_0x00f6
            r9 = -1
        L_0x00f6:
            int r3 = r8.left
            int r2 = r7.left
            if (r3 < r2) goto L_0x0100
            int r1 = r8.right
            if (r1 > r2) goto L_0x013b
        L_0x0100:
            int r1 = r8.right
            int r0 = r7.right
            if (r1 >= r0) goto L_0x013b
            r4 = 1
        L_0x0107:
            int r3 = r8.top
            int r2 = r7.top
            if (r3 < r2) goto L_0x0111
            int r1 = r8.bottom
            if (r1 > r2) goto L_0x0130
        L_0x0111:
            int r1 = r8.bottom
            int r0 = r7.bottom
            if (r1 >= r0) goto L_0x0130
            r10 = 1
        L_0x0118:
            if (r13 == r6) goto L_0x0161
            r0 = 2
            if (r13 == r0) goto L_0x0159
            r0 = 17
            if (r13 == r0) goto L_0x0166
            r0 = 33
            if (r13 == r0) goto L_0x0156
            r0 = 66
            if (r13 == r0) goto L_0x015e
            r0 = 130(0x82, float:1.82E-43)
            if (r13 != r0) goto L_0x0146
            if (r10 <= 0) goto L_0x016a
            return r5
        L_0x0130:
            int r0 = r7.bottom
            if (r1 > r0) goto L_0x0136
            if (r3 < r0) goto L_0x0139
        L_0x0136:
            if (r3 <= r2) goto L_0x0139
            goto L_0x0118
        L_0x0139:
            r10 = 0
            goto L_0x0118
        L_0x013b:
            int r0 = r7.right
            if (r1 > r0) goto L_0x0141
            if (r3 < r0) goto L_0x0144
        L_0x0141:
            r4 = -1
            if (r3 > r2) goto L_0x0107
        L_0x0144:
            r4 = 0
            goto L_0x0107
        L_0x0146:
            java.lang.String r1 = "Invalid direction: "
            java.lang.String r0 = r11.A0a()
            java.lang.String r1 = X.002.A0c(r1, r0, r13)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            if (r10 >= 0) goto L_0x016a
            return r5
        L_0x0159:
            if (r10 > 0) goto L_0x016e
            if (r10 != 0) goto L_0x016a
            int r4 = r4 * r9
        L_0x015e:
            if (r4 <= 0) goto L_0x016a
            return r5
        L_0x0161:
            if (r10 < 0) goto L_0x016e
            if (r10 != 0) goto L_0x016a
            int r4 = r4 * r9
        L_0x0166:
            if (r4 >= 0) goto L_0x016a
            return r5
        L_0x0169:
            return r4
        L_0x016a:
            android.view.View r5 = super.focusSearch(r12, r13)
        L_0x016e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C252553pI r0 = this.A0D;
        if (r0 != null) {
            return r0.A0Z();
        }
        throw new IllegalStateException(002.A0R("RecyclerView has no LayoutManager", A0a()));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C252553pI r1 = this.A0D;
        if (r1 != null) {
            return r1.A1N(getContext(), attributeSet);
        }
        throw new IllegalStateException(002.A0R("RecyclerView has no LayoutManager", A0a()));
    }

    public 2Rw getAdapter() {
        return this.A0A;
    }

    public int getBaseline() {
        if (this.A0D != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final int getChildDrawingOrder(int i, int i2) {
        C331087Pm r0 = this.A0o;
        if (r0 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return r0.DHw(i, i2);
    }

    public boolean getClipToPadding() {
        return this.A0O;
    }

    public C238073Al getCompatAccessibilityDelegate() {
        return this.A0J;
    }

    public AnonymousClass3AL getEdgeEffectFactory() {
        return this.A0B;
    }

    public AnonymousClass3AS getItemAnimator() {
        return this.A0C;
    }

    public int getItemDecorationCount() {
        return this.A12.size();
    }

    public C252553pI getLayoutManager() {
        return this.A0D;
    }

    public int getMaxFlingVelocity() {
        return this.A17;
    }

    public int getMinFlingVelocity() {
        return this.A0t;
    }

    public C228442lg getOnFlingListener() {
        return this.A0E;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0Z;
    }

    public AnonymousClass3BD getRecycledViewPool() {
        AnonymousClass3AN r1 = this.A0y;
        if (r1.A02 == null) {
            r1.A02 = new AnonymousClass3BD();
            AnonymousClass3AN.A01(r1);
        }
        return r1.A02;
    }

    public int getScrollState() {
        return this.A02;
    }

    public final boolean isAttachedToWindow() {
        return this.A0T;
    }

    public final boolean isLayoutSuppressed() {
        return this.A0W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r2 == 0.0f) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r1 != 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        A0D(r6, r5, (int) (r1 * r5.A0a), (int) (r2 * r5.A0b));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.3pI r0 = r5.A0D
            r4 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x004a
            int r1 = r6.getAction()
            r0 = 8
            if (r1 != r0) goto L_0x004a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r3 = 0
            if (r0 == 0) goto L_0x004d
            X.3pI r0 = r5.A0D
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L_0x004b
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r2 = -r0
        L_0x0029:
            X.3pI r0 = r5.A0D
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x0065
            r0 = 10
            float r1 = r6.getAxisValue(r0)
        L_0x0037:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
        L_0x003f:
            float r0 = r5.A0a
            float r1 = r1 * r0
            int r1 = (int) r1
            float r0 = r5.A0b
            float r2 = r2 * r0
            int r0 = (int) r2
            A0D(r6, r5, r1, r0)
        L_0x004a:
            return r4
        L_0x004b:
            r2 = 0
            goto L_0x0029
        L_0x004d:
            int r1 = r6.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004a
            r0 = 26
            float r1 = r6.getAxisValue(r0)
            X.3pI r0 = r5.A0D
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L_0x0067
            float r2 = -r1
        L_0x0065:
            r1 = 0
            goto L_0x0037
        L_0x0067:
            X.3pI r0 = r5.A0D
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x004a
            r2 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r2 != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        if (r11.A02 != 2) goto L_0x018d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0W
            r5 = 0
            if (r0 != 0) goto L_0x01a6
            r0 = 0
            r11.A0F = r0
            boolean r0 = r11.A0P(r12)
            r4 = 1
            if (r0 == 0) goto L_0x0016
            r11.A0B()
            r11.setScrollState(r5)
            return r4
        L_0x0016:
            X.3pI r0 = r11.A0D
            if (r0 == 0) goto L_0x01a6
            boolean r3 = r0.A1X()
            X.3pI r0 = r11.A0D
            boolean r10 = r0.A1Y()
            android.view.VelocityTracker r0 = r11.A0m
            if (r0 != 0) goto L_0x002e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.A0m = r0
        L_0x002e:
            r0.addMovement(r12)
            int r7 = r12.getActionMasked()
            int r1 = r12.getActionIndex()
            r2 = 2
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x00d2
            if (r7 == r4) goto L_0x00c8
            if (r7 == r2) goto L_0x0076
            r0 = 3
            if (r7 == r0) goto L_0x006f
            r0 = 5
            if (r7 == r0) goto L_0x0054
            r0 = 6
            if (r7 != r0) goto L_0x004e
            r11.A0C(r12)
        L_0x004e:
            int r0 = r11.A02
            if (r0 != r4) goto L_0x01a6
            r5 = 1
            return r5
        L_0x0054:
            int r0 = r12.getPointerId(r1)
            r11.A0k = r0
            float r0 = r12.getX(r1)
            float r0 = r0 + r6
            int r0 = (int) r0
            r11.A0i = r0
            r11.A0d = r0
            float r0 = r12.getY(r1)
            float r0 = r0 + r6
            int r0 = (int) r0
            r11.A0j = r0
            r11.A0e = r0
            goto L_0x004e
        L_0x006f:
            r11.A0B()
            r11.setScrollState(r5)
            goto L_0x004e
        L_0x0076:
            int r0 = r11.A0k
            int r1 = r12.findPointerIndex(r0)
            if (r1 >= 0) goto L_0x008e
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            int r1 = r11.A0k
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            java.lang.String r1 = X.002.A0c(r2, r0, r1)
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r5
        L_0x008e:
            float r0 = r12.getX(r1)
            float r0 = r0 + r6
            int r2 = (int) r0
            float r0 = r12.getY(r1)
            float r0 = r0 + r6
            int r7 = (int) r0
            int r0 = r11.A02
            if (r0 == r4) goto L_0x004e
            int r0 = r11.A0d
            int r1 = r2 - r0
            int r0 = r11.A0e
            int r6 = r7 - r0
            if (r3 == 0) goto L_0x00c6
            int r1 = java.lang.Math.abs(r1)
            int r0 = r11.A0l
            if (r1 <= r0) goto L_0x00c6
            r11.A0i = r2
            r2 = 1
        L_0x00b3:
            if (r10 == 0) goto L_0x00c3
            int r1 = java.lang.Math.abs(r6)
            int r0 = r11.A0l
            if (r1 <= r0) goto L_0x00c3
            r11.A0j = r7
        L_0x00bf:
            r11.setScrollState(r4)
            goto L_0x004e
        L_0x00c3:
            if (r2 == 0) goto L_0x004e
            goto L_0x00bf
        L_0x00c6:
            r2 = 0
            goto L_0x00b3
        L_0x00c8:
            android.view.VelocityTracker r0 = r11.A0m
            r0.clear()
            r11.A0q(r5)
            goto L_0x004e
        L_0x00d2:
            boolean r0 = r11.A0q
            if (r0 == 0) goto L_0x00d8
            r11.A0q = r5
        L_0x00d8:
            int r0 = r12.getPointerId(r5)
            r11.A0k = r0
            float r0 = r12.getX()
            float r0 = r0 + r6
            int r0 = (int) r0
            r11.A0i = r0
            r11.A0d = r0
            float r0 = r12.getY()
            float r0 = r0 + r6
            int r0 = (int) r0
            r11.A0j = r0
            r11.A0e = r0
            android.widget.EdgeEffect r0 = r11.A04
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r6 = 0
            if (r0 == 0) goto L_0x01a3
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r11.canScrollHorizontally(r9)
            if (r0 != 0) goto L_0x01a3
            android.widget.EdgeEffect r8 = r11.A04
            float r1 = r12.getY()
            int r0 = r11.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = r7 - r1
            X.XD6.A01(r8, r6, r0)
            r1 = 1
        L_0x011a:
            android.widget.EdgeEffect r0 = r11.A05
            if (r0 == 0) goto L_0x013c
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            boolean r0 = r11.canScrollHorizontally(r4)
            if (r0 != 0) goto L_0x013c
            android.widget.EdgeEffect r8 = r11.A05
            float r1 = r12.getY()
            int r0 = r11.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.XD6.A01(r8, r6, r1)
            r1 = 1
        L_0x013c:
            android.widget.EdgeEffect r0 = r11.A06
            if (r0 == 0) goto L_0x015e
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x015e
            boolean r0 = r11.canScrollVertically(r9)
            if (r0 != 0) goto L_0x015e
            android.widget.EdgeEffect r8 = r11.A06
            float r1 = r12.getX()
            int r0 = r11.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.XD6.A01(r8, r6, r1)
            r1 = 1
        L_0x015e:
            android.widget.EdgeEffect r0 = r11.A03
            if (r0 == 0) goto L_0x019c
            float r0 = X.XD6.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x019c
            boolean r0 = r11.canScrollVertically(r4)
            if (r0 != 0) goto L_0x019c
            android.widget.EdgeEffect r2 = r11.A03
            float r1 = r12.getX()
            int r0 = r11.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r7 = r7 - r1
            X.XD6.A01(r2, r6, r7)
        L_0x0180:
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r11.setScrollState(r4)
            r11.A0q(r4)
        L_0x018d:
            int[] r0 = r11.A1A
            r0[r4] = r5
            r0[r5] = r5
            if (r10 == 0) goto L_0x0197
            r3 = r3 | 2
        L_0x0197:
            r11.A0v(r3, r5)
            goto L_0x004e
        L_0x019c:
            if (r1 != 0) goto L_0x0180
            int r0 = r11.A02
            if (r0 != r2) goto L_0x018d
            goto L_0x0180
        L_0x01a3:
            r1 = 0
            goto L_0x011a
        L_0x01a6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        0ff.A01("RV OnLayout", 917921195);
        A0d();
        0ff.A00(-1137219050);
        this.A0R = true;
    }

    public void onMeasure(int i, int i2) {
        C252553pI r4 = this.A0D;
        if (r4 == null) {
            A0s(i, i2);
            return;
        }
        boolean z = false;
        if (r4.A1H()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A0D.A0r(this.A0y, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.A0r = z;
            if (!z && this.A0A != null) {
                if (this.mState.A04 == 1) {
                    A08();
                }
                this.A0D.A0d(i, i2);
                this.mState.A09 = true;
                A09();
                this.A0D.A0e(i, i2);
                if (this.A0D.A1I()) {
                    this.A0D.A0d(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), SN3.MAX_SIGNED_POWER_OF_TWO));
                    this.mState.A09 = true;
                    A09();
                    this.A0D.A0e(i, i2);
                }
                this.A0h = getMeasuredWidth();
                this.A0g = getMeasuredHeight();
            }
        } else if (this.A0S) {
            r4.A0r(this.A0y, this.mState, i, i2);
        } else {
            if (this.A0N) {
                A0k();
                this.A01++;
                A0A();
                A18(true);
                AnonymousClass3AW r1 = this.mState;
                if (r1.A0A) {
                    r1.A08 = true;
                } else {
                    this.A07.A06();
                    this.mState.A08 = false;
                }
                this.A0N = false;
                A1A(false);
            } else if (this.mState.A0A) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            2Rw r0 = this.A0A;
            if (r0 != null) {
                this.mState.A03 = r0.getItemCount();
            } else {
                this.mState.A03 = 0;
            }
            A0k();
            this.A0D.A0r(this.A0y, this.mState, i, i2);
            A1A(false);
            this.mState.A08 = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A01 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.A0I = savedState;
        super.onRestoreInstanceState(savedState.A00);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable.Creator creator = SavedState.CREATOR;
        AbsSavedState absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SavedState savedState = this.A0I;
        if (savedState != null) {
            parcelable = savedState.A00;
        } else {
            C252553pI r0 = this.A0D;
            if (r0 != null) {
                parcelable = r0.A1M();
            } else {
                parcelable = null;
            }
        }
        absSavedState.A00 = parcelable;
        return absSavedState;
    }

    public final void requestChildFocus(View view, View view2) {
        AnonymousClass52T r0 = this.A0D.A06;
        if ((r0 == null || !r0.A05) && this.A01 <= 0 && view2 != null) {
            A0F(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A19;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C331097Pn) arrayList.get(i)).DeF(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.A0f != 0 || this.A0W) {
            this.A0X = true;
        } else {
            super.requestLayout();
        }
    }

    public final void scrollBy(int i, int i2) {
        C252553pI r1 = this.A0D;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0W) {
            boolean A1X = r1.A1X();
            boolean A1Y = this.A0D.A1Y();
            if (A1X || A1Y) {
                if (!A1X) {
                    i = 0;
                }
                if (!A1Y) {
                    i2 = 0;
                }
                A1G((MotionEvent) null, i, i2, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A01 > 0) {
            int i = 0;
            if (!(accessibilityEvent == null || (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) == 0)) {
                i = contentChangeTypes;
            }
            this.A00 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C238073Al r1) {
        this.A0J = r1;
        03v.A0B(this, r1);
    }

    public void setChildDrawingOrderCallback(C331087Pm r2) {
        if (r2 != this.A0o) {
            this.A0o = r2;
            boolean z = false;
            if (r2 != null) {
                z = true;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.A0O) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
        this.A0O = z;
        super.setClipToPadding(z);
        if (this.A0R) {
            requestLayout();
        }
    }

    public void setItemAnimator(AnonymousClass3AS r3) {
        AnonymousClass3AS r0 = this.A0C;
        if (r0 != null) {
            r0.A0I();
            this.A0C.A04 = null;
        }
        this.A0C = r3;
        if (r3 != null) {
            r3.A04 = this.A0p;
        }
    }

    public void setItemViewCacheSize(int i) {
        AnonymousClass3AN r0 = this.A0y;
        r0.A00 = i;
        r0.A08();
    }

    public void setLayoutManager(C252553pI r8) {
        AnonymousClass3AN r4;
        AnonymousClass3Ai r2;
        if (r8 != this.A0D) {
            A0l();
            if (this.A0D != null) {
                AnonymousClass3AS r0 = this.A0C;
                if (r0 != null) {
                    r0.A0I();
                }
                C252553pI r02 = this.A0D;
                r4 = this.A0y;
                r02.A0o(r4);
                this.A0D.A0p(r4);
                r4.A06();
                if (this.A0T) {
                    C252553pI r1 = this.A0D;
                    r1.A0B = false;
                    r1.A0s(r4, this);
                }
                C252553pI r22 = this.A0D;
                r22.A07 = null;
                r22.A05 = null;
                r22.A03 = 0;
                r22.A00 = 0;
                r22.A04 = SN3.MAX_SIGNED_POWER_OF_TWO;
                r22.A01 = SN3.MAX_SIGNED_POWER_OF_TWO;
                this.A0D = null;
            } else {
                r4 = this.A0y;
                r4.A06();
            }
            C238053Aj r6 = this.A08;
            r6.A02.A02();
            List list = r6.A04;
            int size = list.size();
            while (true) {
                size--;
                r2 = r6.A03;
                if (size < 0) {
                    break;
                }
                C238043Ah r23 = (C238043Ah) r2;
                C249703kE A062 = A06((View) list.get(size));
                if (A062 != null) {
                    A062.onLeftHiddenState(r23.A00);
                }
                list.remove(size);
            }
            RecyclerView recyclerView = ((C238043Ah) r2).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0y(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0D = r8;
            if (r8 != null) {
                if (r8.A07 == null) {
                    r8.A07 = this;
                    r8.A05 = r6;
                    r8.A03 = getWidth();
                    r8.A00 = getHeight();
                    r8.A04 = SN3.MAX_SIGNED_POWER_OF_TWO;
                    r8.A01 = SN3.MAX_SIGNED_POWER_OF_TWO;
                    if (this.A0T) {
                        C252553pI r12 = this.A0D;
                        r12.A0B = true;
                        r12.A1U(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(r8);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(r8.A07.A0a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            r4.A08();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(AnonymousClass3BD r5) {
        AnonymousClass3AN r3 = this.A0y;
        RecyclerView recyclerView = r3.A08;
        AnonymousClass3AN.A00(recyclerView.A0A, r3, false);
        AnonymousClass3BD r1 = r3.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r3.A02 = r5;
        if (!(r5 == null || recyclerView.A0A == null)) {
            r5.A00++;
        }
        AnonymousClass3AN.A01(r3);
    }

    public void setScrollState(int i) {
        AnonymousClass52T r0;
        if (i != this.A02) {
            this.A02 = i;
            if (i != 2) {
                AnonymousClass3AT r1 = this.mViewFlinger;
                r1.A06.removeCallbacks(r1);
                r1.A01.abortAnimation();
                C252553pI r02 = this.A0D;
                if (!(r02 == null || (r0 = r02.A06) == null)) {
                    r0.A02();
                }
            }
            C252553pI r03 = this.A0D;
            if (r03 != null) {
                r03.A0c(i);
            }
            C249403jg r04 = this.A0G;
            if (r04 != null) {
                r04.onScrollStateChanged(this, i);
            }
            List list = this.A0M;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C249403jg) this.A0M.get(size)).onScrollStateChanged(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setViewCacheExtension(C21286XSr xSr) {
        this.A0y.A03 = xSr;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.A0W) {
            A17("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.A0W = false;
                if (!(!this.A0X || this.A0D == null || this.A0A == null)) {
                    requestLayout();
                }
                this.A0X = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0W = true;
            this.A0q = true;
            A0l();
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.3AK] */
    static {
        Class cls = Integer.TYPE;
        A1H = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    private int A01(int i, float f) {
        float f2;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect3 = this.A04;
        float f3 = 0.0f;
        if (edgeEffect3 == null || XD6.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A05;
            if (!(edgeEffect4 == null || XD6.A00(edgeEffect4) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    edgeEffect2 = this.A05;
                } else {
                    f2 = XD6.A01(this.A05, width, height);
                    if (XD6.A00(this.A05) == 0.0f) {
                        edgeEffect = this.A05;
                        edgeEffect.onRelease();
                    }
                    f3 = f2;
                    invalidate();
                }
            }
            return Math.round(f3 * ((float) getWidth()));
        } else if (canScrollHorizontally(-1)) {
            edgeEffect2 = this.A04;
        } else {
            f2 = -XD6.A01(this.A04, -width, 1.0f - height);
            if (XD6.A00(this.A04) == 0.0f) {
                edgeEffect = this.A04;
                edgeEffect.onRelease();
            }
            f3 = f2;
            invalidate();
            return Math.round(f3 * ((float) getWidth()));
        }
        edgeEffect2.onRelease();
        invalidate();
        return Math.round(f3 * ((float) getWidth()));
    }

    private int A02(int i, float f) {
        float f2;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect3 = this.A06;
        float f3 = 0.0f;
        if (edgeEffect3 == null || XD6.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A03;
            if (!(edgeEffect4 == null || XD6.A00(edgeEffect4) == 0.0f)) {
                if (canScrollVertically(1)) {
                    edgeEffect2 = this.A03;
                } else {
                    f2 = XD6.A01(this.A03, height, 1.0f - width);
                    if (XD6.A00(this.A03) == 0.0f) {
                        edgeEffect = this.A03;
                        edgeEffect.onRelease();
                    }
                    f3 = f2;
                    invalidate();
                }
            }
            return Math.round(f3 * ((float) getHeight()));
        } else if (canScrollVertically(-1)) {
            edgeEffect2 = this.A06;
        } else {
            f2 = -XD6.A01(this.A06, -height, width);
            if (XD6.A00(this.A06) == 0.0f) {
                edgeEffect = this.A06;
                edgeEffect.onRelease();
            }
            f3 = f2;
            invalidate();
            return Math.round(f3 * ((float) getHeight()));
        }
        edgeEffect2.onRelease();
        invalidate();
        return Math.round(f3 * ((float) getHeight()));
    }

    public static final int A03(View view) {
        C249703kE A062 = A06(view);
        if (A062 != null) {
            return A062.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static final int A04(View view) {
        C249703kE A062 = A06(view);
        if (A062 != null) {
            return A062.getLayoutPosition();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r4.A0C == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09() {
        /*
            r4 = this;
            r4.A0k()
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            X.3AW r1 = r4.mState
            r0 = 6
            r1.A01(r0)
            X.3Ae r0 = r4.A07
            r0.A06()
            X.3AW r1 = r4.mState
            X.2Rw r0 = r4.A0A
            int r0 = r0.getItemCount()
            r1.A03 = r0
            X.3AW r0 = r4.mState
            r3 = 0
            r0.A00 = r3
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.A0I
            if (r0 == 0) goto L_0x003d
            X.2Rw r0 = r4.A0A
            boolean r0 = r0.canRestoreState()
            if (r0 == 0) goto L_0x003d
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.A0I
            android.os.Parcelable r1 = r0.A00
            if (r1 == 0) goto L_0x003a
            X.3pI r0 = r4.A0D
            r0.A1P(r1)
        L_0x003a:
            r0 = 0
            r4.A0I = r0
        L_0x003d:
            X.3AW r2 = r4.mState
            r2.A08 = r3
            X.3pI r1 = r4.A0D
            X.3AN r0 = r4.A0y
            r1.A1R(r0, r2)
            X.3AW r2 = r4.mState
            r2.A0C = r3
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0055
            X.3AS r1 = r4.A0C
            r0 = 1
            if (r1 != 0) goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            r2.A0B = r0
            r0 = 4
            r2.A04 = r0
            r0 = 1
            r4.A18(r0)
            r4.A1A(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A09():void");
    }

    private void A0C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0k) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0k = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A0i = x;
            this.A0d = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A0j = y;
            this.A0e = y;
        }
    }

    public static void A0E(View view, Rect rect) {
        AnonymousClass3MX r6 = (AnonymousClass3MX) view.getLayoutParams();
        Rect rect2 = r6.A02;
        rect.set((view.getLeft() - rect2.left) - r6.leftMargin, (view.getTop() - rect2.top) - r6.topMargin, view.getRight() + rect2.right + r6.rightMargin, view.getBottom() + rect2.bottom + r6.bottomMargin);
    }

    private boolean A0P(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A19;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C331097Pn r1 = (C331097Pn) arrayList.get(i);
            if (!r1.DLA(motionEvent, this) || action == 3) {
                i++;
            } else {
                this.A0F = r1;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1.isInvalid() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect A0T(android.view.View r10) {
        /*
            r9 = this;
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            X.3MX r7 = (X.AnonymousClass3MX) r7
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x001e
            X.3AW r0 = r9.mState
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0021
            X.3kE r1 = r7.mViewHolder
            boolean r0 = r1.isUpdated()
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1.isInvalid()
            if (r0 == 0) goto L_0x0021
        L_0x001e:
            android.graphics.Rect r6 = r7.A02
            return r6
        L_0x0021:
            android.graphics.Rect r6 = r7.A02
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r9.A12
            int r3 = r4.size()
            r2 = 0
        L_0x002e:
            if (r2 >= r3) goto L_0x005f
            android.graphics.Rect r8 = r9.A0u
            r8.set(r5, r5, r5, r5)
            java.lang.Object r1 = r4.get(r2)
            X.3B3 r1 = (X.AnonymousClass3B3) r1
            X.3AW r0 = r9.mState
            r1.getItemOffsets(r8, r10, r9, r0)
            int r1 = r6.left
            int r0 = r8.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r8.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r8.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r8.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L_0x002e
        L_0x005f:
            r7.A00 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0T(android.view.View):android.graphics.Rect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A0V(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L_0x0010
            if (r1 == r2) goto L_0x0010
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0010
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r1 == r2) goto L_0x0013
            r3 = 0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0V(android.view.View):android.view.View");
    }

    public final C249703kE A0Y(View view) {
        View A0V2 = A0V(view);
        if (A0V2 == null) {
            return null;
        }
        return A0Z(A0V2);
    }

    public final C249703kE A0Z(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A06(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void A0c() {
        int i;
        int i2;
        int A062 = AnonymousClass0fD.A06(-512195364);
        if (!this.A0R || this.A0P) {
            0ff.A01("RV FullInvalidate", -991309226);
            A0d();
            0ff.A00(-2032452842);
            i = -1208408121;
        } else {
            AnonymousClass3Ae r6 = this.A07;
            ArrayList arrayList = r6.A04;
            if (arrayList.size() > 0) {
                int i3 = r6.A00;
                if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                    if (arrayList.size() > 0) {
                        0ff.A01("RV FullInvalidate", 1140900645);
                        A0d();
                        i2 = 1445096224;
                    }
                    i = -2039312869;
                } else {
                    0ff.A01("RV PartialInvalidate", -1668064105);
                    A0k();
                    this.A01++;
                    r6.A07();
                    if (!this.A0X) {
                        C238053Aj r4 = this.A08;
                        int A032 = r4.A03();
                        int i4 = 0;
                        while (true) {
                            if (i4 < A032) {
                                C249703kE A063 = A06(r4.A06(i4));
                                if (A063 != null && !A063.shouldIgnore() && A063.isUpdated()) {
                                    A0d();
                                    break;
                                }
                                i4++;
                            } else {
                                r6.A05();
                                break;
                            }
                        }
                    }
                    A1A(true);
                    A18(true);
                    i2 = -964509631;
                }
                0ff.A00(i2);
                i = -2039312869;
            } else {
                i = -835686034;
            }
        }
        AnonymousClass0fD.A0D(i, A062);
    }

    public final void A0q(int i) {
        getScrollingChildHelper().A01(i);
    }

    public final void A0s(int i, int i2) {
        setMeasuredDimension(C252553pI.A03(i, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), C252553pI.A03(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void A0v(int i, int i2) {
        getScrollingChildHelper().A05(i, i2);
    }

    public final void A0x(int i, int[] iArr, int i2) {
        int i3;
        int i4;
        C249703kE r0;
        A0k();
        this.A01++;
        0ff.A01("RV Scroll", 1725658874);
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        if (i != 0) {
            i3 = this.A0D.A1K(this.A0y, this.mState, i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0D.A1L(this.A0y, this.mState, i2);
        } else {
            i4 = 0;
        }
        0ff.A00(227204715);
        C238053Aj r8 = this.A08;
        int A032 = r8.A03();
        for (int i5 = 0; i5 < A032; i5++) {
            View A062 = r8.A06(i5);
            C249703kE A0Z2 = A0Z(A062);
            if (!(A0Z2 == null || (r0 = A0Z2.mShadowingHolder) == null)) {
                View view = r0.itemView;
                int left = A062.getLeft();
                int top = A062.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A18(true);
        A1A(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void A0y(View view) {
        C249703kE A062 = A06(view);
        2Rw r0 = this.A0A;
        if (!(r0 == null || A062 == null)) {
            r0.onViewDetachedFromWindow(A062);
        }
        List list = this.A0L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C2366234l) this.A0L.get(size)).D1m(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A1B(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        03N.A00(getScrollingChildHelper(), iArr, iArr2, i, i2, i3, i4, i5);
    }

    public final boolean A1C() {
        if (getScrollingChildHelper().A00 != null) {
            return true;
        }
        return false;
    }

    public final boolean A1H(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, i3);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A04(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A03(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A06(i, i2, i3, i4, iArr);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0.draw(r9) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r1 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r1 == false) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            r0 = 771600183(0x2dfdaf37, float:2.8840581E-11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            super.draw(r9)
            java.util.ArrayList r4 = r8.A12
            int r5 = r4.size()
            r7 = 0
            r2 = 0
        L_0x0012:
            if (r2 >= r5) goto L_0x0022
            java.lang.Object r1 = r4.get(r2)
            X.3B3 r1 = (X.AnonymousClass3B3) r1
            X.3AW r0 = r8.mState
            r1.onDrawOver(r9, r8, r0)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0022:
            android.widget.EdgeEffect r0 = r8.A04
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0122
            int r2 = r9.save()
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x011f
            int r1 = r8.getPaddingBottom()
        L_0x0038:
            r0 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r0)
            int r0 = r8.getHeight()
            int r0 = -r0
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 0
            r9.translate(r1, r0)
            android.widget.EdgeEffect r0 = r8.A04
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.draw(r9)
            r6 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            r9.restoreToCount(r2)
        L_0x0057:
            android.widget.EdgeEffect r0 = r8.A06
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0086
            int r2 = r9.save()
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x0076
            int r0 = r8.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r8.getPaddingTop()
            float r0 = (float) r0
            r9.translate(r1, r0)
        L_0x0076:
            android.widget.EdgeEffect r0 = r8.A06
            if (r0 == 0) goto L_0x0081
            boolean r1 = r0.draw(r9)
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r6 = r6 | r0
            r9.restoreToCount(r2)
        L_0x0086:
            android.widget.EdgeEffect r0 = r8.A05
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00bb
            int r5 = r9.save()
            int r2 = r8.getWidth()
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x011d
            int r1 = r8.getPaddingTop()
        L_0x00a0:
            r0 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r0)
            float r1 = (float) r1
            int r0 = -r2
            float r0 = (float) r0
            r9.translate(r1, r0)
            android.widget.EdgeEffect r0 = r8.A05
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r0.draw(r9)
            r0 = 1
            if (r1 != 0) goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r6 = r6 | r0
            r9.restoreToCount(r5)
        L_0x00bb:
            android.widget.EdgeEffect r0 = r8.A03
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00fa
            int r5 = r9.save()
            r0 = 1127481344(0x43340000, float:180.0)
            r9.rotate(r0)
            boolean r2 = r8.A0O
            int r0 = r8.getWidth()
            int r1 = -r0
            if (r2 == 0) goto L_0x0116
            int r0 = r8.getPaddingRight()
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r8.getHeight()
            int r1 = -r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
        L_0x00e7:
            float r0 = (float) r1
            r9.translate(r2, r0)
            android.widget.EdgeEffect r0 = r8.A03
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r0.draw(r9)
            if (r0 == 0) goto L_0x00f6
            r7 = 1
        L_0x00f6:
            r6 = r6 | r7
            r9.restoreToCount(r5)
        L_0x00fa:
            if (r6 != 0) goto L_0x010c
            X.3AS r1 = r8.A0C
            if (r1 == 0) goto L_0x010f
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x010f
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x010f
        L_0x010c:
            r8.postInvalidateOnAnimation()
        L_0x010f:
            r0 = 856345215(0x330aca7f, float:3.2314798E-8)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0116:
            float r2 = (float) r1
            int r0 = r8.getHeight()
            int r1 = -r0
            goto L_0x00e7
        L_0x011d:
            r1 = 0
            goto L_0x00a0
        L_0x011f:
            r1 = 0
            goto L_0x0038
        L_0x0122:
            r6 = 0
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().A01 != null) {
            return true;
        }
        return false;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1664135630);
        super.onAttachedToWindow();
        this.A01 = 0;
        boolean z = true;
        this.A0T = true;
        if (!this.A0R || isLayoutRequested()) {
            z = false;
        }
        this.A0R = z;
        AnonymousClass3AN.A01(this.A0y);
        C252553pI r1 = this.A0D;
        if (r1 != null) {
            r1.A0B = true;
            r1.A1U(this);
        }
        this.A0Y = false;
        ThreadLocal threadLocal = C240673Lu.A05;
        C240673Lu r0 = (C240673Lu) threadLocal.get();
        this.mGapWorker = r0;
        if (r0 == null) {
            this.mGapWorker = new C240673Lu();
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            C240673Lu r2 = this.mGapWorker;
            r2.A00 = (long) (1.0E9f / f);
            threadLocal.set(r2);
        }
        C240673Lu r12 = this.mGapWorker;
        if (!A1C || !r12.A02.contains(this)) {
            r12.A02.add(this);
            AnonymousClass0fD.A0D(1527479032, A062);
            return;
        }
        throw new IllegalStateException("RecyclerView already present in worker list!");
    }

    public void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-345242235);
        super.onDetachedFromWindow();
        AnonymousClass3AS r0 = this.A0C;
        if (r0 != null) {
            r0.A0I();
        }
        A0l();
        this.A0T = false;
        C252553pI r1 = this.A0D;
        if (r1 != null) {
            AnonymousClass3AN r02 = this.A0y;
            r1.A0B = false;
            r1.A0s(r02, this);
        }
        this.A13.clear();
        removeCallbacks(this.A0K);
        do {
        } while (AnonymousClass3MZ.A03.A7A() != null);
        AnonymousClass3AN r4 = this.A0y;
        int i = 0;
        while (true) {
            ArrayList arrayList = r4.A06;
            if (i >= arrayList.size()) {
                break;
            }
            C275604qc.A01(((C249703kE) arrayList.get(i)).itemView);
            i++;
        }
        AnonymousClass3AN.A00(r4.A08.A0A, r4, false);
        0kx r42 = new 0kx(this);
        while (r42.hasNext()) {
            ArrayList arrayList2 = C275604qc.A00((View) r42.next()).A00;
            0qQ.A0B(arrayList2, 0);
            for (int size = arrayList2.size() - 1; -1 < size; size--) {
                ((AnonymousClass5Oq) arrayList2.get(size)).Dcz();
            }
        }
        C240673Lu r03 = this.mGapWorker;
        if (r03 != null) {
            boolean remove = r03.A02.remove(this);
            if (!A1C || remove) {
                this.mGapWorker = null;
            } else {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
        }
        AnonymousClass0fD.A0D(1100369750, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass3B3) arrayList.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(2130805072);
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4)) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
        AnonymousClass0fD.A0D(-1566694734, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        if (r9 == 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0116, code lost:
        if (r8 != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x019f, code lost:
        if (r7 != false) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = -1118027992(0xffffffffbd5c3f28, float:-0.053771168)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r15 = r21
            boolean r0 = r15.A0W
            r2 = 0
            if (r0 != 0) goto L_0x0045
            boolean r0 = r15.A0q
            if (r0 != 0) goto L_0x0045
            X.7Pn r0 = r15.A0F
            r6 = r22
            if (r0 != 0) goto L_0x0034
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x002f
            r4 = 0
        L_0x001f:
            r5 = 1
            if (r4 == 0) goto L_0x0049
            r15.A0B()
            r15.setScrollState(r2)
            r0 = 799432304(0x2fa65e70, float:3.0262326E-10)
        L_0x002b:
            X.AnonymousClass0fD.A0C(r0, r3)
            return r5
        L_0x002f:
            boolean r4 = r15.A0P(r6)
            goto L_0x001f
        L_0x0034:
            r0.DsW(r6, r15)
            int r1 = r6.getAction()
            r0 = 3
            r4 = 1
            if (r1 == r0) goto L_0x0041
            if (r1 != r4) goto L_0x001f
        L_0x0041:
            r0 = 0
            r15.A0F = r0
            goto L_0x001f
        L_0x0045:
            r0 = 525944476(0x1f59469c, float:4.6009944E-20)
            goto L_0x0050
        L_0x0049:
            X.3pI r0 = r15.A0D
            if (r0 != 0) goto L_0x0054
            r0 = -1339912934(0xffffffffb0228d1a, float:-5.9135774E-10)
        L_0x0050:
            X.AnonymousClass0fD.A0C(r0, r3)
            return r2
        L_0x0054:
            boolean r1 = r0.A1X()
            X.3pI r0 = r15.A0D
            boolean r14 = r0.A1Y()
            android.view.VelocityTracker r0 = r15.A0m
            if (r0 != 0) goto L_0x0068
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r15.A0m = r0
        L_0x0068:
            int r9 = r6.getActionMasked()
            int r7 = r6.getActionIndex()
            if (r9 != 0) goto L_0x0078
            int[] r0 = r15.A1A
            r0[r5] = r2
            r0[r2] = r2
        L_0x0078:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r6)
            int[] r12 = r15.A1A
            r0 = r12[r2]
            float r8 = (float) r0
            r0 = r12[r5]
            float r0 = (float) r0
            r4.offsetLocation(r8, r0)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L_0x01ec
            if (r9 == r5) goto L_0x01aa
            r0 = 2
            if (r9 == r0) goto L_0x00ca
            r0 = 3
            if (r9 == r0) goto L_0x00c3
            r0 = 5
            if (r9 == r0) goto L_0x00a8
            r0 = 6
            if (r9 != r0) goto L_0x009c
            r15.A0C(r6)
        L_0x009c:
            android.view.VelocityTracker r0 = r15.A0m
            r0.addMovement(r4)
        L_0x00a1:
            r4.recycle()
            r0 = -1566780113(0xffffffffa29cd52f, float:-4.25096E-18)
            goto L_0x002b
        L_0x00a8:
            int r0 = r6.getPointerId(r7)
            r15.A0k = r0
            float r0 = r6.getX(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r15.A0i = r0
            r15.A0d = r0
            float r0 = r6.getY(r7)
            float r0 = r0 + r8
            int r0 = (int) r0
            r15.A0j = r0
            r15.A0e = r0
            goto L_0x009c
        L_0x00c3:
            r15.A0B()
            r15.setScrollState(r2)
            goto L_0x009c
        L_0x00ca:
            int r0 = r15.A0k
            int r7 = r6.findPointerIndex(r0)
            if (r7 >= 0) goto L_0x00e6
            java.lang.String r4 = "Error processing scroll; pointer index for id "
            int r1 = r15.A0k
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            java.lang.String r1 = X.002.A0c(r4, r0, r1)
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            r0 = -1010126193(0xffffffffc3cab28f, float:-405.395)
            goto L_0x0050
        L_0x00e6:
            float r0 = r6.getX(r7)
            float r0 = r0 + r8
            int r11 = (int) r0
            float r0 = r6.getY(r7)
            float r0 = r0 + r8
            int r10 = (int) r0
            int r9 = r15.A0i
            int r9 = r9 - r11
            int r8 = r15.A0j
            int r8 = r8 - r10
            int r0 = r15.A02
            if (r0 == r5) goto L_0x011b
            if (r1 == 0) goto L_0x010a
            int r0 = r15.A0l
            if (r9 <= 0) goto L_0x01a3
            int r9 = r9 - r0
            int r9 = java.lang.Math.max(r2, r9)
        L_0x0107:
            r7 = 1
            if (r9 != 0) goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            if (r14 == 0) goto L_0x019f
            int r0 = r15.A0l
            if (r8 <= 0) goto L_0x0198
            int r8 = r8 - r0
            int r8 = java.lang.Math.max(r2, r8)
        L_0x0116:
            if (r8 == 0) goto L_0x019f
        L_0x0118:
            r15.setScrollState(r5)
        L_0x011b:
            int r0 = r15.A02
            if (r0 != r5) goto L_0x009c
            int[] r0 = r15.A16
            r0[r2] = r2
            r0[r5] = r2
            float r7 = r6.getY()
            int r7 = r15.A01(r9, r7)
            int r9 = r9 - r7
            float r7 = r6.getX()
            int r7 = r15.A02(r8, r7)
            int r8 = r8 - r7
            r18 = 0
            if (r1 == 0) goto L_0x013d
            r18 = r9
        L_0x013d:
            r19 = 0
            if (r14 == 0) goto L_0x0143
            r19 = r8
        L_0x0143:
            int[] r7 = r15.A1B
            r20 = r2
            r17 = r7
            r16 = r0
            boolean r13 = r15.A1H(r16, r17, r18, r19, r20)
            if (r13 == 0) goto L_0x016c
            r13 = r0[r2]
            int r9 = r9 - r13
            r0 = r0[r5]
            int r8 = r8 - r0
            r13 = r12[r2]
            r0 = r7[r2]
            int r13 = r13 + r0
            r12[r2] = r13
            r13 = r12[r5]
            r0 = r7[r5]
            int r13 = r13 + r0
            r12[r5] = r13
            android.view.ViewParent r0 = r15.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
        L_0x016c:
            r0 = r7[r2]
            int r11 = r11 - r0
            r15.A0i = r11
            r0 = r7[r5]
            int r10 = r10 - r0
            r15.A0j = r10
            r7 = 0
            if (r1 == 0) goto L_0x017a
            r7 = r9
        L_0x017a:
            r0 = 0
            if (r14 == 0) goto L_0x017e
            r0 = r8
        L_0x017e:
            boolean r0 = r15.A1G(r6, r7, r0, r2)
            if (r0 == 0) goto L_0x018b
            android.view.ViewParent r0 = r15.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
        L_0x018b:
            X.3Lu r0 = r15.mGapWorker
            if (r0 == 0) goto L_0x009c
            if (r9 != 0) goto L_0x0193
            if (r8 == 0) goto L_0x009c
        L_0x0193:
            r0.A01(r15, r9, r8)
            goto L_0x009c
        L_0x0198:
            int r8 = r8 + r0
            int r8 = java.lang.Math.min(r2, r8)
            goto L_0x0116
        L_0x019f:
            if (r7 == 0) goto L_0x011b
            goto L_0x0118
        L_0x01a3:
            int r9 = r9 + r0
            int r9 = java.lang.Math.min(r2, r9)
            goto L_0x0107
        L_0x01aa:
            android.view.VelocityTracker r0 = r15.A0m
            r0.addMovement(r4)
            android.view.VelocityTracker r7 = r15.A0m
            r6 = 1000(0x3e8, float:1.401E-42)
            int r0 = r15.A17
            float r0 = (float) r0
            r7.computeCurrentVelocity(r6, r0)
            r8 = 0
            if (r1 == 0) goto L_0x01ea
            android.view.VelocityTracker r1 = r15.A0m
            int r0 = r15.A0k
            float r0 = r1.getXVelocity(r0)
            float r7 = -r0
        L_0x01c5:
            if (r14 == 0) goto L_0x01e8
            android.view.VelocityTracker r1 = r15.A0m
            int r0 = r15.A0k
            float r0 = r1.getYVelocity(r0)
            float r6 = -r0
        L_0x01d0:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01d8
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01e0
        L_0x01d8:
            int r1 = (int) r7
            int r0 = (int) r6
            boolean r0 = r15.A1F(r1, r0)
            if (r0 != 0) goto L_0x01e3
        L_0x01e0:
            r15.setScrollState(r2)
        L_0x01e3:
            r15.A0B()
            goto L_0x00a1
        L_0x01e8:
            r6 = 0
            goto L_0x01d0
        L_0x01ea:
            r7 = 0
            goto L_0x01c5
        L_0x01ec:
            int r0 = r6.getPointerId(r2)
            r15.A0k = r0
            float r0 = r6.getX()
            float r0 = r0 + r8
            int r0 = (int) r0
            r15.A0i = r0
            r15.A0d = r0
            float r0 = r6.getY()
            float r0 = r0 + r8
            int r0 = (int) r0
            r15.A0j = r0
            r15.A0e = r0
            if (r14 == 0) goto L_0x020a
            r1 = r1 | 2
        L_0x020a:
            r15.A0v(r1, r2)
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void removeDetachedView(View view, boolean z) {
        C249703kE A062 = A06(view);
        if (A062 != null) {
            if (A062.isTmpDetached()) {
                A062.clearTmpDetachFlag();
            } else if (!A062.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A062);
                sb.append(A0a());
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (A1C) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(A0a());
            throw new IllegalArgumentException(sb2.toString());
        }
        view.clearAnimation();
        A0y(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(AnonymousClass3AL r2) {
        r2.getClass();
        this.A0B = r2;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A02(z);
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", 002.A0c("setScrollingTouchSlop(): bad argument constant ", "; using default value", i));
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.A0l = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.A0l = i2;
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A05(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().A01(0);
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        A1C = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        A1D = z;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.A0S = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(C228442lg r1) {
        this.A0E = r1;
    }

    @Deprecated
    public void setOnScrollListener(C249403jg r1) {
        this.A0G = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0Z = z;
    }

    @Deprecated
    public void setRecyclerListener(JLS jls) {
        this.A0H = jls;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C252553pI r0 = this.A0D;
        if (r0 != null) {
            return r0.A18(layoutParams);
        }
        throw new IllegalStateException(002.A0R("RecyclerView has no LayoutManager", A0a()));
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.3AU] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0211 A[Catch:{ NoSuchMethodException -> 0x0251, ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0224 A[Catch:{ NoSuchMethodException -> 0x0251, ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r15 = r19
            r6 = r20
            r3 = r21
            r5 = r22
            r15.<init>(r6, r3, r5)
            X.3AM r0 = new X.3AM
            r0.<init>(r15)
            r15.A18 = r0
            X.3AN r0 = new X.3AN
            r0.<init>(r15)
            r15.A0y = r0
            X.3AO r0 = new X.3AO
            r0.<init>()
            r15.A10 = r0
            X.3AP r0 = new X.3AP
            r0.<init>(r15)
            r15.A11 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.A0u = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.A0v = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r15.A0w = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A14 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A12 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A19 = r0
            r4 = 0
            r15.A0f = r4
            r15.A0P = r4
            r15.A0Q = r4
            r15.A01 = r4
            r15.A0c = r4
            X.3AK r0 = A1G
            r15.A0B = r0
            X.3AQ r0 = new X.3AQ
            r0.<init>()
            r15.A0C = r0
            r15.A02 = r4
            r8 = -1
            r15.A0k = r8
            r0 = 1
            r15.A0a = r0
            r15.A0b = r0
            r2 = 1
            r15.A0Z = r2
            X.3AT r0 = new X.3AT
            r0.<init>(r15)
            r15.mViewFlinger = r0
            X.3AU r0 = new X.3AU
            r0.<init>()
            r15.A09 = r0
            X.3AW r0 = new X.3AW
            r0.<init>()
            r15.mState = r0
            r15.A0U = r4
            r15.A0V = r4
            X.3AX r0 = new X.3AX
            r0.<init>(r15)
            r15.A0p = r0
            r15.A0Y = r4
            r10 = 2
            int[] r0 = new int[r10]
            r15.A15 = r0
            int[] r0 = new int[r10]
            r15.A1B = r0
            int[] r0 = new int[r10]
            r15.A1A = r0
            int[] r0 = new int[r10]
            r15.A16 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A13 = r0
            X.3AZ r0 = new X.3AZ
            r0.<init>(r15)
            r15.A0K = r0
            r15.A0h = r4
            r15.A0g = r4
            X.3Aa r0 = new X.3Aa
            r0.<init>(r15)
            r15.A0z = r0
            r15.setScrollContainer(r2)
            r15.setFocusableInTouchMode(r2)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            int r0 = r1.getScaledTouchSlop()
            r15.A0l = r0
            float r0 = r1.getScaledHorizontalScrollFactor()
            r15.A0a = r0
            float r0 = r1.getScaledVerticalScrollFactor()
            r15.A0b = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r15.A0t = r0
            int r0 = r1.getScaledMaximumFlingVelocity()
            r15.A17 = r0
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r0
            r0 = 1136724797(0x43c10b3d, float:386.0878)
            float r1 = r1 * r0
            r0 = 1062668861(0x3f570a3d, float:0.84)
            float r1 = r1 * r0
            r15.A0s = r1
            int r1 = r15.getOverScrollMode()
            r0 = 0
            if (r1 != r10) goto L_0x0107
            r0 = 1
        L_0x0107:
            r15.setWillNotDraw(r0)
            X.3AS r1 = r15.A0C
            X.3AY r0 = r15.A0p
            r1.A04 = r0
            X.3Ac r1 = new X.3Ac
            r1.<init>(r15)
            X.3Ae r0 = new X.3Ae
            r0.<init>(r1)
            r15.A07 = r0
            X.3Ah r1 = new X.3Ah
            r1.<init>(r15)
            X.3Aj r0 = new X.3Aj
            r0.<init>(r1)
            r15.A08 = r0
            int r0 = r15.getImportantForAutofill()
            if (r0 != 0) goto L_0x0133
            r0 = 8
            r15.setImportantForAutofill(r0)
        L_0x0133:
            int r0 = r15.getImportantForAccessibility()
            if (r0 != 0) goto L_0x013c
            r15.setImportantForAccessibility(r2)
        L_0x013c:
            android.content.Context r7 = r15.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r15.A0x = r0
            X.3Al r0 = new X.3Al
            r0.<init>(r15)
            r15.setAccessibilityDelegateCompat(r0)
            int[] r0 = X.C238093An.A00
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r3, r0, r5, r4)
            r16 = r0
            r17 = r5
            r18 = r4
            r13 = r1
            r14 = r3
            r12 = r6
            X.03v.A06(r12, r13, r14, r15, r16, r17, r18)
            r0 = 8
            java.lang.String r9 = r1.getString(r0)
            int r0 = r1.getInt(r10, r8)
            if (r0 != r8) goto L_0x0175
            r0 = 262144(0x40000, float:3.67342E-40)
            r15.setDescendantFocusability(r0)
        L_0x0175:
            boolean r0 = r1.getBoolean(r2, r2)
            r15.A0O = r0
            r0 = 3
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x01c0
            r0 = 6
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r13 = (android.graphics.drawable.StateListDrawable) r13
            r0 = 7
            android.graphics.drawable.Drawable r11 = r1.getDrawable(r0)
            r0 = 4
            android.graphics.drawable.Drawable r14 = r1.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r14 = (android.graphics.drawable.StateListDrawable) r14
            r0 = 5
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r0)
            if (r13 == 0) goto L_0x02da
            if (r11 == 0) goto L_0x02da
            if (r14 == 0) goto L_0x02da
            if (r12 == 0) goto L_0x02da
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r16 = r7.getDimensionPixelSize(r0)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r17 = r7.getDimensionPixelSize(r0)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r18 = r7.getDimensionPixelOffset(r0)
            X.UAl r10 = new X.UAl
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01c0:
            r1.recycle()
            java.lang.String r8 = ": Could not instantiate the LayoutManager: "
            if (r9 == 0) goto L_0x02b6
            java.lang.String r7 = r9.trim()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02b6
            char r0 = r7.charAt(r4)
            r9 = 46
            if (r0 != r9) goto L_0x01ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.getPackageName()
            r1.append(r0)
        L_0x01e5:
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            goto L_0x020b
        L_0x01ed:
            java.lang.String r0 = "."
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x020b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            r1.append(r9)
            goto L_0x01e5
        L_0x020b:
            boolean r0 = r15.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            if (r0 == 0) goto L_0x0224
            java.lang.Class r0 = r15.getClass()     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
        L_0x0219:
            java.lang.Class r1 = java.lang.Class.forName(r7, r4, r0)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.Class<X.3pI> r0 = X.C252553pI.class
            java.lang.Class r11 = r1.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            goto L_0x0229
        L_0x0224:
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            goto L_0x0219
        L_0x0229:
            r9 = 0
            java.lang.Class[] r0 = A1H     // Catch:{ NoSuchMethodException -> 0x023d }
            java.lang.reflect.Constructor r10 = r11.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x023d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x023d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x023d }
            java.lang.Object[] r9 = new java.lang.Object[]{r6, r3, r1, r0}     // Catch:{ NoSuchMethodException -> 0x023d }
            goto L_0x0244
        L_0x023d:
            r1 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0251 }
            java.lang.reflect.Constructor r10 = r11.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0251 }
        L_0x0244:
            r10.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.Object r0 = r10.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            X.3pI r0 = (X.C252553pI) r0     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            r15.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            goto L_0x02b6
        L_0x0251:
            r2 = move-exception
            r2.initCause(r1)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.String r1 = r3.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.String r0 = ": Error creating LayoutManager "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            r0.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02a5, InvocationTargetException -> 0x0296, InstantiationException -> 0x0287, IllegalAccessException -> 0x0276, ClassCastException -> 0x0265 }
        L_0x0265:
            r2 = move-exception
            java.lang.String r1 = r3.getPositionDescription()
            java.lang.String r0 = ": Class is not a LayoutManager "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0276:
            r2 = move-exception
            java.lang.String r1 = r3.getPositionDescription()
            java.lang.String r0 = ": Cannot access non-public constructor "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0287:
            r2 = move-exception
            java.lang.String r0 = r3.getPositionDescription()
            java.lang.String r1 = X.002.A0g(r0, r8, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0296:
            r2 = move-exception
            java.lang.String r0 = r3.getPositionDescription()
            java.lang.String r1 = X.002.A0g(r0, r8, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02a5:
            r2 = move-exception
            java.lang.String r1 = r3.getPositionDescription()
            java.lang.String r0 = ": Unable to find LayoutManager "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02b6:
            int[] r0 = A1I
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r3, r0, r5, r4)
            r9 = r15
            r10 = r0
            r11 = r5
            r12 = r4
            r7 = r1
            r8 = r3
            X.03v.A06(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r1.getBoolean(r4, r2)
            r1.recycle()
            r15.setNestedScrollingEnabled(r0)
            r1 = 2131435037(0x7f0b1e1d, float:1.8491905E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r15.setTag(r1, r0)
            return
        L_0x02da:
            java.lang.String r1 = "Trying to set fast scroller without both required drawables."
            java.lang.String r0 = r15.A0a()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }
}
