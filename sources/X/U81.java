package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class U81 extends 06N implements AnonymousClass06Q {
    public boolean A00;
    public String A01;
    public final int A02;
    public final 0hq A03;
    public final 0sP A04;
    public final Fragment A05;

    public final void A02(Bundle bundle, Fragment fragment, 0hq r5) {
        if (!fragment.equals(this.A05) && this.A01 == null && bundle == null) {
            String hexString = Integer.toHexString(System.identityHashCode(fragment));
            0qQ.A07(hexString);
            this.A01 = hexString;
            this.A04.invoke(C16502Uvy.EXIT_FORWARD);
        }
    }

    public final void A09(Fragment fragment, 0hq r4) {
        0sP r1;
        C16502Uvy uvy;
        int A0M = this.A03.A0M() - this.A02;
        if (A0M == 1) {
            r1 = this.A04;
            uvy = C16502Uvy.EXIT_FORWARD;
        } else if (A0M <= -1) {
            r1 = this.A04;
            uvy = C16502Uvy.EXIT_BACKWARD;
        } else {
            return;
        }
        r1.invoke(uvy);
    }

    public final void onBackStackChanged() {
        0sP r1;
        C16502Uvy uvy;
        int A0M = this.A03.A0M() - this.A02;
        if (A0M == 1) {
            r1 = this.A04;
            uvy = C16502Uvy.EXIT_FORWARD;
        } else if (A0M <= -1) {
            r1 = this.A04;
            uvy = C16502Uvy.EXIT_BACKWARD;
        } else if (A0M == 0) {
            r1 = this.A04;
            uvy = C16502Uvy.ENTER;
        } else {
            return;
        }
        r1.invoke(uvy);
    }

    public U81(Fragment fragment, 0hq r2, 0sP r3, int i) {
        this.A05 = fragment;
        this.A03 = r2;
        this.A02 = i;
        this.A04 = r3;
    }

    public void A04(Fragment fragment, 0hq r4) {
        String hexString = Integer.toHexString(System.identityHashCode(fragment));
        0qQ.A07(hexString);
        if (hexString.equals(this.A01)) {
            this.A04.invoke(C16502Uvy.ENTER);
            this.A01 = null;
        }
    }
}
