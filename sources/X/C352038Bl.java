package X;

/* renamed from: X.8Bl  reason: invalid class name and case insensitive filesystem */
public final class C352038Bl {
    public C352048Bm A00 = null;

    public final void A00(int i) {
        int i2;
        C352048Bm r0 = this.A00;
        if (r0 != null) {
            i2 = r0.A04.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            0kD.A07("TextModeBackgroundManager", "Tried to set TextColorSchemeList index to out of bounds index.", (Throwable) null);
            return;
        }
        while (true) {
            C352048Bm r1 = this.A00;
            if (r1 != null) {
                if (r1.A00 != i) {
                    r1.A00();
                } else {
                    return;
                }
            }
        }
    }
}
