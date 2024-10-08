package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import java.util.Set;

/* renamed from: X.6b8  reason: invalid class name and case insensitive filesystem */
public final class C310486b8 implements AnonymousClass1MK {
    public final /* synthetic */ C310466b6 A00;

    public final void CyF(C226952iF r4, AnonymousClass3LX r5) {
        0qQ.A0B(r4, 0);
        C310466b6 r2 = this.A00;
        Set set = r2.A0D;
        if (set.remove(r4) && !r2.A05 && set.isEmpty()) {
            FragmentActivity fragmentActivity = r2.A07;
            if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                ((Dialog) r2.A0F.getValue()).dismiss();
                C310466b6.A02(r2);
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C310486b8(C310466b6 r1) {
        this.A00 = r1;
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        C310466b6.A00(this.A00);
    }
}
