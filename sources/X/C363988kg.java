package X;

import android.graphics.Rect;

/* renamed from: X.8kg  reason: invalid class name and case insensitive filesystem */
public final class C363988kg {
    public static final C363998kh A05 = new C363998kh(2);
    public static final C363998kh A06 = new C363998kh(5);
    public static final C363998kh A07 = new C363998kh(4);
    public static final C363998kh A08 = new C363998kh(3);
    public static final C363998kh A09 = new C363998kh(1);
    public Rect A00;
    public boolean A01 = false;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04 = true;

    public final Object A00(C363998kh r3) {
        boolean z;
        int i = r3.A00;
        if (i == 1) {
            return this.A00;
        }
        if (i == 2) {
            z = this.A01;
        } else if (i == 3) {
            z = this.A04;
        } else if (i != 4) {
            z = this.A03;
        } else {
            z = this.A02;
        }
        return Boolean.valueOf(z);
    }

    public final void A01(C363998kh r3, Object obj) {
        int i = r3.A00;
        if (i == 1) {
            this.A00 = (Rect) obj;
        } else if (i == 2) {
            this.A01 = ((Boolean) obj).booleanValue();
        } else if (i != 3) {
            Boolean bool = (Boolean) obj;
            if (i != 4) {
                this.A03 = bool.booleanValue();
            } else {
                this.A02 = bool.booleanValue();
            }
        } else {
            this.A04 = ((Boolean) obj).booleanValue();
        }
    }
}
