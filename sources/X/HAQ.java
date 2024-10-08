package X;

import android.content.Context;

public final class HAQ extends C15811Uiu {
    public final boolean A00;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        HAQ haq;
        C15811Uiu uiu = (C15811Uiu) obj;
        if (uiu instanceof HAQ) {
            haq = (HAQ) uiu;
        } else {
            haq = null;
        }
        if (haq == null || this.A00 != haq.A00) {
            return false;
        }
        return true;
    }

    public HAQ(boolean z) {
        this.A00 = z;
    }

    public final int A00(Context context) {
        return 0nA.A08(context) - 286;
    }
}
