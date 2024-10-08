package X;

import android.os.SystemClock;

/* renamed from: X.6Mh  reason: invalid class name and case insensitive filesystem */
public final class C306476Mh implements C306736Nh {
    public final /* synthetic */ AnonymousClass6MF A00;

    public C306476Mh(AnonymousClass6MF r1) {
        this.A00 = r1;
    }

    public final void DDb() {
        AnonymousClass6MF r8 = this.A00;
        C255773uh r7 = r8.A0H;
        if (!C297785sK.A0g(r7)) {
            int i = r8.A0L.A04;
            if (i != 0) {
                if (((double) (SystemClock.uptimeMillis() - r8.A0K.A0O)) <= ((double) i)) {
                    return;
                }
            }
            r8.A0N.D0p(r7, r8.A0I, r8.A0O);
        }
    }
}
