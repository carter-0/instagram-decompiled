package X;

import android.view.View;
import java.util.List;

public abstract class V4O {
    public void A01(View view, float f) {
        if (this instanceof UWA) {
            return;
        }
        if (this instanceof UWC) {
            UWC.A00(view, (UWC) this);
            return;
        }
        UWB uwb = (UWB) this;
        List list = uwb.A05;
        int A0I = C51971G9r.A0I(list, 0);
        int A06 = A0I + AnonymousClass7TE.A06((float) (C51971G9r.A0I(list, C51966G9m.A06(list)) - A0I), f);
        C18051VkZ vkZ = uwb.A02;
        int A07 = C13988Tno.A07(vkZ.A02, A06, vkZ.A01);
        C15167UTs uTs = uwb.A04;
        int i = uwb.A00;
        uTs.A01 = i;
        uTs.A00 = A07;
        C15167UTs.A00(uTs);
        C15167UTs uTs2 = uwb.A03;
        uTs2.A01 = i;
        uTs2.A00 = A06;
        C15167UTs.A00(uTs2);
    }

    public void A02(View view, int i) {
        if (this instanceof UWA) {
            UWA uwa = (UWA) this;
            if (i != 1) {
                if (!(i == 3 || i == 4)) {
                    if (i != 5) {
                        return;
                    }
                    if (uwa.A00) {
                        uwa.A01.A0W(4);
                    }
                }
                uwa.A00 = false;
                return;
            }
            uwa.A00 = true;
        } else if (this instanceof UWC) {
            UWC.A00(view, (UWC) this);
        } else {
            ((UWB) this).A01.A00 = i;
        }
    }
}
