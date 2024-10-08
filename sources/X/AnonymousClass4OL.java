package X;

import android.os.Build;
import android.view.Surface;

/* renamed from: X.4OL  reason: invalid class name */
public final class AnonymousClass4OL {
    public final int A00;
    public final long A01;
    public final C291315gx A02;
    public final C18034VkE A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final Surface A00() {
        C18034VkE vkE;
        C291315gx r0 = this.A02;
        if (r0 != null) {
            return r0.A00;
        }
        if (Build.VERSION.SDK_INT < 29 || (vkE = this.A03) == null) {
            return null;
        }
        return vkE.A00();
    }

    public final C18034VkE A01() {
        return this.A03;
    }

    public final void A02() {
        C291315gx r0 = this.A02;
        if (r0 != null) {
            r0.release();
        }
        C18034VkE vkE = this.A03;
        if (vkE != null && Build.VERSION.SDK_INT >= 29) {
            vkE.A02();
        }
    }

    public AnonymousClass4OL(C291315gx r1, C18034VkE vkE, String str, String str2, String str3, String str4, int i, long j) {
        this.A01 = j;
        this.A02 = r1;
        this.A03 = vkE;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = i;
    }
}
