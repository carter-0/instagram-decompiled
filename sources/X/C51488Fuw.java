package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fuw  reason: case insensitive filesystem */
public final class C51488Fuw implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C331127Pr A01;
    public final /* synthetic */ 0rm A02;

    public C51488Fuw(FragmentActivity fragmentActivity, C331127Pr r2, 0rm r3) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void run() {
        C331157Pu A002 = this.A01.A00();
        FragmentActivity fragmentActivity = this.A00;
        Object obj = this.A02.A00;
        if (obj == null) {
            0qQ.A0F("bottomSheetContentFragment");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A002.A02(fragmentActivity, (Fragment) obj);
        }
    }
}
