package X;

import java.util.Arrays;
import java.util.TimerTask;

/* renamed from: X.GkU  reason: case insensitive filesystem */
public final class C53220GkU extends UIU {
    public int A00;
    public TimerTask A01;

    public final C226742hm A05() {
        C226742hm r0 = (C226742hm) A02((this.A00 + 1) % this.A04.length);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A06() {
        int i = this.A00;
        int length = this.A04.length;
        int i2 = ((i - 1) + length) % length;
        int i3 = (i + 1) % length;
        this.A02++;
        this.A03 = 0;
        boolean[] zArr = this.A0A;
        int i4 = i3 + 1;
        Arrays.fill(zArr, 0, i4, true);
        Arrays.fill(zArr, i4, this.A0C.length, false);
        invalidateSelf();
        zArr[i2] = false;
        this.A08[i2] = 0;
        invalidateSelf();
        this.A02--;
        invalidateSelf();
        this.A00 = i3;
    }
}
