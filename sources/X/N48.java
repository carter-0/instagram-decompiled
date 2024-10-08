package X;

import android.graphics.Rect;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import java.util.List;

public final class N48 extends AnonymousClass0T0 {
    public Rect A00;
    public List A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final GridSelfViewLocation A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final List A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N48) {
                N48 n48 = (N48) obj;
                if (!(this.A03 == n48.A03 && this.A02 == n48.A02 && this.A04 == n48.A04 && 0qQ.A0K(this.A09, n48.A09) && this.A06 == n48.A06 && this.A0A == n48.A0A && this.A07 == n48.A07 && this.A05 == n48.A05 && 0qQ.A0K(this.A00, n48.A00) && 0qQ.A0K(this.A01, n48.A01) && 0qQ.A0K(this.A08, n48.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public N48(Rect rect, GridSelfViewLocation gridSelfViewLocation, Integer num, Integer num2, Integer num3, List list, List list2, int i, int i2, int i3, boolean z) {
        0qQ.A0B(gridSelfViewLocation, 8);
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A09 = list;
        this.A06 = num;
        this.A0A = z;
        this.A07 = num2;
        this.A05 = gridSelfViewLocation;
        this.A00 = rect;
        this.A01 = list2;
        this.A08 = num3;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A072 = AnonymousClass7TF.A07(this.A09, ((((this.A03 * 31) + this.A02) * 31) + this.A04) * 31);
        int intValue = this.A06.intValue();
        switch (intValue) {
            case 1:
                str = "ON_SCROLL";
                break;
            case 2:
                str = "ALWAYS";
                break;
            default:
                str = "NEVER";
                break;
        }
        int A092 = AnonymousClass7TF.A09(this.A0A, C51971G9r.A0F(str, intValue, A072));
        int intValue2 = this.A07.intValue();
        if (1 != intValue2) {
            str2 = "ASPECT_FIT";
        } else {
            str2 = "SQUARE";
        }
        return (((((AnonymousClass7TF.A07(this.A05, C51971G9r.A0F(str2, intValue2, A092)) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31;
    }

    public static int A00(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.Ba9(), (omniGridLayoutManager.A07.A03 - omniGridLayoutManager.A03) + omniGridLayoutManager.BaB());
    }

    public static int A01(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.BaC(), (omniGridLayoutManager.A07.A02 - omniGridLayoutManager.A00) + omniGridLayoutManager.Ba8());
    }
}
