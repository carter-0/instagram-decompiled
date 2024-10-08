package X;

import android.content.res.ColorStateList;
import java.util.ArrayList;

public abstract class V4N {
    public final boolean A01() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (this instanceof UFG) {
            UFG ufg = (UFG) this;
            int i = 0;
            while (true) {
                ArrayList arrayList = ufg.A0C;
                if (i < arrayList.size()) {
                    if (((V4N) arrayList.get(i)).A01()) {
                        break;
                    }
                    i++;
                } else {
                    return false;
                }
            }
        } else if (!(this instanceof UFH)) {
            return false;
        } else {
            UFH ufh = (UFH) this;
            VUH vuh = ufh.A09;
            if (vuh.A02 != null || (colorStateList2 = vuh.A01) == null || !colorStateList2.isStateful()) {
                VUH vuh2 = ufh.A0A;
                if (vuh2.A02 != null || (colorStateList = vuh2.A01) == null || !colorStateList.isStateful()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A02(int[] iArr) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        int colorForState;
        ColorStateList colorStateList2;
        int colorForState2;
        if (this instanceof UFG) {
            UFG ufg = (UFG) this;
            int i = 0;
            boolean z3 = false;
            while (true) {
                ArrayList arrayList = ufg.A0C;
                if (i >= arrayList.size()) {
                    return z3;
                }
                z3 |= ((V4N) arrayList.get(i)).A02(iArr);
                i++;
            }
        } else if (!(this instanceof UFH)) {
            return false;
        } else {
            UFH ufh = (UFH) this;
            VUH vuh = ufh.A09;
            if (vuh.A02 != null || (colorStateList2 = vuh.A01) == null || !colorStateList2.isStateful() || (colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor())) == vuh.A00) {
                z = false;
            } else {
                z = true;
                vuh.A00 = colorForState2;
            }
            VUH vuh2 = ufh.A0A;
            if (vuh2.A02 != null || (colorStateList = vuh2.A01) == null || !colorStateList.isStateful() || (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) == vuh2.A00) {
                z2 = false;
            } else {
                z2 = true;
                vuh2.A00 = colorForState;
            }
            return z2 | z;
        }
    }
}
