package com.facebook.rtc.views.omnigrid;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51966G9m;
import X.C51975G9x;
import X.C70371O3x;
import X.Pxd;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GridLayoutInputItem extends AnonymousClass0T0 {
    public final Object extras;
    public final long id;
    public final boolean isSelf;
    public final boolean isVideoOff;
    public final GridItemType itemType;
    public final int priority;
    public final GridItemSize videoSize;

    public static /* synthetic */ GridLayoutInputItem copy$default(GridLayoutInputItem gridLayoutInputItem, long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        int i3 = i;
        boolean z2 = z;
        GridItemSize gridItemSize2 = gridItemSize;
        GridItemType gridItemType2 = gridItemType;
        long j2 = j;
        if ((i2 & 1) != 0) {
            j2 = gridLayoutInputItem.id;
        }
        if ((i2 & 2) != 0) {
            gridItemType2 = gridLayoutInputItem.itemType;
        }
        if ((i2 & 4) != 0) {
            gridItemSize2 = gridLayoutInputItem.videoSize;
        }
        if ((i2 & 8) != 0) {
            z2 = gridLayoutInputItem.isVideoOff;
        }
        if ((i2 & 16) != 0) {
            i3 = gridLayoutInputItem.priority;
        }
        if ((i2 & 32) != 0) {
            obj3 = gridLayoutInputItem.extras;
        }
        AnonymousClass7TG.A1O(gridItemType2, gridItemSize2);
        return new GridLayoutInputItem(j2, gridItemType2, gridItemSize2, z2, i3, obj3);
    }

    public final long component1() {
        return this.id;
    }

    public final GridItemType component2() {
        return this.itemType;
    }

    public final GridItemSize component3() {
        return this.videoSize;
    }

    public final boolean component4() {
        return this.isVideoOff;
    }

    public final int component5() {
        return this.priority;
    }

    public final Object component6() {
        return this.extras;
    }

    public final GridLayoutInputItem copy(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        AnonymousClass7TG.A1O(gridItemType, gridItemSize);
        return new GridLayoutInputItem(j, gridItemType, gridItemSize, z, i, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutInputItem) {
                GridLayoutInputItem gridLayoutInputItem = (GridLayoutInputItem) obj;
                if (!(this.id == gridLayoutInputItem.id && this.itemType == gridLayoutInputItem.itemType && 0qQ.A0K(this.videoSize, gridLayoutInputItem.videoSize) && this.isVideoOff == gridLayoutInputItem.isVideoOff && this.priority == gridLayoutInputItem.priority && 0qQ.A0K(this.extras, gridLayoutInputItem.extras))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getExtras() {
        return this.extras;
    }

    public final long getId() {
        return this.id;
    }

    public final GridItemType getItemType() {
        return this.itemType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final GridItemSize getVideoSize() {
        return this.videoSize;
    }

    public int hashCode() {
        return ((AnonymousClass7TF.A09(this.isVideoOff, AnonymousClass7TF.A07(this.videoSize, AnonymousClass7TF.A07(this.itemType, C51975G9x.A03(this.id)))) + this.priority) * 31) + AnonymousClass7TG.A0C(this.extras);
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final boolean isVideoOff() {
        return this.isVideoOff;
    }

    public GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        AnonymousClass7TG.A1Q(gridItemType, gridItemSize);
        this.id = j;
        this.itemType = gridItemType;
        this.videoSize = gridItemSize;
        this.isVideoOff = z;
        this.priority = i;
        this.extras = obj;
        this.isSelf = AnonymousClass7TF.A1W(gridItemType, GridItemType.SELF_VIEW);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridLayoutInputItem(id=");
        A1A.append(this.id);
        A1A.append(", itemType=");
        A1A.append(this.itemType);
        A1A.append(Pxd.A00(336));
        A1A.append(this.videoSize);
        A1A.append(", isVideoOff=");
        A1A.append(this.isVideoOff);
        A1A.append(", priority=");
        A1A.append(this.priority);
        A1A.append(", extras=");
        return AnonymousClass7TG.A0n(this.extras, A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, gridItemType, (i2 & 4) != 0 ? C70371O3x.A00 : gridItemSize, C51966G9m.A1Q(i2 & 8, z), (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : obj);
    }
}
