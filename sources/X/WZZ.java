package X;

import com.instagram.archive.fragment.ArchiveReelFragment;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class WZZ implements C71202bS {
    public final int A00;
    public final Object A01;

    public WZZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void AHF() {
        if (this.A00 != 0) {
            C14625TzX tzX = ((ReelDashboardFragment) this.A01).mListAdapter;
            tzX.A02 = null;
            tzX.A03 = null;
            0fE.A00(tzX, -1611838408);
            return;
        }
        C15469UdK udK = ((ArchiveReelFragment) this.A01).A00;
        C15533UeM ueM = udK.A07;
        if (ueM != null) {
            ueM.A01 = null;
        }
        udK.A0C();
    }
}
