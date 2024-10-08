package com.facebook.rtc.views.omnigrid;

import X.002;
import X.00k;
import X.0KC;
import X.0eP;
import X.0fh;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3MX;
import X.AnonymousClass7TE;
import X.C15048ULb;
import X.C252553pI;
import X.C59721JVf;
import X.C68056MzN;
import X.C68152N2s;
import X.C68166N3g;
import X.C69671Npt;
import X.C70982OUv;
import X.C73599Pga;
import X.N48;
import X.N4M;
import X.NE7;
import X.NE8;
import X.NE9;
import X.OSV;
import X.ULT;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class OmniGridLayoutManager extends C252553pI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MotionEvent A04;
    public ULT A05;
    public C59721JVf A06 = new C59721JVf(new N4M((GridSelfViewLocation) null, (C69671Npt) NE8.A00(20), (C69671Npt) NE8.A00(20), (C69671Npt) NE8.A00(20), (C69671Npt) NE8.A00(20), (C69671Npt) NE8.A00(10), (C69671Npt) NE8.A00(10), (C69671Npt) null, (C69671Npt) null, (Object) null, 32704, false, false, false, false), (0sP) C73599Pga.A00);
    public N48 A07;
    public N48 A08;
    public ImmutableList A09;
    public Map A0A;
    public Map A0B;
    public 0eP A0C;
    public boolean A0D;
    public final Context A0E;
    public final Set A0F = new CopyOnWriteArraySet();
    public final 0sP A0G;

    public final AnonymousClass3MX A0Z() {
        return new AnonymousClass3MX(-2, -2);
    }

    public final void A0s(AnonymousClass3AN r5, RecyclerView recyclerView) {
        0qQ.A0B(r5, 1);
        A0u(recyclerView);
        for (C70982OUv oUv : this.A0F) {
            OmniGridView omniGridView = oUv.A00;
            omniGridView.A0C = false;
            if (OSV.A00(omniGridView.A02) != null) {
                if (omniGridView.A05 == null) {
                    0qQ.A0F("gridSelfItemDefinition");
                    throw AnonymousClass00P.createAndThrow();
                }
                C68056MzN mzN = omniGridView.A03;
                if (mzN != null) {
                    NE7 ne7 = (NE7) mzN;
                    0qQ.A0B(ne7, 0);
                    ne7.A01.A01();
                }
            }
        }
        A0o(r5);
        r5.A06();
    }

    public final void A1F(AccessibilityEvent accessibilityEvent) {
        0qQ.A0B(accessibilityEvent, 0);
        super.A1F(accessibilityEvent);
        if (this.A09.size() > 0) {
            accessibilityEvent.setFromIndex(AnonymousClass7TE.A0M(00k.A0I(this.A09)));
            accessibilityEvent.setToIndex(AnonymousClass7TE.A0M(00k.A0K(this.A09)));
        }
    }

    public final int A1K(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        int i2;
        int i3;
        0qQ.A0B(r4, 1);
        0fh.A01("OmniGridLayoutManager.scrollHorizontallyBy", 1591770204);
        try {
            if (A01()) {
                int i4 = this.A00 + i;
                int i5 = -Ba9();
                int A002 = N48.A00(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A002) {
                    i4 = A002;
                }
                int i6 = this.A00;
                i2 = i4 - i6;
                if (i2 != 0) {
                    if (i4 != i6) {
                        this.A00 = i4;
                    }
                    A00(r4);
                    i3 = 437231449;
                    0fh.A00(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 200977065;
            0fh.A00(i3);
            return i2;
        } catch (Throwable th) {
            0fh.A00(-2095536464);
            throw th;
        }
    }

    public final int A1L(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        int i2;
        int i3;
        0qQ.A0B(r4, 1);
        0fh.A01("OmniGridLayoutManager.scrollVerticallyBy", 184863535);
        try {
            if (A01()) {
                int i4 = this.A01 + i;
                int i5 = -BaC();
                int A012 = N48.A01(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A012) {
                    i4 = A012;
                }
                int i6 = this.A01;
                i2 = i4 - i6;
                if (i2 != 0) {
                    if (i4 != i6) {
                        this.A01 = i4;
                    }
                    A00(r4);
                    i3 = -130360530;
                    0fh.A00(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 1718081848;
            0fh.A00(i3);
            return i2;
        } catch (Throwable th) {
            0fh.A00(-348967628);
            throw th;
        }
    }

    public final void A1O(int i) {
        if (A02(i, 0, 0)) {
            A0b();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd A[Catch:{ all -> 0x036a, all -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00db A[Catch:{ all -> 0x036a, all -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4 A[Catch:{ all -> 0x036a, all -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01aa A[Catch:{ all -> 0x036a, all -> 0x0372 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1R(X.AnonymousClass3AN r31, X.AnonymousClass3AW r32) {
        /*
            r30 = this;
            r4 = 0
            r12 = r31
            r14 = r32
            boolean r6 = X.AnonymousClass7TF.A1U(r4, r12, r14)
            java.lang.String r1 = "OmniGridLayoutManager.onLayoutChildren"
            r0 = 1226678599(0x491da147, float:645652.44)
            X.0fh.A01(r1, r0)
            r0 = r30
            r0.A0D = r6     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = "OmniGridLayoutManager.recomputeLayout"
            r1 = -779338742(0xffffffffd18c3c0a, float:-7.5287839E10)
            X.0fh.A01(r2, r1)     // Catch:{ all -> 0x0372 }
            int r1 = r14.A00()     // Catch:{ all -> 0x036a }
            X.2HY r1 = X.C229632nm.A0C(r4, r1)     // Catch:{ all -> 0x036a }
            X.0sP r3 = r0.A0G     // Catch:{ all -> 0x036a }
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)     // Catch:{ all -> 0x036a }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x036a }
        L_0x002f:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x036a }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x036a }
            java.lang.Object r1 = r3.invoke(r1)     // Catch:{ all -> 0x036a }
            r5.add(r1)     // Catch:{ all -> 0x036a }
            goto L_0x002f
        L_0x0041:
            X.JVf r1 = r0.A06     // Catch:{ all -> 0x036a }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x036a }
            X.N4M r2 = (X.N4M) r2     // Catch:{ all -> 0x036a }
            android.content.Context r1 = r0.A0E     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r3 = r2.A02(r1)     // Catch:{ all -> 0x036a }
            int r2 = r0.A03     // Catch:{ all -> 0x036a }
            int r1 = r0.A00     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutInput r11 = new com.facebook.rtc.views.omnigrid.GridLayoutInput     // Catch:{ all -> 0x036a }
            r11.<init>(r5, r3, r2, r1)     // Catch:{ all -> 0x036a }
            X.N48 r1 = r0.A07     // Catch:{ all -> 0x036a }
            r0.A08 = r1     // Catch:{ all -> 0x036a }
            java.util.Map r1 = r0.A0A     // Catch:{ all -> 0x036a }
            r0.A0B = r1     // Catch:{ all -> 0x036a }
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x036a }
            r0.A0A = r1     // Catch:{ all -> 0x036a }
            X.JVf r1 = r0.A06     // Catch:{ all -> 0x036a }
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r11)     // Catch:{ all -> 0x036a }
            X.0eP r1 = r0.A0C     // Catch:{ all -> 0x036a }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x036a }
            if (r1 != 0) goto L_0x02d0
            r0.A0C = r2     // Catch:{ all -> 0x036a }
            java.util.List r10 = r11.items     // Catch:{ all -> 0x036a }
            int r3 = r11.width     // Catch:{ all -> 0x036a }
            int r5 = r11.height     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r1 = r11.config     // Catch:{ all -> 0x036a }
            boolean r1 = r1.skipsDefaultGridLayout     // Catch:{ all -> 0x036a }
            r16 = 0
            if (r1 != 0) goto L_0x02c2
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x036a }
            if (r1 == 0) goto L_0x00a5
            X.0sn r21 = X.0sn.A00     // Catch:{ all -> 0x036a }
            java.lang.Integer r18 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r17 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT     // Catch:{ all -> 0x036a }
            X.N48 r15 = new X.N48     // Catch:{ all -> 0x036a }
            r19 = r18
            r20 = r16
            r22 = r16
            r24 = r5
            r25 = r4
            r26 = r4
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x036a }
        L_0x00a1:
            r0.A07 = r15     // Catch:{ all -> 0x036a }
            goto L_0x02d0
        L_0x00a5:
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r8 = r11.config     // Catch:{ all -> 0x036a }
            boolean r2 = r8.appliesPaddingToFullscreenLayout     // Catch:{ all -> 0x036a }
            if (r2 == 0) goto L_0x00b4
            int r1 = r8.verticalSpacing     // Catch:{ all -> 0x036a }
            if (r1 != 0) goto L_0x00b9
            int r1 = r8.horizontalSpacing     // Catch:{ all -> 0x036a }
            if (r1 == 0) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x036a }
            goto L_0x00bb
        L_0x00b9:
            r20 = r16
        L_0x00bb:
            if (r2 == 0) goto L_0x00db
            int r9 = r8.leftPadding     // Catch:{ all -> 0x036a }
            int r7 = r8.topPadding     // Catch:{ all -> 0x036a }
            int r2 = r11.width     // Catch:{ all -> 0x036a }
            int r1 = r8.rightPadding     // Catch:{ all -> 0x036a }
            int r2 = r2 - r1
            int r1 = r11.height     // Catch:{ all -> 0x036a }
            int r13 = r8.bottomPadding     // Catch:{ all -> 0x036a }
            int r1 = r1 - r13
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r9
            r24 = r7
            r25 = r2
            r26 = r1
            r27 = r4
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
            goto L_0x00ee
        L_0x00db:
            int r2 = r11.width     // Catch:{ all -> 0x036a }
            int r1 = r11.height     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r4
            r24 = r4
            r25 = r2
            r26 = r1
            r27 = r4
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
        L_0x00ee:
            int r1 = r10.size()     // Catch:{ all -> 0x036a }
            if (r1 != r6) goto L_0x01aa
            java.lang.Object r2 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r2 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r2     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r1 = r11.config     // Catch:{ all -> 0x036a }
            boolean r1 = r1.aspectFillFullscreenSingleItem     // Catch:{ all -> 0x036a }
            if (r1 == 0) goto L_0x014e
            X.0qQ.A0B(r2, r4)     // Catch:{ all -> 0x036a }
            r8 = 1
            boolean r7 = X.JTQ.A1P(r5, r3)
            com.facebook.rtc.views.omnigrid.GridItemSize r1 = r2.videoSize     // Catch:{ all -> 0x036a }
            int r11 = r1.height     // Catch:{ all -> 0x036a }
            int r9 = r1.width     // Catch:{ all -> 0x036a }
            if (r11 >= r9) goto L_0x0111
            r8 = 0
        L_0x0111:
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x013e
            boolean r1 = r2.isVideoOff     // Catch:{ all -> 0x036a }
            if (r1 != 0) goto L_0x013e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = 2
            if (r7 == 0) goto L_0x0162
            float r8 = (float) r3     // Catch:{ all -> 0x036a }
            float r8 = r8 * r1
            float r1 = (float) r9     // Catch:{ all -> 0x036a }
            float r8 = r8 / r1
            float r7 = (float) r11     // Catch:{ all -> 0x036a }
            float r7 = r7 * r8
            int r1 = r5 / r10
            float r8 = (float) r1     // Catch:{ all -> 0x036a }
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r7 / r1
            float r8 = r8 - r1
            float r7 = r7 + r8
            long r1 = r2.id     // Catch:{ all -> 0x036a }
            int r8 = (int) r8     // Catch:{ all -> 0x036a }
            int r7 = (int) r7     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r4
            r24 = r8
            r25 = r3
            r26 = r7
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
            goto L_0x0182
        L_0x013e:
            long r1 = r2.id     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r4
            r24 = r4
            r25 = r3
            r26 = r5
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
            goto L_0x0182
        L_0x014e:
            long r1 = r2.id     // Catch:{ all -> 0x036a }
            java.lang.Integer r23 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x036a }
            java.lang.Integer r18 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x036a }
            X.N2s r21 = new X.N2s     // Catch:{ all -> 0x036a }
            r24 = r18
            r25 = r4
            r26 = r1
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
            goto L_0x0193
        L_0x0162:
            float r7 = (float) r5     // Catch:{ all -> 0x036a }
            float r7 = r7 * r1
            float r1 = (float) r11     // Catch:{ all -> 0x036a }
            float r7 = r7 / r1
            float r9 = (float) r9     // Catch:{ all -> 0x036a }
            float r9 = r9 * r7
            int r1 = r3 / r10
            float r7 = (float) r1     // Catch:{ all -> 0x036a }
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r9 / r1
            float r7 = r7 - r1
            float r9 = r9 + r7
            long r1 = r2.id     // Catch:{ all -> 0x036a }
            int r8 = (int) r7     // Catch:{ all -> 0x036a }
            int r7 = (int) r9     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r8
            r24 = r4
            r25 = r7
            r26 = r5
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
        L_0x0182:
            java.lang.Integer r23 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x036a }
            java.lang.Integer r18 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x036a }
            X.N2s r21 = new X.N2s     // Catch:{ all -> 0x036a }
            r24 = r18
            r25 = r4
            r26 = r1
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
        L_0x0193:
            java.util.List r21 = X.AnonymousClass7TE.A1I(r21)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r17 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT     // Catch:{ all -> 0x036a }
            X.N48 r15 = new X.N48     // Catch:{ all -> 0x036a }
            r19 = r18
            r22 = r16
            r24 = r5
            r26 = r4
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x036a }
            goto L_0x00a1
        L_0x01aa:
            int r1 = r10.size()     // Catch:{ all -> 0x036a }
            r2 = 2
            if (r1 != r2) goto L_0x023e
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r1 = r11.config     // Catch:{ all -> 0x036a }
            boolean r1 = r1.forcesHorizontalLayoutForTwoPersonLayout     // Catch:{ all -> 0x036a }
            if (r1 == 0) goto L_0x023e
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x036a }
            java.lang.Object r1 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r1 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r1     // Catch:{ all -> 0x036a }
            boolean r2 = r1.isSelf     // Catch:{ all -> 0x036a }
            if (r2 == 0) goto L_0x0239
            java.lang.Object r1 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
        L_0x01c9:
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r1 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r1     // Catch:{ all -> 0x036a }
            if (r2 == 0) goto L_0x0234
            java.lang.Object r9 = X.00k.A0K(r10)     // Catch:{ all -> 0x036a }
        L_0x01d1:
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r9 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r9     // Catch:{ all -> 0x036a }
            long r1 = r1.id     // Catch:{ all -> 0x036a }
            int r10 = r3 / 2
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r23 = r4
            r24 = r4
            r25 = r10
            r26 = r5
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x036a }
            java.lang.Integer r23 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x036a }
            java.lang.Integer r18 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x036a }
            X.N2s r8 = new X.N2s     // Catch:{ all -> 0x036a }
            r21 = r8
            r24 = r18
            r25 = r4
            r26 = r1
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
            r7.add(r8)     // Catch:{ all -> 0x036a }
            long r1 = r9.id     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r24 = r22
            r25 = r10
            r26 = r4
            r27 = r3
            r28 = r5
            r29 = r4
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x036a }
            X.N2s r8 = new X.N2s     // Catch:{ all -> 0x036a }
            r21 = r8
            r24 = r18
            r25 = r4
            r26 = r1
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
            r7.add(r8)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r17 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT     // Catch:{ all -> 0x036a }
            X.N48 r15 = new X.N48     // Catch:{ all -> 0x036a }
            r19 = r18
            r22 = r16
            r24 = r5
            r26 = r4
            r21 = r7
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x036a }
            goto L_0x00a1
        L_0x0234:
            java.lang.Object r9 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
            goto L_0x01d1
        L_0x0239:
            java.lang.Object r1 = X.00k.A0K(r10)     // Catch:{ all -> 0x036a }
            goto L_0x01c9
        L_0x023e:
            int r1 = r10.size()     // Catch:{ all -> 0x036a }
            if (r1 != r2) goto L_0x02c2
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r1 = r11.config     // Catch:{ all -> 0x036a }
            boolean r1 = r1.disablesFloatingSelfView     // Catch:{ all -> 0x036a }
            if (r1 != 0) goto L_0x02c2
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x036a }
            java.lang.Object r1 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r1 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r1     // Catch:{ all -> 0x036a }
            boolean r9 = r1.isSelf     // Catch:{ all -> 0x036a }
            if (r9 == 0) goto L_0x02bd
            java.lang.Object r2 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
        L_0x025c:
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r2 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r2     // Catch:{ all -> 0x036a }
            if (r9 == 0) goto L_0x02b8
            java.lang.Object r1 = X.00k.A0K(r10)     // Catch:{ all -> 0x036a }
        L_0x0264:
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r1 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r1     // Catch:{ all -> 0x036a }
            long r10 = r1.id     // Catch:{ all -> 0x036a }
            java.lang.Integer r23 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x036a }
            java.lang.Integer r19 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x036a }
            X.N2s r1 = new X.N2s     // Catch:{ all -> 0x036a }
            r21 = r1
            r24 = r19
            r25 = r4
            r26 = r10
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
            r7.add(r1)     // Catch:{ all -> 0x036a }
            r9 = r9 ^ 1
            long r1 = r2.id     // Catch:{ all -> 0x036a }
            X.ULb r22 = new X.ULb     // Catch:{ all -> 0x036a }
            r24 = r22
            r25 = r3
            r26 = r4
            r27 = r3
            r29 = r4
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x036a }
            X.N2s r10 = new X.N2s     // Catch:{ all -> 0x036a }
            r21 = r10
            r24 = r19
            r25 = r4
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x036a }
            r7.add(r9, r10)     // Catch:{ all -> 0x036a }
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r1 = r8.selfViewLocation     // Catch:{ all -> 0x036a }
            java.lang.Integer r18 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x036a }
            X.N48 r15 = new X.N48     // Catch:{ all -> 0x036a }
            r22 = r16
            r24 = r5
            r26 = r4
            r17 = r1
            r21 = r7
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x036a }
            goto L_0x00a1
        L_0x02b8:
            java.lang.Object r1 = X.00k.A0I(r10)     // Catch:{ all -> 0x036a }
            goto L_0x0264
        L_0x02bd:
            java.lang.Object r2 = X.00k.A0K(r10)     // Catch:{ all -> 0x036a }
            goto L_0x025c
        L_0x02c2:
            X.JVf r1 = r0.A06     // Catch:{ all -> 0x036a }
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x036a }
            X.0sP r1 = (X.0sP) r1     // Catch:{ all -> 0x036a }
            java.lang.Object r15 = r1.invoke(r11)     // Catch:{ all -> 0x036a }
            X.N48 r15 = (X.N48) r15     // Catch:{ all -> 0x036a }
            goto L_0x00a1
        L_0x02d0:
            r1 = 2046265774(0x79f789ae, float:1.60661225E35)
            X.0fh.A00(r1)     // Catch:{ all -> 0x0372 }
            int r3 = r0.A00     // Catch:{ all -> 0x0372 }
            r0.A02 = r3     // Catch:{ all -> 0x0372 }
            int r1 = r0.A01     // Catch:{ all -> 0x0372 }
            r0.A03 = r1     // Catch:{ all -> 0x0372 }
            X.ULT r5 = r0.A05     // Catch:{ all -> 0x0372 }
            r1 = 0
            r0.A05 = r1     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x02ef
            int r3 = r5.A01     // Catch:{ all -> 0x0372 }
            int r2 = r5.A02     // Catch:{ all -> 0x0372 }
            int r1 = r5.A03     // Catch:{ all -> 0x0372 }
            r0.A02(r3, r2, r1)     // Catch:{ all -> 0x0372 }
            goto L_0x031e
        L_0x02ef:
            r5 = -1
            if (r3 != r5) goto L_0x02f3
            goto L_0x0304
        L_0x02f3:
            int r1 = r0.Ba9()     // Catch:{ all -> 0x0372 }
            int r2 = -r1
            int r1 = X.N48.A00(r0)     // Catch:{ all -> 0x0372 }
            if (r3 >= r2) goto L_0x0300
            r3 = r2
            goto L_0x0309
        L_0x0300:
            if (r3 <= r1) goto L_0x0309
            r3 = r1
            goto L_0x0309
        L_0x0304:
            int r1 = r0.Ba9()     // Catch:{ all -> 0x0372 }
            int r3 = -r1
        L_0x0309:
            int r1 = r0.A00     // Catch:{ all -> 0x0372 }
            if (r3 == r1) goto L_0x030f
            r0.A00 = r3     // Catch:{ all -> 0x0372 }
        L_0x030f:
            int r3 = r0.A01     // Catch:{ all -> 0x0372 }
            if (r3 != r5) goto L_0x032e
            int r1 = r0.BaC()     // Catch:{ all -> 0x0372 }
            int r3 = -r1
        L_0x0318:
            int r1 = r0.A01     // Catch:{ all -> 0x0372 }
            if (r3 == r1) goto L_0x031e
            r0.A01 = r3     // Catch:{ all -> 0x0372 }
        L_0x031e:
            java.util.Set r3 = r0.A0F     // Catch:{ all -> 0x0372 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0372 }
        L_0x0324:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0372 }
            if (r1 == 0) goto L_0x033f
            r2.next()     // Catch:{ all -> 0x0372 }
            goto L_0x0324
        L_0x032e:
            int r1 = r0.BaC()     // Catch:{ all -> 0x0372 }
            int r2 = -r1
            int r1 = X.N48.A01(r0)     // Catch:{ all -> 0x0372 }
            if (r3 >= r2) goto L_0x033b
            r3 = r2
            goto L_0x0318
        L_0x033b:
            if (r3 <= r1) goto L_0x0318
            r3 = r1
            goto L_0x0318
        L_0x033f:
            r0.A0n(r12)     // Catch:{ all -> 0x0372 }
            r0.A00(r12)     // Catch:{ all -> 0x0372 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x0372 }
        L_0x0349:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0372 }
            if (r1 == 0) goto L_0x0361
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0372 }
            X.OUv r1 = (X.C70982OUv) r1     // Catch:{ all -> 0x0372 }
            com.facebook.rtc.views.omnigridview.OmniGridView r3 = r1.A00     // Catch:{ all -> 0x0372 }
            r2 = 1
            boolean r1 = r14.A0B     // Catch:{ all -> 0x0372 }
            if (r1 == r6) goto L_0x035d
            r2 = 0
        L_0x035d:
            com.facebook.rtc.views.omnigridview.OmniGridView.A03(r3, r2)     // Catch:{ all -> 0x0372 }
            goto L_0x0349
        L_0x0361:
            r0.A0D = r4     // Catch:{ all -> 0x0372 }
            r0 = -671974183(0xffffffffd7f27cd9, float:-5.33236061E14)
            X.0fh.A00(r0)
            return
        L_0x036a:
            r1 = move-exception
            r0 = 576743863(0x226069b7, float:3.0413626E-18)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0372 }
            throw r1     // Catch:{ all -> 0x0372 }
        L_0x0372:
            r1 = move-exception
            r0 = 786969270(0x2ee832b6, float:1.05591466E-10)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.OmniGridLayoutManager.A1R(X.3AN, X.3AW):void");
    }

    public final void A1S(AnonymousClass3AW r3) {
        0qQ.A0B(r3, 0);
        0fh.A01("OmniGridLayoutManager.onLayoutCompleted", -442689273);
        try {
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } finally {
            0fh.A00(-653964021);
        }
    }

    public OmniGridLayoutManager(Context context, 0sP r21) {
        this.A0E = context;
        this.A0G = r21;
        A0w(false);
        0sn r9 = 0sn.A00;
        Integer num = AnonymousClass05K.A00;
        GridSelfViewLocation gridSelfViewLocation = GridSelfViewLocation.TOP_RIGHT;
        Integer num2 = num;
        this.A07 = new N48((Rect) null, gridSelfViewLocation, num, num2, (Integer) null, r9, (List) null, 0, 0, 0, false);
        this.A08 = new N48((Rect) null, gridSelfViewLocation, num, num2, (Integer) null, r9, (List) null, 0, 0, 0, false);
        this.A0A = AnonymousClass7TE.A1H();
        this.A0B = AnonymousClass7TE.A1H();
        this.A00 = -1;
        this.A01 = -1;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A09 = of;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0269, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0270, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass3AN r18) {
        /*
            r17 = this;
            java.lang.String r1 = "OmniGridLayoutManager.updateVisibleItems"
            r0 = 1857655630(0x6eb9934e, float:2.8716404E28)
            X.0fh.A01(r1, r0)
            r12 = r17
            X.ULb r13 = r12.A1a()     // Catch:{ all -> 0x028e }
            com.google.common.collect.ImmutableList$Builder r11 = new com.google.common.collect.ImmutableList$Builder     // Catch:{ all -> 0x028e }
            r11.<init>()     // Catch:{ all -> 0x028e }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x028e }
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()     // Catch:{ all -> 0x028e }
            int r5 = r12.A0T()     // Catch:{ all -> 0x028e }
            r2 = 0
        L_0x0020:
            if (r2 >= r5) goto L_0x0036
            android.view.View r0 = r12.A0X(r2)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x028e }
            int r0 = X.C252553pI.A06(r0)     // Catch:{ all -> 0x028e }
            X.C51967G9n.A1O(r1, r4, r0)     // Catch:{ all -> 0x028e }
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0036:
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x028e }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x028e }
            r10 = 0
            r8 = 0
        L_0x0040:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x028e }
            r6 = r18
            if (r0 == 0) goto L_0x0086
            int r7 = r8 + 1
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x028e }
            X.N2s r5 = (X.C68152N2s) r5     // Catch:{ all -> 0x028e }
            java.lang.Object r2 = X.C51968G9o.A0z(r4, r8)     // Catch:{ all -> 0x028e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x028e }
            X.ULb r0 = r5.A02     // Catch:{ all -> 0x028e }
            float r1 = r0.A00(r13)     // Catch:{ all -> 0x028e }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            boolean r0 = r5.A05     // Catch:{ all -> 0x028e }
            if (r0 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0084
            int r0 = r2.intValue()     // Catch:{ all -> 0x028e }
            android.view.View r0 = r12.A0X(r0)     // Catch:{ all -> 0x028e }
            r12.A0g(r0)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0084
            r6.A0A(r0)     // Catch:{ all -> 0x028e }
            goto L_0x0084
        L_0x0078:
            if (r2 != 0) goto L_0x007d
            X.AnonymousClass7TF.A1M(r3, r8)     // Catch:{ all -> 0x028e }
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x028e }
            r11.add(r0)     // Catch:{ all -> 0x028e }
        L_0x0084:
            r8 = r7
            goto L_0x0040
        L_0x0086:
            int r0 = r12.A0T()     // Catch:{ all -> 0x028e }
            X.2HY r0 = X.C229632nm.A0C(r10, r0)     // Catch:{ all -> 0x028e }
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x028e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x028e }
        L_0x0096:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x00ad
            r0 = r1
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x028e }
            int r0 = r0.A00()     // Catch:{ all -> 0x028e }
            android.view.View r0 = r12.A0X(r0)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0096
            r2.add(r0)     // Catch:{ all -> 0x028e }
            goto L_0x0096
        L_0x00ad:
            java.util.ArrayList r5 = X.00k.A0U(r2)     // Catch:{ all -> 0x028e }
            int r7 = r5.size()     // Catch:{ all -> 0x028e }
            r4 = 1
            int r7 = r7 - r4
            r2 = 0
        L_0x00b8:
            if (r2 >= r7) goto L_0x0127
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r1 = r0.A09     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x028e }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x028e }
            int r0 = X.C252553pI.A06(r0)     // Catch:{ all -> 0x028e }
            java.lang.Object r8 = r1.get(r0)     // Catch:{ all -> 0x028e }
            X.N2s r8 = (X.C68152N2s) r8     // Catch:{ all -> 0x028e }
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r1 = r0.A09     // Catch:{ all -> 0x028e }
            int r2 = r2 + 1
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x028e }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x028e }
            int r0 = X.C252553pI.A06(r0)     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x028e }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x028e }
            int r1 = r8.A00     // Catch:{ all -> 0x028e }
            int r0 = r0.A00     // Catch:{ all -> 0x028e }
            if (r1 <= r0) goto L_0x00b8
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x028e }
        L_0x00ee:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0106
            android.view.View r1 = X.JTO.A0H(r2)     // Catch:{ all -> 0x028e }
            X.3Aj r0 = r12.A05     // Catch:{ all -> 0x028e }
            int r1 = r0.A05(r1)     // Catch:{ all -> 0x028e }
            if (r1 < 0) goto L_0x00ee
            X.3Aj r0 = r12.A05     // Catch:{ all -> 0x028e }
            r0.A08(r1)     // Catch:{ all -> 0x028e }
            goto L_0x00ee
        L_0x0106:
            int r0 = r5.size()     // Catch:{ all -> 0x028e }
            if (r0 <= r4) goto L_0x0114
            X.PcS r0 = new X.PcS     // Catch:{ all -> 0x028e }
            r0.<init>((java.lang.Object) r12, (int) r4)     // Catch:{ all -> 0x028e }
            X.01V.A1D(r5, r0)     // Catch:{ all -> 0x028e }
        L_0x0114:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x028e }
        L_0x0118:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0127
            android.view.View r1 = X.JTO.A0H(r2)     // Catch:{ all -> 0x028e }
            r0 = -1
            r12.A0i(r1, r0)     // Catch:{ all -> 0x028e }
            goto L_0x0118
        L_0x0127:
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x028e }
        L_0x012b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0173
            int r1 = X.AnonymousClass7TG.A0F(r7)     // Catch:{ all -> 0x028e }
            android.view.View r5 = r6.A04(r1)     // Catch:{ all -> 0x028e }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x028e }
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x028e }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x028e }
            int r4 = r0.A00     // Catch:{ all -> 0x028e }
            int r3 = r12.A0T()     // Catch:{ all -> 0x028e }
            r2 = 0
        L_0x014d:
            if (r2 >= r3) goto L_0x016b
            android.view.View r0 = r12.A0X(r2)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0168
            int r1 = X.C252553pI.A06(r0)     // Catch:{ all -> 0x028e }
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x028e }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x028e }
            int r0 = r0.A00     // Catch:{ all -> 0x028e }
            if (r0 < r4) goto L_0x0168
            goto L_0x016f
        L_0x0168:
            int r2 = r2 + 1
            goto L_0x014d
        L_0x016b:
            int r2 = r12.A0T()     // Catch:{ all -> 0x028e }
        L_0x016f:
            r12.A0h(r5, r2)     // Catch:{ all -> 0x028e }
            goto L_0x012b
        L_0x0173:
            int r9 = r12.A0T()     // Catch:{ all -> 0x028e }
        L_0x0177:
            if (r10 >= r9) goto L_0x0271
            android.view.View r14 = r12.A0X(r10)     // Catch:{ all -> 0x028e }
            if (r14 == 0) goto L_0x0265
            int r1 = X.C252553pI.A06(r14)     // Catch:{ all -> 0x028e }
            int r8 = X.C252553pI.A06(r14)     // Catch:{ all -> 0x028e }
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x028e }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x028e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x028e }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x028e }
            boolean r2 = r0.A05     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "OmniGridLayoutManager.layoutView"
            r0 = -623856188(0xffffffffdad0b5c4, float:-2.93733243E16)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x028e }
            X.N48 r0 = r12.A07     // Catch:{ all -> 0x0269 }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x0269 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0269 }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x0269 }
            X.ULb r7 = r0.A02     // Catch:{ all -> 0x0269 }
            r6 = 0
            if (r2 == 0) goto L_0x01ac
            r5 = 0
            goto L_0x01b2
        L_0x01ac:
            int r0 = r13.A01     // Catch:{ all -> 0x0269 }
            int r5 = -r0
            int r0 = r13.A03     // Catch:{ all -> 0x0269 }
            int r6 = -r0
        L_0x01b2:
            int r1 = r7.A01     // Catch:{ all -> 0x0269 }
            int r4 = r1 + r5
            int r3 = r7.A03     // Catch:{ all -> 0x0269 }
            int r2 = r3 + r6
            boolean r0 = r14.isLayoutRequested()     // Catch:{ all -> 0x0269 }
            if (r0 != 0) goto L_0x021f
            int r15 = r7.A02     // Catch:{ all -> 0x0269 }
            int r0 = r7.A01     // Catch:{ all -> 0x0269 }
            int r15 = r15 - r0
            int r0 = r14.getWidth()     // Catch:{ all -> 0x0269 }
            if (r15 != r0) goto L_0x021f
            int r15 = r7.A00     // Catch:{ all -> 0x0269 }
            int r0 = r7.A03     // Catch:{ all -> 0x0269 }
            int r15 = r15 - r0
            int r0 = r14.getHeight()     // Catch:{ all -> 0x0269 }
            if (r15 != r0) goto L_0x021f
            int r0 = r14.getLeft()     // Catch:{ all -> 0x0269 }
            if (r0 == r4) goto L_0x01fa
            java.util.Set r0 = r12.A0F     // Catch:{ all -> 0x0269 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0269 }
        L_0x01e2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0269 }
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0269 }
            X.OUv r0 = (X.C70982OUv) r0     // Catch:{ all -> 0x0269 }
            r0.A00(r8)     // Catch:{ all -> 0x0269 }
            goto L_0x01e2
        L_0x01f2:
            int r0 = r14.getLeft()     // Catch:{ all -> 0x0269 }
            int r4 = r4 - r0
            r14.offsetLeftAndRight(r4)     // Catch:{ all -> 0x0269 }
        L_0x01fa:
            int r0 = r14.getTop()     // Catch:{ all -> 0x0269 }
            if (r0 == r2) goto L_0x025f
            java.util.Set r0 = r12.A0F     // Catch:{ all -> 0x0269 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0269 }
        L_0x0206:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0269 }
            if (r0 == 0) goto L_0x0216
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0269 }
            X.OUv r0 = (X.C70982OUv) r0     // Catch:{ all -> 0x0269 }
            r0.A00(r8)     // Catch:{ all -> 0x0269 }
            goto L_0x0206
        L_0x0216:
            int r0 = r14.getTop()     // Catch:{ all -> 0x0269 }
            int r2 = r2 - r0
            r14.offsetTopAndBottom(r2)     // Catch:{ all -> 0x0269 }
            goto L_0x025f
        L_0x021f:
            java.util.Set r0 = r12.A0F     // Catch:{ all -> 0x0269 }
            r16 = r0
            java.util.Iterator r15 = r16.iterator()     // Catch:{ all -> 0x0269 }
        L_0x0227:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0269 }
            if (r0 == 0) goto L_0x0231
            r15.next()     // Catch:{ all -> 0x0269 }
            goto L_0x0227
        L_0x0231:
            int r15 = r7.A02     // Catch:{ all -> 0x0269 }
            int r0 = r15 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)     // Catch:{ all -> 0x0269 }
            int r7 = r7.A00     // Catch:{ all -> 0x0269 }
            int r3 = r7 - r3
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)     // Catch:{ all -> 0x0269 }
            r14.measure(r0, r1)     // Catch:{ all -> 0x0269 }
            java.util.Iterator r1 = r16.iterator()     // Catch:{ all -> 0x0269 }
        L_0x024a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0269 }
            if (r0 == 0) goto L_0x025a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0269 }
            X.OUv r0 = (X.C70982OUv) r0     // Catch:{ all -> 0x0269 }
            r0.A00(r8)     // Catch:{ all -> 0x0269 }
            goto L_0x024a
        L_0x025a:
            int r15 = r15 + r5
            int r7 = r7 + r6
            X.C252553pI.A08(r14, r4, r2, r15, r7)     // Catch:{ all -> 0x0269 }
        L_0x025f:
            r0 = -1162334964(0xffffffffbab82d0c, float:-0.0014051511)
            X.0fh.A00(r0)     // Catch:{ all -> 0x028e }
        L_0x0265:
            int r10 = r10 + 1
            goto L_0x0177
        L_0x0269:
            r1 = move-exception
            r0 = -2004132400(0xffffffff888b5dd0, float:-8.387813E-34)
            X.0fh.A00(r0)     // Catch:{ all -> 0x028e }
            throw r1     // Catch:{ all -> 0x028e }
        L_0x0271:
            com.google.common.collect.ImmutableList r0 = r11.build()     // Catch:{ all -> 0x028e }
            r12.A09 = r0     // Catch:{ all -> 0x028e }
            java.util.Set r0 = r12.A0F     // Catch:{ all -> 0x028e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x028e }
        L_0x027d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0287
            r1.next()     // Catch:{ all -> 0x028e }
            goto L_0x027d
        L_0x0287:
            r0 = -1285855510(0xffffffffb35b66ea, float:-5.108351E-8)
            X.0fh.A00(r0)
            return
        L_0x028e:
            r1 = move-exception
            r0 = -414916334(0xffffffffe744e112, float:-9.2973565E23)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.OmniGridLayoutManager.A00(X.3AN):void");
    }

    private final boolean A01() {
        MotionEvent motionEvent = this.A04;
        Rect rect = this.A07.A00;
        if (motionEvent == null || rect == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    private final boolean A02(int i, int i2, int i3) {
        if (i < this.A07.A09.size()) {
            C15048ULb uLb = ((C68152N2s) this.A07.A09.get(i)).A02;
            int i4 = uLb.A01 - i2;
            int i5 = -Ba9();
            int A002 = N48.A00(this);
            if (i4 < i5) {
                i4 = i5;
            } else if (i4 > A002) {
                i4 = A002;
            }
            if (i4 != this.A00) {
                this.A00 = i4;
            }
            int i6 = uLb.A03 - i3;
            int i7 = -BaC();
            int A012 = N48.A01(this);
            if (i6 < i7) {
                i6 = i7;
            } else if (i6 > A012) {
                i6 = A012;
            }
            if (i6 == this.A01) {
                return true;
            }
            this.A01 = i6;
            return true;
        }
        0KC.A0D("OmniGridLayoutManager", 002.A0O("Cannot scroll to ", i));
        return false;
    }

    public final void A1U(RecyclerView recyclerView) {
        for (C70982OUv oUv : this.A0F) {
            OmniGridView omniGridView = oUv.A00;
            omniGridView.A0C = true;
            C68166N3g A002 = OSV.A00(omniGridView.A02);
            if (A002 != null) {
                NE9 ne9 = omniGridView.A05;
                if (ne9 == null) {
                    0qQ.A0F("gridSelfItemDefinition");
                    throw AnonymousClass00P.createAndThrow();
                }
                ne9.A02(omniGridView, omniGridView, A002);
            }
        }
    }

    public final boolean A1X() {
        if (this.A07.A04 != 1 || !A01()) {
            return false;
        }
        return true;
    }

    public final boolean A1Y() {
        if (this.A07.A04 != 2 || !A01()) {
            return false;
        }
        return true;
    }

    public final C15048ULb A1a() {
        int Ba9 = this.A00 + Ba9();
        int BaC = this.A01 + BaC();
        return new C15048ULb(Ba9, BaC, ((this.A03 + Ba9) - Ba9()) - BaB(), ((this.A00 + BaC) - BaC()) - Ba8(), 0);
    }
}
