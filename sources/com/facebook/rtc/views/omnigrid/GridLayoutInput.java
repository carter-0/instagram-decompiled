package com.facebook.rtc.views.omnigrid;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51975G9x;
import java.util.List;

public final class GridLayoutInput extends AnonymousClass0T0 {
    public final GridLayoutConfigForLayoutInput config;
    public final int height;
    public final List items;
    public final int width;

    public final List component1() {
        return this.items;
    }

    public final GridLayoutConfigForLayoutInput component2() {
        return this.config;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutInput) {
                GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
                if (!0qQ.A0K(this.items, gridLayoutInput.items) || !0qQ.A0K(this.config, gridLayoutInput.config) || this.width != gridLayoutInput.width || this.height != gridLayoutInput.height) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GridLayoutInput copy$default(GridLayoutInput gridLayoutInput, List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = gridLayoutInput.items;
        }
        if ((i3 & 2) != 0) {
            gridLayoutConfigForLayoutInput = gridLayoutInput.config;
        }
        if ((i3 & 4) != 0) {
            i = gridLayoutInput.width;
        }
        if ((i3 & 8) != 0) {
            i2 = gridLayoutInput.height;
        }
        AnonymousClass7TG.A1N(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public final GridLayoutConfigForLayoutInput getConfig() {
        return this.config;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List getItems() {
        return this.items;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass7TF.A07(this.config, AnonymousClass7TE.A0K(this.items)) + this.width) * 31) + this.height;
    }

    public GridLayoutInput(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        AnonymousClass7TG.A1O(list, gridLayoutConfigForLayoutInput);
        this.items = list;
        this.config = gridLayoutConfigForLayoutInput;
        this.width = i;
        this.height = i2;
    }

    public final GridLayoutInput copy(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        AnonymousClass7TG.A1N(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridLayoutInput(items=");
        A1A.append(this.items);
        A1A.append(", config=");
        A1A.append(this.config);
        A1A.append(", width=");
        A1A.append(this.width);
        A1A.append(", height=");
        return C51975G9x.A0j(A1A, this.height);
    }
}
