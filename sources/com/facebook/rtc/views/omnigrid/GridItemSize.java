package com.facebook.rtc.views.omnigrid;

import X.002;
import X.AnonymousClass0T0;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GridItemSize extends AnonymousClass0T0 {
    public final int height;
    public final int width;

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final GridItemSize copy(int i, int i2) {
        return new GridItemSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridItemSize) {
                GridItemSize gridItemSize = (GridItemSize) obj;
                if (!(this.width == gridItemSize.width && this.height == gridItemSize.height)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return 002.A0X("GridItemSize(width=", ", height=", ')', this.width, this.height);
    }

    public static /* synthetic */ GridItemSize copy$default(GridItemSize gridItemSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gridItemSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = gridItemSize.height;
        }
        return new GridItemSize(i, i2);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public GridItemSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GridItemSize(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public GridItemSize() {
        this(-1, -1);
    }
}
