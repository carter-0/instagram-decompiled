package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Iam  reason: case insensitive filesystem */
public final class C57442Iam implements G7Q {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C2363033f A01;
    public final /* synthetic */ JOG A02;

    public C57442Iam(FragmentActivity fragmentActivity, C2363033f r2, JOG jog) {
        this.A01 = r2;
        this.A02 = jog;
        this.A00 = fragmentActivity;
    }

    public final void DwL(String str) {
        if (this.A01.A00.isAdded()) {
            SQH.A00(this.A00);
            JOG jog = this.A02;
            if (jog != null) {
                jog.DGZ(false, true);
            }
        }
    }

    public final void DwN(boolean z, boolean z2) {
        Fragment fragment = this.A01.A00;
        if (fragment.isAdded()) {
            C49811F7y.A01(fragment.requireContext(), AnonymousClass05K.A01, z, z2);
            JOG jog = this.A02;
            if (jog != null) {
                jog.DGZ(false, true);
            }
        }
    }
}
