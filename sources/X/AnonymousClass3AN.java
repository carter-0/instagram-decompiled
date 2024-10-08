package X;

import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.3AN  reason: invalid class name */
public final class AnonymousClass3AN {
    public int A00;
    public int A01;
    public AnonymousClass3BD A02;
    public C21286XSr A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = new ArrayList();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    public static boolean A02(AnonymousClass3AN r10, C249703kE r11, int i, int i2, long j) {
        r11.mBindingAdapter = null;
        RecyclerView recyclerView = r10.A08;
        r11.mOwnerRecyclerView = recyclerView;
        int i3 = r11.mItemViewType;
        long nanoTime = System.nanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = AnonymousClass3BD.A00(r10.A02, i3).A01;
            if (j2 != 0 && nanoTime + j2 >= j) {
                return false;
            }
        }
        if (r11.isTmpDetached()) {
            recyclerView.attachViewToParent(r11.itemView, recyclerView.getChildCount(), r11.itemView.getLayoutParams());
            z = true;
        }
        recyclerView.A0A.bindViewHolder(r11, i);
        if (z) {
            recyclerView.detachViewFromParent(r11.itemView);
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        AnonymousClass3MW A002 = AnonymousClass3BD.A00(r10.A02, r11.mItemViewType);
        long j3 = A002.A01;
        if (j3 != 0) {
            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
        }
        A002.A01 = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.A0x;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            View view = r11.itemView;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            C238073Al r0 = recyclerView.A0J;
            if (r0 != null) {
                02Z A0a = r0.A0a();
                if (A0a instanceof C238083Am) {
                    02Z r02 = (C238083Am) A0a;
                    02Z A012 = 03v.A01(view);
                    if (!(A012 == null || A012 == r02)) {
                        r02.A00.put(view, A012);
                    }
                }
                03v.A0B(view, A0a);
            }
        }
        if (recyclerView.mState.A08) {
            r11.mPreLayoutPosition = i2;
        }
        return true;
    }

    public AnonymousClass3AN(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A00 = 2;
        this.A01 = 2;
    }

    public static void A00(2Rw r3, AnonymousClass3AN r4, boolean z) {
        AnonymousClass3BD r42 = r4.A02;
        if (r42 != null) {
            Set set = r42.A02;
            set.remove(r3);
            if (set.size() == 0 && !z) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = r42.A01;
                    if (i < sparseArray.size()) {
                        ArrayList arrayList = ((AnonymousClass3MW) sparseArray.get(sparseArray.keyAt(i))).A03;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            C275604qc.A01(((C249703kE) arrayList.get(i2)).itemView);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass3AN r3) {
        /*
            X.3BD r2 = r3.A02
            if (r2 == 0) goto L_0x0013
            androidx.recyclerview.widget.RecyclerView r0 = r3.A08
            X.2Rw r1 = r0.A0A
            if (r1 == 0) goto L_0x0013
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x0013
            java.util.Set r0 = r2.A02
            r0.add(r1)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AN.A01(X.3AN):void");
    }

    public final int A03(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            AnonymousClass3AW r1 = recyclerView.mState;
            if (i < r1.A00()) {
                if (r1.A08) {
                    return recyclerView.A07.A04(i, 0);
                }
                return i;
            }
        }
        RecyclerView recyclerView2 = this.A08;
        throw new IndexOutOfBoundsException(002.A0n("invalid position ", ". State item count is ", recyclerView2.A0a(), i, recyclerView2.mState.A00()));
    }

    /* JADX WARNING: type inference failed for: r0v117, types: [X.3Ph, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0207, code lost:
        if (r3.mState.A08 == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02f0, code lost:
        if (r7.mItemId != r9.getItemId(r7.mPosition)) goto L_0x0228;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE A05(int r24, long r25) {
        /*
            r23 = this;
            r4 = r23
            r2 = r24
            if (r24 < 0) goto L_0x041b
            androidx.recyclerview.widget.RecyclerView r3 = r4.A08
            X.3AW r1 = r3.mState
            int r0 = r1.A00()
            if (r2 >= r0) goto L_0x041b
            boolean r0 = r1.A08
            r6 = 0
            r10 = 1
            r8 = 0
            r21 = r25
            if (r0 == 0) goto L_0x0129
            java.util.ArrayList r5 = r4.A04
            if (r5 == 0) goto L_0x0129
            int r12 = r5.size()
            if (r12 == 0) goto L_0x0129
            r11 = 0
            r1 = 0
        L_0x0025:
            r9 = 32
            if (r1 >= r12) goto L_0x00f2
            java.lang.Object r7 = r5.get(r1)
            X.3kE r7 = (X.C249703kE) r7
            boolean r0 = r7.wasReturnedFromScrap()
            if (r0 != 0) goto L_0x00ee
            int r0 = r7.getLayoutPosition()
            if (r0 != r2) goto L_0x00ee
        L_0x003b:
            r7.addFlags(r9)
        L_0x003e:
            r16 = 1
        L_0x0040:
            if (r16 == 0) goto L_0x0068
            X.3AW r5 = r3.mState
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0068
            r1 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = r7.hasAnyOfTheFlags(r1)
            if (r0 == 0) goto L_0x0068
            r7.setFlags(r8, r1)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0068
            X.AnonymousClass3AS.A04(r7)
            r7.getUnmodifiedPayloads()
            X.3Ph r0 = new X.3Ph
            r0.<init>()
            r0.A00(r7)
            r3.A10(r0, r7)
        L_0x0068:
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x00a3
            r7.mPreLayoutPosition = r2
        L_0x0076:
            r2 = 0
        L_0x0077:
            android.view.View r0 = r7.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 != 0) goto L_0x0095
            android.view.ViewGroup$LayoutParams r1 = r3.generateDefaultLayoutParams()
        L_0x0083:
            X.3MX r1 = (X.AnonymousClass3MX) r1
            android.view.View r0 = r7.itemView
            r0.setLayoutParams(r1)
        L_0x008a:
            r1.mViewHolder = r7
            if (r16 == 0) goto L_0x0093
            if (r2 == 0) goto L_0x0093
        L_0x0090:
            r1.A01 = r10
            return r7
        L_0x0093:
            r10 = 0
            goto L_0x0090
        L_0x0095:
            boolean r0 = r3.checkLayoutParams(r1)
            if (r0 != 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r1 = r3.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            goto L_0x0083
        L_0x00a0:
            X.3MX r1 = (X.AnonymousClass3MX) r1
            goto L_0x008a
        L_0x00a3:
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r7.needsUpdate()
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r7.isInvalid()
            if (r0 == 0) goto L_0x0076
        L_0x00b5:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1C
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r7.isRemoved()
            if (r0 == 0) goto L_0x00dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r3.A0a()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            X.3Ae r0 = r3.A07
            int r19 = r0.A04(r2, r8)
            r17 = r4
            r18 = r7
            r20 = r2
            boolean r2 = A02(r17, r18, r19, r20, r21)
            goto L_0x0077
        L_0x00ee:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x00f2:
            X.2Rw r5 = r3.A0A
            boolean r0 = r5.hasStableIds()
            if (r0 == 0) goto L_0x0129
            X.3Ae r0 = r3.A07
            int r1 = r0.A04(r2, r8)
            if (r1 <= 0) goto L_0x0129
            int r0 = r5.getItemCount()
            if (r1 >= r0) goto L_0x0129
            X.2Rw r0 = r3.A0A
            long r13 = r0.getItemId(r1)
        L_0x010e:
            if (r11 >= r12) goto L_0x0129
            java.util.ArrayList r0 = r4.A04
            java.lang.Object r7 = r0.get(r11)
            X.3kE r7 = (X.C249703kE) r7
            boolean r0 = r7.wasReturnedFromScrap()
            if (r0 != 0) goto L_0x0126
            long r0 = r7.mItemId
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0126
            goto L_0x003b
        L_0x0126:
            int r11 = r11 + 1
            goto L_0x010e
        L_0x0129:
            r16 = 0
            java.util.ArrayList r11 = r4.A05
            int r5 = r11.size()
            r9 = 0
            r1 = 0
        L_0x0133:
            if (r1 >= r5) goto L_0x0181
            java.lang.Object r7 = r11.get(r1)
            X.3kE r7 = (X.C249703kE) r7
            boolean r0 = r7.wasReturnedFromScrap()
            if (r0 != 0) goto L_0x017e
            int r0 = r7.getLayoutPosition()
            if (r0 != r2) goto L_0x017e
            boolean r0 = r7.isInvalid()
            if (r0 != 0) goto L_0x017e
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0159
            boolean r0 = r7.isRemoved()
            if (r0 != 0) goto L_0x017e
        L_0x0159:
            r0 = 32
        L_0x015b:
            r7.addFlags(r0)
        L_0x015e:
            boolean r0 = r7.isRemoved()
            if (r0 == 0) goto L_0x020a
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1C
            if (r0 == 0) goto L_0x0203
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0203
            java.lang.String r1 = "should not receive a removed view unless it is pre layout"
            java.lang.String r0 = r3.A0a()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x017e:
            int r1 = r1 + 1
            goto L_0x0133
        L_0x0181:
            X.3Aj r12 = r3.A08
            java.util.List r13 = r12.A04
            int r7 = r13.size()
            r1 = 0
        L_0x018a:
            if (r1 >= r7) goto L_0x01db
            java.lang.Object r5 = r13.get(r1)
            android.view.View r5 = (android.view.View) r5
            X.3kE r14 = androidx.recyclerview.widget.RecyclerView.A06(r5)
            int r0 = r14.getLayoutPosition()
            if (r0 != r2) goto L_0x01d8
            boolean r0 = r14.isInvalid()
            if (r0 != 0) goto L_0x01d8
            boolean r0 = r14.isRemoved()
            if (r0 != 0) goto L_0x01d8
            if (r5 == 0) goto L_0x01db
            X.3kE r7 = androidx.recyclerview.widget.RecyclerView.A06(r5)
            X.3Ai r0 = r12.A03
            X.3Ah r0 = (X.C238043Ah) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            int r9 = r0.indexOfChild(r5)
            if (r9 < 0) goto L_0x03c6
            X.3Ak r1 = r12.A02
            boolean r0 = r1.A06(r9)
            if (r0 == 0) goto L_0x03af
            r1.A03(r9)
            X.C238053Aj.A02(r5, r12)
            int r1 = r12.A05(r5)
            r0 = -1
            if (r1 == r0) goto L_0x0391
            r12.A08(r1)
            r4.A0B(r5)
            r0 = 8224(0x2020, float:1.1524E-41)
            goto L_0x015b
        L_0x01d8:
            int r1 = r1 + 1
            goto L_0x018a
        L_0x01db:
            java.util.ArrayList r5 = r4.A06
            int r1 = r5.size()
        L_0x01e1:
            if (r9 >= r1) goto L_0x023b
            java.lang.Object r7 = r5.get(r9)
            X.3kE r7 = (X.C249703kE) r7
            boolean r0 = r7.isInvalid()
            if (r0 != 0) goto L_0x0200
            int r0 = r7.getLayoutPosition()
            if (r0 != r2) goto L_0x0200
            boolean r0 = r7.isAttachedToTransitionOverlay()
            if (r0 != 0) goto L_0x0200
            r5.remove(r9)
            goto L_0x015e
        L_0x0200:
            int r9 = r9 + 1
            goto L_0x01e1
        L_0x0203:
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x003e
            goto L_0x0228
        L_0x020a:
            int r1 = r7.mPosition
            if (r1 < 0) goto L_0x03fd
            X.2Rw r0 = r3.A0A
            int r0 = r0.getItemCount()
            if (r1 >= r0) goto L_0x03fd
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x02de
            X.2Rw r1 = r3.A0A
            int r0 = r7.mPosition
            int r1 = r1.getItemViewType(r0)
            int r0 = r7.mItemViewType
            if (r1 == r0) goto L_0x02de
        L_0x0228:
            r0 = 4
            r7.addFlags(r0)
            X.3AN r0 = r7.mScrapContainer
            if (r0 == 0) goto L_0x02d3
            android.view.View r0 = r7.itemView
            r3.removeDetachedView(r0, r8)
            r7.unScrap()
        L_0x0238:
            r4.A0C(r7)
        L_0x023b:
            X.3Ae r0 = r3.A07
            int r5 = r0.A04(r2, r8)
            if (r5 < 0) goto L_0x03dd
            X.2Rw r0 = r3.A0A
            int r0 = r0.getItemCount()
            if (r5 >= r0) goto L_0x03dd
            X.2Rw r0 = r3.A0A
            int r9 = r0.getItemViewType(r5)
            X.2Rw r1 = r3.A0A
            boolean r0 = r1.hasStableIds()
            if (r0 == 0) goto L_0x02f7
            long r14 = r1.getItemId(r5)
            int r12 = r11.size()
        L_0x0261:
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x02af
            java.lang.Object r7 = r11.get(r12)
            X.3kE r7 = (X.C249703kE) r7
            long r0 = r7.mItemId
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0261
            boolean r0 = r7.wasReturnedFromScrap()
            if (r0 != 0) goto L_0x0261
            int r0 = r7.mItemViewType
            if (r9 != r0) goto L_0x0296
            r0 = 32
            r7.addFlags(r0)
            boolean r0 = r7.isRemoved()
            if (r0 == 0) goto L_0x0292
            X.3AW r0 = r3.mState
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0292
            r1 = 2
            r0 = 14
            r7.setFlags(r1, r0)
        L_0x0292:
            r7.mPosition = r5
            goto L_0x003e
        L_0x0296:
            r11.remove(r12)
            android.view.View r0 = r7.itemView
            r3.removeDetachedView(r0, r8)
            android.view.View r0 = r7.itemView
            X.3kE r0 = androidx.recyclerview.widget.RecyclerView.A06(r0)
            r0.mScrapContainer = r6
            r0.mInChangeScrap = r8
            r0.clearReturnedFromScrapFlag()
            r4.A0C(r0)
            goto L_0x0261
        L_0x02af:
            java.util.ArrayList r12 = r4.A06
            int r11 = r12.size()
        L_0x02b5:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x02f7
            java.lang.Object r7 = r12.get(r11)
            X.3kE r7 = (X.C249703kE) r7
            long r0 = r7.mItemId
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x02b5
            boolean r0 = r7.isAttachedToTransitionOverlay()
            if (r0 != 0) goto L_0x02b5
            int r0 = r7.mItemViewType
            if (r9 != r0) goto L_0x02f4
            r12.remove(r11)
            goto L_0x0292
        L_0x02d3:
            boolean r0 = r7.wasReturnedFromScrap()
            if (r0 == 0) goto L_0x0238
            r7.clearReturnedFromScrapFlag()
            goto L_0x0238
        L_0x02de:
            X.2Rw r9 = r3.A0A
            boolean r0 = r9.hasStableIds()
            if (r0 == 0) goto L_0x003e
            long r0 = r7.mItemId
            int r5 = r7.mPosition
            long r12 = r9.getItemId(r5)
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0228
            goto L_0x003e
        L_0x02f4:
            r4.A09(r11)
        L_0x02f7:
            X.3BD r0 = r4.A02
            if (r0 != 0) goto L_0x0305
            X.3BD r0 = new X.3BD
            r0.<init>()
            r4.A02 = r0
            A01(r4)
        L_0x0305:
            X.3BD r0 = r4.A02
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r9)
            X.3MW r0 = (X.AnonymousClass3MW) r0
            if (r0 == 0) goto L_0x033a
            java.util.ArrayList r5 = r0.A03
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x033a
            int r1 = r5.size()
        L_0x031d:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x033a
            java.lang.Object r0 = r5.get(r1)
            X.3kE r0 = (X.C249703kE) r0
            boolean r0 = r0.isAttachedToTransitionOverlay()
            if (r0 != 0) goto L_0x031d
            java.lang.Object r7 = r5.remove(r1)
            X.3kE r7 = (X.C249703kE) r7
            if (r7 == 0) goto L_0x033a
            r7.resetInternal()
            goto L_0x0040
        L_0x033a:
            long r13 = java.lang.System.nanoTime()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x035c
            X.3BD r0 = r4.A02
            X.3MW r0 = X.AnonymousClass3BD.A00(r0, r9)
            long r0 = r0.A02
            r11 = 0
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x035c
            long r11 = r13 + r0
            int r0 = (r11 > r25 ? 1 : (r11 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x035c
            return r6
        L_0x035c:
            X.2Rw r0 = r3.A0A
            X.3kE r7 = r0.createViewHolder(r3, r9)
            android.view.View r0 = r7.itemView
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.A07(r0)
            if (r1 == 0) goto L_0x0371
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r7.mNestedRecyclerView = r0
        L_0x0371:
            long r5 = java.lang.System.nanoTime()
            X.3BD r0 = r4.A02
            long r5 = r5 - r13
            X.3MW r9 = X.AnonymousClass3BD.A00(r0, r9)
            long r0 = r9.A02
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x038d
            r13 = 4
            long r0 = r0 / r13
            r11 = 3
            long r0 = r0 * r11
            long r5 = r5 / r13
            long r0 = r0 + r5
            r5 = r0
        L_0x038d:
            r9.A02 = r5
            goto L_0x0040
        L_0x0391:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "layout index should not be -1 after unhiding a view:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r3.A0a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x03af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "view is not a child, cannot hide "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03dd:
            r0 = 577(0x241, float:8.09E-43)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            java.lang.String r7 = "(offset:"
            java.lang.String r8 = ").state:"
            X.3AW r0 = r3.mState
            int r12 = r0.A00()
            java.lang.String r9 = r3.A0a()
            r11 = r5
            r10 = r2
            java.lang.String r1 = X.002.A0z(r6, r7, r8, r9, r10, r11, r12)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x03fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Inconsistency detected. Invalid view holder adapter position"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r3.A0a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x041b:
            java.lang.String r5 = "Invalid item position "
            java.lang.String r6 = "("
            java.lang.String r7 = "). Item count:"
            androidx.recyclerview.widget.RecyclerView r1 = r4.A08
            X.3AW r0 = r1.mState
            int r11 = r0.A00()
            java.lang.String r8 = r1.A0a()
            r9 = r2
            r10 = r2
            java.lang.String r1 = X.002.A0z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AN.A05(int, long):X.3kE");
    }

    public final void A06() {
        this.A05.clear();
        A07();
    }

    public final void A07() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            A09(size);
        }
        arrayList.clear();
        float f = RecyclerView.A1E;
        AnonymousClass3AU r2 = this.A08.A09;
        int[] iArr = r2.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = 0;
    }

    public final void A08() {
        int i;
        C252553pI r0 = this.A08.A0D;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        this.A01 = this.A00 + i;
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A01) {
                A09(size);
            } else {
                return;
            }
        }
    }

    public final void A09(int i) {
        float f = RecyclerView.A1E;
        ArrayList arrayList = this.A06;
        A0E((C249703kE) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r0.onFailedToRecycleView(r11) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C249703kE r11) {
        /*
            r10 = this;
            X.3AN r1 = r11.mScrapContainer
            r0 = 0
            if (r1 == 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x010e
            android.view.View r0 = r11.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x010e
            boolean r0 = r11.isTmpDetached()
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r11.shouldIgnore()
            if (r0 != 0) goto L_0x00dc
            boolean r9 = r11.doesTransientStatePreventRecycling()
            androidx.recyclerview.widget.RecyclerView r5 = r10.A08
            X.2Rw r0 = r5.A0A
            if (r0 == 0) goto L_0x0031
            if (r9 == 0) goto L_0x0031
            boolean r0 = r0.onFailedToRecycleView(r11)
            r1 = 1
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1C
            if (r0 == 0) goto L_0x005c
            java.util.ArrayList r0 = r10.A06
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x005c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "cached view received recycle internal? "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r5.A0a()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005c:
            if (r1 != 0) goto L_0x0082
            boolean r0 = r11.isRecyclable()
            if (r0 != 0) goto L_0x0082
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1D
            if (r0 == 0) goto L_0x006b
            r5.A0a()
        L_0x006b:
            r3 = 0
        L_0x006c:
            X.3AO r0 = r5.A10
            r0.A04(r11)
            if (r2 != 0) goto L_0x0081
            if (r3 != 0) goto L_0x0081
            if (r9 == 0) goto L_0x0081
            android.view.View r0 = r11.itemView
            X.C275604qc.A01(r0)
            r0 = 0
            r11.mBindingAdapter = r0
            r11.mOwnerRecyclerView = r0
        L_0x0081:
            return
        L_0x0082:
            int r1 = r10.A01
            if (r1 <= 0) goto L_0x00d8
            r0 = 526(0x20e, float:7.37E-43)
            boolean r0 = r11.hasAnyOfTheFlags(r0)
            if (r0 != 0) goto L_0x00d8
            java.util.ArrayList r8 = r10.A06
            int r7 = r8.size()
            if (r7 < r1) goto L_0x009b
            r10.A09(r2)
            int r7 = r7 + -1
        L_0x009b:
            if (r7 <= 0) goto L_0x00d3
            X.3AU r6 = r5.A09
            int r4 = r11.mPosition
            int[] r3 = r6.A03
            if (r3 == 0) goto L_0x00b3
            int r0 = r6.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00b3
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00d3
            int r1 = r1 + 2
            goto L_0x00aa
        L_0x00b3:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x00d1
            java.lang.Object r0 = r8.get(r7)
            X.3kE r0 = (X.C249703kE) r0
            int r4 = r0.mPosition
            int[] r3 = r6.A03
            if (r3 == 0) goto L_0x00d1
            int r0 = r6.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x00c8:
            if (r1 >= r2) goto L_0x00d1
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b3
            int r1 = r1 + 2
            goto L_0x00c8
        L_0x00d1:
            int r7 = r7 + 1
        L_0x00d3:
            r8.add(r7, r11)
            r2 = 1
            goto L_0x006b
        L_0x00d8:
            r10.A0E(r11, r3)
            goto L_0x006c
        L_0x00dc:
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0a()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.append(r0)
            r1.append(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0a()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x010e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Scrapped or attached views may not be recycled. isScrap:"
            r3.append(r0)
            X.3AN r1 = r11.mScrapContainer
            r0 = 0
            if (r1 == 0) goto L_0x011e
            r0 = 1
        L_0x011e:
            r3.append(r0)
            java.lang.String r0 = " isAttached:"
            r3.append(r0)
            android.view.View r0 = r11.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x012f
            r2 = 1
        L_0x012f:
            r3.append(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0a()
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AN.A0C(X.3kE):void");
    }

    public final void A0D(C249703kE r2) {
        ArrayList arrayList;
        if (r2.mInChangeScrap) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(r2);
        r2.mScrapContainer = null;
        r2.mInChangeScrap = false;
        r2.clearReturnedFromScrapFlag();
    }

    public final void A0A(View view) {
        C249703kE A062 = RecyclerView.A06(view);
        if (A062.isTmpDetached()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A062.mScrapContainer != null) {
            A062.unScrap();
        } else if (A062.wasReturnedFromScrap()) {
            A062.clearReturnedFromScrapFlag();
        }
        A0C(A062);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0C != null && !A062.isRecyclable()) {
            recyclerView.A0C.A0K(A062);
        }
    }

    public final void A0B(View view) {
        ArrayList arrayList;
        AnonymousClass3AS r2;
        C249703kE A062 = RecyclerView.A06(view);
        if ((A062.mFlags & 12) == 0 && A062.isUpdated() && (r2 = this.A08.A0C) != null) {
            List unmodifiedPayloads = A062.getUnmodifiedPayloads();
            if (((!(r2 instanceof AnonymousClass3AQ) && !(r2 instanceof AnonymousClass4CO)) || unmodifiedPayloads.isEmpty()) && !r2.A0H(A062)) {
                arrayList = this.A04;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.A04 = arrayList;
                }
                A062.setScrapContainer(this, true);
                arrayList.add(A062);
            }
        }
        if (A062.isInvalid() && !A062.isRemoved()) {
            RecyclerView recyclerView = this.A08;
            if (!recyclerView.A0A.hasStableIds()) {
                throw new IllegalArgumentException(002.A0R("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.", recyclerView.A0a()));
            }
        }
        A062.setScrapContainer(this, false);
        arrayList = this.A05;
        arrayList.add(A062);
    }

    public final void A0E(C249703kE r9, boolean z) {
        02Z r0;
        RecyclerView.A0K(r9);
        View view = r9.itemView;
        RecyclerView recyclerView = this.A08;
        C238073Al r02 = recyclerView.A0J;
        if (r02 != null) {
            C238083Am A0a = r02.A0a();
            if (A0a instanceof C238083Am) {
                r0 = (02Z) A0a.A00.remove(view);
            } else {
                r0 = null;
            }
            03v.A0B(view, r0);
        }
        if (z) {
            JLS jls = recyclerView.A0H;
            if (jls != null) {
                ((IE9) jls).A00(r9.itemView, true);
            }
            List list = recyclerView.A14;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((IE9) ((JLS) list.get(i))).A00(r9.itemView, true);
            }
            2Rw r03 = recyclerView.A0A;
            if (r03 != null) {
                r03.onViewRecycled(r9);
            }
            if (recyclerView.mState != null) {
                recyclerView.A10.A04(r9);
            }
        }
        r9.mBindingAdapter = null;
        r9.mOwnerRecyclerView = null;
        if (this.A02 == null) {
            this.A02 = new AnonymousClass3BD();
            A01(this);
        }
        this.A02.A03(r9);
    }

    public final View A04(int i) {
        return A05(i, Long.MAX_VALUE).itemView;
    }
}
