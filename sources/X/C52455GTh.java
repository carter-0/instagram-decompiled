package X;

/* renamed from: X.GTh  reason: case insensitive filesystem */
public final class C52455GTh implements Runnable {
    public final /* synthetic */ GE2 A00;

    public C52455GTh(GE2 ge2) {
        this.A00 = ge2;
    }

    public final void run() {
        GE2 ge2 = this.A00;
        ge2.A07 = false;
        ge2.A02 = null;
        0xa r5 = ge2.A0F;
        if (AnonymousClass7TF.A1R((C51966G9m.A07(r5.getLong("KEY_LAST_SEEN_TIMESTAMP_MS", 0)) > 86400000 ? 1 : (C51966G9m.A07(r5.getLong("KEY_LAST_SEEN_TIMESTAMP_MS", 0)) == 86400000 ? 0 : -1))) || GD6.A01(ge2.A0J).A0A() > 1 || !ge2.A08) {
            if (ge2.A0K) {
                GMD gmd = ge2.A0B;
                C62320sa r1 = ge2.A0I;
                if (gmd.A01(C52012GBj.A01(r1)) != null) {
                    boolean A1V = AnonymousClass7TF.A1V(gmd.A01(C52012GBj.A01(r1) + 1));
                    boolean z = r5.getBoolean("KEY_HAS_SEEN_DIRECT_SWIPE_UP_NUX", false);
                    if (A1V && !z) {
                        ge2.A02 = true;
                        ge2.A07 = true;
                        GE2.A02(ge2);
                    }
                }
            }
            if (!(!r5.getBoolean("KEY_HAS_SUCCESSFULLY_SWIPED", false))) {
                boolean A1R = AnonymousClass7TF.A1R((C51966G9m.A07(r5.getLong("KEY_LAST_SWIPED_TIMESTAMP_MS", 0)) > 259200000 ? 1 : (C51966G9m.A07(r5.getLong("KEY_LAST_SWIPED_TIMESTAMP_MS", 0)) == 259200000 ? 0 : -1)));
                boolean z2 = !r5.getBoolean("KEY_SCROLLED_ON_LAST_VIEW", false);
                if (!A1R || !z2) {
                    return;
                }
            }
            GE2.A02(ge2);
        }
    }
}
