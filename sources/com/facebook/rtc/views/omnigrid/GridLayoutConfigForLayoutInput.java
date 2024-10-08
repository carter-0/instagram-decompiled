package com.facebook.rtc.views.omnigrid;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249703kE;
import com.facebook.common.dextricks.Constants;

public final class GridLayoutConfigForLayoutInput extends AnonymousClass0T0 {
    public final boolean appliesPaddingToFullscreenLayout;
    public final boolean aspectFillFullscreenSingleItem;
    public final int bottomInset;
    public final int bottomPadding;
    public final boolean disablesFloatingSelfView;
    public final boolean forcesHorizontalLayoutForTwoPersonLayout;
    public final int horizontalSpacing;
    public final int itemHeightOffset;
    public final Object layoutExtras;
    public final int leftPadding;
    public final int rightPadding;
    public final GridSelfViewLocation selfViewLocation;
    public final boolean skipsDefaultGridLayout;
    public final int topPadding;
    public final int verticalSpacing;

    public static /* synthetic */ GridLayoutConfigForLayoutInput copy$default(GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj, int i9, Object obj2) {
        int i10 = i4;
        int i11 = i3;
        int i12 = i6;
        int i13 = i5;
        int i14 = i8;
        int i15 = i7;
        boolean z6 = z2;
        boolean z7 = z;
        boolean z8 = z4;
        boolean z9 = z3;
        GridSelfViewLocation gridSelfViewLocation2 = gridSelfViewLocation;
        boolean z10 = z5;
        int i16 = i9;
        Object obj3 = obj;
        if ((i9 & 1) != 0) {
            i = gridLayoutConfigForLayoutInput.leftPadding;
        }
        if ((i9 & 2) != 0) {
            i2 = gridLayoutConfigForLayoutInput.rightPadding;
        }
        if ((i9 & 4) != 0) {
            i11 = gridLayoutConfigForLayoutInput.topPadding;
        }
        if ((i9 & 8) != 0) {
            i10 = gridLayoutConfigForLayoutInput.bottomPadding;
        }
        if ((i9 & 16) != 0) {
            i13 = gridLayoutConfigForLayoutInput.horizontalSpacing;
        }
        if ((i9 & 32) != 0) {
            i12 = gridLayoutConfigForLayoutInput.verticalSpacing;
        }
        if ((i9 & 64) != 0) {
            i15 = gridLayoutConfigForLayoutInput.bottomInset;
        }
        if ((i16 & 128) != 0) {
            i14 = gridLayoutConfigForLayoutInput.itemHeightOffset;
        }
        if ((i16 & 256) != 0) {
            z7 = gridLayoutConfigForLayoutInput.disablesFloatingSelfView;
        }
        if ((i16 & 512) != 0) {
            z6 = gridLayoutConfigForLayoutInput.skipsDefaultGridLayout;
        }
        if ((i16 & 1024) != 0) {
            z9 = gridLayoutConfigForLayoutInput.forcesHorizontalLayoutForTwoPersonLayout;
        }
        if ((i16 & C249703kE.FLAG_MOVED) != 0) {
            z8 = gridLayoutConfigForLayoutInput.appliesPaddingToFullscreenLayout;
        }
        if ((i16 & 4096) != 0) {
            z10 = gridLayoutConfigForLayoutInput.aspectFillFullscreenSingleItem;
        }
        if ((i16 & 8192) != 0) {
            gridSelfViewLocation2 = gridLayoutConfigForLayoutInput.selfViewLocation;
        }
        if ((i16 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            obj3 = gridLayoutConfigForLayoutInput.layoutExtras;
        }
        return gridLayoutConfigForLayoutInput.copy(i, i2, i11, i10, i13, i12, i15, i14, z7, z6, z9, z8, z10, gridSelfViewLocation2, obj3);
    }

    public final int component1() {
        return this.leftPadding;
    }

    public final boolean component10() {
        return this.skipsDefaultGridLayout;
    }

    public final boolean component11() {
        return this.forcesHorizontalLayoutForTwoPersonLayout;
    }

    public final boolean component12() {
        return this.appliesPaddingToFullscreenLayout;
    }

    public final boolean component13() {
        return this.aspectFillFullscreenSingleItem;
    }

    public final GridSelfViewLocation component14() {
        return this.selfViewLocation;
    }

    public final Object component15() {
        return this.layoutExtras;
    }

    public final int component2() {
        return this.rightPadding;
    }

    public final int component3() {
        return this.topPadding;
    }

    public final int component4() {
        return this.bottomPadding;
    }

    public final int component5() {
        return this.horizontalSpacing;
    }

    public final int component6() {
        return this.verticalSpacing;
    }

    public final int component7() {
        return this.bottomInset;
    }

    public final int component8() {
        return this.itemHeightOffset;
    }

    public final boolean component9() {
        return this.disablesFloatingSelfView;
    }

    public final GridLayoutConfigForLayoutInput copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj) {
        GridSelfViewLocation gridSelfViewLocation2 = gridSelfViewLocation;
        0qQ.A0B(gridSelfViewLocation2, 13);
        return new GridLayoutConfigForLayoutInput(i, i2, i3, i4, i5, i6, i7, i8, z, z2, z3, z4, z5, gridSelfViewLocation2, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutConfigForLayoutInput) {
                GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput = (GridLayoutConfigForLayoutInput) obj;
                if (!(this.leftPadding == gridLayoutConfigForLayoutInput.leftPadding && this.rightPadding == gridLayoutConfigForLayoutInput.rightPadding && this.topPadding == gridLayoutConfigForLayoutInput.topPadding && this.bottomPadding == gridLayoutConfigForLayoutInput.bottomPadding && this.horizontalSpacing == gridLayoutConfigForLayoutInput.horizontalSpacing && this.verticalSpacing == gridLayoutConfigForLayoutInput.verticalSpacing && this.bottomInset == gridLayoutConfigForLayoutInput.bottomInset && this.itemHeightOffset == gridLayoutConfigForLayoutInput.itemHeightOffset && this.disablesFloatingSelfView == gridLayoutConfigForLayoutInput.disablesFloatingSelfView && this.skipsDefaultGridLayout == gridLayoutConfigForLayoutInput.skipsDefaultGridLayout && this.forcesHorizontalLayoutForTwoPersonLayout == gridLayoutConfigForLayoutInput.forcesHorizontalLayoutForTwoPersonLayout && this.appliesPaddingToFullscreenLayout == gridLayoutConfigForLayoutInput.appliesPaddingToFullscreenLayout && this.aspectFillFullscreenSingleItem == gridLayoutConfigForLayoutInput.aspectFillFullscreenSingleItem && this.selfViewLocation == gridLayoutConfigForLayoutInput.selfViewLocation && 0qQ.A0K(this.layoutExtras, gridLayoutConfigForLayoutInput.layoutExtras))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public GridLayoutConfigForLayoutInput(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj) {
        0qQ.A0B(gridSelfViewLocation, 14);
        this.leftPadding = i;
        this.rightPadding = i2;
        this.topPadding = i3;
        this.bottomPadding = i4;
        this.horizontalSpacing = i5;
        this.verticalSpacing = i6;
        this.bottomInset = i7;
        this.itemHeightOffset = i8;
        this.disablesFloatingSelfView = z;
        this.skipsDefaultGridLayout = z2;
        this.forcesHorizontalLayoutForTwoPersonLayout = z3;
        this.appliesPaddingToFullscreenLayout = z4;
        this.aspectFillFullscreenSingleItem = z5;
        this.selfViewLocation = gridSelfViewLocation;
        this.layoutExtras = obj;
    }

    public final boolean getAppliesPaddingToFullscreenLayout() {
        return this.appliesPaddingToFullscreenLayout;
    }

    public final boolean getAspectFillFullscreenSingleItem() {
        return this.aspectFillFullscreenSingleItem;
    }

    public final int getBottomInset() {
        return this.bottomInset;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final boolean getDisablesFloatingSelfView() {
        return this.disablesFloatingSelfView;
    }

    public final boolean getForcesHorizontalLayoutForTwoPersonLayout() {
        return this.forcesHorizontalLayoutForTwoPersonLayout;
    }

    public final int getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    public final int getItemHeightOffset() {
        return this.itemHeightOffset;
    }

    public final Object getLayoutExtras() {
        return this.layoutExtras;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    public final GridSelfViewLocation getSelfViewLocation() {
        return this.selfViewLocation;
    }

    public final boolean getSkipsDefaultGridLayout() {
        return this.skipsDefaultGridLayout;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public final int getVerticalSpacing() {
        return this.verticalSpacing;
    }

    public int hashCode() {
        return AnonymousClass7TF.A07(this.selfViewLocation, AnonymousClass7TF.A09(this.aspectFillFullscreenSingleItem, AnonymousClass7TF.A09(this.appliesPaddingToFullscreenLayout, AnonymousClass7TF.A09(this.forcesHorizontalLayoutForTwoPersonLayout, AnonymousClass7TF.A09(this.skipsDefaultGridLayout, AnonymousClass7TF.A09(this.disablesFloatingSelfView, ((((((((((((((this.leftPadding * 31) + this.rightPadding) * 31) + this.topPadding) * 31) + this.bottomPadding) * 31) + this.horizontalSpacing) * 31) + this.verticalSpacing) * 31) + this.bottomInset) * 31) + this.itemHeightOffset) * 31)))))) + AnonymousClass7TG.A0C(this.layoutExtras);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GridLayoutConfigForLayoutInput(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, com.facebook.rtc.views.omnigrid.GridSelfViewLocation r32, java.lang.Object r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r3 = r19
            r16 = r32
            r4 = r20
            r17 = r33
            r5 = r21
            r0 = r34
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r1 = r34 & 1
            r15 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
        L_0x001c:
            r1 = r34 & 2
            if (r1 == 0) goto L_0x0021
            r4 = 0
        L_0x0021:
            r1 = r34 & 4
            if (r1 == 0) goto L_0x0026
            r5 = 0
        L_0x0026:
            r1 = r34 & 8
            if (r1 == 0) goto L_0x002b
            r6 = 0
        L_0x002b:
            r1 = r34 & 16
            if (r1 == 0) goto L_0x0030
            r7 = 0
        L_0x0030:
            r1 = r34 & 32
            if (r1 == 0) goto L_0x0035
            r8 = 0
        L_0x0035:
            r1 = r34 & 64
            if (r1 == 0) goto L_0x003a
            r9 = 0
        L_0x003a:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r10 = 0
        L_0x003f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = r27
            boolean r11 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = r28
            boolean r12 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = r29
            boolean r13 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = r30
            boolean r14 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x0065
            r15 = r31
        L_0x0065:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r16 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT
        L_0x006b:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0071
            r17 = 0
        L_0x0071:
            r2 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput.<init>(int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, com.facebook.rtc.views.omnigrid.GridSelfViewLocation, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public GridLayoutConfigForLayoutInput() {
        this(0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, GridSelfViewLocation.TOP_RIGHT, (Object) null);
    }
}
